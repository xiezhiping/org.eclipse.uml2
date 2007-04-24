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
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_4 = "Id";
  protected final String TEXT_5 = NL + " */";
  protected final String TEXT_6 = NL + "package ";
  protected final String TEXT_7 = ";";
  protected final String TEXT_8 = NL + "package ";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_13 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_14 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_15 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_16 = NL + " *";
  protected final String TEXT_17 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_18 = NL + " *   <li>{@link ";
  protected final String TEXT_19 = "#";
  protected final String TEXT_20 = " <em>";
  protected final String TEXT_21 = "</em>}</li>";
  protected final String TEXT_22 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_23 = NL + " *";
  protected final String TEXT_24 = NL + " * @see ";
  protected final String TEXT_25 = "#get";
  protected final String TEXT_26 = "()";
  protected final String TEXT_27 = NL + " * @model ";
  protected final String TEXT_28 = NL + " *        ";
  protected final String TEXT_29 = NL + " * @model";
  protected final String TEXT_30 = NL + " * @extends ";
  protected final String TEXT_31 = NL + " * @generated" + NL + " */";
  protected final String TEXT_32 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_33 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_34 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_35 = NL + " *   <li>{@link ";
  protected final String TEXT_36 = "#";
  protected final String TEXT_37 = " <em>";
  protected final String TEXT_38 = "</em>}</li>";
  protected final String TEXT_39 = NL + " * </ul>";
  protected final String TEXT_40 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_41 = NL + "public";
  protected final String TEXT_42 = " abstract";
  protected final String TEXT_43 = " class ";
  protected final String TEXT_44 = NL + "public interface ";
  protected final String TEXT_45 = NL + "{";
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_47 = " copyright = \"";
  protected final String TEXT_48 = "\";";
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_51 = " mofDriverNumber = \"";
  protected final String TEXT_52 = "\";";
  protected final String TEXT_53 = NL;
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_56 = ";" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_58 = ";" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_60 = " = 0;" + NL;
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_62 = "() <em>";
  protected final String TEXT_63 = "</em>}' ";
  protected final String TEXT_64 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_65 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_66 = " ";
  protected final String TEXT_67 = ";" + NL;
  protected final String TEXT_68 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_69 = "() <em>";
  protected final String TEXT_70 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_71 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_72 = "[] ";
  protected final String TEXT_73 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_74 = " [0];" + NL;
  protected final String TEXT_75 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_76 = "() <em>";
  protected final String TEXT_77 = "</em>}' ";
  protected final String TEXT_78 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_79 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_80 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_81 = NL + "\tprotected static final ";
  protected final String TEXT_82 = " ";
  protected final String TEXT_83 = "; // TODO The default value literal \"";
  protected final String TEXT_84 = "\" is not valid.";
  protected final String TEXT_85 = " = ";
  protected final String TEXT_86 = ";";
  protected final String TEXT_87 = NL;
  protected final String TEXT_88 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_89 = " = 0;" + NL;
  protected final String TEXT_90 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_91 = "() <em>";
  protected final String TEXT_92 = "</em>}' ";
  protected final String TEXT_93 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_94 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_95 = "_EFLAG = 1 ";
  protected final String TEXT_96 = ";" + NL;
  protected final String TEXT_97 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_98 = "() <em>";
  protected final String TEXT_99 = "</em>}' ";
  protected final String TEXT_100 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_101 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_102 = " ";
  protected final String TEXT_103 = " = ";
  protected final String TEXT_104 = ";" + NL;
  protected final String TEXT_105 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_106 = " = 0;" + NL;
  protected final String TEXT_107 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_108 = " ";
  protected final String TEXT_109 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_110 = "_ESETFLAG = 1 ";
  protected final String TEXT_111 = ";" + NL;
  protected final String TEXT_112 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_113 = " ";
  protected final String TEXT_114 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_115 = "ESet;" + NL;
  protected final String TEXT_116 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_117 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_118 = NL + "\t\t";
  protected final String TEXT_119 = " |= ";
  protected final String TEXT_120 = "_EFLAG;";
  protected final String TEXT_121 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_122 = NL + "\t@Override";
  protected final String TEXT_123 = NL + "\tprotected ";
  protected final String TEXT_124 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_125 = ";" + NL + "\t}" + NL;
  protected final String TEXT_126 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_127 = NL + "\t@Override";
  protected final String TEXT_128 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_129 = ";" + NL + "\t}" + NL;
  protected final String TEXT_130 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_131 = NL + "\t";
  protected final String TEXT_132 = "[] ";
  protected final String TEXT_133 = "();" + NL;
  protected final String TEXT_134 = NL + "\tpublic ";
  protected final String TEXT_135 = "[] ";
  protected final String TEXT_136 = "()" + NL + "\t{";
  protected final String TEXT_137 = NL + "\t\t";
  protected final String TEXT_138 = " list = (";
  protected final String TEXT_139 = ")";
  protected final String TEXT_140 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_141 = "_EEMPTY_ARRAY;";
  protected final String TEXT_142 = NL + "\t\tif (";
  protected final String TEXT_143 = " == null || ";
  protected final String TEXT_144 = ".isEmpty()) return ";
  protected final String TEXT_145 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_146 = " list = (";
  protected final String TEXT_147 = ")";
  protected final String TEXT_148 = ";";
  protected final String TEXT_149 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_150 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_151 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_152 = NL + "\t";
  protected final String TEXT_153 = " get";
  protected final String TEXT_154 = "(int index);" + NL;
  protected final String TEXT_155 = NL + "\tpublic ";
  protected final String TEXT_156 = " get";
  protected final String TEXT_157 = "(int index)" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_158 = ")";
  protected final String TEXT_159 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_160 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_161 = NL + "\tint get";
  protected final String TEXT_162 = "Length();" + NL;
  protected final String TEXT_163 = NL + "\tpublic int get";
  protected final String TEXT_164 = "Length()" + NL + "\t{";
  protected final String TEXT_165 = NL + "\t\treturn ";
  protected final String TEXT_166 = "().size();";
  protected final String TEXT_167 = NL + "\t\treturn ";
  protected final String TEXT_168 = " == null ? 0 : ";
  protected final String TEXT_169 = ".size();";
  protected final String TEXT_170 = NL + "\t}" + NL;
  protected final String TEXT_171 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_172 = NL + "\tvoid set";
  protected final String TEXT_173 = "(";
  protected final String TEXT_174 = "[] new";
  protected final String TEXT_175 = ");" + NL;
  protected final String TEXT_176 = NL + "\tpublic void set";
  protected final String TEXT_177 = "(";
  protected final String TEXT_178 = "[] new";
  protected final String TEXT_179 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_180 = ")";
  protected final String TEXT_181 = "()).setData(new";
  protected final String TEXT_182 = ".length, new";
  protected final String TEXT_183 = ");" + NL + "\t}" + NL;
  protected final String TEXT_184 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_185 = NL + "\tvoid set";
  protected final String TEXT_186 = "(int index, ";
  protected final String TEXT_187 = " element);" + NL;
  protected final String TEXT_188 = NL + "\tpublic void set";
  protected final String TEXT_189 = "(int index, ";
  protected final String TEXT_190 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_191 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_192 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_193 = "</b></em>' ";
  protected final String TEXT_194 = ".";
  protected final String TEXT_195 = NL + "\t * The key is of type ";
  protected final String TEXT_196 = "list of {@link ";
  protected final String TEXT_197 = "}";
  protected final String TEXT_198 = "{@link ";
  protected final String TEXT_199 = "}";
  protected final String TEXT_200 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_201 = "list of {@link ";
  protected final String TEXT_202 = "}";
  protected final String TEXT_203 = "{@link ";
  protected final String TEXT_204 = "}";
  protected final String TEXT_205 = ",";
  protected final String TEXT_206 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_207 = "}.";
  protected final String TEXT_208 = NL + "\t * The default value is <code>";
  protected final String TEXT_209 = "</code>.";
  protected final String TEXT_210 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_211 = "}.";
  protected final String TEXT_212 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_213 = "#";
  protected final String TEXT_214 = " <em>";
  protected final String TEXT_215 = "</em>}'.";
  protected final String TEXT_216 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_217 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_218 = "</em>' ";
  protected final String TEXT_219 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_220 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_221 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_222 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_223 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_224 = "</em>' ";
  protected final String TEXT_225 = ".";
  protected final String TEXT_226 = NL + "\t * @see ";
  protected final String TEXT_227 = NL + "\t * @see #isSet";
  protected final String TEXT_228 = "()";
  protected final String TEXT_229 = NL + "\t * @see #unset";
  protected final String TEXT_230 = "()";
  protected final String TEXT_231 = NL + "\t * @see #set";
  protected final String TEXT_232 = "(";
  protected final String TEXT_233 = ")";
  protected final String TEXT_234 = NL + "\t * @see ";
  protected final String TEXT_235 = "#get";
  protected final String TEXT_236 = "()";
  protected final String TEXT_237 = NL + "\t * @see ";
  protected final String TEXT_238 = "#";
  protected final String TEXT_239 = NL + "\t * @model ";
  protected final String TEXT_240 = NL + "\t *        ";
  protected final String TEXT_241 = NL + "\t * @model";
  protected final String TEXT_242 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_243 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_244 = NL;
  protected final String TEXT_245 = NL + "\t@Override";
  protected final String TEXT_246 = NL + "\t";
  protected final String TEXT_247 = " ";
  protected final String TEXT_248 = "();" + NL;
  protected final String TEXT_249 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_250 = NL + "\tpublic ";
  protected final String TEXT_251 = " ";
  protected final String TEXT_252 = "()" + NL + "\t{";
  protected final String TEXT_253 = NL + "\t\treturn ";
  protected final String TEXT_254 = "(";
  protected final String TEXT_255 = "(";
  protected final String TEXT_256 = ")eGet(";
  protected final String TEXT_257 = ", true)";
  protected final String TEXT_258 = ").";
  protected final String TEXT_259 = "()";
  protected final String TEXT_260 = ";";
  protected final String TEXT_261 = NL + "\t\t";
  protected final String TEXT_262 = " ";
  protected final String TEXT_263 = " = (";
  protected final String TEXT_264 = ")eVirtualGet(";
  protected final String TEXT_265 = ");";
  protected final String TEXT_266 = NL + "\t\tif (";
  protected final String TEXT_267 = " == null)" + NL + "\t\t{";
  protected final String TEXT_268 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_269 = ", ";
  protected final String TEXT_270 = " = new ";
  protected final String TEXT_271 = ");";
  protected final String TEXT_272 = NL + "\t\t\t";
  protected final String TEXT_273 = " = new ";
  protected final String TEXT_274 = ";";
  protected final String TEXT_275 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_276 = ";";
  protected final String TEXT_277 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_278 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_279 = ")eContainer();";
  protected final String TEXT_280 = NL + "\t\t";
  protected final String TEXT_281 = " ";
  protected final String TEXT_282 = " = (";
  protected final String TEXT_283 = ")eVirtualGet(";
  protected final String TEXT_284 = ", ";
  protected final String TEXT_285 = ");";
  protected final String TEXT_286 = NL + "\t\tif (";
  protected final String TEXT_287 = " != null && ";
  protected final String TEXT_288 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_289 = " old";
  protected final String TEXT_290 = " = (";
  protected final String TEXT_291 = ")";
  protected final String TEXT_292 = ";" + NL + "\t\t\t";
  protected final String TEXT_293 = " = ";
  protected final String TEXT_294 = "eResolveProxy(old";
  protected final String TEXT_295 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_296 = " != old";
  protected final String TEXT_297 = ")" + NL + "\t\t\t{";
  protected final String TEXT_298 = NL + "\t\t\t\t";
  protected final String TEXT_299 = " new";
  protected final String TEXT_300 = " = (";
  protected final String TEXT_301 = ")";
  protected final String TEXT_302 = ";";
  protected final String TEXT_303 = NL + "\t\t\t\t";
  protected final String TEXT_304 = " msgs = old";
  protected final String TEXT_305 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_306 = ", null, null);";
  protected final String TEXT_307 = NL + "\t\t\t\t";
  protected final String TEXT_308 = " msgs =  old";
  protected final String TEXT_309 = ".eInverseRemove(this, ";
  protected final String TEXT_310 = ", ";
  protected final String TEXT_311 = ".class, null);";
  protected final String TEXT_312 = NL + "\t\t\t\tif (new";
  protected final String TEXT_313 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_314 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_315 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_316 = ", null, msgs);";
  protected final String TEXT_317 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_318 = ".eInverseAdd(this, ";
  protected final String TEXT_319 = ", ";
  protected final String TEXT_320 = ".class, msgs);";
  protected final String TEXT_321 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_322 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_323 = ", ";
  protected final String TEXT_324 = ");";
  protected final String TEXT_325 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_326 = "(this, ";
  protected final String TEXT_327 = ".RESOLVE, ";
  protected final String TEXT_328 = ", old";
  protected final String TEXT_329 = ", ";
  protected final String TEXT_330 = "));";
  protected final String TEXT_331 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_332 = NL + "\t\treturn (";
  protected final String TEXT_333 = ")eVirtualGet(";
  protected final String TEXT_334 = ", ";
  protected final String TEXT_335 = ");";
  protected final String TEXT_336 = NL + "\t\treturn (";
  protected final String TEXT_337 = " & ";
  protected final String TEXT_338 = "_EFLAG) != 0;";
  protected final String TEXT_339 = NL + "\t\treturn ";
  protected final String TEXT_340 = ";";
  protected final String TEXT_341 = NL + "\t\t";
  protected final String TEXT_342 = " ";
  protected final String TEXT_343 = " = basicGet";
  protected final String TEXT_344 = "();" + NL + "\t\treturn ";
  protected final String TEXT_345 = " != null && ";
  protected final String TEXT_346 = ".eIsProxy() ? ";
  protected final String TEXT_347 = "eResolveProxy((";
  protected final String TEXT_348 = ")";
  protected final String TEXT_349 = ") : ";
  protected final String TEXT_350 = ";";
  protected final String TEXT_351 = NL + "\t\treturn new ";
  protected final String TEXT_352 = "((";
  protected final String TEXT_353 = ".Internal)((";
  protected final String TEXT_354 = ".Internal.Wrapper)get";
  protected final String TEXT_355 = "()).featureMap().";
  protected final String TEXT_356 = "list(";
  protected final String TEXT_357 = "));";
  protected final String TEXT_358 = NL + "\t\treturn (";
  protected final String TEXT_359 = ")get";
  protected final String TEXT_360 = "().";
  protected final String TEXT_361 = "list(";
  protected final String TEXT_362 = ");";
  protected final String TEXT_363 = NL + "\t\treturn ((";
  protected final String TEXT_364 = ".Internal.Wrapper)get";
  protected final String TEXT_365 = "()).featureMap().list(";
  protected final String TEXT_366 = ");";
  protected final String TEXT_367 = NL + "\t\treturn get";
  protected final String TEXT_368 = "().list(";
  protected final String TEXT_369 = ");";
  protected final String TEXT_370 = NL + "\t\treturn ";
  protected final String TEXT_371 = "(";
  protected final String TEXT_372 = "(";
  protected final String TEXT_373 = ")";
  protected final String TEXT_374 = "((";
  protected final String TEXT_375 = ".Internal.Wrapper)get";
  protected final String TEXT_376 = "()).featureMap().get(";
  protected final String TEXT_377 = ", true)";
  protected final String TEXT_378 = ").";
  protected final String TEXT_379 = "()";
  protected final String TEXT_380 = ";";
  protected final String TEXT_381 = NL + "\t\treturn ";
  protected final String TEXT_382 = "(";
  protected final String TEXT_383 = "(";
  protected final String TEXT_384 = ")";
  protected final String TEXT_385 = "get";
  protected final String TEXT_386 = "().get(";
  protected final String TEXT_387 = ", true)";
  protected final String TEXT_388 = ").";
  protected final String TEXT_389 = "()";
  protected final String TEXT_390 = ";";
  protected final String TEXT_391 = NL;
  protected final String TEXT_392 = NL + "\t\t";
  protected final String TEXT_393 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_394 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_395 = NL + "\t\t\t";
  protected final String TEXT_396 = " result = (";
  protected final String TEXT_397 = ") cache.get(";
  protected final String TEXT_398 = "eResource(), ";
  protected final String TEXT_399 = "this, ";
  protected final String TEXT_400 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_401 = "eResource(), ";
  protected final String TEXT_402 = "this, ";
  protected final String TEXT_403 = ", result = ";
  protected final String TEXT_404 = "new ";
  protected final String TEXT_405 = "(";
  protected final String TEXT_406 = ".";
  protected final String TEXT_407 = "(this)";
  protected final String TEXT_408 = ")";
  protected final String TEXT_409 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_410 = ".";
  protected final String TEXT_411 = "()";
  protected final String TEXT_412 = ";" + NL + "\t\t}";
  protected final String TEXT_413 = NL + "\t\treturn ";
  protected final String TEXT_414 = ".";
  protected final String TEXT_415 = "(this);";
  protected final String TEXT_416 = NL + "\t\t";
  protected final String TEXT_417 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_418 = " eResource = eResource();";
  protected final String TEXT_419 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_420 = NL + "\t\t\t";
  protected final String TEXT_421 = " ";
  protected final String TEXT_422 = " = (";
  protected final String TEXT_423 = ") cache.get(eResource, this, ";
  protected final String TEXT_424 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_425 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_426 = ", ";
  protected final String TEXT_427 = " = new ";
  protected final String TEXT_428 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_429 = ";" + NL + "\t\t}";
  protected final String TEXT_430 = NL + "\t\treturn new ";
  protected final String TEXT_431 = ";";
  protected final String TEXT_432 = NL + "\t\t";
  protected final String TEXT_433 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_434 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_435 = " method = getClass().getMethod(\"";
  protected final String TEXT_436 = "\", null);";
  protected final String TEXT_437 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_438 = NL + "\t\t\t\t";
  protected final String TEXT_439 = " ";
  protected final String TEXT_440 = " = (";
  protected final String TEXT_441 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_442 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_443 = " union = ";
  protected final String TEXT_444 = "Helper(new ";
  protected final String TEXT_445 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_446 = " = new ";
  protected final String TEXT_447 = "(this, ";
  protected final String TEXT_448 = "null";
  protected final String TEXT_449 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_450 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_451 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_452 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_453 = NL + "\t\t\t";
  protected final String TEXT_454 = " ";
  protected final String TEXT_455 = " = (";
  protected final String TEXT_456 = ") cache.get(eResource(), this, ";
  protected final String TEXT_457 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_458 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_459 = " union = ";
  protected final String TEXT_460 = "Helper(new ";
  protected final String TEXT_461 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_462 = ", ";
  protected final String TEXT_463 = " = new ";
  protected final String TEXT_464 = "(this, ";
  protected final String TEXT_465 = "null";
  protected final String TEXT_466 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_467 = ";";
  protected final String TEXT_468 = NL + "\t\t}";
  protected final String TEXT_469 = NL + "\t\t";
  protected final String TEXT_470 = " union = ";
  protected final String TEXT_471 = "Helper(new ";
  protected final String TEXT_472 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_473 = "(this, ";
  protected final String TEXT_474 = "null";
  protected final String TEXT_475 = ", union.size(), union.toArray());";
  protected final String TEXT_476 = NL + "\t\tif (isSet";
  protected final String TEXT_477 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_478 = "();" + NL + "\t\t}";
  protected final String TEXT_479 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_480 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_481 = "();" + NL + "\t\t}";
  protected final String TEXT_482 = NL + "\t\t";
  protected final String TEXT_483 = " ";
  protected final String TEXT_484 = " = ";
  protected final String TEXT_485 = "();" + NL + "\t\tif (";
  protected final String TEXT_486 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_487 = ";" + NL + "\t\t}";
  protected final String TEXT_488 = NL + "\t\treturn ";
  protected final String TEXT_489 = "super.";
  protected final String TEXT_490 = "()";
  protected final String TEXT_491 = "null";
  protected final String TEXT_492 = ";";
  protected final String TEXT_493 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_494 = "' ";
  protected final String TEXT_495 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_496 = NL + "\t}" + NL;
  protected final String TEXT_497 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_498 = NL;
  protected final String TEXT_499 = NL + "\t@Override";
  protected final String TEXT_500 = NL + "\tpublic ";
  protected final String TEXT_501 = " basicGet";
  protected final String TEXT_502 = "()" + NL + "\t{";
  protected final String TEXT_503 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_504 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_505 = ")eInternalContainer();";
  protected final String TEXT_506 = NL + "\t\treturn (";
  protected final String TEXT_507 = ")eVirtualGet(";
  protected final String TEXT_508 = ");";
  protected final String TEXT_509 = NL + "\t\treturn ";
  protected final String TEXT_510 = ";";
  protected final String TEXT_511 = NL + "\t\treturn (";
  protected final String TEXT_512 = ")((";
  protected final String TEXT_513 = ".Internal.Wrapper)get";
  protected final String TEXT_514 = "()).featureMap().get(";
  protected final String TEXT_515 = ", false);";
  protected final String TEXT_516 = NL + "\t\treturn (";
  protected final String TEXT_517 = ")get";
  protected final String TEXT_518 = "().get(";
  protected final String TEXT_519 = ", false);";
  protected final String TEXT_520 = NL;
  protected final String TEXT_521 = NL + "\t\treturn ";
  protected final String TEXT_522 = ".";
  protected final String TEXT_523 = "(this);";
  protected final String TEXT_524 = NL + "\t\tif (isSet";
  protected final String TEXT_525 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_526 = "basicGet";
  protected final String TEXT_527 = "();" + NL + "\t\t}";
  protected final String TEXT_528 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_529 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_530 = "basicGet";
  protected final String TEXT_531 = "();" + NL + "\t\t}";
  protected final String TEXT_532 = NL + "\t\t";
  protected final String TEXT_533 = " ";
  protected final String TEXT_534 = " = ";
  protected final String TEXT_535 = "basicGet";
  protected final String TEXT_536 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_537 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_538 = ";" + NL + "\t\t}";
  protected final String TEXT_539 = NL + "\t\treturn ";
  protected final String TEXT_540 = "super.basicGet";
  protected final String TEXT_541 = "()";
  protected final String TEXT_542 = "null";
  protected final String TEXT_543 = ";";
  protected final String TEXT_544 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_545 = "' ";
  protected final String TEXT_546 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_547 = NL + "\t}" + NL;
  protected final String TEXT_548 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_549 = NL;
  protected final String TEXT_550 = NL + "\t@Override";
  protected final String TEXT_551 = NL + "\tpublic ";
  protected final String TEXT_552 = " basicSet";
  protected final String TEXT_553 = "(";
  protected final String TEXT_554 = " new";
  protected final String TEXT_555 = ", ";
  protected final String TEXT_556 = " msgs)" + NL + "\t{";
  protected final String TEXT_557 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_558 = ")new";
  protected final String TEXT_559 = ", ";
  protected final String TEXT_560 = ", msgs);";
  protected final String TEXT_561 = NL;
  protected final String TEXT_562 = NL + "\t\t";
  protected final String TEXT_563 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_564 = NL + "\t\t\t";
  protected final String TEXT_565 = " ";
  protected final String TEXT_566 = " = ";
  protected final String TEXT_567 = "();";
  protected final String TEXT_568 = NL + "\t\t\tObject ";
  protected final String TEXT_569 = " = eVirtualGet(";
  protected final String TEXT_570 = ");";
  protected final String TEXT_571 = NL + "\t\t\tif (";
  protected final String TEXT_572 = " != null && ";
  protected final String TEXT_573 = " != new";
  protected final String TEXT_574 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_575 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_576 = NL + "\t\t\tif (new";
  protected final String TEXT_577 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_578 = NL + "\t\t\t\t";
  protected final String TEXT_579 = " ";
  protected final String TEXT_580 = " = ";
  protected final String TEXT_581 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_582 = ".contains(new";
  protected final String TEXT_583 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_584 = ".add(new";
  protected final String TEXT_585 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_586 = NL + "\t\t\t\t";
  protected final String TEXT_587 = " ";
  protected final String TEXT_588 = " = ";
  protected final String TEXT_589 = "();";
  protected final String TEXT_590 = NL + "\t\t\t\tObject ";
  protected final String TEXT_591 = " = eVirtualGet(";
  protected final String TEXT_592 = ");";
  protected final String TEXT_593 = NL + "\t\t\t\tif (new";
  protected final String TEXT_594 = " != ";
  protected final String TEXT_595 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_596 = "(new";
  protected final String TEXT_597 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_598 = NL + "\t\t\t}";
  protected final String TEXT_599 = NL + "\t\t}";
  protected final String TEXT_600 = NL + "\t\treturn msgs;";
  protected final String TEXT_601 = NL + "\t\tObject old";
  protected final String TEXT_602 = " = eVirtualSet(";
  protected final String TEXT_603 = ", new";
  protected final String TEXT_604 = ");";
  protected final String TEXT_605 = NL + "\t\t";
  protected final String TEXT_606 = " old";
  protected final String TEXT_607 = " = ";
  protected final String TEXT_608 = ";" + NL + "\t\t";
  protected final String TEXT_609 = " = new";
  protected final String TEXT_610 = ";";
  protected final String TEXT_611 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_612 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_613 = NL + "\t\tboolean old";
  protected final String TEXT_614 = "ESet = (";
  protected final String TEXT_615 = " & ";
  protected final String TEXT_616 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_617 = " |= ";
  protected final String TEXT_618 = "_ESETFLAG;";
  protected final String TEXT_619 = NL + "\t\tboolean old";
  protected final String TEXT_620 = "ESet = ";
  protected final String TEXT_621 = "ESet;" + NL + "\t\t";
  protected final String TEXT_622 = "ESet = true;";
  protected final String TEXT_623 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_624 = NL + "\t\t\t";
  protected final String TEXT_625 = " notification = new ";
  protected final String TEXT_626 = "(this, ";
  protected final String TEXT_627 = ".SET, ";
  protected final String TEXT_628 = ", ";
  protected final String TEXT_629 = "isSetChange ? null : old";
  protected final String TEXT_630 = "old";
  protected final String TEXT_631 = ", new";
  protected final String TEXT_632 = ", ";
  protected final String TEXT_633 = "isSetChange";
  protected final String TEXT_634 = "!old";
  protected final String TEXT_635 = "ESet";
  protected final String TEXT_636 = ");";
  protected final String TEXT_637 = NL + "\t\t\t";
  protected final String TEXT_638 = " notification = new ";
  protected final String TEXT_639 = "(this, ";
  protected final String TEXT_640 = ".SET, ";
  protected final String TEXT_641 = ", ";
  protected final String TEXT_642 = "old";
  protected final String TEXT_643 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_644 = "old";
  protected final String TEXT_645 = ", new";
  protected final String TEXT_646 = ");";
  protected final String TEXT_647 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_648 = NL;
  protected final String TEXT_649 = NL + "\t\t";
  protected final String TEXT_650 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_651 = NL + "\t\t\t";
  protected final String TEXT_652 = " ";
  protected final String TEXT_653 = " = ";
  protected final String TEXT_654 = "();";
  protected final String TEXT_655 = NL + "\t\t\tObject ";
  protected final String TEXT_656 = " = eVirtualGet(";
  protected final String TEXT_657 = ");";
  protected final String TEXT_658 = NL + "\t\t\tif (";
  protected final String TEXT_659 = " != null && ";
  protected final String TEXT_660 = " != new";
  protected final String TEXT_661 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_662 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_663 = NL + "\t\t\tif (new";
  protected final String TEXT_664 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_665 = NL + "\t\t\t\t";
  protected final String TEXT_666 = " ";
  protected final String TEXT_667 = " = ";
  protected final String TEXT_668 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_669 = ".contains(new";
  protected final String TEXT_670 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_671 = ".add(new";
  protected final String TEXT_672 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_673 = NL + "\t\t\t\t";
  protected final String TEXT_674 = " ";
  protected final String TEXT_675 = " = ";
  protected final String TEXT_676 = "();";
  protected final String TEXT_677 = NL + "\t\t\t\tObject ";
  protected final String TEXT_678 = " = eVirtualGet(";
  protected final String TEXT_679 = ");";
  protected final String TEXT_680 = NL + "\t\t\t\tif (new";
  protected final String TEXT_681 = " != ";
  protected final String TEXT_682 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_683 = "(new";
  protected final String TEXT_684 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_685 = NL + "\t\t\t}";
  protected final String TEXT_686 = NL + "\t\t}";
  protected final String TEXT_687 = NL + "\t\treturn msgs;";
  protected final String TEXT_688 = NL + "\t\treturn ((";
  protected final String TEXT_689 = ".Internal)((";
  protected final String TEXT_690 = ".Internal.Wrapper)get";
  protected final String TEXT_691 = "()).featureMap()).basicAdd(";
  protected final String TEXT_692 = ", new";
  protected final String TEXT_693 = ", msgs);";
  protected final String TEXT_694 = NL + "\t\treturn ((";
  protected final String TEXT_695 = ".Internal)get";
  protected final String TEXT_696 = "()).basicAdd(";
  protected final String TEXT_697 = ", new";
  protected final String TEXT_698 = ", msgs);";
  protected final String TEXT_699 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_700 = "' ";
  protected final String TEXT_701 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_702 = NL + "\t}" + NL;
  protected final String TEXT_703 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_704 = "#";
  protected final String TEXT_705 = " <em>";
  protected final String TEXT_706 = "</em>}' ";
  protected final String TEXT_707 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_708 = "</em>' ";
  protected final String TEXT_709 = ".";
  protected final String TEXT_710 = NL + "\t * @see ";
  protected final String TEXT_711 = NL + "\t * @see #isSet";
  protected final String TEXT_712 = "()";
  protected final String TEXT_713 = NL + "\t * @see #unset";
  protected final String TEXT_714 = "()";
  protected final String TEXT_715 = NL + "\t * @see #";
  protected final String TEXT_716 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_717 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_718 = NL;
  protected final String TEXT_719 = NL + "\t@Override";
  protected final String TEXT_720 = NL + "\tvoid set";
  protected final String TEXT_721 = "(";
  protected final String TEXT_722 = " value);" + NL;
  protected final String TEXT_723 = NL + "\tpublic void set";
  protected final String TEXT_724 = "(";
  protected final String TEXT_725 = " new";
  protected final String TEXT_726 = ")" + NL + "\t{";
  protected final String TEXT_727 = NL;
  protected final String TEXT_728 = NL + "\t\tnew";
  protected final String TEXT_729 = " = new";
  protected final String TEXT_730 = " == null ? ";
  protected final String TEXT_731 = " : new";
  protected final String TEXT_732 = ";";
  protected final String TEXT_733 = NL + "\t\teSet(";
  protected final String TEXT_734 = ", ";
  protected final String TEXT_735 = "new ";
  protected final String TEXT_736 = "(";
  protected final String TEXT_737 = "new";
  protected final String TEXT_738 = ")";
  protected final String TEXT_739 = ");";
  protected final String TEXT_740 = NL + "\t\tif (new";
  protected final String TEXT_741 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_742 = " && new";
  protected final String TEXT_743 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_744 = ".isAncestor(this, ";
  protected final String TEXT_745 = "new";
  protected final String TEXT_746 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_747 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_748 = NL + "\t\t\t";
  protected final String TEXT_749 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_750 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_751 = ")new";
  protected final String TEXT_752 = ").eInverseAdd(this, ";
  protected final String TEXT_753 = ", ";
  protected final String TEXT_754 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_755 = "(";
  protected final String TEXT_756 = "new";
  protected final String TEXT_757 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_758 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_759 = "(this, ";
  protected final String TEXT_760 = ".SET, ";
  protected final String TEXT_761 = ", new";
  protected final String TEXT_762 = ", new";
  protected final String TEXT_763 = "));";
  protected final String TEXT_764 = NL + "\t\t";
  protected final String TEXT_765 = " ";
  protected final String TEXT_766 = " = (";
  protected final String TEXT_767 = ")eVirtualGet(";
  protected final String TEXT_768 = ");";
  protected final String TEXT_769 = NL + "\t\tif (new";
  protected final String TEXT_770 = " != ";
  protected final String TEXT_771 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_772 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_773 = " != null)";
  protected final String TEXT_774 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_775 = ")";
  protected final String TEXT_776 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_777 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_778 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_779 = ")new";
  protected final String TEXT_780 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_781 = ", null, msgs);";
  protected final String TEXT_782 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_783 = ")";
  protected final String TEXT_784 = ").eInverseRemove(this, ";
  protected final String TEXT_785 = ", ";
  protected final String TEXT_786 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_787 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_788 = ")new";
  protected final String TEXT_789 = ").eInverseAdd(this, ";
  protected final String TEXT_790 = ", ";
  protected final String TEXT_791 = ".class, msgs);";
  protected final String TEXT_792 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_793 = "(";
  protected final String TEXT_794 = "new";
  protected final String TEXT_795 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_796 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_797 = NL + "\t\t\tboolean old";
  protected final String TEXT_798 = "ESet = eVirtualIsSet(";
  protected final String TEXT_799 = ");";
  protected final String TEXT_800 = NL + "\t\t\tboolean old";
  protected final String TEXT_801 = "ESet = (";
  protected final String TEXT_802 = " & ";
  protected final String TEXT_803 = "_ESETFLAG) != 0;";
  protected final String TEXT_804 = NL + "\t\t\t";
  protected final String TEXT_805 = " |= ";
  protected final String TEXT_806 = "_ESETFLAG;";
  protected final String TEXT_807 = NL + "\t\t\tboolean old";
  protected final String TEXT_808 = "ESet = ";
  protected final String TEXT_809 = "ESet;";
  protected final String TEXT_810 = NL + "\t\t\t";
  protected final String TEXT_811 = "ESet = true;";
  protected final String TEXT_812 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_813 = "(this, ";
  protected final String TEXT_814 = ".SET, ";
  protected final String TEXT_815 = ", new";
  protected final String TEXT_816 = ", new";
  protected final String TEXT_817 = ", !old";
  protected final String TEXT_818 = "ESet));";
  protected final String TEXT_819 = NL + "\t\t}";
  protected final String TEXT_820 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_821 = "(this, ";
  protected final String TEXT_822 = ".SET, ";
  protected final String TEXT_823 = ", new";
  protected final String TEXT_824 = ", new";
  protected final String TEXT_825 = "));";
  protected final String TEXT_826 = NL + "\t\t";
  protected final String TEXT_827 = " old";
  protected final String TEXT_828 = " = (";
  protected final String TEXT_829 = " & ";
  protected final String TEXT_830 = "_EFLAG) != 0;";
  protected final String TEXT_831 = NL + "\t\tif (new";
  protected final String TEXT_832 = ") ";
  protected final String TEXT_833 = " |= ";
  protected final String TEXT_834 = "_EFLAG; else ";
  protected final String TEXT_835 = " &= ~";
  protected final String TEXT_836 = "_EFLAG;";
  protected final String TEXT_837 = NL + "\t\t";
  protected final String TEXT_838 = " old";
  protected final String TEXT_839 = " = ";
  protected final String TEXT_840 = ";";
  protected final String TEXT_841 = NL + "\t\t";
  protected final String TEXT_842 = " ";
  protected final String TEXT_843 = " = new";
  protected final String TEXT_844 = " == null ? ";
  protected final String TEXT_845 = " : new";
  protected final String TEXT_846 = ";";
  protected final String TEXT_847 = NL + "\t\t";
  protected final String TEXT_848 = " = new";
  protected final String TEXT_849 = " == null ? ";
  protected final String TEXT_850 = " : new";
  protected final String TEXT_851 = ";";
  protected final String TEXT_852 = NL + "\t\t";
  protected final String TEXT_853 = " ";
  protected final String TEXT_854 = " = ";
  protected final String TEXT_855 = "new";
  protected final String TEXT_856 = ";";
  protected final String TEXT_857 = NL + "\t\t";
  protected final String TEXT_858 = " = ";
  protected final String TEXT_859 = "new";
  protected final String TEXT_860 = ";";
  protected final String TEXT_861 = NL + "\t\tObject old";
  protected final String TEXT_862 = " = eVirtualSet(";
  protected final String TEXT_863 = ", ";
  protected final String TEXT_864 = ");";
  protected final String TEXT_865 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_866 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_867 = NL + "\t\tboolean old";
  protected final String TEXT_868 = "ESet = (";
  protected final String TEXT_869 = " & ";
  protected final String TEXT_870 = "_ESETFLAG) != 0;";
  protected final String TEXT_871 = NL + "\t\t";
  protected final String TEXT_872 = " |= ";
  protected final String TEXT_873 = "_ESETFLAG;";
  protected final String TEXT_874 = NL + "\t\tboolean old";
  protected final String TEXT_875 = "ESet = ";
  protected final String TEXT_876 = "ESet;";
  protected final String TEXT_877 = NL + "\t\t";
  protected final String TEXT_878 = "ESet = true;";
  protected final String TEXT_879 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_880 = "(this, ";
  protected final String TEXT_881 = ".SET, ";
  protected final String TEXT_882 = ", ";
  protected final String TEXT_883 = "isSetChange ? ";
  protected final String TEXT_884 = " : old";
  protected final String TEXT_885 = "old";
  protected final String TEXT_886 = ", ";
  protected final String TEXT_887 = "new";
  protected final String TEXT_888 = ", ";
  protected final String TEXT_889 = "isSetChange";
  protected final String TEXT_890 = "!old";
  protected final String TEXT_891 = "ESet";
  protected final String TEXT_892 = "));";
  protected final String TEXT_893 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_894 = "(this, ";
  protected final String TEXT_895 = ".SET, ";
  protected final String TEXT_896 = ", ";
  protected final String TEXT_897 = "old";
  protected final String TEXT_898 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_899 = " : old";
  protected final String TEXT_900 = "old";
  protected final String TEXT_901 = ", ";
  protected final String TEXT_902 = "new";
  protected final String TEXT_903 = "));";
  protected final String TEXT_904 = NL;
  protected final String TEXT_905 = NL;
  protected final String TEXT_906 = NL + "\t\t";
  protected final String TEXT_907 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_908 = NL + "\t\t\t";
  protected final String TEXT_909 = " ";
  protected final String TEXT_910 = " = ";
  protected final String TEXT_911 = "();";
  protected final String TEXT_912 = NL + "\t\t\tObject ";
  protected final String TEXT_913 = " = eVirtualGet(";
  protected final String TEXT_914 = ");";
  protected final String TEXT_915 = NL + "\t\t\tif (";
  protected final String TEXT_916 = " != null && ";
  protected final String TEXT_917 = " != new";
  protected final String TEXT_918 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_919 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_920 = NL + "\t\t\tif (new";
  protected final String TEXT_921 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_922 = NL + "\t\t\t\t";
  protected final String TEXT_923 = " ";
  protected final String TEXT_924 = " = ";
  protected final String TEXT_925 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_926 = ".contains(new";
  protected final String TEXT_927 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_928 = ".add(new";
  protected final String TEXT_929 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_930 = NL + "\t\t\t\t";
  protected final String TEXT_931 = " ";
  protected final String TEXT_932 = " = ";
  protected final String TEXT_933 = "();";
  protected final String TEXT_934 = NL + "\t\t\t\tObject ";
  protected final String TEXT_935 = " = eVirtualGet(";
  protected final String TEXT_936 = ");";
  protected final String TEXT_937 = NL + "\t\t\t\tif (new";
  protected final String TEXT_938 = " != ";
  protected final String TEXT_939 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_940 = "(new";
  protected final String TEXT_941 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_942 = NL + "\t\t\t}";
  protected final String TEXT_943 = NL + "\t\t}";
  protected final String TEXT_944 = NL + "\t\t((";
  protected final String TEXT_945 = ".Internal)((";
  protected final String TEXT_946 = ".Internal.Wrapper)get";
  protected final String TEXT_947 = "()).featureMap()).set(";
  protected final String TEXT_948 = ", ";
  protected final String TEXT_949 = "new ";
  protected final String TEXT_950 = "(";
  protected final String TEXT_951 = "new";
  protected final String TEXT_952 = ")";
  protected final String TEXT_953 = ");";
  protected final String TEXT_954 = NL + "\t\t((";
  protected final String TEXT_955 = ".Internal)get";
  protected final String TEXT_956 = "()).set(";
  protected final String TEXT_957 = ", ";
  protected final String TEXT_958 = "new ";
  protected final String TEXT_959 = "(";
  protected final String TEXT_960 = "new";
  protected final String TEXT_961 = ")";
  protected final String TEXT_962 = ");";
  protected final String TEXT_963 = NL;
  protected final String TEXT_964 = NL + "\t\t";
  protected final String TEXT_965 = ".";
  protected final String TEXT_966 = "(this, ";
  protected final String TEXT_967 = ");";
  protected final String TEXT_968 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_969 = "' ";
  protected final String TEXT_970 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_971 = NL + "\t}" + NL;
  protected final String TEXT_972 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_973 = NL;
  protected final String TEXT_974 = NL + "\t@Override";
  protected final String TEXT_975 = NL + "\tpublic ";
  protected final String TEXT_976 = " basicUnset";
  protected final String TEXT_977 = "(";
  protected final String TEXT_978 = " msgs)" + NL + "\t{";
  protected final String TEXT_979 = NL + "\t\tObject old";
  protected final String TEXT_980 = " = eVirtualUnset(";
  protected final String TEXT_981 = ");";
  protected final String TEXT_982 = NL + "\t\t";
  protected final String TEXT_983 = " old";
  protected final String TEXT_984 = " = ";
  protected final String TEXT_985 = ";" + NL + "\t\t";
  protected final String TEXT_986 = " = null;";
  protected final String TEXT_987 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_988 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_989 = NL + "\t\tboolean old";
  protected final String TEXT_990 = "ESet = (";
  protected final String TEXT_991 = " & ";
  protected final String TEXT_992 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_993 = " &= ~";
  protected final String TEXT_994 = "_ESETFLAG;";
  protected final String TEXT_995 = NL + "\t\tboolean old";
  protected final String TEXT_996 = "ESet = ";
  protected final String TEXT_997 = "ESet;" + NL + "\t\t";
  protected final String TEXT_998 = "ESet = false;";
  protected final String TEXT_999 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1000 = " notification = new ";
  protected final String TEXT_1001 = "(this, ";
  protected final String TEXT_1002 = ".UNSET, ";
  protected final String TEXT_1003 = ", ";
  protected final String TEXT_1004 = "isSetChange ? old";
  protected final String TEXT_1005 = " : null";
  protected final String TEXT_1006 = "old";
  protected final String TEXT_1007 = ", null, ";
  protected final String TEXT_1008 = "isSetChange";
  protected final String TEXT_1009 = "old";
  protected final String TEXT_1010 = "ESet";
  protected final String TEXT_1011 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1012 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1013 = "' ";
  protected final String TEXT_1014 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1015 = NL + "\t}" + NL;
  protected final String TEXT_1016 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1017 = "#";
  protected final String TEXT_1018 = " <em>";
  protected final String TEXT_1019 = "</em>}' ";
  protected final String TEXT_1020 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1021 = NL + "\t * @see #isSet";
  protected final String TEXT_1022 = "()";
  protected final String TEXT_1023 = NL + "\t * @see #";
  protected final String TEXT_1024 = "()";
  protected final String TEXT_1025 = NL + "\t * @see #set";
  protected final String TEXT_1026 = "(";
  protected final String TEXT_1027 = ")";
  protected final String TEXT_1028 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1029 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1030 = NL;
  protected final String TEXT_1031 = NL + "\t@Override";
  protected final String TEXT_1032 = NL + "\tvoid unset";
  protected final String TEXT_1033 = "();" + NL;
  protected final String TEXT_1034 = NL + "\tpublic void unset";
  protected final String TEXT_1035 = "()" + NL + "\t{";
  protected final String TEXT_1036 = NL + "\t\teUnset(";
  protected final String TEXT_1037 = ");";
  protected final String TEXT_1038 = NL + "\t\t";
  protected final String TEXT_1039 = " ";
  protected final String TEXT_1040 = " = (";
  protected final String TEXT_1041 = ")eVirtualGet(";
  protected final String TEXT_1042 = ");";
  protected final String TEXT_1043 = NL + "\t\tif (";
  protected final String TEXT_1044 = " != null) ((";
  protected final String TEXT_1045 = ".Unsettable";
  protected final String TEXT_1046 = ")";
  protected final String TEXT_1047 = ").unset();";
  protected final String TEXT_1048 = NL + "\t\t";
  protected final String TEXT_1049 = " ";
  protected final String TEXT_1050 = " = (";
  protected final String TEXT_1051 = ")eVirtualGet(";
  protected final String TEXT_1052 = ");";
  protected final String TEXT_1053 = NL + "\t\tif (";
  protected final String TEXT_1054 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1055 = " msgs = null;";
  protected final String TEXT_1056 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1057 = ")";
  protected final String TEXT_1058 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1059 = ", null, msgs);";
  protected final String TEXT_1060 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1061 = ")";
  protected final String TEXT_1062 = ").eInverseRemove(this, ";
  protected final String TEXT_1063 = ", ";
  protected final String TEXT_1064 = ".class, msgs);";
  protected final String TEXT_1065 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1066 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1067 = NL + "\t\t\tboolean old";
  protected final String TEXT_1068 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1069 = ");";
  protected final String TEXT_1070 = NL + "\t\t\tboolean old";
  protected final String TEXT_1071 = "ESet = (";
  protected final String TEXT_1072 = " & ";
  protected final String TEXT_1073 = "_ESETFLAG) != 0;";
  protected final String TEXT_1074 = NL + "\t\t\t";
  protected final String TEXT_1075 = " &= ~";
  protected final String TEXT_1076 = "_ESETFLAG;";
  protected final String TEXT_1077 = NL + "\t\t\tboolean old";
  protected final String TEXT_1078 = "ESet = ";
  protected final String TEXT_1079 = "ESet;";
  protected final String TEXT_1080 = NL + "\t\t\t";
  protected final String TEXT_1081 = "ESet = false;";
  protected final String TEXT_1082 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1083 = "(this, ";
  protected final String TEXT_1084 = ".UNSET, ";
  protected final String TEXT_1085 = ", null, null, old";
  protected final String TEXT_1086 = "ESet));";
  protected final String TEXT_1087 = NL + "\t\t}";
  protected final String TEXT_1088 = NL + "\t\t";
  protected final String TEXT_1089 = " old";
  protected final String TEXT_1090 = " = (";
  protected final String TEXT_1091 = " & ";
  protected final String TEXT_1092 = "_EFLAG) != 0;";
  protected final String TEXT_1093 = NL + "\t\tObject old";
  protected final String TEXT_1094 = " = eVirtualUnset(";
  protected final String TEXT_1095 = ");";
  protected final String TEXT_1096 = NL + "\t\t";
  protected final String TEXT_1097 = " old";
  protected final String TEXT_1098 = " = ";
  protected final String TEXT_1099 = ";";
  protected final String TEXT_1100 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1101 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1102 = NL + "\t\tboolean old";
  protected final String TEXT_1103 = "ESet = (";
  protected final String TEXT_1104 = " & ";
  protected final String TEXT_1105 = "_ESETFLAG) != 0;";
  protected final String TEXT_1106 = NL + "\t\tboolean old";
  protected final String TEXT_1107 = "ESet = ";
  protected final String TEXT_1108 = "ESet;";
  protected final String TEXT_1109 = NL + "\t\t";
  protected final String TEXT_1110 = " = null;";
  protected final String TEXT_1111 = NL + "\t\t";
  protected final String TEXT_1112 = " &= ~";
  protected final String TEXT_1113 = "_ESETFLAG;";
  protected final String TEXT_1114 = NL + "\t\t";
  protected final String TEXT_1115 = "ESet = false;";
  protected final String TEXT_1116 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1117 = "(this, ";
  protected final String TEXT_1118 = ".UNSET, ";
  protected final String TEXT_1119 = ", ";
  protected final String TEXT_1120 = "isSetChange ? old";
  protected final String TEXT_1121 = " : null";
  protected final String TEXT_1122 = "old";
  protected final String TEXT_1123 = ", null, ";
  protected final String TEXT_1124 = "isSetChange";
  protected final String TEXT_1125 = "old";
  protected final String TEXT_1126 = "ESet";
  protected final String TEXT_1127 = "));";
  protected final String TEXT_1128 = NL + "\t\tif (";
  protected final String TEXT_1129 = ") ";
  protected final String TEXT_1130 = " |= ";
  protected final String TEXT_1131 = "_EFLAG; else ";
  protected final String TEXT_1132 = " &= ~";
  protected final String TEXT_1133 = "_EFLAG;";
  protected final String TEXT_1134 = NL + "\t\t";
  protected final String TEXT_1135 = " = ";
  protected final String TEXT_1136 = ";";
  protected final String TEXT_1137 = NL + "\t\t";
  protected final String TEXT_1138 = " &= ~";
  protected final String TEXT_1139 = "_ESETFLAG;";
  protected final String TEXT_1140 = NL + "\t\t";
  protected final String TEXT_1141 = "ESet = false;";
  protected final String TEXT_1142 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1143 = "(this, ";
  protected final String TEXT_1144 = ".UNSET, ";
  protected final String TEXT_1145 = ", ";
  protected final String TEXT_1146 = "isSetChange ? old";
  protected final String TEXT_1147 = " : ";
  protected final String TEXT_1148 = "old";
  protected final String TEXT_1149 = ", ";
  protected final String TEXT_1150 = ", ";
  protected final String TEXT_1151 = "isSetChange";
  protected final String TEXT_1152 = "old";
  protected final String TEXT_1153 = "ESet";
  protected final String TEXT_1154 = "));";
  protected final String TEXT_1155 = NL + "\t\t((";
  protected final String TEXT_1156 = ".Internal)((";
  protected final String TEXT_1157 = ".Internal.Wrapper)get";
  protected final String TEXT_1158 = "()).featureMap()).clear(";
  protected final String TEXT_1159 = ");";
  protected final String TEXT_1160 = NL + "\t\t((";
  protected final String TEXT_1161 = ".Internal)get";
  protected final String TEXT_1162 = "()).clear(";
  protected final String TEXT_1163 = ");";
  protected final String TEXT_1164 = NL;
  protected final String TEXT_1165 = NL + "\t\t";
  protected final String TEXT_1166 = ".";
  protected final String TEXT_1167 = "(this);";
  protected final String TEXT_1168 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1169 = "' ";
  protected final String TEXT_1170 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1171 = NL + "\t}" + NL;
  protected final String TEXT_1172 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1173 = "#";
  protected final String TEXT_1174 = " <em>";
  protected final String TEXT_1175 = "</em>}' ";
  protected final String TEXT_1176 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1177 = "</em>' ";
  protected final String TEXT_1178 = " is set.";
  protected final String TEXT_1179 = NL + "\t * @see #unset";
  protected final String TEXT_1180 = "()";
  protected final String TEXT_1181 = NL + "\t * @see #";
  protected final String TEXT_1182 = "()";
  protected final String TEXT_1183 = NL + "\t * @see #set";
  protected final String TEXT_1184 = "(";
  protected final String TEXT_1185 = ")";
  protected final String TEXT_1186 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1187 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1188 = NL;
  protected final String TEXT_1189 = NL + "\t@Override";
  protected final String TEXT_1190 = NL + "\tboolean isSet";
  protected final String TEXT_1191 = "();" + NL;
  protected final String TEXT_1192 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1193 = "()" + NL + "\t{";
  protected final String TEXT_1194 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1195 = ");";
  protected final String TEXT_1196 = NL + "\t\t";
  protected final String TEXT_1197 = " ";
  protected final String TEXT_1198 = " = (";
  protected final String TEXT_1199 = ")eVirtualGet(";
  protected final String TEXT_1200 = ");";
  protected final String TEXT_1201 = NL + "\t\treturn ";
  protected final String TEXT_1202 = " != null && ((";
  protected final String TEXT_1203 = ".Unsettable";
  protected final String TEXT_1204 = ")";
  protected final String TEXT_1205 = ").isSet();";
  protected final String TEXT_1206 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1207 = ");";
  protected final String TEXT_1208 = NL + "\t\treturn (";
  protected final String TEXT_1209 = " & ";
  protected final String TEXT_1210 = "_ESETFLAG) != 0;";
  protected final String TEXT_1211 = NL + "\t\treturn ";
  protected final String TEXT_1212 = "ESet;";
  protected final String TEXT_1213 = NL + "\t\treturn !((";
  protected final String TEXT_1214 = ".Internal)((";
  protected final String TEXT_1215 = ".Internal.Wrapper)get";
  protected final String TEXT_1216 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1217 = ");";
  protected final String TEXT_1218 = NL + "\t\treturn !((";
  protected final String TEXT_1219 = ".Internal)get";
  protected final String TEXT_1220 = "()).isEmpty(";
  protected final String TEXT_1221 = ");";
  protected final String TEXT_1222 = NL;
  protected final String TEXT_1223 = NL + "\t\treturn ";
  protected final String TEXT_1224 = ".";
  protected final String TEXT_1225 = "(this);";
  protected final String TEXT_1226 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1227 = "' ";
  protected final String TEXT_1228 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1229 = NL + "\t}" + NL;
  protected final String TEXT_1230 = NL;
  protected final String TEXT_1231 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1232 = "() <em>";
  protected final String TEXT_1233 = "</em>}' ";
  protected final String TEXT_1234 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1235 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1236 = "_ESUBSETS = ";
  protected final String TEXT_1237 = ";" + NL;
  protected final String TEXT_1238 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1239 = "() <em>";
  protected final String TEXT_1240 = "</em>}' ";
  protected final String TEXT_1241 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1242 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1243 = "_ESUPERSETS = ";
  protected final String TEXT_1244 = ";" + NL;
  protected final String TEXT_1245 = NL + "\t/**";
  protected final String TEXT_1246 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1247 = "}, with the specified ";
  protected final String TEXT_1248 = ", and appends it to the '<em><b>";
  protected final String TEXT_1249 = "</b></em>' ";
  protected final String TEXT_1250 = ".";
  protected final String TEXT_1251 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1252 = "}, with the specified ";
  protected final String TEXT_1253 = ", and sets the '<em><b>";
  protected final String TEXT_1254 = "</b></em>' ";
  protected final String TEXT_1255 = ".";
  protected final String TEXT_1256 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1257 = "} and appends it to the '<em><b>";
  protected final String TEXT_1258 = "</b></em>' ";
  protected final String TEXT_1259 = ".";
  protected final String TEXT_1260 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1261 = "} and sets the '<em><b>";
  protected final String TEXT_1262 = "</b></em>' ";
  protected final String TEXT_1263 = ".";
  protected final String TEXT_1264 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1265 = NL + "\t * @param ";
  protected final String TEXT_1266 = " The ";
  protected final String TEXT_1267 = " for the new {@link ";
  protected final String TEXT_1268 = "}, or <code>null</code>.";
  protected final String TEXT_1269 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1270 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1271 = "}." + NL + "\t * @see #";
  protected final String TEXT_1272 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1273 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1274 = NL + "\t";
  protected final String TEXT_1275 = " create";
  protected final String TEXT_1276 = "(";
  protected final String TEXT_1277 = ", ";
  protected final String TEXT_1278 = " eClass);" + NL;
  protected final String TEXT_1279 = NL + "\t@Override";
  protected final String TEXT_1280 = NL + "\tpublic ";
  protected final String TEXT_1281 = " create";
  protected final String TEXT_1282 = "(";
  protected final String TEXT_1283 = ", ";
  protected final String TEXT_1284 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1285 = " new";
  protected final String TEXT_1286 = " = (";
  protected final String TEXT_1287 = ") create(eClass);";
  protected final String TEXT_1288 = NL + "\t\t";
  protected final String TEXT_1289 = "().add(new";
  protected final String TEXT_1290 = ");";
  protected final String TEXT_1291 = NL + "\t\tset";
  protected final String TEXT_1292 = "(new";
  protected final String TEXT_1293 = ");";
  protected final String TEXT_1294 = NL + "\t\tint ";
  protected final String TEXT_1295 = "ListSize = 0;";
  protected final String TEXT_1296 = NL + "\t\tint ";
  protected final String TEXT_1297 = "Size = ";
  protected final String TEXT_1298 = " == null ? 0 : ";
  protected final String TEXT_1299 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1300 = "Size > ";
  protected final String TEXT_1301 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1302 = "ListSize = ";
  protected final String TEXT_1303 = "Size;";
  protected final String TEXT_1304 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1305 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1306 = ".create";
  protected final String TEXT_1307 = "(";
  protected final String TEXT_1308 = ", ";
  protected final String TEXT_1309 = "i < ";
  protected final String TEXT_1310 = "Size ? (";
  protected final String TEXT_1311 = ") ";
  protected final String TEXT_1312 = ".get(i) : null";
  protected final String TEXT_1313 = ");" + NL + "\t\t}";
  protected final String TEXT_1314 = NL + "\t\tnew";
  protected final String TEXT_1315 = ".create";
  protected final String TEXT_1316 = "(";
  protected final String TEXT_1317 = ", ";
  protected final String TEXT_1318 = ");";
  protected final String TEXT_1319 = NL + "\t\tif (";
  protected final String TEXT_1320 = " != null)";
  protected final String TEXT_1321 = NL + "\t\t\tnew";
  protected final String TEXT_1322 = ".";
  protected final String TEXT_1323 = "().addAll(";
  protected final String TEXT_1324 = ");";
  protected final String TEXT_1325 = NL + "\t\t\tnew";
  protected final String TEXT_1326 = ".set";
  protected final String TEXT_1327 = "(";
  protected final String TEXT_1328 = ");";
  protected final String TEXT_1329 = NL + "\t\treturn new";
  protected final String TEXT_1330 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1331 = NL + "\t/**";
  protected final String TEXT_1332 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1333 = "}, with the specified ";
  protected final String TEXT_1334 = ", and appends it to the '<em><b>";
  protected final String TEXT_1335 = "</b></em>' ";
  protected final String TEXT_1336 = ".";
  protected final String TEXT_1337 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1338 = "},with the specified ";
  protected final String TEXT_1339 = ", and sets the '<em><b>";
  protected final String TEXT_1340 = "</b></em>' ";
  protected final String TEXT_1341 = ".";
  protected final String TEXT_1342 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1343 = "} and appends it to the '<em><b>";
  protected final String TEXT_1344 = "</b></em>' ";
  protected final String TEXT_1345 = ".";
  protected final String TEXT_1346 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1347 = "} and sets the '<em><b>";
  protected final String TEXT_1348 = "</b></em>' ";
  protected final String TEXT_1349 = ".";
  protected final String TEXT_1350 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1351 = NL + "\t * @param ";
  protected final String TEXT_1352 = " The ";
  protected final String TEXT_1353 = " for the new {@link ";
  protected final String TEXT_1354 = "}, or <code>null</code>.";
  protected final String TEXT_1355 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1356 = "}." + NL + "\t * @see #";
  protected final String TEXT_1357 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1358 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1359 = NL + "\t";
  protected final String TEXT_1360 = " create";
  protected final String TEXT_1361 = "(";
  protected final String TEXT_1362 = ");" + NL;
  protected final String TEXT_1363 = NL + "\t@Override";
  protected final String TEXT_1364 = NL + "\tpublic ";
  protected final String TEXT_1365 = " create";
  protected final String TEXT_1366 = "(";
  protected final String TEXT_1367 = ")" + NL + "\t{";
  protected final String TEXT_1368 = NL + "\t\treturn create";
  protected final String TEXT_1369 = "(";
  protected final String TEXT_1370 = ", ";
  protected final String TEXT_1371 = ");";
  protected final String TEXT_1372 = NL + "\t\t";
  protected final String TEXT_1373 = " new";
  protected final String TEXT_1374 = " = (";
  protected final String TEXT_1375 = ") create(";
  protected final String TEXT_1376 = ");";
  protected final String TEXT_1377 = NL + "\t\t";
  protected final String TEXT_1378 = "().add(new";
  protected final String TEXT_1379 = ");";
  protected final String TEXT_1380 = NL + "\t\tset";
  protected final String TEXT_1381 = "(new";
  protected final String TEXT_1382 = ");";
  protected final String TEXT_1383 = NL + "\t\tint ";
  protected final String TEXT_1384 = "ListSize = 0;";
  protected final String TEXT_1385 = NL + "\t\tint ";
  protected final String TEXT_1386 = "Size = ";
  protected final String TEXT_1387 = " == null ? 0 : ";
  protected final String TEXT_1388 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1389 = "Size > ";
  protected final String TEXT_1390 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1391 = "ListSize = ";
  protected final String TEXT_1392 = "Size;";
  protected final String TEXT_1393 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1394 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1395 = ".create";
  protected final String TEXT_1396 = "(";
  protected final String TEXT_1397 = ", ";
  protected final String TEXT_1398 = "i < ";
  protected final String TEXT_1399 = "Size ? (";
  protected final String TEXT_1400 = ") ";
  protected final String TEXT_1401 = ".get(i) : null";
  protected final String TEXT_1402 = ");" + NL + "\t\t}";
  protected final String TEXT_1403 = NL + "\t\tnew";
  protected final String TEXT_1404 = ".create";
  protected final String TEXT_1405 = "(";
  protected final String TEXT_1406 = ", ";
  protected final String TEXT_1407 = ");";
  protected final String TEXT_1408 = NL + "\t\tif (";
  protected final String TEXT_1409 = " != null)";
  protected final String TEXT_1410 = NL + "\t\t\tnew";
  protected final String TEXT_1411 = ".";
  protected final String TEXT_1412 = "().addAll(";
  protected final String TEXT_1413 = ");";
  protected final String TEXT_1414 = NL + "\t\t\tnew";
  protected final String TEXT_1415 = ".set";
  protected final String TEXT_1416 = "(";
  protected final String TEXT_1417 = ");";
  protected final String TEXT_1418 = NL + "\t\treturn new";
  protected final String TEXT_1419 = ";";
  protected final String TEXT_1420 = NL + "\t}" + NL;
  protected final String TEXT_1421 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1422 = "} with the specified ";
  protected final String TEXT_1423 = " from the '<em><b>";
  protected final String TEXT_1424 = "</b></em>' ";
  protected final String TEXT_1425 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1426 = NL + "\t * @param ";
  protected final String TEXT_1427 = " The ";
  protected final String TEXT_1428 = " of the {@link ";
  protected final String TEXT_1429 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1430 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1431 = "} with the specified ";
  protected final String TEXT_1432 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1433 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1434 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1435 = NL + "\t";
  protected final String TEXT_1436 = " get";
  protected final String TEXT_1437 = "(";
  protected final String TEXT_1438 = ");" + NL;
  protected final String TEXT_1439 = NL + "\t@Override";
  protected final String TEXT_1440 = NL + "\tpublic ";
  protected final String TEXT_1441 = " get";
  protected final String TEXT_1442 = "(";
  protected final String TEXT_1443 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1444 = "(";
  protected final String TEXT_1445 = ", false";
  protected final String TEXT_1446 = ", null";
  protected final String TEXT_1447 = ", false";
  protected final String TEXT_1448 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1449 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1450 = "} with the specified ";
  protected final String TEXT_1451 = " from the '<em><b>";
  protected final String TEXT_1452 = "</b></em>' ";
  protected final String TEXT_1453 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1454 = NL + "\t * @param ";
  protected final String TEXT_1455 = " The ";
  protected final String TEXT_1456 = " of the {@link ";
  protected final String TEXT_1457 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1458 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1459 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1460 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1461 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1462 = "} on demand if not found.";
  protected final String TEXT_1463 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1464 = "} with the specified ";
  protected final String TEXT_1465 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1466 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1467 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1468 = NL + "\t";
  protected final String TEXT_1469 = " get";
  protected final String TEXT_1470 = "(";
  protected final String TEXT_1471 = ", boolean ignoreCase";
  protected final String TEXT_1472 = ", ";
  protected final String TEXT_1473 = " eClass";
  protected final String TEXT_1474 = ", boolean createOnDemand";
  protected final String TEXT_1475 = ");" + NL;
  protected final String TEXT_1476 = NL + "\t@Override";
  protected final String TEXT_1477 = NL + "\tpublic ";
  protected final String TEXT_1478 = " get";
  protected final String TEXT_1479 = "(";
  protected final String TEXT_1480 = ", boolean ignoreCase";
  protected final String TEXT_1481 = ", ";
  protected final String TEXT_1482 = " eClass";
  protected final String TEXT_1483 = ", boolean createOnDemand";
  protected final String TEXT_1484 = ")" + NL + "\t{";
  protected final String TEXT_1485 = NL + "\t\t";
  protected final String TEXT_1486 = "Loop: for (";
  protected final String TEXT_1487 = " ";
  protected final String TEXT_1488 = " : ";
  protected final String TEXT_1489 = "())" + NL + "\t\t{";
  protected final String TEXT_1490 = NL + "\t\t";
  protected final String TEXT_1491 = "Loop: for (";
  protected final String TEXT_1492 = " i = ";
  protected final String TEXT_1493 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1494 = " ";
  protected final String TEXT_1495 = " = (";
  protected final String TEXT_1496 = ") i.next();";
  protected final String TEXT_1497 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1498 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1499 = "Loop;";
  protected final String TEXT_1500 = NL + "\t\t\t";
  protected final String TEXT_1501 = " ";
  protected final String TEXT_1502 = "List = ";
  protected final String TEXT_1503 = ".";
  protected final String TEXT_1504 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1505 = "ListSize = ";
  protected final String TEXT_1506 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1507 = " || (";
  protected final String TEXT_1508 = " != null && ";
  protected final String TEXT_1509 = ".size() != ";
  protected final String TEXT_1510 = "ListSize";
  protected final String TEXT_1511 = ")";
  protected final String TEXT_1512 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1513 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1514 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1515 = " ";
  protected final String TEXT_1516 = " = ";
  protected final String TEXT_1517 = "(";
  protected final String TEXT_1518 = ") ";
  protected final String TEXT_1519 = "List.get(j);";
  protected final String TEXT_1520 = NL + "\t\t\t\tif (";
  protected final String TEXT_1521 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1522 = "(";
  protected final String TEXT_1523 = ")";
  protected final String TEXT_1524 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1525 = ".";
  protected final String TEXT_1526 = "()) : ";
  protected final String TEXT_1527 = ".get(j).equals(";
  protected final String TEXT_1528 = ".";
  protected final String TEXT_1529 = "())))";
  protected final String TEXT_1530 = NL + "\t\t\t\tif (";
  protected final String TEXT_1531 = " != null && !";
  protected final String TEXT_1532 = ".get(j).equals(";
  protected final String TEXT_1533 = ".";
  protected final String TEXT_1534 = "()))";
  protected final String TEXT_1535 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1536 = "Loop;";
  protected final String TEXT_1537 = NL + "\t\t\t}";
  protected final String TEXT_1538 = NL + "\t\t\t";
  protected final String TEXT_1539 = " ";
  protected final String TEXT_1540 = " = ";
  protected final String TEXT_1541 = ".";
  protected final String TEXT_1542 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1543 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1544 = "Loop;";
  protected final String TEXT_1545 = NL + "\t\t\tif (";
  protected final String TEXT_1546 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1547 = ".equalsIgnoreCase(";
  protected final String TEXT_1548 = ".";
  protected final String TEXT_1549 = "()) : ";
  protected final String TEXT_1550 = ".equals(";
  protected final String TEXT_1551 = ".";
  protected final String TEXT_1552 = "())))";
  protected final String TEXT_1553 = NL + "\t\t\tif (";
  protected final String TEXT_1554 = " != null && !";
  protected final String TEXT_1555 = ".equals(";
  protected final String TEXT_1556 = ".";
  protected final String TEXT_1557 = "()))";
  protected final String TEXT_1558 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1559 = "Loop;";
  protected final String TEXT_1560 = NL + "\t\t\tif (";
  protected final String TEXT_1561 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1562 = ".equalsIgnoreCase(";
  protected final String TEXT_1563 = ".";
  protected final String TEXT_1564 = "()) : ";
  protected final String TEXT_1565 = ".equals(";
  protected final String TEXT_1566 = ".";
  protected final String TEXT_1567 = "())))";
  protected final String TEXT_1568 = NL + "\t\t\tif (";
  protected final String TEXT_1569 = " != null && !";
  protected final String TEXT_1570 = ".equals(";
  protected final String TEXT_1571 = ".";
  protected final String TEXT_1572 = "()))";
  protected final String TEXT_1573 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1574 = "Loop;";
  protected final String TEXT_1575 = NL + "\t\t\treturn ";
  protected final String TEXT_1576 = ";" + NL + "\t\t}";
  protected final String TEXT_1577 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1578 = " && eClass != null";
  protected final String TEXT_1579 = " ? create";
  protected final String TEXT_1580 = "(";
  protected final String TEXT_1581 = ", eClass";
  protected final String TEXT_1582 = ") : null;";
  protected final String TEXT_1583 = NL + "\t\treturn null;";
  protected final String TEXT_1584 = NL + "\t}" + NL;
  protected final String TEXT_1585 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1586 = "()" + NL + "\t{";
  protected final String TEXT_1587 = NL + "  \t\treturn false;";
  protected final String TEXT_1588 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1589 = ");";
  protected final String TEXT_1590 = NL + "\t\treturn !((";
  protected final String TEXT_1591 = ".Internal.Wrapper)";
  protected final String TEXT_1592 = "()).featureMap().isEmpty();";
  protected final String TEXT_1593 = NL + "\t\treturn ";
  protected final String TEXT_1594 = " != null && !";
  protected final String TEXT_1595 = ".featureMap().isEmpty();";
  protected final String TEXT_1596 = NL + "\t\treturn ";
  protected final String TEXT_1597 = " != null && !";
  protected final String TEXT_1598 = ".isEmpty();";
  protected final String TEXT_1599 = NL + "\t\t";
  protected final String TEXT_1600 = " ";
  protected final String TEXT_1601 = " = (";
  protected final String TEXT_1602 = ")eVirtualGet(";
  protected final String TEXT_1603 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1604 = " != null && !";
  protected final String TEXT_1605 = ".isEmpty();";
  protected final String TEXT_1606 = NL + "\t\treturn !";
  protected final String TEXT_1607 = "().isEmpty();";
  protected final String TEXT_1608 = NL + "\t\treturn ";
  protected final String TEXT_1609 = " != null;";
  protected final String TEXT_1610 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1611 = ") != null;";
  protected final String TEXT_1612 = NL + "\t\treturn basicGet";
  protected final String TEXT_1613 = "() != null;";
  protected final String TEXT_1614 = NL + "\t\treturn ";
  protected final String TEXT_1615 = " != null;";
  protected final String TEXT_1616 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1617 = ") != null;";
  protected final String TEXT_1618 = NL + "\t\treturn ";
  protected final String TEXT_1619 = "() != null;";
  protected final String TEXT_1620 = NL + "\t\treturn ((";
  protected final String TEXT_1621 = " & ";
  protected final String TEXT_1622 = "_EFLAG) != 0) != ";
  protected final String TEXT_1623 = ";";
  protected final String TEXT_1624 = NL + "\t\treturn ";
  protected final String TEXT_1625 = " != ";
  protected final String TEXT_1626 = ";";
  protected final String TEXT_1627 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1628 = ", ";
  protected final String TEXT_1629 = ") != ";
  protected final String TEXT_1630 = ";";
  protected final String TEXT_1631 = NL + "\t\treturn ";
  protected final String TEXT_1632 = "() != ";
  protected final String TEXT_1633 = ";";
  protected final String TEXT_1634 = NL + "\t\treturn ";
  protected final String TEXT_1635 = " == null ? ";
  protected final String TEXT_1636 = " != null : !";
  protected final String TEXT_1637 = ".equals(";
  protected final String TEXT_1638 = ");";
  protected final String TEXT_1639 = NL + "\t\t";
  protected final String TEXT_1640 = " ";
  protected final String TEXT_1641 = " = (";
  protected final String TEXT_1642 = ")eVirtualGet(";
  protected final String TEXT_1643 = ", ";
  protected final String TEXT_1644 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1645 = " == null ? ";
  protected final String TEXT_1646 = " != null : !";
  protected final String TEXT_1647 = ".equals(";
  protected final String TEXT_1648 = ");";
  protected final String TEXT_1649 = NL + "\t\treturn ";
  protected final String TEXT_1650 = " == null ? ";
  protected final String TEXT_1651 = "() != null : !";
  protected final String TEXT_1652 = ".equals(";
  protected final String TEXT_1653 = "());";
  protected final String TEXT_1654 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1655 = ");";
  protected final String TEXT_1656 = NL + "\t\t";
  protected final String TEXT_1657 = " ";
  protected final String TEXT_1658 = " = (";
  protected final String TEXT_1659 = ")eVirtualGet(";
  protected final String TEXT_1660 = ");";
  protected final String TEXT_1661 = NL + "\t\treturn ";
  protected final String TEXT_1662 = " != null && ((";
  protected final String TEXT_1663 = ".Unsettable";
  protected final String TEXT_1664 = ")";
  protected final String TEXT_1665 = ").isSet();";
  protected final String TEXT_1666 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1667 = ");";
  protected final String TEXT_1668 = NL + "\t\treturn (";
  protected final String TEXT_1669 = " & ";
  protected final String TEXT_1670 = "_ESETFLAG) != 0;";
  protected final String TEXT_1671 = NL + "\t\treturn ";
  protected final String TEXT_1672 = "ESet;";
  protected final String TEXT_1673 = NL + "\t\treturn !((";
  protected final String TEXT_1674 = ".Internal)((";
  protected final String TEXT_1675 = ".Internal.Wrapper)get";
  protected final String TEXT_1676 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1677 = ");";
  protected final String TEXT_1678 = NL + "\t\treturn !((";
  protected final String TEXT_1679 = ".Internal)get";
  protected final String TEXT_1680 = "()).isEmpty(";
  protected final String TEXT_1681 = ");";
  protected final String TEXT_1682 = NL;
  protected final String TEXT_1683 = NL + "\t\treturn ";
  protected final String TEXT_1684 = ".";
  protected final String TEXT_1685 = "(this);";
  protected final String TEXT_1686 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1687 = "' ";
  protected final String TEXT_1688 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1689 = NL + "\t}" + NL;
  protected final String TEXT_1690 = NL;
  protected final String TEXT_1691 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1692 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1693 = NL + "\t * ";
  protected final String TEXT_1694 = NL + "\t * @param ";
  protected final String TEXT_1695 = NL + "\t *   ";
  protected final String TEXT_1696 = NL + "\t * @param ";
  protected final String TEXT_1697 = " ";
  protected final String TEXT_1698 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1699 = NL + "\t * @model ";
  protected final String TEXT_1700 = NL + "\t *        ";
  protected final String TEXT_1701 = NL + "\t * @model";
  protected final String TEXT_1702 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1703 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1704 = NL;
  protected final String TEXT_1705 = NL + "\t@Override";
  protected final String TEXT_1706 = NL + "\t";
  protected final String TEXT_1707 = " ";
  protected final String TEXT_1708 = "(";
  protected final String TEXT_1709 = ")";
  protected final String TEXT_1710 = ";" + NL;
  protected final String TEXT_1711 = NL + "\tpublic ";
  protected final String TEXT_1712 = " ";
  protected final String TEXT_1713 = "(";
  protected final String TEXT_1714 = ")";
  protected final String TEXT_1715 = NL + "\t{";
  protected final String TEXT_1716 = NL + "\t\t";
  protected final String TEXT_1717 = NL + "\t\treturn ";
  protected final String TEXT_1718 = ".";
  protected final String TEXT_1719 = "(this, ";
  protected final String TEXT_1720 = ", ";
  protected final String TEXT_1721 = ");";
  protected final String TEXT_1722 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1723 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1724 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1725 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1726 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1727 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1728 = ".";
  protected final String TEXT_1729 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1730 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1731 = "\", ";
  protected final String TEXT_1732 = ".getObjectLabel(this, ";
  protected final String TEXT_1733 = ") }),";
  protected final String TEXT_1734 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1735 = NL + "\t\t";
  protected final String TEXT_1736 = ".";
  protected final String TEXT_1737 = "(this";
  protected final String TEXT_1738 = ", ";
  protected final String TEXT_1739 = ");";
  protected final String TEXT_1740 = NL + "\t\t";
  protected final String TEXT_1741 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1742 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1743 = NL + "\t\t\t";
  protected final String TEXT_1744 = " result = (";
  protected final String TEXT_1745 = ") cache.get(";
  protected final String TEXT_1746 = "eResource(), ";
  protected final String TEXT_1747 = "this, ";
  protected final String TEXT_1748 = ".getEOperations().get(";
  protected final String TEXT_1749 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1750 = "eResource(), ";
  protected final String TEXT_1751 = "this, ";
  protected final String TEXT_1752 = ".getEOperations().get(";
  protected final String TEXT_1753 = "), result = ";
  protected final String TEXT_1754 = "new ";
  protected final String TEXT_1755 = "(";
  protected final String TEXT_1756 = ".";
  protected final String TEXT_1757 = "(this";
  protected final String TEXT_1758 = ", ";
  protected final String TEXT_1759 = ")";
  protected final String TEXT_1760 = ")";
  protected final String TEXT_1761 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1762 = ".";
  protected final String TEXT_1763 = "()";
  protected final String TEXT_1764 = ";" + NL + "\t\t}";
  protected final String TEXT_1765 = NL + "\t\treturn ";
  protected final String TEXT_1766 = ".";
  protected final String TEXT_1767 = "(this";
  protected final String TEXT_1768 = ", ";
  protected final String TEXT_1769 = ");";
  protected final String TEXT_1770 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1771 = NL + "\t}" + NL;
  protected final String TEXT_1772 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1773 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1774 = NL + "\t@Override";
  protected final String TEXT_1775 = NL + "\tpublic ";
  protected final String TEXT_1776 = " eInverseAdd(";
  protected final String TEXT_1777 = " otherEnd, int featureID, ";
  protected final String TEXT_1778 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1779 = NL + "\t\t\tcase ";
  protected final String TEXT_1780 = ":";
  protected final String TEXT_1781 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1782 = "(";
  protected final String TEXT_1783 = ".InternalMapView";
  protected final String TEXT_1784 = ")";
  protected final String TEXT_1785 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1786 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1787 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1788 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1789 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1790 = "((";
  protected final String TEXT_1791 = ")otherEnd, msgs);";
  protected final String TEXT_1792 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1793 = ", msgs);";
  protected final String TEXT_1794 = NL + "\t\t\t\t";
  protected final String TEXT_1795 = " ";
  protected final String TEXT_1796 = " = (";
  protected final String TEXT_1797 = ")eVirtualGet(";
  protected final String TEXT_1798 = ");";
  protected final String TEXT_1799 = NL + "\t\t\t\tif (";
  protected final String TEXT_1800 = " != null)";
  protected final String TEXT_1801 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1802 = ")";
  protected final String TEXT_1803 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1804 = ", null, msgs);";
  protected final String TEXT_1805 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1806 = ")";
  protected final String TEXT_1807 = ").eInverseRemove(this, ";
  protected final String TEXT_1808 = ", ";
  protected final String TEXT_1809 = ".class, msgs);";
  protected final String TEXT_1810 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1811 = "((";
  protected final String TEXT_1812 = ")otherEnd, msgs);";
  protected final String TEXT_1813 = NL + "\t\t}";
  protected final String TEXT_1814 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1815 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1816 = NL + "\t}" + NL;
  protected final String TEXT_1817 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1818 = NL + "\t@Override";
  protected final String TEXT_1819 = NL + "\tpublic ";
  protected final String TEXT_1820 = " eInverseRemove(";
  protected final String TEXT_1821 = " otherEnd, int featureID, ";
  protected final String TEXT_1822 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1823 = NL + "\t\t\tcase ";
  protected final String TEXT_1824 = ":";
  protected final String TEXT_1825 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1826 = ")((";
  protected final String TEXT_1827 = ".InternalMapView";
  protected final String TEXT_1828 = ")";
  protected final String TEXT_1829 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1830 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1831 = ")((";
  protected final String TEXT_1832 = ".Internal.Wrapper)";
  protected final String TEXT_1833 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1834 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1835 = ")";
  protected final String TEXT_1836 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1837 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1838 = ", msgs);";
  protected final String TEXT_1839 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1840 = "(msgs);";
  protected final String TEXT_1841 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1842 = "(null, msgs);";
  protected final String TEXT_1843 = NL + "\t\t}";
  protected final String TEXT_1844 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1845 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1846 = NL + "\t}" + NL;
  protected final String TEXT_1847 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1848 = NL + "\t@Override";
  protected final String TEXT_1849 = NL + "\tpublic ";
  protected final String TEXT_1850 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1851 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1852 = NL + "\t\t\tcase ";
  protected final String TEXT_1853 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1854 = ", ";
  protected final String TEXT_1855 = ".class, msgs);";
  protected final String TEXT_1856 = NL + "\t\t}";
  protected final String TEXT_1857 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1858 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1859 = NL + "\t}" + NL;
  protected final String TEXT_1860 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1861 = NL + "\t@Override";
  protected final String TEXT_1862 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1863 = NL + "\t\t\tcase ";
  protected final String TEXT_1864 = ":";
  protected final String TEXT_1865 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1866 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1867 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1868 = "(";
  protected final String TEXT_1869 = "());";
  protected final String TEXT_1870 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1871 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1872 = "();";
  protected final String TEXT_1873 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1874 = ".InternalMapView";
  protected final String TEXT_1875 = ")";
  protected final String TEXT_1876 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1877 = "();";
  protected final String TEXT_1878 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1879 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1880 = "().map();";
  protected final String TEXT_1881 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1882 = ".Internal.Wrapper)";
  protected final String TEXT_1883 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1884 = "();";
  protected final String TEXT_1885 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1886 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1887 = ".Internal)";
  protected final String TEXT_1888 = "()).getWrapper();";
  protected final String TEXT_1889 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1890 = "();";
  protected final String TEXT_1891 = NL + "\t\t}";
  protected final String TEXT_1892 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1893 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1894 = NL + "\t}" + NL;
  protected final String TEXT_1895 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1896 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1897 = NL + "\t@Override";
  protected final String TEXT_1898 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1899 = NL + "\t\t\tcase ";
  protected final String TEXT_1900 = ":";
  protected final String TEXT_1901 = NL + "\t\t\t\t((";
  protected final String TEXT_1902 = ".Internal)((";
  protected final String TEXT_1903 = ".Internal.Wrapper)";
  protected final String TEXT_1904 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1905 = NL + "\t\t\t\t((";
  protected final String TEXT_1906 = ".Internal)";
  protected final String TEXT_1907 = "()).set(newValue);";
  protected final String TEXT_1908 = NL + "\t\t\t\t((";
  protected final String TEXT_1909 = ".Setting)((";
  protected final String TEXT_1910 = ".InternalMapView";
  protected final String TEXT_1911 = ")";
  protected final String TEXT_1912 = "()).eMap()).set(newValue);";
  protected final String TEXT_1913 = NL + "\t\t\t\t((";
  protected final String TEXT_1914 = ".Setting)";
  protected final String TEXT_1915 = "()).set(newValue);";
  protected final String TEXT_1916 = NL + "\t\t\t\t";
  protected final String TEXT_1917 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1918 = "().addAll((";
  protected final String TEXT_1919 = "<? extends ";
  protected final String TEXT_1920 = ">";
  protected final String TEXT_1921 = ")newValue);";
  protected final String TEXT_1922 = NL + "\t\t\t\tset";
  protected final String TEXT_1923 = "(((";
  protected final String TEXT_1924 = ")newValue).";
  protected final String TEXT_1925 = "());";
  protected final String TEXT_1926 = NL + "\t\t\t\tset";
  protected final String TEXT_1927 = "(";
  protected final String TEXT_1928 = "(";
  protected final String TEXT_1929 = ")";
  protected final String TEXT_1930 = "newValue);";
  protected final String TEXT_1931 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1932 = NL + "\t\t}";
  protected final String TEXT_1933 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1934 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1935 = NL + "\t}" + NL;
  protected final String TEXT_1936 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1937 = NL + "\t@Override";
  protected final String TEXT_1938 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1939 = NL + "\t\t\tcase ";
  protected final String TEXT_1940 = ":";
  protected final String TEXT_1941 = NL + "\t\t\t\t((";
  protected final String TEXT_1942 = ".Internal.Wrapper)";
  protected final String TEXT_1943 = "()).featureMap().clear();";
  protected final String TEXT_1944 = NL + "\t\t\t\t";
  protected final String TEXT_1945 = "().clear();";
  protected final String TEXT_1946 = NL + "\t\t\t\tunset";
  protected final String TEXT_1947 = "();";
  protected final String TEXT_1948 = NL + "\t\t\t\tset";
  protected final String TEXT_1949 = "((";
  protected final String TEXT_1950 = ")null);";
  protected final String TEXT_1951 = NL + "\t\t\t\tset";
  protected final String TEXT_1952 = "(";
  protected final String TEXT_1953 = ");";
  protected final String TEXT_1954 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1955 = NL + "\t\t}";
  protected final String TEXT_1956 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1957 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1958 = NL + "\t}" + NL;
  protected final String TEXT_1959 = NL;
  protected final String TEXT_1960 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1961 = NL + "\t@Override";
  protected final String TEXT_1962 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1963 = NL + "\t\t\tcase ";
  protected final String TEXT_1964 = ":";
  protected final String TEXT_1965 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1966 = "();";
  protected final String TEXT_1967 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1968 = ".Internal.Wrapper)";
  protected final String TEXT_1969 = "()).featureMap().isEmpty();";
  protected final String TEXT_1970 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1971 = " != null && !";
  protected final String TEXT_1972 = ".featureMap().isEmpty();";
  protected final String TEXT_1973 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1974 = " != null && !";
  protected final String TEXT_1975 = ".isEmpty();";
  protected final String TEXT_1976 = NL + "\t\t\t\t";
  protected final String TEXT_1977 = " ";
  protected final String TEXT_1978 = " = (";
  protected final String TEXT_1979 = ")eVirtualGet(";
  protected final String TEXT_1980 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1981 = " != null && !";
  protected final String TEXT_1982 = ".isEmpty();";
  protected final String TEXT_1983 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1984 = "().isEmpty();";
  protected final String TEXT_1985 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1986 = "();";
  protected final String TEXT_1987 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1988 = " != null;";
  protected final String TEXT_1989 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1990 = ") != null;";
  protected final String TEXT_1991 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1992 = "() != null;";
  protected final String TEXT_1993 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1994 = " != null;";
  protected final String TEXT_1995 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1996 = ") != null;";
  protected final String TEXT_1997 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1998 = "() != null;";
  protected final String TEXT_1999 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2000 = " & ";
  protected final String TEXT_2001 = "_EFLAG) != 0) != ";
  protected final String TEXT_2002 = ";";
  protected final String TEXT_2003 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2004 = " != ";
  protected final String TEXT_2005 = ";";
  protected final String TEXT_2006 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2007 = ", ";
  protected final String TEXT_2008 = ") != ";
  protected final String TEXT_2009 = ";";
  protected final String TEXT_2010 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2011 = "() != ";
  protected final String TEXT_2012 = ";";
  protected final String TEXT_2013 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2014 = " == null ? ";
  protected final String TEXT_2015 = " != null : !";
  protected final String TEXT_2016 = ".equals(";
  protected final String TEXT_2017 = ");";
  protected final String TEXT_2018 = NL + "\t\t\t\t";
  protected final String TEXT_2019 = " ";
  protected final String TEXT_2020 = " = (";
  protected final String TEXT_2021 = ")eVirtualGet(";
  protected final String TEXT_2022 = ", ";
  protected final String TEXT_2023 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2024 = " == null ? ";
  protected final String TEXT_2025 = " != null : !";
  protected final String TEXT_2026 = ".equals(";
  protected final String TEXT_2027 = ");";
  protected final String TEXT_2028 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2029 = " == null ? ";
  protected final String TEXT_2030 = "() != null : !";
  protected final String TEXT_2031 = ".equals(";
  protected final String TEXT_2032 = "());";
  protected final String TEXT_2033 = NL + "\t\t}";
  protected final String TEXT_2034 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2035 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2036 = NL + "\t}" + NL;
  protected final String TEXT_2037 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2038 = NL + "\t@Override";
  protected final String TEXT_2039 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2040 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2041 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2042 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2043 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2044 = ": return ";
  protected final String TEXT_2045 = ";";
  protected final String TEXT_2046 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2047 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2048 = NL + "\t@Override";
  protected final String TEXT_2049 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2050 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2051 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2052 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2053 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2054 = ": return ";
  protected final String TEXT_2055 = ";";
  protected final String TEXT_2056 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2057 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2058 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2059 = NL + "\t@Override";
  protected final String TEXT_2060 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2061 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2062 = NL + "\t@Override";
  protected final String TEXT_2063 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2064 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2065 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2066 = NL + "\t@Override";
  protected final String TEXT_2067 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2068 = NL + "\t\t\tcase ";
  protected final String TEXT_2069 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2070 = ";";
  protected final String TEXT_2071 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2072 = NL + "\t@Override";
  protected final String TEXT_2073 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2074 = NL + "\t\t\tcase ";
  protected final String TEXT_2075 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2076 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2077 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2078 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2079 = NL + "\t@Override";
  protected final String TEXT_2080 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2081 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2082 = ": \");";
  protected final String TEXT_2083 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2084 = ": \");";
  protected final String TEXT_2085 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2086 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2087 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2088 = NL + "\t\tif (";
  protected final String TEXT_2089 = "(";
  protected final String TEXT_2090 = " & ";
  protected final String TEXT_2091 = "_ESETFLAG) != 0";
  protected final String TEXT_2092 = "ESet";
  protected final String TEXT_2093 = ") result.append((";
  protected final String TEXT_2094 = " & ";
  protected final String TEXT_2095 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2096 = NL + "\t\tif (";
  protected final String TEXT_2097 = "(";
  protected final String TEXT_2098 = " & ";
  protected final String TEXT_2099 = "_ESETFLAG) != 0";
  protected final String TEXT_2100 = "ESet";
  protected final String TEXT_2101 = ") result.append(";
  protected final String TEXT_2102 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2103 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2104 = ", ";
  protected final String TEXT_2105 = "));";
  protected final String TEXT_2106 = NL + "\t\tresult.append((";
  protected final String TEXT_2107 = " & ";
  protected final String TEXT_2108 = "_EFLAG) != 0);";
  protected final String TEXT_2109 = NL + "\t\tresult.append(";
  protected final String TEXT_2110 = ");";
  protected final String TEXT_2111 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2112 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2113 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2114 = " getKey()" + NL + "\t{";
  protected final String TEXT_2115 = NL + "\t\treturn new ";
  protected final String TEXT_2116 = "(getTypedKey());";
  protected final String TEXT_2117 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2118 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2119 = " key)" + NL + "\t{";
  protected final String TEXT_2120 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2121 = "(";
  protected final String TEXT_2122 = ")";
  protected final String TEXT_2123 = "key);";
  protected final String TEXT_2124 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2125 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2126 = ")key).";
  protected final String TEXT_2127 = "());";
  protected final String TEXT_2128 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2129 = ")key);";
  protected final String TEXT_2130 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2131 = " getValue()" + NL + "\t{";
  protected final String TEXT_2132 = NL + "\t\treturn new ";
  protected final String TEXT_2133 = "(getTypedValue());";
  protected final String TEXT_2134 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2135 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2136 = " setValue(";
  protected final String TEXT_2137 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2138 = " oldValue = getValue();";
  protected final String TEXT_2139 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2140 = "(";
  protected final String TEXT_2141 = ")";
  protected final String TEXT_2142 = "value);";
  protected final String TEXT_2143 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2144 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2145 = ")value).";
  protected final String TEXT_2146 = "());";
  protected final String TEXT_2147 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2148 = ")value);";
  protected final String TEXT_2149 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2150 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2151 = NL + "\tpublic ";
  protected final String TEXT_2152 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2153 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2154 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2155 = NL;
  protected final String TEXT_2156 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2157 = " create(";
  protected final String TEXT_2158 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2159 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2160 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2161 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2162 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2163 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2164 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2165 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2166 = NL + "\t@Override";
  protected final String TEXT_2167 = NL + "\tprotected ";
  protected final String TEXT_2168 = " ";
  protected final String TEXT_2169 = "Helper(";
  protected final String TEXT_2170 = " ";
  protected final String TEXT_2171 = ")" + NL + "\t{";
  protected final String TEXT_2172 = NL + "\t\t";
  protected final String TEXT_2173 = ".addAll(super.";
  protected final String TEXT_2174 = "());";
  protected final String TEXT_2175 = NL + "\t\tsuper.";
  protected final String TEXT_2176 = "Helper(";
  protected final String TEXT_2177 = ");";
  protected final String TEXT_2178 = NL + "\t\tif (isSet";
  protected final String TEXT_2179 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2180 = "<";
  protected final String TEXT_2181 = ">";
  protected final String TEXT_2182 = " i = ((";
  protected final String TEXT_2183 = ") ";
  protected final String TEXT_2184 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2185 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2186 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2187 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2188 = "<";
  protected final String TEXT_2189 = ">";
  protected final String TEXT_2190 = " i = ((";
  protected final String TEXT_2191 = ") ";
  protected final String TEXT_2192 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2193 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2194 = NL + "\t\t";
  protected final String TEXT_2195 = " ";
  protected final String TEXT_2196 = " = ";
  protected final String TEXT_2197 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2198 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2199 = "<";
  protected final String TEXT_2200 = ">";
  protected final String TEXT_2201 = " i = ((";
  protected final String TEXT_2202 = ") ";
  protected final String TEXT_2203 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2204 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2205 = NL + "\t\tif (isSet";
  protected final String TEXT_2206 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2207 = ".addAll(";
  protected final String TEXT_2208 = "());" + NL + "\t\t}";
  protected final String TEXT_2209 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2210 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2211 = ".addAll(";
  protected final String TEXT_2212 = "());" + NL + "\t\t}";
  protected final String TEXT_2213 = NL + "\t\t";
  protected final String TEXT_2214 = " ";
  protected final String TEXT_2215 = " = ";
  protected final String TEXT_2216 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2217 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2218 = ".addAll(";
  protected final String TEXT_2219 = ");" + NL + "\t\t}";
  protected final String TEXT_2220 = NL + "\t\tif (isSet";
  protected final String TEXT_2221 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2222 = ".add(";
  protected final String TEXT_2223 = "basicGet";
  protected final String TEXT_2224 = "());" + NL + "\t\t}";
  protected final String TEXT_2225 = NL + "\t\t";
  protected final String TEXT_2226 = " ";
  protected final String TEXT_2227 = " = ";
  protected final String TEXT_2228 = "basicGet";
  protected final String TEXT_2229 = "();" + NL + "\t\tif (";
  protected final String TEXT_2230 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2231 = ".add(";
  protected final String TEXT_2232 = ");" + NL + "\t\t}";
  protected final String TEXT_2233 = NL + "\t\treturn ";
  protected final String TEXT_2234 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2235 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2236 = NL;
  protected final String TEXT_2237 = NL + "\t@Override";
  protected final String TEXT_2238 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2239 = "()" + NL + "\t{";
  protected final String TEXT_2240 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2241 = "()";
  protected final String TEXT_2242 = NL + "\t\treturn isSet";
  protected final String TEXT_2243 = "()";
  protected final String TEXT_2244 = ";";
  protected final String TEXT_2245 = NL + "\t\treturn !";
  protected final String TEXT_2246 = "().isEmpty()";
  protected final String TEXT_2247 = ";";
  protected final String TEXT_2248 = NL + "\t\treturn ";
  protected final String TEXT_2249 = "basicGet";
  protected final String TEXT_2250 = "() != null";
  protected final String TEXT_2251 = ";";
  protected final String TEXT_2252 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2253 = ")";
  protected final String TEXT_2254 = ";";
  protected final String TEXT_2255 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2256 = "()";
  protected final String TEXT_2257 = ";";
  protected final String TEXT_2258 = NL + "\t\t\t|| !";
  protected final String TEXT_2259 = "().isEmpty()";
  protected final String TEXT_2260 = ";";
  protected final String TEXT_2261 = NL + "\t\t\t|| ";
  protected final String TEXT_2262 = "basicGet";
  protected final String TEXT_2263 = "() != null";
  protected final String TEXT_2264 = ";";
  protected final String TEXT_2265 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2266 = ")";
  protected final String TEXT_2267 = ";";
  protected final String TEXT_2268 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2269 = "();";
  protected final String TEXT_2270 = NL + "\t\treturn false;";
  protected final String TEXT_2271 = NL + "\t}" + NL;
  protected final String TEXT_2272 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2273 = NL;
  protected final String TEXT_2274 = NL + "\t@Override";
  protected final String TEXT_2275 = NL + "\tpublic ";
  protected final String TEXT_2276 = " ";
  protected final String TEXT_2277 = "()" + NL + "\t{";
  protected final String TEXT_2278 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2279 = " ";
  protected final String TEXT_2280 = " = (";
  protected final String TEXT_2281 = ")((";
  protected final String TEXT_2282 = ")";
  protected final String TEXT_2283 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2284 = ";";
  protected final String TEXT_2285 = NL + "\t\treturn ";
  protected final String TEXT_2286 = "();";
  protected final String TEXT_2287 = NL + "\t\treturn new ";
  protected final String TEXT_2288 = ".UnmodifiableEList";
  protected final String TEXT_2289 = "(this, ";
  protected final String TEXT_2290 = "null";
  protected final String TEXT_2291 = ", 0, ";
  protected final String TEXT_2292 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2293 = NL + "\t\treturn null;";
  protected final String TEXT_2294 = NL + "\t\treturn ";
  protected final String TEXT_2295 = "();";
  protected final String TEXT_2296 = NL + "\t}" + NL;
  protected final String TEXT_2297 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2298 = NL;
  protected final String TEXT_2299 = NL + "\t@Override";
  protected final String TEXT_2300 = NL + "\tpublic ";
  protected final String TEXT_2301 = " basicGet";
  protected final String TEXT_2302 = "()" + NL + "\t{";
  protected final String TEXT_2303 = NL + "\t\treturn null;";
  protected final String TEXT_2304 = NL + "\t\treturn ";
  protected final String TEXT_2305 = "basicGet";
  protected final String TEXT_2306 = "();";
  protected final String TEXT_2307 = NL + "\t}" + NL;
  protected final String TEXT_2308 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2309 = NL;
  protected final String TEXT_2310 = NL + "\t@Override";
  protected final String TEXT_2311 = NL + "\tpublic ";
  protected final String TEXT_2312 = " basicSet";
  protected final String TEXT_2313 = "(";
  protected final String TEXT_2314 = " new";
  protected final String TEXT_2315 = ", ";
  protected final String TEXT_2316 = " msgs)" + NL + "\t{";
  protected final String TEXT_2317 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2318 = NL + "\t\tif (new";
  protected final String TEXT_2319 = " != null && !(new";
  protected final String TEXT_2320 = " instanceof ";
  protected final String TEXT_2321 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2322 = "));" + NL + "\t\t}";
  protected final String TEXT_2323 = NL + "\t\treturn basicSet";
  protected final String TEXT_2324 = "(";
  protected final String TEXT_2325 = "(";
  protected final String TEXT_2326 = ") ";
  protected final String TEXT_2327 = "new";
  protected final String TEXT_2328 = ", msgs);";
  protected final String TEXT_2329 = NL + "\t\tset";
  protected final String TEXT_2330 = "(";
  protected final String TEXT_2331 = "(";
  protected final String TEXT_2332 = ") ";
  protected final String TEXT_2333 = "new";
  protected final String TEXT_2334 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2335 = NL + "\t}" + NL;
  protected final String TEXT_2336 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2337 = NL;
  protected final String TEXT_2338 = NL + "\t@Override";
  protected final String TEXT_2339 = NL + "\tpublic void set";
  protected final String TEXT_2340 = "(";
  protected final String TEXT_2341 = " new";
  protected final String TEXT_2342 = ")" + NL + "\t{";
  protected final String TEXT_2343 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2344 = NL + "\t\tif (new";
  protected final String TEXT_2345 = " != null && !(new";
  protected final String TEXT_2346 = " instanceof ";
  protected final String TEXT_2347 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2348 = "));" + NL + "\t\t}";
  protected final String TEXT_2349 = NL + "\t\tset";
  protected final String TEXT_2350 = "(";
  protected final String TEXT_2351 = "(";
  protected final String TEXT_2352 = ") ";
  protected final String TEXT_2353 = "new";
  protected final String TEXT_2354 = ");";
  protected final String TEXT_2355 = NL + "\t}" + NL;
  protected final String TEXT_2356 = NL;
  protected final String TEXT_2357 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2358 = "() <em>";
  protected final String TEXT_2359 = "</em>}' ";
  protected final String TEXT_2360 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2361 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2362 = "_ESUBSETS = ";
  protected final String TEXT_2363 = ";" + NL;
  protected final String TEXT_2364 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2365 = "() <em>";
  protected final String TEXT_2366 = "</em>}' ";
  protected final String TEXT_2367 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2368 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2369 = "_ESUPERSETS = ";
  protected final String TEXT_2370 = ";" + NL;
  protected final String TEXT_2371 = NL + "\t/**";
  protected final String TEXT_2372 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2373 = "}, with the specified ";
  protected final String TEXT_2374 = ", and appends it to the '<em><b>";
  protected final String TEXT_2375 = "</b></em>' ";
  protected final String TEXT_2376 = ".";
  protected final String TEXT_2377 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2378 = "}, with the specified ";
  protected final String TEXT_2379 = ", and sets the '<em><b>";
  protected final String TEXT_2380 = "</b></em>' ";
  protected final String TEXT_2381 = ".";
  protected final String TEXT_2382 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2383 = "} and appends it to the '<em><b>";
  protected final String TEXT_2384 = "</b></em>' ";
  protected final String TEXT_2385 = ".";
  protected final String TEXT_2386 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2387 = "} and sets the '<em><b>";
  protected final String TEXT_2388 = "</b></em>' ";
  protected final String TEXT_2389 = ".";
  protected final String TEXT_2390 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2391 = NL + "\t * @param ";
  protected final String TEXT_2392 = " The ";
  protected final String TEXT_2393 = " for the new {@link ";
  protected final String TEXT_2394 = "}, or <code>null</code>.";
  protected final String TEXT_2395 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2396 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2397 = "}." + NL + "\t * @see #";
  protected final String TEXT_2398 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2399 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2400 = NL + "\t";
  protected final String TEXT_2401 = " create";
  protected final String TEXT_2402 = "(";
  protected final String TEXT_2403 = ", ";
  protected final String TEXT_2404 = " eClass);" + NL;
  protected final String TEXT_2405 = NL + "\t@Override";
  protected final String TEXT_2406 = NL + "\tpublic ";
  protected final String TEXT_2407 = " create";
  protected final String TEXT_2408 = "(";
  protected final String TEXT_2409 = ", ";
  protected final String TEXT_2410 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2411 = " new";
  protected final String TEXT_2412 = " = (";
  protected final String TEXT_2413 = ") create(eClass);";
  protected final String TEXT_2414 = NL + "\t\t";
  protected final String TEXT_2415 = "().add(new";
  protected final String TEXT_2416 = ");";
  protected final String TEXT_2417 = NL + "\t\tset";
  protected final String TEXT_2418 = "(new";
  protected final String TEXT_2419 = ");";
  protected final String TEXT_2420 = NL + "\t\tint ";
  protected final String TEXT_2421 = "ListSize = 0;";
  protected final String TEXT_2422 = NL + "\t\tint ";
  protected final String TEXT_2423 = "Size = ";
  protected final String TEXT_2424 = " == null ? 0 : ";
  protected final String TEXT_2425 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2426 = "Size > ";
  protected final String TEXT_2427 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2428 = "ListSize = ";
  protected final String TEXT_2429 = "Size;";
  protected final String TEXT_2430 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2431 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2432 = ".create";
  protected final String TEXT_2433 = "(";
  protected final String TEXT_2434 = ", ";
  protected final String TEXT_2435 = "i < ";
  protected final String TEXT_2436 = "Size ? (";
  protected final String TEXT_2437 = ") ";
  protected final String TEXT_2438 = ".get(i) : null";
  protected final String TEXT_2439 = ");" + NL + "\t\t}";
  protected final String TEXT_2440 = NL + "\t\tnew";
  protected final String TEXT_2441 = ".create";
  protected final String TEXT_2442 = "(";
  protected final String TEXT_2443 = ", ";
  protected final String TEXT_2444 = ");";
  protected final String TEXT_2445 = NL + "\t\tif (";
  protected final String TEXT_2446 = " != null)";
  protected final String TEXT_2447 = NL + "\t\t\tnew";
  protected final String TEXT_2448 = ".";
  protected final String TEXT_2449 = "().addAll(";
  protected final String TEXT_2450 = ");";
  protected final String TEXT_2451 = NL + "\t\t\tnew";
  protected final String TEXT_2452 = ".set";
  protected final String TEXT_2453 = "(";
  protected final String TEXT_2454 = ");";
  protected final String TEXT_2455 = NL + "\t\treturn new";
  protected final String TEXT_2456 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2457 = NL + "\t/**";
  protected final String TEXT_2458 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2459 = "}, with the specified ";
  protected final String TEXT_2460 = ", and appends it to the '<em><b>";
  protected final String TEXT_2461 = "</b></em>' ";
  protected final String TEXT_2462 = ".";
  protected final String TEXT_2463 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2464 = "},with the specified ";
  protected final String TEXT_2465 = ", and sets the '<em><b>";
  protected final String TEXT_2466 = "</b></em>' ";
  protected final String TEXT_2467 = ".";
  protected final String TEXT_2468 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2469 = "} and appends it to the '<em><b>";
  protected final String TEXT_2470 = "</b></em>' ";
  protected final String TEXT_2471 = ".";
  protected final String TEXT_2472 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2473 = "} and sets the '<em><b>";
  protected final String TEXT_2474 = "</b></em>' ";
  protected final String TEXT_2475 = ".";
  protected final String TEXT_2476 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2477 = NL + "\t * @param ";
  protected final String TEXT_2478 = " The ";
  protected final String TEXT_2479 = " for the new {@link ";
  protected final String TEXT_2480 = "}, or <code>null</code>.";
  protected final String TEXT_2481 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2482 = "}." + NL + "\t * @see #";
  protected final String TEXT_2483 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2484 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2485 = NL + "\t";
  protected final String TEXT_2486 = " create";
  protected final String TEXT_2487 = "(";
  protected final String TEXT_2488 = ");" + NL;
  protected final String TEXT_2489 = NL + "\t@Override";
  protected final String TEXT_2490 = NL + "\tpublic ";
  protected final String TEXT_2491 = " create";
  protected final String TEXT_2492 = "(";
  protected final String TEXT_2493 = ")" + NL + "\t{";
  protected final String TEXT_2494 = NL + "\t\treturn create";
  protected final String TEXT_2495 = "(";
  protected final String TEXT_2496 = ", ";
  protected final String TEXT_2497 = ");";
  protected final String TEXT_2498 = NL + "\t\t";
  protected final String TEXT_2499 = " new";
  protected final String TEXT_2500 = " = (";
  protected final String TEXT_2501 = ") create(";
  protected final String TEXT_2502 = ");";
  protected final String TEXT_2503 = NL + "\t\t";
  protected final String TEXT_2504 = "().add(new";
  protected final String TEXT_2505 = ");";
  protected final String TEXT_2506 = NL + "\t\tset";
  protected final String TEXT_2507 = "(new";
  protected final String TEXT_2508 = ");";
  protected final String TEXT_2509 = NL + "\t\tint ";
  protected final String TEXT_2510 = "ListSize = 0;";
  protected final String TEXT_2511 = NL + "\t\tint ";
  protected final String TEXT_2512 = "Size = ";
  protected final String TEXT_2513 = " == null ? 0 : ";
  protected final String TEXT_2514 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2515 = "Size > ";
  protected final String TEXT_2516 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2517 = "ListSize = ";
  protected final String TEXT_2518 = "Size;";
  protected final String TEXT_2519 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2520 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2521 = ".create";
  protected final String TEXT_2522 = "(";
  protected final String TEXT_2523 = ", ";
  protected final String TEXT_2524 = "i < ";
  protected final String TEXT_2525 = "Size ? (";
  protected final String TEXT_2526 = ") ";
  protected final String TEXT_2527 = ".get(i) : null";
  protected final String TEXT_2528 = ");" + NL + "\t\t}";
  protected final String TEXT_2529 = NL + "\t\tnew";
  protected final String TEXT_2530 = ".create";
  protected final String TEXT_2531 = "(";
  protected final String TEXT_2532 = ", ";
  protected final String TEXT_2533 = ");";
  protected final String TEXT_2534 = NL + "\t\tif (";
  protected final String TEXT_2535 = " != null)";
  protected final String TEXT_2536 = NL + "\t\t\tnew";
  protected final String TEXT_2537 = ".";
  protected final String TEXT_2538 = "().addAll(";
  protected final String TEXT_2539 = ");";
  protected final String TEXT_2540 = NL + "\t\t\tnew";
  protected final String TEXT_2541 = ".set";
  protected final String TEXT_2542 = "(";
  protected final String TEXT_2543 = ");";
  protected final String TEXT_2544 = NL + "\t\treturn new";
  protected final String TEXT_2545 = ";";
  protected final String TEXT_2546 = NL + "\t}" + NL;
  protected final String TEXT_2547 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2548 = "} with the specified ";
  protected final String TEXT_2549 = " from the '<em><b>";
  protected final String TEXT_2550 = "</b></em>' ";
  protected final String TEXT_2551 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2552 = NL + "\t * @param ";
  protected final String TEXT_2553 = " The ";
  protected final String TEXT_2554 = " of the {@link ";
  protected final String TEXT_2555 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2556 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2557 = "} with the specified ";
  protected final String TEXT_2558 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2559 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2560 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2561 = NL + "\t";
  protected final String TEXT_2562 = " get";
  protected final String TEXT_2563 = "(";
  protected final String TEXT_2564 = ");" + NL;
  protected final String TEXT_2565 = NL + "\t@Override";
  protected final String TEXT_2566 = NL + "\tpublic ";
  protected final String TEXT_2567 = " get";
  protected final String TEXT_2568 = "(";
  protected final String TEXT_2569 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2570 = "(";
  protected final String TEXT_2571 = ", false";
  protected final String TEXT_2572 = ", null";
  protected final String TEXT_2573 = ", false";
  protected final String TEXT_2574 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2575 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2576 = "} with the specified ";
  protected final String TEXT_2577 = " from the '<em><b>";
  protected final String TEXT_2578 = "</b></em>' ";
  protected final String TEXT_2579 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2580 = NL + "\t * @param ";
  protected final String TEXT_2581 = " The ";
  protected final String TEXT_2582 = " of the {@link ";
  protected final String TEXT_2583 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2584 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2585 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2586 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2587 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2588 = "} on demand if not found.";
  protected final String TEXT_2589 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2590 = "} with the specified ";
  protected final String TEXT_2591 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2592 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2593 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2594 = NL + "\t";
  protected final String TEXT_2595 = " get";
  protected final String TEXT_2596 = "(";
  protected final String TEXT_2597 = ", boolean ignoreCase";
  protected final String TEXT_2598 = ", ";
  protected final String TEXT_2599 = " eClass";
  protected final String TEXT_2600 = ", boolean createOnDemand";
  protected final String TEXT_2601 = ");" + NL;
  protected final String TEXT_2602 = NL + "\t@Override";
  protected final String TEXT_2603 = NL + "\tpublic ";
  protected final String TEXT_2604 = " get";
  protected final String TEXT_2605 = "(";
  protected final String TEXT_2606 = ", boolean ignoreCase";
  protected final String TEXT_2607 = ", ";
  protected final String TEXT_2608 = " eClass";
  protected final String TEXT_2609 = ", boolean createOnDemand";
  protected final String TEXT_2610 = ")" + NL + "\t{";
  protected final String TEXT_2611 = NL + "\t\t";
  protected final String TEXT_2612 = "Loop: for (";
  protected final String TEXT_2613 = " ";
  protected final String TEXT_2614 = " : ";
  protected final String TEXT_2615 = "())" + NL + "\t\t{";
  protected final String TEXT_2616 = NL + "\t\t";
  protected final String TEXT_2617 = "Loop: for (";
  protected final String TEXT_2618 = " i = ";
  protected final String TEXT_2619 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2620 = " ";
  protected final String TEXT_2621 = " = (";
  protected final String TEXT_2622 = ") i.next();";
  protected final String TEXT_2623 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2624 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2625 = "Loop;";
  protected final String TEXT_2626 = NL + "\t\t\t";
  protected final String TEXT_2627 = " ";
  protected final String TEXT_2628 = "List = ";
  protected final String TEXT_2629 = ".";
  protected final String TEXT_2630 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2631 = "ListSize = ";
  protected final String TEXT_2632 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2633 = " || (";
  protected final String TEXT_2634 = " != null && ";
  protected final String TEXT_2635 = ".size() != ";
  protected final String TEXT_2636 = "ListSize";
  protected final String TEXT_2637 = ")";
  protected final String TEXT_2638 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2639 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2640 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2641 = " ";
  protected final String TEXT_2642 = " = ";
  protected final String TEXT_2643 = "(";
  protected final String TEXT_2644 = ") ";
  protected final String TEXT_2645 = "List.get(j);";
  protected final String TEXT_2646 = NL + "\t\t\t\tif (";
  protected final String TEXT_2647 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2648 = "(";
  protected final String TEXT_2649 = ")";
  protected final String TEXT_2650 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2651 = ".";
  protected final String TEXT_2652 = "()) : ";
  protected final String TEXT_2653 = ".get(j).equals(";
  protected final String TEXT_2654 = ".";
  protected final String TEXT_2655 = "())))";
  protected final String TEXT_2656 = NL + "\t\t\t\tif (";
  protected final String TEXT_2657 = " != null && !";
  protected final String TEXT_2658 = ".get(j).equals(";
  protected final String TEXT_2659 = ".";
  protected final String TEXT_2660 = "()))";
  protected final String TEXT_2661 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2662 = "Loop;";
  protected final String TEXT_2663 = NL + "\t\t\t}";
  protected final String TEXT_2664 = NL + "\t\t\t";
  protected final String TEXT_2665 = " ";
  protected final String TEXT_2666 = " = ";
  protected final String TEXT_2667 = ".";
  protected final String TEXT_2668 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2669 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2670 = "Loop;";
  protected final String TEXT_2671 = NL + "\t\t\tif (";
  protected final String TEXT_2672 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2673 = ".equalsIgnoreCase(";
  protected final String TEXT_2674 = ".";
  protected final String TEXT_2675 = "()) : ";
  protected final String TEXT_2676 = ".equals(";
  protected final String TEXT_2677 = ".";
  protected final String TEXT_2678 = "())))";
  protected final String TEXT_2679 = NL + "\t\t\tif (";
  protected final String TEXT_2680 = " != null && !";
  protected final String TEXT_2681 = ".equals(";
  protected final String TEXT_2682 = ".";
  protected final String TEXT_2683 = "()))";
  protected final String TEXT_2684 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2685 = "Loop;";
  protected final String TEXT_2686 = NL + "\t\t\tif (";
  protected final String TEXT_2687 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2688 = ".equalsIgnoreCase(";
  protected final String TEXT_2689 = ".";
  protected final String TEXT_2690 = "()) : ";
  protected final String TEXT_2691 = ".equals(";
  protected final String TEXT_2692 = ".";
  protected final String TEXT_2693 = "())))";
  protected final String TEXT_2694 = NL + "\t\t\tif (";
  protected final String TEXT_2695 = " != null && !";
  protected final String TEXT_2696 = ".equals(";
  protected final String TEXT_2697 = ".";
  protected final String TEXT_2698 = "()))";
  protected final String TEXT_2699 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2700 = "Loop;";
  protected final String TEXT_2701 = NL + "\t\t\treturn ";
  protected final String TEXT_2702 = ";" + NL + "\t\t}";
  protected final String TEXT_2703 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2704 = " && eClass != null";
  protected final String TEXT_2705 = " ? create";
  protected final String TEXT_2706 = "(";
  protected final String TEXT_2707 = ", eClass";
  protected final String TEXT_2708 = ") : null;";
  protected final String TEXT_2709 = NL + "\t\treturn null;";
  protected final String TEXT_2710 = NL + "\t}" + NL;
  protected final String TEXT_2711 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2712 = "()" + NL + "\t{";
  protected final String TEXT_2713 = NL + "  \t\treturn false;";
  protected final String TEXT_2714 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2715 = ");";
  protected final String TEXT_2716 = NL + "\t\treturn !((";
  protected final String TEXT_2717 = ".Internal.Wrapper)";
  protected final String TEXT_2718 = "()).featureMap().isEmpty();";
  protected final String TEXT_2719 = NL + "\t\treturn ";
  protected final String TEXT_2720 = " != null && !";
  protected final String TEXT_2721 = ".featureMap().isEmpty();";
  protected final String TEXT_2722 = NL + "\t\treturn ";
  protected final String TEXT_2723 = " != null && !";
  protected final String TEXT_2724 = ".isEmpty();";
  protected final String TEXT_2725 = NL + "\t\t";
  protected final String TEXT_2726 = " ";
  protected final String TEXT_2727 = " = (";
  protected final String TEXT_2728 = ")eVirtualGet(";
  protected final String TEXT_2729 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2730 = " != null && !";
  protected final String TEXT_2731 = ".isEmpty();";
  protected final String TEXT_2732 = NL + "\t\treturn !";
  protected final String TEXT_2733 = "().isEmpty();";
  protected final String TEXT_2734 = NL + "\t\treturn ";
  protected final String TEXT_2735 = " != null;";
  protected final String TEXT_2736 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2737 = ") != null;";
  protected final String TEXT_2738 = NL + "\t\treturn basicGet";
  protected final String TEXT_2739 = "() != null;";
  protected final String TEXT_2740 = NL + "\t\treturn ";
  protected final String TEXT_2741 = " != null;";
  protected final String TEXT_2742 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2743 = ") != null;";
  protected final String TEXT_2744 = NL + "\t\treturn ";
  protected final String TEXT_2745 = "() != null;";
  protected final String TEXT_2746 = NL + "\t\treturn ((";
  protected final String TEXT_2747 = " & ";
  protected final String TEXT_2748 = "_EFLAG) != 0) != ";
  protected final String TEXT_2749 = ";";
  protected final String TEXT_2750 = NL + "\t\treturn ";
  protected final String TEXT_2751 = " != ";
  protected final String TEXT_2752 = ";";
  protected final String TEXT_2753 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2754 = ", ";
  protected final String TEXT_2755 = ") != ";
  protected final String TEXT_2756 = ";";
  protected final String TEXT_2757 = NL + "\t\treturn ";
  protected final String TEXT_2758 = "() != ";
  protected final String TEXT_2759 = ";";
  protected final String TEXT_2760 = NL + "\t\treturn ";
  protected final String TEXT_2761 = " == null ? ";
  protected final String TEXT_2762 = " != null : !";
  protected final String TEXT_2763 = ".equals(";
  protected final String TEXT_2764 = ");";
  protected final String TEXT_2765 = NL + "\t\t";
  protected final String TEXT_2766 = " ";
  protected final String TEXT_2767 = " = (";
  protected final String TEXT_2768 = ")eVirtualGet(";
  protected final String TEXT_2769 = ", ";
  protected final String TEXT_2770 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2771 = " == null ? ";
  protected final String TEXT_2772 = " != null : !";
  protected final String TEXT_2773 = ".equals(";
  protected final String TEXT_2774 = ");";
  protected final String TEXT_2775 = NL + "\t\treturn ";
  protected final String TEXT_2776 = " == null ? ";
  protected final String TEXT_2777 = "() != null : !";
  protected final String TEXT_2778 = ".equals(";
  protected final String TEXT_2779 = "());";
  protected final String TEXT_2780 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2781 = ");";
  protected final String TEXT_2782 = NL + "\t\t";
  protected final String TEXT_2783 = " ";
  protected final String TEXT_2784 = " = (";
  protected final String TEXT_2785 = ")eVirtualGet(";
  protected final String TEXT_2786 = ");";
  protected final String TEXT_2787 = NL + "\t\treturn ";
  protected final String TEXT_2788 = " != null && ((";
  protected final String TEXT_2789 = ".Unsettable";
  protected final String TEXT_2790 = ")";
  protected final String TEXT_2791 = ").isSet();";
  protected final String TEXT_2792 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2793 = ");";
  protected final String TEXT_2794 = NL + "\t\treturn (";
  protected final String TEXT_2795 = " & ";
  protected final String TEXT_2796 = "_ESETFLAG) != 0;";
  protected final String TEXT_2797 = NL + "\t\treturn ";
  protected final String TEXT_2798 = "ESet;";
  protected final String TEXT_2799 = NL + "\t\treturn !((";
  protected final String TEXT_2800 = ".Internal)((";
  protected final String TEXT_2801 = ".Internal.Wrapper)get";
  protected final String TEXT_2802 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2803 = ");";
  protected final String TEXT_2804 = NL + "\t\treturn !((";
  protected final String TEXT_2805 = ".Internal)get";
  protected final String TEXT_2806 = "()).isEmpty(";
  protected final String TEXT_2807 = ");";
  protected final String TEXT_2808 = NL;
  protected final String TEXT_2809 = NL + "\t\treturn ";
  protected final String TEXT_2810 = ".";
  protected final String TEXT_2811 = "(this);";
  protected final String TEXT_2812 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2813 = "' ";
  protected final String TEXT_2814 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2815 = NL + "\t}" + NL;
  protected final String TEXT_2816 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2817 = NL;
  protected final String TEXT_2818 = NL + "\t@Override";
  protected final String TEXT_2819 = NL + "\tpublic ";
  protected final String TEXT_2820 = " ";
  protected final String TEXT_2821 = "(";
  protected final String TEXT_2822 = ")";
  protected final String TEXT_2823 = NL + "\t{";
  protected final String TEXT_2824 = NL + "\t\t";
  protected final String TEXT_2825 = "(";
  protected final String TEXT_2826 = ");";
  protected final String TEXT_2827 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2828 = NL + "\t\treturn ";
  protected final String TEXT_2829 = "(";
  protected final String TEXT_2830 = ");";
  protected final String TEXT_2831 = NL + "\t}" + NL;
  protected final String TEXT_2832 = NL + "} //";
  protected final String TEXT_2833 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
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
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    if (isInterface) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_7);
    } else {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_11);
    if (isInterface) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_13);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_17);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_21);
    }
    }
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_26);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_27);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_29);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_31);
    } else {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_33);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_34);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_41);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_45);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_49);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_53);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_54);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_56);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_58);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_60);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_67);
    }
    if (genModel.isArrayAccessors() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_74);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_79);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_80);
    }
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_84);
    } else {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_87);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_89);
    }
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_96);
    } else {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_104);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_106);
    }
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_111);
    } else {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_115);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_117);
    for (GenFeature genFeature : genClass.getFlagGenFeatures("true")) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_125);
    }
    if (isImplementation && genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL && (genClass.getClassExtendsGenClass() == null || genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL)) {
    stringBuffer.append(TEXT_126);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_127);
    }
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_129);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_130);
    if (!isImplementation) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_133);
    } else {
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_136);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_141);
    } else {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    }
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_151);
    if (!isImplementation) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_154);
    } else {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_159);
    }
    stringBuffer.append(TEXT_160);
    if (!isImplementation) {
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_162);
    } else {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_164);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_166);
    } else {
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_169);
    }
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    if (!isImplementation) {
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_175);
    } else {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_183);
    }
    stringBuffer.append(TEXT_184);
    if (!isImplementation) {
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_187);
    } else {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_191);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_194);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_195);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_197);
    } else {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_199);
    }
    stringBuffer.append(TEXT_200);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_201);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_202);
    } else {
    stringBuffer.append(TEXT_203);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_204);
    }
    stringBuffer.append(TEXT_205);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_207);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_209);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_211);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_212);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_215);
    }
    }
    stringBuffer.append(TEXT_216);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_225);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_228);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_230);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_233);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_236);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_239);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_240);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_241);
    }}
    stringBuffer.append(TEXT_242);
    } else {
    stringBuffer.append(TEXT_243);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_244);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_245);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_248);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast() || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_249);
    }
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_252);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_253);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_254);
    }
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_257);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_259);
    }
    stringBuffer.append(TEXT_260);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_265);
    }
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_267);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_271);
    } else {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_276);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_279);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_285);
    }
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_297);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_302);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_306);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_311);
    }
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_316);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_319);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_321);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_324);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_330);
    }
    stringBuffer.append(TEXT_331);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_335);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_338);
    } else {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_340);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_350);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_357);
    } else {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_362);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_364);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_366);
    } else {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_369);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_370);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_371);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_373);
    }
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_375);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_377);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_379);
    }
    stringBuffer.append(TEXT_380);
    } else {
    stringBuffer.append(TEXT_381);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_382);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_387);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_389);
    }
    stringBuffer.append(TEXT_390);
    }
    }
    } else {
    stringBuffer.append(TEXT_391);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_393);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_394);
    }
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_397);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_398);
    }
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_400);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_401);
    }
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_403);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_405);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_407);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_409);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_411);
    }
    stringBuffer.append(TEXT_412);
    }
    stringBuffer.append(TEXT_413);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_415);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_418);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_419);
    }
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_429);
    }
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_431);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_433);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_437);
    }
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_447);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_448);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_451);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_452);
    }
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_464);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_465);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_467);
    }
    stringBuffer.append(TEXT_468);
    }
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_473);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_474);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_475);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_476);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_478);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_481);
    } else {
    stringBuffer.append(TEXT_482);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_485);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_487);
    }
    }
    }
    }
    stringBuffer.append(TEXT_488);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_490);
    } else {
    stringBuffer.append(TEXT_491);
    }
    stringBuffer.append(TEXT_492);
    }
    } else {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_495);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_496);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_497);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_498);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_499);
    }
    }
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_502);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_505);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_508);
    } else {
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_510);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_513);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_515);
    } else {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_517);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_519);
    }
    } else {
    stringBuffer.append(TEXT_520);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_521);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_523);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_525);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_527);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_529);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_531);
    } else {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_534);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_536);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_537);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_538);
    }
    }
    }
    }
    stringBuffer.append(TEXT_539);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_541);
    } else {
    stringBuffer.append(TEXT_542);
    }
    stringBuffer.append(TEXT_543);
    } else {
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_546);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_547);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_548);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_549);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_550);
    }
    }
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_556);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_560);
    stringBuffer.append(TEXT_561);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_563);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_564);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_567);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_568);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_570);
    }
    stringBuffer.append(TEXT_571);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_575);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_585);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_586);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_589);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_592);
    }
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_594);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_597);
    }
    stringBuffer.append(TEXT_598);
    }
    stringBuffer.append(TEXT_599);
    }
    stringBuffer.append(TEXT_600);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_604);
    } else {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_618);
    } else {
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_622);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_623);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_628);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_633);
    } else {
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_635);
    }
    stringBuffer.append(TEXT_636);
    } else {
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_641);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_646);
    }
    stringBuffer.append(TEXT_647);
    }
    stringBuffer.append(TEXT_648);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_650);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_654);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_655);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_657);
    }
    stringBuffer.append(TEXT_658);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_661);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_662);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_664);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_665);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_672);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_676);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_677);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_679);
    }
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_682);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_684);
    }
    stringBuffer.append(TEXT_685);
    }
    stringBuffer.append(TEXT_686);
    }
    stringBuffer.append(TEXT_687);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_690);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_693);
    } else {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_698);
    }
    } else {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_701);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_702);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_709);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_712);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_714);
    }
    }
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_716);
    } else {
    stringBuffer.append(TEXT_717);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_718);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_719);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_722);
    } else {
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    stringBuffer.append(TEXT_727);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_732);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_734);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_736);
    }
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_738);
    }
    stringBuffer.append(TEXT_739);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_752);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_753);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_763);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_768);
    }
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_773);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_781);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_785);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_790);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_791);
    }
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_795);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_796);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_799);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_803);
    }
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_806);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_809);
    }
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_811);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_818);
    }
    stringBuffer.append(TEXT_819);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_830);
    }
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_836);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_840);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_846);
    } else {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_851);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_856);
    } else {
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_864);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_866);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_870);
    }
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_873);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_876);
    }
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_878);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_882);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_886);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_888);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_889);
    } else {
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_891);
    }
    stringBuffer.append(TEXT_892);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_896);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_901);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_903);
    }
    }
    }
    stringBuffer.append(TEXT_904);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_905);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_907);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_908);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_911);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_912);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_914);
    }
    stringBuffer.append(TEXT_915);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_919);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_921);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_922);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_927);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_929);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_931);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_933);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_934);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_936);
    }
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_941);
    }
    stringBuffer.append(TEXT_942);
    }
    stringBuffer.append(TEXT_943);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_948);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_950);
    }
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_952);
    }
    stringBuffer.append(TEXT_953);
    } else {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_955);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_957);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_959);
    }
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_961);
    }
    stringBuffer.append(TEXT_962);
    }
    } else {
    stringBuffer.append(TEXT_963);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_964);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_967);
    } else {
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_970);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_971);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_972);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_973);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_974);
    }
    }
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_978);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_981);
    } else {
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_986);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_988);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_994);
    } else {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_998);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1003);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1005);
    } else {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1007);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1008);
    } else {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1010);
    }
    stringBuffer.append(TEXT_1011);
    }
    } else {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1014);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1015);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1020);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1022);
    }
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1024);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1027);
    }
    stringBuffer.append(TEXT_1028);
    } else {
    stringBuffer.append(TEXT_1029);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_1030);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1031);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1033);
    } else {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1035);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1037);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1042);
    }
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1047);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1052);
    }
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1055);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1059);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1064);
    }
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1066);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1069);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1073);
    }
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1076);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1079);
    }
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1081);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1086);
    }
    stringBuffer.append(TEXT_1087);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1092);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1095);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1099);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1101);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getCapName());
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
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1110);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1113);
    } else {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1115);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1119);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1121);
    } else {
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1123);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1124);
    } else {
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1126);
    }
    stringBuffer.append(TEXT_1127);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1133);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1136);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1139);
    } else {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1141);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1145);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1150);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1151);
    } else {
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1153);
    }
    stringBuffer.append(TEXT_1154);
    }
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
    } else {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1163);
    }
    } else {
    stringBuffer.append(TEXT_1164);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1167);
    } else {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1170);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1171);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1178);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1180);
    }
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1182);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1185);
    }
    stringBuffer.append(TEXT_1186);
    } else {
    stringBuffer.append(TEXT_1187);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_1188);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1189);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1191);
    } else {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1193);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1195);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1200);
    }
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1205);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1207);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1210);
    } else {
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1212);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1217);
    } else {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1221);
    }
    } else {
    stringBuffer.append(TEXT_1222);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1225);
    } else {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1228);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1229);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1230);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1237);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
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
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1244);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1245);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1250);
    } else {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1255);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1259);
    } else {
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1263);
    }
    }
    stringBuffer.append(TEXT_1264);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1268);
    }
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1272);
    } else {
    stringBuffer.append(TEXT_1273);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1276);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1277);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1278);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1279);
    }
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1282);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1283);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1287);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1290);
    } else {
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1295);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1303);
    index++;}
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1307);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1308);
    }
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1312);
    }
    stringBuffer.append(TEXT_1313);
    } else {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1316);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1317);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1318);
    }
    } else {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1320);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1324);
    } else {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1328);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1331);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1336);
    } else {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1341);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1345);
    } else {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1349);
    }
    }
    stringBuffer.append(TEXT_1350);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1354);
    }
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1357);
    } else {
    stringBuffer.append(TEXT_1358);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1362);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1363);
    }
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1367);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1369);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1370);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1371);
    } else {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1376);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1379);
    } else {
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1382);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1384);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1392);
    index++;}
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1396);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1397);
    }
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1401);
    }
    stringBuffer.append(TEXT_1402);
    } else {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1405);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1406);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1407);
    }
    } else {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1409);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1413);
    } else {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1417);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1419);
    }
    stringBuffer.append(TEXT_1420);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1425);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1429);
    }
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1433);
    } else {
    stringBuffer.append(TEXT_1434);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1438);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1439);
    }
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1445);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1446);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1447);
    }
    stringBuffer.append(TEXT_1448);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1453);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1457);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1458);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1460);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1462);
    }
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1466);
    } else {
    stringBuffer.append(TEXT_1467);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1471);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1473);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1474);
    }
    stringBuffer.append(TEXT_1475);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1476);
    }
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1480);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1482);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1483);
    }
    stringBuffer.append(TEXT_1484);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1489);
    } else {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1496);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1499);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1506);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1507);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1510);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1511);
    }
    }
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1516);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1518);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1519);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1521);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1523);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1529);
    } else {
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1534);
    }
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1536);
    index++;}
    stringBuffer.append(TEXT_1537);
    } else {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1544);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1552);
    } else {
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1557);
    }
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1559);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1567);
    } else {
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1572);
    }
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1574);
    }
    index++;}
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1576);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1577);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1578);
    }
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1581);
    }
    stringBuffer.append(TEXT_1582);
    } else {
    stringBuffer.append(TEXT_1583);
    }
    stringBuffer.append(TEXT_1584);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1586);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1587);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1589);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1592);
    } else {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1595);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1598);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1605);
    } else {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1607);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1609);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1611);
    } else {
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1613);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1615);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1617);
    } else {
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1619);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1623);
    } else {
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1626);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1630);
    } else {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1633);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1638);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1648);
    } else {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1653);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1655);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1660);
    }
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1665);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1667);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1670);
    } else {
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1672);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1677);
    } else {
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1681);
    }
    } else {
    stringBuffer.append(TEXT_1682);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1685);
    } else {
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1688);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1689);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    stringBuffer.append(TEXT_1690);
    if (isInterface) {
    stringBuffer.append(TEXT_1691);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1692);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1698);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1701);
    }}
    stringBuffer.append(TEXT_1702);
    } else {
    stringBuffer.append(TEXT_1703);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1704);
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1705);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1710);
    } else {
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1715);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1721);
    } else {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1734);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1737);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1739);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1741);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1742);
    }
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1745);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1746);
    }
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1749);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1750);
    }
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1753);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1755);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1757);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1759);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1760);
    }
    stringBuffer.append(TEXT_1761);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1763);
    }
    stringBuffer.append(TEXT_1764);
    }
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1767);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1769);
    }
    } else {
    stringBuffer.append(TEXT_1770);
    }
    }
    stringBuffer.append(TEXT_1771);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1772);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1773);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1774);
    }
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1778);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1780);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1785);
    } else {
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1787);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1788);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1791);
    } else {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1793);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1798);
    }
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1800);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1804);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1809);
    }
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1812);
    }
    }
    stringBuffer.append(TEXT_1813);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1814);
    } else {
    stringBuffer.append(TEXT_1815);
    }
    stringBuffer.append(TEXT_1816);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1817);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1818);
    }
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1822);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1824);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1829);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1833);
    } else {
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1836);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1838);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1840);
    } else {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1842);
    }
    }
    stringBuffer.append(TEXT_1843);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1844);
    } else {
    stringBuffer.append(TEXT_1845);
    }
    stringBuffer.append(TEXT_1846);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1847);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1848);
    }
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1851);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1855);
    }
    stringBuffer.append(TEXT_1856);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1857);
    } else {
    stringBuffer.append(TEXT_1858);
    }
    stringBuffer.append(TEXT_1859);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1860);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1861);
    }
    stringBuffer.append(TEXT_1862);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1864);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1866);
    } else {
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1869);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1872);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1877);
    } else {
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1880);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1884);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1888);
    } else {
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1890);
    }
    }
    stringBuffer.append(TEXT_1891);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1892);
    } else {
    stringBuffer.append(TEXT_1893);
    }
    stringBuffer.append(TEXT_1894);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1895);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1896);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1897);
    }
    stringBuffer.append(TEXT_1898);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1900);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1904);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1907);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1912);
    } else {
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1915);
    }
    } else {
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1920);
    }
    stringBuffer.append(TEXT_1921);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1925);
    } else {
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1927);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType())) {
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1929);
    }
    stringBuffer.append(TEXT_1930);
    }
    stringBuffer.append(TEXT_1931);
    }
    stringBuffer.append(TEXT_1932);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1933);
    } else {
    stringBuffer.append(TEXT_1934);
    }
    stringBuffer.append(TEXT_1935);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1936);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1937);
    }
    stringBuffer.append(TEXT_1938);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1940);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1943);
    } else {
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1945);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1947);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1950);
    } else {
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1953);
    }
    stringBuffer.append(TEXT_1954);
    }
    stringBuffer.append(TEXT_1955);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1956);
    } else {
    stringBuffer.append(TEXT_1957);
    }
    stringBuffer.append(TEXT_1958);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(TEXT_1960);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1961);
    }
    stringBuffer.append(TEXT_1962);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1964);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1966);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1969);
    } else {
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1972);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1975);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1982);
    } else {
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1984);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1986);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1988);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1990);
    } else {
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1992);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1994);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1996);
    } else {
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1998);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2002);
    } else {
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2005);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2009);
    } else {
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2012);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2017);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2027);
    } else {
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2032);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2033);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2034);
    } else {
    stringBuffer.append(TEXT_2035);
    }
    stringBuffer.append(TEXT_2036);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2037);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2038);
    }
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2040);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2042);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2045);
    }
    stringBuffer.append(TEXT_2046);
    }
    stringBuffer.append(TEXT_2047);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2048);
    }
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2050);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2052);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2055);
    }
    stringBuffer.append(TEXT_2056);
    }
    stringBuffer.append(TEXT_2057);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2058);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2059);
    }
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2061);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2062);
    }
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2064);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2065);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2066);
    }
    stringBuffer.append(TEXT_2067);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2070);
    }
    stringBuffer.append(TEXT_2071);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2072);
    }
    stringBuffer.append(TEXT_2073);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2076);
    }
    stringBuffer.append(TEXT_2077);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2078);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2079);
    }
    stringBuffer.append(TEXT_2080);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2088);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2091);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2092);
    }
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2096);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2099);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2100);
    }
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2105);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2108);
    } else {
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2110);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2111);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType() : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType() : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2114);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2116);
    } else {
    stringBuffer.append(TEXT_2117);
    }
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2119);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2120);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2122);
    }
    stringBuffer.append(TEXT_2123);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2124);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2127);
    } else {
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_2129);
    }
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2131);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2133);
    } else {
    stringBuffer.append(TEXT_2134);
    }
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2138);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2139);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2141);
    }
    stringBuffer.append(TEXT_2142);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2143);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2146);
    } else {
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_2148);
    }
    stringBuffer.append(TEXT_2149);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2150);
    }
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2154);
    }
    stringBuffer.append(TEXT_2155);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2159);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2164);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2165);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2166);
    }
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2171);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2174);
    } else {
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2177);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2181);
    }
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2185);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2189);
    }
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2193);
    } else {
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2200);
    }
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2204);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2208);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2212);
    } else {
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2219);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2222);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2224);
    } else {
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2227);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2232);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2234);
    }
    }
    }
    stringBuffer.append(TEXT_2235);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //isSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2236);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2237);
    }
    }
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2239);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2241);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2243);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2244);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2246);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2247);
    }
    } else {
    stringBuffer.append(TEXT_2248);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2250);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2251);
    }
    }
    } else {
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2253);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2254);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2256);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2257);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2259);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2260);
    }
    } else {
    stringBuffer.append(TEXT_2261);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2263);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2264);
    }
    }
    } else {
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2266);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2267);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2269);
    } else {
    stringBuffer.append(TEXT_2270);
    }
    }
    stringBuffer.append(TEXT_2271);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2272);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //getGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2273);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2274);
    }
    }
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2277);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType().equals(genFeature.getListItemType())) {
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2284);
    } else {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2286);
    }
    } else {
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2288);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType() + ">");
    }
    stringBuffer.append(TEXT_2289);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2290);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2292);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2293);
    } else {
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2295);
    }
    }
    stringBuffer.append(TEXT_2296);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2297);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2298);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2299);
    }
    }
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2302);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2303);
    } else {
    stringBuffer.append(TEXT_2304);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2306);
    }
    stringBuffer.append(TEXT_2307);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2308);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2309);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2310);
    }
    }
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2316);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2317);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2322);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2324);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2326);
    }
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2328);
    } else {
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2330);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2332);
    }
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2334);
    }
    }
    stringBuffer.append(TEXT_2335);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2336);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //setGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2337);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2338);
    }
    }
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2342);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2343);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2348);
    }
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2350);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2352);
    }
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2354);
    }
    stringBuffer.append(TEXT_2355);
    }
    stringBuffer.append(TEXT_2356);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2363);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2370);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2371);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2376);
    } else {
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2381);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2385);
    } else {
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2389);
    }
    }
    stringBuffer.append(TEXT_2390);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2394);
    }
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2398);
    } else {
    stringBuffer.append(TEXT_2399);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2402);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2403);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2404);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2405);
    }
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2408);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2409);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2413);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2416);
    } else {
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2419);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2421);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2429);
    index++;}
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2433);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2434);
    }
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2438);
    }
    stringBuffer.append(TEXT_2439);
    } else {
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2442);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2443);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2444);
    }
    } else {
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2446);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2450);
    } else {
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2454);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2456);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2457);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2462);
    } else {
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2467);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2471);
    } else {
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2475);
    }
    }
    stringBuffer.append(TEXT_2476);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2480);
    }
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2483);
    } else {
    stringBuffer.append(TEXT_2484);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2488);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2489);
    }
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2493);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2495);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2496);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2497);
    } else {
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2502);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2505);
    } else {
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2508);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2510);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2518);
    index++;}
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2522);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2523);
    }
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2527);
    }
    stringBuffer.append(TEXT_2528);
    } else {
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2531);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2532);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2533);
    }
    } else {
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2535);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2539);
    } else {
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2543);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2545);
    }
    stringBuffer.append(TEXT_2546);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2551);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2555);
    }
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2559);
    } else {
    stringBuffer.append(TEXT_2560);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2564);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2565);
    }
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2571);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2572);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2573);
    }
    stringBuffer.append(TEXT_2574);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2579);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2583);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2584);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2586);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2588);
    }
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2592);
    } else {
    stringBuffer.append(TEXT_2593);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2597);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2599);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2600);
    }
    stringBuffer.append(TEXT_2601);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2602);
    }
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2606);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2608);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2609);
    }
    stringBuffer.append(TEXT_2610);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2615);
    } else {
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2622);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2625);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2632);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2633);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2636);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2637);
    }
    }
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2642);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2644);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2645);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2647);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2649);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2655);
    } else {
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2660);
    }
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2662);
    index++;}
    stringBuffer.append(TEXT_2663);
    } else {
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2670);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2678);
    } else {
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2683);
    }
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2685);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2693);
    } else {
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2698);
    }
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2700);
    }
    index++;}
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2702);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2703);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2704);
    }
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2707);
    }
    stringBuffer.append(TEXT_2708);
    } else {
    stringBuffer.append(TEXT_2709);
    }
    stringBuffer.append(TEXT_2710);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2712);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2713);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2715);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2718);
    } else {
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2721);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2724);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2731);
    } else {
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2733);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2735);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2737);
    } else {
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2739);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2741);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2743);
    } else {
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2745);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2749);
    } else {
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2752);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2756);
    } else {
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2759);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2764);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2774);
    } else {
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2779);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2781);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2786);
    }
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2791);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2793);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2796);
    } else {
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2798);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2803);
    } else {
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2807);
    }
    } else {
    stringBuffer.append(TEXT_2808);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2811);
    } else {
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2814);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2815);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2816);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2817);
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2818);
    }
    }
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2822);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2823);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2826);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2827);
    } else {
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2830);
    }
    }
    stringBuffer.append(TEXT_2831);
    }
    }
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2833);
    return stringBuffer.toString();
  }
}
