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
  protected final String TEXT_73 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_74 = "[] ";
  protected final String TEXT_75 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_76 = " [0];" + NL;
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_78 = "() <em>";
  protected final String TEXT_79 = "</em>}' ";
  protected final String TEXT_80 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_81 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_82 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_83 = NL + "\tprotected static final ";
  protected final String TEXT_84 = " ";
  protected final String TEXT_85 = "; // TODO The default value literal \"";
  protected final String TEXT_86 = "\" is not valid.";
  protected final String TEXT_87 = " = ";
  protected final String TEXT_88 = ";";
  protected final String TEXT_89 = NL;
  protected final String TEXT_90 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_91 = " = 0;" + NL;
  protected final String TEXT_92 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_93 = "() <em>";
  protected final String TEXT_94 = "</em>}' ";
  protected final String TEXT_95 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_96 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_97 = "_EFLAG = 1 ";
  protected final String TEXT_98 = ";" + NL;
  protected final String TEXT_99 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_100 = "() <em>";
  protected final String TEXT_101 = "</em>}' ";
  protected final String TEXT_102 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_103 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_104 = " ";
  protected final String TEXT_105 = " = ";
  protected final String TEXT_106 = ";" + NL;
  protected final String TEXT_107 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_108 = " = 0;" + NL;
  protected final String TEXT_109 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_110 = " ";
  protected final String TEXT_111 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_112 = "_ESETFLAG = 1 ";
  protected final String TEXT_113 = ";" + NL;
  protected final String TEXT_114 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_115 = " ";
  protected final String TEXT_116 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_117 = "ESet;" + NL;
  protected final String TEXT_118 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_119 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_120 = NL + "\t\t";
  protected final String TEXT_121 = " |= ";
  protected final String TEXT_122 = "_EFLAG;";
  protected final String TEXT_123 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_124 = NL + "\t@Override";
  protected final String TEXT_125 = NL + "\tprotected ";
  protected final String TEXT_126 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_127 = ";" + NL + "\t}" + NL;
  protected final String TEXT_128 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_129 = NL + "\t@Override";
  protected final String TEXT_130 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_131 = ";" + NL + "\t}" + NL;
  protected final String TEXT_132 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_133 = NL + "\t";
  protected final String TEXT_134 = "[] ";
  protected final String TEXT_135 = "();" + NL;
  protected final String TEXT_136 = NL + "\tpublic ";
  protected final String TEXT_137 = "[] ";
  protected final String TEXT_138 = "()" + NL + "\t{";
  protected final String TEXT_139 = NL + "\t\t";
  protected final String TEXT_140 = " list = (";
  protected final String TEXT_141 = ")";
  protected final String TEXT_142 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_143 = "_EEMPTY_ARRAY;";
  protected final String TEXT_144 = NL + "\t\tif (";
  protected final String TEXT_145 = " == null || ";
  protected final String TEXT_146 = ".isEmpty()) return ";
  protected final String TEXT_147 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_148 = " list = (";
  protected final String TEXT_149 = ")";
  protected final String TEXT_150 = ";";
  protected final String TEXT_151 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_152 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_153 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_154 = NL + "\t";
  protected final String TEXT_155 = " get";
  protected final String TEXT_156 = "(int index);" + NL;
  protected final String TEXT_157 = NL + "\tpublic ";
  protected final String TEXT_158 = " get";
  protected final String TEXT_159 = "(int index)" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_160 = ")";
  protected final String TEXT_161 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_162 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_163 = NL + "\tint get";
  protected final String TEXT_164 = "Length();" + NL;
  protected final String TEXT_165 = NL + "\tpublic int get";
  protected final String TEXT_166 = "Length()" + NL + "\t{";
  protected final String TEXT_167 = NL + "\t\treturn ";
  protected final String TEXT_168 = "().size();";
  protected final String TEXT_169 = NL + "\t\treturn ";
  protected final String TEXT_170 = " == null ? 0 : ";
  protected final String TEXT_171 = ".size();";
  protected final String TEXT_172 = NL + "\t}" + NL;
  protected final String TEXT_173 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_174 = NL + "\tvoid set";
  protected final String TEXT_175 = "(";
  protected final String TEXT_176 = "[] new";
  protected final String TEXT_177 = ");" + NL;
  protected final String TEXT_178 = NL + "\tpublic void set";
  protected final String TEXT_179 = "(";
  protected final String TEXT_180 = "[] new";
  protected final String TEXT_181 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_182 = ")";
  protected final String TEXT_183 = "()).setData(new";
  protected final String TEXT_184 = ".length, new";
  protected final String TEXT_185 = ");" + NL + "\t}" + NL;
  protected final String TEXT_186 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_187 = NL + "\tvoid set";
  protected final String TEXT_188 = "(int index, ";
  protected final String TEXT_189 = " element);" + NL;
  protected final String TEXT_190 = NL + "\tpublic void set";
  protected final String TEXT_191 = "(int index, ";
  protected final String TEXT_192 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_193 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_194 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_195 = "</b></em>' ";
  protected final String TEXT_196 = ".";
  protected final String TEXT_197 = NL + "\t * The key is of type ";
  protected final String TEXT_198 = "list of {@link ";
  protected final String TEXT_199 = "}";
  protected final String TEXT_200 = "{@link ";
  protected final String TEXT_201 = "}";
  protected final String TEXT_202 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_203 = "list of {@link ";
  protected final String TEXT_204 = "}";
  protected final String TEXT_205 = "{@link ";
  protected final String TEXT_206 = "}";
  protected final String TEXT_207 = ",";
  protected final String TEXT_208 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_209 = "}.";
  protected final String TEXT_210 = NL + "\t * The default value is <code>";
  protected final String TEXT_211 = "</code>.";
  protected final String TEXT_212 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_213 = "}.";
  protected final String TEXT_214 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_215 = "#";
  protected final String TEXT_216 = " <em>";
  protected final String TEXT_217 = "</em>}'.";
  protected final String TEXT_218 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_219 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_220 = "</em>' ";
  protected final String TEXT_221 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_222 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_223 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_224 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_225 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_226 = "</em>' ";
  protected final String TEXT_227 = ".";
  protected final String TEXT_228 = NL + "\t * @see ";
  protected final String TEXT_229 = NL + "\t * @see #isSet";
  protected final String TEXT_230 = "()";
  protected final String TEXT_231 = NL + "\t * @see #unset";
  protected final String TEXT_232 = "()";
  protected final String TEXT_233 = NL + "\t * @see #set";
  protected final String TEXT_234 = "(";
  protected final String TEXT_235 = ")";
  protected final String TEXT_236 = NL + "\t * @see ";
  protected final String TEXT_237 = "#get";
  protected final String TEXT_238 = "()";
  protected final String TEXT_239 = NL + "\t * @see ";
  protected final String TEXT_240 = "#";
  protected final String TEXT_241 = NL + "\t * @model ";
  protected final String TEXT_242 = NL + "\t *        ";
  protected final String TEXT_243 = NL + "\t * @model";
  protected final String TEXT_244 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_245 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_246 = NL + "\t@Override";
  protected final String TEXT_247 = NL + "\t";
  protected final String TEXT_248 = " ";
  protected final String TEXT_249 = "();" + NL;
  protected final String TEXT_250 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_251 = NL + "\tpublic ";
  protected final String TEXT_252 = " ";
  protected final String TEXT_253 = "()" + NL + "\t{";
  protected final String TEXT_254 = NL + "\t\treturn ";
  protected final String TEXT_255 = "(";
  protected final String TEXT_256 = "(";
  protected final String TEXT_257 = ")eGet(";
  protected final String TEXT_258 = ", true)";
  protected final String TEXT_259 = ").";
  protected final String TEXT_260 = "()";
  protected final String TEXT_261 = ";";
  protected final String TEXT_262 = NL + "\t\t";
  protected final String TEXT_263 = " ";
  protected final String TEXT_264 = " = (";
  protected final String TEXT_265 = ")eVirtualGet(";
  protected final String TEXT_266 = ");";
  protected final String TEXT_267 = NL + "\t\tif (";
  protected final String TEXT_268 = " == null)" + NL + "\t\t{";
  protected final String TEXT_269 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_270 = ", ";
  protected final String TEXT_271 = " = new ";
  protected final String TEXT_272 = ");";
  protected final String TEXT_273 = NL + "\t\t\t";
  protected final String TEXT_274 = " = new ";
  protected final String TEXT_275 = ";";
  protected final String TEXT_276 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_277 = ";";
  protected final String TEXT_278 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_279 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_280 = ")eContainer();";
  protected final String TEXT_281 = NL + "\t\t";
  protected final String TEXT_282 = " ";
  protected final String TEXT_283 = " = (";
  protected final String TEXT_284 = ")eVirtualGet(";
  protected final String TEXT_285 = ", ";
  protected final String TEXT_286 = ");";
  protected final String TEXT_287 = NL + "\t\tif (";
  protected final String TEXT_288 = " != null && ";
  protected final String TEXT_289 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_290 = " old";
  protected final String TEXT_291 = " = (";
  protected final String TEXT_292 = ")";
  protected final String TEXT_293 = ";" + NL + "\t\t\t";
  protected final String TEXT_294 = " = ";
  protected final String TEXT_295 = "eResolveProxy(old";
  protected final String TEXT_296 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_297 = " != old";
  protected final String TEXT_298 = ")" + NL + "\t\t\t{";
  protected final String TEXT_299 = NL + "\t\t\t\t";
  protected final String TEXT_300 = " new";
  protected final String TEXT_301 = " = (";
  protected final String TEXT_302 = ")";
  protected final String TEXT_303 = ";";
  protected final String TEXT_304 = NL + "\t\t\t\t";
  protected final String TEXT_305 = " msgs = old";
  protected final String TEXT_306 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_307 = ", null, null);";
  protected final String TEXT_308 = NL + "\t\t\t\t";
  protected final String TEXT_309 = " msgs =  old";
  protected final String TEXT_310 = ".eInverseRemove(this, ";
  protected final String TEXT_311 = ", ";
  protected final String TEXT_312 = ".class, null);";
  protected final String TEXT_313 = NL + "\t\t\t\tif (new";
  protected final String TEXT_314 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_315 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_316 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_317 = ", null, msgs);";
  protected final String TEXT_318 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_319 = ".eInverseAdd(this, ";
  protected final String TEXT_320 = ", ";
  protected final String TEXT_321 = ".class, msgs);";
  protected final String TEXT_322 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_323 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_324 = ", ";
  protected final String TEXT_325 = ");";
  protected final String TEXT_326 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_327 = "(this, ";
  protected final String TEXT_328 = ".RESOLVE, ";
  protected final String TEXT_329 = ", old";
  protected final String TEXT_330 = ", ";
  protected final String TEXT_331 = "));";
  protected final String TEXT_332 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_333 = NL + "\t\treturn (";
  protected final String TEXT_334 = ")eVirtualGet(";
  protected final String TEXT_335 = ", ";
  protected final String TEXT_336 = ");";
  protected final String TEXT_337 = NL + "\t\treturn (";
  protected final String TEXT_338 = " & ";
  protected final String TEXT_339 = "_EFLAG) != 0;";
  protected final String TEXT_340 = NL + "\t\treturn ";
  protected final String TEXT_341 = ";";
  protected final String TEXT_342 = NL + "\t\t";
  protected final String TEXT_343 = " ";
  protected final String TEXT_344 = " = basicGet";
  protected final String TEXT_345 = "();" + NL + "\t\treturn ";
  protected final String TEXT_346 = " != null && ";
  protected final String TEXT_347 = ".eIsProxy() ? ";
  protected final String TEXT_348 = "eResolveProxy((";
  protected final String TEXT_349 = ")";
  protected final String TEXT_350 = ") : ";
  protected final String TEXT_351 = ";";
  protected final String TEXT_352 = NL + "\t\treturn new ";
  protected final String TEXT_353 = "((";
  protected final String TEXT_354 = ".Internal)((";
  protected final String TEXT_355 = ".Internal.Wrapper)get";
  protected final String TEXT_356 = "()).featureMap().";
  protected final String TEXT_357 = "list(";
  protected final String TEXT_358 = "));";
  protected final String TEXT_359 = NL + "\t\treturn (";
  protected final String TEXT_360 = ")get";
  protected final String TEXT_361 = "().";
  protected final String TEXT_362 = "list(";
  protected final String TEXT_363 = ");";
  protected final String TEXT_364 = NL + "\t\treturn ((";
  protected final String TEXT_365 = ".Internal.Wrapper)get";
  protected final String TEXT_366 = "()).featureMap().list(";
  protected final String TEXT_367 = ");";
  protected final String TEXT_368 = NL + "\t\treturn get";
  protected final String TEXT_369 = "().list(";
  protected final String TEXT_370 = ");";
  protected final String TEXT_371 = NL + "\t\treturn ";
  protected final String TEXT_372 = "(";
  protected final String TEXT_373 = "(";
  protected final String TEXT_374 = ")";
  protected final String TEXT_375 = "((";
  protected final String TEXT_376 = ".Internal.Wrapper)get";
  protected final String TEXT_377 = "()).featureMap().get(";
  protected final String TEXT_378 = ", true)";
  protected final String TEXT_379 = ").";
  protected final String TEXT_380 = "()";
  protected final String TEXT_381 = ";";
  protected final String TEXT_382 = NL + "\t\treturn ";
  protected final String TEXT_383 = "(";
  protected final String TEXT_384 = "(";
  protected final String TEXT_385 = ")";
  protected final String TEXT_386 = "get";
  protected final String TEXT_387 = "().get(";
  protected final String TEXT_388 = ", true)";
  protected final String TEXT_389 = ").";
  protected final String TEXT_390 = "()";
  protected final String TEXT_391 = ";";
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
  protected final String TEXT_498 = NL + "\t@Override";
  protected final String TEXT_499 = NL + "\tpublic ";
  protected final String TEXT_500 = " basicGet";
  protected final String TEXT_501 = "()" + NL + "\t{";
  protected final String TEXT_502 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_503 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_504 = ")eInternalContainer();";
  protected final String TEXT_505 = NL + "\t\treturn (";
  protected final String TEXT_506 = ")eVirtualGet(";
  protected final String TEXT_507 = ");";
  protected final String TEXT_508 = NL + "\t\treturn ";
  protected final String TEXT_509 = ";";
  protected final String TEXT_510 = NL + "\t\treturn (";
  protected final String TEXT_511 = ")((";
  protected final String TEXT_512 = ".Internal.Wrapper)get";
  protected final String TEXT_513 = "()).featureMap().get(";
  protected final String TEXT_514 = ", false);";
  protected final String TEXT_515 = NL + "\t\treturn (";
  protected final String TEXT_516 = ")get";
  protected final String TEXT_517 = "().get(";
  protected final String TEXT_518 = ", false);";
  protected final String TEXT_519 = NL + "\t\treturn ";
  protected final String TEXT_520 = ".";
  protected final String TEXT_521 = "(this);";
  protected final String TEXT_522 = NL + "\t\tif (isSet";
  protected final String TEXT_523 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_524 = "basicGet";
  protected final String TEXT_525 = "();" + NL + "\t\t}";
  protected final String TEXT_526 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_527 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_528 = "basicGet";
  protected final String TEXT_529 = "();" + NL + "\t\t}";
  protected final String TEXT_530 = NL + "\t\t";
  protected final String TEXT_531 = " ";
  protected final String TEXT_532 = " = ";
  protected final String TEXT_533 = "basicGet";
  protected final String TEXT_534 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_535 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_536 = ";" + NL + "\t\t}";
  protected final String TEXT_537 = NL + "\t\treturn ";
  protected final String TEXT_538 = "super.basicGet";
  protected final String TEXT_539 = "()";
  protected final String TEXT_540 = "null";
  protected final String TEXT_541 = ";";
  protected final String TEXT_542 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_543 = "' ";
  protected final String TEXT_544 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_545 = NL + "\t}" + NL;
  protected final String TEXT_546 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_547 = NL + "\t@Override";
  protected final String TEXT_548 = NL + "\tpublic ";
  protected final String TEXT_549 = " basicSet";
  protected final String TEXT_550 = "(";
  protected final String TEXT_551 = " new";
  protected final String TEXT_552 = ", ";
  protected final String TEXT_553 = " msgs)" + NL + "\t{";
  protected final String TEXT_554 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_555 = ")new";
  protected final String TEXT_556 = ", ";
  protected final String TEXT_557 = ", msgs);";
  protected final String TEXT_558 = NL + "\t\t";
  protected final String TEXT_559 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_560 = NL + "\t\t\t";
  protected final String TEXT_561 = " ";
  protected final String TEXT_562 = " = ";
  protected final String TEXT_563 = "();";
  protected final String TEXT_564 = NL + "\t\t\tObject ";
  protected final String TEXT_565 = " = eVirtualGet(";
  protected final String TEXT_566 = ");";
  protected final String TEXT_567 = NL + "\t\t\tif (";
  protected final String TEXT_568 = " != null && ";
  protected final String TEXT_569 = " != new";
  protected final String TEXT_570 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_571 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_572 = NL + "\t\t\tif (new";
  protected final String TEXT_573 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_574 = NL + "\t\t\t\t";
  protected final String TEXT_575 = " ";
  protected final String TEXT_576 = " = ";
  protected final String TEXT_577 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_578 = ".contains(new";
  protected final String TEXT_579 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_580 = ".add(new";
  protected final String TEXT_581 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_582 = NL + "\t\t\t\t";
  protected final String TEXT_583 = " ";
  protected final String TEXT_584 = " = ";
  protected final String TEXT_585 = "();";
  protected final String TEXT_586 = NL + "\t\t\t\tObject ";
  protected final String TEXT_587 = " = eVirtualGet(";
  protected final String TEXT_588 = ");";
  protected final String TEXT_589 = NL + "\t\t\t\tif (new";
  protected final String TEXT_590 = " != ";
  protected final String TEXT_591 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_592 = "(new";
  protected final String TEXT_593 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_594 = NL + "\t\t\t}";
  protected final String TEXT_595 = NL + "\t\t}";
  protected final String TEXT_596 = NL + "\t\treturn msgs;";
  protected final String TEXT_597 = NL + "\t\tObject old";
  protected final String TEXT_598 = " = eVirtualSet(";
  protected final String TEXT_599 = ", new";
  protected final String TEXT_600 = ");";
  protected final String TEXT_601 = NL + "\t\t";
  protected final String TEXT_602 = " old";
  protected final String TEXT_603 = " = ";
  protected final String TEXT_604 = ";" + NL + "\t\t";
  protected final String TEXT_605 = " = new";
  protected final String TEXT_606 = ";";
  protected final String TEXT_607 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_608 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_609 = NL + "\t\tboolean old";
  protected final String TEXT_610 = "ESet = (";
  protected final String TEXT_611 = " & ";
  protected final String TEXT_612 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_613 = " |= ";
  protected final String TEXT_614 = "_ESETFLAG;";
  protected final String TEXT_615 = NL + "\t\tboolean old";
  protected final String TEXT_616 = "ESet = ";
  protected final String TEXT_617 = "ESet;" + NL + "\t\t";
  protected final String TEXT_618 = "ESet = true;";
  protected final String TEXT_619 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_620 = NL + "\t\t\t";
  protected final String TEXT_621 = " notification = new ";
  protected final String TEXT_622 = "(this, ";
  protected final String TEXT_623 = ".SET, ";
  protected final String TEXT_624 = ", ";
  protected final String TEXT_625 = "isSetChange ? null : old";
  protected final String TEXT_626 = "old";
  protected final String TEXT_627 = ", new";
  protected final String TEXT_628 = ", ";
  protected final String TEXT_629 = "isSetChange";
  protected final String TEXT_630 = "!old";
  protected final String TEXT_631 = "ESet";
  protected final String TEXT_632 = ");";
  protected final String TEXT_633 = NL + "\t\t\t";
  protected final String TEXT_634 = " notification = new ";
  protected final String TEXT_635 = "(this, ";
  protected final String TEXT_636 = ".SET, ";
  protected final String TEXT_637 = ", ";
  protected final String TEXT_638 = "old";
  protected final String TEXT_639 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_640 = "old";
  protected final String TEXT_641 = ", new";
  protected final String TEXT_642 = ");";
  protected final String TEXT_643 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_644 = NL + "\t\t";
  protected final String TEXT_645 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_646 = NL + "\t\t\t";
  protected final String TEXT_647 = " ";
  protected final String TEXT_648 = " = ";
  protected final String TEXT_649 = "();";
  protected final String TEXT_650 = NL + "\t\t\tObject ";
  protected final String TEXT_651 = " = eVirtualGet(";
  protected final String TEXT_652 = ");";
  protected final String TEXT_653 = NL + "\t\t\tif (";
  protected final String TEXT_654 = " != null && ";
  protected final String TEXT_655 = " != new";
  protected final String TEXT_656 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_657 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_658 = NL + "\t\t\tif (new";
  protected final String TEXT_659 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_660 = NL + "\t\t\t\t";
  protected final String TEXT_661 = " ";
  protected final String TEXT_662 = " = ";
  protected final String TEXT_663 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_664 = ".contains(new";
  protected final String TEXT_665 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_666 = ".add(new";
  protected final String TEXT_667 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_668 = NL + "\t\t\t\t";
  protected final String TEXT_669 = " ";
  protected final String TEXT_670 = " = ";
  protected final String TEXT_671 = "();";
  protected final String TEXT_672 = NL + "\t\t\t\tObject ";
  protected final String TEXT_673 = " = eVirtualGet(";
  protected final String TEXT_674 = ");";
  protected final String TEXT_675 = NL + "\t\t\t\tif (new";
  protected final String TEXT_676 = " != ";
  protected final String TEXT_677 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_678 = "(new";
  protected final String TEXT_679 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_680 = NL + "\t\t\t}";
  protected final String TEXT_681 = NL + "\t\t}";
  protected final String TEXT_682 = NL + "\t\treturn msgs;";
  protected final String TEXT_683 = NL + "\t\treturn ((";
  protected final String TEXT_684 = ".Internal)((";
  protected final String TEXT_685 = ".Internal.Wrapper)get";
  protected final String TEXT_686 = "()).featureMap()).basicAdd(";
  protected final String TEXT_687 = ", new";
  protected final String TEXT_688 = ", msgs);";
  protected final String TEXT_689 = NL + "\t\treturn ((";
  protected final String TEXT_690 = ".Internal)get";
  protected final String TEXT_691 = "()).basicAdd(";
  protected final String TEXT_692 = ", new";
  protected final String TEXT_693 = ", msgs);";
  protected final String TEXT_694 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_695 = "' ";
  protected final String TEXT_696 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_697 = NL + "\t}" + NL;
  protected final String TEXT_698 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_699 = "#";
  protected final String TEXT_700 = " <em>";
  protected final String TEXT_701 = "</em>}' ";
  protected final String TEXT_702 = ".";
  protected final String TEXT_703 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_704 = "</em>' ";
  protected final String TEXT_705 = ".";
  protected final String TEXT_706 = NL + "\t * @see ";
  protected final String TEXT_707 = NL + "\t * @see #isSet";
  protected final String TEXT_708 = "()";
  protected final String TEXT_709 = NL + "\t * @see #unset";
  protected final String TEXT_710 = "()";
  protected final String TEXT_711 = NL + "\t * @see #";
  protected final String TEXT_712 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_713 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_714 = NL + "\t@Override";
  protected final String TEXT_715 = NL + "\tvoid set";
  protected final String TEXT_716 = "(";
  protected final String TEXT_717 = " value);" + NL;
  protected final String TEXT_718 = NL + "\tpublic void set";
  protected final String TEXT_719 = "(";
  protected final String TEXT_720 = " new";
  protected final String TEXT_721 = ")" + NL + "\t{";
  protected final String TEXT_722 = NL + "\t\tnew";
  protected final String TEXT_723 = " = new";
  protected final String TEXT_724 = " == null ? ";
  protected final String TEXT_725 = " : new";
  protected final String TEXT_726 = ";";
  protected final String TEXT_727 = NL + "\t\teSet(";
  protected final String TEXT_728 = ", ";
  protected final String TEXT_729 = "new ";
  protected final String TEXT_730 = "(";
  protected final String TEXT_731 = "new";
  protected final String TEXT_732 = ")";
  protected final String TEXT_733 = ");";
  protected final String TEXT_734 = NL + "\t\tif (new";
  protected final String TEXT_735 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_736 = " && new";
  protected final String TEXT_737 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_738 = ".isAncestor(this, ";
  protected final String TEXT_739 = "new";
  protected final String TEXT_740 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_741 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_742 = NL + "\t\t\t";
  protected final String TEXT_743 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_744 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_745 = ")new";
  protected final String TEXT_746 = ").eInverseAdd(this, ";
  protected final String TEXT_747 = ", ";
  protected final String TEXT_748 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_749 = "(";
  protected final String TEXT_750 = "new";
  protected final String TEXT_751 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_752 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_753 = "(this, ";
  protected final String TEXT_754 = ".SET, ";
  protected final String TEXT_755 = ", new";
  protected final String TEXT_756 = ", new";
  protected final String TEXT_757 = "));";
  protected final String TEXT_758 = NL + "\t\t";
  protected final String TEXT_759 = " ";
  protected final String TEXT_760 = " = (";
  protected final String TEXT_761 = ")eVirtualGet(";
  protected final String TEXT_762 = ");";
  protected final String TEXT_763 = NL + "\t\tif (new";
  protected final String TEXT_764 = " != ";
  protected final String TEXT_765 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_766 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_767 = " != null)";
  protected final String TEXT_768 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_769 = ")";
  protected final String TEXT_770 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_771 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_772 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_773 = ")new";
  protected final String TEXT_774 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_775 = ", null, msgs);";
  protected final String TEXT_776 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_777 = ")";
  protected final String TEXT_778 = ").eInverseRemove(this, ";
  protected final String TEXT_779 = ", ";
  protected final String TEXT_780 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_781 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_782 = ")new";
  protected final String TEXT_783 = ").eInverseAdd(this, ";
  protected final String TEXT_784 = ", ";
  protected final String TEXT_785 = ".class, msgs);";
  protected final String TEXT_786 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_787 = "(";
  protected final String TEXT_788 = "new";
  protected final String TEXT_789 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_790 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_791 = NL + "\t\t\tboolean old";
  protected final String TEXT_792 = "ESet = eVirtualIsSet(";
  protected final String TEXT_793 = ");";
  protected final String TEXT_794 = NL + "\t\t\tboolean old";
  protected final String TEXT_795 = "ESet = (";
  protected final String TEXT_796 = " & ";
  protected final String TEXT_797 = "_ESETFLAG) != 0;";
  protected final String TEXT_798 = NL + "\t\t\t";
  protected final String TEXT_799 = " |= ";
  protected final String TEXT_800 = "_ESETFLAG;";
  protected final String TEXT_801 = NL + "\t\t\tboolean old";
  protected final String TEXT_802 = "ESet = ";
  protected final String TEXT_803 = "ESet;";
  protected final String TEXT_804 = NL + "\t\t\t";
  protected final String TEXT_805 = "ESet = true;";
  protected final String TEXT_806 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_807 = "(this, ";
  protected final String TEXT_808 = ".SET, ";
  protected final String TEXT_809 = ", new";
  protected final String TEXT_810 = ", new";
  protected final String TEXT_811 = ", !old";
  protected final String TEXT_812 = "ESet));";
  protected final String TEXT_813 = NL + "\t\t}";
  protected final String TEXT_814 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_815 = "(this, ";
  protected final String TEXT_816 = ".SET, ";
  protected final String TEXT_817 = ", new";
  protected final String TEXT_818 = ", new";
  protected final String TEXT_819 = "));";
  protected final String TEXT_820 = NL + "\t\t";
  protected final String TEXT_821 = " old";
  protected final String TEXT_822 = " = (";
  protected final String TEXT_823 = " & ";
  protected final String TEXT_824 = "_EFLAG) != 0;";
  protected final String TEXT_825 = NL + "\t\tif (new";
  protected final String TEXT_826 = ") ";
  protected final String TEXT_827 = " |= ";
  protected final String TEXT_828 = "_EFLAG; else ";
  protected final String TEXT_829 = " &= ~";
  protected final String TEXT_830 = "_EFLAG;";
  protected final String TEXT_831 = NL + "\t\t";
  protected final String TEXT_832 = " old";
  protected final String TEXT_833 = " = ";
  protected final String TEXT_834 = ";";
  protected final String TEXT_835 = NL + "\t\t";
  protected final String TEXT_836 = " ";
  protected final String TEXT_837 = " = new";
  protected final String TEXT_838 = " == null ? ";
  protected final String TEXT_839 = " : new";
  protected final String TEXT_840 = ";";
  protected final String TEXT_841 = NL + "\t\t";
  protected final String TEXT_842 = " = new";
  protected final String TEXT_843 = " == null ? ";
  protected final String TEXT_844 = " : new";
  protected final String TEXT_845 = ";";
  protected final String TEXT_846 = NL + "\t\t";
  protected final String TEXT_847 = " ";
  protected final String TEXT_848 = " = ";
  protected final String TEXT_849 = "new";
  protected final String TEXT_850 = ";";
  protected final String TEXT_851 = NL + "\t\t";
  protected final String TEXT_852 = " = ";
  protected final String TEXT_853 = "new";
  protected final String TEXT_854 = ";";
  protected final String TEXT_855 = NL + "\t\tObject old";
  protected final String TEXT_856 = " = eVirtualSet(";
  protected final String TEXT_857 = ", ";
  protected final String TEXT_858 = ");";
  protected final String TEXT_859 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_860 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_861 = NL + "\t\tboolean old";
  protected final String TEXT_862 = "ESet = (";
  protected final String TEXT_863 = " & ";
  protected final String TEXT_864 = "_ESETFLAG) != 0;";
  protected final String TEXT_865 = NL + "\t\t";
  protected final String TEXT_866 = " |= ";
  protected final String TEXT_867 = "_ESETFLAG;";
  protected final String TEXT_868 = NL + "\t\tboolean old";
  protected final String TEXT_869 = "ESet = ";
  protected final String TEXT_870 = "ESet;";
  protected final String TEXT_871 = NL + "\t\t";
  protected final String TEXT_872 = "ESet = true;";
  protected final String TEXT_873 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_874 = "(this, ";
  protected final String TEXT_875 = ".SET, ";
  protected final String TEXT_876 = ", ";
  protected final String TEXT_877 = "isSetChange ? ";
  protected final String TEXT_878 = " : old";
  protected final String TEXT_879 = "old";
  protected final String TEXT_880 = ", ";
  protected final String TEXT_881 = "new";
  protected final String TEXT_882 = ", ";
  protected final String TEXT_883 = "isSetChange";
  protected final String TEXT_884 = "!old";
  protected final String TEXT_885 = "ESet";
  protected final String TEXT_886 = "));";
  protected final String TEXT_887 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_888 = "(this, ";
  protected final String TEXT_889 = ".SET, ";
  protected final String TEXT_890 = ", ";
  protected final String TEXT_891 = "old";
  protected final String TEXT_892 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_893 = " : old";
  protected final String TEXT_894 = "old";
  protected final String TEXT_895 = ", ";
  protected final String TEXT_896 = "new";
  protected final String TEXT_897 = "));";
  protected final String TEXT_898 = NL + "\t\t";
  protected final String TEXT_899 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_900 = NL + "\t\t\t";
  protected final String TEXT_901 = " ";
  protected final String TEXT_902 = " = ";
  protected final String TEXT_903 = "();";
  protected final String TEXT_904 = NL + "\t\t\tObject ";
  protected final String TEXT_905 = " = eVirtualGet(";
  protected final String TEXT_906 = ");";
  protected final String TEXT_907 = NL + "\t\t\tif (";
  protected final String TEXT_908 = " != null && ";
  protected final String TEXT_909 = " != new";
  protected final String TEXT_910 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_911 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_912 = NL + "\t\t\tif (new";
  protected final String TEXT_913 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_914 = NL + "\t\t\t\t";
  protected final String TEXT_915 = " ";
  protected final String TEXT_916 = " = ";
  protected final String TEXT_917 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_918 = ".contains(new";
  protected final String TEXT_919 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_920 = ".add(new";
  protected final String TEXT_921 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_922 = NL + "\t\t\t\t";
  protected final String TEXT_923 = " ";
  protected final String TEXT_924 = " = ";
  protected final String TEXT_925 = "();";
  protected final String TEXT_926 = NL + "\t\t\t\tObject ";
  protected final String TEXT_927 = " = eVirtualGet(";
  protected final String TEXT_928 = ");";
  protected final String TEXT_929 = NL + "\t\t\t\tif (new";
  protected final String TEXT_930 = " != ";
  protected final String TEXT_931 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_932 = "(new";
  protected final String TEXT_933 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_934 = NL + "\t\t\t}";
  protected final String TEXT_935 = NL + "\t\t}";
  protected final String TEXT_936 = NL + "\t\t((";
  protected final String TEXT_937 = ".Internal)((";
  protected final String TEXT_938 = ".Internal.Wrapper)get";
  protected final String TEXT_939 = "()).featureMap()).set(";
  protected final String TEXT_940 = ", ";
  protected final String TEXT_941 = "new ";
  protected final String TEXT_942 = "(";
  protected final String TEXT_943 = "new";
  protected final String TEXT_944 = ")";
  protected final String TEXT_945 = ");";
  protected final String TEXT_946 = NL + "\t\t((";
  protected final String TEXT_947 = ".Internal)get";
  protected final String TEXT_948 = "()).set(";
  protected final String TEXT_949 = ", ";
  protected final String TEXT_950 = "new ";
  protected final String TEXT_951 = "(";
  protected final String TEXT_952 = "new";
  protected final String TEXT_953 = ")";
  protected final String TEXT_954 = ");";
  protected final String TEXT_955 = NL + "\t\t";
  protected final String TEXT_956 = ".";
  protected final String TEXT_957 = "(this, ";
  protected final String TEXT_958 = ");";
  protected final String TEXT_959 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_960 = "' ";
  protected final String TEXT_961 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_962 = NL + "\t}" + NL;
  protected final String TEXT_963 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_964 = NL + "\t@Override";
  protected final String TEXT_965 = NL + "\tpublic ";
  protected final String TEXT_966 = " basicUnset";
  protected final String TEXT_967 = "(";
  protected final String TEXT_968 = " msgs)" + NL + "\t{";
  protected final String TEXT_969 = NL + "\t\tObject old";
  protected final String TEXT_970 = " = eVirtualUnset(";
  protected final String TEXT_971 = ");";
  protected final String TEXT_972 = NL + "\t\t";
  protected final String TEXT_973 = " old";
  protected final String TEXT_974 = " = ";
  protected final String TEXT_975 = ";" + NL + "\t\t";
  protected final String TEXT_976 = " = null;";
  protected final String TEXT_977 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_978 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_979 = NL + "\t\tboolean old";
  protected final String TEXT_980 = "ESet = (";
  protected final String TEXT_981 = " & ";
  protected final String TEXT_982 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_983 = " &= ~";
  protected final String TEXT_984 = "_ESETFLAG;";
  protected final String TEXT_985 = NL + "\t\tboolean old";
  protected final String TEXT_986 = "ESet = ";
  protected final String TEXT_987 = "ESet;" + NL + "\t\t";
  protected final String TEXT_988 = "ESet = false;";
  protected final String TEXT_989 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_990 = " notification = new ";
  protected final String TEXT_991 = "(this, ";
  protected final String TEXT_992 = ".UNSET, ";
  protected final String TEXT_993 = ", ";
  protected final String TEXT_994 = "isSetChange ? old";
  protected final String TEXT_995 = " : null";
  protected final String TEXT_996 = "old";
  protected final String TEXT_997 = ", null, ";
  protected final String TEXT_998 = "isSetChange";
  protected final String TEXT_999 = "old";
  protected final String TEXT_1000 = "ESet";
  protected final String TEXT_1001 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1002 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1003 = "' ";
  protected final String TEXT_1004 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1005 = NL + "\t}" + NL;
  protected final String TEXT_1006 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1007 = "#";
  protected final String TEXT_1008 = " <em>";
  protected final String TEXT_1009 = "</em>}' ";
  protected final String TEXT_1010 = ".";
  protected final String TEXT_1011 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1012 = NL + "\t * @see #isSet";
  protected final String TEXT_1013 = "()";
  protected final String TEXT_1014 = NL + "\t * @see #";
  protected final String TEXT_1015 = "()";
  protected final String TEXT_1016 = NL + "\t * @see #set";
  protected final String TEXT_1017 = "(";
  protected final String TEXT_1018 = ")";
  protected final String TEXT_1019 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1020 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1021 = NL + "\t@Override";
  protected final String TEXT_1022 = NL + "\tvoid unset";
  protected final String TEXT_1023 = "();" + NL;
  protected final String TEXT_1024 = NL + "\tpublic void unset";
  protected final String TEXT_1025 = "()" + NL + "\t{";
  protected final String TEXT_1026 = NL + "\t\teUnset(";
  protected final String TEXT_1027 = ");";
  protected final String TEXT_1028 = NL + "\t\t";
  protected final String TEXT_1029 = " ";
  protected final String TEXT_1030 = " = (";
  protected final String TEXT_1031 = ")eVirtualGet(";
  protected final String TEXT_1032 = ");";
  protected final String TEXT_1033 = NL + "\t\tif (";
  protected final String TEXT_1034 = " != null) ((";
  protected final String TEXT_1035 = ".Unsettable";
  protected final String TEXT_1036 = ")";
  protected final String TEXT_1037 = ").unset();";
  protected final String TEXT_1038 = NL + "\t\t";
  protected final String TEXT_1039 = " ";
  protected final String TEXT_1040 = " = (";
  protected final String TEXT_1041 = ")eVirtualGet(";
  protected final String TEXT_1042 = ");";
  protected final String TEXT_1043 = NL + "\t\tif (";
  protected final String TEXT_1044 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1045 = " msgs = null;";
  protected final String TEXT_1046 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1047 = ")";
  protected final String TEXT_1048 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1049 = ", null, msgs);";
  protected final String TEXT_1050 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1051 = ")";
  protected final String TEXT_1052 = ").eInverseRemove(this, ";
  protected final String TEXT_1053 = ", ";
  protected final String TEXT_1054 = ".class, msgs);";
  protected final String TEXT_1055 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1056 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1057 = NL + "\t\t\tboolean old";
  protected final String TEXT_1058 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1059 = ");";
  protected final String TEXT_1060 = NL + "\t\t\tboolean old";
  protected final String TEXT_1061 = "ESet = (";
  protected final String TEXT_1062 = " & ";
  protected final String TEXT_1063 = "_ESETFLAG) != 0;";
  protected final String TEXT_1064 = NL + "\t\t\t";
  protected final String TEXT_1065 = " &= ~";
  protected final String TEXT_1066 = "_ESETFLAG;";
  protected final String TEXT_1067 = NL + "\t\t\tboolean old";
  protected final String TEXT_1068 = "ESet = ";
  protected final String TEXT_1069 = "ESet;";
  protected final String TEXT_1070 = NL + "\t\t\t";
  protected final String TEXT_1071 = "ESet = false;";
  protected final String TEXT_1072 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1073 = "(this, ";
  protected final String TEXT_1074 = ".UNSET, ";
  protected final String TEXT_1075 = ", null, null, old";
  protected final String TEXT_1076 = "ESet));";
  protected final String TEXT_1077 = NL + "\t\t}";
  protected final String TEXT_1078 = NL + "\t\t";
  protected final String TEXT_1079 = " old";
  protected final String TEXT_1080 = " = (";
  protected final String TEXT_1081 = " & ";
  protected final String TEXT_1082 = "_EFLAG) != 0;";
  protected final String TEXT_1083 = NL + "\t\tObject old";
  protected final String TEXT_1084 = " = eVirtualUnset(";
  protected final String TEXT_1085 = ");";
  protected final String TEXT_1086 = NL + "\t\t";
  protected final String TEXT_1087 = " old";
  protected final String TEXT_1088 = " = ";
  protected final String TEXT_1089 = ";";
  protected final String TEXT_1090 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1091 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1092 = NL + "\t\tboolean old";
  protected final String TEXT_1093 = "ESet = (";
  protected final String TEXT_1094 = " & ";
  protected final String TEXT_1095 = "_ESETFLAG) != 0;";
  protected final String TEXT_1096 = NL + "\t\tboolean old";
  protected final String TEXT_1097 = "ESet = ";
  protected final String TEXT_1098 = "ESet;";
  protected final String TEXT_1099 = NL + "\t\t";
  protected final String TEXT_1100 = " = null;";
  protected final String TEXT_1101 = NL + "\t\t";
  protected final String TEXT_1102 = " &= ~";
  protected final String TEXT_1103 = "_ESETFLAG;";
  protected final String TEXT_1104 = NL + "\t\t";
  protected final String TEXT_1105 = "ESet = false;";
  protected final String TEXT_1106 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1107 = "(this, ";
  protected final String TEXT_1108 = ".UNSET, ";
  protected final String TEXT_1109 = ", ";
  protected final String TEXT_1110 = "isSetChange ? old";
  protected final String TEXT_1111 = " : null";
  protected final String TEXT_1112 = "old";
  protected final String TEXT_1113 = ", null, ";
  protected final String TEXT_1114 = "isSetChange";
  protected final String TEXT_1115 = "old";
  protected final String TEXT_1116 = "ESet";
  protected final String TEXT_1117 = "));";
  protected final String TEXT_1118 = NL + "\t\tif (";
  protected final String TEXT_1119 = ") ";
  protected final String TEXT_1120 = " |= ";
  protected final String TEXT_1121 = "_EFLAG; else ";
  protected final String TEXT_1122 = " &= ~";
  protected final String TEXT_1123 = "_EFLAG;";
  protected final String TEXT_1124 = NL + "\t\t";
  protected final String TEXT_1125 = " = ";
  protected final String TEXT_1126 = ";";
  protected final String TEXT_1127 = NL + "\t\t";
  protected final String TEXT_1128 = " &= ~";
  protected final String TEXT_1129 = "_ESETFLAG;";
  protected final String TEXT_1130 = NL + "\t\t";
  protected final String TEXT_1131 = "ESet = false;";
  protected final String TEXT_1132 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1133 = "(this, ";
  protected final String TEXT_1134 = ".UNSET, ";
  protected final String TEXT_1135 = ", ";
  protected final String TEXT_1136 = "isSetChange ? old";
  protected final String TEXT_1137 = " : ";
  protected final String TEXT_1138 = "old";
  protected final String TEXT_1139 = ", ";
  protected final String TEXT_1140 = ", ";
  protected final String TEXT_1141 = "isSetChange";
  protected final String TEXT_1142 = "old";
  protected final String TEXT_1143 = "ESet";
  protected final String TEXT_1144 = "));";
  protected final String TEXT_1145 = NL + "\t\t((";
  protected final String TEXT_1146 = ".Internal)((";
  protected final String TEXT_1147 = ".Internal.Wrapper)get";
  protected final String TEXT_1148 = "()).featureMap()).clear(";
  protected final String TEXT_1149 = ");";
  protected final String TEXT_1150 = NL + "\t\t((";
  protected final String TEXT_1151 = ".Internal)get";
  protected final String TEXT_1152 = "()).clear(";
  protected final String TEXT_1153 = ");";
  protected final String TEXT_1154 = NL + "\t\t";
  protected final String TEXT_1155 = ".";
  protected final String TEXT_1156 = "(this);";
  protected final String TEXT_1157 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1158 = "' ";
  protected final String TEXT_1159 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1160 = NL + "\t}" + NL;
  protected final String TEXT_1161 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1162 = "#";
  protected final String TEXT_1163 = " <em>";
  protected final String TEXT_1164 = "</em>}' ";
  protected final String TEXT_1165 = " is set.";
  protected final String TEXT_1166 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1167 = "</em>' ";
  protected final String TEXT_1168 = " is set.";
  protected final String TEXT_1169 = NL + "\t * @see #unset";
  protected final String TEXT_1170 = "()";
  protected final String TEXT_1171 = NL + "\t * @see #";
  protected final String TEXT_1172 = "()";
  protected final String TEXT_1173 = NL + "\t * @see #set";
  protected final String TEXT_1174 = "(";
  protected final String TEXT_1175 = ")";
  protected final String TEXT_1176 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1177 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1178 = NL + "\t@Override";
  protected final String TEXT_1179 = NL + "\tboolean isSet";
  protected final String TEXT_1180 = "();" + NL;
  protected final String TEXT_1181 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1182 = "()" + NL + "\t{";
  protected final String TEXT_1183 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1184 = ");";
  protected final String TEXT_1185 = NL + "\t\t";
  protected final String TEXT_1186 = " ";
  protected final String TEXT_1187 = " = (";
  protected final String TEXT_1188 = ")eVirtualGet(";
  protected final String TEXT_1189 = ");";
  protected final String TEXT_1190 = NL + "\t\treturn ";
  protected final String TEXT_1191 = " != null && ((";
  protected final String TEXT_1192 = ".Unsettable";
  protected final String TEXT_1193 = ")";
  protected final String TEXT_1194 = ").isSet();";
  protected final String TEXT_1195 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1196 = ");";
  protected final String TEXT_1197 = NL + "\t\treturn (";
  protected final String TEXT_1198 = " & ";
  protected final String TEXT_1199 = "_ESETFLAG) != 0;";
  protected final String TEXT_1200 = NL + "\t\treturn ";
  protected final String TEXT_1201 = "ESet;";
  protected final String TEXT_1202 = NL + "\t\treturn !((";
  protected final String TEXT_1203 = ".Internal)((";
  protected final String TEXT_1204 = ".Internal.Wrapper)get";
  protected final String TEXT_1205 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1206 = ");";
  protected final String TEXT_1207 = NL + "\t\treturn !((";
  protected final String TEXT_1208 = ".Internal)get";
  protected final String TEXT_1209 = "()).isEmpty(";
  protected final String TEXT_1210 = ");";
  protected final String TEXT_1211 = NL + "\t\treturn ";
  protected final String TEXT_1212 = ".";
  protected final String TEXT_1213 = "(this);";
  protected final String TEXT_1214 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1215 = "' ";
  protected final String TEXT_1216 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1217 = NL + "\t}" + NL;
  protected final String TEXT_1218 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1219 = "() <em>";
  protected final String TEXT_1220 = "</em>}' ";
  protected final String TEXT_1221 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1222 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1223 = "_ESUBSETS = ";
  protected final String TEXT_1224 = ";" + NL;
  protected final String TEXT_1225 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1226 = "() <em>";
  protected final String TEXT_1227 = "</em>}' ";
  protected final String TEXT_1228 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1229 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1230 = "_ESUPERSETS = ";
  protected final String TEXT_1231 = ";" + NL;
  protected final String TEXT_1232 = NL + "\t/**";
  protected final String TEXT_1233 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1234 = "}, with the specified ";
  protected final String TEXT_1235 = ", and appends it to the '<em><b>";
  protected final String TEXT_1236 = "</b></em>' ";
  protected final String TEXT_1237 = ".";
  protected final String TEXT_1238 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1239 = "}, with the specified ";
  protected final String TEXT_1240 = ", and sets the '<em><b>";
  protected final String TEXT_1241 = "</b></em>' ";
  protected final String TEXT_1242 = ".";
  protected final String TEXT_1243 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1244 = "} and appends it to the '<em><b>";
  protected final String TEXT_1245 = "</b></em>' ";
  protected final String TEXT_1246 = ".";
  protected final String TEXT_1247 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1248 = "} and sets the '<em><b>";
  protected final String TEXT_1249 = "</b></em>' ";
  protected final String TEXT_1250 = ".";
  protected final String TEXT_1251 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1252 = NL + "\t * @param ";
  protected final String TEXT_1253 = " The ";
  protected final String TEXT_1254 = " for the new {@link ";
  protected final String TEXT_1255 = "}, or <code>null</code>.";
  protected final String TEXT_1256 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1257 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1258 = "}." + NL + "\t * @see #";
  protected final String TEXT_1259 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1260 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1261 = NL + "\t";
  protected final String TEXT_1262 = " create";
  protected final String TEXT_1263 = "(";
  protected final String TEXT_1264 = ", ";
  protected final String TEXT_1265 = " eClass);" + NL;
  protected final String TEXT_1266 = NL + "\t@Override";
  protected final String TEXT_1267 = NL + "\tpublic ";
  protected final String TEXT_1268 = " create";
  protected final String TEXT_1269 = "(";
  protected final String TEXT_1270 = ", ";
  protected final String TEXT_1271 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1272 = " new";
  protected final String TEXT_1273 = " = (";
  protected final String TEXT_1274 = ") create(eClass);";
  protected final String TEXT_1275 = NL + "\t\t";
  protected final String TEXT_1276 = "().add(new";
  protected final String TEXT_1277 = ");";
  protected final String TEXT_1278 = NL + "\t\tset";
  protected final String TEXT_1279 = "(new";
  protected final String TEXT_1280 = ");";
  protected final String TEXT_1281 = NL + "\t\tint ";
  protected final String TEXT_1282 = "ListSize = 0;";
  protected final String TEXT_1283 = NL + "\t\tint ";
  protected final String TEXT_1284 = "Size = ";
  protected final String TEXT_1285 = " == null ? 0 : ";
  protected final String TEXT_1286 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1287 = "Size > ";
  protected final String TEXT_1288 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1289 = "ListSize = ";
  protected final String TEXT_1290 = "Size;";
  protected final String TEXT_1291 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1292 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1293 = ".create";
  protected final String TEXT_1294 = "(";
  protected final String TEXT_1295 = ", ";
  protected final String TEXT_1296 = "i < ";
  protected final String TEXT_1297 = "Size ? (";
  protected final String TEXT_1298 = ") ";
  protected final String TEXT_1299 = ".get(i) : null";
  protected final String TEXT_1300 = ");" + NL + "\t\t}";
  protected final String TEXT_1301 = NL + "\t\tnew";
  protected final String TEXT_1302 = ".create";
  protected final String TEXT_1303 = "(";
  protected final String TEXT_1304 = ", ";
  protected final String TEXT_1305 = ");";
  protected final String TEXT_1306 = NL + "\t\tif (";
  protected final String TEXT_1307 = " != null)";
  protected final String TEXT_1308 = NL + "\t\t\tnew";
  protected final String TEXT_1309 = ".";
  protected final String TEXT_1310 = "().addAll(";
  protected final String TEXT_1311 = ");";
  protected final String TEXT_1312 = NL + "\t\t\tnew";
  protected final String TEXT_1313 = ".set";
  protected final String TEXT_1314 = "(";
  protected final String TEXT_1315 = ");";
  protected final String TEXT_1316 = NL + "\t\treturn new";
  protected final String TEXT_1317 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1318 = NL + "\t/**";
  protected final String TEXT_1319 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1320 = "}, with the specified ";
  protected final String TEXT_1321 = ", and appends it to the '<em><b>";
  protected final String TEXT_1322 = "</b></em>' ";
  protected final String TEXT_1323 = ".";
  protected final String TEXT_1324 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1325 = "},with the specified ";
  protected final String TEXT_1326 = ", and sets the '<em><b>";
  protected final String TEXT_1327 = "</b></em>' ";
  protected final String TEXT_1328 = ".";
  protected final String TEXT_1329 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1330 = "} and appends it to the '<em><b>";
  protected final String TEXT_1331 = "</b></em>' ";
  protected final String TEXT_1332 = ".";
  protected final String TEXT_1333 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1334 = "} and sets the '<em><b>";
  protected final String TEXT_1335 = "</b></em>' ";
  protected final String TEXT_1336 = ".";
  protected final String TEXT_1337 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1338 = NL + "\t * @param ";
  protected final String TEXT_1339 = " The ";
  protected final String TEXT_1340 = " for the new {@link ";
  protected final String TEXT_1341 = "}, or <code>null</code>.";
  protected final String TEXT_1342 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1343 = "}." + NL + "\t * @see #";
  protected final String TEXT_1344 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1345 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1346 = NL + "\t";
  protected final String TEXT_1347 = " create";
  protected final String TEXT_1348 = "(";
  protected final String TEXT_1349 = ");" + NL;
  protected final String TEXT_1350 = NL + "\t@Override";
  protected final String TEXT_1351 = NL + "\tpublic ";
  protected final String TEXT_1352 = " create";
  protected final String TEXT_1353 = "(";
  protected final String TEXT_1354 = ")" + NL + "\t{";
  protected final String TEXT_1355 = NL + "\t\treturn create";
  protected final String TEXT_1356 = "(";
  protected final String TEXT_1357 = ", ";
  protected final String TEXT_1358 = ");";
  protected final String TEXT_1359 = NL + "\t\t";
  protected final String TEXT_1360 = " new";
  protected final String TEXT_1361 = " = (";
  protected final String TEXT_1362 = ") create(";
  protected final String TEXT_1363 = ");";
  protected final String TEXT_1364 = NL + "\t\t";
  protected final String TEXT_1365 = "().add(new";
  protected final String TEXT_1366 = ");";
  protected final String TEXT_1367 = NL + "\t\tset";
  protected final String TEXT_1368 = "(new";
  protected final String TEXT_1369 = ");";
  protected final String TEXT_1370 = NL + "\t\tint ";
  protected final String TEXT_1371 = "ListSize = 0;";
  protected final String TEXT_1372 = NL + "\t\tint ";
  protected final String TEXT_1373 = "Size = ";
  protected final String TEXT_1374 = " == null ? 0 : ";
  protected final String TEXT_1375 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1376 = "Size > ";
  protected final String TEXT_1377 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1378 = "ListSize = ";
  protected final String TEXT_1379 = "Size;";
  protected final String TEXT_1380 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1381 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1382 = ".create";
  protected final String TEXT_1383 = "(";
  protected final String TEXT_1384 = ", ";
  protected final String TEXT_1385 = "i < ";
  protected final String TEXT_1386 = "Size ? (";
  protected final String TEXT_1387 = ") ";
  protected final String TEXT_1388 = ".get(i) : null";
  protected final String TEXT_1389 = ");" + NL + "\t\t}";
  protected final String TEXT_1390 = NL + "\t\tnew";
  protected final String TEXT_1391 = ".create";
  protected final String TEXT_1392 = "(";
  protected final String TEXT_1393 = ", ";
  protected final String TEXT_1394 = ");";
  protected final String TEXT_1395 = NL + "\t\tif (";
  protected final String TEXT_1396 = " != null)";
  protected final String TEXT_1397 = NL + "\t\t\tnew";
  protected final String TEXT_1398 = ".";
  protected final String TEXT_1399 = "().addAll(";
  protected final String TEXT_1400 = ");";
  protected final String TEXT_1401 = NL + "\t\t\tnew";
  protected final String TEXT_1402 = ".set";
  protected final String TEXT_1403 = "(";
  protected final String TEXT_1404 = ");";
  protected final String TEXT_1405 = NL + "\t\treturn new";
  protected final String TEXT_1406 = ";";
  protected final String TEXT_1407 = NL + "\t}" + NL;
  protected final String TEXT_1408 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1409 = "} with the specified ";
  protected final String TEXT_1410 = " from the '<em><b>";
  protected final String TEXT_1411 = "</b></em>' ";
  protected final String TEXT_1412 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1413 = NL + "\t * @param ";
  protected final String TEXT_1414 = " The ";
  protected final String TEXT_1415 = " of the {@link ";
  protected final String TEXT_1416 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1417 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1418 = "} with the specified ";
  protected final String TEXT_1419 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1420 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1421 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1422 = NL + "\t";
  protected final String TEXT_1423 = " get";
  protected final String TEXT_1424 = "(";
  protected final String TEXT_1425 = ");" + NL;
  protected final String TEXT_1426 = NL + "\t@Override";
  protected final String TEXT_1427 = NL + "\tpublic ";
  protected final String TEXT_1428 = " get";
  protected final String TEXT_1429 = "(";
  protected final String TEXT_1430 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1431 = "(";
  protected final String TEXT_1432 = ", false";
  protected final String TEXT_1433 = ", null";
  protected final String TEXT_1434 = ", false";
  protected final String TEXT_1435 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1436 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1437 = "} with the specified ";
  protected final String TEXT_1438 = " from the '<em><b>";
  protected final String TEXT_1439 = "</b></em>' ";
  protected final String TEXT_1440 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1441 = NL + "\t * @param ";
  protected final String TEXT_1442 = " The ";
  protected final String TEXT_1443 = " of the {@link ";
  protected final String TEXT_1444 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1445 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1446 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1447 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1448 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1449 = "} on demand if not found.";
  protected final String TEXT_1450 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1451 = "} with the specified ";
  protected final String TEXT_1452 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1453 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1454 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1455 = NL + "\t";
  protected final String TEXT_1456 = " get";
  protected final String TEXT_1457 = "(";
  protected final String TEXT_1458 = ", boolean ignoreCase";
  protected final String TEXT_1459 = ", ";
  protected final String TEXT_1460 = " eClass";
  protected final String TEXT_1461 = ", boolean createOnDemand";
  protected final String TEXT_1462 = ");" + NL;
  protected final String TEXT_1463 = NL + "\t@Override";
  protected final String TEXT_1464 = NL + "\tpublic ";
  protected final String TEXT_1465 = " get";
  protected final String TEXT_1466 = "(";
  protected final String TEXT_1467 = ", boolean ignoreCase";
  protected final String TEXT_1468 = ", ";
  protected final String TEXT_1469 = " eClass";
  protected final String TEXT_1470 = ", boolean createOnDemand";
  protected final String TEXT_1471 = ")" + NL + "\t{";
  protected final String TEXT_1472 = NL + "\t\t";
  protected final String TEXT_1473 = "Loop: for (";
  protected final String TEXT_1474 = " ";
  protected final String TEXT_1475 = " : ";
  protected final String TEXT_1476 = "())" + NL + "\t\t{";
  protected final String TEXT_1477 = NL + "\t\t";
  protected final String TEXT_1478 = "Loop: for (";
  protected final String TEXT_1479 = " i = ";
  protected final String TEXT_1480 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1481 = " ";
  protected final String TEXT_1482 = " = (";
  protected final String TEXT_1483 = ") i.next();";
  protected final String TEXT_1484 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1485 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1486 = "Loop;";
  protected final String TEXT_1487 = NL + "\t\t\t";
  protected final String TEXT_1488 = " ";
  protected final String TEXT_1489 = "List = ";
  protected final String TEXT_1490 = ".";
  protected final String TEXT_1491 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1492 = "ListSize = ";
  protected final String TEXT_1493 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1494 = " || (";
  protected final String TEXT_1495 = " != null && ";
  protected final String TEXT_1496 = ".size() != ";
  protected final String TEXT_1497 = "ListSize";
  protected final String TEXT_1498 = ")";
  protected final String TEXT_1499 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1500 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1501 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1502 = " ";
  protected final String TEXT_1503 = " = ";
  protected final String TEXT_1504 = "(";
  protected final String TEXT_1505 = ") ";
  protected final String TEXT_1506 = "List.get(j);";
  protected final String TEXT_1507 = NL + "\t\t\t\tif (";
  protected final String TEXT_1508 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1509 = "(";
  protected final String TEXT_1510 = ")";
  protected final String TEXT_1511 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1512 = ".";
  protected final String TEXT_1513 = "()) : ";
  protected final String TEXT_1514 = ".get(j).equals(";
  protected final String TEXT_1515 = ".";
  protected final String TEXT_1516 = "())))";
  protected final String TEXT_1517 = NL + "\t\t\t\tif (";
  protected final String TEXT_1518 = " != null && !";
  protected final String TEXT_1519 = ".get(j).equals(";
  protected final String TEXT_1520 = ".";
  protected final String TEXT_1521 = "()))";
  protected final String TEXT_1522 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1523 = "Loop;";
  protected final String TEXT_1524 = NL + "\t\t\t}";
  protected final String TEXT_1525 = NL + "\t\t\t";
  protected final String TEXT_1526 = " ";
  protected final String TEXT_1527 = " = ";
  protected final String TEXT_1528 = ".";
  protected final String TEXT_1529 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1530 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1531 = "Loop;";
  protected final String TEXT_1532 = NL + "\t\t\tif (";
  protected final String TEXT_1533 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1534 = ".equalsIgnoreCase(";
  protected final String TEXT_1535 = ".";
  protected final String TEXT_1536 = "()) : ";
  protected final String TEXT_1537 = ".equals(";
  protected final String TEXT_1538 = ".";
  protected final String TEXT_1539 = "())))";
  protected final String TEXT_1540 = NL + "\t\t\tif (";
  protected final String TEXT_1541 = " != null && !";
  protected final String TEXT_1542 = ".equals(";
  protected final String TEXT_1543 = ".";
  protected final String TEXT_1544 = "()))";
  protected final String TEXT_1545 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1546 = "Loop;";
  protected final String TEXT_1547 = NL + "\t\t\tif (";
  protected final String TEXT_1548 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1549 = ".equalsIgnoreCase(";
  protected final String TEXT_1550 = ".";
  protected final String TEXT_1551 = "()) : ";
  protected final String TEXT_1552 = ".equals(";
  protected final String TEXT_1553 = ".";
  protected final String TEXT_1554 = "())))";
  protected final String TEXT_1555 = NL + "\t\t\tif (";
  protected final String TEXT_1556 = " != null && !";
  protected final String TEXT_1557 = ".equals(";
  protected final String TEXT_1558 = ".";
  protected final String TEXT_1559 = "()))";
  protected final String TEXT_1560 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1561 = "Loop;";
  protected final String TEXT_1562 = NL + "\t\t\treturn ";
  protected final String TEXT_1563 = ";" + NL + "\t\t}";
  protected final String TEXT_1564 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1565 = " && eClass != null";
  protected final String TEXT_1566 = " ? create";
  protected final String TEXT_1567 = "(";
  protected final String TEXT_1568 = ", eClass";
  protected final String TEXT_1569 = ") : null;";
  protected final String TEXT_1570 = NL + "\t\treturn null;";
  protected final String TEXT_1571 = NL + "\t}" + NL;
  protected final String TEXT_1572 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1573 = "()" + NL + "\t{";
  protected final String TEXT_1574 = NL + "  \t\treturn false;";
  protected final String TEXT_1575 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1576 = ");";
  protected final String TEXT_1577 = NL + "\t\treturn !((";
  protected final String TEXT_1578 = ".Internal.Wrapper)";
  protected final String TEXT_1579 = "()).featureMap().isEmpty();";
  protected final String TEXT_1580 = NL + "\t\treturn ";
  protected final String TEXT_1581 = " != null && !";
  protected final String TEXT_1582 = ".featureMap().isEmpty();";
  protected final String TEXT_1583 = NL + "\t\treturn ";
  protected final String TEXT_1584 = " != null && !";
  protected final String TEXT_1585 = ".isEmpty();";
  protected final String TEXT_1586 = NL + "\t\t";
  protected final String TEXT_1587 = " ";
  protected final String TEXT_1588 = " = (";
  protected final String TEXT_1589 = ")eVirtualGet(";
  protected final String TEXT_1590 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1591 = " != null && !";
  protected final String TEXT_1592 = ".isEmpty();";
  protected final String TEXT_1593 = NL + "\t\treturn !";
  protected final String TEXT_1594 = "().isEmpty();";
  protected final String TEXT_1595 = NL + "\t\treturn ";
  protected final String TEXT_1596 = " != null;";
  protected final String TEXT_1597 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1598 = ") != null;";
  protected final String TEXT_1599 = NL + "\t\treturn basicGet";
  protected final String TEXT_1600 = "() != null;";
  protected final String TEXT_1601 = NL + "\t\treturn ";
  protected final String TEXT_1602 = " != null;";
  protected final String TEXT_1603 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1604 = ") != null;";
  protected final String TEXT_1605 = NL + "\t\treturn ";
  protected final String TEXT_1606 = "() != null;";
  protected final String TEXT_1607 = NL + "\t\treturn ((";
  protected final String TEXT_1608 = " & ";
  protected final String TEXT_1609 = "_EFLAG) != 0) != ";
  protected final String TEXT_1610 = ";";
  protected final String TEXT_1611 = NL + "\t\treturn ";
  protected final String TEXT_1612 = " != ";
  protected final String TEXT_1613 = ";";
  protected final String TEXT_1614 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1615 = ", ";
  protected final String TEXT_1616 = ") != ";
  protected final String TEXT_1617 = ";";
  protected final String TEXT_1618 = NL + "\t\treturn ";
  protected final String TEXT_1619 = "() != ";
  protected final String TEXT_1620 = ";";
  protected final String TEXT_1621 = NL + "\t\treturn ";
  protected final String TEXT_1622 = " == null ? ";
  protected final String TEXT_1623 = " != null : !";
  protected final String TEXT_1624 = ".equals(";
  protected final String TEXT_1625 = ");";
  protected final String TEXT_1626 = NL + "\t\t";
  protected final String TEXT_1627 = " ";
  protected final String TEXT_1628 = " = (";
  protected final String TEXT_1629 = ")eVirtualGet(";
  protected final String TEXT_1630 = ", ";
  protected final String TEXT_1631 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1632 = " == null ? ";
  protected final String TEXT_1633 = " != null : !";
  protected final String TEXT_1634 = ".equals(";
  protected final String TEXT_1635 = ");";
  protected final String TEXT_1636 = NL + "\t\treturn ";
  protected final String TEXT_1637 = " == null ? ";
  protected final String TEXT_1638 = "() != null : !";
  protected final String TEXT_1639 = ".equals(";
  protected final String TEXT_1640 = "());";
  protected final String TEXT_1641 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1642 = ");";
  protected final String TEXT_1643 = NL + "\t\t";
  protected final String TEXT_1644 = " ";
  protected final String TEXT_1645 = " = (";
  protected final String TEXT_1646 = ")eVirtualGet(";
  protected final String TEXT_1647 = ");";
  protected final String TEXT_1648 = NL + "\t\treturn ";
  protected final String TEXT_1649 = " != null && ((";
  protected final String TEXT_1650 = ".Unsettable";
  protected final String TEXT_1651 = ")";
  protected final String TEXT_1652 = ").isSet();";
  protected final String TEXT_1653 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1654 = ");";
  protected final String TEXT_1655 = NL + "\t\treturn (";
  protected final String TEXT_1656 = " & ";
  protected final String TEXT_1657 = "_ESETFLAG) != 0;";
  protected final String TEXT_1658 = NL + "\t\treturn ";
  protected final String TEXT_1659 = "ESet;";
  protected final String TEXT_1660 = NL + "\t\treturn !((";
  protected final String TEXT_1661 = ".Internal)((";
  protected final String TEXT_1662 = ".Internal.Wrapper)get";
  protected final String TEXT_1663 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1664 = ");";
  protected final String TEXT_1665 = NL + "\t\treturn !((";
  protected final String TEXT_1666 = ".Internal)get";
  protected final String TEXT_1667 = "()).isEmpty(";
  protected final String TEXT_1668 = ");";
  protected final String TEXT_1669 = NL + "\t\treturn ";
  protected final String TEXT_1670 = ".";
  protected final String TEXT_1671 = "(this);";
  protected final String TEXT_1672 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1673 = "' ";
  protected final String TEXT_1674 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1675 = NL + "\t}" + NL;
  protected final String TEXT_1676 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1677 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1678 = NL + "\t * ";
  protected final String TEXT_1679 = NL + "\t * @param ";
  protected final String TEXT_1680 = NL + "\t *   ";
  protected final String TEXT_1681 = NL + "\t * @param ";
  protected final String TEXT_1682 = " ";
  protected final String TEXT_1683 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1684 = NL + "\t * @model ";
  protected final String TEXT_1685 = NL + "\t *        ";
  protected final String TEXT_1686 = NL + "\t * @model";
  protected final String TEXT_1687 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1688 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1689 = NL + "\t@Override";
  protected final String TEXT_1690 = NL + "\t";
  protected final String TEXT_1691 = " ";
  protected final String TEXT_1692 = "(";
  protected final String TEXT_1693 = ")";
  protected final String TEXT_1694 = ";" + NL;
  protected final String TEXT_1695 = NL + "\tpublic ";
  protected final String TEXT_1696 = " ";
  protected final String TEXT_1697 = "(";
  protected final String TEXT_1698 = ")";
  protected final String TEXT_1699 = NL + "\t{";
  protected final String TEXT_1700 = NL + "\t\t";
  protected final String TEXT_1701 = NL + "\t\treturn ";
  protected final String TEXT_1702 = ".";
  protected final String TEXT_1703 = "(this, ";
  protected final String TEXT_1704 = ", ";
  protected final String TEXT_1705 = ");";
  protected final String TEXT_1706 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1707 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1708 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1709 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1710 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1711 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1712 = ".";
  protected final String TEXT_1713 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1714 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1715 = "\", ";
  protected final String TEXT_1716 = ".getObjectLabel(this, ";
  protected final String TEXT_1717 = ") }),";
  protected final String TEXT_1718 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1719 = NL + "\t\t";
  protected final String TEXT_1720 = ".";
  protected final String TEXT_1721 = "(this";
  protected final String TEXT_1722 = ", ";
  protected final String TEXT_1723 = ");";
  protected final String TEXT_1724 = NL + "\t\t";
  protected final String TEXT_1725 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1726 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1727 = NL + "\t\t\t";
  protected final String TEXT_1728 = " result = (";
  protected final String TEXT_1729 = ") cache.get(";
  protected final String TEXT_1730 = "eResource(), ";
  protected final String TEXT_1731 = "this, ";
  protected final String TEXT_1732 = ".getEOperations().get(";
  protected final String TEXT_1733 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1734 = "eResource(), ";
  protected final String TEXT_1735 = "this, ";
  protected final String TEXT_1736 = ".getEOperations().get(";
  protected final String TEXT_1737 = "), result = ";
  protected final String TEXT_1738 = "new ";
  protected final String TEXT_1739 = "(";
  protected final String TEXT_1740 = ".";
  protected final String TEXT_1741 = "(this";
  protected final String TEXT_1742 = ", ";
  protected final String TEXT_1743 = ")";
  protected final String TEXT_1744 = ")";
  protected final String TEXT_1745 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1746 = ".";
  protected final String TEXT_1747 = "()";
  protected final String TEXT_1748 = ";" + NL + "\t\t}";
  protected final String TEXT_1749 = NL + "\t\treturn ";
  protected final String TEXT_1750 = ".";
  protected final String TEXT_1751 = "(this";
  protected final String TEXT_1752 = ", ";
  protected final String TEXT_1753 = ");";
  protected final String TEXT_1754 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1755 = NL + "\t}" + NL;
  protected final String TEXT_1756 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1757 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1758 = NL + "\t@Override";
  protected final String TEXT_1759 = NL + "\tpublic ";
  protected final String TEXT_1760 = " eInverseAdd(";
  protected final String TEXT_1761 = " otherEnd, int featureID, ";
  protected final String TEXT_1762 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1763 = NL + "\t\t\tcase ";
  protected final String TEXT_1764 = ":";
  protected final String TEXT_1765 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1766 = "(";
  protected final String TEXT_1767 = ".InternalMapView";
  protected final String TEXT_1768 = ")";
  protected final String TEXT_1769 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1770 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1771 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1772 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1773 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1774 = "((";
  protected final String TEXT_1775 = ")otherEnd, msgs);";
  protected final String TEXT_1776 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1777 = ", msgs);";
  protected final String TEXT_1778 = NL + "\t\t\t\t";
  protected final String TEXT_1779 = " ";
  protected final String TEXT_1780 = " = (";
  protected final String TEXT_1781 = ")eVirtualGet(";
  protected final String TEXT_1782 = ");";
  protected final String TEXT_1783 = NL + "\t\t\t\tif (";
  protected final String TEXT_1784 = " != null)";
  protected final String TEXT_1785 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1786 = ")";
  protected final String TEXT_1787 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1788 = ", null, msgs);";
  protected final String TEXT_1789 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1790 = ")";
  protected final String TEXT_1791 = ").eInverseRemove(this, ";
  protected final String TEXT_1792 = ", ";
  protected final String TEXT_1793 = ".class, msgs);";
  protected final String TEXT_1794 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1795 = "((";
  protected final String TEXT_1796 = ")otherEnd, msgs);";
  protected final String TEXT_1797 = NL + "\t\t}";
  protected final String TEXT_1798 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1799 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1800 = NL + "\t}" + NL;
  protected final String TEXT_1801 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1802 = NL + "\t@Override";
  protected final String TEXT_1803 = NL + "\tpublic ";
  protected final String TEXT_1804 = " eInverseRemove(";
  protected final String TEXT_1805 = " otherEnd, int featureID, ";
  protected final String TEXT_1806 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1807 = NL + "\t\t\tcase ";
  protected final String TEXT_1808 = ":";
  protected final String TEXT_1809 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1810 = ")((";
  protected final String TEXT_1811 = ".InternalMapView";
  protected final String TEXT_1812 = ")";
  protected final String TEXT_1813 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1814 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1815 = ")((";
  protected final String TEXT_1816 = ".Internal.Wrapper)";
  protected final String TEXT_1817 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1818 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1819 = ")";
  protected final String TEXT_1820 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1821 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1822 = ", msgs);";
  protected final String TEXT_1823 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1824 = "(msgs);";
  protected final String TEXT_1825 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1826 = "(null, msgs);";
  protected final String TEXT_1827 = NL + "\t\t}";
  protected final String TEXT_1828 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1829 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1830 = NL + "\t}" + NL;
  protected final String TEXT_1831 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1832 = NL + "\t@Override";
  protected final String TEXT_1833 = NL + "\tpublic ";
  protected final String TEXT_1834 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1835 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1836 = NL + "\t\t\tcase ";
  protected final String TEXT_1837 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1838 = ", ";
  protected final String TEXT_1839 = ".class, msgs);";
  protected final String TEXT_1840 = NL + "\t\t}";
  protected final String TEXT_1841 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1842 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1843 = NL + "\t}" + NL;
  protected final String TEXT_1844 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1845 = NL + "\t@Override";
  protected final String TEXT_1846 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1847 = NL + "\t\t\tcase ";
  protected final String TEXT_1848 = ":";
  protected final String TEXT_1849 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1850 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1851 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1852 = "(";
  protected final String TEXT_1853 = "());";
  protected final String TEXT_1854 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1855 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1856 = "();";
  protected final String TEXT_1857 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1858 = ".InternalMapView";
  protected final String TEXT_1859 = ")";
  protected final String TEXT_1860 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1861 = "();";
  protected final String TEXT_1862 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1863 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1864 = "().map();";
  protected final String TEXT_1865 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1866 = ".Internal.Wrapper)";
  protected final String TEXT_1867 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1868 = "();";
  protected final String TEXT_1869 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1870 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1871 = ".Internal)";
  protected final String TEXT_1872 = "()).getWrapper();";
  protected final String TEXT_1873 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1874 = "();";
  protected final String TEXT_1875 = NL + "\t\t}";
  protected final String TEXT_1876 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1877 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1878 = NL + "\t}" + NL;
  protected final String TEXT_1879 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1880 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1881 = NL + "\t@Override";
  protected final String TEXT_1882 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1883 = NL + "\t\t\tcase ";
  protected final String TEXT_1884 = ":";
  protected final String TEXT_1885 = NL + "\t\t\t\t((";
  protected final String TEXT_1886 = ".Internal)((";
  protected final String TEXT_1887 = ".Internal.Wrapper)";
  protected final String TEXT_1888 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1889 = NL + "\t\t\t\t((";
  protected final String TEXT_1890 = ".Internal)";
  protected final String TEXT_1891 = "()).set(newValue);";
  protected final String TEXT_1892 = NL + "\t\t\t\t((";
  protected final String TEXT_1893 = ".Setting)((";
  protected final String TEXT_1894 = ".InternalMapView";
  protected final String TEXT_1895 = ")";
  protected final String TEXT_1896 = "()).eMap()).set(newValue);";
  protected final String TEXT_1897 = NL + "\t\t\t\t((";
  protected final String TEXT_1898 = ".Setting)";
  protected final String TEXT_1899 = "()).set(newValue);";
  protected final String TEXT_1900 = NL + "\t\t\t\t";
  protected final String TEXT_1901 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1902 = "().addAll((";
  protected final String TEXT_1903 = "<? extends ";
  protected final String TEXT_1904 = ">";
  protected final String TEXT_1905 = ")newValue);";
  protected final String TEXT_1906 = NL + "\t\t\t\tset";
  protected final String TEXT_1907 = "(((";
  protected final String TEXT_1908 = ")newValue).";
  protected final String TEXT_1909 = "());";
  protected final String TEXT_1910 = NL + "\t\t\t\tset";
  protected final String TEXT_1911 = "(";
  protected final String TEXT_1912 = "(";
  protected final String TEXT_1913 = ")";
  protected final String TEXT_1914 = "newValue);";
  protected final String TEXT_1915 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1916 = NL + "\t\t}";
  protected final String TEXT_1917 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1918 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1919 = NL + "\t}" + NL;
  protected final String TEXT_1920 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1921 = NL + "\t@Override";
  protected final String TEXT_1922 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1923 = NL + "\t\t\tcase ";
  protected final String TEXT_1924 = ":";
  protected final String TEXT_1925 = NL + "\t\t\t\t((";
  protected final String TEXT_1926 = ".Internal.Wrapper)";
  protected final String TEXT_1927 = "()).featureMap().clear();";
  protected final String TEXT_1928 = NL + "\t\t\t\t";
  protected final String TEXT_1929 = "().clear();";
  protected final String TEXT_1930 = NL + "\t\t\t\tunset";
  protected final String TEXT_1931 = "();";
  protected final String TEXT_1932 = NL + "\t\t\t\tset";
  protected final String TEXT_1933 = "((";
  protected final String TEXT_1934 = ")null);";
  protected final String TEXT_1935 = NL + "\t\t\t\tset";
  protected final String TEXT_1936 = "(";
  protected final String TEXT_1937 = ");";
  protected final String TEXT_1938 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1939 = NL + "\t\t}";
  protected final String TEXT_1940 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1941 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1942 = NL + "\t}" + NL;
  protected final String TEXT_1943 = NL;
  protected final String TEXT_1944 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1945 = NL + "\t@Override";
  protected final String TEXT_1946 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1947 = NL + "\t\t\tcase ";
  protected final String TEXT_1948 = ":";
  protected final String TEXT_1949 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1950 = "();";
  protected final String TEXT_1951 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1952 = ".Internal.Wrapper)";
  protected final String TEXT_1953 = "()).featureMap().isEmpty();";
  protected final String TEXT_1954 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1955 = " != null && !";
  protected final String TEXT_1956 = ".featureMap().isEmpty();";
  protected final String TEXT_1957 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1958 = " != null && !";
  protected final String TEXT_1959 = ".isEmpty();";
  protected final String TEXT_1960 = NL + "\t\t\t\t";
  protected final String TEXT_1961 = " ";
  protected final String TEXT_1962 = " = (";
  protected final String TEXT_1963 = ")eVirtualGet(";
  protected final String TEXT_1964 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1965 = " != null && !";
  protected final String TEXT_1966 = ".isEmpty();";
  protected final String TEXT_1967 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1968 = "().isEmpty();";
  protected final String TEXT_1969 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1970 = "();";
  protected final String TEXT_1971 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1972 = " != null;";
  protected final String TEXT_1973 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1974 = ") != null;";
  protected final String TEXT_1975 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1976 = "() != null;";
  protected final String TEXT_1977 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1978 = " != null;";
  protected final String TEXT_1979 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1980 = ") != null;";
  protected final String TEXT_1981 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1982 = "() != null;";
  protected final String TEXT_1983 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1984 = " & ";
  protected final String TEXT_1985 = "_EFLAG) != 0) != ";
  protected final String TEXT_1986 = ";";
  protected final String TEXT_1987 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1988 = " != ";
  protected final String TEXT_1989 = ";";
  protected final String TEXT_1990 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1991 = ", ";
  protected final String TEXT_1992 = ") != ";
  protected final String TEXT_1993 = ";";
  protected final String TEXT_1994 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1995 = "() != ";
  protected final String TEXT_1996 = ";";
  protected final String TEXT_1997 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1998 = " == null ? ";
  protected final String TEXT_1999 = " != null : !";
  protected final String TEXT_2000 = ".equals(";
  protected final String TEXT_2001 = ");";
  protected final String TEXT_2002 = NL + "\t\t\t\t";
  protected final String TEXT_2003 = " ";
  protected final String TEXT_2004 = " = (";
  protected final String TEXT_2005 = ")eVirtualGet(";
  protected final String TEXT_2006 = ", ";
  protected final String TEXT_2007 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2008 = " == null ? ";
  protected final String TEXT_2009 = " != null : !";
  protected final String TEXT_2010 = ".equals(";
  protected final String TEXT_2011 = ");";
  protected final String TEXT_2012 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2013 = " == null ? ";
  protected final String TEXT_2014 = "() != null : !";
  protected final String TEXT_2015 = ".equals(";
  protected final String TEXT_2016 = "());";
  protected final String TEXT_2017 = NL + "\t\t}";
  protected final String TEXT_2018 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2019 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2020 = NL + "\t}" + NL;
  protected final String TEXT_2021 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2022 = NL + "\t@Override";
  protected final String TEXT_2023 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2024 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2025 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2026 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2027 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2028 = ": return ";
  protected final String TEXT_2029 = ";";
  protected final String TEXT_2030 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2031 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2032 = NL + "\t@Override";
  protected final String TEXT_2033 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2034 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2035 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2036 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2037 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2038 = ": return ";
  protected final String TEXT_2039 = ";";
  protected final String TEXT_2040 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2041 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2042 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2043 = NL + "\t@Override";
  protected final String TEXT_2044 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2045 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2046 = NL + "\t@Override";
  protected final String TEXT_2047 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2048 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2049 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2050 = NL + "\t@Override";
  protected final String TEXT_2051 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2052 = NL + "\t\t\tcase ";
  protected final String TEXT_2053 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2054 = ";";
  protected final String TEXT_2055 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2056 = NL + "\t@Override";
  protected final String TEXT_2057 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2058 = NL + "\t\t\tcase ";
  protected final String TEXT_2059 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2060 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2061 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2062 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2063 = NL + "\t@Override";
  protected final String TEXT_2064 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2065 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2066 = ": \");";
  protected final String TEXT_2067 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2068 = ": \");";
  protected final String TEXT_2069 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2070 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2071 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2072 = NL + "\t\tif (";
  protected final String TEXT_2073 = "(";
  protected final String TEXT_2074 = " & ";
  protected final String TEXT_2075 = "_ESETFLAG) != 0";
  protected final String TEXT_2076 = "ESet";
  protected final String TEXT_2077 = ") result.append((";
  protected final String TEXT_2078 = " & ";
  protected final String TEXT_2079 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2080 = NL + "\t\tif (";
  protected final String TEXT_2081 = "(";
  protected final String TEXT_2082 = " & ";
  protected final String TEXT_2083 = "_ESETFLAG) != 0";
  protected final String TEXT_2084 = "ESet";
  protected final String TEXT_2085 = ") result.append(";
  protected final String TEXT_2086 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2087 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2088 = ", ";
  protected final String TEXT_2089 = "));";
  protected final String TEXT_2090 = NL + "\t\tresult.append((";
  protected final String TEXT_2091 = " & ";
  protected final String TEXT_2092 = "_EFLAG) != 0);";
  protected final String TEXT_2093 = NL + "\t\tresult.append(";
  protected final String TEXT_2094 = ");";
  protected final String TEXT_2095 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2096 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2097 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2098 = " getKey()" + NL + "\t{";
  protected final String TEXT_2099 = NL + "\t\treturn new ";
  protected final String TEXT_2100 = "(getTypedKey());";
  protected final String TEXT_2101 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2102 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2103 = " key)" + NL + "\t{";
  protected final String TEXT_2104 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2105 = "(";
  protected final String TEXT_2106 = ")";
  protected final String TEXT_2107 = "key);";
  protected final String TEXT_2108 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2109 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2110 = ")key).";
  protected final String TEXT_2111 = "());";
  protected final String TEXT_2112 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2113 = ")key);";
  protected final String TEXT_2114 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2115 = " getValue()" + NL + "\t{";
  protected final String TEXT_2116 = NL + "\t\treturn new ";
  protected final String TEXT_2117 = "(getTypedValue());";
  protected final String TEXT_2118 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2119 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2120 = " setValue(";
  protected final String TEXT_2121 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2122 = " oldValue = getValue();";
  protected final String TEXT_2123 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2124 = "(";
  protected final String TEXT_2125 = ")";
  protected final String TEXT_2126 = "value);";
  protected final String TEXT_2127 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2128 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2129 = ")value).";
  protected final String TEXT_2130 = "());";
  protected final String TEXT_2131 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2132 = ")value);";
  protected final String TEXT_2133 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2134 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2135 = NL + "\tpublic ";
  protected final String TEXT_2136 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2137 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2138 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2139 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2140 = " create(";
  protected final String TEXT_2141 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2142 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2143 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2144 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2145 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2146 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2147 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2148 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2149 = NL + "\t@Override";
  protected final String TEXT_2150 = NL + "\tprotected ";
  protected final String TEXT_2151 = " ";
  protected final String TEXT_2152 = "Helper(";
  protected final String TEXT_2153 = " ";
  protected final String TEXT_2154 = ")" + NL + "\t{";
  protected final String TEXT_2155 = NL + "\t\t";
  protected final String TEXT_2156 = ".addAll(super.";
  protected final String TEXT_2157 = "());";
  protected final String TEXT_2158 = NL + "\t\tsuper.";
  protected final String TEXT_2159 = "Helper(";
  protected final String TEXT_2160 = ");";
  protected final String TEXT_2161 = NL + "\t\tif (isSet";
  protected final String TEXT_2162 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2163 = "<";
  protected final String TEXT_2164 = ">";
  protected final String TEXT_2165 = " i = ((";
  protected final String TEXT_2166 = ") ";
  protected final String TEXT_2167 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2168 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2169 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2170 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2171 = "<";
  protected final String TEXT_2172 = ">";
  protected final String TEXT_2173 = " i = ((";
  protected final String TEXT_2174 = ") ";
  protected final String TEXT_2175 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2176 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2177 = NL + "\t\t";
  protected final String TEXT_2178 = " ";
  protected final String TEXT_2179 = " = ";
  protected final String TEXT_2180 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2181 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2182 = "<";
  protected final String TEXT_2183 = ">";
  protected final String TEXT_2184 = " i = ((";
  protected final String TEXT_2185 = ") ";
  protected final String TEXT_2186 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2187 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2188 = NL + "\t\tif (isSet";
  protected final String TEXT_2189 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2190 = ".addAll(";
  protected final String TEXT_2191 = "());" + NL + "\t\t}";
  protected final String TEXT_2192 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2193 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2194 = ".addAll(";
  protected final String TEXT_2195 = "());" + NL + "\t\t}";
  protected final String TEXT_2196 = NL + "\t\t";
  protected final String TEXT_2197 = " ";
  protected final String TEXT_2198 = " = ";
  protected final String TEXT_2199 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2200 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2201 = ".addAll(";
  protected final String TEXT_2202 = ");" + NL + "\t\t}";
  protected final String TEXT_2203 = NL + "\t\tif (isSet";
  protected final String TEXT_2204 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2205 = ".add(";
  protected final String TEXT_2206 = "basicGet";
  protected final String TEXT_2207 = "());" + NL + "\t\t}";
  protected final String TEXT_2208 = NL + "\t\t";
  protected final String TEXT_2209 = " ";
  protected final String TEXT_2210 = " = ";
  protected final String TEXT_2211 = "basicGet";
  protected final String TEXT_2212 = "();" + NL + "\t\tif (";
  protected final String TEXT_2213 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2214 = ".add(";
  protected final String TEXT_2215 = ");" + NL + "\t\t}";
  protected final String TEXT_2216 = NL + "\t\treturn ";
  protected final String TEXT_2217 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2218 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2219 = NL + "\t@Override";
  protected final String TEXT_2220 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2221 = "()" + NL + "\t{";
  protected final String TEXT_2222 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2223 = "()";
  protected final String TEXT_2224 = NL + "\t\treturn isSet";
  protected final String TEXT_2225 = "()";
  protected final String TEXT_2226 = ";";
  protected final String TEXT_2227 = NL + "\t\treturn !";
  protected final String TEXT_2228 = "().isEmpty()";
  protected final String TEXT_2229 = ";";
  protected final String TEXT_2230 = NL + "\t\treturn ";
  protected final String TEXT_2231 = "basicGet";
  protected final String TEXT_2232 = "() != null";
  protected final String TEXT_2233 = ";";
  protected final String TEXT_2234 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2235 = ")";
  protected final String TEXT_2236 = ";";
  protected final String TEXT_2237 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2238 = "()";
  protected final String TEXT_2239 = ";";
  protected final String TEXT_2240 = NL + "\t\t\t|| !";
  protected final String TEXT_2241 = "().isEmpty()";
  protected final String TEXT_2242 = ";";
  protected final String TEXT_2243 = NL + "\t\t\t|| ";
  protected final String TEXT_2244 = "basicGet";
  protected final String TEXT_2245 = "() != null";
  protected final String TEXT_2246 = ";";
  protected final String TEXT_2247 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2248 = ")";
  protected final String TEXT_2249 = ";";
  protected final String TEXT_2250 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2251 = "();";
  protected final String TEXT_2252 = NL + "\t\treturn false;";
  protected final String TEXT_2253 = NL + "\t}" + NL;
  protected final String TEXT_2254 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2255 = NL + "\t@Override";
  protected final String TEXT_2256 = NL + "\tpublic ";
  protected final String TEXT_2257 = " ";
  protected final String TEXT_2258 = "()" + NL + "\t{";
  protected final String TEXT_2259 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2260 = " ";
  protected final String TEXT_2261 = " = (";
  protected final String TEXT_2262 = ")((";
  protected final String TEXT_2263 = ")";
  protected final String TEXT_2264 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2265 = ";";
  protected final String TEXT_2266 = NL + "\t\treturn ";
  protected final String TEXT_2267 = "();";
  protected final String TEXT_2268 = NL + "\t\treturn new ";
  protected final String TEXT_2269 = ".UnmodifiableEList";
  protected final String TEXT_2270 = "(this, ";
  protected final String TEXT_2271 = "null";
  protected final String TEXT_2272 = ", 0, ";
  protected final String TEXT_2273 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2274 = NL + "\t\treturn null;";
  protected final String TEXT_2275 = NL + "\t\treturn ";
  protected final String TEXT_2276 = "();";
  protected final String TEXT_2277 = NL + "\t}" + NL;
  protected final String TEXT_2278 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2279 = NL + "\t@Override";
  protected final String TEXT_2280 = NL + "\tpublic ";
  protected final String TEXT_2281 = " basicGet";
  protected final String TEXT_2282 = "()" + NL + "\t{";
  protected final String TEXT_2283 = NL + "\t\treturn null;";
  protected final String TEXT_2284 = NL + "\t\treturn ";
  protected final String TEXT_2285 = "basicGet";
  protected final String TEXT_2286 = "();";
  protected final String TEXT_2287 = NL + "\t}" + NL;
  protected final String TEXT_2288 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2289 = NL + "\t@Override";
  protected final String TEXT_2290 = NL + "\tpublic ";
  protected final String TEXT_2291 = " basicSet";
  protected final String TEXT_2292 = "(";
  protected final String TEXT_2293 = " new";
  protected final String TEXT_2294 = ", ";
  protected final String TEXT_2295 = " msgs)" + NL + "\t{";
  protected final String TEXT_2296 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2297 = NL + "\t\tif (new";
  protected final String TEXT_2298 = " != null && !(new";
  protected final String TEXT_2299 = " instanceof ";
  protected final String TEXT_2300 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2301 = "));" + NL + "\t\t}";
  protected final String TEXT_2302 = NL + "\t\treturn basicSet";
  protected final String TEXT_2303 = "(";
  protected final String TEXT_2304 = "(";
  protected final String TEXT_2305 = ") ";
  protected final String TEXT_2306 = "new";
  protected final String TEXT_2307 = ", msgs);";
  protected final String TEXT_2308 = NL + "\t\tset";
  protected final String TEXT_2309 = "(";
  protected final String TEXT_2310 = "(";
  protected final String TEXT_2311 = ") ";
  protected final String TEXT_2312 = "new";
  protected final String TEXT_2313 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2314 = NL + "\t}" + NL;
  protected final String TEXT_2315 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2316 = NL + "\t@Override";
  protected final String TEXT_2317 = NL + "\tpublic void set";
  protected final String TEXT_2318 = "(";
  protected final String TEXT_2319 = " new";
  protected final String TEXT_2320 = ")" + NL + "\t{";
  protected final String TEXT_2321 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2322 = NL + "\t\tif (new";
  protected final String TEXT_2323 = " != null && !(new";
  protected final String TEXT_2324 = " instanceof ";
  protected final String TEXT_2325 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2326 = "));" + NL + "\t\t}";
  protected final String TEXT_2327 = NL + "\t\tset";
  protected final String TEXT_2328 = "(";
  protected final String TEXT_2329 = "(";
  protected final String TEXT_2330 = ") ";
  protected final String TEXT_2331 = "new";
  protected final String TEXT_2332 = ");";
  protected final String TEXT_2333 = NL + "\t}" + NL;
  protected final String TEXT_2334 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2335 = "() <em>";
  protected final String TEXT_2336 = "</em>}' ";
  protected final String TEXT_2337 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2338 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2339 = "_ESUBSETS = ";
  protected final String TEXT_2340 = ";" + NL;
  protected final String TEXT_2341 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2342 = "() <em>";
  protected final String TEXT_2343 = "</em>}' ";
  protected final String TEXT_2344 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2345 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2346 = "_ESUPERSETS = ";
  protected final String TEXT_2347 = ";" + NL;
  protected final String TEXT_2348 = NL + "\t/**";
  protected final String TEXT_2349 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2350 = "}, with the specified ";
  protected final String TEXT_2351 = ", and appends it to the '<em><b>";
  protected final String TEXT_2352 = "</b></em>' ";
  protected final String TEXT_2353 = ".";
  protected final String TEXT_2354 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2355 = "}, with the specified ";
  protected final String TEXT_2356 = ", and sets the '<em><b>";
  protected final String TEXT_2357 = "</b></em>' ";
  protected final String TEXT_2358 = ".";
  protected final String TEXT_2359 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2360 = "} and appends it to the '<em><b>";
  protected final String TEXT_2361 = "</b></em>' ";
  protected final String TEXT_2362 = ".";
  protected final String TEXT_2363 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2364 = "} and sets the '<em><b>";
  protected final String TEXT_2365 = "</b></em>' ";
  protected final String TEXT_2366 = ".";
  protected final String TEXT_2367 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2368 = NL + "\t * @param ";
  protected final String TEXT_2369 = " The ";
  protected final String TEXT_2370 = " for the new {@link ";
  protected final String TEXT_2371 = "}, or <code>null</code>.";
  protected final String TEXT_2372 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2373 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2374 = "}." + NL + "\t * @see #";
  protected final String TEXT_2375 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2376 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2377 = NL + "\t";
  protected final String TEXT_2378 = " create";
  protected final String TEXT_2379 = "(";
  protected final String TEXT_2380 = ", ";
  protected final String TEXT_2381 = " eClass);" + NL;
  protected final String TEXT_2382 = NL + "\t@Override";
  protected final String TEXT_2383 = NL + "\tpublic ";
  protected final String TEXT_2384 = " create";
  protected final String TEXT_2385 = "(";
  protected final String TEXT_2386 = ", ";
  protected final String TEXT_2387 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2388 = " new";
  protected final String TEXT_2389 = " = (";
  protected final String TEXT_2390 = ") create(eClass);";
  protected final String TEXT_2391 = NL + "\t\t";
  protected final String TEXT_2392 = "().add(new";
  protected final String TEXT_2393 = ");";
  protected final String TEXT_2394 = NL + "\t\tset";
  protected final String TEXT_2395 = "(new";
  protected final String TEXT_2396 = ");";
  protected final String TEXT_2397 = NL + "\t\tint ";
  protected final String TEXT_2398 = "ListSize = 0;";
  protected final String TEXT_2399 = NL + "\t\tint ";
  protected final String TEXT_2400 = "Size = ";
  protected final String TEXT_2401 = " == null ? 0 : ";
  protected final String TEXT_2402 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2403 = "Size > ";
  protected final String TEXT_2404 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2405 = "ListSize = ";
  protected final String TEXT_2406 = "Size;";
  protected final String TEXT_2407 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2408 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2409 = ".create";
  protected final String TEXT_2410 = "(";
  protected final String TEXT_2411 = ", ";
  protected final String TEXT_2412 = "i < ";
  protected final String TEXT_2413 = "Size ? (";
  protected final String TEXT_2414 = ") ";
  protected final String TEXT_2415 = ".get(i) : null";
  protected final String TEXT_2416 = ");" + NL + "\t\t}";
  protected final String TEXT_2417 = NL + "\t\tnew";
  protected final String TEXT_2418 = ".create";
  protected final String TEXT_2419 = "(";
  protected final String TEXT_2420 = ", ";
  protected final String TEXT_2421 = ");";
  protected final String TEXT_2422 = NL + "\t\tif (";
  protected final String TEXT_2423 = " != null)";
  protected final String TEXT_2424 = NL + "\t\t\tnew";
  protected final String TEXT_2425 = ".";
  protected final String TEXT_2426 = "().addAll(";
  protected final String TEXT_2427 = ");";
  protected final String TEXT_2428 = NL + "\t\t\tnew";
  protected final String TEXT_2429 = ".set";
  protected final String TEXT_2430 = "(";
  protected final String TEXT_2431 = ");";
  protected final String TEXT_2432 = NL + "\t\treturn new";
  protected final String TEXT_2433 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2434 = NL + "\t/**";
  protected final String TEXT_2435 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2436 = "}, with the specified ";
  protected final String TEXT_2437 = ", and appends it to the '<em><b>";
  protected final String TEXT_2438 = "</b></em>' ";
  protected final String TEXT_2439 = ".";
  protected final String TEXT_2440 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2441 = "},with the specified ";
  protected final String TEXT_2442 = ", and sets the '<em><b>";
  protected final String TEXT_2443 = "</b></em>' ";
  protected final String TEXT_2444 = ".";
  protected final String TEXT_2445 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2446 = "} and appends it to the '<em><b>";
  protected final String TEXT_2447 = "</b></em>' ";
  protected final String TEXT_2448 = ".";
  protected final String TEXT_2449 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2450 = "} and sets the '<em><b>";
  protected final String TEXT_2451 = "</b></em>' ";
  protected final String TEXT_2452 = ".";
  protected final String TEXT_2453 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2454 = NL + "\t * @param ";
  protected final String TEXT_2455 = " The ";
  protected final String TEXT_2456 = " for the new {@link ";
  protected final String TEXT_2457 = "}, or <code>null</code>.";
  protected final String TEXT_2458 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2459 = "}." + NL + "\t * @see #";
  protected final String TEXT_2460 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2461 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2462 = NL + "\t";
  protected final String TEXT_2463 = " create";
  protected final String TEXT_2464 = "(";
  protected final String TEXT_2465 = ");" + NL;
  protected final String TEXT_2466 = NL + "\t@Override";
  protected final String TEXT_2467 = NL + "\tpublic ";
  protected final String TEXT_2468 = " create";
  protected final String TEXT_2469 = "(";
  protected final String TEXT_2470 = ")" + NL + "\t{";
  protected final String TEXT_2471 = NL + "\t\treturn create";
  protected final String TEXT_2472 = "(";
  protected final String TEXT_2473 = ", ";
  protected final String TEXT_2474 = ");";
  protected final String TEXT_2475 = NL + "\t\t";
  protected final String TEXT_2476 = " new";
  protected final String TEXT_2477 = " = (";
  protected final String TEXT_2478 = ") create(";
  protected final String TEXT_2479 = ");";
  protected final String TEXT_2480 = NL + "\t\t";
  protected final String TEXT_2481 = "().add(new";
  protected final String TEXT_2482 = ");";
  protected final String TEXT_2483 = NL + "\t\tset";
  protected final String TEXT_2484 = "(new";
  protected final String TEXT_2485 = ");";
  protected final String TEXT_2486 = NL + "\t\tint ";
  protected final String TEXT_2487 = "ListSize = 0;";
  protected final String TEXT_2488 = NL + "\t\tint ";
  protected final String TEXT_2489 = "Size = ";
  protected final String TEXT_2490 = " == null ? 0 : ";
  protected final String TEXT_2491 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2492 = "Size > ";
  protected final String TEXT_2493 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2494 = "ListSize = ";
  protected final String TEXT_2495 = "Size;";
  protected final String TEXT_2496 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2497 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2498 = ".create";
  protected final String TEXT_2499 = "(";
  protected final String TEXT_2500 = ", ";
  protected final String TEXT_2501 = "i < ";
  protected final String TEXT_2502 = "Size ? (";
  protected final String TEXT_2503 = ") ";
  protected final String TEXT_2504 = ".get(i) : null";
  protected final String TEXT_2505 = ");" + NL + "\t\t}";
  protected final String TEXT_2506 = NL + "\t\tnew";
  protected final String TEXT_2507 = ".create";
  protected final String TEXT_2508 = "(";
  protected final String TEXT_2509 = ", ";
  protected final String TEXT_2510 = ");";
  protected final String TEXT_2511 = NL + "\t\tif (";
  protected final String TEXT_2512 = " != null)";
  protected final String TEXT_2513 = NL + "\t\t\tnew";
  protected final String TEXT_2514 = ".";
  protected final String TEXT_2515 = "().addAll(";
  protected final String TEXT_2516 = ");";
  protected final String TEXT_2517 = NL + "\t\t\tnew";
  protected final String TEXT_2518 = ".set";
  protected final String TEXT_2519 = "(";
  protected final String TEXT_2520 = ");";
  protected final String TEXT_2521 = NL + "\t\treturn new";
  protected final String TEXT_2522 = ";";
  protected final String TEXT_2523 = NL + "\t}" + NL;
  protected final String TEXT_2524 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2525 = "} with the specified ";
  protected final String TEXT_2526 = " from the '<em><b>";
  protected final String TEXT_2527 = "</b></em>' ";
  protected final String TEXT_2528 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2529 = NL + "\t * @param ";
  protected final String TEXT_2530 = " The ";
  protected final String TEXT_2531 = " of the {@link ";
  protected final String TEXT_2532 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2533 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2534 = "} with the specified ";
  protected final String TEXT_2535 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2536 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2537 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2538 = NL + "\t";
  protected final String TEXT_2539 = " get";
  protected final String TEXT_2540 = "(";
  protected final String TEXT_2541 = ");" + NL;
  protected final String TEXT_2542 = NL + "\t@Override";
  protected final String TEXT_2543 = NL + "\tpublic ";
  protected final String TEXT_2544 = " get";
  protected final String TEXT_2545 = "(";
  protected final String TEXT_2546 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2547 = "(";
  protected final String TEXT_2548 = ", false";
  protected final String TEXT_2549 = ", null";
  protected final String TEXT_2550 = ", false";
  protected final String TEXT_2551 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2552 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2553 = "} with the specified ";
  protected final String TEXT_2554 = " from the '<em><b>";
  protected final String TEXT_2555 = "</b></em>' ";
  protected final String TEXT_2556 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2557 = NL + "\t * @param ";
  protected final String TEXT_2558 = " The ";
  protected final String TEXT_2559 = " of the {@link ";
  protected final String TEXT_2560 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2561 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2562 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2563 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2564 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2565 = "} on demand if not found.";
  protected final String TEXT_2566 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2567 = "} with the specified ";
  protected final String TEXT_2568 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2569 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2570 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2571 = NL + "\t";
  protected final String TEXT_2572 = " get";
  protected final String TEXT_2573 = "(";
  protected final String TEXT_2574 = ", boolean ignoreCase";
  protected final String TEXT_2575 = ", ";
  protected final String TEXT_2576 = " eClass";
  protected final String TEXT_2577 = ", boolean createOnDemand";
  protected final String TEXT_2578 = ");" + NL;
  protected final String TEXT_2579 = NL + "\t@Override";
  protected final String TEXT_2580 = NL + "\tpublic ";
  protected final String TEXT_2581 = " get";
  protected final String TEXT_2582 = "(";
  protected final String TEXT_2583 = ", boolean ignoreCase";
  protected final String TEXT_2584 = ", ";
  protected final String TEXT_2585 = " eClass";
  protected final String TEXT_2586 = ", boolean createOnDemand";
  protected final String TEXT_2587 = ")" + NL + "\t{";
  protected final String TEXT_2588 = NL + "\t\t";
  protected final String TEXT_2589 = "Loop: for (";
  protected final String TEXT_2590 = " ";
  protected final String TEXT_2591 = " : ";
  protected final String TEXT_2592 = "())" + NL + "\t\t{";
  protected final String TEXT_2593 = NL + "\t\t";
  protected final String TEXT_2594 = "Loop: for (";
  protected final String TEXT_2595 = " i = ";
  protected final String TEXT_2596 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2597 = " ";
  protected final String TEXT_2598 = " = (";
  protected final String TEXT_2599 = ") i.next();";
  protected final String TEXT_2600 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2601 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2602 = "Loop;";
  protected final String TEXT_2603 = NL + "\t\t\t";
  protected final String TEXT_2604 = " ";
  protected final String TEXT_2605 = "List = ";
  protected final String TEXT_2606 = ".";
  protected final String TEXT_2607 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2608 = "ListSize = ";
  protected final String TEXT_2609 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2610 = " || (";
  protected final String TEXT_2611 = " != null && ";
  protected final String TEXT_2612 = ".size() != ";
  protected final String TEXT_2613 = "ListSize";
  protected final String TEXT_2614 = ")";
  protected final String TEXT_2615 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2616 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2617 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2618 = " ";
  protected final String TEXT_2619 = " = ";
  protected final String TEXT_2620 = "(";
  protected final String TEXT_2621 = ") ";
  protected final String TEXT_2622 = "List.get(j);";
  protected final String TEXT_2623 = NL + "\t\t\t\tif (";
  protected final String TEXT_2624 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2625 = "(";
  protected final String TEXT_2626 = ")";
  protected final String TEXT_2627 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2628 = ".";
  protected final String TEXT_2629 = "()) : ";
  protected final String TEXT_2630 = ".get(j).equals(";
  protected final String TEXT_2631 = ".";
  protected final String TEXT_2632 = "())))";
  protected final String TEXT_2633 = NL + "\t\t\t\tif (";
  protected final String TEXT_2634 = " != null && !";
  protected final String TEXT_2635 = ".get(j).equals(";
  protected final String TEXT_2636 = ".";
  protected final String TEXT_2637 = "()))";
  protected final String TEXT_2638 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2639 = "Loop;";
  protected final String TEXT_2640 = NL + "\t\t\t}";
  protected final String TEXT_2641 = NL + "\t\t\t";
  protected final String TEXT_2642 = " ";
  protected final String TEXT_2643 = " = ";
  protected final String TEXT_2644 = ".";
  protected final String TEXT_2645 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2646 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2647 = "Loop;";
  protected final String TEXT_2648 = NL + "\t\t\tif (";
  protected final String TEXT_2649 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2650 = ".equalsIgnoreCase(";
  protected final String TEXT_2651 = ".";
  protected final String TEXT_2652 = "()) : ";
  protected final String TEXT_2653 = ".equals(";
  protected final String TEXT_2654 = ".";
  protected final String TEXT_2655 = "())))";
  protected final String TEXT_2656 = NL + "\t\t\tif (";
  protected final String TEXT_2657 = " != null && !";
  protected final String TEXT_2658 = ".equals(";
  protected final String TEXT_2659 = ".";
  protected final String TEXT_2660 = "()))";
  protected final String TEXT_2661 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2662 = "Loop;";
  protected final String TEXT_2663 = NL + "\t\t\tif (";
  protected final String TEXT_2664 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2665 = ".equalsIgnoreCase(";
  protected final String TEXT_2666 = ".";
  protected final String TEXT_2667 = "()) : ";
  protected final String TEXT_2668 = ".equals(";
  protected final String TEXT_2669 = ".";
  protected final String TEXT_2670 = "())))";
  protected final String TEXT_2671 = NL + "\t\t\tif (";
  protected final String TEXT_2672 = " != null && !";
  protected final String TEXT_2673 = ".equals(";
  protected final String TEXT_2674 = ".";
  protected final String TEXT_2675 = "()))";
  protected final String TEXT_2676 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2677 = "Loop;";
  protected final String TEXT_2678 = NL + "\t\t\treturn ";
  protected final String TEXT_2679 = ";" + NL + "\t\t}";
  protected final String TEXT_2680 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2681 = " && eClass != null";
  protected final String TEXT_2682 = " ? create";
  protected final String TEXT_2683 = "(";
  protected final String TEXT_2684 = ", eClass";
  protected final String TEXT_2685 = ") : null;";
  protected final String TEXT_2686 = NL + "\t\treturn null;";
  protected final String TEXT_2687 = NL + "\t}" + NL;
  protected final String TEXT_2688 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2689 = "()" + NL + "\t{";
  protected final String TEXT_2690 = NL + "  \t\treturn false;";
  protected final String TEXT_2691 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2692 = ");";
  protected final String TEXT_2693 = NL + "\t\treturn !((";
  protected final String TEXT_2694 = ".Internal.Wrapper)";
  protected final String TEXT_2695 = "()).featureMap().isEmpty();";
  protected final String TEXT_2696 = NL + "\t\treturn ";
  protected final String TEXT_2697 = " != null && !";
  protected final String TEXT_2698 = ".featureMap().isEmpty();";
  protected final String TEXT_2699 = NL + "\t\treturn ";
  protected final String TEXT_2700 = " != null && !";
  protected final String TEXT_2701 = ".isEmpty();";
  protected final String TEXT_2702 = NL + "\t\t";
  protected final String TEXT_2703 = " ";
  protected final String TEXT_2704 = " = (";
  protected final String TEXT_2705 = ")eVirtualGet(";
  protected final String TEXT_2706 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2707 = " != null && !";
  protected final String TEXT_2708 = ".isEmpty();";
  protected final String TEXT_2709 = NL + "\t\treturn !";
  protected final String TEXT_2710 = "().isEmpty();";
  protected final String TEXT_2711 = NL + "\t\treturn ";
  protected final String TEXT_2712 = " != null;";
  protected final String TEXT_2713 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2714 = ") != null;";
  protected final String TEXT_2715 = NL + "\t\treturn basicGet";
  protected final String TEXT_2716 = "() != null;";
  protected final String TEXT_2717 = NL + "\t\treturn ";
  protected final String TEXT_2718 = " != null;";
  protected final String TEXT_2719 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2720 = ") != null;";
  protected final String TEXT_2721 = NL + "\t\treturn ";
  protected final String TEXT_2722 = "() != null;";
  protected final String TEXT_2723 = NL + "\t\treturn ((";
  protected final String TEXT_2724 = " & ";
  protected final String TEXT_2725 = "_EFLAG) != 0) != ";
  protected final String TEXT_2726 = ";";
  protected final String TEXT_2727 = NL + "\t\treturn ";
  protected final String TEXT_2728 = " != ";
  protected final String TEXT_2729 = ";";
  protected final String TEXT_2730 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2731 = ", ";
  protected final String TEXT_2732 = ") != ";
  protected final String TEXT_2733 = ";";
  protected final String TEXT_2734 = NL + "\t\treturn ";
  protected final String TEXT_2735 = "() != ";
  protected final String TEXT_2736 = ";";
  protected final String TEXT_2737 = NL + "\t\treturn ";
  protected final String TEXT_2738 = " == null ? ";
  protected final String TEXT_2739 = " != null : !";
  protected final String TEXT_2740 = ".equals(";
  protected final String TEXT_2741 = ");";
  protected final String TEXT_2742 = NL + "\t\t";
  protected final String TEXT_2743 = " ";
  protected final String TEXT_2744 = " = (";
  protected final String TEXT_2745 = ")eVirtualGet(";
  protected final String TEXT_2746 = ", ";
  protected final String TEXT_2747 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2748 = " == null ? ";
  protected final String TEXT_2749 = " != null : !";
  protected final String TEXT_2750 = ".equals(";
  protected final String TEXT_2751 = ");";
  protected final String TEXT_2752 = NL + "\t\treturn ";
  protected final String TEXT_2753 = " == null ? ";
  protected final String TEXT_2754 = "() != null : !";
  protected final String TEXT_2755 = ".equals(";
  protected final String TEXT_2756 = "());";
  protected final String TEXT_2757 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2758 = ");";
  protected final String TEXT_2759 = NL + "\t\t";
  protected final String TEXT_2760 = " ";
  protected final String TEXT_2761 = " = (";
  protected final String TEXT_2762 = ")eVirtualGet(";
  protected final String TEXT_2763 = ");";
  protected final String TEXT_2764 = NL + "\t\treturn ";
  protected final String TEXT_2765 = " != null && ((";
  protected final String TEXT_2766 = ".Unsettable";
  protected final String TEXT_2767 = ")";
  protected final String TEXT_2768 = ").isSet();";
  protected final String TEXT_2769 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2770 = ");";
  protected final String TEXT_2771 = NL + "\t\treturn (";
  protected final String TEXT_2772 = " & ";
  protected final String TEXT_2773 = "_ESETFLAG) != 0;";
  protected final String TEXT_2774 = NL + "\t\treturn ";
  protected final String TEXT_2775 = "ESet;";
  protected final String TEXT_2776 = NL + "\t\treturn !((";
  protected final String TEXT_2777 = ".Internal)((";
  protected final String TEXT_2778 = ".Internal.Wrapper)get";
  protected final String TEXT_2779 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2780 = ");";
  protected final String TEXT_2781 = NL + "\t\treturn !((";
  protected final String TEXT_2782 = ".Internal)get";
  protected final String TEXT_2783 = "()).isEmpty(";
  protected final String TEXT_2784 = ");";
  protected final String TEXT_2785 = NL + "\t\treturn ";
  protected final String TEXT_2786 = ".";
  protected final String TEXT_2787 = "(this);";
  protected final String TEXT_2788 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2789 = "' ";
  protected final String TEXT_2790 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2791 = NL + "\t}" + NL;
  protected final String TEXT_2792 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2793 = NL + "\t@Override";
  protected final String TEXT_2794 = NL + "\tpublic ";
  protected final String TEXT_2795 = " ";
  protected final String TEXT_2796 = "(";
  protected final String TEXT_2797 = ")";
  protected final String TEXT_2798 = NL + "\t{";
  protected final String TEXT_2799 = NL + "\t\t";
  protected final String TEXT_2800 = "(";
  protected final String TEXT_2801 = ");";
  protected final String TEXT_2802 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2803 = NL + "\t\treturn ";
  protected final String TEXT_2804 = "(";
  protected final String TEXT_2805 = ");";
  protected final String TEXT_2806 = NL + "\t}" + NL;
  protected final String TEXT_2807 = NL + "} //";
  protected final String TEXT_2808 = NL;

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
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_69);
    }
    if (genModel.isArrayAccessors() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_76);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_81);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_82);
    }
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_86);
    } else {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_89);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_91);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_98);
    } else {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_106);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_108);
    }
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_113);
    } else {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_117);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_119);
    for (GenFeature genFeature : genClass.getFlagGenFeatures("true")) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_127);
    }
    if (isImplementation && genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL && (genClass.getClassExtendsGenClass() == null || genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL)) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_129);
    }
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_131);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_132);
    if (!isImplementation) {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_135);
    } else {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_138);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_143);
    } else {
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_153);
    if (!isImplementation) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_156);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_161);
    }
    stringBuffer.append(TEXT_162);
    if (!isImplementation) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_164);
    } else {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_166);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_171);
    }
    stringBuffer.append(TEXT_172);
    }
    stringBuffer.append(TEXT_173);
    if (!isImplementation) {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_177);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_185);
    }
    stringBuffer.append(TEXT_186);
    if (!isImplementation) {
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_189);
    } else {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_193);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_196);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_197);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_199);
    } else {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_202);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_203);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_204);
    } else {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_207);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_209);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_211);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_213);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_217);
    }
    }
    stringBuffer.append(TEXT_218);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_221);
    }
    stringBuffer.append(TEXT_222);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_224);
    }
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_227);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_230);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_235);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_238);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_241);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_243);
    }}
    stringBuffer.append(TEXT_244);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_245);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_246);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_249);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast() || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_250);
    }
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_253);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_254);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_258);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_260);
    }
    stringBuffer.append(TEXT_261);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_266);
    }
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_268);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_272);
    } else {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_275);
    }
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_277);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_280);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_286);
    }
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_298);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_303);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_307);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_311);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_312);
    }
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_314);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_317);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_322);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_325);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_331);
    }
    stringBuffer.append(TEXT_332);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_336);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_339);
    } else {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_341);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_351);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_355);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_358);
    } else {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_360);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_363);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_365);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_367);
    } else {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_370);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_371);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_372);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_374);
    }
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_376);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_378);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    } else {
    stringBuffer.append(TEXT_382);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_383);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_385);
    }
    stringBuffer.append(TEXT_386);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_388);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(TEXT_391);
    }
    }
    } else {
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
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_498);
    }
    }
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_501);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_504);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_507);
    } else {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_509);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_512);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_514);
    } else {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_516);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_518);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_519);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_521);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_523);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_525);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_527);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_529);
    } else {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_531);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_532);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_533);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_534);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_535);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_536);
    }
    }
    }
    }
    stringBuffer.append(TEXT_537);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_539);
    } else {
    stringBuffer.append(TEXT_540);
    }
    stringBuffer.append(TEXT_541);
    } else {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_544);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_545);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_546);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_547);
    }
    }
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_553);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_557);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_559);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_563);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_564);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_566);
    }
    stringBuffer.append(TEXT_567);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_571);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_573);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_581);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_585);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_586);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_588);
    }
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_593);
    }
    stringBuffer.append(TEXT_594);
    }
    stringBuffer.append(TEXT_595);
    }
    stringBuffer.append(TEXT_596);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_600);
    } else {
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_606);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_608);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_614);
    } else {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_618);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_619);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_624);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_628);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_629);
    } else {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_631);
    }
    stringBuffer.append(TEXT_632);
    } else {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_637);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_642);
    }
    stringBuffer.append(TEXT_643);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_645);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_649);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_650);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_652);
    }
    stringBuffer.append(TEXT_653);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_657);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_659);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_661);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_671);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_676);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_679);
    }
    stringBuffer.append(TEXT_680);
    }
    stringBuffer.append(TEXT_681);
    }
    stringBuffer.append(TEXT_682);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_688);
    } else {
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_690);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_693);
    }
    } else {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_696);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_697);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_705);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_708);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_710);
    }
    }
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_712);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_713);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_714);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_717);
    } else {
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_721);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_728);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_730);
    }
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_732);
    }
    stringBuffer.append(TEXT_733);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_747);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_762);
    }
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_767);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_775);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_785);
    }
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_790);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_793);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_797);
    }
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_800);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_803);
    }
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_805);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    }
    stringBuffer.append(TEXT_813);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_824);
    }
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_830);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_834);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_840);
    } else {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_845);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_850);
    } else {
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_854);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_858);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_864);
    }
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_867);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_870);
    }
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_872);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_876);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_880);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_882);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_883);
    } else {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_885);
    }
    stringBuffer.append(TEXT_886);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_890);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_895);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_897);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_899);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_902);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_903);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_906);
    }
    stringBuffer.append(TEXT_907);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_911);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_913);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_914);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_915);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_919);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_921);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_922);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_925);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_928);
    }
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_931);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_933);
    }
    stringBuffer.append(TEXT_934);
    }
    stringBuffer.append(TEXT_935);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_940);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_942);
    }
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_944);
    }
    stringBuffer.append(TEXT_945);
    } else {
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_949);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_951);
    }
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_953);
    }
    stringBuffer.append(TEXT_954);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_955);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_958);
    } else {
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_961);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_962);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_963);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_964);
    }
    }
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_968);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_971);
    } else {
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_976);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_978);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_984);
    } else {
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_988);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_993);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_995);
    } else {
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_997);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_998);
    } else {
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1000);
    }
    stringBuffer.append(TEXT_1001);
    }
    } else {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1004);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1005);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(TEXT_1011);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1013);
    }
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1015);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1018);
    }
    stringBuffer.append(TEXT_1019);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1020);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1021);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1023);
    } else {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1025);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1027);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1032);
    }
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1037);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
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
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1045);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1049);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1054);
    }
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1056);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1059);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1063);
    }
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1066);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1069);
    }
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1071);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1076);
    }
    stringBuffer.append(TEXT_1077);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1082);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1085);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1089);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1091);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1095);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1098);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1100);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1103);
    } else {
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1105);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1109);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1111);
    } else {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1113);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1114);
    } else {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1116);
    }
    stringBuffer.append(TEXT_1117);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1123);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1126);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1129);
    } else {
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1131);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1135);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1140);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1141);
    } else {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1143);
    }
    stringBuffer.append(TEXT_1144);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1149);
    } else {
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1153);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1156);
    } else {
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1159);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1160);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1168);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1170);
    }
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1172);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1175);
    }
    stringBuffer.append(TEXT_1176);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1177);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1178);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1180);
    } else {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1182);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1184);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1189);
    }
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1194);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1196);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1199);
    } else {
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1201);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1206);
    } else {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1210);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1213);
    } else {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1216);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1217);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1224);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1231);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1232);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1237);
    } else {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1242);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1246);
    } else {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1250);
    }
    }
    stringBuffer.append(TEXT_1251);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1255);
    }
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1259);
    } else {
    stringBuffer.append(TEXT_1260);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1263);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1264);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1265);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1266);
    }
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1269);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1270);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1274);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1277);
    } else {
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1280);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1282);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1290);
    index++;}
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1294);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1295);
    }
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1299);
    }
    stringBuffer.append(TEXT_1300);
    } else {
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1303);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1304);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1305);
    }
    } else {
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1307);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1311);
    } else {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1315);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1317);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1318);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1323);
    } else {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1328);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1332);
    } else {
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1336);
    }
    }
    stringBuffer.append(TEXT_1337);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1341);
    }
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1344);
    } else {
    stringBuffer.append(TEXT_1345);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1349);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1350);
    }
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1354);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1356);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1357);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1358);
    } else {
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1363);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1366);
    } else {
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1369);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1371);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1379);
    index++;}
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1383);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1384);
    }
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1388);
    }
    stringBuffer.append(TEXT_1389);
    } else {
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1392);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1393);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1394);
    }
    } else {
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1396);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1400);
    } else {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1404);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1406);
    }
    stringBuffer.append(TEXT_1407);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1412);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1416);
    }
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1420);
    } else {
    stringBuffer.append(TEXT_1421);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1425);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1426);
    }
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1432);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1433);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1434);
    }
    stringBuffer.append(TEXT_1435);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1440);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1444);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1445);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1447);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1449);
    }
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1453);
    } else {
    stringBuffer.append(TEXT_1454);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1458);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1460);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1461);
    }
    stringBuffer.append(TEXT_1462);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1463);
    }
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1467);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1469);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1470);
    }
    stringBuffer.append(TEXT_1471);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1476);
    } else {
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1483);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1486);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1493);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1494);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1497);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1498);
    }
    }
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1503);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1505);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1506);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1508);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1510);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1516);
    } else {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1521);
    }
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1523);
    index++;}
    stringBuffer.append(TEXT_1524);
    } else {
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1531);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1539);
    } else {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1544);
    }
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1546);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1554);
    } else {
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1559);
    }
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1561);
    }
    index++;}
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1563);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1564);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1565);
    }
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1568);
    }
    stringBuffer.append(TEXT_1569);
    } else {
    stringBuffer.append(TEXT_1570);
    }
    stringBuffer.append(TEXT_1571);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1573);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1574);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1576);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1579);
    } else {
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1582);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1585);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1592);
    } else {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1594);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1596);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1598);
    } else {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1600);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1602);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1604);
    } else {
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1606);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1610);
    } else {
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1613);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1617);
    } else {
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1620);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1625);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1635);
    } else {
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1640);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1642);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1647);
    }
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1652);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1654);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1657);
    } else {
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1659);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1664);
    } else {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1668);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1671);
    } else {
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1674);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1675);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1676);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1677);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1683);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1686);
    }}
    stringBuffer.append(TEXT_1687);
    } else {
    stringBuffer.append(TEXT_1688);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1689);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1694);
    } else {
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1699);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1705);
    } else {
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1718);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1721);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1723);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1725);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1726);
    }
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1729);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1730);
    }
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1733);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1734);
    }
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1737);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1739);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1741);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1743);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1744);
    }
    stringBuffer.append(TEXT_1745);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1747);
    }
    stringBuffer.append(TEXT_1748);
    }
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1751);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1753);
    }
    } else {
    stringBuffer.append(TEXT_1754);
    }
    }
    stringBuffer.append(TEXT_1755);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1756);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1757);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1758);
    }
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1762);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1764);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1769);
    } else {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1771);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1772);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1775);
    } else {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1777);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1782);
    }
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1784);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1788);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1793);
    }
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1796);
    }
    }
    stringBuffer.append(TEXT_1797);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1798);
    } else {
    stringBuffer.append(TEXT_1799);
    }
    stringBuffer.append(TEXT_1800);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1801);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1802);
    }
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1806);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1808);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1813);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1817);
    } else {
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1820);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1822);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1824);
    } else {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1826);
    }
    }
    stringBuffer.append(TEXT_1827);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1828);
    } else {
    stringBuffer.append(TEXT_1829);
    }
    stringBuffer.append(TEXT_1830);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1831);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1832);
    }
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1835);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1839);
    }
    stringBuffer.append(TEXT_1840);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1841);
    } else {
    stringBuffer.append(TEXT_1842);
    }
    stringBuffer.append(TEXT_1843);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1844);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1845);
    }
    stringBuffer.append(TEXT_1846);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1848);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1850);
    } else {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1853);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1856);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1861);
    } else {
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1864);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1868);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1872);
    } else {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1874);
    }
    }
    stringBuffer.append(TEXT_1875);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1876);
    } else {
    stringBuffer.append(TEXT_1877);
    }
    stringBuffer.append(TEXT_1878);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1879);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1880);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1881);
    }
    stringBuffer.append(TEXT_1882);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1884);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1888);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1891);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1896);
    } else {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1899);
    }
    } else {
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1904);
    }
    stringBuffer.append(TEXT_1905);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1909);
    } else {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1911);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType())) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1913);
    }
    stringBuffer.append(TEXT_1914);
    }
    stringBuffer.append(TEXT_1915);
    }
    stringBuffer.append(TEXT_1916);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1917);
    } else {
    stringBuffer.append(TEXT_1918);
    }
    stringBuffer.append(TEXT_1919);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1920);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1921);
    }
    stringBuffer.append(TEXT_1922);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1924);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1927);
    } else {
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1929);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1931);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1934);
    } else {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1937);
    }
    stringBuffer.append(TEXT_1938);
    }
    stringBuffer.append(TEXT_1939);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1940);
    } else {
    stringBuffer.append(TEXT_1941);
    }
    stringBuffer.append(TEXT_1942);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(TEXT_1944);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1945);
    }
    stringBuffer.append(TEXT_1946);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1948);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1950);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1953);
    } else {
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1956);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1959);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1966);
    } else {
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1968);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1970);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1972);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1974);
    } else {
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1976);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1978);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1980);
    } else {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1982);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1986);
    } else {
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1989);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1993);
    } else {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1996);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2001);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2011);
    } else {
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2016);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2017);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2018);
    } else {
    stringBuffer.append(TEXT_2019);
    }
    stringBuffer.append(TEXT_2020);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2021);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2022);
    }
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2024);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2026);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2029);
    }
    stringBuffer.append(TEXT_2030);
    }
    stringBuffer.append(TEXT_2031);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2032);
    }
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2034);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2036);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2039);
    }
    stringBuffer.append(TEXT_2040);
    }
    stringBuffer.append(TEXT_2041);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2042);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2043);
    }
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2045);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2046);
    }
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2048);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2049);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2050);
    }
    stringBuffer.append(TEXT_2051);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2054);
    }
    stringBuffer.append(TEXT_2055);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2056);
    }
    stringBuffer.append(TEXT_2057);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2060);
    }
    stringBuffer.append(TEXT_2061);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2062);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2063);
    }
    stringBuffer.append(TEXT_2064);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2072);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2075);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2076);
    }
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2080);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2083);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2084);
    }
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2089);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2092);
    } else {
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2094);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2095);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType() : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType() : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2098);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2100);
    } else {
    stringBuffer.append(TEXT_2101);
    }
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2103);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2104);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2106);
    }
    stringBuffer.append(TEXT_2107);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2108);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2111);
    } else {
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_2113);
    }
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2115);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2117);
    } else {
    stringBuffer.append(TEXT_2118);
    }
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2122);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2123);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2125);
    }
    stringBuffer.append(TEXT_2126);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2127);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2130);
    } else {
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_2132);
    }
    stringBuffer.append(TEXT_2133);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2134);
    }
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2138);
    }
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2142);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2147);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2148);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2149);
    }
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2154);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2157);
    } else {
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2160);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2164);
    }
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2168);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2172);
    }
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2176);
    } else {
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2183);
    }
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2187);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2191);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2195);
    } else {
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2202);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2205);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2207);
    } else {
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2210);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2215);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2217);
    }
    }
    }
    stringBuffer.append(TEXT_2218);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2219);
    }
    }
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2221);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2223);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2225);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2226);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2228);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2229);
    }
    } else {
    stringBuffer.append(TEXT_2230);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2232);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2233);
    }
    }
    } else {
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2235);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2236);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2238);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2239);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2241);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2242);
    }
    } else {
    stringBuffer.append(TEXT_2243);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2245);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2246);
    }
    }
    } else {
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2248);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2249);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2251);
    } else {
    stringBuffer.append(TEXT_2252);
    }
    }
    stringBuffer.append(TEXT_2253);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2254);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2255);
    }
    }
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2258);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType().equals(genFeature.getListItemType())) {
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2265);
    } else {
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2267);
    }
    } else {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2269);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType() + ">");
    }
    stringBuffer.append(TEXT_2270);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2271);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2273);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2274);
    } else {
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2276);
    }
    }
    stringBuffer.append(TEXT_2277);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2278);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2279);
    }
    }
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2282);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2283);
    } else {
    stringBuffer.append(TEXT_2284);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2286);
    }
    stringBuffer.append(TEXT_2287);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2288);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2289);
    }
    }
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2295);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2296);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2301);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2303);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2305);
    }
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2307);
    } else {
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2309);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2311);
    }
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2313);
    }
    }
    stringBuffer.append(TEXT_2314);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2315);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2316);
    }
    }
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2320);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2321);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2326);
    }
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2328);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2330);
    }
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2332);
    }
    stringBuffer.append(TEXT_2333);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2340);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2347);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2348);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2353);
    } else {
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2358);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2362);
    } else {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2366);
    }
    }
    stringBuffer.append(TEXT_2367);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2371);
    }
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2375);
    } else {
    stringBuffer.append(TEXT_2376);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2379);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2380);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2381);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2382);
    }
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2385);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2386);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2390);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2393);
    } else {
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2396);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2398);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2406);
    index++;}
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2410);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2411);
    }
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2415);
    }
    stringBuffer.append(TEXT_2416);
    } else {
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2419);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2420);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2421);
    }
    } else {
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2423);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2427);
    } else {
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2431);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2433);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2434);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2439);
    } else {
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2444);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2448);
    } else {
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2452);
    }
    }
    stringBuffer.append(TEXT_2453);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2457);
    }
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2460);
    } else {
    stringBuffer.append(TEXT_2461);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2465);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2466);
    }
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2470);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2472);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2473);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2474);
    } else {
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2479);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2482);
    } else {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2485);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2487);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2495);
    index++;}
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2499);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2500);
    }
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2504);
    }
    stringBuffer.append(TEXT_2505);
    } else {
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2508);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2509);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2510);
    }
    } else {
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2512);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2516);
    } else {
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2520);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2522);
    }
    stringBuffer.append(TEXT_2523);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2528);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2532);
    }
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2536);
    } else {
    stringBuffer.append(TEXT_2537);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2541);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2542);
    }
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2548);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2549);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2550);
    }
    stringBuffer.append(TEXT_2551);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2556);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2560);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2561);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2563);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2565);
    }
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2569);
    } else {
    stringBuffer.append(TEXT_2570);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2574);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2576);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2577);
    }
    stringBuffer.append(TEXT_2578);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2579);
    }
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2583);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2585);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2586);
    }
    stringBuffer.append(TEXT_2587);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2592);
    } else {
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2599);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2602);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2609);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2610);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2613);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2614);
    }
    }
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2619);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2621);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2622);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2624);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2626);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2632);
    } else {
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2637);
    }
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2639);
    index++;}
    stringBuffer.append(TEXT_2640);
    } else {
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2647);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2649);
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
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2670);
    } else {
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2675);
    }
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2677);
    }
    index++;}
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2679);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2680);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2681);
    }
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2684);
    }
    stringBuffer.append(TEXT_2685);
    } else {
    stringBuffer.append(TEXT_2686);
    }
    stringBuffer.append(TEXT_2687);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2689);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2690);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2692);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2695);
    } else {
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2698);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2701);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2708);
    } else {
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2710);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2712);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2714);
    } else {
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2716);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2718);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2720);
    } else {
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2722);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2726);
    } else {
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2729);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2733);
    } else {
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2736);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2741);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2751);
    } else {
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2756);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2758);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2763);
    }
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2768);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2770);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2773);
    } else {
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2775);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2780);
    } else {
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2784);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2787);
    } else {
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2790);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2791);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2792);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2793);
    }
    }
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2798);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2801);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2802);
    } else {
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2805);
    }
    }
    stringBuffer.append(TEXT_2806);
    }
    }
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2808);
    return stringBuffer.toString();
  }
}
