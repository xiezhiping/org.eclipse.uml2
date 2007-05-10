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

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
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
  protected final String TEXT_131 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_132 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_133 = NL + "\t\t";
  protected final String TEXT_134 = " |= ";
  protected final String TEXT_135 = "_EFLAG;";
  protected final String TEXT_136 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_137 = NL + "\t@Override";
  protected final String TEXT_138 = NL + "\tprotected ";
  protected final String TEXT_139 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_140 = ";" + NL + "\t}" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_142 = NL + "\t@Override";
  protected final String TEXT_143 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_144 = ";" + NL + "\t}" + NL;
  protected final String TEXT_145 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_146 = NL + "\t";
  protected final String TEXT_147 = "[] ";
  protected final String TEXT_148 = "();" + NL;
  protected final String TEXT_149 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_150 = NL + "\tpublic ";
  protected final String TEXT_151 = "[] ";
  protected final String TEXT_152 = "()" + NL + "\t{";
  protected final String TEXT_153 = NL + "\t\t";
  protected final String TEXT_154 = " list = (";
  protected final String TEXT_155 = ")";
  protected final String TEXT_156 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_157 = "(";
  protected final String TEXT_158 = "[])";
  protected final String TEXT_159 = "_EEMPTY_ARRAY;";
  protected final String TEXT_160 = NL + "\t\tif (";
  protected final String TEXT_161 = " == null || ";
  protected final String TEXT_162 = ".isEmpty()) return ";
  protected final String TEXT_163 = "(";
  protected final String TEXT_164 = "[])";
  protected final String TEXT_165 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_166 = " list = (";
  protected final String TEXT_167 = ")";
  protected final String TEXT_168 = ";";
  protected final String TEXT_169 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_170 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_171 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_172 = NL + "\t";
  protected final String TEXT_173 = " get";
  protected final String TEXT_174 = "(int index);" + NL;
  protected final String TEXT_175 = NL + "\tpublic ";
  protected final String TEXT_176 = " get";
  protected final String TEXT_177 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_178 = "(";
  protected final String TEXT_179 = ")";
  protected final String TEXT_180 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_181 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_182 = NL + "\tint get";
  protected final String TEXT_183 = "Length();" + NL;
  protected final String TEXT_184 = NL + "\tpublic int get";
  protected final String TEXT_185 = "Length()" + NL + "\t{";
  protected final String TEXT_186 = NL + "\t\treturn ";
  protected final String TEXT_187 = "().size();";
  protected final String TEXT_188 = NL + "\t\treturn ";
  protected final String TEXT_189 = " == null ? 0 : ";
  protected final String TEXT_190 = ".size();";
  protected final String TEXT_191 = NL + "\t}" + NL;
  protected final String TEXT_192 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_193 = NL + "\tvoid set";
  protected final String TEXT_194 = "(";
  protected final String TEXT_195 = "[] new";
  protected final String TEXT_196 = ");" + NL;
  protected final String TEXT_197 = NL + "\tpublic void set";
  protected final String TEXT_198 = "(";
  protected final String TEXT_199 = "[] new";
  protected final String TEXT_200 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_201 = ")";
  protected final String TEXT_202 = "()).setData(new";
  protected final String TEXT_203 = ".length, new";
  protected final String TEXT_204 = ");" + NL + "\t}" + NL;
  protected final String TEXT_205 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_206 = NL + "\tvoid set";
  protected final String TEXT_207 = "(int index, ";
  protected final String TEXT_208 = " element);" + NL;
  protected final String TEXT_209 = NL + "\tpublic void set";
  protected final String TEXT_210 = "(int index, ";
  protected final String TEXT_211 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_212 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_213 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_214 = "</b></em>' ";
  protected final String TEXT_215 = ".";
  protected final String TEXT_216 = NL + "\t * The key is of type ";
  protected final String TEXT_217 = "list of {@link ";
  protected final String TEXT_218 = "}";
  protected final String TEXT_219 = "{@link ";
  protected final String TEXT_220 = "}";
  protected final String TEXT_221 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_222 = "list of {@link ";
  protected final String TEXT_223 = "}";
  protected final String TEXT_224 = "{@link ";
  protected final String TEXT_225 = "}";
  protected final String TEXT_226 = ",";
  protected final String TEXT_227 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_228 = "}";
  protected final String TEXT_229 = ".";
  protected final String TEXT_230 = NL + "\t * The default value is <code>";
  protected final String TEXT_231 = "</code>.";
  protected final String TEXT_232 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_233 = "}.";
  protected final String TEXT_234 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_235 = "#";
  protected final String TEXT_236 = " <em>";
  protected final String TEXT_237 = "</em>}'.";
  protected final String TEXT_238 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_239 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_240 = "</em>' ";
  protected final String TEXT_241 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_242 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_243 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_244 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_245 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_246 = "</em>' ";
  protected final String TEXT_247 = ".";
  protected final String TEXT_248 = NL + "\t * @see ";
  protected final String TEXT_249 = NL + "\t * @see #isSet";
  protected final String TEXT_250 = "()";
  protected final String TEXT_251 = NL + "\t * @see #unset";
  protected final String TEXT_252 = "()";
  protected final String TEXT_253 = NL + "\t * @see #set";
  protected final String TEXT_254 = "(";
  protected final String TEXT_255 = ")";
  protected final String TEXT_256 = NL + "\t * @see ";
  protected final String TEXT_257 = "#get";
  protected final String TEXT_258 = "()";
  protected final String TEXT_259 = NL + "\t * @see ";
  protected final String TEXT_260 = "#";
  protected final String TEXT_261 = NL + "\t * @model ";
  protected final String TEXT_262 = NL + "\t *        ";
  protected final String TEXT_263 = NL + "\t * @model";
  protected final String TEXT_264 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_265 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_266 = NL + "\t@Override";
  protected final String TEXT_267 = NL + "\t";
  protected final String TEXT_268 = " ";
  protected final String TEXT_269 = "();" + NL;
  protected final String TEXT_270 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_271 = NL + "\tpublic ";
  protected final String TEXT_272 = " ";
  protected final String TEXT_273 = "()" + NL + "\t{";
  protected final String TEXT_274 = NL + "\t\treturn ";
  protected final String TEXT_275 = "(";
  protected final String TEXT_276 = "(";
  protected final String TEXT_277 = ")eGet(";
  protected final String TEXT_278 = ", true)";
  protected final String TEXT_279 = ").";
  protected final String TEXT_280 = "()";
  protected final String TEXT_281 = ";";
  protected final String TEXT_282 = NL + "\t\t";
  protected final String TEXT_283 = " ";
  protected final String TEXT_284 = " = (";
  protected final String TEXT_285 = ")eVirtualGet(";
  protected final String TEXT_286 = ");";
  protected final String TEXT_287 = NL + "\t\tif (";
  protected final String TEXT_288 = " == null)" + NL + "\t\t{";
  protected final String TEXT_289 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_290 = ", ";
  protected final String TEXT_291 = " = new ";
  protected final String TEXT_292 = ");";
  protected final String TEXT_293 = NL + "\t\t\t";
  protected final String TEXT_294 = " = new ";
  protected final String TEXT_295 = ";";
  protected final String TEXT_296 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_297 = ";";
  protected final String TEXT_298 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_299 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_300 = ")eContainer();";
  protected final String TEXT_301 = NL + "\t\t";
  protected final String TEXT_302 = " ";
  protected final String TEXT_303 = " = (";
  protected final String TEXT_304 = ")eVirtualGet(";
  protected final String TEXT_305 = ", ";
  protected final String TEXT_306 = ");";
  protected final String TEXT_307 = NL + "\t\tif (";
  protected final String TEXT_308 = " != null && ";
  protected final String TEXT_309 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_310 = " old";
  protected final String TEXT_311 = " = (";
  protected final String TEXT_312 = ")";
  protected final String TEXT_313 = ";" + NL + "\t\t\t";
  protected final String TEXT_314 = " = ";
  protected final String TEXT_315 = "eResolveProxy(old";
  protected final String TEXT_316 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_317 = " != old";
  protected final String TEXT_318 = ")" + NL + "\t\t\t{";
  protected final String TEXT_319 = NL + "\t\t\t\t";
  protected final String TEXT_320 = " new";
  protected final String TEXT_321 = " = (";
  protected final String TEXT_322 = ")";
  protected final String TEXT_323 = ";";
  protected final String TEXT_324 = NL + "\t\t\t\t";
  protected final String TEXT_325 = " msgs = old";
  protected final String TEXT_326 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_327 = ", null, null);";
  protected final String TEXT_328 = NL + "\t\t\t\t";
  protected final String TEXT_329 = " msgs =  old";
  protected final String TEXT_330 = ".eInverseRemove(this, ";
  protected final String TEXT_331 = ", ";
  protected final String TEXT_332 = ".class, null);";
  protected final String TEXT_333 = NL + "\t\t\t\tif (new";
  protected final String TEXT_334 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_335 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_336 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_337 = ", null, msgs);";
  protected final String TEXT_338 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_339 = ".eInverseAdd(this, ";
  protected final String TEXT_340 = ", ";
  protected final String TEXT_341 = ".class, msgs);";
  protected final String TEXT_342 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_343 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_344 = ", ";
  protected final String TEXT_345 = ");";
  protected final String TEXT_346 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_347 = "(this, ";
  protected final String TEXT_348 = ".RESOLVE, ";
  protected final String TEXT_349 = ", old";
  protected final String TEXT_350 = ", ";
  protected final String TEXT_351 = "));";
  protected final String TEXT_352 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_353 = NL + "\t\treturn (";
  protected final String TEXT_354 = ")eVirtualGet(";
  protected final String TEXT_355 = ", ";
  protected final String TEXT_356 = ");";
  protected final String TEXT_357 = NL + "\t\treturn (";
  protected final String TEXT_358 = " & ";
  protected final String TEXT_359 = "_EFLAG) != 0;";
  protected final String TEXT_360 = NL + "\t\treturn ";
  protected final String TEXT_361 = ";";
  protected final String TEXT_362 = NL + "\t\t";
  protected final String TEXT_363 = " ";
  protected final String TEXT_364 = " = basicGet";
  protected final String TEXT_365 = "();" + NL + "\t\treturn ";
  protected final String TEXT_366 = " != null && ";
  protected final String TEXT_367 = ".eIsProxy() ? ";
  protected final String TEXT_368 = "eResolveProxy((";
  protected final String TEXT_369 = ")";
  protected final String TEXT_370 = ") : ";
  protected final String TEXT_371 = ";";
  protected final String TEXT_372 = NL + "\t\treturn new ";
  protected final String TEXT_373 = "((";
  protected final String TEXT_374 = ".Internal)((";
  protected final String TEXT_375 = ".Internal.Wrapper)get";
  protected final String TEXT_376 = "()).featureMap().";
  protected final String TEXT_377 = "list(";
  protected final String TEXT_378 = "));";
  protected final String TEXT_379 = NL + "\t\treturn (";
  protected final String TEXT_380 = ")get";
  protected final String TEXT_381 = "().";
  protected final String TEXT_382 = "list(";
  protected final String TEXT_383 = ");";
  protected final String TEXT_384 = NL + "\t\treturn ((";
  protected final String TEXT_385 = ".Internal.Wrapper)get";
  protected final String TEXT_386 = "()).featureMap().list(";
  protected final String TEXT_387 = ");";
  protected final String TEXT_388 = NL + "\t\treturn get";
  protected final String TEXT_389 = "().list(";
  protected final String TEXT_390 = ");";
  protected final String TEXT_391 = NL + "\t\treturn ";
  protected final String TEXT_392 = "(";
  protected final String TEXT_393 = "(";
  protected final String TEXT_394 = ")";
  protected final String TEXT_395 = "((";
  protected final String TEXT_396 = ".Internal.Wrapper)get";
  protected final String TEXT_397 = "()).featureMap().get(";
  protected final String TEXT_398 = ", true)";
  protected final String TEXT_399 = ").";
  protected final String TEXT_400 = "()";
  protected final String TEXT_401 = ";";
  protected final String TEXT_402 = NL + "\t\treturn ";
  protected final String TEXT_403 = "(";
  protected final String TEXT_404 = "(";
  protected final String TEXT_405 = ")";
  protected final String TEXT_406 = "get";
  protected final String TEXT_407 = "().get(";
  protected final String TEXT_408 = ", true)";
  protected final String TEXT_409 = ").";
  protected final String TEXT_410 = "()";
  protected final String TEXT_411 = ";";
  protected final String TEXT_412 = NL + "\t\t";
  protected final String TEXT_413 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_414 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_415 = NL + "\t\t\t";
  protected final String TEXT_416 = " result = (";
  protected final String TEXT_417 = ") cache.get(";
  protected final String TEXT_418 = "eResource(), ";
  protected final String TEXT_419 = "this, ";
  protected final String TEXT_420 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_421 = "eResource(), ";
  protected final String TEXT_422 = "this, ";
  protected final String TEXT_423 = ", result = ";
  protected final String TEXT_424 = "new ";
  protected final String TEXT_425 = "(";
  protected final String TEXT_426 = ".";
  protected final String TEXT_427 = "(this)";
  protected final String TEXT_428 = ")";
  protected final String TEXT_429 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_430 = ".";
  protected final String TEXT_431 = "()";
  protected final String TEXT_432 = ";" + NL + "\t\t}";
  protected final String TEXT_433 = NL + "\t\treturn ";
  protected final String TEXT_434 = ".";
  protected final String TEXT_435 = "(this);";
  protected final String TEXT_436 = NL + "\t\t";
  protected final String TEXT_437 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_438 = " eResource = eResource();";
  protected final String TEXT_439 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_440 = NL + "\t\t\t";
  protected final String TEXT_441 = " ";
  protected final String TEXT_442 = " = (";
  protected final String TEXT_443 = ") cache.get(eResource, this, ";
  protected final String TEXT_444 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_445 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_446 = ", ";
  protected final String TEXT_447 = " = new ";
  protected final String TEXT_448 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_449 = ";" + NL + "\t\t}";
  protected final String TEXT_450 = NL + "\t\treturn new ";
  protected final String TEXT_451 = ";";
  protected final String TEXT_452 = NL + "\t\t";
  protected final String TEXT_453 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_454 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_455 = " method = getClass().getMethod(\"";
  protected final String TEXT_456 = "\", null);";
  protected final String TEXT_457 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_458 = NL + "\t\t\t\t";
  protected final String TEXT_459 = " ";
  protected final String TEXT_460 = " = (";
  protected final String TEXT_461 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_462 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_463 = " union = ";
  protected final String TEXT_464 = "Helper(new ";
  protected final String TEXT_465 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_466 = " = new ";
  protected final String TEXT_467 = "(this, ";
  protected final String TEXT_468 = "null";
  protected final String TEXT_469 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_470 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_471 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_472 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_473 = NL + "\t\t\t";
  protected final String TEXT_474 = " ";
  protected final String TEXT_475 = " = (";
  protected final String TEXT_476 = ") cache.get(eResource(), this, ";
  protected final String TEXT_477 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_478 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_479 = " union = ";
  protected final String TEXT_480 = "Helper(new ";
  protected final String TEXT_481 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_482 = ", ";
  protected final String TEXT_483 = " = new ";
  protected final String TEXT_484 = "(this, ";
  protected final String TEXT_485 = "null";
  protected final String TEXT_486 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_487 = ";";
  protected final String TEXT_488 = NL + "\t\t}";
  protected final String TEXT_489 = NL + "\t\t";
  protected final String TEXT_490 = " union = ";
  protected final String TEXT_491 = "Helper(new ";
  protected final String TEXT_492 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_493 = "(this, ";
  protected final String TEXT_494 = "null";
  protected final String TEXT_495 = ", union.size(), union.toArray());";
  protected final String TEXT_496 = NL + "\t\tif (isSet";
  protected final String TEXT_497 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_498 = "();" + NL + "\t\t}";
  protected final String TEXT_499 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_500 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_501 = "();" + NL + "\t\t}";
  protected final String TEXT_502 = NL + "\t\t";
  protected final String TEXT_503 = " ";
  protected final String TEXT_504 = " = ";
  protected final String TEXT_505 = "();" + NL + "\t\tif (";
  protected final String TEXT_506 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_507 = ";" + NL + "\t\t}";
  protected final String TEXT_508 = NL + "\t\treturn ";
  protected final String TEXT_509 = "super.";
  protected final String TEXT_510 = "()";
  protected final String TEXT_511 = "null";
  protected final String TEXT_512 = ";";
  protected final String TEXT_513 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_514 = "' ";
  protected final String TEXT_515 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_516 = NL + "\t}" + NL;
  protected final String TEXT_517 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_518 = NL + "\t@Override";
  protected final String TEXT_519 = NL + "\tpublic ";
  protected final String TEXT_520 = " basicGet";
  protected final String TEXT_521 = "()" + NL + "\t{";
  protected final String TEXT_522 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_523 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_524 = ")eInternalContainer();";
  protected final String TEXT_525 = NL + "\t\treturn (";
  protected final String TEXT_526 = ")eVirtualGet(";
  protected final String TEXT_527 = ");";
  protected final String TEXT_528 = NL + "\t\treturn ";
  protected final String TEXT_529 = ";";
  protected final String TEXT_530 = NL + "\t\treturn (";
  protected final String TEXT_531 = ")((";
  protected final String TEXT_532 = ".Internal.Wrapper)get";
  protected final String TEXT_533 = "()).featureMap().get(";
  protected final String TEXT_534 = ", false);";
  protected final String TEXT_535 = NL + "\t\treturn (";
  protected final String TEXT_536 = ")get";
  protected final String TEXT_537 = "().get(";
  protected final String TEXT_538 = ", false);";
  protected final String TEXT_539 = NL + "\t\treturn ";
  protected final String TEXT_540 = ".";
  protected final String TEXT_541 = "(this);";
  protected final String TEXT_542 = NL + "\t\tif (isSet";
  protected final String TEXT_543 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_544 = "basicGet";
  protected final String TEXT_545 = "();" + NL + "\t\t}";
  protected final String TEXT_546 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_547 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_548 = "basicGet";
  protected final String TEXT_549 = "();" + NL + "\t\t}";
  protected final String TEXT_550 = NL + "\t\t";
  protected final String TEXT_551 = " ";
  protected final String TEXT_552 = " = ";
  protected final String TEXT_553 = "basicGet";
  protected final String TEXT_554 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_555 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_556 = ";" + NL + "\t\t}";
  protected final String TEXT_557 = NL + "\t\treturn ";
  protected final String TEXT_558 = "super.basicGet";
  protected final String TEXT_559 = "()";
  protected final String TEXT_560 = "null";
  protected final String TEXT_561 = ";";
  protected final String TEXT_562 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_563 = "' ";
  protected final String TEXT_564 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_565 = NL + "\t}" + NL;
  protected final String TEXT_566 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_567 = NL + "\t@Override";
  protected final String TEXT_568 = NL + "\tpublic ";
  protected final String TEXT_569 = " basicSet";
  protected final String TEXT_570 = "(";
  protected final String TEXT_571 = " new";
  protected final String TEXT_572 = ", ";
  protected final String TEXT_573 = " msgs)" + NL + "\t{";
  protected final String TEXT_574 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_575 = ")new";
  protected final String TEXT_576 = ", ";
  protected final String TEXT_577 = ", msgs);";
  protected final String TEXT_578 = NL + "\t\t";
  protected final String TEXT_579 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_580 = NL + "\t\t\t";
  protected final String TEXT_581 = " ";
  protected final String TEXT_582 = " = ";
  protected final String TEXT_583 = "();";
  protected final String TEXT_584 = NL + "\t\t\tObject ";
  protected final String TEXT_585 = " = eVirtualGet(";
  protected final String TEXT_586 = ");";
  protected final String TEXT_587 = NL + "\t\t\tif (";
  protected final String TEXT_588 = " != null && ";
  protected final String TEXT_589 = " != new";
  protected final String TEXT_590 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_591 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_592 = NL + "\t\t\tif (new";
  protected final String TEXT_593 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_594 = NL + "\t\t\t\t";
  protected final String TEXT_595 = " ";
  protected final String TEXT_596 = " = ";
  protected final String TEXT_597 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_598 = ".contains(new";
  protected final String TEXT_599 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_600 = ".add(new";
  protected final String TEXT_601 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_602 = NL + "\t\t\t\t";
  protected final String TEXT_603 = " ";
  protected final String TEXT_604 = " = ";
  protected final String TEXT_605 = "();";
  protected final String TEXT_606 = NL + "\t\t\t\tObject ";
  protected final String TEXT_607 = " = eVirtualGet(";
  protected final String TEXT_608 = ");";
  protected final String TEXT_609 = NL + "\t\t\t\tif (new";
  protected final String TEXT_610 = " != ";
  protected final String TEXT_611 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_612 = "(new";
  protected final String TEXT_613 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_614 = NL + "\t\t\t}";
  protected final String TEXT_615 = NL + "\t\t}";
  protected final String TEXT_616 = NL + "\t\treturn msgs;";
  protected final String TEXT_617 = NL + "\t\tObject old";
  protected final String TEXT_618 = " = eVirtualSet(";
  protected final String TEXT_619 = ", new";
  protected final String TEXT_620 = ");";
  protected final String TEXT_621 = NL + "\t\t";
  protected final String TEXT_622 = " old";
  protected final String TEXT_623 = " = ";
  protected final String TEXT_624 = ";" + NL + "\t\t";
  protected final String TEXT_625 = " = new";
  protected final String TEXT_626 = ";";
  protected final String TEXT_627 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_628 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_629 = NL + "\t\tboolean old";
  protected final String TEXT_630 = "ESet = (";
  protected final String TEXT_631 = " & ";
  protected final String TEXT_632 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_633 = " |= ";
  protected final String TEXT_634 = "_ESETFLAG;";
  protected final String TEXT_635 = NL + "\t\tboolean old";
  protected final String TEXT_636 = "ESet = ";
  protected final String TEXT_637 = "ESet;" + NL + "\t\t";
  protected final String TEXT_638 = "ESet = true;";
  protected final String TEXT_639 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_640 = NL + "\t\t\t";
  protected final String TEXT_641 = " notification = new ";
  protected final String TEXT_642 = "(this, ";
  protected final String TEXT_643 = ".SET, ";
  protected final String TEXT_644 = ", ";
  protected final String TEXT_645 = "isSetChange ? null : old";
  protected final String TEXT_646 = "old";
  protected final String TEXT_647 = ", new";
  protected final String TEXT_648 = ", ";
  protected final String TEXT_649 = "isSetChange";
  protected final String TEXT_650 = "!old";
  protected final String TEXT_651 = "ESet";
  protected final String TEXT_652 = ");";
  protected final String TEXT_653 = NL + "\t\t\t";
  protected final String TEXT_654 = " notification = new ";
  protected final String TEXT_655 = "(this, ";
  protected final String TEXT_656 = ".SET, ";
  protected final String TEXT_657 = ", ";
  protected final String TEXT_658 = "old";
  protected final String TEXT_659 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_660 = "old";
  protected final String TEXT_661 = ", new";
  protected final String TEXT_662 = ");";
  protected final String TEXT_663 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_664 = NL + "\t\t";
  protected final String TEXT_665 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_666 = NL + "\t\t\t";
  protected final String TEXT_667 = " ";
  protected final String TEXT_668 = " = ";
  protected final String TEXT_669 = "();";
  protected final String TEXT_670 = NL + "\t\t\tObject ";
  protected final String TEXT_671 = " = eVirtualGet(";
  protected final String TEXT_672 = ");";
  protected final String TEXT_673 = NL + "\t\t\tif (";
  protected final String TEXT_674 = " != null && ";
  protected final String TEXT_675 = " != new";
  protected final String TEXT_676 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_677 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_678 = NL + "\t\t\tif (new";
  protected final String TEXT_679 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_680 = NL + "\t\t\t\t";
  protected final String TEXT_681 = " ";
  protected final String TEXT_682 = " = ";
  protected final String TEXT_683 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_684 = ".contains(new";
  protected final String TEXT_685 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_686 = ".add(new";
  protected final String TEXT_687 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_688 = NL + "\t\t\t\t";
  protected final String TEXT_689 = " ";
  protected final String TEXT_690 = " = ";
  protected final String TEXT_691 = "();";
  protected final String TEXT_692 = NL + "\t\t\t\tObject ";
  protected final String TEXT_693 = " = eVirtualGet(";
  protected final String TEXT_694 = ");";
  protected final String TEXT_695 = NL + "\t\t\t\tif (new";
  protected final String TEXT_696 = " != ";
  protected final String TEXT_697 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_698 = "(new";
  protected final String TEXT_699 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_700 = NL + "\t\t\t}";
  protected final String TEXT_701 = NL + "\t\t}";
  protected final String TEXT_702 = NL + "\t\treturn msgs;";
  protected final String TEXT_703 = NL + "\t\treturn ((";
  protected final String TEXT_704 = ".Internal)((";
  protected final String TEXT_705 = ".Internal.Wrapper)get";
  protected final String TEXT_706 = "()).featureMap()).basicAdd(";
  protected final String TEXT_707 = ", new";
  protected final String TEXT_708 = ", msgs);";
  protected final String TEXT_709 = NL + "\t\treturn ((";
  protected final String TEXT_710 = ".Internal)get";
  protected final String TEXT_711 = "()).basicAdd(";
  protected final String TEXT_712 = ", new";
  protected final String TEXT_713 = ", msgs);";
  protected final String TEXT_714 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_715 = "' ";
  protected final String TEXT_716 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_717 = NL + "\t}" + NL;
  protected final String TEXT_718 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_719 = "#";
  protected final String TEXT_720 = " <em>";
  protected final String TEXT_721 = "</em>}' ";
  protected final String TEXT_722 = ".";
  protected final String TEXT_723 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_724 = "</em>' ";
  protected final String TEXT_725 = ".";
  protected final String TEXT_726 = NL + "\t * @see ";
  protected final String TEXT_727 = NL + "\t * @see #isSet";
  protected final String TEXT_728 = "()";
  protected final String TEXT_729 = NL + "\t * @see #unset";
  protected final String TEXT_730 = "()";
  protected final String TEXT_731 = NL + "\t * @see #";
  protected final String TEXT_732 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_733 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_734 = NL + "\t@Override";
  protected final String TEXT_735 = NL + "\tvoid set";
  protected final String TEXT_736 = "(";
  protected final String TEXT_737 = " value);" + NL;
  protected final String TEXT_738 = NL + "\tpublic void set";
  protected final String TEXT_739 = "(";
  protected final String TEXT_740 = " new";
  protected final String TEXT_741 = ")" + NL + "\t{";
  protected final String TEXT_742 = NL + "\t\tnew";
  protected final String TEXT_743 = " = new";
  protected final String TEXT_744 = " == null ? ";
  protected final String TEXT_745 = " : new";
  protected final String TEXT_746 = ";";
  protected final String TEXT_747 = NL + "\t\teSet(";
  protected final String TEXT_748 = ", ";
  protected final String TEXT_749 = "new ";
  protected final String TEXT_750 = "(";
  protected final String TEXT_751 = "new";
  protected final String TEXT_752 = ")";
  protected final String TEXT_753 = ");";
  protected final String TEXT_754 = NL + "\t\tif (new";
  protected final String TEXT_755 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_756 = " && new";
  protected final String TEXT_757 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_758 = ".isAncestor(this, ";
  protected final String TEXT_759 = "new";
  protected final String TEXT_760 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_761 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_762 = NL + "\t\t\t";
  protected final String TEXT_763 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_764 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_765 = ")new";
  protected final String TEXT_766 = ").eInverseAdd(this, ";
  protected final String TEXT_767 = ", ";
  protected final String TEXT_768 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_769 = "(";
  protected final String TEXT_770 = "new";
  protected final String TEXT_771 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_772 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_773 = "(this, ";
  protected final String TEXT_774 = ".SET, ";
  protected final String TEXT_775 = ", new";
  protected final String TEXT_776 = ", new";
  protected final String TEXT_777 = "));";
  protected final String TEXT_778 = NL + "\t\t";
  protected final String TEXT_779 = " ";
  protected final String TEXT_780 = " = (";
  protected final String TEXT_781 = ")eVirtualGet(";
  protected final String TEXT_782 = ");";
  protected final String TEXT_783 = NL + "\t\tif (new";
  protected final String TEXT_784 = " != ";
  protected final String TEXT_785 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_786 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_787 = " != null)";
  protected final String TEXT_788 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_789 = ")";
  protected final String TEXT_790 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_791 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_792 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_793 = ")new";
  protected final String TEXT_794 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_795 = ", null, msgs);";
  protected final String TEXT_796 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_797 = ")";
  protected final String TEXT_798 = ").eInverseRemove(this, ";
  protected final String TEXT_799 = ", ";
  protected final String TEXT_800 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_801 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_802 = ")new";
  protected final String TEXT_803 = ").eInverseAdd(this, ";
  protected final String TEXT_804 = ", ";
  protected final String TEXT_805 = ".class, msgs);";
  protected final String TEXT_806 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_807 = "(";
  protected final String TEXT_808 = "new";
  protected final String TEXT_809 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_810 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_811 = NL + "\t\t\tboolean old";
  protected final String TEXT_812 = "ESet = eVirtualIsSet(";
  protected final String TEXT_813 = ");";
  protected final String TEXT_814 = NL + "\t\t\tboolean old";
  protected final String TEXT_815 = "ESet = (";
  protected final String TEXT_816 = " & ";
  protected final String TEXT_817 = "_ESETFLAG) != 0;";
  protected final String TEXT_818 = NL + "\t\t\t";
  protected final String TEXT_819 = " |= ";
  protected final String TEXT_820 = "_ESETFLAG;";
  protected final String TEXT_821 = NL + "\t\t\tboolean old";
  protected final String TEXT_822 = "ESet = ";
  protected final String TEXT_823 = "ESet;";
  protected final String TEXT_824 = NL + "\t\t\t";
  protected final String TEXT_825 = "ESet = true;";
  protected final String TEXT_826 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_827 = "(this, ";
  protected final String TEXT_828 = ".SET, ";
  protected final String TEXT_829 = ", new";
  protected final String TEXT_830 = ", new";
  protected final String TEXT_831 = ", !old";
  protected final String TEXT_832 = "ESet));";
  protected final String TEXT_833 = NL + "\t\t}";
  protected final String TEXT_834 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_835 = "(this, ";
  protected final String TEXT_836 = ".SET, ";
  protected final String TEXT_837 = ", new";
  protected final String TEXT_838 = ", new";
  protected final String TEXT_839 = "));";
  protected final String TEXT_840 = NL + "\t\t";
  protected final String TEXT_841 = " old";
  protected final String TEXT_842 = " = (";
  protected final String TEXT_843 = " & ";
  protected final String TEXT_844 = "_EFLAG) != 0;";
  protected final String TEXT_845 = NL + "\t\tif (new";
  protected final String TEXT_846 = ") ";
  protected final String TEXT_847 = " |= ";
  protected final String TEXT_848 = "_EFLAG; else ";
  protected final String TEXT_849 = " &= ~";
  protected final String TEXT_850 = "_EFLAG;";
  protected final String TEXT_851 = NL + "\t\t";
  protected final String TEXT_852 = " old";
  protected final String TEXT_853 = " = ";
  protected final String TEXT_854 = ";";
  protected final String TEXT_855 = NL + "\t\t";
  protected final String TEXT_856 = " ";
  protected final String TEXT_857 = " = new";
  protected final String TEXT_858 = " == null ? ";
  protected final String TEXT_859 = " : new";
  protected final String TEXT_860 = ";";
  protected final String TEXT_861 = NL + "\t\t";
  protected final String TEXT_862 = " = new";
  protected final String TEXT_863 = " == null ? ";
  protected final String TEXT_864 = " : new";
  protected final String TEXT_865 = ";";
  protected final String TEXT_866 = NL + "\t\t";
  protected final String TEXT_867 = " ";
  protected final String TEXT_868 = " = ";
  protected final String TEXT_869 = "new";
  protected final String TEXT_870 = ";";
  protected final String TEXT_871 = NL + "\t\t";
  protected final String TEXT_872 = " = ";
  protected final String TEXT_873 = "new";
  protected final String TEXT_874 = ";";
  protected final String TEXT_875 = NL + "\t\tObject old";
  protected final String TEXT_876 = " = eVirtualSet(";
  protected final String TEXT_877 = ", ";
  protected final String TEXT_878 = ");";
  protected final String TEXT_879 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_880 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_881 = NL + "\t\tboolean old";
  protected final String TEXT_882 = "ESet = (";
  protected final String TEXT_883 = " & ";
  protected final String TEXT_884 = "_ESETFLAG) != 0;";
  protected final String TEXT_885 = NL + "\t\t";
  protected final String TEXT_886 = " |= ";
  protected final String TEXT_887 = "_ESETFLAG;";
  protected final String TEXT_888 = NL + "\t\tboolean old";
  protected final String TEXT_889 = "ESet = ";
  protected final String TEXT_890 = "ESet;";
  protected final String TEXT_891 = NL + "\t\t";
  protected final String TEXT_892 = "ESet = true;";
  protected final String TEXT_893 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_894 = "(this, ";
  protected final String TEXT_895 = ".SET, ";
  protected final String TEXT_896 = ", ";
  protected final String TEXT_897 = "isSetChange ? ";
  protected final String TEXT_898 = " : old";
  protected final String TEXT_899 = "old";
  protected final String TEXT_900 = ", ";
  protected final String TEXT_901 = "new";
  protected final String TEXT_902 = ", ";
  protected final String TEXT_903 = "isSetChange";
  protected final String TEXT_904 = "!old";
  protected final String TEXT_905 = "ESet";
  protected final String TEXT_906 = "));";
  protected final String TEXT_907 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_908 = "(this, ";
  protected final String TEXT_909 = ".SET, ";
  protected final String TEXT_910 = ", ";
  protected final String TEXT_911 = "old";
  protected final String TEXT_912 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_913 = " : old";
  protected final String TEXT_914 = "old";
  protected final String TEXT_915 = ", ";
  protected final String TEXT_916 = "new";
  protected final String TEXT_917 = "));";
  protected final String TEXT_918 = NL + "\t\t";
  protected final String TEXT_919 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_920 = NL + "\t\t\t";
  protected final String TEXT_921 = " ";
  protected final String TEXT_922 = " = ";
  protected final String TEXT_923 = "();";
  protected final String TEXT_924 = NL + "\t\t\tObject ";
  protected final String TEXT_925 = " = eVirtualGet(";
  protected final String TEXT_926 = ");";
  protected final String TEXT_927 = NL + "\t\t\tif (";
  protected final String TEXT_928 = " != null && ";
  protected final String TEXT_929 = " != new";
  protected final String TEXT_930 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_931 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_932 = NL + "\t\t\tif (new";
  protected final String TEXT_933 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_934 = NL + "\t\t\t\t";
  protected final String TEXT_935 = " ";
  protected final String TEXT_936 = " = ";
  protected final String TEXT_937 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_938 = ".contains(new";
  protected final String TEXT_939 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_940 = ".add(new";
  protected final String TEXT_941 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_942 = NL + "\t\t\t\t";
  protected final String TEXT_943 = " ";
  protected final String TEXT_944 = " = ";
  protected final String TEXT_945 = "();";
  protected final String TEXT_946 = NL + "\t\t\t\tObject ";
  protected final String TEXT_947 = " = eVirtualGet(";
  protected final String TEXT_948 = ");";
  protected final String TEXT_949 = NL + "\t\t\t\tif (new";
  protected final String TEXT_950 = " != ";
  protected final String TEXT_951 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_952 = "(new";
  protected final String TEXT_953 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_954 = NL + "\t\t\t}";
  protected final String TEXT_955 = NL + "\t\t}";
  protected final String TEXT_956 = NL + "\t\t((";
  protected final String TEXT_957 = ".Internal)((";
  protected final String TEXT_958 = ".Internal.Wrapper)get";
  protected final String TEXT_959 = "()).featureMap()).set(";
  protected final String TEXT_960 = ", ";
  protected final String TEXT_961 = "new ";
  protected final String TEXT_962 = "(";
  protected final String TEXT_963 = "new";
  protected final String TEXT_964 = ")";
  protected final String TEXT_965 = ");";
  protected final String TEXT_966 = NL + "\t\t((";
  protected final String TEXT_967 = ".Internal)get";
  protected final String TEXT_968 = "()).set(";
  protected final String TEXT_969 = ", ";
  protected final String TEXT_970 = "new ";
  protected final String TEXT_971 = "(";
  protected final String TEXT_972 = "new";
  protected final String TEXT_973 = ")";
  protected final String TEXT_974 = ");";
  protected final String TEXT_975 = NL + "\t\t";
  protected final String TEXT_976 = ".";
  protected final String TEXT_977 = "(this, ";
  protected final String TEXT_978 = ");";
  protected final String TEXT_979 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_980 = "' ";
  protected final String TEXT_981 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_982 = NL + "\t}" + NL;
  protected final String TEXT_983 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_984 = NL + "\t@Override";
  protected final String TEXT_985 = NL + "\tpublic ";
  protected final String TEXT_986 = " basicUnset";
  protected final String TEXT_987 = "(";
  protected final String TEXT_988 = " msgs)" + NL + "\t{";
  protected final String TEXT_989 = NL + "\t\tObject old";
  protected final String TEXT_990 = " = eVirtualUnset(";
  protected final String TEXT_991 = ");";
  protected final String TEXT_992 = NL + "\t\t";
  protected final String TEXT_993 = " old";
  protected final String TEXT_994 = " = ";
  protected final String TEXT_995 = ";" + NL + "\t\t";
  protected final String TEXT_996 = " = null;";
  protected final String TEXT_997 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_998 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_999 = NL + "\t\tboolean old";
  protected final String TEXT_1000 = "ESet = (";
  protected final String TEXT_1001 = " & ";
  protected final String TEXT_1002 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_1003 = " &= ~";
  protected final String TEXT_1004 = "_ESETFLAG;";
  protected final String TEXT_1005 = NL + "\t\tboolean old";
  protected final String TEXT_1006 = "ESet = ";
  protected final String TEXT_1007 = "ESet;" + NL + "\t\t";
  protected final String TEXT_1008 = "ESet = false;";
  protected final String TEXT_1009 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1010 = " notification = new ";
  protected final String TEXT_1011 = "(this, ";
  protected final String TEXT_1012 = ".UNSET, ";
  protected final String TEXT_1013 = ", ";
  protected final String TEXT_1014 = "isSetChange ? old";
  protected final String TEXT_1015 = " : null";
  protected final String TEXT_1016 = "old";
  protected final String TEXT_1017 = ", null, ";
  protected final String TEXT_1018 = "isSetChange";
  protected final String TEXT_1019 = "old";
  protected final String TEXT_1020 = "ESet";
  protected final String TEXT_1021 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1022 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1023 = "' ";
  protected final String TEXT_1024 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1025 = NL + "\t}" + NL;
  protected final String TEXT_1026 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1027 = "#";
  protected final String TEXT_1028 = " <em>";
  protected final String TEXT_1029 = "</em>}' ";
  protected final String TEXT_1030 = ".";
  protected final String TEXT_1031 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1032 = NL + "\t * @see #isSet";
  protected final String TEXT_1033 = "()";
  protected final String TEXT_1034 = NL + "\t * @see #";
  protected final String TEXT_1035 = "()";
  protected final String TEXT_1036 = NL + "\t * @see #set";
  protected final String TEXT_1037 = "(";
  protected final String TEXT_1038 = ")";
  protected final String TEXT_1039 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1040 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1041 = NL + "\t@Override";
  protected final String TEXT_1042 = NL + "\tvoid unset";
  protected final String TEXT_1043 = "();" + NL;
  protected final String TEXT_1044 = NL + "\tpublic void unset";
  protected final String TEXT_1045 = "()" + NL + "\t{";
  protected final String TEXT_1046 = NL + "\t\teUnset(";
  protected final String TEXT_1047 = ");";
  protected final String TEXT_1048 = NL + "\t\t";
  protected final String TEXT_1049 = " ";
  protected final String TEXT_1050 = " = (";
  protected final String TEXT_1051 = ")eVirtualGet(";
  protected final String TEXT_1052 = ");";
  protected final String TEXT_1053 = NL + "\t\tif (";
  protected final String TEXT_1054 = " != null) ((";
  protected final String TEXT_1055 = ".Unsettable";
  protected final String TEXT_1056 = ")";
  protected final String TEXT_1057 = ").unset();";
  protected final String TEXT_1058 = NL + "\t\t";
  protected final String TEXT_1059 = " ";
  protected final String TEXT_1060 = " = (";
  protected final String TEXT_1061 = ")eVirtualGet(";
  protected final String TEXT_1062 = ");";
  protected final String TEXT_1063 = NL + "\t\tif (";
  protected final String TEXT_1064 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1065 = " msgs = null;";
  protected final String TEXT_1066 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1067 = ")";
  protected final String TEXT_1068 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1069 = ", null, msgs);";
  protected final String TEXT_1070 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1071 = ")";
  protected final String TEXT_1072 = ").eInverseRemove(this, ";
  protected final String TEXT_1073 = ", ";
  protected final String TEXT_1074 = ".class, msgs);";
  protected final String TEXT_1075 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1076 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1077 = NL + "\t\t\tboolean old";
  protected final String TEXT_1078 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1079 = ");";
  protected final String TEXT_1080 = NL + "\t\t\tboolean old";
  protected final String TEXT_1081 = "ESet = (";
  protected final String TEXT_1082 = " & ";
  protected final String TEXT_1083 = "_ESETFLAG) != 0;";
  protected final String TEXT_1084 = NL + "\t\t\t";
  protected final String TEXT_1085 = " &= ~";
  protected final String TEXT_1086 = "_ESETFLAG;";
  protected final String TEXT_1087 = NL + "\t\t\tboolean old";
  protected final String TEXT_1088 = "ESet = ";
  protected final String TEXT_1089 = "ESet;";
  protected final String TEXT_1090 = NL + "\t\t\t";
  protected final String TEXT_1091 = "ESet = false;";
  protected final String TEXT_1092 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1093 = "(this, ";
  protected final String TEXT_1094 = ".UNSET, ";
  protected final String TEXT_1095 = ", null, null, old";
  protected final String TEXT_1096 = "ESet));";
  protected final String TEXT_1097 = NL + "\t\t}";
  protected final String TEXT_1098 = NL + "\t\t";
  protected final String TEXT_1099 = " old";
  protected final String TEXT_1100 = " = (";
  protected final String TEXT_1101 = " & ";
  protected final String TEXT_1102 = "_EFLAG) != 0;";
  protected final String TEXT_1103 = NL + "\t\tObject old";
  protected final String TEXT_1104 = " = eVirtualUnset(";
  protected final String TEXT_1105 = ");";
  protected final String TEXT_1106 = NL + "\t\t";
  protected final String TEXT_1107 = " old";
  protected final String TEXT_1108 = " = ";
  protected final String TEXT_1109 = ";";
  protected final String TEXT_1110 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1111 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1112 = NL + "\t\tboolean old";
  protected final String TEXT_1113 = "ESet = (";
  protected final String TEXT_1114 = " & ";
  protected final String TEXT_1115 = "_ESETFLAG) != 0;";
  protected final String TEXT_1116 = NL + "\t\tboolean old";
  protected final String TEXT_1117 = "ESet = ";
  protected final String TEXT_1118 = "ESet;";
  protected final String TEXT_1119 = NL + "\t\t";
  protected final String TEXT_1120 = " = null;";
  protected final String TEXT_1121 = NL + "\t\t";
  protected final String TEXT_1122 = " &= ~";
  protected final String TEXT_1123 = "_ESETFLAG;";
  protected final String TEXT_1124 = NL + "\t\t";
  protected final String TEXT_1125 = "ESet = false;";
  protected final String TEXT_1126 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1127 = "(this, ";
  protected final String TEXT_1128 = ".UNSET, ";
  protected final String TEXT_1129 = ", ";
  protected final String TEXT_1130 = "isSetChange ? old";
  protected final String TEXT_1131 = " : null";
  protected final String TEXT_1132 = "old";
  protected final String TEXT_1133 = ", null, ";
  protected final String TEXT_1134 = "isSetChange";
  protected final String TEXT_1135 = "old";
  protected final String TEXT_1136 = "ESet";
  protected final String TEXT_1137 = "));";
  protected final String TEXT_1138 = NL + "\t\tif (";
  protected final String TEXT_1139 = ") ";
  protected final String TEXT_1140 = " |= ";
  protected final String TEXT_1141 = "_EFLAG; else ";
  protected final String TEXT_1142 = " &= ~";
  protected final String TEXT_1143 = "_EFLAG;";
  protected final String TEXT_1144 = NL + "\t\t";
  protected final String TEXT_1145 = " = ";
  protected final String TEXT_1146 = ";";
  protected final String TEXT_1147 = NL + "\t\t";
  protected final String TEXT_1148 = " &= ~";
  protected final String TEXT_1149 = "_ESETFLAG;";
  protected final String TEXT_1150 = NL + "\t\t";
  protected final String TEXT_1151 = "ESet = false;";
  protected final String TEXT_1152 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1153 = "(this, ";
  protected final String TEXT_1154 = ".UNSET, ";
  protected final String TEXT_1155 = ", ";
  protected final String TEXT_1156 = "isSetChange ? old";
  protected final String TEXT_1157 = " : ";
  protected final String TEXT_1158 = "old";
  protected final String TEXT_1159 = ", ";
  protected final String TEXT_1160 = ", ";
  protected final String TEXT_1161 = "isSetChange";
  protected final String TEXT_1162 = "old";
  protected final String TEXT_1163 = "ESet";
  protected final String TEXT_1164 = "));";
  protected final String TEXT_1165 = NL + "\t\t((";
  protected final String TEXT_1166 = ".Internal)((";
  protected final String TEXT_1167 = ".Internal.Wrapper)get";
  protected final String TEXT_1168 = "()).featureMap()).clear(";
  protected final String TEXT_1169 = ");";
  protected final String TEXT_1170 = NL + "\t\t((";
  protected final String TEXT_1171 = ".Internal)get";
  protected final String TEXT_1172 = "()).clear(";
  protected final String TEXT_1173 = ");";
  protected final String TEXT_1174 = NL + "\t\t";
  protected final String TEXT_1175 = ".";
  protected final String TEXT_1176 = "(this);";
  protected final String TEXT_1177 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1178 = "' ";
  protected final String TEXT_1179 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1180 = NL + "\t}" + NL;
  protected final String TEXT_1181 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1182 = "#";
  protected final String TEXT_1183 = " <em>";
  protected final String TEXT_1184 = "</em>}' ";
  protected final String TEXT_1185 = " is set.";
  protected final String TEXT_1186 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1187 = "</em>' ";
  protected final String TEXT_1188 = " is set.";
  protected final String TEXT_1189 = NL + "\t * @see #unset";
  protected final String TEXT_1190 = "()";
  protected final String TEXT_1191 = NL + "\t * @see #";
  protected final String TEXT_1192 = "()";
  protected final String TEXT_1193 = NL + "\t * @see #set";
  protected final String TEXT_1194 = "(";
  protected final String TEXT_1195 = ")";
  protected final String TEXT_1196 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1197 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1198 = NL + "\t@Override";
  protected final String TEXT_1199 = NL + "\tboolean isSet";
  protected final String TEXT_1200 = "();" + NL;
  protected final String TEXT_1201 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1202 = "()" + NL + "\t{";
  protected final String TEXT_1203 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1204 = ");";
  protected final String TEXT_1205 = NL + "\t\t";
  protected final String TEXT_1206 = " ";
  protected final String TEXT_1207 = " = (";
  protected final String TEXT_1208 = ")eVirtualGet(";
  protected final String TEXT_1209 = ");";
  protected final String TEXT_1210 = NL + "\t\treturn ";
  protected final String TEXT_1211 = " != null && ((";
  protected final String TEXT_1212 = ".Unsettable";
  protected final String TEXT_1213 = ")";
  protected final String TEXT_1214 = ").isSet();";
  protected final String TEXT_1215 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1216 = ");";
  protected final String TEXT_1217 = NL + "\t\treturn (";
  protected final String TEXT_1218 = " & ";
  protected final String TEXT_1219 = "_ESETFLAG) != 0;";
  protected final String TEXT_1220 = NL + "\t\treturn ";
  protected final String TEXT_1221 = "ESet;";
  protected final String TEXT_1222 = NL + "\t\treturn !((";
  protected final String TEXT_1223 = ".Internal)((";
  protected final String TEXT_1224 = ".Internal.Wrapper)get";
  protected final String TEXT_1225 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1226 = ");";
  protected final String TEXT_1227 = NL + "\t\treturn !((";
  protected final String TEXT_1228 = ".Internal)get";
  protected final String TEXT_1229 = "()).isEmpty(";
  protected final String TEXT_1230 = ");";
  protected final String TEXT_1231 = NL + "\t\treturn ";
  protected final String TEXT_1232 = ".";
  protected final String TEXT_1233 = "(this);";
  protected final String TEXT_1234 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1235 = "' ";
  protected final String TEXT_1236 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1237 = NL + "\t}" + NL;
  protected final String TEXT_1238 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1239 = "() <em>";
  protected final String TEXT_1240 = "</em>}' ";
  protected final String TEXT_1241 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1242 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1243 = "_ESUBSETS = ";
  protected final String TEXT_1244 = ";" + NL;
  protected final String TEXT_1245 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1246 = "() <em>";
  protected final String TEXT_1247 = "</em>}' ";
  protected final String TEXT_1248 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1249 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1250 = "_ESUPERSETS = ";
  protected final String TEXT_1251 = ";" + NL;
  protected final String TEXT_1252 = NL + "\t/**";
  protected final String TEXT_1253 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1254 = "}, with the specified ";
  protected final String TEXT_1255 = ", and appends it to the '<em><b>";
  protected final String TEXT_1256 = "</b></em>' ";
  protected final String TEXT_1257 = ".";
  protected final String TEXT_1258 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1259 = "}, with the specified ";
  protected final String TEXT_1260 = ", and sets the '<em><b>";
  protected final String TEXT_1261 = "</b></em>' ";
  protected final String TEXT_1262 = ".";
  protected final String TEXT_1263 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1264 = "} and appends it to the '<em><b>";
  protected final String TEXT_1265 = "</b></em>' ";
  protected final String TEXT_1266 = ".";
  protected final String TEXT_1267 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1268 = "} and sets the '<em><b>";
  protected final String TEXT_1269 = "</b></em>' ";
  protected final String TEXT_1270 = ".";
  protected final String TEXT_1271 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1272 = NL + "\t * @param ";
  protected final String TEXT_1273 = " The ";
  protected final String TEXT_1274 = " for the new {@link ";
  protected final String TEXT_1275 = "}, or <code>null</code>.";
  protected final String TEXT_1276 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1277 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1278 = "}." + NL + "\t * @see #";
  protected final String TEXT_1279 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1280 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1281 = NL + "\t";
  protected final String TEXT_1282 = " create";
  protected final String TEXT_1283 = "(";
  protected final String TEXT_1284 = ", ";
  protected final String TEXT_1285 = " eClass);" + NL;
  protected final String TEXT_1286 = NL + "\t@Override";
  protected final String TEXT_1287 = NL + "\tpublic ";
  protected final String TEXT_1288 = " create";
  protected final String TEXT_1289 = "(";
  protected final String TEXT_1290 = ", ";
  protected final String TEXT_1291 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1292 = " new";
  protected final String TEXT_1293 = " = (";
  protected final String TEXT_1294 = ") create(eClass);";
  protected final String TEXT_1295 = NL + "\t\t";
  protected final String TEXT_1296 = "().add(new";
  protected final String TEXT_1297 = ");";
  protected final String TEXT_1298 = NL + "\t\tset";
  protected final String TEXT_1299 = "(new";
  protected final String TEXT_1300 = ");";
  protected final String TEXT_1301 = NL + "\t\tint ";
  protected final String TEXT_1302 = "ListSize = 0;";
  protected final String TEXT_1303 = NL + "\t\tint ";
  protected final String TEXT_1304 = "Size = ";
  protected final String TEXT_1305 = " == null ? 0 : ";
  protected final String TEXT_1306 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1307 = "Size > ";
  protected final String TEXT_1308 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1309 = "ListSize = ";
  protected final String TEXT_1310 = "Size;";
  protected final String TEXT_1311 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1312 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1313 = ".create";
  protected final String TEXT_1314 = "(";
  protected final String TEXT_1315 = ", ";
  protected final String TEXT_1316 = "i < ";
  protected final String TEXT_1317 = "Size ? (";
  protected final String TEXT_1318 = ") ";
  protected final String TEXT_1319 = ".get(i) : null";
  protected final String TEXT_1320 = ");" + NL + "\t\t}";
  protected final String TEXT_1321 = NL + "\t\tnew";
  protected final String TEXT_1322 = ".create";
  protected final String TEXT_1323 = "(";
  protected final String TEXT_1324 = ", ";
  protected final String TEXT_1325 = ");";
  protected final String TEXT_1326 = NL + "\t\tif (";
  protected final String TEXT_1327 = " != null)";
  protected final String TEXT_1328 = NL + "\t\t\tnew";
  protected final String TEXT_1329 = ".";
  protected final String TEXT_1330 = "().addAll(";
  protected final String TEXT_1331 = ");";
  protected final String TEXT_1332 = NL + "\t\t\tnew";
  protected final String TEXT_1333 = ".set";
  protected final String TEXT_1334 = "(";
  protected final String TEXT_1335 = ");";
  protected final String TEXT_1336 = NL + "\t\treturn new";
  protected final String TEXT_1337 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1338 = NL + "\t/**";
  protected final String TEXT_1339 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1340 = "}, with the specified ";
  protected final String TEXT_1341 = ", and appends it to the '<em><b>";
  protected final String TEXT_1342 = "</b></em>' ";
  protected final String TEXT_1343 = ".";
  protected final String TEXT_1344 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1345 = "},with the specified ";
  protected final String TEXT_1346 = ", and sets the '<em><b>";
  protected final String TEXT_1347 = "</b></em>' ";
  protected final String TEXT_1348 = ".";
  protected final String TEXT_1349 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1350 = "} and appends it to the '<em><b>";
  protected final String TEXT_1351 = "</b></em>' ";
  protected final String TEXT_1352 = ".";
  protected final String TEXT_1353 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1354 = "} and sets the '<em><b>";
  protected final String TEXT_1355 = "</b></em>' ";
  protected final String TEXT_1356 = ".";
  protected final String TEXT_1357 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1358 = NL + "\t * @param ";
  protected final String TEXT_1359 = " The ";
  protected final String TEXT_1360 = " for the new {@link ";
  protected final String TEXT_1361 = "}, or <code>null</code>.";
  protected final String TEXT_1362 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1363 = "}." + NL + "\t * @see #";
  protected final String TEXT_1364 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1365 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1366 = NL + "\t";
  protected final String TEXT_1367 = " create";
  protected final String TEXT_1368 = "(";
  protected final String TEXT_1369 = ");" + NL;
  protected final String TEXT_1370 = NL + "\t@Override";
  protected final String TEXT_1371 = NL + "\tpublic ";
  protected final String TEXT_1372 = " create";
  protected final String TEXT_1373 = "(";
  protected final String TEXT_1374 = ")" + NL + "\t{";
  protected final String TEXT_1375 = NL + "\t\treturn create";
  protected final String TEXT_1376 = "(";
  protected final String TEXT_1377 = ", ";
  protected final String TEXT_1378 = ");";
  protected final String TEXT_1379 = NL + "\t\t";
  protected final String TEXT_1380 = " new";
  protected final String TEXT_1381 = " = (";
  protected final String TEXT_1382 = ") create(";
  protected final String TEXT_1383 = ");";
  protected final String TEXT_1384 = NL + "\t\t";
  protected final String TEXT_1385 = "().add(new";
  protected final String TEXT_1386 = ");";
  protected final String TEXT_1387 = NL + "\t\tset";
  protected final String TEXT_1388 = "(new";
  protected final String TEXT_1389 = ");";
  protected final String TEXT_1390 = NL + "\t\tint ";
  protected final String TEXT_1391 = "ListSize = 0;";
  protected final String TEXT_1392 = NL + "\t\tint ";
  protected final String TEXT_1393 = "Size = ";
  protected final String TEXT_1394 = " == null ? 0 : ";
  protected final String TEXT_1395 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1396 = "Size > ";
  protected final String TEXT_1397 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1398 = "ListSize = ";
  protected final String TEXT_1399 = "Size;";
  protected final String TEXT_1400 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1401 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1402 = ".create";
  protected final String TEXT_1403 = "(";
  protected final String TEXT_1404 = ", ";
  protected final String TEXT_1405 = "i < ";
  protected final String TEXT_1406 = "Size ? (";
  protected final String TEXT_1407 = ") ";
  protected final String TEXT_1408 = ".get(i) : null";
  protected final String TEXT_1409 = ");" + NL + "\t\t}";
  protected final String TEXT_1410 = NL + "\t\tnew";
  protected final String TEXT_1411 = ".create";
  protected final String TEXT_1412 = "(";
  protected final String TEXT_1413 = ", ";
  protected final String TEXT_1414 = ");";
  protected final String TEXT_1415 = NL + "\t\tif (";
  protected final String TEXT_1416 = " != null)";
  protected final String TEXT_1417 = NL + "\t\t\tnew";
  protected final String TEXT_1418 = ".";
  protected final String TEXT_1419 = "().addAll(";
  protected final String TEXT_1420 = ");";
  protected final String TEXT_1421 = NL + "\t\t\tnew";
  protected final String TEXT_1422 = ".set";
  protected final String TEXT_1423 = "(";
  protected final String TEXT_1424 = ");";
  protected final String TEXT_1425 = NL + "\t\treturn new";
  protected final String TEXT_1426 = ";";
  protected final String TEXT_1427 = NL + "\t}" + NL;
  protected final String TEXT_1428 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1429 = "} with the specified ";
  protected final String TEXT_1430 = " from the '<em><b>";
  protected final String TEXT_1431 = "</b></em>' ";
  protected final String TEXT_1432 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1433 = NL + "\t * @param ";
  protected final String TEXT_1434 = " The ";
  protected final String TEXT_1435 = " of the {@link ";
  protected final String TEXT_1436 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1437 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1438 = "} with the specified ";
  protected final String TEXT_1439 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1440 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1441 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1442 = NL + "\t";
  protected final String TEXT_1443 = " get";
  protected final String TEXT_1444 = "(";
  protected final String TEXT_1445 = ");" + NL;
  protected final String TEXT_1446 = NL + "\t@Override";
  protected final String TEXT_1447 = NL + "\tpublic ";
  protected final String TEXT_1448 = " get";
  protected final String TEXT_1449 = "(";
  protected final String TEXT_1450 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1451 = "(";
  protected final String TEXT_1452 = ", false";
  protected final String TEXT_1453 = ", null";
  protected final String TEXT_1454 = ", false";
  protected final String TEXT_1455 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1456 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1457 = "} with the specified ";
  protected final String TEXT_1458 = " from the '<em><b>";
  protected final String TEXT_1459 = "</b></em>' ";
  protected final String TEXT_1460 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1461 = NL + "\t * @param ";
  protected final String TEXT_1462 = " The ";
  protected final String TEXT_1463 = " of the {@link ";
  protected final String TEXT_1464 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1465 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1466 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1467 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1468 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1469 = "} on demand if not found.";
  protected final String TEXT_1470 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1471 = "} with the specified ";
  protected final String TEXT_1472 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1473 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1474 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1475 = NL + "\t";
  protected final String TEXT_1476 = " get";
  protected final String TEXT_1477 = "(";
  protected final String TEXT_1478 = ", boolean ignoreCase";
  protected final String TEXT_1479 = ", ";
  protected final String TEXT_1480 = " eClass";
  protected final String TEXT_1481 = ", boolean createOnDemand";
  protected final String TEXT_1482 = ");" + NL;
  protected final String TEXT_1483 = NL + "\t@Override";
  protected final String TEXT_1484 = NL + "\tpublic ";
  protected final String TEXT_1485 = " get";
  protected final String TEXT_1486 = "(";
  protected final String TEXT_1487 = ", boolean ignoreCase";
  protected final String TEXT_1488 = ", ";
  protected final String TEXT_1489 = " eClass";
  protected final String TEXT_1490 = ", boolean createOnDemand";
  protected final String TEXT_1491 = ")" + NL + "\t{";
  protected final String TEXT_1492 = NL + "\t\t";
  protected final String TEXT_1493 = "Loop: for (";
  protected final String TEXT_1494 = " ";
  protected final String TEXT_1495 = " : ";
  protected final String TEXT_1496 = "())" + NL + "\t\t{";
  protected final String TEXT_1497 = NL + "\t\t";
  protected final String TEXT_1498 = "Loop: for (";
  protected final String TEXT_1499 = " i = ";
  protected final String TEXT_1500 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1501 = " ";
  protected final String TEXT_1502 = " = (";
  protected final String TEXT_1503 = ") i.next();";
  protected final String TEXT_1504 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1505 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1506 = "Loop;";
  protected final String TEXT_1507 = NL + "\t\t\t";
  protected final String TEXT_1508 = " ";
  protected final String TEXT_1509 = "List = ";
  protected final String TEXT_1510 = ".";
  protected final String TEXT_1511 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1512 = "ListSize = ";
  protected final String TEXT_1513 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1514 = " || (";
  protected final String TEXT_1515 = " != null && ";
  protected final String TEXT_1516 = ".size() != ";
  protected final String TEXT_1517 = "ListSize";
  protected final String TEXT_1518 = ")";
  protected final String TEXT_1519 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1520 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1521 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1522 = " ";
  protected final String TEXT_1523 = " = ";
  protected final String TEXT_1524 = "(";
  protected final String TEXT_1525 = ") ";
  protected final String TEXT_1526 = "List.get(j);";
  protected final String TEXT_1527 = NL + "\t\t\t\tif (";
  protected final String TEXT_1528 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1529 = "(";
  protected final String TEXT_1530 = ")";
  protected final String TEXT_1531 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1532 = ".";
  protected final String TEXT_1533 = "()) : ";
  protected final String TEXT_1534 = ".get(j).equals(";
  protected final String TEXT_1535 = ".";
  protected final String TEXT_1536 = "())))";
  protected final String TEXT_1537 = NL + "\t\t\t\tif (";
  protected final String TEXT_1538 = " != null && !";
  protected final String TEXT_1539 = ".get(j).equals(";
  protected final String TEXT_1540 = ".";
  protected final String TEXT_1541 = "()))";
  protected final String TEXT_1542 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1543 = "Loop;";
  protected final String TEXT_1544 = NL + "\t\t\t}";
  protected final String TEXT_1545 = NL + "\t\t\t";
  protected final String TEXT_1546 = " ";
  protected final String TEXT_1547 = " = ";
  protected final String TEXT_1548 = ".";
  protected final String TEXT_1549 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1550 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1551 = "Loop;";
  protected final String TEXT_1552 = NL + "\t\t\tif (";
  protected final String TEXT_1553 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1554 = ".equalsIgnoreCase(";
  protected final String TEXT_1555 = ".";
  protected final String TEXT_1556 = "()) : ";
  protected final String TEXT_1557 = ".equals(";
  protected final String TEXT_1558 = ".";
  protected final String TEXT_1559 = "())))";
  protected final String TEXT_1560 = NL + "\t\t\tif (";
  protected final String TEXT_1561 = " != null && !";
  protected final String TEXT_1562 = ".equals(";
  protected final String TEXT_1563 = ".";
  protected final String TEXT_1564 = "()))";
  protected final String TEXT_1565 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1566 = "Loop;";
  protected final String TEXT_1567 = NL + "\t\t\tif (";
  protected final String TEXT_1568 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1569 = ".equalsIgnoreCase(";
  protected final String TEXT_1570 = ".";
  protected final String TEXT_1571 = "()) : ";
  protected final String TEXT_1572 = ".equals(";
  protected final String TEXT_1573 = ".";
  protected final String TEXT_1574 = "())))";
  protected final String TEXT_1575 = NL + "\t\t\tif (";
  protected final String TEXT_1576 = " != null && !";
  protected final String TEXT_1577 = ".equals(";
  protected final String TEXT_1578 = ".";
  protected final String TEXT_1579 = "()))";
  protected final String TEXT_1580 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1581 = "Loop;";
  protected final String TEXT_1582 = NL + "\t\t\treturn ";
  protected final String TEXT_1583 = ";" + NL + "\t\t}";
  protected final String TEXT_1584 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1585 = " && eClass != null";
  protected final String TEXT_1586 = " ? create";
  protected final String TEXT_1587 = "(";
  protected final String TEXT_1588 = ", eClass";
  protected final String TEXT_1589 = ") : null;";
  protected final String TEXT_1590 = NL + "\t\treturn null;";
  protected final String TEXT_1591 = NL + "\t}" + NL;
  protected final String TEXT_1592 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1593 = "()" + NL + "\t{";
  protected final String TEXT_1594 = NL + "  \t\treturn false;";
  protected final String TEXT_1595 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1596 = ");";
  protected final String TEXT_1597 = NL + "\t\treturn !((";
  protected final String TEXT_1598 = ".Internal.Wrapper)";
  protected final String TEXT_1599 = "()).featureMap().isEmpty();";
  protected final String TEXT_1600 = NL + "\t\treturn ";
  protected final String TEXT_1601 = " != null && !";
  protected final String TEXT_1602 = ".featureMap().isEmpty();";
  protected final String TEXT_1603 = NL + "\t\treturn ";
  protected final String TEXT_1604 = " != null && !";
  protected final String TEXT_1605 = ".isEmpty();";
  protected final String TEXT_1606 = NL + "\t\t";
  protected final String TEXT_1607 = " ";
  protected final String TEXT_1608 = " = (";
  protected final String TEXT_1609 = ")eVirtualGet(";
  protected final String TEXT_1610 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1611 = " != null && !";
  protected final String TEXT_1612 = ".isEmpty();";
  protected final String TEXT_1613 = NL + "\t\treturn !";
  protected final String TEXT_1614 = "().isEmpty();";
  protected final String TEXT_1615 = NL + "\t\treturn ";
  protected final String TEXT_1616 = " != null;";
  protected final String TEXT_1617 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1618 = ") != null;";
  protected final String TEXT_1619 = NL + "\t\treturn basicGet";
  protected final String TEXT_1620 = "() != null;";
  protected final String TEXT_1621 = NL + "\t\treturn ";
  protected final String TEXT_1622 = " != null;";
  protected final String TEXT_1623 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1624 = ") != null;";
  protected final String TEXT_1625 = NL + "\t\treturn ";
  protected final String TEXT_1626 = "() != null;";
  protected final String TEXT_1627 = NL + "\t\treturn ((";
  protected final String TEXT_1628 = " & ";
  protected final String TEXT_1629 = "_EFLAG) != 0) != ";
  protected final String TEXT_1630 = ";";
  protected final String TEXT_1631 = NL + "\t\treturn ";
  protected final String TEXT_1632 = " != ";
  protected final String TEXT_1633 = ";";
  protected final String TEXT_1634 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1635 = ", ";
  protected final String TEXT_1636 = ") != ";
  protected final String TEXT_1637 = ";";
  protected final String TEXT_1638 = NL + "\t\treturn ";
  protected final String TEXT_1639 = "() != ";
  protected final String TEXT_1640 = ";";
  protected final String TEXT_1641 = NL + "\t\treturn ";
  protected final String TEXT_1642 = " == null ? ";
  protected final String TEXT_1643 = " != null : !";
  protected final String TEXT_1644 = ".equals(";
  protected final String TEXT_1645 = ");";
  protected final String TEXT_1646 = NL + "\t\t";
  protected final String TEXT_1647 = " ";
  protected final String TEXT_1648 = " = (";
  protected final String TEXT_1649 = ")eVirtualGet(";
  protected final String TEXT_1650 = ", ";
  protected final String TEXT_1651 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1652 = " == null ? ";
  protected final String TEXT_1653 = " != null : !";
  protected final String TEXT_1654 = ".equals(";
  protected final String TEXT_1655 = ");";
  protected final String TEXT_1656 = NL + "\t\treturn ";
  protected final String TEXT_1657 = " == null ? ";
  protected final String TEXT_1658 = "() != null : !";
  protected final String TEXT_1659 = ".equals(";
  protected final String TEXT_1660 = "());";
  protected final String TEXT_1661 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1662 = ");";
  protected final String TEXT_1663 = NL + "\t\t";
  protected final String TEXT_1664 = " ";
  protected final String TEXT_1665 = " = (";
  protected final String TEXT_1666 = ")eVirtualGet(";
  protected final String TEXT_1667 = ");";
  protected final String TEXT_1668 = NL + "\t\treturn ";
  protected final String TEXT_1669 = " != null && ((";
  protected final String TEXT_1670 = ".Unsettable";
  protected final String TEXT_1671 = ")";
  protected final String TEXT_1672 = ").isSet();";
  protected final String TEXT_1673 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1674 = ");";
  protected final String TEXT_1675 = NL + "\t\treturn (";
  protected final String TEXT_1676 = " & ";
  protected final String TEXT_1677 = "_ESETFLAG) != 0;";
  protected final String TEXT_1678 = NL + "\t\treturn ";
  protected final String TEXT_1679 = "ESet;";
  protected final String TEXT_1680 = NL + "\t\treturn !((";
  protected final String TEXT_1681 = ".Internal)((";
  protected final String TEXT_1682 = ".Internal.Wrapper)get";
  protected final String TEXT_1683 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1684 = ");";
  protected final String TEXT_1685 = NL + "\t\treturn !((";
  protected final String TEXT_1686 = ".Internal)get";
  protected final String TEXT_1687 = "()).isEmpty(";
  protected final String TEXT_1688 = ");";
  protected final String TEXT_1689 = NL + "\t\treturn ";
  protected final String TEXT_1690 = ".";
  protected final String TEXT_1691 = "(this);";
  protected final String TEXT_1692 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1693 = "' ";
  protected final String TEXT_1694 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1695 = NL + "\t}" + NL;
  protected final String TEXT_1696 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1697 = "(";
  protected final String TEXT_1698 = ") <em>";
  protected final String TEXT_1699 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1700 = "(";
  protected final String TEXT_1701 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1702 = " ";
  protected final String TEXT_1703 = "__EOCL_EXP = \"";
  protected final String TEXT_1704 = "\";";
  protected final String TEXT_1705 = NL;
  protected final String TEXT_1706 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1707 = "(";
  protected final String TEXT_1708 = ") <em>";
  protected final String TEXT_1709 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1710 = "(";
  protected final String TEXT_1711 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1712 = " ";
  protected final String TEXT_1713 = "__EOCL_INV;" + NL;
  protected final String TEXT_1714 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1715 = "(";
  protected final String TEXT_1716 = ") <em>";
  protected final String TEXT_1717 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1718 = "(";
  protected final String TEXT_1719 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1720 = "<";
  protected final String TEXT_1721 = ">";
  protected final String TEXT_1722 = " ";
  protected final String TEXT_1723 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1724 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1725 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1726 = NL + "\t * ";
  protected final String TEXT_1727 = NL + "\t * @param ";
  protected final String TEXT_1728 = NL + "\t *   ";
  protected final String TEXT_1729 = NL + "\t * @param ";
  protected final String TEXT_1730 = " ";
  protected final String TEXT_1731 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1732 = NL + "\t * @model ";
  protected final String TEXT_1733 = NL + "\t *        ";
  protected final String TEXT_1734 = NL + "\t * @model";
  protected final String TEXT_1735 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1736 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1737 = NL + "\t@Override";
  protected final String TEXT_1738 = NL + "\t";
  protected final String TEXT_1739 = " ";
  protected final String TEXT_1740 = "(";
  protected final String TEXT_1741 = ")";
  protected final String TEXT_1742 = ";" + NL;
  protected final String TEXT_1743 = NL + "\tpublic ";
  protected final String TEXT_1744 = " ";
  protected final String TEXT_1745 = "(";
  protected final String TEXT_1746 = ")";
  protected final String TEXT_1747 = NL + "\t{";
  protected final String TEXT_1748 = NL + "\t\t";
  protected final String TEXT_1749 = NL + "\t\treturn ";
  protected final String TEXT_1750 = ".";
  protected final String TEXT_1751 = "(this, ";
  protected final String TEXT_1752 = ", ";
  protected final String TEXT_1753 = ");";
  protected final String TEXT_1754 = NL + "\t\tif (";
  protected final String TEXT_1755 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1756 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_1757 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1758 = " = helper.createInvariant(";
  protected final String TEXT_1759 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1760 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_1761 = ").check(this))";
  protected final String TEXT_1762 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_1763 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1764 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1765 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1766 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1767 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1768 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1769 = ".";
  protected final String TEXT_1770 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1771 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1772 = "\", ";
  protected final String TEXT_1773 = ".getObjectLabel(this, ";
  protected final String TEXT_1774 = ") }),";
  protected final String TEXT_1775 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1776 = NL + "\t\t";
  protected final String TEXT_1777 = ".";
  protected final String TEXT_1778 = "(this";
  protected final String TEXT_1779 = ", ";
  protected final String TEXT_1780 = ");";
  protected final String TEXT_1781 = NL + "\t\t";
  protected final String TEXT_1782 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1783 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1784 = NL + "\t\t\t";
  protected final String TEXT_1785 = " result = (";
  protected final String TEXT_1786 = ") cache.get(";
  protected final String TEXT_1787 = "eResource(), ";
  protected final String TEXT_1788 = "this, ";
  protected final String TEXT_1789 = ".getEOperations().get(";
  protected final String TEXT_1790 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1791 = "eResource(), ";
  protected final String TEXT_1792 = "this, ";
  protected final String TEXT_1793 = ".getEOperations().get(";
  protected final String TEXT_1794 = "), result = ";
  protected final String TEXT_1795 = "new ";
  protected final String TEXT_1796 = "(";
  protected final String TEXT_1797 = ".";
  protected final String TEXT_1798 = "(this";
  protected final String TEXT_1799 = ", ";
  protected final String TEXT_1800 = ")";
  protected final String TEXT_1801 = ")";
  protected final String TEXT_1802 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1803 = ".";
  protected final String TEXT_1804 = "()";
  protected final String TEXT_1805 = ";" + NL + "\t\t}";
  protected final String TEXT_1806 = NL + "\t\treturn ";
  protected final String TEXT_1807 = ".";
  protected final String TEXT_1808 = "(this";
  protected final String TEXT_1809 = ", ";
  protected final String TEXT_1810 = ");";
  protected final String TEXT_1811 = NL + "\t\tif (";
  protected final String TEXT_1812 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1813 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_1814 = ", ";
  protected final String TEXT_1815 = ".getEOperations().get(";
  protected final String TEXT_1816 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1817 = " = helper.createQuery(";
  protected final String TEXT_1818 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1819 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_1820 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_1821 = ");";
  protected final String TEXT_1822 = NL + "\t\t";
  protected final String TEXT_1823 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_1824 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_1825 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_1826 = "\", ";
  protected final String TEXT_1827 = ");";
  protected final String TEXT_1828 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1829 = NL + "\t\t";
  protected final String TEXT_1830 = "<";
  protected final String TEXT_1831 = "> result = (";
  protected final String TEXT_1832 = "<";
  protected final String TEXT_1833 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_1834 = ".UnmodifiableEList<";
  protected final String TEXT_1835 = ">(result.size(), result.toArray());";
  protected final String TEXT_1836 = NL + "\t\treturn ((";
  protected final String TEXT_1837 = ") query.evaluate(this)).";
  protected final String TEXT_1838 = "();";
  protected final String TEXT_1839 = NL + "\t\treturn (";
  protected final String TEXT_1840 = ") query.evaluate(this);";
  protected final String TEXT_1841 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1842 = NL + "\t}" + NL;
  protected final String TEXT_1843 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1844 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1845 = NL + "\t@Override";
  protected final String TEXT_1846 = NL + "\tpublic ";
  protected final String TEXT_1847 = " eInverseAdd(";
  protected final String TEXT_1848 = " otherEnd, int featureID, ";
  protected final String TEXT_1849 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1850 = ")" + NL + "\t\t{";
  protected final String TEXT_1851 = NL + "\t\t\tcase ";
  protected final String TEXT_1852 = ":";
  protected final String TEXT_1853 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1854 = "(";
  protected final String TEXT_1855 = ".InternalMapView";
  protected final String TEXT_1856 = ")";
  protected final String TEXT_1857 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1858 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1859 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1860 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1861 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1862 = "((";
  protected final String TEXT_1863 = ")otherEnd, msgs);";
  protected final String TEXT_1864 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1865 = ", msgs);";
  protected final String TEXT_1866 = NL + "\t\t\t\t";
  protected final String TEXT_1867 = " ";
  protected final String TEXT_1868 = " = (";
  protected final String TEXT_1869 = ")eVirtualGet(";
  protected final String TEXT_1870 = ");";
  protected final String TEXT_1871 = NL + "\t\t\t\tif (";
  protected final String TEXT_1872 = " != null)";
  protected final String TEXT_1873 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1874 = ")";
  protected final String TEXT_1875 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1876 = ", null, msgs);";
  protected final String TEXT_1877 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1878 = ")";
  protected final String TEXT_1879 = ").eInverseRemove(this, ";
  protected final String TEXT_1880 = ", ";
  protected final String TEXT_1881 = ".class, msgs);";
  protected final String TEXT_1882 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1883 = "((";
  protected final String TEXT_1884 = ")otherEnd, msgs);";
  protected final String TEXT_1885 = NL + "\t\t}";
  protected final String TEXT_1886 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1887 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1888 = NL + "\t}" + NL;
  protected final String TEXT_1889 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1890 = NL + "\t@Override";
  protected final String TEXT_1891 = NL + "\tpublic ";
  protected final String TEXT_1892 = " eInverseRemove(";
  protected final String TEXT_1893 = " otherEnd, int featureID, ";
  protected final String TEXT_1894 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1895 = ")" + NL + "\t\t{";
  protected final String TEXT_1896 = NL + "\t\t\tcase ";
  protected final String TEXT_1897 = ":";
  protected final String TEXT_1898 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1899 = ")((";
  protected final String TEXT_1900 = ".InternalMapView";
  protected final String TEXT_1901 = ")";
  protected final String TEXT_1902 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1903 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1904 = ")((";
  protected final String TEXT_1905 = ".Internal.Wrapper)";
  protected final String TEXT_1906 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1907 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1908 = ")";
  protected final String TEXT_1909 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1910 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1911 = ", msgs);";
  protected final String TEXT_1912 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1913 = "(msgs);";
  protected final String TEXT_1914 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1915 = "(null, msgs);";
  protected final String TEXT_1916 = NL + "\t\t}";
  protected final String TEXT_1917 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1918 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1919 = NL + "\t}" + NL;
  protected final String TEXT_1920 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1921 = NL + "\t@Override";
  protected final String TEXT_1922 = NL + "\tpublic ";
  protected final String TEXT_1923 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1924 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID";
  protected final String TEXT_1925 = ")" + NL + "\t\t{";
  protected final String TEXT_1926 = NL + "\t\t\tcase ";
  protected final String TEXT_1927 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1928 = ", ";
  protected final String TEXT_1929 = ".class, msgs);";
  protected final String TEXT_1930 = NL + "\t\t}";
  protected final String TEXT_1931 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1932 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1933 = NL + "\t}" + NL;
  protected final String TEXT_1934 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1935 = NL + "\t@Override";
  protected final String TEXT_1936 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1937 = ")" + NL + "\t\t{";
  protected final String TEXT_1938 = NL + "\t\t\tcase ";
  protected final String TEXT_1939 = ":";
  protected final String TEXT_1940 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1941 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1942 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1943 = "(";
  protected final String TEXT_1944 = "());";
  protected final String TEXT_1945 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1946 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1947 = "();";
  protected final String TEXT_1948 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1949 = ".InternalMapView";
  protected final String TEXT_1950 = ")";
  protected final String TEXT_1951 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1952 = "();";
  protected final String TEXT_1953 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1954 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1955 = "().map();";
  protected final String TEXT_1956 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1957 = ".Internal.Wrapper)";
  protected final String TEXT_1958 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1959 = "();";
  protected final String TEXT_1960 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1961 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1962 = ".Internal)";
  protected final String TEXT_1963 = "()).getWrapper();";
  protected final String TEXT_1964 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1965 = "();";
  protected final String TEXT_1966 = NL + "\t\t}";
  protected final String TEXT_1967 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1968 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1969 = NL + "\t}" + NL;
  protected final String TEXT_1970 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1971 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1972 = NL + "\t@Override";
  protected final String TEXT_1973 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1974 = ")" + NL + "\t\t{";
  protected final String TEXT_1975 = NL + "\t\t\tcase ";
  protected final String TEXT_1976 = ":";
  protected final String TEXT_1977 = NL + "\t\t\t\t((";
  protected final String TEXT_1978 = ".Internal)((";
  protected final String TEXT_1979 = ".Internal.Wrapper)";
  protected final String TEXT_1980 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1981 = NL + "\t\t\t\t((";
  protected final String TEXT_1982 = ".Internal)";
  protected final String TEXT_1983 = "()).set(newValue);";
  protected final String TEXT_1984 = NL + "\t\t\t\t((";
  protected final String TEXT_1985 = ".Setting)((";
  protected final String TEXT_1986 = ".InternalMapView";
  protected final String TEXT_1987 = ")";
  protected final String TEXT_1988 = "()).eMap()).set(newValue);";
  protected final String TEXT_1989 = NL + "\t\t\t\t((";
  protected final String TEXT_1990 = ".Setting)";
  protected final String TEXT_1991 = "()).set(newValue);";
  protected final String TEXT_1992 = NL + "\t\t\t\t";
  protected final String TEXT_1993 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1994 = "().addAll((";
  protected final String TEXT_1995 = "<? extends ";
  protected final String TEXT_1996 = ">";
  protected final String TEXT_1997 = ")newValue);";
  protected final String TEXT_1998 = NL + "\t\t\t\tset";
  protected final String TEXT_1999 = "(((";
  protected final String TEXT_2000 = ")newValue).";
  protected final String TEXT_2001 = "());";
  protected final String TEXT_2002 = NL + "\t\t\t\tset";
  protected final String TEXT_2003 = "(";
  protected final String TEXT_2004 = "(";
  protected final String TEXT_2005 = ")";
  protected final String TEXT_2006 = "newValue);";
  protected final String TEXT_2007 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2008 = NL + "\t\t}";
  protected final String TEXT_2009 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2010 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2011 = NL + "\t}" + NL;
  protected final String TEXT_2012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2013 = NL + "\t@Override";
  protected final String TEXT_2014 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2015 = ")" + NL + "\t\t{";
  protected final String TEXT_2016 = NL + "\t\t\tcase ";
  protected final String TEXT_2017 = ":";
  protected final String TEXT_2018 = NL + "\t\t\t\t((";
  protected final String TEXT_2019 = ".Internal.Wrapper)";
  protected final String TEXT_2020 = "()).featureMap().clear();";
  protected final String TEXT_2021 = NL + "\t\t\t\t";
  protected final String TEXT_2022 = "().clear();";
  protected final String TEXT_2023 = NL + "\t\t\t\tunset";
  protected final String TEXT_2024 = "();";
  protected final String TEXT_2025 = NL + "\t\t\t\tset";
  protected final String TEXT_2026 = "((";
  protected final String TEXT_2027 = ")null);";
  protected final String TEXT_2028 = NL + "\t\t\t\tset";
  protected final String TEXT_2029 = "(";
  protected final String TEXT_2030 = ");";
  protected final String TEXT_2031 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2032 = NL + "\t\t}";
  protected final String TEXT_2033 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2034 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2035 = NL + "\t}" + NL;
  protected final String TEXT_2036 = NL;
  protected final String TEXT_2037 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2038 = NL + "\t@Override";
  protected final String TEXT_2039 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2040 = NL + "\t\t\tcase ";
  protected final String TEXT_2041 = ":";
  protected final String TEXT_2042 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2043 = "();";
  protected final String TEXT_2044 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2045 = ".Internal.Wrapper)";
  protected final String TEXT_2046 = "()).featureMap().isEmpty();";
  protected final String TEXT_2047 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2048 = " != null && !";
  protected final String TEXT_2049 = ".featureMap().isEmpty();";
  protected final String TEXT_2050 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2051 = " != null && !";
  protected final String TEXT_2052 = ".isEmpty();";
  protected final String TEXT_2053 = NL + "\t\t\t\t";
  protected final String TEXT_2054 = " ";
  protected final String TEXT_2055 = " = (";
  protected final String TEXT_2056 = ")eVirtualGet(";
  protected final String TEXT_2057 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2058 = " != null && !";
  protected final String TEXT_2059 = ".isEmpty();";
  protected final String TEXT_2060 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2061 = "().isEmpty();";
  protected final String TEXT_2062 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2063 = "();";
  protected final String TEXT_2064 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2065 = " != null;";
  protected final String TEXT_2066 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2067 = ") != null;";
  protected final String TEXT_2068 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2069 = "() != null;";
  protected final String TEXT_2070 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2071 = " != null;";
  protected final String TEXT_2072 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2073 = ") != null;";
  protected final String TEXT_2074 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2075 = "() != null;";
  protected final String TEXT_2076 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2077 = " & ";
  protected final String TEXT_2078 = "_EFLAG) != 0) != ";
  protected final String TEXT_2079 = ";";
  protected final String TEXT_2080 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2081 = " != ";
  protected final String TEXT_2082 = ";";
  protected final String TEXT_2083 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2084 = ", ";
  protected final String TEXT_2085 = ") != ";
  protected final String TEXT_2086 = ";";
  protected final String TEXT_2087 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2088 = "() != ";
  protected final String TEXT_2089 = ";";
  protected final String TEXT_2090 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2091 = " == null ? ";
  protected final String TEXT_2092 = " != null : !";
  protected final String TEXT_2093 = ".equals(";
  protected final String TEXT_2094 = ");";
  protected final String TEXT_2095 = NL + "\t\t\t\t";
  protected final String TEXT_2096 = " ";
  protected final String TEXT_2097 = " = (";
  protected final String TEXT_2098 = ")eVirtualGet(";
  protected final String TEXT_2099 = ", ";
  protected final String TEXT_2100 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2101 = " == null ? ";
  protected final String TEXT_2102 = " != null : !";
  protected final String TEXT_2103 = ".equals(";
  protected final String TEXT_2104 = ");";
  protected final String TEXT_2105 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2106 = " == null ? ";
  protected final String TEXT_2107 = "() != null : !";
  protected final String TEXT_2108 = ".equals(";
  protected final String TEXT_2109 = "());";
  protected final String TEXT_2110 = NL + "\t\t}";
  protected final String TEXT_2111 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2112 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2113 = NL + "\t}" + NL;
  protected final String TEXT_2114 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2115 = NL + "\t@Override";
  protected final String TEXT_2116 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2117 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2118 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2119 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2120 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2121 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2122 = ": return ";
  protected final String TEXT_2123 = ";";
  protected final String TEXT_2124 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2125 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2126 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2127 = NL + "\t@Override";
  protected final String TEXT_2128 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2129 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2130 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2131 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2132 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2133 = ": return ";
  protected final String TEXT_2134 = ";";
  protected final String TEXT_2135 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2136 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2137 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2138 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2139 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2140 = ": return ";
  protected final String TEXT_2141 = ";";
  protected final String TEXT_2142 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2143 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2144 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2145 = NL + "\t@Override";
  protected final String TEXT_2146 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2147 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2148 = NL + "\t@Override";
  protected final String TEXT_2149 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2150 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2151 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2152 = NL + "\t@Override";
  protected final String TEXT_2153 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2154 = NL + "\t\t\tcase ";
  protected final String TEXT_2155 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2156 = ";";
  protected final String TEXT_2157 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2158 = NL + "\t@Override";
  protected final String TEXT_2159 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2160 = NL + "\t\t\tcase ";
  protected final String TEXT_2161 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2162 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2163 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2164 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2165 = NL + "\t@Override";
  protected final String TEXT_2166 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2167 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2168 = ": \");";
  protected final String TEXT_2169 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2170 = ": \");";
  protected final String TEXT_2171 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2172 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2173 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2174 = NL + "\t\tif (";
  protected final String TEXT_2175 = "(";
  protected final String TEXT_2176 = " & ";
  protected final String TEXT_2177 = "_ESETFLAG) != 0";
  protected final String TEXT_2178 = "ESet";
  protected final String TEXT_2179 = ") result.append((";
  protected final String TEXT_2180 = " & ";
  protected final String TEXT_2181 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2182 = NL + "\t\tif (";
  protected final String TEXT_2183 = "(";
  protected final String TEXT_2184 = " & ";
  protected final String TEXT_2185 = "_ESETFLAG) != 0";
  protected final String TEXT_2186 = "ESet";
  protected final String TEXT_2187 = ") result.append(";
  protected final String TEXT_2188 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2189 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2190 = ", ";
  protected final String TEXT_2191 = "));";
  protected final String TEXT_2192 = NL + "\t\tresult.append((";
  protected final String TEXT_2193 = " & ";
  protected final String TEXT_2194 = "_EFLAG) != 0);";
  protected final String TEXT_2195 = NL + "\t\tresult.append(";
  protected final String TEXT_2196 = ");";
  protected final String TEXT_2197 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2198 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2199 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2200 = " getKey()" + NL + "\t{";
  protected final String TEXT_2201 = NL + "\t\treturn new ";
  protected final String TEXT_2202 = "(getTypedKey());";
  protected final String TEXT_2203 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2204 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2205 = " key)" + NL + "\t{";
  protected final String TEXT_2206 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2207 = "(";
  protected final String TEXT_2208 = ")";
  protected final String TEXT_2209 = "key);";
  protected final String TEXT_2210 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2211 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2212 = ")key).";
  protected final String TEXT_2213 = "());";
  protected final String TEXT_2214 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2215 = ")key);";
  protected final String TEXT_2216 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2217 = " getValue()" + NL + "\t{";
  protected final String TEXT_2218 = NL + "\t\treturn new ";
  protected final String TEXT_2219 = "(getTypedValue());";
  protected final String TEXT_2220 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2221 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2222 = " setValue(";
  protected final String TEXT_2223 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2224 = " oldValue = getValue();";
  protected final String TEXT_2225 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2226 = "(";
  protected final String TEXT_2227 = ")";
  protected final String TEXT_2228 = "value);";
  protected final String TEXT_2229 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2230 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2231 = ")value).";
  protected final String TEXT_2232 = "());";
  protected final String TEXT_2233 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2234 = ")value);";
  protected final String TEXT_2235 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2236 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2237 = NL + "\tpublic ";
  protected final String TEXT_2238 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2239 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2240 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2241 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2242 = " EOCL_ENV = ";
  protected final String TEXT_2243 = ".newInstance();" + NL;
  protected final String TEXT_2244 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2245 = " create(";
  protected final String TEXT_2246 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2247 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2248 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2249 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2250 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2251 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2252 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2253 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2254 = NL + "\t@Override";
  protected final String TEXT_2255 = NL + "\tprotected ";
  protected final String TEXT_2256 = " ";
  protected final String TEXT_2257 = "Helper(";
  protected final String TEXT_2258 = " ";
  protected final String TEXT_2259 = ")" + NL + "\t{";
  protected final String TEXT_2260 = NL + "\t\t";
  protected final String TEXT_2261 = ".addAll(super.";
  protected final String TEXT_2262 = "());";
  protected final String TEXT_2263 = NL + "\t\tsuper.";
  protected final String TEXT_2264 = "Helper(";
  protected final String TEXT_2265 = ");";
  protected final String TEXT_2266 = NL + "\t\tif (isSet";
  protected final String TEXT_2267 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2268 = "<";
  protected final String TEXT_2269 = ">";
  protected final String TEXT_2270 = " i = ((";
  protected final String TEXT_2271 = ") ";
  protected final String TEXT_2272 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2273 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2274 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2275 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2276 = "<";
  protected final String TEXT_2277 = ">";
  protected final String TEXT_2278 = " i = ((";
  protected final String TEXT_2279 = ") ";
  protected final String TEXT_2280 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2281 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2282 = NL + "\t\t";
  protected final String TEXT_2283 = " ";
  protected final String TEXT_2284 = " = ";
  protected final String TEXT_2285 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2286 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2287 = "<";
  protected final String TEXT_2288 = ">";
  protected final String TEXT_2289 = " i = ((";
  protected final String TEXT_2290 = ") ";
  protected final String TEXT_2291 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2292 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2293 = NL + "\t\tif (isSet";
  protected final String TEXT_2294 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2295 = ".addAll(";
  protected final String TEXT_2296 = "());" + NL + "\t\t}";
  protected final String TEXT_2297 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2298 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2299 = ".addAll(";
  protected final String TEXT_2300 = "());" + NL + "\t\t}";
  protected final String TEXT_2301 = NL + "\t\t";
  protected final String TEXT_2302 = " ";
  protected final String TEXT_2303 = " = ";
  protected final String TEXT_2304 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2305 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2306 = ".addAll(";
  protected final String TEXT_2307 = ");" + NL + "\t\t}";
  protected final String TEXT_2308 = NL + "\t\tif (isSet";
  protected final String TEXT_2309 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2310 = ".add(";
  protected final String TEXT_2311 = "basicGet";
  protected final String TEXT_2312 = "());" + NL + "\t\t}";
  protected final String TEXT_2313 = NL + "\t\t";
  protected final String TEXT_2314 = " ";
  protected final String TEXT_2315 = " = ";
  protected final String TEXT_2316 = "basicGet";
  protected final String TEXT_2317 = "();" + NL + "\t\tif (";
  protected final String TEXT_2318 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2319 = ".add(";
  protected final String TEXT_2320 = ");" + NL + "\t\t}";
  protected final String TEXT_2321 = NL + "\t\treturn ";
  protected final String TEXT_2322 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2323 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2324 = NL + "\t@Override";
  protected final String TEXT_2325 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2326 = "()" + NL + "\t{";
  protected final String TEXT_2327 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2328 = "()";
  protected final String TEXT_2329 = NL + "\t\treturn isSet";
  protected final String TEXT_2330 = "()";
  protected final String TEXT_2331 = ";";
  protected final String TEXT_2332 = NL + "\t\treturn !";
  protected final String TEXT_2333 = "().isEmpty()";
  protected final String TEXT_2334 = ";";
  protected final String TEXT_2335 = NL + "\t\treturn ";
  protected final String TEXT_2336 = "basicGet";
  protected final String TEXT_2337 = "() != null";
  protected final String TEXT_2338 = ";";
  protected final String TEXT_2339 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2340 = ")";
  protected final String TEXT_2341 = ";";
  protected final String TEXT_2342 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2343 = "()";
  protected final String TEXT_2344 = ";";
  protected final String TEXT_2345 = NL + "\t\t\t|| !";
  protected final String TEXT_2346 = "().isEmpty()";
  protected final String TEXT_2347 = ";";
  protected final String TEXT_2348 = NL + "\t\t\t|| ";
  protected final String TEXT_2349 = "basicGet";
  protected final String TEXT_2350 = "() != null";
  protected final String TEXT_2351 = ";";
  protected final String TEXT_2352 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2353 = ")";
  protected final String TEXT_2354 = ";";
  protected final String TEXT_2355 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2356 = "();";
  protected final String TEXT_2357 = NL + "\t\treturn false;";
  protected final String TEXT_2358 = NL + "\t}" + NL;
  protected final String TEXT_2359 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2360 = NL + "\t@Override";
  protected final String TEXT_2361 = NL + "\tpublic ";
  protected final String TEXT_2362 = " ";
  protected final String TEXT_2363 = "()" + NL + "\t{";
  protected final String TEXT_2364 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2365 = " ";
  protected final String TEXT_2366 = " = (";
  protected final String TEXT_2367 = ")((";
  protected final String TEXT_2368 = ")";
  protected final String TEXT_2369 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2370 = ";";
  protected final String TEXT_2371 = NL + "\t\treturn ";
  protected final String TEXT_2372 = "();";
  protected final String TEXT_2373 = NL + "\t\treturn new ";
  protected final String TEXT_2374 = ".UnmodifiableEList";
  protected final String TEXT_2375 = "(this, ";
  protected final String TEXT_2376 = "null";
  protected final String TEXT_2377 = ", 0, ";
  protected final String TEXT_2378 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2379 = NL + "\t\treturn null;";
  protected final String TEXT_2380 = NL + "\t\treturn ";
  protected final String TEXT_2381 = "();";
  protected final String TEXT_2382 = NL + "\t}" + NL;
  protected final String TEXT_2383 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2384 = NL + "\t@Override";
  protected final String TEXT_2385 = NL + "\tpublic ";
  protected final String TEXT_2386 = " basicGet";
  protected final String TEXT_2387 = "()" + NL + "\t{";
  protected final String TEXT_2388 = NL + "\t\treturn null;";
  protected final String TEXT_2389 = NL + "\t\treturn ";
  protected final String TEXT_2390 = "basicGet";
  protected final String TEXT_2391 = "();";
  protected final String TEXT_2392 = NL + "\t}" + NL;
  protected final String TEXT_2393 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2394 = NL + "\t@Override";
  protected final String TEXT_2395 = NL + "\tpublic ";
  protected final String TEXT_2396 = " basicSet";
  protected final String TEXT_2397 = "(";
  protected final String TEXT_2398 = " new";
  protected final String TEXT_2399 = ", ";
  protected final String TEXT_2400 = " msgs)" + NL + "\t{";
  protected final String TEXT_2401 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2402 = NL + "\t\tif (new";
  protected final String TEXT_2403 = " != null && !(new";
  protected final String TEXT_2404 = " instanceof ";
  protected final String TEXT_2405 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2406 = "));" + NL + "\t\t}";
  protected final String TEXT_2407 = NL + "\t\treturn basicSet";
  protected final String TEXT_2408 = "(";
  protected final String TEXT_2409 = "(";
  protected final String TEXT_2410 = ") ";
  protected final String TEXT_2411 = "new";
  protected final String TEXT_2412 = ", msgs);";
  protected final String TEXT_2413 = NL + "\t\tset";
  protected final String TEXT_2414 = "(";
  protected final String TEXT_2415 = "(";
  protected final String TEXT_2416 = ") ";
  protected final String TEXT_2417 = "new";
  protected final String TEXT_2418 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2419 = NL + "\t}" + NL;
  protected final String TEXT_2420 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2421 = NL + "\t@Override";
  protected final String TEXT_2422 = NL + "\tpublic void set";
  protected final String TEXT_2423 = "(";
  protected final String TEXT_2424 = " new";
  protected final String TEXT_2425 = ")" + NL + "\t{";
  protected final String TEXT_2426 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2427 = NL + "\t\tif (new";
  protected final String TEXT_2428 = " != null && !(new";
  protected final String TEXT_2429 = " instanceof ";
  protected final String TEXT_2430 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2431 = "));" + NL + "\t\t}";
  protected final String TEXT_2432 = NL + "\t\tset";
  protected final String TEXT_2433 = "(";
  protected final String TEXT_2434 = "(";
  protected final String TEXT_2435 = ") ";
  protected final String TEXT_2436 = "new";
  protected final String TEXT_2437 = ");";
  protected final String TEXT_2438 = NL + "\t}" + NL;
  protected final String TEXT_2439 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2440 = "() <em>";
  protected final String TEXT_2441 = "</em>}' ";
  protected final String TEXT_2442 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2443 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2444 = "_ESUBSETS = ";
  protected final String TEXT_2445 = ";" + NL;
  protected final String TEXT_2446 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2447 = "() <em>";
  protected final String TEXT_2448 = "</em>}' ";
  protected final String TEXT_2449 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2450 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2451 = "_ESUPERSETS = ";
  protected final String TEXT_2452 = ";" + NL;
  protected final String TEXT_2453 = NL + "\t/**";
  protected final String TEXT_2454 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2455 = "}, with the specified ";
  protected final String TEXT_2456 = ", and appends it to the '<em><b>";
  protected final String TEXT_2457 = "</b></em>' ";
  protected final String TEXT_2458 = ".";
  protected final String TEXT_2459 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2460 = "}, with the specified ";
  protected final String TEXT_2461 = ", and sets the '<em><b>";
  protected final String TEXT_2462 = "</b></em>' ";
  protected final String TEXT_2463 = ".";
  protected final String TEXT_2464 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2465 = "} and appends it to the '<em><b>";
  protected final String TEXT_2466 = "</b></em>' ";
  protected final String TEXT_2467 = ".";
  protected final String TEXT_2468 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2469 = "} and sets the '<em><b>";
  protected final String TEXT_2470 = "</b></em>' ";
  protected final String TEXT_2471 = ".";
  protected final String TEXT_2472 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2473 = NL + "\t * @param ";
  protected final String TEXT_2474 = " The ";
  protected final String TEXT_2475 = " for the new {@link ";
  protected final String TEXT_2476 = "}, or <code>null</code>.";
  protected final String TEXT_2477 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2478 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2479 = "}." + NL + "\t * @see #";
  protected final String TEXT_2480 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2481 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2482 = NL + "\t";
  protected final String TEXT_2483 = " create";
  protected final String TEXT_2484 = "(";
  protected final String TEXT_2485 = ", ";
  protected final String TEXT_2486 = " eClass);" + NL;
  protected final String TEXT_2487 = NL + "\t@Override";
  protected final String TEXT_2488 = NL + "\tpublic ";
  protected final String TEXT_2489 = " create";
  protected final String TEXT_2490 = "(";
  protected final String TEXT_2491 = ", ";
  protected final String TEXT_2492 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2493 = " new";
  protected final String TEXT_2494 = " = (";
  protected final String TEXT_2495 = ") create(eClass);";
  protected final String TEXT_2496 = NL + "\t\t";
  protected final String TEXT_2497 = "().add(new";
  protected final String TEXT_2498 = ");";
  protected final String TEXT_2499 = NL + "\t\tset";
  protected final String TEXT_2500 = "(new";
  protected final String TEXT_2501 = ");";
  protected final String TEXT_2502 = NL + "\t\tint ";
  protected final String TEXT_2503 = "ListSize = 0;";
  protected final String TEXT_2504 = NL + "\t\tint ";
  protected final String TEXT_2505 = "Size = ";
  protected final String TEXT_2506 = " == null ? 0 : ";
  protected final String TEXT_2507 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2508 = "Size > ";
  protected final String TEXT_2509 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2510 = "ListSize = ";
  protected final String TEXT_2511 = "Size;";
  protected final String TEXT_2512 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2513 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2514 = ".create";
  protected final String TEXT_2515 = "(";
  protected final String TEXT_2516 = ", ";
  protected final String TEXT_2517 = "i < ";
  protected final String TEXT_2518 = "Size ? (";
  protected final String TEXT_2519 = ") ";
  protected final String TEXT_2520 = ".get(i) : null";
  protected final String TEXT_2521 = ");" + NL + "\t\t}";
  protected final String TEXT_2522 = NL + "\t\tnew";
  protected final String TEXT_2523 = ".create";
  protected final String TEXT_2524 = "(";
  protected final String TEXT_2525 = ", ";
  protected final String TEXT_2526 = ");";
  protected final String TEXT_2527 = NL + "\t\tif (";
  protected final String TEXT_2528 = " != null)";
  protected final String TEXT_2529 = NL + "\t\t\tnew";
  protected final String TEXT_2530 = ".";
  protected final String TEXT_2531 = "().addAll(";
  protected final String TEXT_2532 = ");";
  protected final String TEXT_2533 = NL + "\t\t\tnew";
  protected final String TEXT_2534 = ".set";
  protected final String TEXT_2535 = "(";
  protected final String TEXT_2536 = ");";
  protected final String TEXT_2537 = NL + "\t\treturn new";
  protected final String TEXT_2538 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2539 = NL + "\t/**";
  protected final String TEXT_2540 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2541 = "}, with the specified ";
  protected final String TEXT_2542 = ", and appends it to the '<em><b>";
  protected final String TEXT_2543 = "</b></em>' ";
  protected final String TEXT_2544 = ".";
  protected final String TEXT_2545 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2546 = "},with the specified ";
  protected final String TEXT_2547 = ", and sets the '<em><b>";
  protected final String TEXT_2548 = "</b></em>' ";
  protected final String TEXT_2549 = ".";
  protected final String TEXT_2550 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2551 = "} and appends it to the '<em><b>";
  protected final String TEXT_2552 = "</b></em>' ";
  protected final String TEXT_2553 = ".";
  protected final String TEXT_2554 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2555 = "} and sets the '<em><b>";
  protected final String TEXT_2556 = "</b></em>' ";
  protected final String TEXT_2557 = ".";
  protected final String TEXT_2558 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2559 = NL + "\t * @param ";
  protected final String TEXT_2560 = " The ";
  protected final String TEXT_2561 = " for the new {@link ";
  protected final String TEXT_2562 = "}, or <code>null</code>.";
  protected final String TEXT_2563 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2564 = "}." + NL + "\t * @see #";
  protected final String TEXT_2565 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2566 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2567 = NL + "\t";
  protected final String TEXT_2568 = " create";
  protected final String TEXT_2569 = "(";
  protected final String TEXT_2570 = ");" + NL;
  protected final String TEXT_2571 = NL + "\t@Override";
  protected final String TEXT_2572 = NL + "\tpublic ";
  protected final String TEXT_2573 = " create";
  protected final String TEXT_2574 = "(";
  protected final String TEXT_2575 = ")" + NL + "\t{";
  protected final String TEXT_2576 = NL + "\t\treturn create";
  protected final String TEXT_2577 = "(";
  protected final String TEXT_2578 = ", ";
  protected final String TEXT_2579 = ");";
  protected final String TEXT_2580 = NL + "\t\t";
  protected final String TEXT_2581 = " new";
  protected final String TEXT_2582 = " = (";
  protected final String TEXT_2583 = ") create(";
  protected final String TEXT_2584 = ");";
  protected final String TEXT_2585 = NL + "\t\t";
  protected final String TEXT_2586 = "().add(new";
  protected final String TEXT_2587 = ");";
  protected final String TEXT_2588 = NL + "\t\tset";
  protected final String TEXT_2589 = "(new";
  protected final String TEXT_2590 = ");";
  protected final String TEXT_2591 = NL + "\t\tint ";
  protected final String TEXT_2592 = "ListSize = 0;";
  protected final String TEXT_2593 = NL + "\t\tint ";
  protected final String TEXT_2594 = "Size = ";
  protected final String TEXT_2595 = " == null ? 0 : ";
  protected final String TEXT_2596 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2597 = "Size > ";
  protected final String TEXT_2598 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2599 = "ListSize = ";
  protected final String TEXT_2600 = "Size;";
  protected final String TEXT_2601 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2602 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2603 = ".create";
  protected final String TEXT_2604 = "(";
  protected final String TEXT_2605 = ", ";
  protected final String TEXT_2606 = "i < ";
  protected final String TEXT_2607 = "Size ? (";
  protected final String TEXT_2608 = ") ";
  protected final String TEXT_2609 = ".get(i) : null";
  protected final String TEXT_2610 = ");" + NL + "\t\t}";
  protected final String TEXT_2611 = NL + "\t\tnew";
  protected final String TEXT_2612 = ".create";
  protected final String TEXT_2613 = "(";
  protected final String TEXT_2614 = ", ";
  protected final String TEXT_2615 = ");";
  protected final String TEXT_2616 = NL + "\t\tif (";
  protected final String TEXT_2617 = " != null)";
  protected final String TEXT_2618 = NL + "\t\t\tnew";
  protected final String TEXT_2619 = ".";
  protected final String TEXT_2620 = "().addAll(";
  protected final String TEXT_2621 = ");";
  protected final String TEXT_2622 = NL + "\t\t\tnew";
  protected final String TEXT_2623 = ".set";
  protected final String TEXT_2624 = "(";
  protected final String TEXT_2625 = ");";
  protected final String TEXT_2626 = NL + "\t\treturn new";
  protected final String TEXT_2627 = ";";
  protected final String TEXT_2628 = NL + "\t}" + NL;
  protected final String TEXT_2629 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2630 = "} with the specified ";
  protected final String TEXT_2631 = " from the '<em><b>";
  protected final String TEXT_2632 = "</b></em>' ";
  protected final String TEXT_2633 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2634 = NL + "\t * @param ";
  protected final String TEXT_2635 = " The ";
  protected final String TEXT_2636 = " of the {@link ";
  protected final String TEXT_2637 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2638 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2639 = "} with the specified ";
  protected final String TEXT_2640 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2641 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2642 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2643 = NL + "\t";
  protected final String TEXT_2644 = " get";
  protected final String TEXT_2645 = "(";
  protected final String TEXT_2646 = ");" + NL;
  protected final String TEXT_2647 = NL + "\t@Override";
  protected final String TEXT_2648 = NL + "\tpublic ";
  protected final String TEXT_2649 = " get";
  protected final String TEXT_2650 = "(";
  protected final String TEXT_2651 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2652 = "(";
  protected final String TEXT_2653 = ", false";
  protected final String TEXT_2654 = ", null";
  protected final String TEXT_2655 = ", false";
  protected final String TEXT_2656 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2657 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2658 = "} with the specified ";
  protected final String TEXT_2659 = " from the '<em><b>";
  protected final String TEXT_2660 = "</b></em>' ";
  protected final String TEXT_2661 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2662 = NL + "\t * @param ";
  protected final String TEXT_2663 = " The ";
  protected final String TEXT_2664 = " of the {@link ";
  protected final String TEXT_2665 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2666 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2667 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2668 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2669 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2670 = "} on demand if not found.";
  protected final String TEXT_2671 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2672 = "} with the specified ";
  protected final String TEXT_2673 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2674 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2675 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2676 = NL + "\t";
  protected final String TEXT_2677 = " get";
  protected final String TEXT_2678 = "(";
  protected final String TEXT_2679 = ", boolean ignoreCase";
  protected final String TEXT_2680 = ", ";
  protected final String TEXT_2681 = " eClass";
  protected final String TEXT_2682 = ", boolean createOnDemand";
  protected final String TEXT_2683 = ");" + NL;
  protected final String TEXT_2684 = NL + "\t@Override";
  protected final String TEXT_2685 = NL + "\tpublic ";
  protected final String TEXT_2686 = " get";
  protected final String TEXT_2687 = "(";
  protected final String TEXT_2688 = ", boolean ignoreCase";
  protected final String TEXT_2689 = ", ";
  protected final String TEXT_2690 = " eClass";
  protected final String TEXT_2691 = ", boolean createOnDemand";
  protected final String TEXT_2692 = ")" + NL + "\t{";
  protected final String TEXT_2693 = NL + "\t\t";
  protected final String TEXT_2694 = "Loop: for (";
  protected final String TEXT_2695 = " ";
  protected final String TEXT_2696 = " : ";
  protected final String TEXT_2697 = "())" + NL + "\t\t{";
  protected final String TEXT_2698 = NL + "\t\t";
  protected final String TEXT_2699 = "Loop: for (";
  protected final String TEXT_2700 = " i = ";
  protected final String TEXT_2701 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2702 = " ";
  protected final String TEXT_2703 = " = (";
  protected final String TEXT_2704 = ") i.next();";
  protected final String TEXT_2705 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2706 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2707 = "Loop;";
  protected final String TEXT_2708 = NL + "\t\t\t";
  protected final String TEXT_2709 = " ";
  protected final String TEXT_2710 = "List = ";
  protected final String TEXT_2711 = ".";
  protected final String TEXT_2712 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2713 = "ListSize = ";
  protected final String TEXT_2714 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2715 = " || (";
  protected final String TEXT_2716 = " != null && ";
  protected final String TEXT_2717 = ".size() != ";
  protected final String TEXT_2718 = "ListSize";
  protected final String TEXT_2719 = ")";
  protected final String TEXT_2720 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2721 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2722 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2723 = " ";
  protected final String TEXT_2724 = " = ";
  protected final String TEXT_2725 = "(";
  protected final String TEXT_2726 = ") ";
  protected final String TEXT_2727 = "List.get(j);";
  protected final String TEXT_2728 = NL + "\t\t\t\tif (";
  protected final String TEXT_2729 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2730 = "(";
  protected final String TEXT_2731 = ")";
  protected final String TEXT_2732 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2733 = ".";
  protected final String TEXT_2734 = "()) : ";
  protected final String TEXT_2735 = ".get(j).equals(";
  protected final String TEXT_2736 = ".";
  protected final String TEXT_2737 = "())))";
  protected final String TEXT_2738 = NL + "\t\t\t\tif (";
  protected final String TEXT_2739 = " != null && !";
  protected final String TEXT_2740 = ".get(j).equals(";
  protected final String TEXT_2741 = ".";
  protected final String TEXT_2742 = "()))";
  protected final String TEXT_2743 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2744 = "Loop;";
  protected final String TEXT_2745 = NL + "\t\t\t}";
  protected final String TEXT_2746 = NL + "\t\t\t";
  protected final String TEXT_2747 = " ";
  protected final String TEXT_2748 = " = ";
  protected final String TEXT_2749 = ".";
  protected final String TEXT_2750 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2751 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2752 = "Loop;";
  protected final String TEXT_2753 = NL + "\t\t\tif (";
  protected final String TEXT_2754 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2755 = ".equalsIgnoreCase(";
  protected final String TEXT_2756 = ".";
  protected final String TEXT_2757 = "()) : ";
  protected final String TEXT_2758 = ".equals(";
  protected final String TEXT_2759 = ".";
  protected final String TEXT_2760 = "())))";
  protected final String TEXT_2761 = NL + "\t\t\tif (";
  protected final String TEXT_2762 = " != null && !";
  protected final String TEXT_2763 = ".equals(";
  protected final String TEXT_2764 = ".";
  protected final String TEXT_2765 = "()))";
  protected final String TEXT_2766 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2767 = "Loop;";
  protected final String TEXT_2768 = NL + "\t\t\tif (";
  protected final String TEXT_2769 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2770 = ".equalsIgnoreCase(";
  protected final String TEXT_2771 = ".";
  protected final String TEXT_2772 = "()) : ";
  protected final String TEXT_2773 = ".equals(";
  protected final String TEXT_2774 = ".";
  protected final String TEXT_2775 = "())))";
  protected final String TEXT_2776 = NL + "\t\t\tif (";
  protected final String TEXT_2777 = " != null && !";
  protected final String TEXT_2778 = ".equals(";
  protected final String TEXT_2779 = ".";
  protected final String TEXT_2780 = "()))";
  protected final String TEXT_2781 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2782 = "Loop;";
  protected final String TEXT_2783 = NL + "\t\t\treturn ";
  protected final String TEXT_2784 = ";" + NL + "\t\t}";
  protected final String TEXT_2785 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2786 = " && eClass != null";
  protected final String TEXT_2787 = " ? create";
  protected final String TEXT_2788 = "(";
  protected final String TEXT_2789 = ", eClass";
  protected final String TEXT_2790 = ") : null;";
  protected final String TEXT_2791 = NL + "\t\treturn null;";
  protected final String TEXT_2792 = NL + "\t}" + NL;
  protected final String TEXT_2793 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2794 = "()" + NL + "\t{";
  protected final String TEXT_2795 = NL + "  \t\treturn false;";
  protected final String TEXT_2796 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2797 = ");";
  protected final String TEXT_2798 = NL + "\t\treturn !((";
  protected final String TEXT_2799 = ".Internal.Wrapper)";
  protected final String TEXT_2800 = "()).featureMap().isEmpty();";
  protected final String TEXT_2801 = NL + "\t\treturn ";
  protected final String TEXT_2802 = " != null && !";
  protected final String TEXT_2803 = ".featureMap().isEmpty();";
  protected final String TEXT_2804 = NL + "\t\treturn ";
  protected final String TEXT_2805 = " != null && !";
  protected final String TEXT_2806 = ".isEmpty();";
  protected final String TEXT_2807 = NL + "\t\t";
  protected final String TEXT_2808 = " ";
  protected final String TEXT_2809 = " = (";
  protected final String TEXT_2810 = ")eVirtualGet(";
  protected final String TEXT_2811 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2812 = " != null && !";
  protected final String TEXT_2813 = ".isEmpty();";
  protected final String TEXT_2814 = NL + "\t\treturn !";
  protected final String TEXT_2815 = "().isEmpty();";
  protected final String TEXT_2816 = NL + "\t\treturn ";
  protected final String TEXT_2817 = " != null;";
  protected final String TEXT_2818 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2819 = ") != null;";
  protected final String TEXT_2820 = NL + "\t\treturn basicGet";
  protected final String TEXT_2821 = "() != null;";
  protected final String TEXT_2822 = NL + "\t\treturn ";
  protected final String TEXT_2823 = " != null;";
  protected final String TEXT_2824 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2825 = ") != null;";
  protected final String TEXT_2826 = NL + "\t\treturn ";
  protected final String TEXT_2827 = "() != null;";
  protected final String TEXT_2828 = NL + "\t\treturn ((";
  protected final String TEXT_2829 = " & ";
  protected final String TEXT_2830 = "_EFLAG) != 0) != ";
  protected final String TEXT_2831 = ";";
  protected final String TEXT_2832 = NL + "\t\treturn ";
  protected final String TEXT_2833 = " != ";
  protected final String TEXT_2834 = ";";
  protected final String TEXT_2835 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2836 = ", ";
  protected final String TEXT_2837 = ") != ";
  protected final String TEXT_2838 = ";";
  protected final String TEXT_2839 = NL + "\t\treturn ";
  protected final String TEXT_2840 = "() != ";
  protected final String TEXT_2841 = ";";
  protected final String TEXT_2842 = NL + "\t\treturn ";
  protected final String TEXT_2843 = " == null ? ";
  protected final String TEXT_2844 = " != null : !";
  protected final String TEXT_2845 = ".equals(";
  protected final String TEXT_2846 = ");";
  protected final String TEXT_2847 = NL + "\t\t";
  protected final String TEXT_2848 = " ";
  protected final String TEXT_2849 = " = (";
  protected final String TEXT_2850 = ")eVirtualGet(";
  protected final String TEXT_2851 = ", ";
  protected final String TEXT_2852 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2853 = " == null ? ";
  protected final String TEXT_2854 = " != null : !";
  protected final String TEXT_2855 = ".equals(";
  protected final String TEXT_2856 = ");";
  protected final String TEXT_2857 = NL + "\t\treturn ";
  protected final String TEXT_2858 = " == null ? ";
  protected final String TEXT_2859 = "() != null : !";
  protected final String TEXT_2860 = ".equals(";
  protected final String TEXT_2861 = "());";
  protected final String TEXT_2862 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2863 = ");";
  protected final String TEXT_2864 = NL + "\t\t";
  protected final String TEXT_2865 = " ";
  protected final String TEXT_2866 = " = (";
  protected final String TEXT_2867 = ")eVirtualGet(";
  protected final String TEXT_2868 = ");";
  protected final String TEXT_2869 = NL + "\t\treturn ";
  protected final String TEXT_2870 = " != null && ((";
  protected final String TEXT_2871 = ".Unsettable";
  protected final String TEXT_2872 = ")";
  protected final String TEXT_2873 = ").isSet();";
  protected final String TEXT_2874 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2875 = ");";
  protected final String TEXT_2876 = NL + "\t\treturn (";
  protected final String TEXT_2877 = " & ";
  protected final String TEXT_2878 = "_ESETFLAG) != 0;";
  protected final String TEXT_2879 = NL + "\t\treturn ";
  protected final String TEXT_2880 = "ESet;";
  protected final String TEXT_2881 = NL + "\t\treturn !((";
  protected final String TEXT_2882 = ".Internal)((";
  protected final String TEXT_2883 = ".Internal.Wrapper)get";
  protected final String TEXT_2884 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2885 = ");";
  protected final String TEXT_2886 = NL + "\t\treturn !((";
  protected final String TEXT_2887 = ".Internal)get";
  protected final String TEXT_2888 = "()).isEmpty(";
  protected final String TEXT_2889 = ");";
  protected final String TEXT_2890 = NL + "\t\treturn ";
  protected final String TEXT_2891 = ".";
  protected final String TEXT_2892 = "(this);";
  protected final String TEXT_2893 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2894 = "' ";
  protected final String TEXT_2895 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2896 = NL + "\t}" + NL;
  protected final String TEXT_2897 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2898 = NL + "\t@Override";
  protected final String TEXT_2899 = NL + "\tpublic ";
  protected final String TEXT_2900 = " ";
  protected final String TEXT_2901 = "(";
  protected final String TEXT_2902 = ")";
  protected final String TEXT_2903 = NL + "\t{";
  protected final String TEXT_2904 = NL + "\t\t";
  protected final String TEXT_2905 = "(";
  protected final String TEXT_2906 = ");";
  protected final String TEXT_2907 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2908 = NL + "\t\treturn ";
  protected final String TEXT_2909 = "(";
  protected final String TEXT_2910 = ");";
  protected final String TEXT_2911 = NL + "\t}" + NL;
  protected final String TEXT_2912 = NL + "} //";
  protected final String TEXT_2913 = NL;

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
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType();
int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); }
      
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
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_132);
    for (GenFeature genFeature : genClass.getFlagGenFeatures("true")) {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_135);
    }
    stringBuffer.append(TEXT_136);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_137);
    }
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_140);
    }
    if (isImplementation && genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL && (genClass.getClassExtendsGenClass() == null || genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL)) {
    stringBuffer.append(TEXT_141);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_144);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_145);
    if (!isImplementation) {
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_148);
    } else {
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_152);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_156);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_158);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_159);
    } else {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_162);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    if (!isImplementation) {
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_174);
    } else {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_177);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_179);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_181);
    if (!isImplementation) {
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_183);
    } else {
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_185);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_187);
    } else {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_190);
    }
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(TEXT_192);
    if (!isImplementation) {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_196);
    } else {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_204);
    }
    stringBuffer.append(TEXT_205);
    if (!isImplementation) {
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_208);
    } else {
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_212);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_215);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_216);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_218);
    } else {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_220);
    }
    stringBuffer.append(TEXT_221);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_223);
    } else {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_225);
    }
    stringBuffer.append(TEXT_226);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_227);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_228);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_229);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_231);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_233);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_237);
    }
    }
    stringBuffer.append(TEXT_238);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_244);
    }
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_247);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_250);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_252);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_255);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_258);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_261);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_263);
    }}
    stringBuffer.append(TEXT_264);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_265);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_266);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_269);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast() || genFeature.isListType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_270);
    }
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_273);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_274);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_275);
    }
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_278);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_280);
    }
    stringBuffer.append(TEXT_281);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_286);
    }
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_288);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_292);
    } else {
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_295);
    }
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_297);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_300);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_306);
    }
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_318);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_323);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_327);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_331);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_334);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_337);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_340);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_341);
    }
    stringBuffer.append(TEXT_342);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_345);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_351);
    }
    stringBuffer.append(TEXT_352);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_356);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_359);
    } else {
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_361);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_371);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_375);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_378);
    } else {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_383);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_385);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_387);
    } else {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_390);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_391);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_392);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_394);
    }
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_398);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_400);
    }
    stringBuffer.append(TEXT_401);
    } else {
    stringBuffer.append(TEXT_402);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_403);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_405);
    }
    stringBuffer.append(TEXT_406);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_408);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_410);
    }
    stringBuffer.append(TEXT_411);
    }
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_413);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_414);
    }
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_417);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_418);
    }
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_420);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_423);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_425);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_427);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_428);
    }
    stringBuffer.append(TEXT_429);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_431);
    }
    stringBuffer.append(TEXT_432);
    }
    stringBuffer.append(TEXT_433);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_435);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_438);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_439);
    }
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_449);
    }
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_451);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_453);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_457);
    }
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_467);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_468);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_471);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_484);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_485);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_487);
    }
    stringBuffer.append(TEXT_488);
    }
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_493);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_494);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_495);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_496);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_498);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_501);
    } else {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_506);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_507);
    }
    }
    }
    }
    stringBuffer.append(TEXT_508);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_510);
    } else {
    stringBuffer.append(TEXT_511);
    }
    stringBuffer.append(TEXT_512);
    }
    } else {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_515);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_516);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_517);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_518);
    }
    }
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_521);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_524);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_527);
    } else {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_529);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_532);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_534);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_538);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_539);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_541);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_543);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_544);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_545);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_547);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_549);
    } else {
    stringBuffer.append(TEXT_550);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_551);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_552);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_556);
    }
    }
    }
    }
    stringBuffer.append(TEXT_557);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_559);
    } else {
    stringBuffer.append(TEXT_560);
    }
    stringBuffer.append(TEXT_561);
    } else {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_564);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_565);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_566);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_567);
    }
    }
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_573);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_577);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_579);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_580);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_581);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_583);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_586);
    }
    stringBuffer.append(TEXT_587);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_591);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_593);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_594);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_595);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_601);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_605);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_606);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_608);
    }
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_613);
    }
    stringBuffer.append(TEXT_614);
    }
    stringBuffer.append(TEXT_615);
    }
    stringBuffer.append(TEXT_616);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_620);
    } else {
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_626);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_628);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_634);
    } else {
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_638);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_639);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_644);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_648);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_649);
    } else {
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_651);
    }
    stringBuffer.append(TEXT_652);
    } else {
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_657);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_662);
    }
    stringBuffer.append(TEXT_663);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_665);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_667);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_669);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_670);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_672);
    }
    stringBuffer.append(TEXT_673);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_676);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_677);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_679);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_680);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_681);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_682);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_685);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_687);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_691);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_694);
    }
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_699);
    }
    stringBuffer.append(TEXT_700);
    }
    stringBuffer.append(TEXT_701);
    }
    stringBuffer.append(TEXT_702);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_705);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    } else {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_710);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_713);
    }
    } else {
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_716);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_717);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_725);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_728);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_730);
    }
    }
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_732);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_733);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_734);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_737);
    } else {
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_741);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_746);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_748);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_752);
    }
    stringBuffer.append(TEXT_753);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_767);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_777);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_782);
    }
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_787);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_795);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_799);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_804);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_805);
    }
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_810);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_813);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_817);
    }
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_820);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_823);
    }
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_825);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_832);
    }
    stringBuffer.append(TEXT_833);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_839);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_844);
    }
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_850);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_854);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    } else {
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_865);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_870);
    } else {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_874);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_878);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_880);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_884);
    }
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_887);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_890);
    }
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_892);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_896);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_900);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_902);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_903);
    } else {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_905);
    }
    stringBuffer.append(TEXT_906);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_910);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_915);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_917);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_919);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_921);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_923);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_924);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_926);
    }
    stringBuffer.append(TEXT_927);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_928);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_931);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_933);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_934);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_935);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_941);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_943);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_945);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_946);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_948);
    }
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_950);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_953);
    }
    stringBuffer.append(TEXT_954);
    }
    stringBuffer.append(TEXT_955);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_960);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_962);
    }
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_964);
    }
    stringBuffer.append(TEXT_965);
    } else {
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_967);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_969);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_971);
    }
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_973);
    }
    stringBuffer.append(TEXT_974);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_975);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_978);
    } else {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_981);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_982);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_983);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_984);
    }
    }
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_988);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_991);
    } else {
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_996);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_998);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1004);
    } else {
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1008);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1013);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1015);
    } else {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1017);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1018);
    } else {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1020);
    }
    stringBuffer.append(TEXT_1021);
    }
    } else {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1024);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1025);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(TEXT_1031);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1033);
    }
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1035);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1038);
    }
    stringBuffer.append(TEXT_1039);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1040);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1041);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1043);
    } else {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1045);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1047);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1052);
    }
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1057);
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
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1065);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1069);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1074);
    }
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1076);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
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
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1096);
    }
    stringBuffer.append(TEXT_1097);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1102);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1105);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1109);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1111);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1115);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1118);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1120);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1123);
    } else {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1125);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1129);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1131);
    } else {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1133);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1134);
    } else {
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1136);
    }
    stringBuffer.append(TEXT_1137);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1143);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1146);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1149);
    } else {
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1151);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1155);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1160);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1161);
    } else {
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1163);
    }
    stringBuffer.append(TEXT_1164);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1169);
    } else {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1173);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1176);
    } else {
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1179);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1180);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1188);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1190);
    }
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1192);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1195);
    }
    stringBuffer.append(TEXT_1196);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1197);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1198);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1200);
    } else {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1202);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1204);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1209);
    }
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1214);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1216);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1219);
    } else {
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1221);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1226);
    } else {
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1230);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1233);
    } else {
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1236);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1237);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1244);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1251);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1252);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1257);
    } else {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1262);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1266);
    } else {
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1270);
    }
    }
    stringBuffer.append(TEXT_1271);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1275);
    }
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1279);
    } else {
    stringBuffer.append(TEXT_1280);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1283);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1284);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1285);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1286);
    }
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1289);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1290);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1294);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1297);
    } else {
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1300);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1302);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1310);
    index++;}
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1314);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1315);
    }
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1319);
    }
    stringBuffer.append(TEXT_1320);
    } else {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1323);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1324);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1325);
    }
    } else {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1327);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1331);
    } else {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1335);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1337);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1338);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1343);
    } else {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1348);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1352);
    } else {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1356);
    }
    }
    stringBuffer.append(TEXT_1357);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1361);
    }
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1364);
    } else {
    stringBuffer.append(TEXT_1365);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1369);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1370);
    }
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1374);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1376);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1377);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1378);
    } else {
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1383);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1386);
    } else {
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1389);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1391);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1399);
    index++;}
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1403);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1404);
    }
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1408);
    }
    stringBuffer.append(TEXT_1409);
    } else {
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1412);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1413);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1414);
    }
    } else {
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1416);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1420);
    } else {
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1424);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1426);
    }
    stringBuffer.append(TEXT_1427);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1432);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1436);
    }
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1440);
    } else {
    stringBuffer.append(TEXT_1441);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1445);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1446);
    }
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1452);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1453);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1454);
    }
    stringBuffer.append(TEXT_1455);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1460);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1464);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1465);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1467);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1469);
    }
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1473);
    } else {
    stringBuffer.append(TEXT_1474);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1478);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1480);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1481);
    }
    stringBuffer.append(TEXT_1482);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1483);
    }
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1487);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1489);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1490);
    }
    stringBuffer.append(TEXT_1491);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1496);
    } else {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1503);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1506);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1513);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1514);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1517);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1518);
    }
    }
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1523);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1525);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1526);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1528);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1530);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1536);
    } else {
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1541);
    }
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1543);
    index++;}
    stringBuffer.append(TEXT_1544);
    } else {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1551);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1559);
    } else {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1564);
    }
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1566);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1574);
    } else {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1579);
    }
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1581);
    index++;}
    }
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1583);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1584);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1585);
    }
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1588);
    }
    stringBuffer.append(TEXT_1589);
    } else {
    stringBuffer.append(TEXT_1590);
    }
    stringBuffer.append(TEXT_1591);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1593);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1594);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1596);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1599);
    } else {
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1602);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1605);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1612);
    } else {
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1614);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1616);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1618);
    } else {
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1620);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1622);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1624);
    } else {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1626);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1630);
    } else {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1633);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1637);
    } else {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1640);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1645);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1655);
    } else {
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1660);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1662);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1667);
    }
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1672);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1674);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1677);
    } else {
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1679);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1684);
    } else {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1688);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1691);
    } else {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1694);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1695);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage()) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1705);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1713);
    } else {
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1721);
    }
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1723);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1724);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1725);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1731);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1734);
    }}
    stringBuffer.append(TEXT_1735);
    } else {
    stringBuffer.append(TEXT_1736);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1737);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1742);
    } else {
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1747);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1753);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1761);
    } else {
    stringBuffer.append(TEXT_1762);
    }
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1775);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1778);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1780);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1782);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1783);
    }
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1786);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1787);
    }
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1790);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1791);
    }
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1794);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1796);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1798);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1800);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1801);
    }
    stringBuffer.append(TEXT_1802);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1804);
    }
    stringBuffer.append(TEXT_1805);
    }
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1808);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1810);
    }
    } else if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclQry = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_QRY";
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genOperation.getGenClass().getGenOperations().indexOf(genOperation));
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1821);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1823);
    }
    stringBuffer.append(TEXT_1824);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1828);
    }
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1835);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1838);
    } else {
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_1840);
    }
    } else {
    stringBuffer.append(TEXT_1841);
    }
    }
    stringBuffer.append(TEXT_1842);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1843);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1844);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1845);
    }
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1850);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1852);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1857);
    } else {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1859);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1860);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1863);
    } else {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1865);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1870);
    }
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1872);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1876);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1881);
    }
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1884);
    }
    }
    stringBuffer.append(TEXT_1885);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1886);
    } else {
    stringBuffer.append(TEXT_1887);
    }
    stringBuffer.append(TEXT_1888);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1889);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1890);
    }
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1895);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1897);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1902);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1906);
    } else {
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1909);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1911);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1913);
    } else {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1915);
    }
    }
    stringBuffer.append(TEXT_1916);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1917);
    } else {
    stringBuffer.append(TEXT_1918);
    }
    stringBuffer.append(TEXT_1919);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1920);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1921);
    }
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1925);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1929);
    }
    stringBuffer.append(TEXT_1930);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1931);
    } else {
    stringBuffer.append(TEXT_1932);
    }
    stringBuffer.append(TEXT_1933);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1934);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1935);
    }
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1937);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1939);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1941);
    } else {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1944);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1947);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1952);
    } else {
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1955);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1959);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1963);
    } else {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1965);
    }
    }
    stringBuffer.append(TEXT_1966);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1967);
    } else {
    stringBuffer.append(TEXT_1968);
    }
    stringBuffer.append(TEXT_1969);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1970);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1971);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1972);
    }
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1974);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1976);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1980);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1983);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1988);
    } else {
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1991);
    }
    } else {
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1996);
    }
    stringBuffer.append(TEXT_1997);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2001);
    } else {
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2003);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2005);
    }
    stringBuffer.append(TEXT_2006);
    }
    stringBuffer.append(TEXT_2007);
    }
    stringBuffer.append(TEXT_2008);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2009);
    } else {
    stringBuffer.append(TEXT_2010);
    }
    stringBuffer.append(TEXT_2011);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2012);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2013);
    }
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2015);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2017);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2020);
    } else {
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2022);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2024);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2027);
    } else {
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2030);
    }
    stringBuffer.append(TEXT_2031);
    }
    stringBuffer.append(TEXT_2032);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2033);
    } else {
    stringBuffer.append(TEXT_2034);
    }
    stringBuffer.append(TEXT_2035);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(TEXT_2037);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2038);
    }
    stringBuffer.append(TEXT_2039);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2041);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2043);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2046);
    } else {
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2049);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2052);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2059);
    } else {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2061);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2063);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2065);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2067);
    } else {
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2069);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2071);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2073);
    } else {
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2075);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2079);
    } else {
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2082);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2086);
    } else {
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2089);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2094);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2104);
    } else {
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2109);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2110);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2111);
    } else {
    stringBuffer.append(TEXT_2112);
    }
    stringBuffer.append(TEXT_2113);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2114);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2115);
    }
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2117);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2120);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2123);
    }
    stringBuffer.append(TEXT_2124);
    }
    stringBuffer.append(TEXT_2125);
    }
    stringBuffer.append(TEXT_2126);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2127);
    }
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2129);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2131);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2134);
    }
    stringBuffer.append(TEXT_2135);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2138);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2141);
    }
    stringBuffer.append(TEXT_2142);
    }
    stringBuffer.append(TEXT_2143);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2144);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2145);
    }
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2147);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2148);
    }
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2150);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2151);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2152);
    }
    stringBuffer.append(TEXT_2153);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2156);
    }
    stringBuffer.append(TEXT_2157);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2158);
    }
    stringBuffer.append(TEXT_2159);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2162);
    }
    stringBuffer.append(TEXT_2163);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2164);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2165);
    }
    stringBuffer.append(TEXT_2166);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2174);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2177);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2178);
    }
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2182);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2185);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2186);
    }
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2191);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2194);
    } else {
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2196);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2197);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2200);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2202);
    } else {
    stringBuffer.append(TEXT_2203);
    }
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2205);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2206);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2208);
    }
    stringBuffer.append(TEXT_2209);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2210);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2213);
    } else {
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2215);
    }
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2217);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2219);
    } else {
    stringBuffer.append(TEXT_2220);
    }
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2224);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2225);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2227);
    }
    stringBuffer.append(TEXT_2228);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2229);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2232);
    } else {
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2234);
    }
    stringBuffer.append(TEXT_2235);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2236);
    }
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2240);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genClass.getGenPackage()) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2243);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2247);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2252);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2253);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2254);
    }
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2259);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2262);
    } else {
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2265);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2269);
    }
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2273);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2277);
    }
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2281);
    } else {
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2288);
    }
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2292);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2296);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2300);
    } else {
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2307);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2310);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2312);
    } else {
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2315);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2320);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2322);
    }
    }
    }
    stringBuffer.append(TEXT_2323);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2324);
    }
    }
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2326);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2328);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2330);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2331);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2333);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2334);
    }
    } else {
    stringBuffer.append(TEXT_2335);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2337);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2338);
    }
    }
    } else {
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2340);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2341);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2343);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2344);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2346);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2347);
    }
    } else {
    stringBuffer.append(TEXT_2348);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2350);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2351);
    }
    }
    } else {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2353);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2354);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2356);
    } else {
    stringBuffer.append(TEXT_2357);
    }
    }
    stringBuffer.append(TEXT_2358);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2359);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2360);
    }
    }
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2363);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2370);
    } else {
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2372);
    }
    } else {
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2374);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2375);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2376);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2378);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2379);
    } else {
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2381);
    }
    }
    stringBuffer.append(TEXT_2382);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2383);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2384);
    }
    }
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2387);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2388);
    } else {
    stringBuffer.append(TEXT_2389);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2391);
    }
    stringBuffer.append(TEXT_2392);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2393);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2394);
    }
    }
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2400);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2401);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2406);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2408);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2410);
    }
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2412);
    } else {
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2414);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2416);
    }
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2418);
    }
    }
    stringBuffer.append(TEXT_2419);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2420);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2421);
    }
    }
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2425);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2426);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2431);
    }
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2433);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2435);
    }
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2437);
    }
    stringBuffer.append(TEXT_2438);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2445);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2452);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2453);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2458);
    } else {
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2463);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2467);
    } else {
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2471);
    }
    }
    stringBuffer.append(TEXT_2472);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2476);
    }
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2480);
    } else {
    stringBuffer.append(TEXT_2481);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2484);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2485);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2486);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2487);
    }
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2490);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2491);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2495);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2498);
    } else {
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2501);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2503);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2511);
    index++;}
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2515);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2516);
    }
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2520);
    }
    stringBuffer.append(TEXT_2521);
    } else {
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2524);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2525);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2526);
    }
    } else {
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2528);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2532);
    } else {
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2536);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2538);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2539);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2544);
    } else {
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2549);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2553);
    } else {
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2557);
    }
    }
    stringBuffer.append(TEXT_2558);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2562);
    }
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2565);
    } else {
    stringBuffer.append(TEXT_2566);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2570);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2571);
    }
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2575);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2577);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2578);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2579);
    } else {
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2584);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2587);
    } else {
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2590);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2592);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2600);
    index++;}
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2604);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2605);
    }
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2609);
    }
    stringBuffer.append(TEXT_2610);
    } else {
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2613);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2614);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2615);
    }
    } else {
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2617);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2621);
    } else {
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2625);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2627);
    }
    stringBuffer.append(TEXT_2628);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2633);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2637);
    }
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2641);
    } else {
    stringBuffer.append(TEXT_2642);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2646);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2647);
    }
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2653);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2654);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2655);
    }
    stringBuffer.append(TEXT_2656);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2661);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2665);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2666);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2668);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2670);
    }
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2674);
    } else {
    stringBuffer.append(TEXT_2675);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2679);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2681);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2682);
    }
    stringBuffer.append(TEXT_2683);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2684);
    }
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2688);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2690);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2691);
    }
    stringBuffer.append(TEXT_2692);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2697);
    } else {
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2704);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2707);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2714);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2715);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2718);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2719);
    }
    }
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2724);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2726);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2727);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2729);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2731);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2737);
    } else {
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2742);
    }
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2744);
    index++;}
    stringBuffer.append(TEXT_2745);
    } else {
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2752);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2760);
    } else {
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2765);
    }
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2767);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2775);
    } else {
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2780);
    }
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2782);
    index++;}
    }
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2784);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2785);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2786);
    }
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2789);
    }
    stringBuffer.append(TEXT_2790);
    } else {
    stringBuffer.append(TEXT_2791);
    }
    stringBuffer.append(TEXT_2792);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2794);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2795);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2797);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2800);
    } else {
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2803);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2806);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2813);
    } else {
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2815);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2817);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2819);
    } else {
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2821);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2822);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2823);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2825);
    } else {
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2827);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2831);
    } else {
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2834);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2838);
    } else {
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2841);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2846);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2852);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2856);
    } else {
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2860);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2861);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2863);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2866);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2868);
    }
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2873);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2875);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2878);
    } else {
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2880);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2885);
    } else {
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2889);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2892);
    } else {
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2895);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2896);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2897);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2898);
    }
    }
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2903);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2906);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2907);
    } else {
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2910);
    }
    }
    stringBuffer.append(TEXT_2911);
    }
    }
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2913);
    return stringBuffer.toString();
  }
}
