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
  protected final String TEXT_56 = " = null;" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_58 = " = 0;" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_60 = " = 0;" + NL;
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_62 = "() <em>";
  protected final String TEXT_63 = "</em>}' ";
  protected final String TEXT_64 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_65 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_66 = " ";
  protected final String TEXT_67 = " = null;" + NL;
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
  protected final String TEXT_79 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_80 = " ";
  protected final String TEXT_81 = "; // TODO The default value literal \"";
  protected final String TEXT_82 = "\" is not valid.";
  protected final String TEXT_83 = " = ";
  protected final String TEXT_84 = ";";
  protected final String TEXT_85 = NL;
  protected final String TEXT_86 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_87 = " = 0;" + NL;
  protected final String TEXT_88 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_89 = "() <em>";
  protected final String TEXT_90 = "</em>}' ";
  protected final String TEXT_91 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_92 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_93 = "_EFLAG = 1 ";
  protected final String TEXT_94 = ";" + NL;
  protected final String TEXT_95 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_96 = "() <em>";
  protected final String TEXT_97 = "</em>}' ";
  protected final String TEXT_98 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_99 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_100 = " ";
  protected final String TEXT_101 = " = ";
  protected final String TEXT_102 = ";" + NL;
  protected final String TEXT_103 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_104 = " = 0;" + NL;
  protected final String TEXT_105 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_106 = " ";
  protected final String TEXT_107 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_108 = "_ESETFLAG = 1 ";
  protected final String TEXT_109 = ";" + NL;
  protected final String TEXT_110 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_111 = " ";
  protected final String TEXT_112 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_113 = "ESet = false;" + NL;
  protected final String TEXT_114 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_115 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_116 = NL + "\t\t";
  protected final String TEXT_117 = " |= ";
  protected final String TEXT_118 = "_EFLAG;";
  protected final String TEXT_119 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_120 = NL + "\t@Override";
  protected final String TEXT_121 = NL + "\tprotected ";
  protected final String TEXT_122 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_123 = ";" + NL + "\t}" + NL;
  protected final String TEXT_124 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_125 = NL + "\t";
  protected final String TEXT_126 = "[] ";
  protected final String TEXT_127 = "();" + NL;
  protected final String TEXT_128 = NL + "\tpublic ";
  protected final String TEXT_129 = "[] ";
  protected final String TEXT_130 = "()" + NL + "\t{";
  protected final String TEXT_131 = NL + "\t\t";
  protected final String TEXT_132 = " list = (";
  protected final String TEXT_133 = ")";
  protected final String TEXT_134 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_135 = "_EEMPTY_ARRAY;";
  protected final String TEXT_136 = NL + "\t\tif (";
  protected final String TEXT_137 = " == null || ";
  protected final String TEXT_138 = ".isEmpty()) return ";
  protected final String TEXT_139 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_140 = " list = (";
  protected final String TEXT_141 = ")";
  protected final String TEXT_142 = ";";
  protected final String TEXT_143 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_144 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_145 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_146 = NL + "\t";
  protected final String TEXT_147 = " get";
  protected final String TEXT_148 = "(int index);" + NL;
  protected final String TEXT_149 = NL + "\tpublic ";
  protected final String TEXT_150 = " get";
  protected final String TEXT_151 = "(int index)" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_152 = ")";
  protected final String TEXT_153 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_154 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_155 = NL + "\tint get";
  protected final String TEXT_156 = "Length();" + NL;
  protected final String TEXT_157 = NL + "\tpublic int get";
  protected final String TEXT_158 = "Length()" + NL + "\t{";
  protected final String TEXT_159 = NL + "\t\treturn ";
  protected final String TEXT_160 = "().size();";
  protected final String TEXT_161 = NL + "\t\treturn ";
  protected final String TEXT_162 = " == null ? 0 : ";
  protected final String TEXT_163 = ".size();";
  protected final String TEXT_164 = NL + "\t}" + NL;
  protected final String TEXT_165 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_166 = NL + "\tvoid set";
  protected final String TEXT_167 = "(";
  protected final String TEXT_168 = "[] new";
  protected final String TEXT_169 = ");" + NL;
  protected final String TEXT_170 = NL + "\tpublic void set";
  protected final String TEXT_171 = "(";
  protected final String TEXT_172 = "[] new";
  protected final String TEXT_173 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_174 = ")";
  protected final String TEXT_175 = "()).setData(new";
  protected final String TEXT_176 = ".length, new";
  protected final String TEXT_177 = ");" + NL + "\t}" + NL;
  protected final String TEXT_178 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_179 = NL + "\tvoid set";
  protected final String TEXT_180 = "(int index, ";
  protected final String TEXT_181 = " element);" + NL;
  protected final String TEXT_182 = NL + "\tpublic void set";
  protected final String TEXT_183 = "(int index, ";
  protected final String TEXT_184 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_185 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_186 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_187 = "</b></em>' ";
  protected final String TEXT_188 = ".";
  protected final String TEXT_189 = NL + "\t * The key is of type ";
  protected final String TEXT_190 = "list of {@link ";
  protected final String TEXT_191 = "}";
  protected final String TEXT_192 = "{@link ";
  protected final String TEXT_193 = "}";
  protected final String TEXT_194 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_195 = "list of {@link ";
  protected final String TEXT_196 = "}";
  protected final String TEXT_197 = "{@link ";
  protected final String TEXT_198 = "}";
  protected final String TEXT_199 = ",";
  protected final String TEXT_200 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_201 = "}.";
  protected final String TEXT_202 = NL + "\t * The default value is <code>";
  protected final String TEXT_203 = "</code>.";
  protected final String TEXT_204 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_205 = "}.";
  protected final String TEXT_206 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_207 = "#";
  protected final String TEXT_208 = " <em>";
  protected final String TEXT_209 = "</em>}'.";
  protected final String TEXT_210 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_211 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_212 = "</em>' ";
  protected final String TEXT_213 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_214 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_215 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_216 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_217 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_218 = "</em>' ";
  protected final String TEXT_219 = ".";
  protected final String TEXT_220 = NL + "\t * @see ";
  protected final String TEXT_221 = NL + "\t * @see #isSet";
  protected final String TEXT_222 = "()";
  protected final String TEXT_223 = NL + "\t * @see #unset";
  protected final String TEXT_224 = "()";
  protected final String TEXT_225 = NL + "\t * @see #set";
  protected final String TEXT_226 = "(";
  protected final String TEXT_227 = ")";
  protected final String TEXT_228 = NL + "\t * @see ";
  protected final String TEXT_229 = "#get";
  protected final String TEXT_230 = "()";
  protected final String TEXT_231 = NL + "\t * @see ";
  protected final String TEXT_232 = "#";
  protected final String TEXT_233 = NL + "\t * @model ";
  protected final String TEXT_234 = NL + "\t *        ";
  protected final String TEXT_235 = NL + "\t * @model";
  protected final String TEXT_236 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_237 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_238 = NL + "\t";
  protected final String TEXT_239 = " ";
  protected final String TEXT_240 = "();" + NL;
  protected final String TEXT_241 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_242 = NL + "\tpublic ";
  protected final String TEXT_243 = " ";
  protected final String TEXT_244 = "()" + NL + "\t{";
  protected final String TEXT_245 = NL + "\t\treturn ";
  protected final String TEXT_246 = "(";
  protected final String TEXT_247 = "(";
  protected final String TEXT_248 = ")eGet(";
  protected final String TEXT_249 = ", true)";
  protected final String TEXT_250 = ").";
  protected final String TEXT_251 = "()";
  protected final String TEXT_252 = ";";
  protected final String TEXT_253 = NL + "\t\t";
  protected final String TEXT_254 = " ";
  protected final String TEXT_255 = " = (";
  protected final String TEXT_256 = ")eVirtualGet(";
  protected final String TEXT_257 = ");";
  protected final String TEXT_258 = NL + "\t\tif (";
  protected final String TEXT_259 = " == null)" + NL + "\t\t{";
  protected final String TEXT_260 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_261 = ", ";
  protected final String TEXT_262 = " = new ";
  protected final String TEXT_263 = ");";
  protected final String TEXT_264 = NL + "\t\t\t";
  protected final String TEXT_265 = " = new ";
  protected final String TEXT_266 = ";";
  protected final String TEXT_267 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_268 = ";";
  protected final String TEXT_269 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_270 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_271 = ")eContainer();";
  protected final String TEXT_272 = NL + "\t\t";
  protected final String TEXT_273 = " ";
  protected final String TEXT_274 = " = (";
  protected final String TEXT_275 = ")eVirtualGet(";
  protected final String TEXT_276 = ", ";
  protected final String TEXT_277 = ");";
  protected final String TEXT_278 = NL + "\t\tif (";
  protected final String TEXT_279 = " != null && ";
  protected final String TEXT_280 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_281 = " old";
  protected final String TEXT_282 = " = (";
  protected final String TEXT_283 = ")";
  protected final String TEXT_284 = ";" + NL + "\t\t\t";
  protected final String TEXT_285 = " = ";
  protected final String TEXT_286 = "eResolveProxy(old";
  protected final String TEXT_287 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_288 = " != old";
  protected final String TEXT_289 = ")" + NL + "\t\t\t{";
  protected final String TEXT_290 = NL + "\t\t\t\t";
  protected final String TEXT_291 = " new";
  protected final String TEXT_292 = " = (";
  protected final String TEXT_293 = ")";
  protected final String TEXT_294 = ";";
  protected final String TEXT_295 = NL + "\t\t\t\t";
  protected final String TEXT_296 = " msgs = old";
  protected final String TEXT_297 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_298 = ", null, null);";
  protected final String TEXT_299 = NL + "\t\t\t\t";
  protected final String TEXT_300 = " msgs =  old";
  protected final String TEXT_301 = ".eInverseRemove(this, ";
  protected final String TEXT_302 = ", ";
  protected final String TEXT_303 = ".class, null);";
  protected final String TEXT_304 = NL + "\t\t\t\tif (new";
  protected final String TEXT_305 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_306 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_307 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_308 = ", null, msgs);";
  protected final String TEXT_309 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_310 = ".eInverseAdd(this, ";
  protected final String TEXT_311 = ", ";
  protected final String TEXT_312 = ".class, msgs);";
  protected final String TEXT_313 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_314 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_315 = ", ";
  protected final String TEXT_316 = ");";
  protected final String TEXT_317 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_318 = "(this, ";
  protected final String TEXT_319 = ".RESOLVE, ";
  protected final String TEXT_320 = ", old";
  protected final String TEXT_321 = ", ";
  protected final String TEXT_322 = "));";
  protected final String TEXT_323 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_324 = NL + "\t\treturn (";
  protected final String TEXT_325 = ")eVirtualGet(";
  protected final String TEXT_326 = ", ";
  protected final String TEXT_327 = ");";
  protected final String TEXT_328 = NL + "\t\treturn (";
  protected final String TEXT_329 = " & ";
  protected final String TEXT_330 = "_EFLAG) != 0;";
  protected final String TEXT_331 = NL + "\t\treturn ";
  protected final String TEXT_332 = ";";
  protected final String TEXT_333 = NL + "\t\t";
  protected final String TEXT_334 = " ";
  protected final String TEXT_335 = " = basicGet";
  protected final String TEXT_336 = "();" + NL + "\t\treturn ";
  protected final String TEXT_337 = " != null && ";
  protected final String TEXT_338 = ".eIsProxy() ? ";
  protected final String TEXT_339 = "eResolveProxy((";
  protected final String TEXT_340 = ")";
  protected final String TEXT_341 = ") : ";
  protected final String TEXT_342 = ";";
  protected final String TEXT_343 = NL + "\t\treturn new ";
  protected final String TEXT_344 = "((";
  protected final String TEXT_345 = ".Internal)((";
  protected final String TEXT_346 = ".Internal.Wrapper)get";
  protected final String TEXT_347 = "()).featureMap().";
  protected final String TEXT_348 = "list(";
  protected final String TEXT_349 = "));";
  protected final String TEXT_350 = NL + "\t\treturn (";
  protected final String TEXT_351 = ")get";
  protected final String TEXT_352 = "().";
  protected final String TEXT_353 = "list(";
  protected final String TEXT_354 = ");";
  protected final String TEXT_355 = NL + "\t\treturn ((";
  protected final String TEXT_356 = ".Internal.Wrapper)get";
  protected final String TEXT_357 = "()).featureMap().list(";
  protected final String TEXT_358 = ");";
  protected final String TEXT_359 = NL + "\t\treturn get";
  protected final String TEXT_360 = "().list(";
  protected final String TEXT_361 = ");";
  protected final String TEXT_362 = NL + "\t\treturn ";
  protected final String TEXT_363 = "(";
  protected final String TEXT_364 = "(";
  protected final String TEXT_365 = ")((";
  protected final String TEXT_366 = ".Internal.Wrapper)get";
  protected final String TEXT_367 = "()).featureMap().get(";
  protected final String TEXT_368 = ", true)";
  protected final String TEXT_369 = ").";
  protected final String TEXT_370 = "()";
  protected final String TEXT_371 = ";";
  protected final String TEXT_372 = NL + "\t\treturn ";
  protected final String TEXT_373 = "(";
  protected final String TEXT_374 = "(";
  protected final String TEXT_375 = ")get";
  protected final String TEXT_376 = "().get(";
  protected final String TEXT_377 = ", true)";
  protected final String TEXT_378 = ").";
  protected final String TEXT_379 = "()";
  protected final String TEXT_380 = ";";
  protected final String TEXT_381 = NL;
  protected final String TEXT_382 = NL + "\t\t";
  protected final String TEXT_383 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_384 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_385 = NL + "\t\t\t";
  protected final String TEXT_386 = " result = (";
  protected final String TEXT_387 = ") cache.get(";
  protected final String TEXT_388 = "eResource(), ";
  protected final String TEXT_389 = "this, ";
  protected final String TEXT_390 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_391 = "eResource(), ";
  protected final String TEXT_392 = "this, ";
  protected final String TEXT_393 = ", result = ";
  protected final String TEXT_394 = "new ";
  protected final String TEXT_395 = "(";
  protected final String TEXT_396 = ".";
  protected final String TEXT_397 = "(this)";
  protected final String TEXT_398 = ")";
  protected final String TEXT_399 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_400 = ".";
  protected final String TEXT_401 = "()";
  protected final String TEXT_402 = ";" + NL + "\t\t}";
  protected final String TEXT_403 = NL + "\t\treturn ";
  protected final String TEXT_404 = ".";
  protected final String TEXT_405 = "(this);";
  protected final String TEXT_406 = NL + "\t\t";
  protected final String TEXT_407 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_408 = " eResource = eResource();";
  protected final String TEXT_409 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_410 = NL + "\t\t\t";
  protected final String TEXT_411 = " ";
  protected final String TEXT_412 = " = (";
  protected final String TEXT_413 = ") cache.get(eResource, this, ";
  protected final String TEXT_414 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_415 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_416 = ", ";
  protected final String TEXT_417 = " = new ";
  protected final String TEXT_418 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_419 = ";" + NL + "\t\t}";
  protected final String TEXT_420 = NL + "\t\treturn new ";
  protected final String TEXT_421 = ";";
  protected final String TEXT_422 = NL + "\t\t";
  protected final String TEXT_423 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_424 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_425 = " method = getClass().getMethod(\"";
  protected final String TEXT_426 = "\", null);";
  protected final String TEXT_427 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_428 = NL + "\t\t\t\t";
  protected final String TEXT_429 = " ";
  protected final String TEXT_430 = " = (";
  protected final String TEXT_431 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_432 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_433 = " union = ";
  protected final String TEXT_434 = "Helper(new ";
  protected final String TEXT_435 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_436 = " = new ";
  protected final String TEXT_437 = "(this, ";
  protected final String TEXT_438 = "null";
  protected final String TEXT_439 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_440 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_441 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_442 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_443 = NL + "\t\t\t";
  protected final String TEXT_444 = " ";
  protected final String TEXT_445 = " = (";
  protected final String TEXT_446 = ") cache.get(eResource(), this, ";
  protected final String TEXT_447 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_448 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_449 = " union = ";
  protected final String TEXT_450 = "Helper(new ";
  protected final String TEXT_451 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_452 = ", ";
  protected final String TEXT_453 = " = new ";
  protected final String TEXT_454 = "(this, ";
  protected final String TEXT_455 = "null";
  protected final String TEXT_456 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_457 = ";";
  protected final String TEXT_458 = NL + "\t\t}";
  protected final String TEXT_459 = NL + "\t\t";
  protected final String TEXT_460 = " union = ";
  protected final String TEXT_461 = "Helper(new ";
  protected final String TEXT_462 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_463 = "(this, ";
  protected final String TEXT_464 = "null";
  protected final String TEXT_465 = ", union.size(), union.toArray());";
  protected final String TEXT_466 = NL + "\t\tif (isSet";
  protected final String TEXT_467 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_468 = "();" + NL + "\t\t}";
  protected final String TEXT_469 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_470 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_471 = "();" + NL + "\t\t}";
  protected final String TEXT_472 = NL + "\t\t";
  protected final String TEXT_473 = " ";
  protected final String TEXT_474 = " = ";
  protected final String TEXT_475 = "();" + NL + "\t\tif (";
  protected final String TEXT_476 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_477 = ";" + NL + "\t\t}";
  protected final String TEXT_478 = NL + "\t\treturn ";
  protected final String TEXT_479 = "super.";
  protected final String TEXT_480 = "()";
  protected final String TEXT_481 = "null";
  protected final String TEXT_482 = ";";
  protected final String TEXT_483 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_484 = "' ";
  protected final String TEXT_485 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_486 = NL + "\t}" + NL;
  protected final String TEXT_487 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_488 = " basicGet";
  protected final String TEXT_489 = "()" + NL + "\t{";
  protected final String TEXT_490 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_491 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_492 = ")eInternalContainer();";
  protected final String TEXT_493 = NL + "\t\treturn (";
  protected final String TEXT_494 = ")eVirtualGet(";
  protected final String TEXT_495 = ");";
  protected final String TEXT_496 = NL + "\t\treturn ";
  protected final String TEXT_497 = ";";
  protected final String TEXT_498 = NL + "\t\treturn (";
  protected final String TEXT_499 = ")((";
  protected final String TEXT_500 = ".Internal.Wrapper)get";
  protected final String TEXT_501 = "()).featureMap().get(";
  protected final String TEXT_502 = ", false);";
  protected final String TEXT_503 = NL + "\t\treturn (";
  protected final String TEXT_504 = ")get";
  protected final String TEXT_505 = "().get(";
  protected final String TEXT_506 = ", false);";
  protected final String TEXT_507 = NL;
  protected final String TEXT_508 = NL + "\t\treturn ";
  protected final String TEXT_509 = ".";
  protected final String TEXT_510 = "(this);";
  protected final String TEXT_511 = NL + "\t\tif (isSet";
  protected final String TEXT_512 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_513 = "basicGet";
  protected final String TEXT_514 = "();" + NL + "\t\t}";
  protected final String TEXT_515 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_516 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_517 = "basicGet";
  protected final String TEXT_518 = "();" + NL + "\t\t}";
  protected final String TEXT_519 = NL + "\t\t";
  protected final String TEXT_520 = " ";
  protected final String TEXT_521 = " = ";
  protected final String TEXT_522 = "basicGet";
  protected final String TEXT_523 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_524 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_525 = ";" + NL + "\t\t}";
  protected final String TEXT_526 = NL + "\t\treturn ";
  protected final String TEXT_527 = "super.basicGet";
  protected final String TEXT_528 = "()";
  protected final String TEXT_529 = "null";
  protected final String TEXT_530 = ";";
  protected final String TEXT_531 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_532 = "' ";
  protected final String TEXT_533 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_534 = NL + "\t}" + NL;
  protected final String TEXT_535 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_536 = " basicSet";
  protected final String TEXT_537 = "(";
  protected final String TEXT_538 = " new";
  protected final String TEXT_539 = ", ";
  protected final String TEXT_540 = " msgs)" + NL + "\t{";
  protected final String TEXT_541 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_542 = ")new";
  protected final String TEXT_543 = ", ";
  protected final String TEXT_544 = ", msgs);";
  protected final String TEXT_545 = NL;
  protected final String TEXT_546 = NL + "\t\t";
  protected final String TEXT_547 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_548 = NL + "\t\t\t";
  protected final String TEXT_549 = " ";
  protected final String TEXT_550 = " = ";
  protected final String TEXT_551 = "();";
  protected final String TEXT_552 = NL + "\t\t\tObject ";
  protected final String TEXT_553 = " = eVirtualGet(";
  protected final String TEXT_554 = ");";
  protected final String TEXT_555 = NL + "\t\t\tif (";
  protected final String TEXT_556 = " != null && ";
  protected final String TEXT_557 = " != new";
  protected final String TEXT_558 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_559 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_560 = NL + "\t\t\tif (new";
  protected final String TEXT_561 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_562 = NL + "\t\t\t\t";
  protected final String TEXT_563 = " ";
  protected final String TEXT_564 = " = ";
  protected final String TEXT_565 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_566 = ".contains(new";
  protected final String TEXT_567 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_568 = ".add(new";
  protected final String TEXT_569 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_570 = NL + "\t\t\t\t";
  protected final String TEXT_571 = " ";
  protected final String TEXT_572 = " = ";
  protected final String TEXT_573 = "();";
  protected final String TEXT_574 = NL + "\t\t\t\tObject ";
  protected final String TEXT_575 = " = eVirtualGet(";
  protected final String TEXT_576 = ");";
  protected final String TEXT_577 = NL + "\t\t\t\tif (new";
  protected final String TEXT_578 = " != ";
  protected final String TEXT_579 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_580 = "(new";
  protected final String TEXT_581 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_582 = NL + "\t\t\t}";
  protected final String TEXT_583 = NL + "\t\t}";
  protected final String TEXT_584 = NL + "\t\treturn msgs;";
  protected final String TEXT_585 = NL + "\t\tObject old";
  protected final String TEXT_586 = " = eVirtualSet(";
  protected final String TEXT_587 = ", new";
  protected final String TEXT_588 = ");";
  protected final String TEXT_589 = NL + "\t\t";
  protected final String TEXT_590 = " old";
  protected final String TEXT_591 = " = ";
  protected final String TEXT_592 = ";" + NL + "\t\t";
  protected final String TEXT_593 = " = new";
  protected final String TEXT_594 = ";";
  protected final String TEXT_595 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_596 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_597 = NL + "\t\tboolean old";
  protected final String TEXT_598 = "ESet = (";
  protected final String TEXT_599 = " & ";
  protected final String TEXT_600 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_601 = " |= ";
  protected final String TEXT_602 = "_ESETFLAG;";
  protected final String TEXT_603 = NL + "\t\tboolean old";
  protected final String TEXT_604 = "ESet = ";
  protected final String TEXT_605 = "ESet;" + NL + "\t\t";
  protected final String TEXT_606 = "ESet = true;";
  protected final String TEXT_607 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_608 = NL + "\t\t\t";
  protected final String TEXT_609 = " notification = new ";
  protected final String TEXT_610 = "(this, ";
  protected final String TEXT_611 = ".SET, ";
  protected final String TEXT_612 = ", ";
  protected final String TEXT_613 = "isSetChange ? null : old";
  protected final String TEXT_614 = "old";
  protected final String TEXT_615 = ", new";
  protected final String TEXT_616 = ", ";
  protected final String TEXT_617 = "isSetChange";
  protected final String TEXT_618 = "!old";
  protected final String TEXT_619 = "ESet";
  protected final String TEXT_620 = ");";
  protected final String TEXT_621 = NL + "\t\t\t";
  protected final String TEXT_622 = " notification = new ";
  protected final String TEXT_623 = "(this, ";
  protected final String TEXT_624 = ".SET, ";
  protected final String TEXT_625 = ", ";
  protected final String TEXT_626 = "old";
  protected final String TEXT_627 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_628 = "old";
  protected final String TEXT_629 = ", new";
  protected final String TEXT_630 = ");";
  protected final String TEXT_631 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_632 = NL;
  protected final String TEXT_633 = NL + "\t\t";
  protected final String TEXT_634 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_635 = NL + "\t\t\t";
  protected final String TEXT_636 = " ";
  protected final String TEXT_637 = " = ";
  protected final String TEXT_638 = "();";
  protected final String TEXT_639 = NL + "\t\t\tObject ";
  protected final String TEXT_640 = " = eVirtualGet(";
  protected final String TEXT_641 = ");";
  protected final String TEXT_642 = NL + "\t\t\tif (";
  protected final String TEXT_643 = " != null && ";
  protected final String TEXT_644 = " != new";
  protected final String TEXT_645 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_646 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_647 = NL + "\t\t\tif (new";
  protected final String TEXT_648 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_649 = NL + "\t\t\t\t";
  protected final String TEXT_650 = " ";
  protected final String TEXT_651 = " = ";
  protected final String TEXT_652 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_653 = ".contains(new";
  protected final String TEXT_654 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_655 = ".add(new";
  protected final String TEXT_656 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_657 = NL + "\t\t\t\t";
  protected final String TEXT_658 = " ";
  protected final String TEXT_659 = " = ";
  protected final String TEXT_660 = "();";
  protected final String TEXT_661 = NL + "\t\t\t\tObject ";
  protected final String TEXT_662 = " = eVirtualGet(";
  protected final String TEXT_663 = ");";
  protected final String TEXT_664 = NL + "\t\t\t\tif (new";
  protected final String TEXT_665 = " != ";
  protected final String TEXT_666 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_667 = "(new";
  protected final String TEXT_668 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_669 = NL + "\t\t\t}";
  protected final String TEXT_670 = NL + "\t\t}";
  protected final String TEXT_671 = NL + "\t\treturn msgs;";
  protected final String TEXT_672 = NL + "\t\treturn ((";
  protected final String TEXT_673 = ".Internal)((";
  protected final String TEXT_674 = ".Internal.Wrapper)get";
  protected final String TEXT_675 = "()).featureMap()).basicAdd(";
  protected final String TEXT_676 = ", new";
  protected final String TEXT_677 = ", msgs);";
  protected final String TEXT_678 = NL + "\t\treturn ((";
  protected final String TEXT_679 = ".Internal)get";
  protected final String TEXT_680 = "()).basicAdd(";
  protected final String TEXT_681 = ", new";
  protected final String TEXT_682 = ", msgs);";
  protected final String TEXT_683 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_684 = "' ";
  protected final String TEXT_685 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_686 = NL + "\t}" + NL;
  protected final String TEXT_687 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_688 = "#";
  protected final String TEXT_689 = " <em>";
  protected final String TEXT_690 = "</em>}' ";
  protected final String TEXT_691 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_692 = "</em>' ";
  protected final String TEXT_693 = ".";
  protected final String TEXT_694 = NL + "\t * @see ";
  protected final String TEXT_695 = NL + "\t * @see #isSet";
  protected final String TEXT_696 = "()";
  protected final String TEXT_697 = NL + "\t * @see #unset";
  protected final String TEXT_698 = "()";
  protected final String TEXT_699 = NL + "\t * @see #";
  protected final String TEXT_700 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_701 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_702 = NL + "\tvoid set";
  protected final String TEXT_703 = "(";
  protected final String TEXT_704 = " value);" + NL;
  protected final String TEXT_705 = NL + "\tpublic void set";
  protected final String TEXT_706 = "(";
  protected final String TEXT_707 = " new";
  protected final String TEXT_708 = ")" + NL + "\t{";
  protected final String TEXT_709 = NL;
  protected final String TEXT_710 = NL + "\t\tnew";
  protected final String TEXT_711 = " = new";
  protected final String TEXT_712 = " == null ? ";
  protected final String TEXT_713 = " : new";
  protected final String TEXT_714 = ";";
  protected final String TEXT_715 = NL + "\t\teSet(";
  protected final String TEXT_716 = ", ";
  protected final String TEXT_717 = "new ";
  protected final String TEXT_718 = "(";
  protected final String TEXT_719 = "new";
  protected final String TEXT_720 = ")";
  protected final String TEXT_721 = ");";
  protected final String TEXT_722 = NL + "\t\tif (new";
  protected final String TEXT_723 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_724 = " && new";
  protected final String TEXT_725 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_726 = ".isAncestor(this, ";
  protected final String TEXT_727 = "new";
  protected final String TEXT_728 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_729 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_730 = NL + "\t\t\t";
  protected final String TEXT_731 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_732 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_733 = ")new";
  protected final String TEXT_734 = ").eInverseAdd(this, ";
  protected final String TEXT_735 = ", ";
  protected final String TEXT_736 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_737 = "(";
  protected final String TEXT_738 = "new";
  protected final String TEXT_739 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_740 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_741 = "(this, ";
  protected final String TEXT_742 = ".SET, ";
  protected final String TEXT_743 = ", new";
  protected final String TEXT_744 = ", new";
  protected final String TEXT_745 = "));";
  protected final String TEXT_746 = NL + "\t\t";
  protected final String TEXT_747 = " ";
  protected final String TEXT_748 = " = (";
  protected final String TEXT_749 = ")eVirtualGet(";
  protected final String TEXT_750 = ");";
  protected final String TEXT_751 = NL + "\t\tif (new";
  protected final String TEXT_752 = " != ";
  protected final String TEXT_753 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_754 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_755 = " != null)";
  protected final String TEXT_756 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_757 = ")";
  protected final String TEXT_758 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_759 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_760 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_761 = ")new";
  protected final String TEXT_762 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_763 = ", null, msgs);";
  protected final String TEXT_764 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_765 = ")";
  protected final String TEXT_766 = ").eInverseRemove(this, ";
  protected final String TEXT_767 = ", ";
  protected final String TEXT_768 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_769 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_770 = ")new";
  protected final String TEXT_771 = ").eInverseAdd(this, ";
  protected final String TEXT_772 = ", ";
  protected final String TEXT_773 = ".class, msgs);";
  protected final String TEXT_774 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_775 = "(";
  protected final String TEXT_776 = "new";
  protected final String TEXT_777 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_778 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_779 = NL + "\t\t\tboolean old";
  protected final String TEXT_780 = "ESet = eVirtualIsSet(";
  protected final String TEXT_781 = ");";
  protected final String TEXT_782 = NL + "\t\t\tboolean old";
  protected final String TEXT_783 = "ESet = (";
  protected final String TEXT_784 = " & ";
  protected final String TEXT_785 = "_ESETFLAG) != 0;";
  protected final String TEXT_786 = NL + "\t\t\t";
  protected final String TEXT_787 = " |= ";
  protected final String TEXT_788 = "_ESETFLAG;";
  protected final String TEXT_789 = NL + "\t\t\tboolean old";
  protected final String TEXT_790 = "ESet = ";
  protected final String TEXT_791 = "ESet;";
  protected final String TEXT_792 = NL + "\t\t\t";
  protected final String TEXT_793 = "ESet = true;";
  protected final String TEXT_794 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_795 = "(this, ";
  protected final String TEXT_796 = ".SET, ";
  protected final String TEXT_797 = ", new";
  protected final String TEXT_798 = ", new";
  protected final String TEXT_799 = ", !old";
  protected final String TEXT_800 = "ESet));";
  protected final String TEXT_801 = NL + "\t\t}";
  protected final String TEXT_802 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_803 = "(this, ";
  protected final String TEXT_804 = ".SET, ";
  protected final String TEXT_805 = ", new";
  protected final String TEXT_806 = ", new";
  protected final String TEXT_807 = "));";
  protected final String TEXT_808 = NL + "\t\t";
  protected final String TEXT_809 = " old";
  protected final String TEXT_810 = " = (";
  protected final String TEXT_811 = " & ";
  protected final String TEXT_812 = "_EFLAG) != 0;";
  protected final String TEXT_813 = NL + "\t\tif (new";
  protected final String TEXT_814 = ") ";
  protected final String TEXT_815 = " |= ";
  protected final String TEXT_816 = "_EFLAG; else ";
  protected final String TEXT_817 = " &= ~";
  protected final String TEXT_818 = "_EFLAG;";
  protected final String TEXT_819 = NL + "\t\t";
  protected final String TEXT_820 = " old";
  protected final String TEXT_821 = " = ";
  protected final String TEXT_822 = ";";
  protected final String TEXT_823 = NL + "\t\t";
  protected final String TEXT_824 = " ";
  protected final String TEXT_825 = " = new";
  protected final String TEXT_826 = " == null ? ";
  protected final String TEXT_827 = " : new";
  protected final String TEXT_828 = ";";
  protected final String TEXT_829 = NL + "\t\t";
  protected final String TEXT_830 = " = new";
  protected final String TEXT_831 = " == null ? ";
  protected final String TEXT_832 = " : new";
  protected final String TEXT_833 = ";";
  protected final String TEXT_834 = NL + "\t\t";
  protected final String TEXT_835 = " ";
  protected final String TEXT_836 = " = ";
  protected final String TEXT_837 = "new";
  protected final String TEXT_838 = ";";
  protected final String TEXT_839 = NL + "\t\t";
  protected final String TEXT_840 = " = ";
  protected final String TEXT_841 = "new";
  protected final String TEXT_842 = ";";
  protected final String TEXT_843 = NL + "\t\tObject old";
  protected final String TEXT_844 = " = eVirtualSet(";
  protected final String TEXT_845 = ", ";
  protected final String TEXT_846 = ");";
  protected final String TEXT_847 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_848 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_849 = NL + "\t\tboolean old";
  protected final String TEXT_850 = "ESet = (";
  protected final String TEXT_851 = " & ";
  protected final String TEXT_852 = "_ESETFLAG) != 0;";
  protected final String TEXT_853 = NL + "\t\t";
  protected final String TEXT_854 = " |= ";
  protected final String TEXT_855 = "_ESETFLAG;";
  protected final String TEXT_856 = NL + "\t\tboolean old";
  protected final String TEXT_857 = "ESet = ";
  protected final String TEXT_858 = "ESet;";
  protected final String TEXT_859 = NL + "\t\t";
  protected final String TEXT_860 = "ESet = true;";
  protected final String TEXT_861 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_862 = "(this, ";
  protected final String TEXT_863 = ".SET, ";
  protected final String TEXT_864 = ", ";
  protected final String TEXT_865 = "isSetChange ? ";
  protected final String TEXT_866 = " : old";
  protected final String TEXT_867 = "old";
  protected final String TEXT_868 = ", ";
  protected final String TEXT_869 = "new";
  protected final String TEXT_870 = ", ";
  protected final String TEXT_871 = "isSetChange";
  protected final String TEXT_872 = "!old";
  protected final String TEXT_873 = "ESet";
  protected final String TEXT_874 = "));";
  protected final String TEXT_875 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_876 = "(this, ";
  protected final String TEXT_877 = ".SET, ";
  protected final String TEXT_878 = ", ";
  protected final String TEXT_879 = "old";
  protected final String TEXT_880 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_881 = " : old";
  protected final String TEXT_882 = "old";
  protected final String TEXT_883 = ", ";
  protected final String TEXT_884 = "new";
  protected final String TEXT_885 = "));";
  protected final String TEXT_886 = NL;
  protected final String TEXT_887 = NL;
  protected final String TEXT_888 = NL + "\t\t";
  protected final String TEXT_889 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_890 = NL + "\t\t\t";
  protected final String TEXT_891 = " ";
  protected final String TEXT_892 = " = ";
  protected final String TEXT_893 = "();";
  protected final String TEXT_894 = NL + "\t\t\tObject ";
  protected final String TEXT_895 = " = eVirtualGet(";
  protected final String TEXT_896 = ");";
  protected final String TEXT_897 = NL + "\t\t\tif (";
  protected final String TEXT_898 = " != null && ";
  protected final String TEXT_899 = " != new";
  protected final String TEXT_900 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_901 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_902 = NL + "\t\t\tif (new";
  protected final String TEXT_903 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_904 = NL + "\t\t\t\t";
  protected final String TEXT_905 = " ";
  protected final String TEXT_906 = " = ";
  protected final String TEXT_907 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_908 = ".contains(new";
  protected final String TEXT_909 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_910 = ".add(new";
  protected final String TEXT_911 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_912 = NL + "\t\t\t\t";
  protected final String TEXT_913 = " ";
  protected final String TEXT_914 = " = ";
  protected final String TEXT_915 = "();";
  protected final String TEXT_916 = NL + "\t\t\t\tObject ";
  protected final String TEXT_917 = " = eVirtualGet(";
  protected final String TEXT_918 = ");";
  protected final String TEXT_919 = NL + "\t\t\t\tif (new";
  protected final String TEXT_920 = " != ";
  protected final String TEXT_921 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_922 = "(new";
  protected final String TEXT_923 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_924 = NL + "\t\t\t}";
  protected final String TEXT_925 = NL + "\t\t}";
  protected final String TEXT_926 = NL + "\t\t((";
  protected final String TEXT_927 = ".Internal)((";
  protected final String TEXT_928 = ".Internal.Wrapper)get";
  protected final String TEXT_929 = "()).featureMap()).set(";
  protected final String TEXT_930 = ", ";
  protected final String TEXT_931 = "new ";
  protected final String TEXT_932 = "(";
  protected final String TEXT_933 = "new";
  protected final String TEXT_934 = ")";
  protected final String TEXT_935 = ");";
  protected final String TEXT_936 = NL + "\t\t((";
  protected final String TEXT_937 = ".Internal)get";
  protected final String TEXT_938 = "()).set(";
  protected final String TEXT_939 = ", ";
  protected final String TEXT_940 = "new ";
  protected final String TEXT_941 = "(";
  protected final String TEXT_942 = "new";
  protected final String TEXT_943 = ")";
  protected final String TEXT_944 = ");";
  protected final String TEXT_945 = NL;
  protected final String TEXT_946 = NL + "\t\t";
  protected final String TEXT_947 = ".";
  protected final String TEXT_948 = "(this, ";
  protected final String TEXT_949 = ");";
  protected final String TEXT_950 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_951 = "' ";
  protected final String TEXT_952 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_953 = NL + "\t}" + NL;
  protected final String TEXT_954 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_955 = " basicUnset";
  protected final String TEXT_956 = "(";
  protected final String TEXT_957 = " msgs)" + NL + "\t{";
  protected final String TEXT_958 = NL + "\t\tObject old";
  protected final String TEXT_959 = " = eVirtualUnset(";
  protected final String TEXT_960 = ");";
  protected final String TEXT_961 = NL + "\t\t";
  protected final String TEXT_962 = " old";
  protected final String TEXT_963 = " = ";
  protected final String TEXT_964 = ";" + NL + "\t\t";
  protected final String TEXT_965 = " = null;";
  protected final String TEXT_966 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_967 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_968 = NL + "\t\tboolean old";
  protected final String TEXT_969 = "ESet = (";
  protected final String TEXT_970 = " & ";
  protected final String TEXT_971 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_972 = " &= ~";
  protected final String TEXT_973 = "_ESETFLAG;";
  protected final String TEXT_974 = NL + "\t\tboolean old";
  protected final String TEXT_975 = "ESet = ";
  protected final String TEXT_976 = "ESet;" + NL + "\t\t";
  protected final String TEXT_977 = "ESet = false;";
  protected final String TEXT_978 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_979 = " notification = new ";
  protected final String TEXT_980 = "(this, ";
  protected final String TEXT_981 = ".UNSET, ";
  protected final String TEXT_982 = ", ";
  protected final String TEXT_983 = "isSetChange ? old";
  protected final String TEXT_984 = " : null";
  protected final String TEXT_985 = "old";
  protected final String TEXT_986 = ", null, ";
  protected final String TEXT_987 = "isSetChange";
  protected final String TEXT_988 = "old";
  protected final String TEXT_989 = "ESet";
  protected final String TEXT_990 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_991 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_992 = "' ";
  protected final String TEXT_993 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_994 = NL + "\t}" + NL;
  protected final String TEXT_995 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_996 = "#";
  protected final String TEXT_997 = " <em>";
  protected final String TEXT_998 = "</em>}' ";
  protected final String TEXT_999 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1000 = NL + "\t * @see #isSet";
  protected final String TEXT_1001 = "()";
  protected final String TEXT_1002 = NL + "\t * @see #";
  protected final String TEXT_1003 = "()";
  protected final String TEXT_1004 = NL + "\t * @see #set";
  protected final String TEXT_1005 = "(";
  protected final String TEXT_1006 = ")";
  protected final String TEXT_1007 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1008 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1009 = NL + "\tvoid unset";
  protected final String TEXT_1010 = "();" + NL;
  protected final String TEXT_1011 = NL + "\tpublic void unset";
  protected final String TEXT_1012 = "()" + NL + "\t{";
  protected final String TEXT_1013 = NL + "\t\teUnset(";
  protected final String TEXT_1014 = ");";
  protected final String TEXT_1015 = NL + "\t\t";
  protected final String TEXT_1016 = " ";
  protected final String TEXT_1017 = " = (";
  protected final String TEXT_1018 = ")eVirtualGet(";
  protected final String TEXT_1019 = ");";
  protected final String TEXT_1020 = NL + "\t\tif (";
  protected final String TEXT_1021 = " != null) ((";
  protected final String TEXT_1022 = ".Unsettable";
  protected final String TEXT_1023 = ")";
  protected final String TEXT_1024 = ").unset();";
  protected final String TEXT_1025 = NL + "\t\t";
  protected final String TEXT_1026 = " ";
  protected final String TEXT_1027 = " = (";
  protected final String TEXT_1028 = ")eVirtualGet(";
  protected final String TEXT_1029 = ");";
  protected final String TEXT_1030 = NL + "\t\tif (";
  protected final String TEXT_1031 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1032 = " msgs = null;";
  protected final String TEXT_1033 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1034 = ")";
  protected final String TEXT_1035 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1036 = ", null, msgs);";
  protected final String TEXT_1037 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1038 = ")";
  protected final String TEXT_1039 = ").eInverseRemove(this, ";
  protected final String TEXT_1040 = ", ";
  protected final String TEXT_1041 = ".class, msgs);";
  protected final String TEXT_1042 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1043 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1044 = NL + "\t\t\tboolean old";
  protected final String TEXT_1045 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1046 = ");";
  protected final String TEXT_1047 = NL + "\t\t\tboolean old";
  protected final String TEXT_1048 = "ESet = (";
  protected final String TEXT_1049 = " & ";
  protected final String TEXT_1050 = "_ESETFLAG) != 0;";
  protected final String TEXT_1051 = NL + "\t\t\t";
  protected final String TEXT_1052 = " &= ~";
  protected final String TEXT_1053 = "_ESETFLAG;";
  protected final String TEXT_1054 = NL + "\t\t\tboolean old";
  protected final String TEXT_1055 = "ESet = ";
  protected final String TEXT_1056 = "ESet;";
  protected final String TEXT_1057 = NL + "\t\t\t";
  protected final String TEXT_1058 = "ESet = false;";
  protected final String TEXT_1059 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1060 = "(this, ";
  protected final String TEXT_1061 = ".UNSET, ";
  protected final String TEXT_1062 = ", null, null, old";
  protected final String TEXT_1063 = "ESet));";
  protected final String TEXT_1064 = NL + "\t\t}";
  protected final String TEXT_1065 = NL + "\t\t";
  protected final String TEXT_1066 = " old";
  protected final String TEXT_1067 = " = (";
  protected final String TEXT_1068 = " & ";
  protected final String TEXT_1069 = "_EFLAG) != 0;";
  protected final String TEXT_1070 = NL + "\t\tObject old";
  protected final String TEXT_1071 = " = eVirtualUnset(";
  protected final String TEXT_1072 = ");";
  protected final String TEXT_1073 = NL + "\t\t";
  protected final String TEXT_1074 = " old";
  protected final String TEXT_1075 = " = ";
  protected final String TEXT_1076 = ";";
  protected final String TEXT_1077 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1078 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1079 = NL + "\t\tboolean old";
  protected final String TEXT_1080 = "ESet = (";
  protected final String TEXT_1081 = " & ";
  protected final String TEXT_1082 = "_ESETFLAG) != 0;";
  protected final String TEXT_1083 = NL + "\t\tboolean old";
  protected final String TEXT_1084 = "ESet = ";
  protected final String TEXT_1085 = "ESet;";
  protected final String TEXT_1086 = NL + "\t\t";
  protected final String TEXT_1087 = " = null;";
  protected final String TEXT_1088 = NL + "\t\t";
  protected final String TEXT_1089 = " &= ~";
  protected final String TEXT_1090 = "_ESETFLAG;";
  protected final String TEXT_1091 = NL + "\t\t";
  protected final String TEXT_1092 = "ESet = false;";
  protected final String TEXT_1093 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1094 = "(this, ";
  protected final String TEXT_1095 = ".UNSET, ";
  protected final String TEXT_1096 = ", ";
  protected final String TEXT_1097 = "isSetChange ? old";
  protected final String TEXT_1098 = " : null";
  protected final String TEXT_1099 = "old";
  protected final String TEXT_1100 = ", null, ";
  protected final String TEXT_1101 = "isSetChange";
  protected final String TEXT_1102 = "old";
  protected final String TEXT_1103 = "ESet";
  protected final String TEXT_1104 = "));";
  protected final String TEXT_1105 = NL + "\t\tif (";
  protected final String TEXT_1106 = ") ";
  protected final String TEXT_1107 = " |= ";
  protected final String TEXT_1108 = "_EFLAG; else ";
  protected final String TEXT_1109 = " &= ~";
  protected final String TEXT_1110 = "_EFLAG;";
  protected final String TEXT_1111 = NL + "\t\t";
  protected final String TEXT_1112 = " = ";
  protected final String TEXT_1113 = ";";
  protected final String TEXT_1114 = NL + "\t\t";
  protected final String TEXT_1115 = " &= ~";
  protected final String TEXT_1116 = "_ESETFLAG;";
  protected final String TEXT_1117 = NL + "\t\t";
  protected final String TEXT_1118 = "ESet = false;";
  protected final String TEXT_1119 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1120 = "(this, ";
  protected final String TEXT_1121 = ".UNSET, ";
  protected final String TEXT_1122 = ", ";
  protected final String TEXT_1123 = "isSetChange ? old";
  protected final String TEXT_1124 = " : ";
  protected final String TEXT_1125 = "old";
  protected final String TEXT_1126 = ", ";
  protected final String TEXT_1127 = ", ";
  protected final String TEXT_1128 = "isSetChange";
  protected final String TEXT_1129 = "old";
  protected final String TEXT_1130 = "ESet";
  protected final String TEXT_1131 = "));";
  protected final String TEXT_1132 = NL + "\t\t((";
  protected final String TEXT_1133 = ".Internal)((";
  protected final String TEXT_1134 = ".Internal.Wrapper)get";
  protected final String TEXT_1135 = "()).featureMap()).clear(";
  protected final String TEXT_1136 = ");";
  protected final String TEXT_1137 = NL + "\t\t((";
  protected final String TEXT_1138 = ".Internal)get";
  protected final String TEXT_1139 = "()).clear(";
  protected final String TEXT_1140 = ");";
  protected final String TEXT_1141 = NL;
  protected final String TEXT_1142 = NL + "\t\t";
  protected final String TEXT_1143 = ".";
  protected final String TEXT_1144 = "(this);";
  protected final String TEXT_1145 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1146 = "' ";
  protected final String TEXT_1147 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1148 = NL + "\t}" + NL;
  protected final String TEXT_1149 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1150 = "#";
  protected final String TEXT_1151 = " <em>";
  protected final String TEXT_1152 = "</em>}' ";
  protected final String TEXT_1153 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1154 = "</em>' ";
  protected final String TEXT_1155 = " is set.";
  protected final String TEXT_1156 = NL + "\t * @see #unset";
  protected final String TEXT_1157 = "()";
  protected final String TEXT_1158 = NL + "\t * @see #";
  protected final String TEXT_1159 = "()";
  protected final String TEXT_1160 = NL + "\t * @see #set";
  protected final String TEXT_1161 = "(";
  protected final String TEXT_1162 = ")";
  protected final String TEXT_1163 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1164 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1165 = NL + "\tboolean isSet";
  protected final String TEXT_1166 = "();" + NL;
  protected final String TEXT_1167 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1168 = "()" + NL + "\t{";
  protected final String TEXT_1169 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1170 = ");";
  protected final String TEXT_1171 = NL + "\t\t";
  protected final String TEXT_1172 = " ";
  protected final String TEXT_1173 = " = (";
  protected final String TEXT_1174 = ")eVirtualGet(";
  protected final String TEXT_1175 = ");";
  protected final String TEXT_1176 = NL + "\t\treturn ";
  protected final String TEXT_1177 = " != null && ((";
  protected final String TEXT_1178 = ".Unsettable";
  protected final String TEXT_1179 = ")";
  protected final String TEXT_1180 = ").isSet();";
  protected final String TEXT_1181 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1182 = ");";
  protected final String TEXT_1183 = NL + "\t\treturn (";
  protected final String TEXT_1184 = " & ";
  protected final String TEXT_1185 = "_ESETFLAG) != 0;";
  protected final String TEXT_1186 = NL + "\t\treturn ";
  protected final String TEXT_1187 = "ESet;";
  protected final String TEXT_1188 = NL + "\t\treturn !((";
  protected final String TEXT_1189 = ".Internal)((";
  protected final String TEXT_1190 = ".Internal.Wrapper)get";
  protected final String TEXT_1191 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1192 = ");";
  protected final String TEXT_1193 = NL + "\t\treturn !((";
  protected final String TEXT_1194 = ".Internal)get";
  protected final String TEXT_1195 = "()).isEmpty(";
  protected final String TEXT_1196 = ");";
  protected final String TEXT_1197 = NL;
  protected final String TEXT_1198 = NL + "\t\treturn ";
  protected final String TEXT_1199 = ".";
  protected final String TEXT_1200 = "(this);";
  protected final String TEXT_1201 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1202 = "' ";
  protected final String TEXT_1203 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1204 = NL + "\t}" + NL;
  protected final String TEXT_1205 = NL;
  protected final String TEXT_1206 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1207 = "() <em>";
  protected final String TEXT_1208 = "</em>}' ";
  protected final String TEXT_1209 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1210 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1211 = "_ESUBSETS = ";
  protected final String TEXT_1212 = ";" + NL;
  protected final String TEXT_1213 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1214 = "() <em>";
  protected final String TEXT_1215 = "</em>}' ";
  protected final String TEXT_1216 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1217 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1218 = "_ESUPERSETS = ";
  protected final String TEXT_1219 = ";" + NL;
  protected final String TEXT_1220 = NL + "\t/**";
  protected final String TEXT_1221 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1222 = "}, with the specified ";
  protected final String TEXT_1223 = ", and appends it to the '<em><b>";
  protected final String TEXT_1224 = "</b></em>' ";
  protected final String TEXT_1225 = ".";
  protected final String TEXT_1226 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1227 = "}, with the specified ";
  protected final String TEXT_1228 = ", and sets the '<em><b>";
  protected final String TEXT_1229 = "</b></em>' ";
  protected final String TEXT_1230 = ".";
  protected final String TEXT_1231 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1232 = "} and appends it to the '<em><b>";
  protected final String TEXT_1233 = "</b></em>' ";
  protected final String TEXT_1234 = ".";
  protected final String TEXT_1235 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1236 = "} and sets the '<em><b>";
  protected final String TEXT_1237 = "</b></em>' ";
  protected final String TEXT_1238 = ".";
  protected final String TEXT_1239 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1240 = NL + "\t * @param ";
  protected final String TEXT_1241 = " The ";
  protected final String TEXT_1242 = " for the new {@link ";
  protected final String TEXT_1243 = "}, or <code>null</code>.";
  protected final String TEXT_1244 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1245 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1246 = "}." + NL + "\t * @see #";
  protected final String TEXT_1247 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1248 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1249 = NL + "\t";
  protected final String TEXT_1250 = " create";
  protected final String TEXT_1251 = "(";
  protected final String TEXT_1252 = ", ";
  protected final String TEXT_1253 = " eClass);" + NL;
  protected final String TEXT_1254 = NL + "\t@Override";
  protected final String TEXT_1255 = NL + "\tpublic ";
  protected final String TEXT_1256 = " create";
  protected final String TEXT_1257 = "(";
  protected final String TEXT_1258 = ", ";
  protected final String TEXT_1259 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1260 = " new";
  protected final String TEXT_1261 = " = (";
  protected final String TEXT_1262 = ") create(eClass);";
  protected final String TEXT_1263 = NL + "\t\t";
  protected final String TEXT_1264 = "().add(new";
  protected final String TEXT_1265 = ");";
  protected final String TEXT_1266 = NL + "\t\tset";
  protected final String TEXT_1267 = "(new";
  protected final String TEXT_1268 = ");";
  protected final String TEXT_1269 = NL + "\t\tint ";
  protected final String TEXT_1270 = "ListSize = 0;";
  protected final String TEXT_1271 = NL + "\t\tint ";
  protected final String TEXT_1272 = "Size = ";
  protected final String TEXT_1273 = " == null ? 0 : ";
  protected final String TEXT_1274 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1275 = "Size > ";
  protected final String TEXT_1276 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1277 = "ListSize = ";
  protected final String TEXT_1278 = "Size;";
  protected final String TEXT_1279 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1280 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1281 = ".create";
  protected final String TEXT_1282 = "(";
  protected final String TEXT_1283 = ", ";
  protected final String TEXT_1284 = "i < ";
  protected final String TEXT_1285 = "Size ? (";
  protected final String TEXT_1286 = ") ";
  protected final String TEXT_1287 = ".get(i) : null";
  protected final String TEXT_1288 = ");" + NL + "\t\t}";
  protected final String TEXT_1289 = NL + "\t\tnew";
  protected final String TEXT_1290 = ".create";
  protected final String TEXT_1291 = "(";
  protected final String TEXT_1292 = ", ";
  protected final String TEXT_1293 = ");";
  protected final String TEXT_1294 = NL + "\t\tif (";
  protected final String TEXT_1295 = " != null)";
  protected final String TEXT_1296 = NL + "\t\t\tnew";
  protected final String TEXT_1297 = ".";
  protected final String TEXT_1298 = "().addAll(";
  protected final String TEXT_1299 = ");";
  protected final String TEXT_1300 = NL + "\t\t\tnew";
  protected final String TEXT_1301 = ".set";
  protected final String TEXT_1302 = "(";
  protected final String TEXT_1303 = ");";
  protected final String TEXT_1304 = NL + "\t\treturn new";
  protected final String TEXT_1305 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1306 = NL + "\t/**";
  protected final String TEXT_1307 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1308 = "}, with the specified ";
  protected final String TEXT_1309 = ", and appends it to the '<em><b>";
  protected final String TEXT_1310 = "</b></em>' ";
  protected final String TEXT_1311 = ".";
  protected final String TEXT_1312 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1313 = "},with the specified ";
  protected final String TEXT_1314 = ", and sets the '<em><b>";
  protected final String TEXT_1315 = "</b></em>' ";
  protected final String TEXT_1316 = ".";
  protected final String TEXT_1317 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1318 = "} and appends it to the '<em><b>";
  protected final String TEXT_1319 = "</b></em>' ";
  protected final String TEXT_1320 = ".";
  protected final String TEXT_1321 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1322 = "} and sets the '<em><b>";
  protected final String TEXT_1323 = "</b></em>' ";
  protected final String TEXT_1324 = ".";
  protected final String TEXT_1325 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1326 = NL + "\t * @param ";
  protected final String TEXT_1327 = " The ";
  protected final String TEXT_1328 = " for the new {@link ";
  protected final String TEXT_1329 = "}, or <code>null</code>.";
  protected final String TEXT_1330 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1331 = "}." + NL + "\t * @see #";
  protected final String TEXT_1332 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1333 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1334 = NL + "\t";
  protected final String TEXT_1335 = " create";
  protected final String TEXT_1336 = "(";
  protected final String TEXT_1337 = ");" + NL;
  protected final String TEXT_1338 = NL + "\t@Override";
  protected final String TEXT_1339 = NL + "\tpublic ";
  protected final String TEXT_1340 = " create";
  protected final String TEXT_1341 = "(";
  protected final String TEXT_1342 = ")" + NL + "\t{";
  protected final String TEXT_1343 = NL + "\t\treturn create";
  protected final String TEXT_1344 = "(";
  protected final String TEXT_1345 = ", ";
  protected final String TEXT_1346 = ");";
  protected final String TEXT_1347 = NL + "\t\t";
  protected final String TEXT_1348 = " new";
  protected final String TEXT_1349 = " = (";
  protected final String TEXT_1350 = ") create(";
  protected final String TEXT_1351 = ");";
  protected final String TEXT_1352 = NL + "\t\t";
  protected final String TEXT_1353 = "().add(new";
  protected final String TEXT_1354 = ");";
  protected final String TEXT_1355 = NL + "\t\tset";
  protected final String TEXT_1356 = "(new";
  protected final String TEXT_1357 = ");";
  protected final String TEXT_1358 = NL + "\t\tint ";
  protected final String TEXT_1359 = "ListSize = 0;";
  protected final String TEXT_1360 = NL + "\t\tint ";
  protected final String TEXT_1361 = "Size = ";
  protected final String TEXT_1362 = " == null ? 0 : ";
  protected final String TEXT_1363 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1364 = "Size > ";
  protected final String TEXT_1365 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1366 = "ListSize = ";
  protected final String TEXT_1367 = "Size;";
  protected final String TEXT_1368 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1369 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1370 = ".create";
  protected final String TEXT_1371 = "(";
  protected final String TEXT_1372 = ", ";
  protected final String TEXT_1373 = "i < ";
  protected final String TEXT_1374 = "Size ? (";
  protected final String TEXT_1375 = ") ";
  protected final String TEXT_1376 = ".get(i) : null";
  protected final String TEXT_1377 = ");" + NL + "\t\t}";
  protected final String TEXT_1378 = NL + "\t\tnew";
  protected final String TEXT_1379 = ".create";
  protected final String TEXT_1380 = "(";
  protected final String TEXT_1381 = ", ";
  protected final String TEXT_1382 = ");";
  protected final String TEXT_1383 = NL + "\t\tif (";
  protected final String TEXT_1384 = " != null)";
  protected final String TEXT_1385 = NL + "\t\t\tnew";
  protected final String TEXT_1386 = ".";
  protected final String TEXT_1387 = "().addAll(";
  protected final String TEXT_1388 = ");";
  protected final String TEXT_1389 = NL + "\t\t\tnew";
  protected final String TEXT_1390 = ".set";
  protected final String TEXT_1391 = "(";
  protected final String TEXT_1392 = ");";
  protected final String TEXT_1393 = NL + "\t\treturn new";
  protected final String TEXT_1394 = ";";
  protected final String TEXT_1395 = NL + "\t}" + NL;
  protected final String TEXT_1396 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1397 = "} with the specified ";
  protected final String TEXT_1398 = " from the '<em><b>";
  protected final String TEXT_1399 = "</b></em>' ";
  protected final String TEXT_1400 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1401 = NL + "\t * @param ";
  protected final String TEXT_1402 = " The ";
  protected final String TEXT_1403 = " of the {@link ";
  protected final String TEXT_1404 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1405 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1406 = "} with the specified ";
  protected final String TEXT_1407 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1408 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1409 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1410 = NL + "\t";
  protected final String TEXT_1411 = " get";
  protected final String TEXT_1412 = "(";
  protected final String TEXT_1413 = ");" + NL;
  protected final String TEXT_1414 = NL + "\t@Override";
  protected final String TEXT_1415 = NL + "\tpublic ";
  protected final String TEXT_1416 = " get";
  protected final String TEXT_1417 = "(";
  protected final String TEXT_1418 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1419 = "(";
  protected final String TEXT_1420 = ", false";
  protected final String TEXT_1421 = ", null";
  protected final String TEXT_1422 = ", false";
  protected final String TEXT_1423 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1424 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1425 = "} with the specified ";
  protected final String TEXT_1426 = " from the '<em><b>";
  protected final String TEXT_1427 = "</b></em>' ";
  protected final String TEXT_1428 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1429 = NL + "\t * @param ";
  protected final String TEXT_1430 = " The ";
  protected final String TEXT_1431 = " of the {@link ";
  protected final String TEXT_1432 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1433 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1434 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1435 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1436 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1437 = "} on demand if not found.";
  protected final String TEXT_1438 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1439 = "} with the specified ";
  protected final String TEXT_1440 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1441 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1442 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1443 = NL + "\t";
  protected final String TEXT_1444 = " get";
  protected final String TEXT_1445 = "(";
  protected final String TEXT_1446 = ", boolean ignoreCase";
  protected final String TEXT_1447 = ", ";
  protected final String TEXT_1448 = " eClass";
  protected final String TEXT_1449 = ", boolean createOnDemand";
  protected final String TEXT_1450 = ");" + NL;
  protected final String TEXT_1451 = NL + "\t@Override";
  protected final String TEXT_1452 = NL + "\tpublic ";
  protected final String TEXT_1453 = " get";
  protected final String TEXT_1454 = "(";
  protected final String TEXT_1455 = ", boolean ignoreCase";
  protected final String TEXT_1456 = ", ";
  protected final String TEXT_1457 = " eClass";
  protected final String TEXT_1458 = ", boolean createOnDemand";
  protected final String TEXT_1459 = ")" + NL + "\t{";
  protected final String TEXT_1460 = NL + "\t\t";
  protected final String TEXT_1461 = "Loop: for (";
  protected final String TEXT_1462 = " ";
  protected final String TEXT_1463 = " : ";
  protected final String TEXT_1464 = "())" + NL + "\t\t{";
  protected final String TEXT_1465 = NL + "\t\t";
  protected final String TEXT_1466 = "Loop: for (";
  protected final String TEXT_1467 = " i = ";
  protected final String TEXT_1468 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1469 = " ";
  protected final String TEXT_1470 = " = (";
  protected final String TEXT_1471 = ") i.next();";
  protected final String TEXT_1472 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1473 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1474 = "Loop;";
  protected final String TEXT_1475 = NL + "\t\t\t";
  protected final String TEXT_1476 = " ";
  protected final String TEXT_1477 = "List = ";
  protected final String TEXT_1478 = ".";
  protected final String TEXT_1479 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1480 = "ListSize = ";
  protected final String TEXT_1481 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1482 = " || (";
  protected final String TEXT_1483 = " != null && ";
  protected final String TEXT_1484 = ".size() != ";
  protected final String TEXT_1485 = "ListSize";
  protected final String TEXT_1486 = ")";
  protected final String TEXT_1487 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1488 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1489 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1490 = " ";
  protected final String TEXT_1491 = " = ";
  protected final String TEXT_1492 = "(";
  protected final String TEXT_1493 = ") ";
  protected final String TEXT_1494 = "List.get(j);";
  protected final String TEXT_1495 = NL + "\t\t\t\tif (";
  protected final String TEXT_1496 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1497 = "(";
  protected final String TEXT_1498 = ")";
  protected final String TEXT_1499 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1500 = ".";
  protected final String TEXT_1501 = "()) : ";
  protected final String TEXT_1502 = ".get(j).equals(";
  protected final String TEXT_1503 = ".";
  protected final String TEXT_1504 = "())))";
  protected final String TEXT_1505 = NL + "\t\t\t\tif (";
  protected final String TEXT_1506 = " != null && !";
  protected final String TEXT_1507 = ".get(j).equals(";
  protected final String TEXT_1508 = ".";
  protected final String TEXT_1509 = "()))";
  protected final String TEXT_1510 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1511 = "Loop;";
  protected final String TEXT_1512 = NL + "\t\t\t}";
  protected final String TEXT_1513 = NL + "\t\t\t";
  protected final String TEXT_1514 = " ";
  protected final String TEXT_1515 = " = ";
  protected final String TEXT_1516 = ".";
  protected final String TEXT_1517 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1518 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1519 = "Loop;";
  protected final String TEXT_1520 = NL + "\t\t\tif (";
  protected final String TEXT_1521 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1522 = ".equalsIgnoreCase(";
  protected final String TEXT_1523 = ".";
  protected final String TEXT_1524 = "()) : ";
  protected final String TEXT_1525 = ".equals(";
  protected final String TEXT_1526 = ".";
  protected final String TEXT_1527 = "())))";
  protected final String TEXT_1528 = NL + "\t\t\tif (";
  protected final String TEXT_1529 = " != null && !";
  protected final String TEXT_1530 = ".equals(";
  protected final String TEXT_1531 = ".";
  protected final String TEXT_1532 = "()))";
  protected final String TEXT_1533 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1534 = "Loop;";
  protected final String TEXT_1535 = NL + "\t\t\tif (";
  protected final String TEXT_1536 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1537 = ".equalsIgnoreCase(";
  protected final String TEXT_1538 = ".";
  protected final String TEXT_1539 = "()) : ";
  protected final String TEXT_1540 = ".equals(";
  protected final String TEXT_1541 = ".";
  protected final String TEXT_1542 = "())))";
  protected final String TEXT_1543 = NL + "\t\t\tif (";
  protected final String TEXT_1544 = " != null && !";
  protected final String TEXT_1545 = ".equals(";
  protected final String TEXT_1546 = ".";
  protected final String TEXT_1547 = "()))";
  protected final String TEXT_1548 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1549 = "Loop;";
  protected final String TEXT_1550 = NL + "\t\t\treturn ";
  protected final String TEXT_1551 = ";" + NL + "\t\t}";
  protected final String TEXT_1552 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1553 = " && eClass != null";
  protected final String TEXT_1554 = " ? create";
  protected final String TEXT_1555 = "(";
  protected final String TEXT_1556 = ", eClass";
  protected final String TEXT_1557 = ") : null;";
  protected final String TEXT_1558 = NL + "\t\treturn null;";
  protected final String TEXT_1559 = NL + "\t}" + NL;
  protected final String TEXT_1560 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1561 = NL + "\t@Override";
  protected final String TEXT_1562 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1563 = "()" + NL + "\t{";
  protected final String TEXT_1564 = NL + "  \t\treturn false;";
  protected final String TEXT_1565 = NL + "\t\treturn !((";
  protected final String TEXT_1566 = ".Internal.Wrapper)";
  protected final String TEXT_1567 = "()).featureMap().isEmpty();";
  protected final String TEXT_1568 = NL + "\t\treturn ";
  protected final String TEXT_1569 = " != null && !";
  protected final String TEXT_1570 = ".featureMap().isEmpty();";
  protected final String TEXT_1571 = NL + "\t\treturn ";
  protected final String TEXT_1572 = " != null && !";
  protected final String TEXT_1573 = ".isEmpty();";
  protected final String TEXT_1574 = NL + "\t\t";
  protected final String TEXT_1575 = " ";
  protected final String TEXT_1576 = " = (";
  protected final String TEXT_1577 = ")eVirtualGet(";
  protected final String TEXT_1578 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1579 = " != null && !";
  protected final String TEXT_1580 = ".isEmpty();";
  protected final String TEXT_1581 = NL + "\t\treturn !";
  protected final String TEXT_1582 = "().isEmpty();";
  protected final String TEXT_1583 = NL + "\t\treturn ";
  protected final String TEXT_1584 = " != null;";
  protected final String TEXT_1585 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1586 = ") != null;";
  protected final String TEXT_1587 = NL + "\t\treturn basicGet";
  protected final String TEXT_1588 = "() != null;";
  protected final String TEXT_1589 = NL + "\t\treturn ";
  protected final String TEXT_1590 = " != null;";
  protected final String TEXT_1591 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1592 = ") != null;";
  protected final String TEXT_1593 = NL + "\t\treturn ";
  protected final String TEXT_1594 = "() != null;";
  protected final String TEXT_1595 = NL + "\t\treturn ((";
  protected final String TEXT_1596 = " & ";
  protected final String TEXT_1597 = "_EFLAG) != 0) != ";
  protected final String TEXT_1598 = ";";
  protected final String TEXT_1599 = NL + "\t\treturn ";
  protected final String TEXT_1600 = " != ";
  protected final String TEXT_1601 = ";";
  protected final String TEXT_1602 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1603 = ", ";
  protected final String TEXT_1604 = ") != ";
  protected final String TEXT_1605 = ";";
  protected final String TEXT_1606 = NL + "\t\treturn ";
  protected final String TEXT_1607 = "() != ";
  protected final String TEXT_1608 = ";";
  protected final String TEXT_1609 = NL + "\t\treturn ";
  protected final String TEXT_1610 = " == null ? ";
  protected final String TEXT_1611 = " != null : !";
  protected final String TEXT_1612 = ".equals(";
  protected final String TEXT_1613 = ");";
  protected final String TEXT_1614 = NL + "\t\t";
  protected final String TEXT_1615 = " ";
  protected final String TEXT_1616 = " = (";
  protected final String TEXT_1617 = ")eVirtualGet(";
  protected final String TEXT_1618 = ", ";
  protected final String TEXT_1619 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1620 = " == null ? ";
  protected final String TEXT_1621 = " != null : !";
  protected final String TEXT_1622 = ".equals(";
  protected final String TEXT_1623 = ");";
  protected final String TEXT_1624 = NL + "\t\treturn ";
  protected final String TEXT_1625 = " == null ? ";
  protected final String TEXT_1626 = "() != null : !";
  protected final String TEXT_1627 = ".equals(";
  protected final String TEXT_1628 = "());";
  protected final String TEXT_1629 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1630 = ");";
  protected final String TEXT_1631 = NL + "\t\t";
  protected final String TEXT_1632 = " ";
  protected final String TEXT_1633 = " = (";
  protected final String TEXT_1634 = ")eVirtualGet(";
  protected final String TEXT_1635 = ");";
  protected final String TEXT_1636 = NL + "\t\treturn ";
  protected final String TEXT_1637 = " != null && ((";
  protected final String TEXT_1638 = ".Unsettable";
  protected final String TEXT_1639 = ")";
  protected final String TEXT_1640 = ").isSet();";
  protected final String TEXT_1641 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1642 = ");";
  protected final String TEXT_1643 = NL + "\t\treturn (";
  protected final String TEXT_1644 = " & ";
  protected final String TEXT_1645 = "_ESETFLAG) != 0;";
  protected final String TEXT_1646 = NL + "\t\treturn ";
  protected final String TEXT_1647 = "ESet;";
  protected final String TEXT_1648 = NL + "\t\treturn !((";
  protected final String TEXT_1649 = ".Internal)((";
  protected final String TEXT_1650 = ".Internal.Wrapper)get";
  protected final String TEXT_1651 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1652 = ");";
  protected final String TEXT_1653 = NL + "\t\treturn !((";
  protected final String TEXT_1654 = ".Internal)get";
  protected final String TEXT_1655 = "()).isEmpty(";
  protected final String TEXT_1656 = ");";
  protected final String TEXT_1657 = NL;
  protected final String TEXT_1658 = NL + "\t\treturn ";
  protected final String TEXT_1659 = ".";
  protected final String TEXT_1660 = "(this);";
  protected final String TEXT_1661 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1662 = "' ";
  protected final String TEXT_1663 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1664 = NL + "\t}" + NL;
  protected final String TEXT_1665 = NL;
  protected final String TEXT_1666 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1667 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1668 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1669 = NL + "\t * @model ";
  protected final String TEXT_1670 = NL + "\t *        ";
  protected final String TEXT_1671 = NL + "\t * @model";
  protected final String TEXT_1672 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1673 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1674 = NL + "\t";
  protected final String TEXT_1675 = " ";
  protected final String TEXT_1676 = "(";
  protected final String TEXT_1677 = ")";
  protected final String TEXT_1678 = ";" + NL;
  protected final String TEXT_1679 = NL + "\t@Override";
  protected final String TEXT_1680 = NL + "\tpublic ";
  protected final String TEXT_1681 = " ";
  protected final String TEXT_1682 = "(";
  protected final String TEXT_1683 = ")";
  protected final String TEXT_1684 = NL + "\t{";
  protected final String TEXT_1685 = NL + "\t\t";
  protected final String TEXT_1686 = NL + "\t\treturn ";
  protected final String TEXT_1687 = ".";
  protected final String TEXT_1688 = "(this, ";
  protected final String TEXT_1689 = ", ";
  protected final String TEXT_1690 = ");";
  protected final String TEXT_1691 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1692 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1693 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1694 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1695 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1696 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1697 = ".";
  protected final String TEXT_1698 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1699 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1700 = "\", ";
  protected final String TEXT_1701 = ".getObjectLabel(this, ";
  protected final String TEXT_1702 = ") }),";
  protected final String TEXT_1703 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1704 = NL + "\t\t";
  protected final String TEXT_1705 = ".";
  protected final String TEXT_1706 = "(this";
  protected final String TEXT_1707 = ", ";
  protected final String TEXT_1708 = ");";
  protected final String TEXT_1709 = NL + "\t\t";
  protected final String TEXT_1710 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1711 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1712 = NL + "\t\t\t";
  protected final String TEXT_1713 = " result = (";
  protected final String TEXT_1714 = ") cache.get(";
  protected final String TEXT_1715 = "eResource(), ";
  protected final String TEXT_1716 = "this, ";
  protected final String TEXT_1717 = ".getEOperations().get(";
  protected final String TEXT_1718 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1719 = "eResource(), ";
  protected final String TEXT_1720 = "this, ";
  protected final String TEXT_1721 = ".getEOperations().get(";
  protected final String TEXT_1722 = "), result = ";
  protected final String TEXT_1723 = "new ";
  protected final String TEXT_1724 = "(";
  protected final String TEXT_1725 = ".";
  protected final String TEXT_1726 = "(this";
  protected final String TEXT_1727 = ", ";
  protected final String TEXT_1728 = ")";
  protected final String TEXT_1729 = ")";
  protected final String TEXT_1730 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1731 = ".";
  protected final String TEXT_1732 = "()";
  protected final String TEXT_1733 = ";" + NL + "\t\t}";
  protected final String TEXT_1734 = NL + "\t\treturn ";
  protected final String TEXT_1735 = ".";
  protected final String TEXT_1736 = "(this";
  protected final String TEXT_1737 = ", ";
  protected final String TEXT_1738 = ");";
  protected final String TEXT_1739 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1740 = NL + "\t}" + NL;
  protected final String TEXT_1741 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1742 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1743 = NL + "\t@Override";
  protected final String TEXT_1744 = NL + "\tpublic ";
  protected final String TEXT_1745 = " eInverseAdd(";
  protected final String TEXT_1746 = " otherEnd, int featureID, ";
  protected final String TEXT_1747 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1748 = NL + "\t\t\tcase ";
  protected final String TEXT_1749 = ":";
  protected final String TEXT_1750 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1751 = "(";
  protected final String TEXT_1752 = ".InternalMapView";
  protected final String TEXT_1753 = ")";
  protected final String TEXT_1754 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1755 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1756 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1757 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1758 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1759 = "((";
  protected final String TEXT_1760 = ")otherEnd, msgs);";
  protected final String TEXT_1761 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1762 = ", msgs);";
  protected final String TEXT_1763 = NL + "\t\t\t\t";
  protected final String TEXT_1764 = " ";
  protected final String TEXT_1765 = " = (";
  protected final String TEXT_1766 = ")eVirtualGet(";
  protected final String TEXT_1767 = ");";
  protected final String TEXT_1768 = NL + "\t\t\t\tif (";
  protected final String TEXT_1769 = " != null)";
  protected final String TEXT_1770 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1771 = ")";
  protected final String TEXT_1772 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1773 = ", null, msgs);";
  protected final String TEXT_1774 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1775 = ")";
  protected final String TEXT_1776 = ").eInverseRemove(this, ";
  protected final String TEXT_1777 = ", ";
  protected final String TEXT_1778 = ".class, msgs);";
  protected final String TEXT_1779 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1780 = "((";
  protected final String TEXT_1781 = ")otherEnd, msgs);";
  protected final String TEXT_1782 = NL + "\t\t}";
  protected final String TEXT_1783 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1784 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1785 = NL + "\t}" + NL;
  protected final String TEXT_1786 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1787 = NL + "\t@Override";
  protected final String TEXT_1788 = NL + "\tpublic ";
  protected final String TEXT_1789 = " eInverseRemove(";
  protected final String TEXT_1790 = " otherEnd, int featureID, ";
  protected final String TEXT_1791 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1792 = NL + "\t\t\tcase ";
  protected final String TEXT_1793 = ":";
  protected final String TEXT_1794 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1795 = ")((";
  protected final String TEXT_1796 = ".InternalMapView)";
  protected final String TEXT_1797 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1798 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1799 = ")((";
  protected final String TEXT_1800 = ".Internal.Wrapper)";
  protected final String TEXT_1801 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1802 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1803 = ")";
  protected final String TEXT_1804 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1805 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1806 = ", msgs);";
  protected final String TEXT_1807 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1808 = "(msgs);";
  protected final String TEXT_1809 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1810 = "(null, msgs);";
  protected final String TEXT_1811 = NL + "\t\t}";
  protected final String TEXT_1812 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1813 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1814 = NL + "\t}" + NL;
  protected final String TEXT_1815 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1816 = NL + "\t@Override";
  protected final String TEXT_1817 = NL + "\tpublic ";
  protected final String TEXT_1818 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1819 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1820 = NL + "\t\t\tcase ";
  protected final String TEXT_1821 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1822 = ", ";
  protected final String TEXT_1823 = ".class, msgs);";
  protected final String TEXT_1824 = NL + "\t\t}";
  protected final String TEXT_1825 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1826 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1827 = NL + "\t}" + NL;
  protected final String TEXT_1828 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1829 = NL + "\t@Override";
  protected final String TEXT_1830 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1831 = NL + "\t\t\tcase ";
  protected final String TEXT_1832 = ":";
  protected final String TEXT_1833 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1834 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1835 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1836 = "(";
  protected final String TEXT_1837 = "());";
  protected final String TEXT_1838 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1839 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1840 = "();";
  protected final String TEXT_1841 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1842 = ".InternalMapView)";
  protected final String TEXT_1843 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1844 = "();";
  protected final String TEXT_1845 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1846 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1847 = "().map();";
  protected final String TEXT_1848 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1849 = ".Internal.Wrapper)";
  protected final String TEXT_1850 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1851 = "();";
  protected final String TEXT_1852 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1853 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1854 = ".Internal)";
  protected final String TEXT_1855 = "()).getWrapper();";
  protected final String TEXT_1856 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1857 = "();";
  protected final String TEXT_1858 = NL + "\t\t}";
  protected final String TEXT_1859 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1860 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1861 = NL + "\t}" + NL;
  protected final String TEXT_1862 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1863 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1864 = NL + "\t@Override";
  protected final String TEXT_1865 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1866 = NL + "\t\t\tcase ";
  protected final String TEXT_1867 = ":";
  protected final String TEXT_1868 = NL + "\t\t\t\t((";
  protected final String TEXT_1869 = ".Internal)((";
  protected final String TEXT_1870 = ".Internal.Wrapper)";
  protected final String TEXT_1871 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1872 = NL + "\t\t\t\t((";
  protected final String TEXT_1873 = ".Internal)";
  protected final String TEXT_1874 = "()).set(newValue);";
  protected final String TEXT_1875 = NL + "\t\t\t\t((";
  protected final String TEXT_1876 = ".Setting)((";
  protected final String TEXT_1877 = ".InternalMapView)";
  protected final String TEXT_1878 = "()).eMap()).set(newValue);";
  protected final String TEXT_1879 = NL + "\t\t\t\t((";
  protected final String TEXT_1880 = ".Setting)";
  protected final String TEXT_1881 = "()).set(newValue);";
  protected final String TEXT_1882 = NL + "\t\t\t\t";
  protected final String TEXT_1883 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1884 = "().addAll((";
  protected final String TEXT_1885 = "<? extends ";
  protected final String TEXT_1886 = ">";
  protected final String TEXT_1887 = ")newValue);";
  protected final String TEXT_1888 = NL + "\t\t\t\tset";
  protected final String TEXT_1889 = "(((";
  protected final String TEXT_1890 = ")newValue).";
  protected final String TEXT_1891 = "());";
  protected final String TEXT_1892 = NL + "\t\t\t\tset";
  protected final String TEXT_1893 = "(";
  protected final String TEXT_1894 = "(";
  protected final String TEXT_1895 = ")";
  protected final String TEXT_1896 = "newValue);";
  protected final String TEXT_1897 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1898 = NL + "\t\t}";
  protected final String TEXT_1899 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1900 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1901 = NL + "\t}" + NL;
  protected final String TEXT_1902 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1903 = NL + "\t@Override";
  protected final String TEXT_1904 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1905 = NL + "\t\t\tcase ";
  protected final String TEXT_1906 = ":";
  protected final String TEXT_1907 = NL + "\t\t\t\t((";
  protected final String TEXT_1908 = ".Internal.Wrapper)";
  protected final String TEXT_1909 = "()).featureMap().clear();";
  protected final String TEXT_1910 = NL + "\t\t\t\t";
  protected final String TEXT_1911 = "().clear();";
  protected final String TEXT_1912 = NL + "\t\t\t\tunset";
  protected final String TEXT_1913 = "();";
  protected final String TEXT_1914 = NL + "\t\t\t\tset";
  protected final String TEXT_1915 = "((";
  protected final String TEXT_1916 = ")null);";
  protected final String TEXT_1917 = NL + "\t\t\t\tset";
  protected final String TEXT_1918 = "(";
  protected final String TEXT_1919 = ");";
  protected final String TEXT_1920 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1921 = NL + "\t\t}";
  protected final String TEXT_1922 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1923 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1924 = NL + "\t}" + NL;
  protected final String TEXT_1925 = NL;
  protected final String TEXT_1926 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1927 = NL + "\t@Override";
  protected final String TEXT_1928 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1929 = NL + "\t\t\tcase ";
  protected final String TEXT_1930 = ":";
  protected final String TEXT_1931 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1932 = "();";
  protected final String TEXT_1933 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1934 = ".Internal.Wrapper)";
  protected final String TEXT_1935 = "()).featureMap().isEmpty();";
  protected final String TEXT_1936 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1937 = " != null && !";
  protected final String TEXT_1938 = ".featureMap().isEmpty();";
  protected final String TEXT_1939 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1940 = " != null && !";
  protected final String TEXT_1941 = ".isEmpty();";
  protected final String TEXT_1942 = NL + "\t\t\t\t";
  protected final String TEXT_1943 = " ";
  protected final String TEXT_1944 = " = (";
  protected final String TEXT_1945 = ")eVirtualGet(";
  protected final String TEXT_1946 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1947 = " != null && !";
  protected final String TEXT_1948 = ".isEmpty();";
  protected final String TEXT_1949 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1950 = "().isEmpty();";
  protected final String TEXT_1951 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1952 = "();";
  protected final String TEXT_1953 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1954 = " != null;";
  protected final String TEXT_1955 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1956 = ") != null;";
  protected final String TEXT_1957 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1958 = "() != null;";
  protected final String TEXT_1959 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1960 = " != null;";
  protected final String TEXT_1961 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1962 = ") != null;";
  protected final String TEXT_1963 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1964 = "() != null;";
  protected final String TEXT_1965 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1966 = " & ";
  protected final String TEXT_1967 = "_EFLAG) != 0) != ";
  protected final String TEXT_1968 = ";";
  protected final String TEXT_1969 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1970 = " != ";
  protected final String TEXT_1971 = ";";
  protected final String TEXT_1972 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1973 = ", ";
  protected final String TEXT_1974 = ") != ";
  protected final String TEXT_1975 = ";";
  protected final String TEXT_1976 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1977 = "() != ";
  protected final String TEXT_1978 = ";";
  protected final String TEXT_1979 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1980 = " == null ? ";
  protected final String TEXT_1981 = " != null : !";
  protected final String TEXT_1982 = ".equals(";
  protected final String TEXT_1983 = ");";
  protected final String TEXT_1984 = NL + "\t\t\t\t";
  protected final String TEXT_1985 = " ";
  protected final String TEXT_1986 = " = (";
  protected final String TEXT_1987 = ")eVirtualGet(";
  protected final String TEXT_1988 = ", ";
  protected final String TEXT_1989 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1990 = " == null ? ";
  protected final String TEXT_1991 = " != null : !";
  protected final String TEXT_1992 = ".equals(";
  protected final String TEXT_1993 = ");";
  protected final String TEXT_1994 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1995 = " == null ? ";
  protected final String TEXT_1996 = "() != null : !";
  protected final String TEXT_1997 = ".equals(";
  protected final String TEXT_1998 = "());";
  protected final String TEXT_1999 = NL + "\t\t}";
  protected final String TEXT_2000 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2001 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2002 = NL + "\t}" + NL;
  protected final String TEXT_2003 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2004 = NL + "\t@Override";
  protected final String TEXT_2005 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2006 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2007 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2008 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2009 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2010 = ": return ";
  protected final String TEXT_2011 = ";";
  protected final String TEXT_2012 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2013 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2014 = NL + "\t@Override";
  protected final String TEXT_2015 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2016 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2017 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2018 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2019 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2020 = ": return ";
  protected final String TEXT_2021 = ";";
  protected final String TEXT_2022 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2023 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2024 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2025 = NL + "\t@Override";
  protected final String TEXT_2026 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2027 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2028 = NL + "\t@Override";
  protected final String TEXT_2029 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2030 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2031 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2032 = NL + "\t@Override";
  protected final String TEXT_2033 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2034 = NL + "\t\t\tcase ";
  protected final String TEXT_2035 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2036 = ";";
  protected final String TEXT_2037 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2038 = NL + "\t@Override";
  protected final String TEXT_2039 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2040 = NL + "\t\t\tcase ";
  protected final String TEXT_2041 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2042 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2043 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2044 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2045 = NL + "\t@Override";
  protected final String TEXT_2046 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2047 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2048 = ": \");";
  protected final String TEXT_2049 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2050 = ": \");";
  protected final String TEXT_2051 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2052 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2053 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2054 = NL + "\t\tif (";
  protected final String TEXT_2055 = "(";
  protected final String TEXT_2056 = " & ";
  protected final String TEXT_2057 = "_ESETFLAG) != 0";
  protected final String TEXT_2058 = "ESet";
  protected final String TEXT_2059 = ") result.append((";
  protected final String TEXT_2060 = " & ";
  protected final String TEXT_2061 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2062 = NL + "\t\tif (";
  protected final String TEXT_2063 = "(";
  protected final String TEXT_2064 = " & ";
  protected final String TEXT_2065 = "_ESETFLAG) != 0";
  protected final String TEXT_2066 = "ESet";
  protected final String TEXT_2067 = ") result.append(";
  protected final String TEXT_2068 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2069 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2070 = ", ";
  protected final String TEXT_2071 = "));";
  protected final String TEXT_2072 = NL + "\t\tresult.append((";
  protected final String TEXT_2073 = " & ";
  protected final String TEXT_2074 = "_EFLAG) != 0);";
  protected final String TEXT_2075 = NL + "\t\tresult.append(";
  protected final String TEXT_2076 = ");";
  protected final String TEXT_2077 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2078 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2079 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2080 = " getKey()" + NL + "\t{";
  protected final String TEXT_2081 = NL + "\t\treturn new ";
  protected final String TEXT_2082 = "(getTypedKey());";
  protected final String TEXT_2083 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2084 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2085 = " key)" + NL + "\t{";
  protected final String TEXT_2086 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2087 = "(";
  protected final String TEXT_2088 = ")";
  protected final String TEXT_2089 = "key);";
  protected final String TEXT_2090 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2091 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2092 = ")key).";
  protected final String TEXT_2093 = "());";
  protected final String TEXT_2094 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2095 = ")key);";
  protected final String TEXT_2096 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2097 = " getValue()" + NL + "\t{";
  protected final String TEXT_2098 = NL + "\t\treturn new ";
  protected final String TEXT_2099 = "(getTypedValue());";
  protected final String TEXT_2100 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2101 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2102 = " setValue(";
  protected final String TEXT_2103 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2104 = " oldValue = getValue();";
  protected final String TEXT_2105 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2106 = "(";
  protected final String TEXT_2107 = ")";
  protected final String TEXT_2108 = "value);";
  protected final String TEXT_2109 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2110 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2111 = ")value).";
  protected final String TEXT_2112 = "());";
  protected final String TEXT_2113 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2114 = ")value);";
  protected final String TEXT_2115 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2116 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2117 = NL + "\tpublic ";
  protected final String TEXT_2118 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2119 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2120 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2121 = NL;
  protected final String TEXT_2122 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2123 = " create(";
  protected final String TEXT_2124 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2125 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2126 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2127 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2128 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2129 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2130 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2131 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2132 = NL + "\t@Override";
  protected final String TEXT_2133 = NL + "\tprotected ";
  protected final String TEXT_2134 = " ";
  protected final String TEXT_2135 = "Helper(";
  protected final String TEXT_2136 = " ";
  protected final String TEXT_2137 = ")" + NL + "\t{";
  protected final String TEXT_2138 = NL + "\t\t";
  protected final String TEXT_2139 = ".addAll(super.";
  protected final String TEXT_2140 = "());";
  protected final String TEXT_2141 = NL + "\t\tsuper.";
  protected final String TEXT_2142 = "Helper(";
  protected final String TEXT_2143 = ");";
  protected final String TEXT_2144 = NL + "\t\tif (isSet";
  protected final String TEXT_2145 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2146 = "<";
  protected final String TEXT_2147 = ">";
  protected final String TEXT_2148 = " i = ((";
  protected final String TEXT_2149 = ") ";
  protected final String TEXT_2150 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2151 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2152 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2153 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2154 = "<";
  protected final String TEXT_2155 = ">";
  protected final String TEXT_2156 = " i = ((";
  protected final String TEXT_2157 = ") ";
  protected final String TEXT_2158 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2159 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2160 = NL + "\t\t";
  protected final String TEXT_2161 = " ";
  protected final String TEXT_2162 = " = ";
  protected final String TEXT_2163 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2164 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2165 = "<";
  protected final String TEXT_2166 = ">";
  protected final String TEXT_2167 = " i = ((";
  protected final String TEXT_2168 = ") ";
  protected final String TEXT_2169 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2170 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2171 = NL + "\t\tif (isSet";
  protected final String TEXT_2172 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2173 = ".addAll(";
  protected final String TEXT_2174 = "());" + NL + "\t\t}";
  protected final String TEXT_2175 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2176 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2177 = ".addAll(";
  protected final String TEXT_2178 = "());" + NL + "\t\t}";
  protected final String TEXT_2179 = NL + "\t\t";
  protected final String TEXT_2180 = " ";
  protected final String TEXT_2181 = " = ";
  protected final String TEXT_2182 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2183 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2184 = ".addAll(";
  protected final String TEXT_2185 = ");" + NL + "\t\t}";
  protected final String TEXT_2186 = NL + "\t\tif (isSet";
  protected final String TEXT_2187 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2188 = ".add(";
  protected final String TEXT_2189 = "basicGet";
  protected final String TEXT_2190 = "());" + NL + "\t\t}";
  protected final String TEXT_2191 = NL + "\t\t";
  protected final String TEXT_2192 = " ";
  protected final String TEXT_2193 = " = ";
  protected final String TEXT_2194 = "basicGet";
  protected final String TEXT_2195 = "();" + NL + "\t\tif (";
  protected final String TEXT_2196 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2197 = ".add(";
  protected final String TEXT_2198 = ");" + NL + "\t\t}";
  protected final String TEXT_2199 = NL + "\t\treturn ";
  protected final String TEXT_2200 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2201 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2202 = NL + "\t@Override";
  protected final String TEXT_2203 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2204 = "()" + NL + "\t{";
  protected final String TEXT_2205 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2206 = "()";
  protected final String TEXT_2207 = NL + "\t\treturn isSet";
  protected final String TEXT_2208 = "()";
  protected final String TEXT_2209 = ";";
  protected final String TEXT_2210 = NL + "\t\treturn !";
  protected final String TEXT_2211 = "().isEmpty()";
  protected final String TEXT_2212 = ";";
  protected final String TEXT_2213 = NL + "\t\treturn ";
  protected final String TEXT_2214 = "basicGet";
  protected final String TEXT_2215 = "() != null";
  protected final String TEXT_2216 = ";";
  protected final String TEXT_2217 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2218 = ")";
  protected final String TEXT_2219 = ";";
  protected final String TEXT_2220 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2221 = "()";
  protected final String TEXT_2222 = ";";
  protected final String TEXT_2223 = NL + "\t\t\t|| !";
  protected final String TEXT_2224 = "().isEmpty()";
  protected final String TEXT_2225 = ";";
  protected final String TEXT_2226 = NL + "\t\t\t|| ";
  protected final String TEXT_2227 = "basicGet";
  protected final String TEXT_2228 = "() != null";
  protected final String TEXT_2229 = ";";
  protected final String TEXT_2230 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2231 = ")";
  protected final String TEXT_2232 = ";";
  protected final String TEXT_2233 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2234 = "();";
  protected final String TEXT_2235 = NL + "\t\treturn false;";
  protected final String TEXT_2236 = NL + "\t}" + NL;
  protected final String TEXT_2237 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2238 = NL + "\t@Override";
  protected final String TEXT_2239 = NL + "\tpublic ";
  protected final String TEXT_2240 = " ";
  protected final String TEXT_2241 = "()" + NL + "\t{";
  protected final String TEXT_2242 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2243 = " ";
  protected final String TEXT_2244 = " = (";
  protected final String TEXT_2245 = ")((";
  protected final String TEXT_2246 = ")";
  protected final String TEXT_2247 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2248 = ";";
  protected final String TEXT_2249 = NL + "\t\treturn ";
  protected final String TEXT_2250 = "();";
  protected final String TEXT_2251 = NL + "\t\treturn new ";
  protected final String TEXT_2252 = ".UnmodifiableEList";
  protected final String TEXT_2253 = "(this, ";
  protected final String TEXT_2254 = "null";
  protected final String TEXT_2255 = ", 0, ";
  protected final String TEXT_2256 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2257 = NL + "\t\treturn null;";
  protected final String TEXT_2258 = NL + "\t\treturn ";
  protected final String TEXT_2259 = "();";
  protected final String TEXT_2260 = NL + "\t}" + NL;
  protected final String TEXT_2261 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2262 = NL + "\t@Override";
  protected final String TEXT_2263 = NL + "\tpublic ";
  protected final String TEXT_2264 = " basicGet";
  protected final String TEXT_2265 = "()" + NL + "\t{";
  protected final String TEXT_2266 = NL + "\t\treturn null;";
  protected final String TEXT_2267 = NL + "\t\treturn ";
  protected final String TEXT_2268 = "basicGet";
  protected final String TEXT_2269 = "();";
  protected final String TEXT_2270 = NL + "\t}" + NL;
  protected final String TEXT_2271 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2272 = NL + "\t@Override";
  protected final String TEXT_2273 = NL + "\tpublic ";
  protected final String TEXT_2274 = " basicSet";
  protected final String TEXT_2275 = "(";
  protected final String TEXT_2276 = " new";
  protected final String TEXT_2277 = ", ";
  protected final String TEXT_2278 = " msgs)" + NL + "\t{";
  protected final String TEXT_2279 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2280 = NL + "\t\tif (new";
  protected final String TEXT_2281 = " != null && !(new";
  protected final String TEXT_2282 = " instanceof ";
  protected final String TEXT_2283 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2284 = "));" + NL + "\t\t}";
  protected final String TEXT_2285 = NL + "\t\treturn basicSet";
  protected final String TEXT_2286 = "(";
  protected final String TEXT_2287 = "(";
  protected final String TEXT_2288 = ") ";
  protected final String TEXT_2289 = "new";
  protected final String TEXT_2290 = ", msgs);";
  protected final String TEXT_2291 = NL + "\t\tset";
  protected final String TEXT_2292 = "(";
  protected final String TEXT_2293 = "(";
  protected final String TEXT_2294 = ") ";
  protected final String TEXT_2295 = "new";
  protected final String TEXT_2296 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2297 = NL + "\t}" + NL;
  protected final String TEXT_2298 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2299 = NL + "\t@Override";
  protected final String TEXT_2300 = NL + "\tpublic void set";
  protected final String TEXT_2301 = "(";
  protected final String TEXT_2302 = " new";
  protected final String TEXT_2303 = ")" + NL + "\t{";
  protected final String TEXT_2304 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2305 = NL + "\t\tif (new";
  protected final String TEXT_2306 = " != null && !(new";
  protected final String TEXT_2307 = " instanceof ";
  protected final String TEXT_2308 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2309 = "));" + NL + "\t\t}";
  protected final String TEXT_2310 = NL + "\t\tset";
  protected final String TEXT_2311 = "(";
  protected final String TEXT_2312 = "(";
  protected final String TEXT_2313 = ") ";
  protected final String TEXT_2314 = "new";
  protected final String TEXT_2315 = ");";
  protected final String TEXT_2316 = NL + "\t}" + NL;
  protected final String TEXT_2317 = NL;
  protected final String TEXT_2318 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2319 = "() <em>";
  protected final String TEXT_2320 = "</em>}' ";
  protected final String TEXT_2321 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2322 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2323 = "_ESUBSETS = ";
  protected final String TEXT_2324 = ";" + NL;
  protected final String TEXT_2325 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2326 = "() <em>";
  protected final String TEXT_2327 = "</em>}' ";
  protected final String TEXT_2328 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2329 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2330 = "_ESUPERSETS = ";
  protected final String TEXT_2331 = ";" + NL;
  protected final String TEXT_2332 = NL + "\t/**";
  protected final String TEXT_2333 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2334 = "}, with the specified ";
  protected final String TEXT_2335 = ", and appends it to the '<em><b>";
  protected final String TEXT_2336 = "</b></em>' ";
  protected final String TEXT_2337 = ".";
  protected final String TEXT_2338 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2339 = "}, with the specified ";
  protected final String TEXT_2340 = ", and sets the '<em><b>";
  protected final String TEXT_2341 = "</b></em>' ";
  protected final String TEXT_2342 = ".";
  protected final String TEXT_2343 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2344 = "} and appends it to the '<em><b>";
  protected final String TEXT_2345 = "</b></em>' ";
  protected final String TEXT_2346 = ".";
  protected final String TEXT_2347 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2348 = "} and sets the '<em><b>";
  protected final String TEXT_2349 = "</b></em>' ";
  protected final String TEXT_2350 = ".";
  protected final String TEXT_2351 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2352 = NL + "\t * @param ";
  protected final String TEXT_2353 = " The ";
  protected final String TEXT_2354 = " for the new {@link ";
  protected final String TEXT_2355 = "}, or <code>null</code>.";
  protected final String TEXT_2356 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2357 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2358 = "}." + NL + "\t * @see #";
  protected final String TEXT_2359 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2360 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2361 = NL + "\t";
  protected final String TEXT_2362 = " create";
  protected final String TEXT_2363 = "(";
  protected final String TEXT_2364 = ", ";
  protected final String TEXT_2365 = " eClass);" + NL;
  protected final String TEXT_2366 = NL + "\t@Override";
  protected final String TEXT_2367 = NL + "\tpublic ";
  protected final String TEXT_2368 = " create";
  protected final String TEXT_2369 = "(";
  protected final String TEXT_2370 = ", ";
  protected final String TEXT_2371 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2372 = " new";
  protected final String TEXT_2373 = " = (";
  protected final String TEXT_2374 = ") create(eClass);";
  protected final String TEXT_2375 = NL + "\t\t";
  protected final String TEXT_2376 = "().add(new";
  protected final String TEXT_2377 = ");";
  protected final String TEXT_2378 = NL + "\t\tset";
  protected final String TEXT_2379 = "(new";
  protected final String TEXT_2380 = ");";
  protected final String TEXT_2381 = NL + "\t\tint ";
  protected final String TEXT_2382 = "ListSize = 0;";
  protected final String TEXT_2383 = NL + "\t\tint ";
  protected final String TEXT_2384 = "Size = ";
  protected final String TEXT_2385 = " == null ? 0 : ";
  protected final String TEXT_2386 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2387 = "Size > ";
  protected final String TEXT_2388 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2389 = "ListSize = ";
  protected final String TEXT_2390 = "Size;";
  protected final String TEXT_2391 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2392 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2393 = ".create";
  protected final String TEXT_2394 = "(";
  protected final String TEXT_2395 = ", ";
  protected final String TEXT_2396 = "i < ";
  protected final String TEXT_2397 = "Size ? (";
  protected final String TEXT_2398 = ") ";
  protected final String TEXT_2399 = ".get(i) : null";
  protected final String TEXT_2400 = ");" + NL + "\t\t}";
  protected final String TEXT_2401 = NL + "\t\tnew";
  protected final String TEXT_2402 = ".create";
  protected final String TEXT_2403 = "(";
  protected final String TEXT_2404 = ", ";
  protected final String TEXT_2405 = ");";
  protected final String TEXT_2406 = NL + "\t\tif (";
  protected final String TEXT_2407 = " != null)";
  protected final String TEXT_2408 = NL + "\t\t\tnew";
  protected final String TEXT_2409 = ".";
  protected final String TEXT_2410 = "().addAll(";
  protected final String TEXT_2411 = ");";
  protected final String TEXT_2412 = NL + "\t\t\tnew";
  protected final String TEXT_2413 = ".set";
  protected final String TEXT_2414 = "(";
  protected final String TEXT_2415 = ");";
  protected final String TEXT_2416 = NL + "\t\treturn new";
  protected final String TEXT_2417 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2418 = NL + "\t/**";
  protected final String TEXT_2419 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2420 = "}, with the specified ";
  protected final String TEXT_2421 = ", and appends it to the '<em><b>";
  protected final String TEXT_2422 = "</b></em>' ";
  protected final String TEXT_2423 = ".";
  protected final String TEXT_2424 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2425 = "},with the specified ";
  protected final String TEXT_2426 = ", and sets the '<em><b>";
  protected final String TEXT_2427 = "</b></em>' ";
  protected final String TEXT_2428 = ".";
  protected final String TEXT_2429 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2430 = "} and appends it to the '<em><b>";
  protected final String TEXT_2431 = "</b></em>' ";
  protected final String TEXT_2432 = ".";
  protected final String TEXT_2433 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2434 = "} and sets the '<em><b>";
  protected final String TEXT_2435 = "</b></em>' ";
  protected final String TEXT_2436 = ".";
  protected final String TEXT_2437 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2438 = NL + "\t * @param ";
  protected final String TEXT_2439 = " The ";
  protected final String TEXT_2440 = " for the new {@link ";
  protected final String TEXT_2441 = "}, or <code>null</code>.";
  protected final String TEXT_2442 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2443 = "}." + NL + "\t * @see #";
  protected final String TEXT_2444 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2445 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2446 = NL + "\t";
  protected final String TEXT_2447 = " create";
  protected final String TEXT_2448 = "(";
  protected final String TEXT_2449 = ");" + NL;
  protected final String TEXT_2450 = NL + "\t@Override";
  protected final String TEXT_2451 = NL + "\tpublic ";
  protected final String TEXT_2452 = " create";
  protected final String TEXT_2453 = "(";
  protected final String TEXT_2454 = ")" + NL + "\t{";
  protected final String TEXT_2455 = NL + "\t\treturn create";
  protected final String TEXT_2456 = "(";
  protected final String TEXT_2457 = ", ";
  protected final String TEXT_2458 = ");";
  protected final String TEXT_2459 = NL + "\t\t";
  protected final String TEXT_2460 = " new";
  protected final String TEXT_2461 = " = (";
  protected final String TEXT_2462 = ") create(";
  protected final String TEXT_2463 = ");";
  protected final String TEXT_2464 = NL + "\t\t";
  protected final String TEXT_2465 = "().add(new";
  protected final String TEXT_2466 = ");";
  protected final String TEXT_2467 = NL + "\t\tset";
  protected final String TEXT_2468 = "(new";
  protected final String TEXT_2469 = ");";
  protected final String TEXT_2470 = NL + "\t\tint ";
  protected final String TEXT_2471 = "ListSize = 0;";
  protected final String TEXT_2472 = NL + "\t\tint ";
  protected final String TEXT_2473 = "Size = ";
  protected final String TEXT_2474 = " == null ? 0 : ";
  protected final String TEXT_2475 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2476 = "Size > ";
  protected final String TEXT_2477 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2478 = "ListSize = ";
  protected final String TEXT_2479 = "Size;";
  protected final String TEXT_2480 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2481 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2482 = ".create";
  protected final String TEXT_2483 = "(";
  protected final String TEXT_2484 = ", ";
  protected final String TEXT_2485 = "i < ";
  protected final String TEXT_2486 = "Size ? (";
  protected final String TEXT_2487 = ") ";
  protected final String TEXT_2488 = ".get(i) : null";
  protected final String TEXT_2489 = ");" + NL + "\t\t}";
  protected final String TEXT_2490 = NL + "\t\tnew";
  protected final String TEXT_2491 = ".create";
  protected final String TEXT_2492 = "(";
  protected final String TEXT_2493 = ", ";
  protected final String TEXT_2494 = ");";
  protected final String TEXT_2495 = NL + "\t\tif (";
  protected final String TEXT_2496 = " != null)";
  protected final String TEXT_2497 = NL + "\t\t\tnew";
  protected final String TEXT_2498 = ".";
  protected final String TEXT_2499 = "().addAll(";
  protected final String TEXT_2500 = ");";
  protected final String TEXT_2501 = NL + "\t\t\tnew";
  protected final String TEXT_2502 = ".set";
  protected final String TEXT_2503 = "(";
  protected final String TEXT_2504 = ");";
  protected final String TEXT_2505 = NL + "\t\treturn new";
  protected final String TEXT_2506 = ";";
  protected final String TEXT_2507 = NL + "\t}" + NL;
  protected final String TEXT_2508 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2509 = "} with the specified ";
  protected final String TEXT_2510 = " from the '<em><b>";
  protected final String TEXT_2511 = "</b></em>' ";
  protected final String TEXT_2512 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2513 = NL + "\t * @param ";
  protected final String TEXT_2514 = " The ";
  protected final String TEXT_2515 = " of the {@link ";
  protected final String TEXT_2516 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2517 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2518 = "} with the specified ";
  protected final String TEXT_2519 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2520 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2521 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2522 = NL + "\t";
  protected final String TEXT_2523 = " get";
  protected final String TEXT_2524 = "(";
  protected final String TEXT_2525 = ");" + NL;
  protected final String TEXT_2526 = NL + "\t@Override";
  protected final String TEXT_2527 = NL + "\tpublic ";
  protected final String TEXT_2528 = " get";
  protected final String TEXT_2529 = "(";
  protected final String TEXT_2530 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2531 = "(";
  protected final String TEXT_2532 = ", false";
  protected final String TEXT_2533 = ", null";
  protected final String TEXT_2534 = ", false";
  protected final String TEXT_2535 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2536 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2537 = "} with the specified ";
  protected final String TEXT_2538 = " from the '<em><b>";
  protected final String TEXT_2539 = "</b></em>' ";
  protected final String TEXT_2540 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2541 = NL + "\t * @param ";
  protected final String TEXT_2542 = " The ";
  protected final String TEXT_2543 = " of the {@link ";
  protected final String TEXT_2544 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2545 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2546 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2547 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2548 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2549 = "} on demand if not found.";
  protected final String TEXT_2550 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2551 = "} with the specified ";
  protected final String TEXT_2552 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2553 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2554 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2555 = NL + "\t";
  protected final String TEXT_2556 = " get";
  protected final String TEXT_2557 = "(";
  protected final String TEXT_2558 = ", boolean ignoreCase";
  protected final String TEXT_2559 = ", ";
  protected final String TEXT_2560 = " eClass";
  protected final String TEXT_2561 = ", boolean createOnDemand";
  protected final String TEXT_2562 = ");" + NL;
  protected final String TEXT_2563 = NL + "\t@Override";
  protected final String TEXT_2564 = NL + "\tpublic ";
  protected final String TEXT_2565 = " get";
  protected final String TEXT_2566 = "(";
  protected final String TEXT_2567 = ", boolean ignoreCase";
  protected final String TEXT_2568 = ", ";
  protected final String TEXT_2569 = " eClass";
  protected final String TEXT_2570 = ", boolean createOnDemand";
  protected final String TEXT_2571 = ")" + NL + "\t{";
  protected final String TEXT_2572 = NL + "\t\t";
  protected final String TEXT_2573 = "Loop: for (";
  protected final String TEXT_2574 = " ";
  protected final String TEXT_2575 = " : ";
  protected final String TEXT_2576 = "())" + NL + "\t\t{";
  protected final String TEXT_2577 = NL + "\t\t";
  protected final String TEXT_2578 = "Loop: for (";
  protected final String TEXT_2579 = " i = ";
  protected final String TEXT_2580 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2581 = " ";
  protected final String TEXT_2582 = " = (";
  protected final String TEXT_2583 = ") i.next();";
  protected final String TEXT_2584 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2585 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2586 = "Loop;";
  protected final String TEXT_2587 = NL + "\t\t\t";
  protected final String TEXT_2588 = " ";
  protected final String TEXT_2589 = "List = ";
  protected final String TEXT_2590 = ".";
  protected final String TEXT_2591 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2592 = "ListSize = ";
  protected final String TEXT_2593 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2594 = " || (";
  protected final String TEXT_2595 = " != null && ";
  protected final String TEXT_2596 = ".size() != ";
  protected final String TEXT_2597 = "ListSize";
  protected final String TEXT_2598 = ")";
  protected final String TEXT_2599 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2600 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2601 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2602 = " ";
  protected final String TEXT_2603 = " = ";
  protected final String TEXT_2604 = "(";
  protected final String TEXT_2605 = ") ";
  protected final String TEXT_2606 = "List.get(j);";
  protected final String TEXT_2607 = NL + "\t\t\t\tif (";
  protected final String TEXT_2608 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2609 = "(";
  protected final String TEXT_2610 = ")";
  protected final String TEXT_2611 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2612 = ".";
  protected final String TEXT_2613 = "()) : ";
  protected final String TEXT_2614 = ".get(j).equals(";
  protected final String TEXT_2615 = ".";
  protected final String TEXT_2616 = "())))";
  protected final String TEXT_2617 = NL + "\t\t\t\tif (";
  protected final String TEXT_2618 = " != null && !";
  protected final String TEXT_2619 = ".get(j).equals(";
  protected final String TEXT_2620 = ".";
  protected final String TEXT_2621 = "()))";
  protected final String TEXT_2622 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2623 = "Loop;";
  protected final String TEXT_2624 = NL + "\t\t\t}";
  protected final String TEXT_2625 = NL + "\t\t\t";
  protected final String TEXT_2626 = " ";
  protected final String TEXT_2627 = " = ";
  protected final String TEXT_2628 = ".";
  protected final String TEXT_2629 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2630 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2631 = "Loop;";
  protected final String TEXT_2632 = NL + "\t\t\tif (";
  protected final String TEXT_2633 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2634 = ".equalsIgnoreCase(";
  protected final String TEXT_2635 = ".";
  protected final String TEXT_2636 = "()) : ";
  protected final String TEXT_2637 = ".equals(";
  protected final String TEXT_2638 = ".";
  protected final String TEXT_2639 = "())))";
  protected final String TEXT_2640 = NL + "\t\t\tif (";
  protected final String TEXT_2641 = " != null && !";
  protected final String TEXT_2642 = ".equals(";
  protected final String TEXT_2643 = ".";
  protected final String TEXT_2644 = "()))";
  protected final String TEXT_2645 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2646 = "Loop;";
  protected final String TEXT_2647 = NL + "\t\t\tif (";
  protected final String TEXT_2648 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2649 = ".equalsIgnoreCase(";
  protected final String TEXT_2650 = ".";
  protected final String TEXT_2651 = "()) : ";
  protected final String TEXT_2652 = ".equals(";
  protected final String TEXT_2653 = ".";
  protected final String TEXT_2654 = "())))";
  protected final String TEXT_2655 = NL + "\t\t\tif (";
  protected final String TEXT_2656 = " != null && !";
  protected final String TEXT_2657 = ".equals(";
  protected final String TEXT_2658 = ".";
  protected final String TEXT_2659 = "()))";
  protected final String TEXT_2660 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2661 = "Loop;";
  protected final String TEXT_2662 = NL + "\t\t\treturn ";
  protected final String TEXT_2663 = ";" + NL + "\t\t}";
  protected final String TEXT_2664 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2665 = " && eClass != null";
  protected final String TEXT_2666 = " ? create";
  protected final String TEXT_2667 = "(";
  protected final String TEXT_2668 = ", eClass";
  protected final String TEXT_2669 = ") : null;";
  protected final String TEXT_2670 = NL + "\t\treturn null;";
  protected final String TEXT_2671 = NL + "\t}" + NL;
  protected final String TEXT_2672 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2673 = NL + "\t@Override";
  protected final String TEXT_2674 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2675 = "()" + NL + "\t{";
  protected final String TEXT_2676 = NL + "  \t\treturn false;";
  protected final String TEXT_2677 = NL + "\t\treturn !((";
  protected final String TEXT_2678 = ".Internal.Wrapper)";
  protected final String TEXT_2679 = "()).featureMap().isEmpty();";
  protected final String TEXT_2680 = NL + "\t\treturn ";
  protected final String TEXT_2681 = " != null && !";
  protected final String TEXT_2682 = ".featureMap().isEmpty();";
  protected final String TEXT_2683 = NL + "\t\treturn ";
  protected final String TEXT_2684 = " != null && !";
  protected final String TEXT_2685 = ".isEmpty();";
  protected final String TEXT_2686 = NL + "\t\t";
  protected final String TEXT_2687 = " ";
  protected final String TEXT_2688 = " = (";
  protected final String TEXT_2689 = ")eVirtualGet(";
  protected final String TEXT_2690 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2691 = " != null && !";
  protected final String TEXT_2692 = ".isEmpty();";
  protected final String TEXT_2693 = NL + "\t\treturn !";
  protected final String TEXT_2694 = "().isEmpty();";
  protected final String TEXT_2695 = NL + "\t\treturn ";
  protected final String TEXT_2696 = " != null;";
  protected final String TEXT_2697 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2698 = ") != null;";
  protected final String TEXT_2699 = NL + "\t\treturn basicGet";
  protected final String TEXT_2700 = "() != null;";
  protected final String TEXT_2701 = NL + "\t\treturn ";
  protected final String TEXT_2702 = " != null;";
  protected final String TEXT_2703 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2704 = ") != null;";
  protected final String TEXT_2705 = NL + "\t\treturn ";
  protected final String TEXT_2706 = "() != null;";
  protected final String TEXT_2707 = NL + "\t\treturn ((";
  protected final String TEXT_2708 = " & ";
  protected final String TEXT_2709 = "_EFLAG) != 0) != ";
  protected final String TEXT_2710 = ";";
  protected final String TEXT_2711 = NL + "\t\treturn ";
  protected final String TEXT_2712 = " != ";
  protected final String TEXT_2713 = ";";
  protected final String TEXT_2714 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2715 = ", ";
  protected final String TEXT_2716 = ") != ";
  protected final String TEXT_2717 = ";";
  protected final String TEXT_2718 = NL + "\t\treturn ";
  protected final String TEXT_2719 = "() != ";
  protected final String TEXT_2720 = ";";
  protected final String TEXT_2721 = NL + "\t\treturn ";
  protected final String TEXT_2722 = " == null ? ";
  protected final String TEXT_2723 = " != null : !";
  protected final String TEXT_2724 = ".equals(";
  protected final String TEXT_2725 = ");";
  protected final String TEXT_2726 = NL + "\t\t";
  protected final String TEXT_2727 = " ";
  protected final String TEXT_2728 = " = (";
  protected final String TEXT_2729 = ")eVirtualGet(";
  protected final String TEXT_2730 = ", ";
  protected final String TEXT_2731 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2732 = " == null ? ";
  protected final String TEXT_2733 = " != null : !";
  protected final String TEXT_2734 = ".equals(";
  protected final String TEXT_2735 = ");";
  protected final String TEXT_2736 = NL + "\t\treturn ";
  protected final String TEXT_2737 = " == null ? ";
  protected final String TEXT_2738 = "() != null : !";
  protected final String TEXT_2739 = ".equals(";
  protected final String TEXT_2740 = "());";
  protected final String TEXT_2741 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2742 = ");";
  protected final String TEXT_2743 = NL + "\t\t";
  protected final String TEXT_2744 = " ";
  protected final String TEXT_2745 = " = (";
  protected final String TEXT_2746 = ")eVirtualGet(";
  protected final String TEXT_2747 = ");";
  protected final String TEXT_2748 = NL + "\t\treturn ";
  protected final String TEXT_2749 = " != null && ((";
  protected final String TEXT_2750 = ".Unsettable";
  protected final String TEXT_2751 = ")";
  protected final String TEXT_2752 = ").isSet();";
  protected final String TEXT_2753 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2754 = ");";
  protected final String TEXT_2755 = NL + "\t\treturn (";
  protected final String TEXT_2756 = " & ";
  protected final String TEXT_2757 = "_ESETFLAG) != 0;";
  protected final String TEXT_2758 = NL + "\t\treturn ";
  protected final String TEXT_2759 = "ESet;";
  protected final String TEXT_2760 = NL + "\t\treturn !((";
  protected final String TEXT_2761 = ".Internal)((";
  protected final String TEXT_2762 = ".Internal.Wrapper)get";
  protected final String TEXT_2763 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2764 = ");";
  protected final String TEXT_2765 = NL + "\t\treturn !((";
  protected final String TEXT_2766 = ".Internal)get";
  protected final String TEXT_2767 = "()).isEmpty(";
  protected final String TEXT_2768 = ");";
  protected final String TEXT_2769 = NL;
  protected final String TEXT_2770 = NL + "\t\treturn ";
  protected final String TEXT_2771 = ".";
  protected final String TEXT_2772 = "(this);";
  protected final String TEXT_2773 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2774 = "' ";
  protected final String TEXT_2775 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2776 = NL + "\t}" + NL;
  protected final String TEXT_2777 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2778 = NL + "\t@Override";
  protected final String TEXT_2779 = NL + "\tpublic ";
  protected final String TEXT_2780 = " ";
  protected final String TEXT_2781 = "(";
  protected final String TEXT_2782 = ")";
  protected final String TEXT_2783 = NL + "\t{";
  protected final String TEXT_2784 = NL + "\t\t";
  protected final String TEXT_2785 = "(";
  protected final String TEXT_2786 = ");";
  protected final String TEXT_2787 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2788 = NL + "\t\treturn ";
  protected final String TEXT_2789 = "(";
  protected final String TEXT_2790 = ");";
  protected final String TEXT_2791 = NL + "\t}" + NL;
  protected final String TEXT_2792 = NL + "} //";
  protected final String TEXT_2793 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
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
    for (Iterator i=genClass.getGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
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
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
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
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (Iterator i = eVirtualIndexBitFields.iterator(); i.hasNext();) { String eVirtualIndexBitField = (String)i.next();
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
    for (Iterator i=genClass.getDeclaredFieldGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
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
    stringBuffer.append(genFeature.getRawImportedType());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_82);
    } else {
    stringBuffer.append(TEXT_83);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_85);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_87);
    }
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_94);
    } else {
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_102);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_104);
    }
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_109);
    } else {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_113);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_115);
    for (Iterator i=genClass.getFlagGenFeatures("true").iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_118);
    }
    stringBuffer.append(TEXT_119);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_123);
    }
    new Runnable() { public void run() {
    for (Iterator i=(isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures()).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_124);
    if (!isImplementation) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_127);
    } else {
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_130);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_135);
    } else {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_145);
    if (!isImplementation) {
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_148);
    } else {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_153);
    }
    stringBuffer.append(TEXT_154);
    if (!isImplementation) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_156);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_160);
    } else {
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_163);
    }
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    if (!isImplementation) {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_169);
    } else {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_177);
    }
    stringBuffer.append(TEXT_178);
    if (!isImplementation) {
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_181);
    } else {
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_185);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_188);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_189);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_191);
    } else {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_194);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_196);
    } else {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(TEXT_199);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_201);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_203);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_205);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_206);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_209);
    }
    }
    stringBuffer.append(TEXT_210);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_213);
    }
    stringBuffer.append(TEXT_214);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_216);
    }
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_219);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_222);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_224);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_227);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_230);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_233);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_235);
    }}
    stringBuffer.append(TEXT_236);
    } else {
    stringBuffer.append(TEXT_237);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_240);
    } else {
    if (genModel.useGenerics() && genFeature.isResolveProxies() && !genFeature.isListType() && !genFeature.isContainer() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_244);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_245);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_246);
    }
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_249);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_259);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_266);
    }
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_268);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_271);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_277);
    }
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_289);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_294);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_298);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_302);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_303);
    }
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_305);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_308);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_311);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_312);
    }
    stringBuffer.append(TEXT_313);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_316);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_322);
    }
    stringBuffer.append(TEXT_323);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_327);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_332);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_342);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_346);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_349);
    } else {
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_351);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_354);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_358);
    } else {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_361);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_362);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_363);
    }
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_366);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_368);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_370);
    }
    stringBuffer.append(TEXT_371);
    } else {
    stringBuffer.append(TEXT_372);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_373);
    }
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getObjectType());
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
    }
    }
    } else {
    stringBuffer.append(TEXT_381);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_383);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_387);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_390);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_391);
    }
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_393);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_395);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_397);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_398);
    }
    stringBuffer.append(TEXT_399);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_401);
    }
    stringBuffer.append(TEXT_402);
    }
    stringBuffer.append(TEXT_403);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_405);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_408);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_409);
    }
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_419);
    }
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_421);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_423);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_427);
    }
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_437);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_438);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_441);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_442);
    }
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_454);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_455);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_457);
    }
    stringBuffer.append(TEXT_458);
    }
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_463);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_464);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_465);
    }
    } else {
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_468);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_471);
    } else {
    stringBuffer.append(TEXT_472);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_474);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_477);
    }
    }
    }
    }
    stringBuffer.append(TEXT_478);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_480);
    } else {
    stringBuffer.append(TEXT_481);
    }
    stringBuffer.append(TEXT_482);
    }
    } else {
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_485);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_486);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_489);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_492);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_495);
    } else {
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_497);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_502);
    } else {
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_506);
    }
    } else {
    stringBuffer.append(TEXT_507);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_508);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_510);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_512);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_514);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_516);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_517);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_518);
    } else {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_521);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_523);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_525);
    }
    }
    }
    }
    stringBuffer.append(TEXT_526);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_528);
    } else {
    stringBuffer.append(TEXT_529);
    }
    stringBuffer.append(TEXT_530);
    } else {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_533);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_534);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_540);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(TEXT_545);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_547);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_551);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_554);
    }
    stringBuffer.append(TEXT_555);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_559);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_561);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_570);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_573);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_576);
    }
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_581);
    }
    stringBuffer.append(TEXT_582);
    }
    stringBuffer.append(TEXT_583);
    }
    stringBuffer.append(TEXT_584);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_588);
    } else {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_594);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_596);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_602);
    } else {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_606);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_607);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_612);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_616);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_617);
    } else {
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_619);
    }
    stringBuffer.append(TEXT_620);
    } else {
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_625);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_631);
    }
    stringBuffer.append(TEXT_632);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_634);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_635);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_637);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_638);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_639);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_641);
    }
    stringBuffer.append(TEXT_642);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_645);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_646);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_648);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_656);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_657);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_660);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_663);
    }
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_668);
    }
    stringBuffer.append(TEXT_669);
    }
    stringBuffer.append(TEXT_670);
    }
    stringBuffer.append(TEXT_671);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_677);
    } else {
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_679);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_682);
    }
    } else {
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_685);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_686);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_693);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_696);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_698);
    }
    }
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_700);
    } else {
    stringBuffer.append(TEXT_701);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_704);
    } else {
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(TEXT_709);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_714);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_716);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_718);
    }
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_720);
    }
    stringBuffer.append(TEXT_721);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_739);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_745);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_755);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_763);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_767);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_772);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_773);
    }
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_777);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_778);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_781);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_785);
    }
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_788);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_791);
    }
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_793);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    }
    stringBuffer.append(TEXT_801);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_807);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_812);
    }
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_818);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_822);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    } else {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_833);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    } else {
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_842);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_846);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_848);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_852);
    }
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_855);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_858);
    }
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_860);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_864);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_868);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_870);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_871);
    } else {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_873);
    }
    stringBuffer.append(TEXT_874);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_878);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_883);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_885);
    }
    }
    }
    stringBuffer.append(TEXT_886);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_887);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_889);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_890);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_891);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_893);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_894);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_896);
    }
    stringBuffer.append(TEXT_897);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_900);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_901);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_903);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_911);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_912);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_915);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_918);
    }
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_923);
    }
    stringBuffer.append(TEXT_924);
    }
    stringBuffer.append(TEXT_925);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_928);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_930);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_932);
    }
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_934);
    }
    stringBuffer.append(TEXT_935);
    } else {
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_939);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_941);
    }
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_943);
    }
    stringBuffer.append(TEXT_944);
    }
    } else {
    stringBuffer.append(TEXT_945);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_946);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_949);
    } else {
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_952);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_953);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_957);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_960);
    } else {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_965);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_967);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_973);
    } else {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_977);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_982);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_984);
    } else {
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_986);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_987);
    } else {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_989);
    }
    stringBuffer.append(TEXT_990);
    }
    } else {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_993);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_994);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_999);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1001);
    }
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1003);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1006);
    }
    stringBuffer.append(TEXT_1007);
    } else {
    stringBuffer.append(TEXT_1008);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1010);
    } else {
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1012);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1014);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1019);
    }
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1024);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1029);
    }
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1032);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1036);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1041);
    }
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1043);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1046);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1050);
    }
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1053);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1056);
    }
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1058);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1063);
    }
    stringBuffer.append(TEXT_1064);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1069);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1072);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1076);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1078);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getCapName());
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
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1087);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1090);
    } else {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1092);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1096);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1098);
    } else {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1100);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1101);
    } else {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1103);
    }
    stringBuffer.append(TEXT_1104);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1110);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1113);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1116);
    } else {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1118);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1122);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1127);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1128);
    } else {
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1130);
    }
    stringBuffer.append(TEXT_1131);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1136);
    } else {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1140);
    }
    } else {
    stringBuffer.append(TEXT_1141);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1144);
    } else {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1147);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1148);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1155);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1157);
    }
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1159);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1162);
    }
    stringBuffer.append(TEXT_1163);
    } else {
    stringBuffer.append(TEXT_1164);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1166);
    } else {
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1168);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1170);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1175);
    }
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1180);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1182);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1185);
    } else {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1187);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1192);
    } else {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1196);
    }
    } else {
    stringBuffer.append(TEXT_1197);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1200);
    } else {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1203);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1204);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1205);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1212);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1219);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1220);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1225);
    } else {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1230);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1234);
    } else {
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1238);
    }
    }
    stringBuffer.append(TEXT_1239);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1243);
    }
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1247);
    } else {
    stringBuffer.append(TEXT_1248);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1251);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1252);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1253);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1254);
    }
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1257);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1258);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1262);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1265);
    } else {
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1268);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1270);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1278);
    }
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1282);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1283);
    }
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1287);
    }
    stringBuffer.append(TEXT_1288);
    } else {
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1291);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1292);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1293);
    }
    } else {
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1295);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1299);
    } else {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1303);
    }
    }
    }
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1305);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1306);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1311);
    } else {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1316);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1320);
    } else {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1324);
    }
    }
    stringBuffer.append(TEXT_1325);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1329);
    }
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1332);
    } else {
    stringBuffer.append(TEXT_1333);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1337);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1338);
    }
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1342);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1344);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1345);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1346);
    } else {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1351);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1354);
    } else {
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1357);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1359);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1367);
    }
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1371);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1372);
    }
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1376);
    }
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1380);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1381);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1382);
    }
    } else {
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1384);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1388);
    } else {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1392);
    }
    }
    }
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1394);
    }
    stringBuffer.append(TEXT_1395);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1400);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1404);
    }
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1408);
    } else {
    stringBuffer.append(TEXT_1409);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1413);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1414);
    }
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1420);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1421);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1422);
    }
    stringBuffer.append(TEXT_1423);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1428);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1432);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1433);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1435);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1437);
    }
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1441);
    } else {
    stringBuffer.append(TEXT_1442);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1446);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1448);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1449);
    }
    stringBuffer.append(TEXT_1450);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1451);
    }
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1455);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1457);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1458);
    }
    stringBuffer.append(TEXT_1459);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1464);
    } else {
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1471);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1474);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1481);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1482);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1485);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1486);
    }
    }
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1491);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1493);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1494);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1496);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1498);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1504);
    } else {
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1509);
    }
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1511);
    }
    stringBuffer.append(TEXT_1512);
    } else {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1519);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1527);
    } else {
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1532);
    }
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1534);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1542);
    } else {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1547);
    }
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1549);
    }
    }
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1551);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1552);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1553);
    }
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1556);
    }
    stringBuffer.append(TEXT_1557);
    } else {
    stringBuffer.append(TEXT_1558);
    }
    stringBuffer.append(TEXT_1559);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1560);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1561);
    }
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1563);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1564);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1567);
    } else {
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1570);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1573);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1580);
    } else {
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1582);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1584);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1586);
    } else {
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1588);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1590);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1592);
    } else {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1594);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1598);
    } else {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1601);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1605);
    } else {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1608);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1613);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1623);
    } else {
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1628);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1630);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1635);
    }
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1640);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1642);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1645);
    } else {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1647);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1652);
    } else {
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1656);
    }
    } else {
    stringBuffer.append(TEXT_1657);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1660);
    } else {
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1663);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1664);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1665);
    if (isInterface) {
    stringBuffer.append(TEXT_1666);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1668);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1671);
    }}
    stringBuffer.append(TEXT_1672);
    } else {
    stringBuffer.append(TEXT_1673);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1678);
    } else {
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenOperations().contains(genOperation)) {
    stringBuffer.append(TEXT_1679);
    }
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1684);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1690);
    } else {
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1703);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1706);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1708);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1710);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1711);
    }
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1714);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1715);
    }
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1718);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1719);
    }
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1722);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1724);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1726);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1728);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1729);
    }
    stringBuffer.append(TEXT_1730);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1732);
    }
    stringBuffer.append(TEXT_1733);
    }
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1736);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1738);
    }
    } else {
    stringBuffer.append(TEXT_1739);
    }
    }
    stringBuffer.append(TEXT_1740);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1741);
    if (genModel.useGenerics()) {
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1742);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1743);
    }
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1747);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1749);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1754);
    } else {
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1756);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1757);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1760);
    } else {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1762);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1767);
    }
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1769);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1773);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1778);
    }
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1781);
    }
    }
    stringBuffer.append(TEXT_1782);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1783);
    } else {
    stringBuffer.append(TEXT_1784);
    }
    stringBuffer.append(TEXT_1785);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1786);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1787);
    }
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1791);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1793);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1797);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1801);
    } else {
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1804);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1806);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1808);
    } else {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1810);
    }
    }
    stringBuffer.append(TEXT_1811);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1812);
    } else {
    stringBuffer.append(TEXT_1813);
    }
    stringBuffer.append(TEXT_1814);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1815);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1816);
    }
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1819);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1823);
    }
    stringBuffer.append(TEXT_1824);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1825);
    } else {
    stringBuffer.append(TEXT_1826);
    }
    stringBuffer.append(TEXT_1827);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1828);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1829);
    }
    stringBuffer.append(TEXT_1830);
    for (Iterator i=genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenFeatures().iterator() : genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1832);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1834);
    } else {
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1837);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1840);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1844);
    } else {
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1847);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1851);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1855);
    } else {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1857);
    }
    }
    stringBuffer.append(TEXT_1858);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1859);
    } else {
    stringBuffer.append(TEXT_1860);
    }
    stringBuffer.append(TEXT_1861);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1862);
    if (genModel.useGenerics()) {
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1863);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1864);
    }
    stringBuffer.append(TEXT_1865);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1867);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1871);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1874);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1878);
    } else {
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1881);
    }
    } else {
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1886);
    }
    stringBuffer.append(TEXT_1887);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1891);
    } else {
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1893);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType())) {
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1895);
    }
    stringBuffer.append(TEXT_1896);
    }
    stringBuffer.append(TEXT_1897);
    }
    stringBuffer.append(TEXT_1898);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1899);
    } else {
    stringBuffer.append(TEXT_1900);
    }
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(TEXT_1902);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1903);
    }
    stringBuffer.append(TEXT_1904);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1906);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1909);
    } else {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1911);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1913);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1916);
    } else {
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1919);
    }
    stringBuffer.append(TEXT_1920);
    }
    stringBuffer.append(TEXT_1921);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1922);
    } else {
    stringBuffer.append(TEXT_1923);
    }
    stringBuffer.append(TEXT_1924);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(TEXT_1926);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1927);
    }
    stringBuffer.append(TEXT_1928);
    for (Iterator i=genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenFeatures().iterator() : genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1930);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1932);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
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
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genFeature.getImportedType());
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
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1952);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1954);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1956);
    } else {
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1958);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1960);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1962);
    } else {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1964);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1968);
    } else {
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1971);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1975);
    } else {
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1978);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1983);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1993);
    } else {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1998);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1999);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2000);
    } else {
    stringBuffer.append(TEXT_2001);
    }
    stringBuffer.append(TEXT_2002);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2003);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2004);
    }
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2006);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2008);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2011);
    }
    stringBuffer.append(TEXT_2012);
    }
    stringBuffer.append(TEXT_2013);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2014);
    }
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2016);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2018);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2021);
    }
    stringBuffer.append(TEXT_2022);
    }
    stringBuffer.append(TEXT_2023);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2024);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2025);
    }
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2027);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2028);
    }
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2030);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_2031);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2032);
    }
    stringBuffer.append(TEXT_2033);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2036);
    }
    stringBuffer.append(TEXT_2037);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2038);
    }
    stringBuffer.append(TEXT_2039);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2042);
    }
    stringBuffer.append(TEXT_2043);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2044);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2045);
    }
    stringBuffer.append(TEXT_2046);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2054);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2057);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2058);
    }
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2062);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2065);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2066);
    }
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2071);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2074);
    } else {
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2076);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2077);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType() : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType() : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2080);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2082);
    } else {
    stringBuffer.append(TEXT_2083);
    }
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2085);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2086);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2088);
    }
    stringBuffer.append(TEXT_2089);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2090);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2093);
    } else {
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_2095);
    }
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2097);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2099);
    } else {
    stringBuffer.append(TEXT_2100);
    }
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2104);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2105);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2107);
    }
    stringBuffer.append(TEXT_2108);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2109);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2112);
    } else {
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_2114);
    }
    stringBuffer.append(TEXT_2115);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2116);
    }
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2120);
    }
    stringBuffer.append(TEXT_2121);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genModel)) {
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2125);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2130);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2131);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2132);
    }
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2137);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2140);
    } else {
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2143);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2147);
    }
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2151);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2155);
    }
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2159);
    } else {
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2166);
    }
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2170);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2174);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2178);
    } else {
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2185);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2188);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2190);
    } else {
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2193);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2198);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2200);
    }
    }
    }
    stringBuffer.append(TEXT_2201);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2202);
    }
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2204);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2206);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2208);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2209);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2211);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2212);
    }
    } else {
    stringBuffer.append(TEXT_2213);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2215);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2216);
    }
    }
    } else {
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2218);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2219);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2221);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2222);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2224);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2225);
    }
    } else {
    stringBuffer.append(TEXT_2226);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2228);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2229);
    }
    }
    } else {
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2231);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2232);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2234);
    } else {
    stringBuffer.append(TEXT_2235);
    }
    }
    stringBuffer.append(TEXT_2236);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2237);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2238);
    }
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2241);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType().equals(genFeature.getListItemType())) {
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2248);
    } else {
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2250);
    }
    } else {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2252);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType() + ">");
    }
    stringBuffer.append(TEXT_2253);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2254);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2256);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2257);
    } else {
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2259);
    }
    }
    stringBuffer.append(TEXT_2260);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2261);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2262);
    }
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2265);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2266);
    } else {
    stringBuffer.append(TEXT_2267);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2269);
    }
    stringBuffer.append(TEXT_2270);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2271);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2272);
    }
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2278);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2279);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2284);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2286);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2288);
    }
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2290);
    } else {
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2292);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2294);
    }
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2296);
    }
    }
    stringBuffer.append(TEXT_2297);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2298);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2299);
    }
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2303);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2304);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2309);
    }
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2311);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2313);
    }
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2315);
    }
    stringBuffer.append(TEXT_2316);
    }
    stringBuffer.append(TEXT_2317);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2324);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2331);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2332);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2337);
    } else {
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2342);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2346);
    } else {
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2350);
    }
    }
    stringBuffer.append(TEXT_2351);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2355);
    }
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2359);
    } else {
    stringBuffer.append(TEXT_2360);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2363);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2364);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2365);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2366);
    }
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2369);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2370);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2374);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2377);
    } else {
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2380);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2382);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2390);
    }
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2394);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2395);
    }
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2399);
    }
    stringBuffer.append(TEXT_2400);
    } else {
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2403);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2404);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2405);
    }
    } else {
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2407);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2411);
    } else {
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2415);
    }
    }
    }
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2417);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2418);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2423);
    } else {
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2428);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2432);
    } else {
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2436);
    }
    }
    stringBuffer.append(TEXT_2437);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2441);
    }
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2444);
    } else {
    stringBuffer.append(TEXT_2445);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2449);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2450);
    }
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2454);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2456);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2457);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2458);
    } else {
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2463);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2466);
    } else {
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2469);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2471);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2479);
    }
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2483);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2484);
    }
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2488);
    }
    stringBuffer.append(TEXT_2489);
    } else {
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2492);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2493);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2494);
    }
    } else {
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2496);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2500);
    } else {
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2504);
    }
    }
    }
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2506);
    }
    stringBuffer.append(TEXT_2507);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2512);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2516);
    }
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2520);
    } else {
    stringBuffer.append(TEXT_2521);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2525);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2526);
    }
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2532);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2533);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2534);
    }
    stringBuffer.append(TEXT_2535);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2540);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2544);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2545);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2547);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2549);
    }
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2553);
    } else {
    stringBuffer.append(TEXT_2554);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2558);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2560);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2561);
    }
    stringBuffer.append(TEXT_2562);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2563);
    }
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2567);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2569);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2570);
    }
    stringBuffer.append(TEXT_2571);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2576);
    } else {
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2583);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2586);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2593);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2594);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2597);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2598);
    }
    }
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2603);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2605);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2606);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2608);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2610);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2616);
    } else {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2621);
    }
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2623);
    }
    stringBuffer.append(TEXT_2624);
    } else {
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2631);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2639);
    } else {
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2644);
    }
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2646);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2654);
    } else {
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2659);
    }
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2661);
    }
    }
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2663);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2664);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2665);
    }
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2668);
    }
    stringBuffer.append(TEXT_2669);
    } else {
    stringBuffer.append(TEXT_2670);
    }
    stringBuffer.append(TEXT_2671);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2672);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2673);
    }
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2675);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2676);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2679);
    } else {
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2682);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2685);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2692);
    } else {
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2694);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2696);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2698);
    } else {
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2700);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2702);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2704);
    } else {
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2706);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2710);
    } else {
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2713);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2717);
    } else {
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2720);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2725);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2735);
    } else {
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2740);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2742);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2747);
    }
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2752);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2754);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2757);
    } else {
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2759);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2764);
    } else {
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2768);
    }
    } else {
    stringBuffer.append(TEXT_2769);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2772);
    } else {
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2775);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2776);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2777);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genOperation) && !UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_2778);
    }
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2783);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2786);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2787);
    } else {
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2790);
    }
    }
    stringBuffer.append(TEXT_2791);
    }
    }
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2793);
    return stringBuffer.toString();
  }
}
