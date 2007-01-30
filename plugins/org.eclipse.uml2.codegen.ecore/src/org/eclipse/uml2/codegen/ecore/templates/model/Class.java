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
  protected final String TEXT_115 = "ESet = false;" + NL;
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
  protected final String TEXT_127 = NL + "\t";
  protected final String TEXT_128 = "[] ";
  protected final String TEXT_129 = "();" + NL;
  protected final String TEXT_130 = NL + "\tpublic ";
  protected final String TEXT_131 = "[] ";
  protected final String TEXT_132 = "()" + NL + "\t{";
  protected final String TEXT_133 = NL + "\t\t";
  protected final String TEXT_134 = " list = (";
  protected final String TEXT_135 = ")";
  protected final String TEXT_136 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_137 = "_EEMPTY_ARRAY;";
  protected final String TEXT_138 = NL + "\t\tif (";
  protected final String TEXT_139 = " == null || ";
  protected final String TEXT_140 = ".isEmpty()) return ";
  protected final String TEXT_141 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_142 = " list = (";
  protected final String TEXT_143 = ")";
  protected final String TEXT_144 = ";";
  protected final String TEXT_145 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_146 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_147 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_148 = NL + "\t";
  protected final String TEXT_149 = " get";
  protected final String TEXT_150 = "(int index);" + NL;
  protected final String TEXT_151 = NL + "\tpublic ";
  protected final String TEXT_152 = " get";
  protected final String TEXT_153 = "(int index)" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_154 = ")";
  protected final String TEXT_155 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_156 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_157 = NL + "\tint get";
  protected final String TEXT_158 = "Length();" + NL;
  protected final String TEXT_159 = NL + "\tpublic int get";
  protected final String TEXT_160 = "Length()" + NL + "\t{";
  protected final String TEXT_161 = NL + "\t\treturn ";
  protected final String TEXT_162 = "().size();";
  protected final String TEXT_163 = NL + "\t\treturn ";
  protected final String TEXT_164 = " == null ? 0 : ";
  protected final String TEXT_165 = ".size();";
  protected final String TEXT_166 = NL + "\t}" + NL;
  protected final String TEXT_167 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_168 = NL + "\tvoid set";
  protected final String TEXT_169 = "(";
  protected final String TEXT_170 = "[] new";
  protected final String TEXT_171 = ");" + NL;
  protected final String TEXT_172 = NL + "\tpublic void set";
  protected final String TEXT_173 = "(";
  protected final String TEXT_174 = "[] new";
  protected final String TEXT_175 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_176 = ")";
  protected final String TEXT_177 = "()).setData(new";
  protected final String TEXT_178 = ".length, new";
  protected final String TEXT_179 = ");" + NL + "\t}" + NL;
  protected final String TEXT_180 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_181 = NL + "\tvoid set";
  protected final String TEXT_182 = "(int index, ";
  protected final String TEXT_183 = " element);" + NL;
  protected final String TEXT_184 = NL + "\tpublic void set";
  protected final String TEXT_185 = "(int index, ";
  protected final String TEXT_186 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_187 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_188 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_189 = "</b></em>' ";
  protected final String TEXT_190 = ".";
  protected final String TEXT_191 = NL + "\t * The key is of type ";
  protected final String TEXT_192 = "list of {@link ";
  protected final String TEXT_193 = "}";
  protected final String TEXT_194 = "{@link ";
  protected final String TEXT_195 = "}";
  protected final String TEXT_196 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_197 = "list of {@link ";
  protected final String TEXT_198 = "}";
  protected final String TEXT_199 = "{@link ";
  protected final String TEXT_200 = "}";
  protected final String TEXT_201 = ",";
  protected final String TEXT_202 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_203 = "}.";
  protected final String TEXT_204 = NL + "\t * The default value is <code>";
  protected final String TEXT_205 = "</code>.";
  protected final String TEXT_206 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_207 = "}.";
  protected final String TEXT_208 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_209 = "#";
  protected final String TEXT_210 = " <em>";
  protected final String TEXT_211 = "</em>}'.";
  protected final String TEXT_212 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_213 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_214 = "</em>' ";
  protected final String TEXT_215 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_216 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_217 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_218 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_219 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_220 = "</em>' ";
  protected final String TEXT_221 = ".";
  protected final String TEXT_222 = NL + "\t * @see ";
  protected final String TEXT_223 = NL + "\t * @see #isSet";
  protected final String TEXT_224 = "()";
  protected final String TEXT_225 = NL + "\t * @see #unset";
  protected final String TEXT_226 = "()";
  protected final String TEXT_227 = NL + "\t * @see #set";
  protected final String TEXT_228 = "(";
  protected final String TEXT_229 = ")";
  protected final String TEXT_230 = NL + "\t * @see ";
  protected final String TEXT_231 = "#get";
  protected final String TEXT_232 = "()";
  protected final String TEXT_233 = NL + "\t * @see ";
  protected final String TEXT_234 = "#";
  protected final String TEXT_235 = NL + "\t * @model ";
  protected final String TEXT_236 = NL + "\t *        ";
  protected final String TEXT_237 = NL + "\t * @model";
  protected final String TEXT_238 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_239 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_240 = NL + "\t";
  protected final String TEXT_241 = " ";
  protected final String TEXT_242 = "();" + NL;
  protected final String TEXT_243 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_244 = NL + "\tpublic ";
  protected final String TEXT_245 = " ";
  protected final String TEXT_246 = "()" + NL + "\t{";
  protected final String TEXT_247 = NL + "\t\treturn ";
  protected final String TEXT_248 = "(";
  protected final String TEXT_249 = "(";
  protected final String TEXT_250 = ")eGet(";
  protected final String TEXT_251 = ", true)";
  protected final String TEXT_252 = ").";
  protected final String TEXT_253 = "()";
  protected final String TEXT_254 = ";";
  protected final String TEXT_255 = NL + "\t\t";
  protected final String TEXT_256 = " ";
  protected final String TEXT_257 = " = (";
  protected final String TEXT_258 = ")eVirtualGet(";
  protected final String TEXT_259 = ");";
  protected final String TEXT_260 = NL + "\t\tif (";
  protected final String TEXT_261 = " == null)" + NL + "\t\t{";
  protected final String TEXT_262 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_263 = ", ";
  protected final String TEXT_264 = " = new ";
  protected final String TEXT_265 = ");";
  protected final String TEXT_266 = NL + "\t\t\t";
  protected final String TEXT_267 = " = new ";
  protected final String TEXT_268 = ";";
  protected final String TEXT_269 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_270 = ";";
  protected final String TEXT_271 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_272 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_273 = ")eContainer();";
  protected final String TEXT_274 = NL + "\t\t";
  protected final String TEXT_275 = " ";
  protected final String TEXT_276 = " = (";
  protected final String TEXT_277 = ")eVirtualGet(";
  protected final String TEXT_278 = ", ";
  protected final String TEXT_279 = ");";
  protected final String TEXT_280 = NL + "\t\tif (";
  protected final String TEXT_281 = " != null && ";
  protected final String TEXT_282 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_283 = " old";
  protected final String TEXT_284 = " = (";
  protected final String TEXT_285 = ")";
  protected final String TEXT_286 = ";" + NL + "\t\t\t";
  protected final String TEXT_287 = " = ";
  protected final String TEXT_288 = "eResolveProxy(old";
  protected final String TEXT_289 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_290 = " != old";
  protected final String TEXT_291 = ")" + NL + "\t\t\t{";
  protected final String TEXT_292 = NL + "\t\t\t\t";
  protected final String TEXT_293 = " new";
  protected final String TEXT_294 = " = (";
  protected final String TEXT_295 = ")";
  protected final String TEXT_296 = ";";
  protected final String TEXT_297 = NL + "\t\t\t\t";
  protected final String TEXT_298 = " msgs = old";
  protected final String TEXT_299 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_300 = ", null, null);";
  protected final String TEXT_301 = NL + "\t\t\t\t";
  protected final String TEXT_302 = " msgs =  old";
  protected final String TEXT_303 = ".eInverseRemove(this, ";
  protected final String TEXT_304 = ", ";
  protected final String TEXT_305 = ".class, null);";
  protected final String TEXT_306 = NL + "\t\t\t\tif (new";
  protected final String TEXT_307 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_308 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_309 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_310 = ", null, msgs);";
  protected final String TEXT_311 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_312 = ".eInverseAdd(this, ";
  protected final String TEXT_313 = ", ";
  protected final String TEXT_314 = ".class, msgs);";
  protected final String TEXT_315 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_316 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_317 = ", ";
  protected final String TEXT_318 = ");";
  protected final String TEXT_319 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_320 = "(this, ";
  protected final String TEXT_321 = ".RESOLVE, ";
  protected final String TEXT_322 = ", old";
  protected final String TEXT_323 = ", ";
  protected final String TEXT_324 = "));";
  protected final String TEXT_325 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_326 = NL + "\t\treturn (";
  protected final String TEXT_327 = ")eVirtualGet(";
  protected final String TEXT_328 = ", ";
  protected final String TEXT_329 = ");";
  protected final String TEXT_330 = NL + "\t\treturn (";
  protected final String TEXT_331 = " & ";
  protected final String TEXT_332 = "_EFLAG) != 0;";
  protected final String TEXT_333 = NL + "\t\treturn ";
  protected final String TEXT_334 = ";";
  protected final String TEXT_335 = NL + "\t\t";
  protected final String TEXT_336 = " ";
  protected final String TEXT_337 = " = basicGet";
  protected final String TEXT_338 = "();" + NL + "\t\treturn ";
  protected final String TEXT_339 = " != null && ";
  protected final String TEXT_340 = ".eIsProxy() ? ";
  protected final String TEXT_341 = "eResolveProxy((";
  protected final String TEXT_342 = ")";
  protected final String TEXT_343 = ") : ";
  protected final String TEXT_344 = ";";
  protected final String TEXT_345 = NL + "\t\treturn new ";
  protected final String TEXT_346 = "((";
  protected final String TEXT_347 = ".Internal)((";
  protected final String TEXT_348 = ".Internal.Wrapper)get";
  protected final String TEXT_349 = "()).featureMap().";
  protected final String TEXT_350 = "list(";
  protected final String TEXT_351 = "));";
  protected final String TEXT_352 = NL + "\t\treturn (";
  protected final String TEXT_353 = ")get";
  protected final String TEXT_354 = "().";
  protected final String TEXT_355 = "list(";
  protected final String TEXT_356 = ");";
  protected final String TEXT_357 = NL + "\t\treturn ((";
  protected final String TEXT_358 = ".Internal.Wrapper)get";
  protected final String TEXT_359 = "()).featureMap().list(";
  protected final String TEXT_360 = ");";
  protected final String TEXT_361 = NL + "\t\treturn get";
  protected final String TEXT_362 = "().list(";
  protected final String TEXT_363 = ");";
  protected final String TEXT_364 = NL + "\t\treturn ";
  protected final String TEXT_365 = "(";
  protected final String TEXT_366 = "(";
  protected final String TEXT_367 = ")";
  protected final String TEXT_368 = "((";
  protected final String TEXT_369 = ".Internal.Wrapper)get";
  protected final String TEXT_370 = "()).featureMap().get(";
  protected final String TEXT_371 = ", true)";
  protected final String TEXT_372 = ").";
  protected final String TEXT_373 = "()";
  protected final String TEXT_374 = ";";
  protected final String TEXT_375 = NL + "\t\treturn ";
  protected final String TEXT_376 = "(";
  protected final String TEXT_377 = "(";
  protected final String TEXT_378 = ")";
  protected final String TEXT_379 = "get";
  protected final String TEXT_380 = "().get(";
  protected final String TEXT_381 = ", true)";
  protected final String TEXT_382 = ").";
  protected final String TEXT_383 = "()";
  protected final String TEXT_384 = ";";
  protected final String TEXT_385 = NL;
  protected final String TEXT_386 = NL + "\t\t";
  protected final String TEXT_387 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_388 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_389 = NL + "\t\t\t";
  protected final String TEXT_390 = " result = (";
  protected final String TEXT_391 = ") cache.get(";
  protected final String TEXT_392 = "eResource(), ";
  protected final String TEXT_393 = "this, ";
  protected final String TEXT_394 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_395 = "eResource(), ";
  protected final String TEXT_396 = "this, ";
  protected final String TEXT_397 = ", result = ";
  protected final String TEXT_398 = "new ";
  protected final String TEXT_399 = "(";
  protected final String TEXT_400 = ".";
  protected final String TEXT_401 = "(this)";
  protected final String TEXT_402 = ")";
  protected final String TEXT_403 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_404 = ".";
  protected final String TEXT_405 = "()";
  protected final String TEXT_406 = ";" + NL + "\t\t}";
  protected final String TEXT_407 = NL + "\t\treturn ";
  protected final String TEXT_408 = ".";
  protected final String TEXT_409 = "(this);";
  protected final String TEXT_410 = NL + "\t\t";
  protected final String TEXT_411 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_412 = " eResource = eResource();";
  protected final String TEXT_413 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_414 = NL + "\t\t\t";
  protected final String TEXT_415 = " ";
  protected final String TEXT_416 = " = (";
  protected final String TEXT_417 = ") cache.get(eResource, this, ";
  protected final String TEXT_418 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_419 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_420 = ", ";
  protected final String TEXT_421 = " = new ";
  protected final String TEXT_422 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_423 = ";" + NL + "\t\t}";
  protected final String TEXT_424 = NL + "\t\treturn new ";
  protected final String TEXT_425 = ";";
  protected final String TEXT_426 = NL + "\t\t";
  protected final String TEXT_427 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_428 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_429 = " method = getClass().getMethod(\"";
  protected final String TEXT_430 = "\", null);";
  protected final String TEXT_431 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_432 = NL + "\t\t\t\t";
  protected final String TEXT_433 = " ";
  protected final String TEXT_434 = " = (";
  protected final String TEXT_435 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_436 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_437 = " union = ";
  protected final String TEXT_438 = "Helper(new ";
  protected final String TEXT_439 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_440 = " = new ";
  protected final String TEXT_441 = "(this, ";
  protected final String TEXT_442 = "null";
  protected final String TEXT_443 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_444 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_445 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_446 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_447 = NL + "\t\t\t";
  protected final String TEXT_448 = " ";
  protected final String TEXT_449 = " = (";
  protected final String TEXT_450 = ") cache.get(eResource(), this, ";
  protected final String TEXT_451 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_452 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_453 = " union = ";
  protected final String TEXT_454 = "Helper(new ";
  protected final String TEXT_455 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_456 = ", ";
  protected final String TEXT_457 = " = new ";
  protected final String TEXT_458 = "(this, ";
  protected final String TEXT_459 = "null";
  protected final String TEXT_460 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_461 = ";";
  protected final String TEXT_462 = NL + "\t\t}";
  protected final String TEXT_463 = NL + "\t\t";
  protected final String TEXT_464 = " union = ";
  protected final String TEXT_465 = "Helper(new ";
  protected final String TEXT_466 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_467 = "(this, ";
  protected final String TEXT_468 = "null";
  protected final String TEXT_469 = ", union.size(), union.toArray());";
  protected final String TEXT_470 = NL + "\t\tif (isSet";
  protected final String TEXT_471 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_472 = "();" + NL + "\t\t}";
  protected final String TEXT_473 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_474 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_475 = "();" + NL + "\t\t}";
  protected final String TEXT_476 = NL + "\t\t";
  protected final String TEXT_477 = " ";
  protected final String TEXT_478 = " = ";
  protected final String TEXT_479 = "();" + NL + "\t\tif (";
  protected final String TEXT_480 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_481 = ";" + NL + "\t\t}";
  protected final String TEXT_482 = NL + "\t\treturn ";
  protected final String TEXT_483 = "super.";
  protected final String TEXT_484 = "()";
  protected final String TEXT_485 = "null";
  protected final String TEXT_486 = ";";
  protected final String TEXT_487 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_488 = "' ";
  protected final String TEXT_489 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_490 = NL + "\t}" + NL;
  protected final String TEXT_491 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_492 = " basicGet";
  protected final String TEXT_493 = "()" + NL + "\t{";
  protected final String TEXT_494 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_495 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_496 = ")eInternalContainer();";
  protected final String TEXT_497 = NL + "\t\treturn (";
  protected final String TEXT_498 = ")eVirtualGet(";
  protected final String TEXT_499 = ");";
  protected final String TEXT_500 = NL + "\t\treturn ";
  protected final String TEXT_501 = ";";
  protected final String TEXT_502 = NL + "\t\treturn (";
  protected final String TEXT_503 = ")((";
  protected final String TEXT_504 = ".Internal.Wrapper)get";
  protected final String TEXT_505 = "()).featureMap().get(";
  protected final String TEXT_506 = ", false);";
  protected final String TEXT_507 = NL + "\t\treturn (";
  protected final String TEXT_508 = ")get";
  protected final String TEXT_509 = "().get(";
  protected final String TEXT_510 = ", false);";
  protected final String TEXT_511 = NL;
  protected final String TEXT_512 = NL + "\t\treturn ";
  protected final String TEXT_513 = ".";
  protected final String TEXT_514 = "(this);";
  protected final String TEXT_515 = NL + "\t\tif (isSet";
  protected final String TEXT_516 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_517 = "basicGet";
  protected final String TEXT_518 = "();" + NL + "\t\t}";
  protected final String TEXT_519 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_520 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_521 = "basicGet";
  protected final String TEXT_522 = "();" + NL + "\t\t}";
  protected final String TEXT_523 = NL + "\t\t";
  protected final String TEXT_524 = " ";
  protected final String TEXT_525 = " = ";
  protected final String TEXT_526 = "basicGet";
  protected final String TEXT_527 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_528 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_529 = ";" + NL + "\t\t}";
  protected final String TEXT_530 = NL + "\t\treturn ";
  protected final String TEXT_531 = "super.basicGet";
  protected final String TEXT_532 = "()";
  protected final String TEXT_533 = "null";
  protected final String TEXT_534 = ";";
  protected final String TEXT_535 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_536 = "' ";
  protected final String TEXT_537 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_538 = NL + "\t}" + NL;
  protected final String TEXT_539 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_540 = " basicSet";
  protected final String TEXT_541 = "(";
  protected final String TEXT_542 = " new";
  protected final String TEXT_543 = ", ";
  protected final String TEXT_544 = " msgs)" + NL + "\t{";
  protected final String TEXT_545 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_546 = ")new";
  protected final String TEXT_547 = ", ";
  protected final String TEXT_548 = ", msgs);";
  protected final String TEXT_549 = NL;
  protected final String TEXT_550 = NL + "\t\t";
  protected final String TEXT_551 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_552 = NL + "\t\t\t";
  protected final String TEXT_553 = " ";
  protected final String TEXT_554 = " = ";
  protected final String TEXT_555 = "();";
  protected final String TEXT_556 = NL + "\t\t\tObject ";
  protected final String TEXT_557 = " = eVirtualGet(";
  protected final String TEXT_558 = ");";
  protected final String TEXT_559 = NL + "\t\t\tif (";
  protected final String TEXT_560 = " != null && ";
  protected final String TEXT_561 = " != new";
  protected final String TEXT_562 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_563 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_564 = NL + "\t\t\tif (new";
  protected final String TEXT_565 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_566 = NL + "\t\t\t\t";
  protected final String TEXT_567 = " ";
  protected final String TEXT_568 = " = ";
  protected final String TEXT_569 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_570 = ".contains(new";
  protected final String TEXT_571 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_572 = ".add(new";
  protected final String TEXT_573 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_574 = NL + "\t\t\t\t";
  protected final String TEXT_575 = " ";
  protected final String TEXT_576 = " = ";
  protected final String TEXT_577 = "();";
  protected final String TEXT_578 = NL + "\t\t\t\tObject ";
  protected final String TEXT_579 = " = eVirtualGet(";
  protected final String TEXT_580 = ");";
  protected final String TEXT_581 = NL + "\t\t\t\tif (new";
  protected final String TEXT_582 = " != ";
  protected final String TEXT_583 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_584 = "(new";
  protected final String TEXT_585 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_586 = NL + "\t\t\t}";
  protected final String TEXT_587 = NL + "\t\t}";
  protected final String TEXT_588 = NL + "\t\treturn msgs;";
  protected final String TEXT_589 = NL + "\t\tObject old";
  protected final String TEXT_590 = " = eVirtualSet(";
  protected final String TEXT_591 = ", new";
  protected final String TEXT_592 = ");";
  protected final String TEXT_593 = NL + "\t\t";
  protected final String TEXT_594 = " old";
  protected final String TEXT_595 = " = ";
  protected final String TEXT_596 = ";" + NL + "\t\t";
  protected final String TEXT_597 = " = new";
  protected final String TEXT_598 = ";";
  protected final String TEXT_599 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_600 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_601 = NL + "\t\tboolean old";
  protected final String TEXT_602 = "ESet = (";
  protected final String TEXT_603 = " & ";
  protected final String TEXT_604 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_605 = " |= ";
  protected final String TEXT_606 = "_ESETFLAG;";
  protected final String TEXT_607 = NL + "\t\tboolean old";
  protected final String TEXT_608 = "ESet = ";
  protected final String TEXT_609 = "ESet;" + NL + "\t\t";
  protected final String TEXT_610 = "ESet = true;";
  protected final String TEXT_611 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_612 = NL + "\t\t\t";
  protected final String TEXT_613 = " notification = new ";
  protected final String TEXT_614 = "(this, ";
  protected final String TEXT_615 = ".SET, ";
  protected final String TEXT_616 = ", ";
  protected final String TEXT_617 = "isSetChange ? null : old";
  protected final String TEXT_618 = "old";
  protected final String TEXT_619 = ", new";
  protected final String TEXT_620 = ", ";
  protected final String TEXT_621 = "isSetChange";
  protected final String TEXT_622 = "!old";
  protected final String TEXT_623 = "ESet";
  protected final String TEXT_624 = ");";
  protected final String TEXT_625 = NL + "\t\t\t";
  protected final String TEXT_626 = " notification = new ";
  protected final String TEXT_627 = "(this, ";
  protected final String TEXT_628 = ".SET, ";
  protected final String TEXT_629 = ", ";
  protected final String TEXT_630 = "old";
  protected final String TEXT_631 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_632 = "old";
  protected final String TEXT_633 = ", new";
  protected final String TEXT_634 = ");";
  protected final String TEXT_635 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_636 = NL;
  protected final String TEXT_637 = NL + "\t\t";
  protected final String TEXT_638 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_639 = NL + "\t\t\t";
  protected final String TEXT_640 = " ";
  protected final String TEXT_641 = " = ";
  protected final String TEXT_642 = "();";
  protected final String TEXT_643 = NL + "\t\t\tObject ";
  protected final String TEXT_644 = " = eVirtualGet(";
  protected final String TEXT_645 = ");";
  protected final String TEXT_646 = NL + "\t\t\tif (";
  protected final String TEXT_647 = " != null && ";
  protected final String TEXT_648 = " != new";
  protected final String TEXT_649 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_650 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_651 = NL + "\t\t\tif (new";
  protected final String TEXT_652 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_653 = NL + "\t\t\t\t";
  protected final String TEXT_654 = " ";
  protected final String TEXT_655 = " = ";
  protected final String TEXT_656 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_657 = ".contains(new";
  protected final String TEXT_658 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_659 = ".add(new";
  protected final String TEXT_660 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_661 = NL + "\t\t\t\t";
  protected final String TEXT_662 = " ";
  protected final String TEXT_663 = " = ";
  protected final String TEXT_664 = "();";
  protected final String TEXT_665 = NL + "\t\t\t\tObject ";
  protected final String TEXT_666 = " = eVirtualGet(";
  protected final String TEXT_667 = ");";
  protected final String TEXT_668 = NL + "\t\t\t\tif (new";
  protected final String TEXT_669 = " != ";
  protected final String TEXT_670 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_671 = "(new";
  protected final String TEXT_672 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_673 = NL + "\t\t\t}";
  protected final String TEXT_674 = NL + "\t\t}";
  protected final String TEXT_675 = NL + "\t\treturn msgs;";
  protected final String TEXT_676 = NL + "\t\treturn ((";
  protected final String TEXT_677 = ".Internal)((";
  protected final String TEXT_678 = ".Internal.Wrapper)get";
  protected final String TEXT_679 = "()).featureMap()).basicAdd(";
  protected final String TEXT_680 = ", new";
  protected final String TEXT_681 = ", msgs);";
  protected final String TEXT_682 = NL + "\t\treturn ((";
  protected final String TEXT_683 = ".Internal)get";
  protected final String TEXT_684 = "()).basicAdd(";
  protected final String TEXT_685 = ", new";
  protected final String TEXT_686 = ", msgs);";
  protected final String TEXT_687 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_688 = "' ";
  protected final String TEXT_689 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_690 = NL + "\t}" + NL;
  protected final String TEXT_691 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_692 = "#";
  protected final String TEXT_693 = " <em>";
  protected final String TEXT_694 = "</em>}' ";
  protected final String TEXT_695 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_696 = "</em>' ";
  protected final String TEXT_697 = ".";
  protected final String TEXT_698 = NL + "\t * @see ";
  protected final String TEXT_699 = NL + "\t * @see #isSet";
  protected final String TEXT_700 = "()";
  protected final String TEXT_701 = NL + "\t * @see #unset";
  protected final String TEXT_702 = "()";
  protected final String TEXT_703 = NL + "\t * @see #";
  protected final String TEXT_704 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_705 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_706 = NL + "\tvoid set";
  protected final String TEXT_707 = "(";
  protected final String TEXT_708 = " value);" + NL;
  protected final String TEXT_709 = NL + "\tpublic void set";
  protected final String TEXT_710 = "(";
  protected final String TEXT_711 = " new";
  protected final String TEXT_712 = ")" + NL + "\t{";
  protected final String TEXT_713 = NL;
  protected final String TEXT_714 = NL + "\t\tnew";
  protected final String TEXT_715 = " = new";
  protected final String TEXT_716 = " == null ? ";
  protected final String TEXT_717 = " : new";
  protected final String TEXT_718 = ";";
  protected final String TEXT_719 = NL + "\t\teSet(";
  protected final String TEXT_720 = ", ";
  protected final String TEXT_721 = "new ";
  protected final String TEXT_722 = "(";
  protected final String TEXT_723 = "new";
  protected final String TEXT_724 = ")";
  protected final String TEXT_725 = ");";
  protected final String TEXT_726 = NL + "\t\tif (new";
  protected final String TEXT_727 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_728 = " && new";
  protected final String TEXT_729 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_730 = ".isAncestor(this, ";
  protected final String TEXT_731 = "new";
  protected final String TEXT_732 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_733 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_734 = NL + "\t\t\t";
  protected final String TEXT_735 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_736 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_737 = ")new";
  protected final String TEXT_738 = ").eInverseAdd(this, ";
  protected final String TEXT_739 = ", ";
  protected final String TEXT_740 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_741 = "(";
  protected final String TEXT_742 = "new";
  protected final String TEXT_743 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_744 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_745 = "(this, ";
  protected final String TEXT_746 = ".SET, ";
  protected final String TEXT_747 = ", new";
  protected final String TEXT_748 = ", new";
  protected final String TEXT_749 = "));";
  protected final String TEXT_750 = NL + "\t\t";
  protected final String TEXT_751 = " ";
  protected final String TEXT_752 = " = (";
  protected final String TEXT_753 = ")eVirtualGet(";
  protected final String TEXT_754 = ");";
  protected final String TEXT_755 = NL + "\t\tif (new";
  protected final String TEXT_756 = " != ";
  protected final String TEXT_757 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_758 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_759 = " != null)";
  protected final String TEXT_760 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_761 = ")";
  protected final String TEXT_762 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_763 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_764 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_765 = ")new";
  protected final String TEXT_766 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_767 = ", null, msgs);";
  protected final String TEXT_768 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_769 = ")";
  protected final String TEXT_770 = ").eInverseRemove(this, ";
  protected final String TEXT_771 = ", ";
  protected final String TEXT_772 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_773 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_774 = ")new";
  protected final String TEXT_775 = ").eInverseAdd(this, ";
  protected final String TEXT_776 = ", ";
  protected final String TEXT_777 = ".class, msgs);";
  protected final String TEXT_778 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_779 = "(";
  protected final String TEXT_780 = "new";
  protected final String TEXT_781 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_782 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_783 = NL + "\t\t\tboolean old";
  protected final String TEXT_784 = "ESet = eVirtualIsSet(";
  protected final String TEXT_785 = ");";
  protected final String TEXT_786 = NL + "\t\t\tboolean old";
  protected final String TEXT_787 = "ESet = (";
  protected final String TEXT_788 = " & ";
  protected final String TEXT_789 = "_ESETFLAG) != 0;";
  protected final String TEXT_790 = NL + "\t\t\t";
  protected final String TEXT_791 = " |= ";
  protected final String TEXT_792 = "_ESETFLAG;";
  protected final String TEXT_793 = NL + "\t\t\tboolean old";
  protected final String TEXT_794 = "ESet = ";
  protected final String TEXT_795 = "ESet;";
  protected final String TEXT_796 = NL + "\t\t\t";
  protected final String TEXT_797 = "ESet = true;";
  protected final String TEXT_798 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_799 = "(this, ";
  protected final String TEXT_800 = ".SET, ";
  protected final String TEXT_801 = ", new";
  protected final String TEXT_802 = ", new";
  protected final String TEXT_803 = ", !old";
  protected final String TEXT_804 = "ESet));";
  protected final String TEXT_805 = NL + "\t\t}";
  protected final String TEXT_806 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_807 = "(this, ";
  protected final String TEXT_808 = ".SET, ";
  protected final String TEXT_809 = ", new";
  protected final String TEXT_810 = ", new";
  protected final String TEXT_811 = "));";
  protected final String TEXT_812 = NL + "\t\t";
  protected final String TEXT_813 = " old";
  protected final String TEXT_814 = " = (";
  protected final String TEXT_815 = " & ";
  protected final String TEXT_816 = "_EFLAG) != 0;";
  protected final String TEXT_817 = NL + "\t\tif (new";
  protected final String TEXT_818 = ") ";
  protected final String TEXT_819 = " |= ";
  protected final String TEXT_820 = "_EFLAG; else ";
  protected final String TEXT_821 = " &= ~";
  protected final String TEXT_822 = "_EFLAG;";
  protected final String TEXT_823 = NL + "\t\t";
  protected final String TEXT_824 = " old";
  protected final String TEXT_825 = " = ";
  protected final String TEXT_826 = ";";
  protected final String TEXT_827 = NL + "\t\t";
  protected final String TEXT_828 = " ";
  protected final String TEXT_829 = " = new";
  protected final String TEXT_830 = " == null ? ";
  protected final String TEXT_831 = " : new";
  protected final String TEXT_832 = ";";
  protected final String TEXT_833 = NL + "\t\t";
  protected final String TEXT_834 = " = new";
  protected final String TEXT_835 = " == null ? ";
  protected final String TEXT_836 = " : new";
  protected final String TEXT_837 = ";";
  protected final String TEXT_838 = NL + "\t\t";
  protected final String TEXT_839 = " ";
  protected final String TEXT_840 = " = ";
  protected final String TEXT_841 = "new";
  protected final String TEXT_842 = ";";
  protected final String TEXT_843 = NL + "\t\t";
  protected final String TEXT_844 = " = ";
  protected final String TEXT_845 = "new";
  protected final String TEXT_846 = ";";
  protected final String TEXT_847 = NL + "\t\tObject old";
  protected final String TEXT_848 = " = eVirtualSet(";
  protected final String TEXT_849 = ", ";
  protected final String TEXT_850 = ");";
  protected final String TEXT_851 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_852 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_853 = NL + "\t\tboolean old";
  protected final String TEXT_854 = "ESet = (";
  protected final String TEXT_855 = " & ";
  protected final String TEXT_856 = "_ESETFLAG) != 0;";
  protected final String TEXT_857 = NL + "\t\t";
  protected final String TEXT_858 = " |= ";
  protected final String TEXT_859 = "_ESETFLAG;";
  protected final String TEXT_860 = NL + "\t\tboolean old";
  protected final String TEXT_861 = "ESet = ";
  protected final String TEXT_862 = "ESet;";
  protected final String TEXT_863 = NL + "\t\t";
  protected final String TEXT_864 = "ESet = true;";
  protected final String TEXT_865 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_866 = "(this, ";
  protected final String TEXT_867 = ".SET, ";
  protected final String TEXT_868 = ", ";
  protected final String TEXT_869 = "isSetChange ? ";
  protected final String TEXT_870 = " : old";
  protected final String TEXT_871 = "old";
  protected final String TEXT_872 = ", ";
  protected final String TEXT_873 = "new";
  protected final String TEXT_874 = ", ";
  protected final String TEXT_875 = "isSetChange";
  protected final String TEXT_876 = "!old";
  protected final String TEXT_877 = "ESet";
  protected final String TEXT_878 = "));";
  protected final String TEXT_879 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_880 = "(this, ";
  protected final String TEXT_881 = ".SET, ";
  protected final String TEXT_882 = ", ";
  protected final String TEXT_883 = "old";
  protected final String TEXT_884 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_885 = " : old";
  protected final String TEXT_886 = "old";
  protected final String TEXT_887 = ", ";
  protected final String TEXT_888 = "new";
  protected final String TEXT_889 = "));";
  protected final String TEXT_890 = NL;
  protected final String TEXT_891 = NL;
  protected final String TEXT_892 = NL + "\t\t";
  protected final String TEXT_893 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_894 = NL + "\t\t\t";
  protected final String TEXT_895 = " ";
  protected final String TEXT_896 = " = ";
  protected final String TEXT_897 = "();";
  protected final String TEXT_898 = NL + "\t\t\tObject ";
  protected final String TEXT_899 = " = eVirtualGet(";
  protected final String TEXT_900 = ");";
  protected final String TEXT_901 = NL + "\t\t\tif (";
  protected final String TEXT_902 = " != null && ";
  protected final String TEXT_903 = " != new";
  protected final String TEXT_904 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_905 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_906 = NL + "\t\t\tif (new";
  protected final String TEXT_907 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_908 = NL + "\t\t\t\t";
  protected final String TEXT_909 = " ";
  protected final String TEXT_910 = " = ";
  protected final String TEXT_911 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_912 = ".contains(new";
  protected final String TEXT_913 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_914 = ".add(new";
  protected final String TEXT_915 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_916 = NL + "\t\t\t\t";
  protected final String TEXT_917 = " ";
  protected final String TEXT_918 = " = ";
  protected final String TEXT_919 = "();";
  protected final String TEXT_920 = NL + "\t\t\t\tObject ";
  protected final String TEXT_921 = " = eVirtualGet(";
  protected final String TEXT_922 = ");";
  protected final String TEXT_923 = NL + "\t\t\t\tif (new";
  protected final String TEXT_924 = " != ";
  protected final String TEXT_925 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_926 = "(new";
  protected final String TEXT_927 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_928 = NL + "\t\t\t}";
  protected final String TEXT_929 = NL + "\t\t}";
  protected final String TEXT_930 = NL + "\t\t((";
  protected final String TEXT_931 = ".Internal)((";
  protected final String TEXT_932 = ".Internal.Wrapper)get";
  protected final String TEXT_933 = "()).featureMap()).set(";
  protected final String TEXT_934 = ", ";
  protected final String TEXT_935 = "new ";
  protected final String TEXT_936 = "(";
  protected final String TEXT_937 = "new";
  protected final String TEXT_938 = ")";
  protected final String TEXT_939 = ");";
  protected final String TEXT_940 = NL + "\t\t((";
  protected final String TEXT_941 = ".Internal)get";
  protected final String TEXT_942 = "()).set(";
  protected final String TEXT_943 = ", ";
  protected final String TEXT_944 = "new ";
  protected final String TEXT_945 = "(";
  protected final String TEXT_946 = "new";
  protected final String TEXT_947 = ")";
  protected final String TEXT_948 = ");";
  protected final String TEXT_949 = NL;
  protected final String TEXT_950 = NL + "\t\t";
  protected final String TEXT_951 = ".";
  protected final String TEXT_952 = "(this, ";
  protected final String TEXT_953 = ");";
  protected final String TEXT_954 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_955 = "' ";
  protected final String TEXT_956 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_957 = NL + "\t}" + NL;
  protected final String TEXT_958 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_959 = " basicUnset";
  protected final String TEXT_960 = "(";
  protected final String TEXT_961 = " msgs)" + NL + "\t{";
  protected final String TEXT_962 = NL + "\t\tObject old";
  protected final String TEXT_963 = " = eVirtualUnset(";
  protected final String TEXT_964 = ");";
  protected final String TEXT_965 = NL + "\t\t";
  protected final String TEXT_966 = " old";
  protected final String TEXT_967 = " = ";
  protected final String TEXT_968 = ";" + NL + "\t\t";
  protected final String TEXT_969 = " = null;";
  protected final String TEXT_970 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_971 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_972 = NL + "\t\tboolean old";
  protected final String TEXT_973 = "ESet = (";
  protected final String TEXT_974 = " & ";
  protected final String TEXT_975 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_976 = " &= ~";
  protected final String TEXT_977 = "_ESETFLAG;";
  protected final String TEXT_978 = NL + "\t\tboolean old";
  protected final String TEXT_979 = "ESet = ";
  protected final String TEXT_980 = "ESet;" + NL + "\t\t";
  protected final String TEXT_981 = "ESet = false;";
  protected final String TEXT_982 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_983 = " notification = new ";
  protected final String TEXT_984 = "(this, ";
  protected final String TEXT_985 = ".UNSET, ";
  protected final String TEXT_986 = ", ";
  protected final String TEXT_987 = "isSetChange ? old";
  protected final String TEXT_988 = " : null";
  protected final String TEXT_989 = "old";
  protected final String TEXT_990 = ", null, ";
  protected final String TEXT_991 = "isSetChange";
  protected final String TEXT_992 = "old";
  protected final String TEXT_993 = "ESet";
  protected final String TEXT_994 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_995 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_996 = "' ";
  protected final String TEXT_997 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_998 = NL + "\t}" + NL;
  protected final String TEXT_999 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1000 = "#";
  protected final String TEXT_1001 = " <em>";
  protected final String TEXT_1002 = "</em>}' ";
  protected final String TEXT_1003 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1004 = NL + "\t * @see #isSet";
  protected final String TEXT_1005 = "()";
  protected final String TEXT_1006 = NL + "\t * @see #";
  protected final String TEXT_1007 = "()";
  protected final String TEXT_1008 = NL + "\t * @see #set";
  protected final String TEXT_1009 = "(";
  protected final String TEXT_1010 = ")";
  protected final String TEXT_1011 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1013 = NL + "\tvoid unset";
  protected final String TEXT_1014 = "();" + NL;
  protected final String TEXT_1015 = NL + "\tpublic void unset";
  protected final String TEXT_1016 = "()" + NL + "\t{";
  protected final String TEXT_1017 = NL + "\t\teUnset(";
  protected final String TEXT_1018 = ");";
  protected final String TEXT_1019 = NL + "\t\t";
  protected final String TEXT_1020 = " ";
  protected final String TEXT_1021 = " = (";
  protected final String TEXT_1022 = ")eVirtualGet(";
  protected final String TEXT_1023 = ");";
  protected final String TEXT_1024 = NL + "\t\tif (";
  protected final String TEXT_1025 = " != null) ((";
  protected final String TEXT_1026 = ".Unsettable";
  protected final String TEXT_1027 = ")";
  protected final String TEXT_1028 = ").unset();";
  protected final String TEXT_1029 = NL + "\t\t";
  protected final String TEXT_1030 = " ";
  protected final String TEXT_1031 = " = (";
  protected final String TEXT_1032 = ")eVirtualGet(";
  protected final String TEXT_1033 = ");";
  protected final String TEXT_1034 = NL + "\t\tif (";
  protected final String TEXT_1035 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1036 = " msgs = null;";
  protected final String TEXT_1037 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1038 = ")";
  protected final String TEXT_1039 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1040 = ", null, msgs);";
  protected final String TEXT_1041 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1042 = ")";
  protected final String TEXT_1043 = ").eInverseRemove(this, ";
  protected final String TEXT_1044 = ", ";
  protected final String TEXT_1045 = ".class, msgs);";
  protected final String TEXT_1046 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1047 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1048 = NL + "\t\t\tboolean old";
  protected final String TEXT_1049 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1050 = ");";
  protected final String TEXT_1051 = NL + "\t\t\tboolean old";
  protected final String TEXT_1052 = "ESet = (";
  protected final String TEXT_1053 = " & ";
  protected final String TEXT_1054 = "_ESETFLAG) != 0;";
  protected final String TEXT_1055 = NL + "\t\t\t";
  protected final String TEXT_1056 = " &= ~";
  protected final String TEXT_1057 = "_ESETFLAG;";
  protected final String TEXT_1058 = NL + "\t\t\tboolean old";
  protected final String TEXT_1059 = "ESet = ";
  protected final String TEXT_1060 = "ESet;";
  protected final String TEXT_1061 = NL + "\t\t\t";
  protected final String TEXT_1062 = "ESet = false;";
  protected final String TEXT_1063 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1064 = "(this, ";
  protected final String TEXT_1065 = ".UNSET, ";
  protected final String TEXT_1066 = ", null, null, old";
  protected final String TEXT_1067 = "ESet));";
  protected final String TEXT_1068 = NL + "\t\t}";
  protected final String TEXT_1069 = NL + "\t\t";
  protected final String TEXT_1070 = " old";
  protected final String TEXT_1071 = " = (";
  protected final String TEXT_1072 = " & ";
  protected final String TEXT_1073 = "_EFLAG) != 0;";
  protected final String TEXT_1074 = NL + "\t\tObject old";
  protected final String TEXT_1075 = " = eVirtualUnset(";
  protected final String TEXT_1076 = ");";
  protected final String TEXT_1077 = NL + "\t\t";
  protected final String TEXT_1078 = " old";
  protected final String TEXT_1079 = " = ";
  protected final String TEXT_1080 = ";";
  protected final String TEXT_1081 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1082 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1083 = NL + "\t\tboolean old";
  protected final String TEXT_1084 = "ESet = (";
  protected final String TEXT_1085 = " & ";
  protected final String TEXT_1086 = "_ESETFLAG) != 0;";
  protected final String TEXT_1087 = NL + "\t\tboolean old";
  protected final String TEXT_1088 = "ESet = ";
  protected final String TEXT_1089 = "ESet;";
  protected final String TEXT_1090 = NL + "\t\t";
  protected final String TEXT_1091 = " = null;";
  protected final String TEXT_1092 = NL + "\t\t";
  protected final String TEXT_1093 = " &= ~";
  protected final String TEXT_1094 = "_ESETFLAG;";
  protected final String TEXT_1095 = NL + "\t\t";
  protected final String TEXT_1096 = "ESet = false;";
  protected final String TEXT_1097 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1098 = "(this, ";
  protected final String TEXT_1099 = ".UNSET, ";
  protected final String TEXT_1100 = ", ";
  protected final String TEXT_1101 = "isSetChange ? old";
  protected final String TEXT_1102 = " : null";
  protected final String TEXT_1103 = "old";
  protected final String TEXT_1104 = ", null, ";
  protected final String TEXT_1105 = "isSetChange";
  protected final String TEXT_1106 = "old";
  protected final String TEXT_1107 = "ESet";
  protected final String TEXT_1108 = "));";
  protected final String TEXT_1109 = NL + "\t\tif (";
  protected final String TEXT_1110 = ") ";
  protected final String TEXT_1111 = " |= ";
  protected final String TEXT_1112 = "_EFLAG; else ";
  protected final String TEXT_1113 = " &= ~";
  protected final String TEXT_1114 = "_EFLAG;";
  protected final String TEXT_1115 = NL + "\t\t";
  protected final String TEXT_1116 = " = ";
  protected final String TEXT_1117 = ";";
  protected final String TEXT_1118 = NL + "\t\t";
  protected final String TEXT_1119 = " &= ~";
  protected final String TEXT_1120 = "_ESETFLAG;";
  protected final String TEXT_1121 = NL + "\t\t";
  protected final String TEXT_1122 = "ESet = false;";
  protected final String TEXT_1123 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1124 = "(this, ";
  protected final String TEXT_1125 = ".UNSET, ";
  protected final String TEXT_1126 = ", ";
  protected final String TEXT_1127 = "isSetChange ? old";
  protected final String TEXT_1128 = " : ";
  protected final String TEXT_1129 = "old";
  protected final String TEXT_1130 = ", ";
  protected final String TEXT_1131 = ", ";
  protected final String TEXT_1132 = "isSetChange";
  protected final String TEXT_1133 = "old";
  protected final String TEXT_1134 = "ESet";
  protected final String TEXT_1135 = "));";
  protected final String TEXT_1136 = NL + "\t\t((";
  protected final String TEXT_1137 = ".Internal)((";
  protected final String TEXT_1138 = ".Internal.Wrapper)get";
  protected final String TEXT_1139 = "()).featureMap()).clear(";
  protected final String TEXT_1140 = ");";
  protected final String TEXT_1141 = NL + "\t\t((";
  protected final String TEXT_1142 = ".Internal)get";
  protected final String TEXT_1143 = "()).clear(";
  protected final String TEXT_1144 = ");";
  protected final String TEXT_1145 = NL;
  protected final String TEXT_1146 = NL + "\t\t";
  protected final String TEXT_1147 = ".";
  protected final String TEXT_1148 = "(this);";
  protected final String TEXT_1149 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1150 = "' ";
  protected final String TEXT_1151 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1152 = NL + "\t}" + NL;
  protected final String TEXT_1153 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1154 = "#";
  protected final String TEXT_1155 = " <em>";
  protected final String TEXT_1156 = "</em>}' ";
  protected final String TEXT_1157 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1158 = "</em>' ";
  protected final String TEXT_1159 = " is set.";
  protected final String TEXT_1160 = NL + "\t * @see #unset";
  protected final String TEXT_1161 = "()";
  protected final String TEXT_1162 = NL + "\t * @see #";
  protected final String TEXT_1163 = "()";
  protected final String TEXT_1164 = NL + "\t * @see #set";
  protected final String TEXT_1165 = "(";
  protected final String TEXT_1166 = ")";
  protected final String TEXT_1167 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1168 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1169 = NL + "\tboolean isSet";
  protected final String TEXT_1170 = "();" + NL;
  protected final String TEXT_1171 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1172 = "()" + NL + "\t{";
  protected final String TEXT_1173 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1174 = ");";
  protected final String TEXT_1175 = NL + "\t\t";
  protected final String TEXT_1176 = " ";
  protected final String TEXT_1177 = " = (";
  protected final String TEXT_1178 = ")eVirtualGet(";
  protected final String TEXT_1179 = ");";
  protected final String TEXT_1180 = NL + "\t\treturn ";
  protected final String TEXT_1181 = " != null && ((";
  protected final String TEXT_1182 = ".Unsettable";
  protected final String TEXT_1183 = ")";
  protected final String TEXT_1184 = ").isSet();";
  protected final String TEXT_1185 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1186 = ");";
  protected final String TEXT_1187 = NL + "\t\treturn (";
  protected final String TEXT_1188 = " & ";
  protected final String TEXT_1189 = "_ESETFLAG) != 0;";
  protected final String TEXT_1190 = NL + "\t\treturn ";
  protected final String TEXT_1191 = "ESet;";
  protected final String TEXT_1192 = NL + "\t\treturn !((";
  protected final String TEXT_1193 = ".Internal)((";
  protected final String TEXT_1194 = ".Internal.Wrapper)get";
  protected final String TEXT_1195 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1196 = ");";
  protected final String TEXT_1197 = NL + "\t\treturn !((";
  protected final String TEXT_1198 = ".Internal)get";
  protected final String TEXT_1199 = "()).isEmpty(";
  protected final String TEXT_1200 = ");";
  protected final String TEXT_1201 = NL;
  protected final String TEXT_1202 = NL + "\t\treturn ";
  protected final String TEXT_1203 = ".";
  protected final String TEXT_1204 = "(this);";
  protected final String TEXT_1205 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1206 = "' ";
  protected final String TEXT_1207 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1208 = NL + "\t}" + NL;
  protected final String TEXT_1209 = NL;
  protected final String TEXT_1210 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1211 = "() <em>";
  protected final String TEXT_1212 = "</em>}' ";
  protected final String TEXT_1213 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1214 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1215 = "_ESUBSETS = ";
  protected final String TEXT_1216 = ";" + NL;
  protected final String TEXT_1217 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1218 = "() <em>";
  protected final String TEXT_1219 = "</em>}' ";
  protected final String TEXT_1220 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1221 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1222 = "_ESUPERSETS = ";
  protected final String TEXT_1223 = ";" + NL;
  protected final String TEXT_1224 = NL + "\t/**";
  protected final String TEXT_1225 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1226 = "}, with the specified ";
  protected final String TEXT_1227 = ", and appends it to the '<em><b>";
  protected final String TEXT_1228 = "</b></em>' ";
  protected final String TEXT_1229 = ".";
  protected final String TEXT_1230 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1231 = "}, with the specified ";
  protected final String TEXT_1232 = ", and sets the '<em><b>";
  protected final String TEXT_1233 = "</b></em>' ";
  protected final String TEXT_1234 = ".";
  protected final String TEXT_1235 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1236 = "} and appends it to the '<em><b>";
  protected final String TEXT_1237 = "</b></em>' ";
  protected final String TEXT_1238 = ".";
  protected final String TEXT_1239 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1240 = "} and sets the '<em><b>";
  protected final String TEXT_1241 = "</b></em>' ";
  protected final String TEXT_1242 = ".";
  protected final String TEXT_1243 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1244 = NL + "\t * @param ";
  protected final String TEXT_1245 = " The ";
  protected final String TEXT_1246 = " for the new {@link ";
  protected final String TEXT_1247 = "}, or <code>null</code>.";
  protected final String TEXT_1248 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1249 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1250 = "}." + NL + "\t * @see #";
  protected final String TEXT_1251 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1252 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1253 = NL + "\t";
  protected final String TEXT_1254 = " create";
  protected final String TEXT_1255 = "(";
  protected final String TEXT_1256 = ", ";
  protected final String TEXT_1257 = " eClass);" + NL;
  protected final String TEXT_1258 = NL + "\t@Override";
  protected final String TEXT_1259 = NL + "\tpublic ";
  protected final String TEXT_1260 = " create";
  protected final String TEXT_1261 = "(";
  protected final String TEXT_1262 = ", ";
  protected final String TEXT_1263 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1264 = " new";
  protected final String TEXT_1265 = " = (";
  protected final String TEXT_1266 = ") create(eClass);";
  protected final String TEXT_1267 = NL + "\t\t";
  protected final String TEXT_1268 = "().add(new";
  protected final String TEXT_1269 = ");";
  protected final String TEXT_1270 = NL + "\t\tset";
  protected final String TEXT_1271 = "(new";
  protected final String TEXT_1272 = ");";
  protected final String TEXT_1273 = NL + "\t\tint ";
  protected final String TEXT_1274 = "ListSize = 0;";
  protected final String TEXT_1275 = NL + "\t\tint ";
  protected final String TEXT_1276 = "Size = ";
  protected final String TEXT_1277 = " == null ? 0 : ";
  protected final String TEXT_1278 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1279 = "Size > ";
  protected final String TEXT_1280 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1281 = "ListSize = ";
  protected final String TEXT_1282 = "Size;";
  protected final String TEXT_1283 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1284 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1285 = ".create";
  protected final String TEXT_1286 = "(";
  protected final String TEXT_1287 = ", ";
  protected final String TEXT_1288 = "i < ";
  protected final String TEXT_1289 = "Size ? (";
  protected final String TEXT_1290 = ") ";
  protected final String TEXT_1291 = ".get(i) : null";
  protected final String TEXT_1292 = ");" + NL + "\t\t}";
  protected final String TEXT_1293 = NL + "\t\tnew";
  protected final String TEXT_1294 = ".create";
  protected final String TEXT_1295 = "(";
  protected final String TEXT_1296 = ", ";
  protected final String TEXT_1297 = ");";
  protected final String TEXT_1298 = NL + "\t\tif (";
  protected final String TEXT_1299 = " != null)";
  protected final String TEXT_1300 = NL + "\t\t\tnew";
  protected final String TEXT_1301 = ".";
  protected final String TEXT_1302 = "().addAll(";
  protected final String TEXT_1303 = ");";
  protected final String TEXT_1304 = NL + "\t\t\tnew";
  protected final String TEXT_1305 = ".set";
  protected final String TEXT_1306 = "(";
  protected final String TEXT_1307 = ");";
  protected final String TEXT_1308 = NL + "\t\treturn new";
  protected final String TEXT_1309 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1310 = NL + "\t/**";
  protected final String TEXT_1311 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1312 = "}, with the specified ";
  protected final String TEXT_1313 = ", and appends it to the '<em><b>";
  protected final String TEXT_1314 = "</b></em>' ";
  protected final String TEXT_1315 = ".";
  protected final String TEXT_1316 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1317 = "},with the specified ";
  protected final String TEXT_1318 = ", and sets the '<em><b>";
  protected final String TEXT_1319 = "</b></em>' ";
  protected final String TEXT_1320 = ".";
  protected final String TEXT_1321 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1322 = "} and appends it to the '<em><b>";
  protected final String TEXT_1323 = "</b></em>' ";
  protected final String TEXT_1324 = ".";
  protected final String TEXT_1325 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1326 = "} and sets the '<em><b>";
  protected final String TEXT_1327 = "</b></em>' ";
  protected final String TEXT_1328 = ".";
  protected final String TEXT_1329 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1330 = NL + "\t * @param ";
  protected final String TEXT_1331 = " The ";
  protected final String TEXT_1332 = " for the new {@link ";
  protected final String TEXT_1333 = "}, or <code>null</code>.";
  protected final String TEXT_1334 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1335 = "}." + NL + "\t * @see #";
  protected final String TEXT_1336 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1337 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1338 = NL + "\t";
  protected final String TEXT_1339 = " create";
  protected final String TEXT_1340 = "(";
  protected final String TEXT_1341 = ");" + NL;
  protected final String TEXT_1342 = NL + "\t@Override";
  protected final String TEXT_1343 = NL + "\tpublic ";
  protected final String TEXT_1344 = " create";
  protected final String TEXT_1345 = "(";
  protected final String TEXT_1346 = ")" + NL + "\t{";
  protected final String TEXT_1347 = NL + "\t\treturn create";
  protected final String TEXT_1348 = "(";
  protected final String TEXT_1349 = ", ";
  protected final String TEXT_1350 = ");";
  protected final String TEXT_1351 = NL + "\t\t";
  protected final String TEXT_1352 = " new";
  protected final String TEXT_1353 = " = (";
  protected final String TEXT_1354 = ") create(";
  protected final String TEXT_1355 = ");";
  protected final String TEXT_1356 = NL + "\t\t";
  protected final String TEXT_1357 = "().add(new";
  protected final String TEXT_1358 = ");";
  protected final String TEXT_1359 = NL + "\t\tset";
  protected final String TEXT_1360 = "(new";
  protected final String TEXT_1361 = ");";
  protected final String TEXT_1362 = NL + "\t\tint ";
  protected final String TEXT_1363 = "ListSize = 0;";
  protected final String TEXT_1364 = NL + "\t\tint ";
  protected final String TEXT_1365 = "Size = ";
  protected final String TEXT_1366 = " == null ? 0 : ";
  protected final String TEXT_1367 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1368 = "Size > ";
  protected final String TEXT_1369 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1370 = "ListSize = ";
  protected final String TEXT_1371 = "Size;";
  protected final String TEXT_1372 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1373 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1374 = ".create";
  protected final String TEXT_1375 = "(";
  protected final String TEXT_1376 = ", ";
  protected final String TEXT_1377 = "i < ";
  protected final String TEXT_1378 = "Size ? (";
  protected final String TEXT_1379 = ") ";
  protected final String TEXT_1380 = ".get(i) : null";
  protected final String TEXT_1381 = ");" + NL + "\t\t}";
  protected final String TEXT_1382 = NL + "\t\tnew";
  protected final String TEXT_1383 = ".create";
  protected final String TEXT_1384 = "(";
  protected final String TEXT_1385 = ", ";
  protected final String TEXT_1386 = ");";
  protected final String TEXT_1387 = NL + "\t\tif (";
  protected final String TEXT_1388 = " != null)";
  protected final String TEXT_1389 = NL + "\t\t\tnew";
  protected final String TEXT_1390 = ".";
  protected final String TEXT_1391 = "().addAll(";
  protected final String TEXT_1392 = ");";
  protected final String TEXT_1393 = NL + "\t\t\tnew";
  protected final String TEXT_1394 = ".set";
  protected final String TEXT_1395 = "(";
  protected final String TEXT_1396 = ");";
  protected final String TEXT_1397 = NL + "\t\treturn new";
  protected final String TEXT_1398 = ";";
  protected final String TEXT_1399 = NL + "\t}" + NL;
  protected final String TEXT_1400 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1401 = "} with the specified ";
  protected final String TEXT_1402 = " from the '<em><b>";
  protected final String TEXT_1403 = "</b></em>' ";
  protected final String TEXT_1404 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1405 = NL + "\t * @param ";
  protected final String TEXT_1406 = " The ";
  protected final String TEXT_1407 = " of the {@link ";
  protected final String TEXT_1408 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1409 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1410 = "} with the specified ";
  protected final String TEXT_1411 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1412 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1413 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1414 = NL + "\t";
  protected final String TEXT_1415 = " get";
  protected final String TEXT_1416 = "(";
  protected final String TEXT_1417 = ");" + NL;
  protected final String TEXT_1418 = NL + "\t@Override";
  protected final String TEXT_1419 = NL + "\tpublic ";
  protected final String TEXT_1420 = " get";
  protected final String TEXT_1421 = "(";
  protected final String TEXT_1422 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1423 = "(";
  protected final String TEXT_1424 = ", false";
  protected final String TEXT_1425 = ", null";
  protected final String TEXT_1426 = ", false";
  protected final String TEXT_1427 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1428 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1429 = "} with the specified ";
  protected final String TEXT_1430 = " from the '<em><b>";
  protected final String TEXT_1431 = "</b></em>' ";
  protected final String TEXT_1432 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1433 = NL + "\t * @param ";
  protected final String TEXT_1434 = " The ";
  protected final String TEXT_1435 = " of the {@link ";
  protected final String TEXT_1436 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1437 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1438 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1439 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1440 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1441 = "} on demand if not found.";
  protected final String TEXT_1442 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1443 = "} with the specified ";
  protected final String TEXT_1444 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1445 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1446 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1447 = NL + "\t";
  protected final String TEXT_1448 = " get";
  protected final String TEXT_1449 = "(";
  protected final String TEXT_1450 = ", boolean ignoreCase";
  protected final String TEXT_1451 = ", ";
  protected final String TEXT_1452 = " eClass";
  protected final String TEXT_1453 = ", boolean createOnDemand";
  protected final String TEXT_1454 = ");" + NL;
  protected final String TEXT_1455 = NL + "\t@Override";
  protected final String TEXT_1456 = NL + "\tpublic ";
  protected final String TEXT_1457 = " get";
  protected final String TEXT_1458 = "(";
  protected final String TEXT_1459 = ", boolean ignoreCase";
  protected final String TEXT_1460 = ", ";
  protected final String TEXT_1461 = " eClass";
  protected final String TEXT_1462 = ", boolean createOnDemand";
  protected final String TEXT_1463 = ")" + NL + "\t{";
  protected final String TEXT_1464 = NL + "\t\t";
  protected final String TEXT_1465 = "Loop: for (";
  protected final String TEXT_1466 = " ";
  protected final String TEXT_1467 = " : ";
  protected final String TEXT_1468 = "())" + NL + "\t\t{";
  protected final String TEXT_1469 = NL + "\t\t";
  protected final String TEXT_1470 = "Loop: for (";
  protected final String TEXT_1471 = " i = ";
  protected final String TEXT_1472 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1473 = " ";
  protected final String TEXT_1474 = " = (";
  protected final String TEXT_1475 = ") i.next();";
  protected final String TEXT_1476 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1477 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1478 = "Loop;";
  protected final String TEXT_1479 = NL + "\t\t\t";
  protected final String TEXT_1480 = " ";
  protected final String TEXT_1481 = "List = ";
  protected final String TEXT_1482 = ".";
  protected final String TEXT_1483 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1484 = "ListSize = ";
  protected final String TEXT_1485 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1486 = " || (";
  protected final String TEXT_1487 = " != null && ";
  protected final String TEXT_1488 = ".size() != ";
  protected final String TEXT_1489 = "ListSize";
  protected final String TEXT_1490 = ")";
  protected final String TEXT_1491 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1492 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1493 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1494 = " ";
  protected final String TEXT_1495 = " = ";
  protected final String TEXT_1496 = "(";
  protected final String TEXT_1497 = ") ";
  protected final String TEXT_1498 = "List.get(j);";
  protected final String TEXT_1499 = NL + "\t\t\t\tif (";
  protected final String TEXT_1500 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1501 = "(";
  protected final String TEXT_1502 = ")";
  protected final String TEXT_1503 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1504 = ".";
  protected final String TEXT_1505 = "()) : ";
  protected final String TEXT_1506 = ".get(j).equals(";
  protected final String TEXT_1507 = ".";
  protected final String TEXT_1508 = "())))";
  protected final String TEXT_1509 = NL + "\t\t\t\tif (";
  protected final String TEXT_1510 = " != null && !";
  protected final String TEXT_1511 = ".get(j).equals(";
  protected final String TEXT_1512 = ".";
  protected final String TEXT_1513 = "()))";
  protected final String TEXT_1514 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1515 = "Loop;";
  protected final String TEXT_1516 = NL + "\t\t\t}";
  protected final String TEXT_1517 = NL + "\t\t\t";
  protected final String TEXT_1518 = " ";
  protected final String TEXT_1519 = " = ";
  protected final String TEXT_1520 = ".";
  protected final String TEXT_1521 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1522 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1523 = "Loop;";
  protected final String TEXT_1524 = NL + "\t\t\tif (";
  protected final String TEXT_1525 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1526 = ".equalsIgnoreCase(";
  protected final String TEXT_1527 = ".";
  protected final String TEXT_1528 = "()) : ";
  protected final String TEXT_1529 = ".equals(";
  protected final String TEXT_1530 = ".";
  protected final String TEXT_1531 = "())))";
  protected final String TEXT_1532 = NL + "\t\t\tif (";
  protected final String TEXT_1533 = " != null && !";
  protected final String TEXT_1534 = ".equals(";
  protected final String TEXT_1535 = ".";
  protected final String TEXT_1536 = "()))";
  protected final String TEXT_1537 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1538 = "Loop;";
  protected final String TEXT_1539 = NL + "\t\t\tif (";
  protected final String TEXT_1540 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1541 = ".equalsIgnoreCase(";
  protected final String TEXT_1542 = ".";
  protected final String TEXT_1543 = "()) : ";
  protected final String TEXT_1544 = ".equals(";
  protected final String TEXT_1545 = ".";
  protected final String TEXT_1546 = "())))";
  protected final String TEXT_1547 = NL + "\t\t\tif (";
  protected final String TEXT_1548 = " != null && !";
  protected final String TEXT_1549 = ".equals(";
  protected final String TEXT_1550 = ".";
  protected final String TEXT_1551 = "()))";
  protected final String TEXT_1552 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1553 = "Loop;";
  protected final String TEXT_1554 = NL + "\t\t\treturn ";
  protected final String TEXT_1555 = ";" + NL + "\t\t}";
  protected final String TEXT_1556 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1557 = " && eClass != null";
  protected final String TEXT_1558 = " ? create";
  protected final String TEXT_1559 = "(";
  protected final String TEXT_1560 = ", eClass";
  protected final String TEXT_1561 = ") : null;";
  protected final String TEXT_1562 = NL + "\t\treturn null;";
  protected final String TEXT_1563 = NL + "\t}" + NL;
  protected final String TEXT_1564 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1565 = NL + "\t@Override";
  protected final String TEXT_1566 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1567 = "()" + NL + "\t{";
  protected final String TEXT_1568 = NL + "  \t\treturn false;";
  protected final String TEXT_1569 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1570 = ");";
  protected final String TEXT_1571 = NL + "\t\treturn !((";
  protected final String TEXT_1572 = ".Internal.Wrapper)";
  protected final String TEXT_1573 = "()).featureMap().isEmpty();";
  protected final String TEXT_1574 = NL + "\t\treturn ";
  protected final String TEXT_1575 = " != null && !";
  protected final String TEXT_1576 = ".featureMap().isEmpty();";
  protected final String TEXT_1577 = NL + "\t\treturn ";
  protected final String TEXT_1578 = " != null && !";
  protected final String TEXT_1579 = ".isEmpty();";
  protected final String TEXT_1580 = NL + "\t\t";
  protected final String TEXT_1581 = " ";
  protected final String TEXT_1582 = " = (";
  protected final String TEXT_1583 = ")eVirtualGet(";
  protected final String TEXT_1584 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1585 = " != null && !";
  protected final String TEXT_1586 = ".isEmpty();";
  protected final String TEXT_1587 = NL + "\t\treturn !";
  protected final String TEXT_1588 = "().isEmpty();";
  protected final String TEXT_1589 = NL + "\t\treturn ";
  protected final String TEXT_1590 = " != null;";
  protected final String TEXT_1591 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1592 = ") != null;";
  protected final String TEXT_1593 = NL + "\t\treturn basicGet";
  protected final String TEXT_1594 = "() != null;";
  protected final String TEXT_1595 = NL + "\t\treturn ";
  protected final String TEXT_1596 = " != null;";
  protected final String TEXT_1597 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1598 = ") != null;";
  protected final String TEXT_1599 = NL + "\t\treturn ";
  protected final String TEXT_1600 = "() != null;";
  protected final String TEXT_1601 = NL + "\t\treturn ((";
  protected final String TEXT_1602 = " & ";
  protected final String TEXT_1603 = "_EFLAG) != 0) != ";
  protected final String TEXT_1604 = ";";
  protected final String TEXT_1605 = NL + "\t\treturn ";
  protected final String TEXT_1606 = " != ";
  protected final String TEXT_1607 = ";";
  protected final String TEXT_1608 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1609 = ", ";
  protected final String TEXT_1610 = ") != ";
  protected final String TEXT_1611 = ";";
  protected final String TEXT_1612 = NL + "\t\treturn ";
  protected final String TEXT_1613 = "() != ";
  protected final String TEXT_1614 = ";";
  protected final String TEXT_1615 = NL + "\t\treturn ";
  protected final String TEXT_1616 = " == null ? ";
  protected final String TEXT_1617 = " != null : !";
  protected final String TEXT_1618 = ".equals(";
  protected final String TEXT_1619 = ");";
  protected final String TEXT_1620 = NL + "\t\t";
  protected final String TEXT_1621 = " ";
  protected final String TEXT_1622 = " = (";
  protected final String TEXT_1623 = ")eVirtualGet(";
  protected final String TEXT_1624 = ", ";
  protected final String TEXT_1625 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1626 = " == null ? ";
  protected final String TEXT_1627 = " != null : !";
  protected final String TEXT_1628 = ".equals(";
  protected final String TEXT_1629 = ");";
  protected final String TEXT_1630 = NL + "\t\treturn ";
  protected final String TEXT_1631 = " == null ? ";
  protected final String TEXT_1632 = "() != null : !";
  protected final String TEXT_1633 = ".equals(";
  protected final String TEXT_1634 = "());";
  protected final String TEXT_1635 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1636 = ");";
  protected final String TEXT_1637 = NL + "\t\t";
  protected final String TEXT_1638 = " ";
  protected final String TEXT_1639 = " = (";
  protected final String TEXT_1640 = ")eVirtualGet(";
  protected final String TEXT_1641 = ");";
  protected final String TEXT_1642 = NL + "\t\treturn ";
  protected final String TEXT_1643 = " != null && ((";
  protected final String TEXT_1644 = ".Unsettable";
  protected final String TEXT_1645 = ")";
  protected final String TEXT_1646 = ").isSet();";
  protected final String TEXT_1647 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1648 = ");";
  protected final String TEXT_1649 = NL + "\t\treturn (";
  protected final String TEXT_1650 = " & ";
  protected final String TEXT_1651 = "_ESETFLAG) != 0;";
  protected final String TEXT_1652 = NL + "\t\treturn ";
  protected final String TEXT_1653 = "ESet;";
  protected final String TEXT_1654 = NL + "\t\treturn !((";
  protected final String TEXT_1655 = ".Internal)((";
  protected final String TEXT_1656 = ".Internal.Wrapper)get";
  protected final String TEXT_1657 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1658 = ");";
  protected final String TEXT_1659 = NL + "\t\treturn !((";
  protected final String TEXT_1660 = ".Internal)get";
  protected final String TEXT_1661 = "()).isEmpty(";
  protected final String TEXT_1662 = ");";
  protected final String TEXT_1663 = NL;
  protected final String TEXT_1664 = NL + "\t\treturn ";
  protected final String TEXT_1665 = ".";
  protected final String TEXT_1666 = "(this);";
  protected final String TEXT_1667 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1668 = "' ";
  protected final String TEXT_1669 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1670 = NL + "\t}" + NL;
  protected final String TEXT_1671 = NL;
  protected final String TEXT_1672 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1673 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1674 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1675 = NL + "\t * @model ";
  protected final String TEXT_1676 = NL + "\t *        ";
  protected final String TEXT_1677 = NL + "\t * @model";
  protected final String TEXT_1678 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1679 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1680 = NL + "\t";
  protected final String TEXT_1681 = " ";
  protected final String TEXT_1682 = "(";
  protected final String TEXT_1683 = ")";
  protected final String TEXT_1684 = ";" + NL;
  protected final String TEXT_1685 = NL + "\t@Override";
  protected final String TEXT_1686 = NL + "\tpublic ";
  protected final String TEXT_1687 = " ";
  protected final String TEXT_1688 = "(";
  protected final String TEXT_1689 = ")";
  protected final String TEXT_1690 = NL + "\t{";
  protected final String TEXT_1691 = NL + "\t\t";
  protected final String TEXT_1692 = NL + "\t\treturn ";
  protected final String TEXT_1693 = ".";
  protected final String TEXT_1694 = "(this, ";
  protected final String TEXT_1695 = ", ";
  protected final String TEXT_1696 = ");";
  protected final String TEXT_1697 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1698 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1699 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1700 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1701 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1702 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1703 = ".";
  protected final String TEXT_1704 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1705 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1706 = "\", ";
  protected final String TEXT_1707 = ".getObjectLabel(this, ";
  protected final String TEXT_1708 = ") }),";
  protected final String TEXT_1709 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1710 = NL + "\t\t";
  protected final String TEXT_1711 = ".";
  protected final String TEXT_1712 = "(this";
  protected final String TEXT_1713 = ", ";
  protected final String TEXT_1714 = ");";
  protected final String TEXT_1715 = NL + "\t\t";
  protected final String TEXT_1716 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1717 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1718 = NL + "\t\t\t";
  protected final String TEXT_1719 = " result = (";
  protected final String TEXT_1720 = ") cache.get(";
  protected final String TEXT_1721 = "eResource(), ";
  protected final String TEXT_1722 = "this, ";
  protected final String TEXT_1723 = ".getEOperations().get(";
  protected final String TEXT_1724 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1725 = "eResource(), ";
  protected final String TEXT_1726 = "this, ";
  protected final String TEXT_1727 = ".getEOperations().get(";
  protected final String TEXT_1728 = "), result = ";
  protected final String TEXT_1729 = "new ";
  protected final String TEXT_1730 = "(";
  protected final String TEXT_1731 = ".";
  protected final String TEXT_1732 = "(this";
  protected final String TEXT_1733 = ", ";
  protected final String TEXT_1734 = ")";
  protected final String TEXT_1735 = ")";
  protected final String TEXT_1736 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1737 = ".";
  protected final String TEXT_1738 = "()";
  protected final String TEXT_1739 = ";" + NL + "\t\t}";
  protected final String TEXT_1740 = NL + "\t\treturn ";
  protected final String TEXT_1741 = ".";
  protected final String TEXT_1742 = "(this";
  protected final String TEXT_1743 = ", ";
  protected final String TEXT_1744 = ");";
  protected final String TEXT_1745 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1746 = NL + "\t}" + NL;
  protected final String TEXT_1747 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1748 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1749 = NL + "\t@Override";
  protected final String TEXT_1750 = NL + "\tpublic ";
  protected final String TEXT_1751 = " eInverseAdd(";
  protected final String TEXT_1752 = " otherEnd, int featureID, ";
  protected final String TEXT_1753 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1754 = NL + "\t\t\tcase ";
  protected final String TEXT_1755 = ":";
  protected final String TEXT_1756 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1757 = "(";
  protected final String TEXT_1758 = ".InternalMapView";
  protected final String TEXT_1759 = ")";
  protected final String TEXT_1760 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1761 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1762 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1763 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1764 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1765 = "((";
  protected final String TEXT_1766 = ")otherEnd, msgs);";
  protected final String TEXT_1767 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1768 = ", msgs);";
  protected final String TEXT_1769 = NL + "\t\t\t\t";
  protected final String TEXT_1770 = " ";
  protected final String TEXT_1771 = " = (";
  protected final String TEXT_1772 = ")eVirtualGet(";
  protected final String TEXT_1773 = ");";
  protected final String TEXT_1774 = NL + "\t\t\t\tif (";
  protected final String TEXT_1775 = " != null)";
  protected final String TEXT_1776 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1777 = ")";
  protected final String TEXT_1778 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1779 = ", null, msgs);";
  protected final String TEXT_1780 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1781 = ")";
  protected final String TEXT_1782 = ").eInverseRemove(this, ";
  protected final String TEXT_1783 = ", ";
  protected final String TEXT_1784 = ".class, msgs);";
  protected final String TEXT_1785 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1786 = "((";
  protected final String TEXT_1787 = ")otherEnd, msgs);";
  protected final String TEXT_1788 = NL + "\t\t}";
  protected final String TEXT_1789 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1790 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1791 = NL + "\t}" + NL;
  protected final String TEXT_1792 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1793 = NL + "\t@Override";
  protected final String TEXT_1794 = NL + "\tpublic ";
  protected final String TEXT_1795 = " eInverseRemove(";
  protected final String TEXT_1796 = " otherEnd, int featureID, ";
  protected final String TEXT_1797 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1798 = NL + "\t\t\tcase ";
  protected final String TEXT_1799 = ":";
  protected final String TEXT_1800 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1801 = ")((";
  protected final String TEXT_1802 = ".InternalMapView";
  protected final String TEXT_1803 = ")";
  protected final String TEXT_1804 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1805 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1806 = ")((";
  protected final String TEXT_1807 = ".Internal.Wrapper)";
  protected final String TEXT_1808 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1809 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1810 = ")";
  protected final String TEXT_1811 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1812 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1813 = ", msgs);";
  protected final String TEXT_1814 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1815 = "(msgs);";
  protected final String TEXT_1816 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1817 = "(null, msgs);";
  protected final String TEXT_1818 = NL + "\t\t}";
  protected final String TEXT_1819 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1820 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1821 = NL + "\t}" + NL;
  protected final String TEXT_1822 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1823 = NL + "\t@Override";
  protected final String TEXT_1824 = NL + "\tpublic ";
  protected final String TEXT_1825 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1826 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1827 = NL + "\t\t\tcase ";
  protected final String TEXT_1828 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1829 = ", ";
  protected final String TEXT_1830 = ".class, msgs);";
  protected final String TEXT_1831 = NL + "\t\t}";
  protected final String TEXT_1832 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1833 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1834 = NL + "\t}" + NL;
  protected final String TEXT_1835 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1836 = NL + "\t@Override";
  protected final String TEXT_1837 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1838 = NL + "\t\t\tcase ";
  protected final String TEXT_1839 = ":";
  protected final String TEXT_1840 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1841 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1842 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1843 = "(";
  protected final String TEXT_1844 = "());";
  protected final String TEXT_1845 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1846 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1847 = "();";
  protected final String TEXT_1848 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1849 = ".InternalMapView";
  protected final String TEXT_1850 = ")";
  protected final String TEXT_1851 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1852 = "();";
  protected final String TEXT_1853 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1854 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1855 = "().map();";
  protected final String TEXT_1856 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1857 = ".Internal.Wrapper)";
  protected final String TEXT_1858 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1859 = "();";
  protected final String TEXT_1860 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1861 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1862 = ".Internal)";
  protected final String TEXT_1863 = "()).getWrapper();";
  protected final String TEXT_1864 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1865 = "();";
  protected final String TEXT_1866 = NL + "\t\t}";
  protected final String TEXT_1867 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1868 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1869 = NL + "\t}" + NL;
  protected final String TEXT_1870 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1871 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1872 = NL + "\t@Override";
  protected final String TEXT_1873 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1874 = NL + "\t\t\tcase ";
  protected final String TEXT_1875 = ":";
  protected final String TEXT_1876 = NL + "\t\t\t\t((";
  protected final String TEXT_1877 = ".Internal)((";
  protected final String TEXT_1878 = ".Internal.Wrapper)";
  protected final String TEXT_1879 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1880 = NL + "\t\t\t\t((";
  protected final String TEXT_1881 = ".Internal)";
  protected final String TEXT_1882 = "()).set(newValue);";
  protected final String TEXT_1883 = NL + "\t\t\t\t((";
  protected final String TEXT_1884 = ".Setting)((";
  protected final String TEXT_1885 = ".InternalMapView";
  protected final String TEXT_1886 = ")";
  protected final String TEXT_1887 = "()).eMap()).set(newValue);";
  protected final String TEXT_1888 = NL + "\t\t\t\t((";
  protected final String TEXT_1889 = ".Setting)";
  protected final String TEXT_1890 = "()).set(newValue);";
  protected final String TEXT_1891 = NL + "\t\t\t\t";
  protected final String TEXT_1892 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1893 = "().addAll((";
  protected final String TEXT_1894 = "<? extends ";
  protected final String TEXT_1895 = ">";
  protected final String TEXT_1896 = ")newValue);";
  protected final String TEXT_1897 = NL + "\t\t\t\tset";
  protected final String TEXT_1898 = "(((";
  protected final String TEXT_1899 = ")newValue).";
  protected final String TEXT_1900 = "());";
  protected final String TEXT_1901 = NL + "\t\t\t\tset";
  protected final String TEXT_1902 = "(";
  protected final String TEXT_1903 = "(";
  protected final String TEXT_1904 = ")";
  protected final String TEXT_1905 = "newValue);";
  protected final String TEXT_1906 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1907 = NL + "\t\t}";
  protected final String TEXT_1908 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1909 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1910 = NL + "\t}" + NL;
  protected final String TEXT_1911 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1912 = NL + "\t@Override";
  protected final String TEXT_1913 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1914 = NL + "\t\t\tcase ";
  protected final String TEXT_1915 = ":";
  protected final String TEXT_1916 = NL + "\t\t\t\t((";
  protected final String TEXT_1917 = ".Internal.Wrapper)";
  protected final String TEXT_1918 = "()).featureMap().clear();";
  protected final String TEXT_1919 = NL + "\t\t\t\t";
  protected final String TEXT_1920 = "().clear();";
  protected final String TEXT_1921 = NL + "\t\t\t\tunset";
  protected final String TEXT_1922 = "();";
  protected final String TEXT_1923 = NL + "\t\t\t\tset";
  protected final String TEXT_1924 = "((";
  protected final String TEXT_1925 = ")null);";
  protected final String TEXT_1926 = NL + "\t\t\t\tset";
  protected final String TEXT_1927 = "(";
  protected final String TEXT_1928 = ");";
  protected final String TEXT_1929 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1930 = NL + "\t\t}";
  protected final String TEXT_1931 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1932 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1933 = NL + "\t}" + NL;
  protected final String TEXT_1934 = NL;
  protected final String TEXT_1935 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1936 = NL + "\t@Override";
  protected final String TEXT_1937 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1938 = NL + "\t\t\tcase ";
  protected final String TEXT_1939 = ":";
  protected final String TEXT_1940 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1941 = "();";
  protected final String TEXT_1942 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1943 = ".Internal.Wrapper)";
  protected final String TEXT_1944 = "()).featureMap().isEmpty();";
  protected final String TEXT_1945 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1946 = " != null && !";
  protected final String TEXT_1947 = ".featureMap().isEmpty();";
  protected final String TEXT_1948 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1949 = " != null && !";
  protected final String TEXT_1950 = ".isEmpty();";
  protected final String TEXT_1951 = NL + "\t\t\t\t";
  protected final String TEXT_1952 = " ";
  protected final String TEXT_1953 = " = (";
  protected final String TEXT_1954 = ")eVirtualGet(";
  protected final String TEXT_1955 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1956 = " != null && !";
  protected final String TEXT_1957 = ".isEmpty();";
  protected final String TEXT_1958 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1959 = "().isEmpty();";
  protected final String TEXT_1960 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1961 = "();";
  protected final String TEXT_1962 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1963 = " != null;";
  protected final String TEXT_1964 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1965 = ") != null;";
  protected final String TEXT_1966 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1967 = "() != null;";
  protected final String TEXT_1968 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1969 = " != null;";
  protected final String TEXT_1970 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1971 = ") != null;";
  protected final String TEXT_1972 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1973 = "() != null;";
  protected final String TEXT_1974 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1975 = " & ";
  protected final String TEXT_1976 = "_EFLAG) != 0) != ";
  protected final String TEXT_1977 = ";";
  protected final String TEXT_1978 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1979 = " != ";
  protected final String TEXT_1980 = ";";
  protected final String TEXT_1981 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1982 = ", ";
  protected final String TEXT_1983 = ") != ";
  protected final String TEXT_1984 = ";";
  protected final String TEXT_1985 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1986 = "() != ";
  protected final String TEXT_1987 = ";";
  protected final String TEXT_1988 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1989 = " == null ? ";
  protected final String TEXT_1990 = " != null : !";
  protected final String TEXT_1991 = ".equals(";
  protected final String TEXT_1992 = ");";
  protected final String TEXT_1993 = NL + "\t\t\t\t";
  protected final String TEXT_1994 = " ";
  protected final String TEXT_1995 = " = (";
  protected final String TEXT_1996 = ")eVirtualGet(";
  protected final String TEXT_1997 = ", ";
  protected final String TEXT_1998 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1999 = " == null ? ";
  protected final String TEXT_2000 = " != null : !";
  protected final String TEXT_2001 = ".equals(";
  protected final String TEXT_2002 = ");";
  protected final String TEXT_2003 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2004 = " == null ? ";
  protected final String TEXT_2005 = "() != null : !";
  protected final String TEXT_2006 = ".equals(";
  protected final String TEXT_2007 = "());";
  protected final String TEXT_2008 = NL + "\t\t}";
  protected final String TEXT_2009 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2010 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2011 = NL + "\t}" + NL;
  protected final String TEXT_2012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2013 = NL + "\t@Override";
  protected final String TEXT_2014 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2015 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2016 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2017 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2018 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2019 = ": return ";
  protected final String TEXT_2020 = ";";
  protected final String TEXT_2021 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2022 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2023 = NL + "\t@Override";
  protected final String TEXT_2024 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2025 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2026 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2027 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2028 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2029 = ": return ";
  protected final String TEXT_2030 = ";";
  protected final String TEXT_2031 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2032 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2033 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2034 = NL + "\t@Override";
  protected final String TEXT_2035 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2036 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2037 = NL + "\t@Override";
  protected final String TEXT_2038 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2039 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2040 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2041 = NL + "\t@Override";
  protected final String TEXT_2042 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2043 = NL + "\t\t\tcase ";
  protected final String TEXT_2044 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2045 = ";";
  protected final String TEXT_2046 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2047 = NL + "\t@Override";
  protected final String TEXT_2048 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2049 = NL + "\t\t\tcase ";
  protected final String TEXT_2050 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2051 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2052 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2053 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2054 = NL + "\t@Override";
  protected final String TEXT_2055 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2056 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2057 = ": \");";
  protected final String TEXT_2058 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2059 = ": \");";
  protected final String TEXT_2060 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2061 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2062 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2063 = NL + "\t\tif (";
  protected final String TEXT_2064 = "(";
  protected final String TEXT_2065 = " & ";
  protected final String TEXT_2066 = "_ESETFLAG) != 0";
  protected final String TEXT_2067 = "ESet";
  protected final String TEXT_2068 = ") result.append((";
  protected final String TEXT_2069 = " & ";
  protected final String TEXT_2070 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2071 = NL + "\t\tif (";
  protected final String TEXT_2072 = "(";
  protected final String TEXT_2073 = " & ";
  protected final String TEXT_2074 = "_ESETFLAG) != 0";
  protected final String TEXT_2075 = "ESet";
  protected final String TEXT_2076 = ") result.append(";
  protected final String TEXT_2077 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2078 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2079 = ", ";
  protected final String TEXT_2080 = "));";
  protected final String TEXT_2081 = NL + "\t\tresult.append((";
  protected final String TEXT_2082 = " & ";
  protected final String TEXT_2083 = "_EFLAG) != 0);";
  protected final String TEXT_2084 = NL + "\t\tresult.append(";
  protected final String TEXT_2085 = ");";
  protected final String TEXT_2086 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2087 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2088 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2089 = " getKey()" + NL + "\t{";
  protected final String TEXT_2090 = NL + "\t\treturn new ";
  protected final String TEXT_2091 = "(getTypedKey());";
  protected final String TEXT_2092 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2093 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2094 = " key)" + NL + "\t{";
  protected final String TEXT_2095 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2096 = "(";
  protected final String TEXT_2097 = ")";
  protected final String TEXT_2098 = "key);";
  protected final String TEXT_2099 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2100 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2101 = ")key).";
  protected final String TEXT_2102 = "());";
  protected final String TEXT_2103 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2104 = ")key);";
  protected final String TEXT_2105 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2106 = " getValue()" + NL + "\t{";
  protected final String TEXT_2107 = NL + "\t\treturn new ";
  protected final String TEXT_2108 = "(getTypedValue());";
  protected final String TEXT_2109 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2110 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2111 = " setValue(";
  protected final String TEXT_2112 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2113 = " oldValue = getValue();";
  protected final String TEXT_2114 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2115 = "(";
  protected final String TEXT_2116 = ")";
  protected final String TEXT_2117 = "value);";
  protected final String TEXT_2118 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2119 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2120 = ")value).";
  protected final String TEXT_2121 = "());";
  protected final String TEXT_2122 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2123 = ")value);";
  protected final String TEXT_2124 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2125 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2126 = NL + "\tpublic ";
  protected final String TEXT_2127 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2128 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2129 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2130 = NL;
  protected final String TEXT_2131 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2132 = " create(";
  protected final String TEXT_2133 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2134 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2135 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2136 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2137 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2138 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2139 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2140 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2141 = NL + "\t@Override";
  protected final String TEXT_2142 = NL + "\tprotected ";
  protected final String TEXT_2143 = " ";
  protected final String TEXT_2144 = "Helper(";
  protected final String TEXT_2145 = " ";
  protected final String TEXT_2146 = ")" + NL + "\t{";
  protected final String TEXT_2147 = NL + "\t\t";
  protected final String TEXT_2148 = ".addAll(super.";
  protected final String TEXT_2149 = "());";
  protected final String TEXT_2150 = NL + "\t\tsuper.";
  protected final String TEXT_2151 = "Helper(";
  protected final String TEXT_2152 = ");";
  protected final String TEXT_2153 = NL + "\t\tif (isSet";
  protected final String TEXT_2154 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2155 = "<";
  protected final String TEXT_2156 = ">";
  protected final String TEXT_2157 = " i = ((";
  protected final String TEXT_2158 = ") ";
  protected final String TEXT_2159 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2160 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2161 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2162 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2163 = "<";
  protected final String TEXT_2164 = ">";
  protected final String TEXT_2165 = " i = ((";
  protected final String TEXT_2166 = ") ";
  protected final String TEXT_2167 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2168 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2169 = NL + "\t\t";
  protected final String TEXT_2170 = " ";
  protected final String TEXT_2171 = " = ";
  protected final String TEXT_2172 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2173 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2174 = "<";
  protected final String TEXT_2175 = ">";
  protected final String TEXT_2176 = " i = ((";
  protected final String TEXT_2177 = ") ";
  protected final String TEXT_2178 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2179 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2180 = NL + "\t\tif (isSet";
  protected final String TEXT_2181 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2182 = ".addAll(";
  protected final String TEXT_2183 = "());" + NL + "\t\t}";
  protected final String TEXT_2184 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2185 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2186 = ".addAll(";
  protected final String TEXT_2187 = "());" + NL + "\t\t}";
  protected final String TEXT_2188 = NL + "\t\t";
  protected final String TEXT_2189 = " ";
  protected final String TEXT_2190 = " = ";
  protected final String TEXT_2191 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2192 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2193 = ".addAll(";
  protected final String TEXT_2194 = ");" + NL + "\t\t}";
  protected final String TEXT_2195 = NL + "\t\tif (isSet";
  protected final String TEXT_2196 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2197 = ".add(";
  protected final String TEXT_2198 = "basicGet";
  protected final String TEXT_2199 = "());" + NL + "\t\t}";
  protected final String TEXT_2200 = NL + "\t\t";
  protected final String TEXT_2201 = " ";
  protected final String TEXT_2202 = " = ";
  protected final String TEXT_2203 = "basicGet";
  protected final String TEXT_2204 = "();" + NL + "\t\tif (";
  protected final String TEXT_2205 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2206 = ".add(";
  protected final String TEXT_2207 = ");" + NL + "\t\t}";
  protected final String TEXT_2208 = NL + "\t\treturn ";
  protected final String TEXT_2209 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2210 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2211 = NL + "\t@Override";
  protected final String TEXT_2212 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2213 = "()" + NL + "\t{";
  protected final String TEXT_2214 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2215 = "()";
  protected final String TEXT_2216 = NL + "\t\treturn isSet";
  protected final String TEXT_2217 = "()";
  protected final String TEXT_2218 = ";";
  protected final String TEXT_2219 = NL + "\t\treturn !";
  protected final String TEXT_2220 = "().isEmpty()";
  protected final String TEXT_2221 = ";";
  protected final String TEXT_2222 = NL + "\t\treturn ";
  protected final String TEXT_2223 = "basicGet";
  protected final String TEXT_2224 = "() != null";
  protected final String TEXT_2225 = ";";
  protected final String TEXT_2226 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2227 = ")";
  protected final String TEXT_2228 = ";";
  protected final String TEXT_2229 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2230 = "()";
  protected final String TEXT_2231 = ";";
  protected final String TEXT_2232 = NL + "\t\t\t|| !";
  protected final String TEXT_2233 = "().isEmpty()";
  protected final String TEXT_2234 = ";";
  protected final String TEXT_2235 = NL + "\t\t\t|| ";
  protected final String TEXT_2236 = "basicGet";
  protected final String TEXT_2237 = "() != null";
  protected final String TEXT_2238 = ";";
  protected final String TEXT_2239 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2240 = ")";
  protected final String TEXT_2241 = ";";
  protected final String TEXT_2242 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2243 = "();";
  protected final String TEXT_2244 = NL + "\t\treturn false;";
  protected final String TEXT_2245 = NL + "\t}" + NL;
  protected final String TEXT_2246 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2247 = NL + "\t@Override";
  protected final String TEXT_2248 = NL + "\tpublic ";
  protected final String TEXT_2249 = " ";
  protected final String TEXT_2250 = "()" + NL + "\t{";
  protected final String TEXT_2251 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2252 = " ";
  protected final String TEXT_2253 = " = (";
  protected final String TEXT_2254 = ")((";
  protected final String TEXT_2255 = ")";
  protected final String TEXT_2256 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2257 = ";";
  protected final String TEXT_2258 = NL + "\t\treturn ";
  protected final String TEXT_2259 = "();";
  protected final String TEXT_2260 = NL + "\t\treturn new ";
  protected final String TEXT_2261 = ".UnmodifiableEList";
  protected final String TEXT_2262 = "(this, ";
  protected final String TEXT_2263 = "null";
  protected final String TEXT_2264 = ", 0, ";
  protected final String TEXT_2265 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2266 = NL + "\t\treturn null;";
  protected final String TEXT_2267 = NL + "\t\treturn ";
  protected final String TEXT_2268 = "();";
  protected final String TEXT_2269 = NL + "\t}" + NL;
  protected final String TEXT_2270 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2271 = NL + "\t@Override";
  protected final String TEXT_2272 = NL + "\tpublic ";
  protected final String TEXT_2273 = " basicGet";
  protected final String TEXT_2274 = "()" + NL + "\t{";
  protected final String TEXT_2275 = NL + "\t\treturn null;";
  protected final String TEXT_2276 = NL + "\t\treturn ";
  protected final String TEXT_2277 = "basicGet";
  protected final String TEXT_2278 = "();";
  protected final String TEXT_2279 = NL + "\t}" + NL;
  protected final String TEXT_2280 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2281 = NL + "\t@Override";
  protected final String TEXT_2282 = NL + "\tpublic ";
  protected final String TEXT_2283 = " basicSet";
  protected final String TEXT_2284 = "(";
  protected final String TEXT_2285 = " new";
  protected final String TEXT_2286 = ", ";
  protected final String TEXT_2287 = " msgs)" + NL + "\t{";
  protected final String TEXT_2288 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2289 = NL + "\t\tif (new";
  protected final String TEXT_2290 = " != null && !(new";
  protected final String TEXT_2291 = " instanceof ";
  protected final String TEXT_2292 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2293 = "));" + NL + "\t\t}";
  protected final String TEXT_2294 = NL + "\t\treturn basicSet";
  protected final String TEXT_2295 = "(";
  protected final String TEXT_2296 = "(";
  protected final String TEXT_2297 = ") ";
  protected final String TEXT_2298 = "new";
  protected final String TEXT_2299 = ", msgs);";
  protected final String TEXT_2300 = NL + "\t\tset";
  protected final String TEXT_2301 = "(";
  protected final String TEXT_2302 = "(";
  protected final String TEXT_2303 = ") ";
  protected final String TEXT_2304 = "new";
  protected final String TEXT_2305 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2306 = NL + "\t}" + NL;
  protected final String TEXT_2307 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2308 = NL + "\t@Override";
  protected final String TEXT_2309 = NL + "\tpublic void set";
  protected final String TEXT_2310 = "(";
  protected final String TEXT_2311 = " new";
  protected final String TEXT_2312 = ")" + NL + "\t{";
  protected final String TEXT_2313 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2314 = NL + "\t\tif (new";
  protected final String TEXT_2315 = " != null && !(new";
  protected final String TEXT_2316 = " instanceof ";
  protected final String TEXT_2317 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2318 = "));" + NL + "\t\t}";
  protected final String TEXT_2319 = NL + "\t\tset";
  protected final String TEXT_2320 = "(";
  protected final String TEXT_2321 = "(";
  protected final String TEXT_2322 = ") ";
  protected final String TEXT_2323 = "new";
  protected final String TEXT_2324 = ");";
  protected final String TEXT_2325 = NL + "\t}" + NL;
  protected final String TEXT_2326 = NL;
  protected final String TEXT_2327 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2328 = "() <em>";
  protected final String TEXT_2329 = "</em>}' ";
  protected final String TEXT_2330 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2331 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2332 = "_ESUBSETS = ";
  protected final String TEXT_2333 = ";" + NL;
  protected final String TEXT_2334 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2335 = "() <em>";
  protected final String TEXT_2336 = "</em>}' ";
  protected final String TEXT_2337 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2338 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2339 = "_ESUPERSETS = ";
  protected final String TEXT_2340 = ";" + NL;
  protected final String TEXT_2341 = NL + "\t/**";
  protected final String TEXT_2342 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2343 = "}, with the specified ";
  protected final String TEXT_2344 = ", and appends it to the '<em><b>";
  protected final String TEXT_2345 = "</b></em>' ";
  protected final String TEXT_2346 = ".";
  protected final String TEXT_2347 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2348 = "}, with the specified ";
  protected final String TEXT_2349 = ", and sets the '<em><b>";
  protected final String TEXT_2350 = "</b></em>' ";
  protected final String TEXT_2351 = ".";
  protected final String TEXT_2352 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2353 = "} and appends it to the '<em><b>";
  protected final String TEXT_2354 = "</b></em>' ";
  protected final String TEXT_2355 = ".";
  protected final String TEXT_2356 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2357 = "} and sets the '<em><b>";
  protected final String TEXT_2358 = "</b></em>' ";
  protected final String TEXT_2359 = ".";
  protected final String TEXT_2360 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2361 = NL + "\t * @param ";
  protected final String TEXT_2362 = " The ";
  protected final String TEXT_2363 = " for the new {@link ";
  protected final String TEXT_2364 = "}, or <code>null</code>.";
  protected final String TEXT_2365 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2366 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2367 = "}." + NL + "\t * @see #";
  protected final String TEXT_2368 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2369 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2370 = NL + "\t";
  protected final String TEXT_2371 = " create";
  protected final String TEXT_2372 = "(";
  protected final String TEXT_2373 = ", ";
  protected final String TEXT_2374 = " eClass);" + NL;
  protected final String TEXT_2375 = NL + "\t@Override";
  protected final String TEXT_2376 = NL + "\tpublic ";
  protected final String TEXT_2377 = " create";
  protected final String TEXT_2378 = "(";
  protected final String TEXT_2379 = ", ";
  protected final String TEXT_2380 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2381 = " new";
  protected final String TEXT_2382 = " = (";
  protected final String TEXT_2383 = ") create(eClass);";
  protected final String TEXT_2384 = NL + "\t\t";
  protected final String TEXT_2385 = "().add(new";
  protected final String TEXT_2386 = ");";
  protected final String TEXT_2387 = NL + "\t\tset";
  protected final String TEXT_2388 = "(new";
  protected final String TEXT_2389 = ");";
  protected final String TEXT_2390 = NL + "\t\tint ";
  protected final String TEXT_2391 = "ListSize = 0;";
  protected final String TEXT_2392 = NL + "\t\tint ";
  protected final String TEXT_2393 = "Size = ";
  protected final String TEXT_2394 = " == null ? 0 : ";
  protected final String TEXT_2395 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2396 = "Size > ";
  protected final String TEXT_2397 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2398 = "ListSize = ";
  protected final String TEXT_2399 = "Size;";
  protected final String TEXT_2400 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2401 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2402 = ".create";
  protected final String TEXT_2403 = "(";
  protected final String TEXT_2404 = ", ";
  protected final String TEXT_2405 = "i < ";
  protected final String TEXT_2406 = "Size ? (";
  protected final String TEXT_2407 = ") ";
  protected final String TEXT_2408 = ".get(i) : null";
  protected final String TEXT_2409 = ");" + NL + "\t\t}";
  protected final String TEXT_2410 = NL + "\t\tnew";
  protected final String TEXT_2411 = ".create";
  protected final String TEXT_2412 = "(";
  protected final String TEXT_2413 = ", ";
  protected final String TEXT_2414 = ");";
  protected final String TEXT_2415 = NL + "\t\tif (";
  protected final String TEXT_2416 = " != null)";
  protected final String TEXT_2417 = NL + "\t\t\tnew";
  protected final String TEXT_2418 = ".";
  protected final String TEXT_2419 = "().addAll(";
  protected final String TEXT_2420 = ");";
  protected final String TEXT_2421 = NL + "\t\t\tnew";
  protected final String TEXT_2422 = ".set";
  protected final String TEXT_2423 = "(";
  protected final String TEXT_2424 = ");";
  protected final String TEXT_2425 = NL + "\t\treturn new";
  protected final String TEXT_2426 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2427 = NL + "\t/**";
  protected final String TEXT_2428 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2429 = "}, with the specified ";
  protected final String TEXT_2430 = ", and appends it to the '<em><b>";
  protected final String TEXT_2431 = "</b></em>' ";
  protected final String TEXT_2432 = ".";
  protected final String TEXT_2433 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2434 = "},with the specified ";
  protected final String TEXT_2435 = ", and sets the '<em><b>";
  protected final String TEXT_2436 = "</b></em>' ";
  protected final String TEXT_2437 = ".";
  protected final String TEXT_2438 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2439 = "} and appends it to the '<em><b>";
  protected final String TEXT_2440 = "</b></em>' ";
  protected final String TEXT_2441 = ".";
  protected final String TEXT_2442 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2443 = "} and sets the '<em><b>";
  protected final String TEXT_2444 = "</b></em>' ";
  protected final String TEXT_2445 = ".";
  protected final String TEXT_2446 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2447 = NL + "\t * @param ";
  protected final String TEXT_2448 = " The ";
  protected final String TEXT_2449 = " for the new {@link ";
  protected final String TEXT_2450 = "}, or <code>null</code>.";
  protected final String TEXT_2451 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2452 = "}." + NL + "\t * @see #";
  protected final String TEXT_2453 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2454 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2455 = NL + "\t";
  protected final String TEXT_2456 = " create";
  protected final String TEXT_2457 = "(";
  protected final String TEXT_2458 = ");" + NL;
  protected final String TEXT_2459 = NL + "\t@Override";
  protected final String TEXT_2460 = NL + "\tpublic ";
  protected final String TEXT_2461 = " create";
  protected final String TEXT_2462 = "(";
  protected final String TEXT_2463 = ")" + NL + "\t{";
  protected final String TEXT_2464 = NL + "\t\treturn create";
  protected final String TEXT_2465 = "(";
  protected final String TEXT_2466 = ", ";
  protected final String TEXT_2467 = ");";
  protected final String TEXT_2468 = NL + "\t\t";
  protected final String TEXT_2469 = " new";
  protected final String TEXT_2470 = " = (";
  protected final String TEXT_2471 = ") create(";
  protected final String TEXT_2472 = ");";
  protected final String TEXT_2473 = NL + "\t\t";
  protected final String TEXT_2474 = "().add(new";
  protected final String TEXT_2475 = ");";
  protected final String TEXT_2476 = NL + "\t\tset";
  protected final String TEXT_2477 = "(new";
  protected final String TEXT_2478 = ");";
  protected final String TEXT_2479 = NL + "\t\tint ";
  protected final String TEXT_2480 = "ListSize = 0;";
  protected final String TEXT_2481 = NL + "\t\tint ";
  protected final String TEXT_2482 = "Size = ";
  protected final String TEXT_2483 = " == null ? 0 : ";
  protected final String TEXT_2484 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2485 = "Size > ";
  protected final String TEXT_2486 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2487 = "ListSize = ";
  protected final String TEXT_2488 = "Size;";
  protected final String TEXT_2489 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2490 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2491 = ".create";
  protected final String TEXT_2492 = "(";
  protected final String TEXT_2493 = ", ";
  protected final String TEXT_2494 = "i < ";
  protected final String TEXT_2495 = "Size ? (";
  protected final String TEXT_2496 = ") ";
  protected final String TEXT_2497 = ".get(i) : null";
  protected final String TEXT_2498 = ");" + NL + "\t\t}";
  protected final String TEXT_2499 = NL + "\t\tnew";
  protected final String TEXT_2500 = ".create";
  protected final String TEXT_2501 = "(";
  protected final String TEXT_2502 = ", ";
  protected final String TEXT_2503 = ");";
  protected final String TEXT_2504 = NL + "\t\tif (";
  protected final String TEXT_2505 = " != null)";
  protected final String TEXT_2506 = NL + "\t\t\tnew";
  protected final String TEXT_2507 = ".";
  protected final String TEXT_2508 = "().addAll(";
  protected final String TEXT_2509 = ");";
  protected final String TEXT_2510 = NL + "\t\t\tnew";
  protected final String TEXT_2511 = ".set";
  protected final String TEXT_2512 = "(";
  protected final String TEXT_2513 = ");";
  protected final String TEXT_2514 = NL + "\t\treturn new";
  protected final String TEXT_2515 = ";";
  protected final String TEXT_2516 = NL + "\t}" + NL;
  protected final String TEXT_2517 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2518 = "} with the specified ";
  protected final String TEXT_2519 = " from the '<em><b>";
  protected final String TEXT_2520 = "</b></em>' ";
  protected final String TEXT_2521 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2522 = NL + "\t * @param ";
  protected final String TEXT_2523 = " The ";
  protected final String TEXT_2524 = " of the {@link ";
  protected final String TEXT_2525 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2526 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2527 = "} with the specified ";
  protected final String TEXT_2528 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2529 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2530 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2531 = NL + "\t";
  protected final String TEXT_2532 = " get";
  protected final String TEXT_2533 = "(";
  protected final String TEXT_2534 = ");" + NL;
  protected final String TEXT_2535 = NL + "\t@Override";
  protected final String TEXT_2536 = NL + "\tpublic ";
  protected final String TEXT_2537 = " get";
  protected final String TEXT_2538 = "(";
  protected final String TEXT_2539 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2540 = "(";
  protected final String TEXT_2541 = ", false";
  protected final String TEXT_2542 = ", null";
  protected final String TEXT_2543 = ", false";
  protected final String TEXT_2544 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2545 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2546 = "} with the specified ";
  protected final String TEXT_2547 = " from the '<em><b>";
  protected final String TEXT_2548 = "</b></em>' ";
  protected final String TEXT_2549 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2550 = NL + "\t * @param ";
  protected final String TEXT_2551 = " The ";
  protected final String TEXT_2552 = " of the {@link ";
  protected final String TEXT_2553 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2554 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2555 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2556 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2557 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2558 = "} on demand if not found.";
  protected final String TEXT_2559 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2560 = "} with the specified ";
  protected final String TEXT_2561 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2562 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2563 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2564 = NL + "\t";
  protected final String TEXT_2565 = " get";
  protected final String TEXT_2566 = "(";
  protected final String TEXT_2567 = ", boolean ignoreCase";
  protected final String TEXT_2568 = ", ";
  protected final String TEXT_2569 = " eClass";
  protected final String TEXT_2570 = ", boolean createOnDemand";
  protected final String TEXT_2571 = ");" + NL;
  protected final String TEXT_2572 = NL + "\t@Override";
  protected final String TEXT_2573 = NL + "\tpublic ";
  protected final String TEXT_2574 = " get";
  protected final String TEXT_2575 = "(";
  protected final String TEXT_2576 = ", boolean ignoreCase";
  protected final String TEXT_2577 = ", ";
  protected final String TEXT_2578 = " eClass";
  protected final String TEXT_2579 = ", boolean createOnDemand";
  protected final String TEXT_2580 = ")" + NL + "\t{";
  protected final String TEXT_2581 = NL + "\t\t";
  protected final String TEXT_2582 = "Loop: for (";
  protected final String TEXT_2583 = " ";
  protected final String TEXT_2584 = " : ";
  protected final String TEXT_2585 = "())" + NL + "\t\t{";
  protected final String TEXT_2586 = NL + "\t\t";
  protected final String TEXT_2587 = "Loop: for (";
  protected final String TEXT_2588 = " i = ";
  protected final String TEXT_2589 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2590 = " ";
  protected final String TEXT_2591 = " = (";
  protected final String TEXT_2592 = ") i.next();";
  protected final String TEXT_2593 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2594 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2595 = "Loop;";
  protected final String TEXT_2596 = NL + "\t\t\t";
  protected final String TEXT_2597 = " ";
  protected final String TEXT_2598 = "List = ";
  protected final String TEXT_2599 = ".";
  protected final String TEXT_2600 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2601 = "ListSize = ";
  protected final String TEXT_2602 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2603 = " || (";
  protected final String TEXT_2604 = " != null && ";
  protected final String TEXT_2605 = ".size() != ";
  protected final String TEXT_2606 = "ListSize";
  protected final String TEXT_2607 = ")";
  protected final String TEXT_2608 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2609 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2610 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2611 = " ";
  protected final String TEXT_2612 = " = ";
  protected final String TEXT_2613 = "(";
  protected final String TEXT_2614 = ") ";
  protected final String TEXT_2615 = "List.get(j);";
  protected final String TEXT_2616 = NL + "\t\t\t\tif (";
  protected final String TEXT_2617 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2618 = "(";
  protected final String TEXT_2619 = ")";
  protected final String TEXT_2620 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2621 = ".";
  protected final String TEXT_2622 = "()) : ";
  protected final String TEXT_2623 = ".get(j).equals(";
  protected final String TEXT_2624 = ".";
  protected final String TEXT_2625 = "())))";
  protected final String TEXT_2626 = NL + "\t\t\t\tif (";
  protected final String TEXT_2627 = " != null && !";
  protected final String TEXT_2628 = ".get(j).equals(";
  protected final String TEXT_2629 = ".";
  protected final String TEXT_2630 = "()))";
  protected final String TEXT_2631 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2632 = "Loop;";
  protected final String TEXT_2633 = NL + "\t\t\t}";
  protected final String TEXT_2634 = NL + "\t\t\t";
  protected final String TEXT_2635 = " ";
  protected final String TEXT_2636 = " = ";
  protected final String TEXT_2637 = ".";
  protected final String TEXT_2638 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2639 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2640 = "Loop;";
  protected final String TEXT_2641 = NL + "\t\t\tif (";
  protected final String TEXT_2642 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2643 = ".equalsIgnoreCase(";
  protected final String TEXT_2644 = ".";
  protected final String TEXT_2645 = "()) : ";
  protected final String TEXT_2646 = ".equals(";
  protected final String TEXT_2647 = ".";
  protected final String TEXT_2648 = "())))";
  protected final String TEXT_2649 = NL + "\t\t\tif (";
  protected final String TEXT_2650 = " != null && !";
  protected final String TEXT_2651 = ".equals(";
  protected final String TEXT_2652 = ".";
  protected final String TEXT_2653 = "()))";
  protected final String TEXT_2654 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2655 = "Loop;";
  protected final String TEXT_2656 = NL + "\t\t\tif (";
  protected final String TEXT_2657 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2658 = ".equalsIgnoreCase(";
  protected final String TEXT_2659 = ".";
  protected final String TEXT_2660 = "()) : ";
  protected final String TEXT_2661 = ".equals(";
  protected final String TEXT_2662 = ".";
  protected final String TEXT_2663 = "())))";
  protected final String TEXT_2664 = NL + "\t\t\tif (";
  protected final String TEXT_2665 = " != null && !";
  protected final String TEXT_2666 = ".equals(";
  protected final String TEXT_2667 = ".";
  protected final String TEXT_2668 = "()))";
  protected final String TEXT_2669 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2670 = "Loop;";
  protected final String TEXT_2671 = NL + "\t\t\treturn ";
  protected final String TEXT_2672 = ";" + NL + "\t\t}";
  protected final String TEXT_2673 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2674 = " && eClass != null";
  protected final String TEXT_2675 = " ? create";
  protected final String TEXT_2676 = "(";
  protected final String TEXT_2677 = ", eClass";
  protected final String TEXT_2678 = ") : null;";
  protected final String TEXT_2679 = NL + "\t\treturn null;";
  protected final String TEXT_2680 = NL + "\t}" + NL;
  protected final String TEXT_2681 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2682 = NL + "\t@Override";
  protected final String TEXT_2683 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2684 = "()" + NL + "\t{";
  protected final String TEXT_2685 = NL + "  \t\treturn false;";
  protected final String TEXT_2686 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2687 = ");";
  protected final String TEXT_2688 = NL + "\t\treturn !((";
  protected final String TEXT_2689 = ".Internal.Wrapper)";
  protected final String TEXT_2690 = "()).featureMap().isEmpty();";
  protected final String TEXT_2691 = NL + "\t\treturn ";
  protected final String TEXT_2692 = " != null && !";
  protected final String TEXT_2693 = ".featureMap().isEmpty();";
  protected final String TEXT_2694 = NL + "\t\treturn ";
  protected final String TEXT_2695 = " != null && !";
  protected final String TEXT_2696 = ".isEmpty();";
  protected final String TEXT_2697 = NL + "\t\t";
  protected final String TEXT_2698 = " ";
  protected final String TEXT_2699 = " = (";
  protected final String TEXT_2700 = ")eVirtualGet(";
  protected final String TEXT_2701 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2702 = " != null && !";
  protected final String TEXT_2703 = ".isEmpty();";
  protected final String TEXT_2704 = NL + "\t\treturn !";
  protected final String TEXT_2705 = "().isEmpty();";
  protected final String TEXT_2706 = NL + "\t\treturn ";
  protected final String TEXT_2707 = " != null;";
  protected final String TEXT_2708 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2709 = ") != null;";
  protected final String TEXT_2710 = NL + "\t\treturn basicGet";
  protected final String TEXT_2711 = "() != null;";
  protected final String TEXT_2712 = NL + "\t\treturn ";
  protected final String TEXT_2713 = " != null;";
  protected final String TEXT_2714 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2715 = ") != null;";
  protected final String TEXT_2716 = NL + "\t\treturn ";
  protected final String TEXT_2717 = "() != null;";
  protected final String TEXT_2718 = NL + "\t\treturn ((";
  protected final String TEXT_2719 = " & ";
  protected final String TEXT_2720 = "_EFLAG) != 0) != ";
  protected final String TEXT_2721 = ";";
  protected final String TEXT_2722 = NL + "\t\treturn ";
  protected final String TEXT_2723 = " != ";
  protected final String TEXT_2724 = ";";
  protected final String TEXT_2725 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2726 = ", ";
  protected final String TEXT_2727 = ") != ";
  protected final String TEXT_2728 = ";";
  protected final String TEXT_2729 = NL + "\t\treturn ";
  protected final String TEXT_2730 = "() != ";
  protected final String TEXT_2731 = ";";
  protected final String TEXT_2732 = NL + "\t\treturn ";
  protected final String TEXT_2733 = " == null ? ";
  protected final String TEXT_2734 = " != null : !";
  protected final String TEXT_2735 = ".equals(";
  protected final String TEXT_2736 = ");";
  protected final String TEXT_2737 = NL + "\t\t";
  protected final String TEXT_2738 = " ";
  protected final String TEXT_2739 = " = (";
  protected final String TEXT_2740 = ")eVirtualGet(";
  protected final String TEXT_2741 = ", ";
  protected final String TEXT_2742 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2743 = " == null ? ";
  protected final String TEXT_2744 = " != null : !";
  protected final String TEXT_2745 = ".equals(";
  protected final String TEXT_2746 = ");";
  protected final String TEXT_2747 = NL + "\t\treturn ";
  protected final String TEXT_2748 = " == null ? ";
  protected final String TEXT_2749 = "() != null : !";
  protected final String TEXT_2750 = ".equals(";
  protected final String TEXT_2751 = "());";
  protected final String TEXT_2752 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2753 = ");";
  protected final String TEXT_2754 = NL + "\t\t";
  protected final String TEXT_2755 = " ";
  protected final String TEXT_2756 = " = (";
  protected final String TEXT_2757 = ")eVirtualGet(";
  protected final String TEXT_2758 = ");";
  protected final String TEXT_2759 = NL + "\t\treturn ";
  protected final String TEXT_2760 = " != null && ((";
  protected final String TEXT_2761 = ".Unsettable";
  protected final String TEXT_2762 = ")";
  protected final String TEXT_2763 = ").isSet();";
  protected final String TEXT_2764 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2765 = ");";
  protected final String TEXT_2766 = NL + "\t\treturn (";
  protected final String TEXT_2767 = " & ";
  protected final String TEXT_2768 = "_ESETFLAG) != 0;";
  protected final String TEXT_2769 = NL + "\t\treturn ";
  protected final String TEXT_2770 = "ESet;";
  protected final String TEXT_2771 = NL + "\t\treturn !((";
  protected final String TEXT_2772 = ".Internal)((";
  protected final String TEXT_2773 = ".Internal.Wrapper)get";
  protected final String TEXT_2774 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2775 = ");";
  protected final String TEXT_2776 = NL + "\t\treturn !((";
  protected final String TEXT_2777 = ".Internal)get";
  protected final String TEXT_2778 = "()).isEmpty(";
  protected final String TEXT_2779 = ");";
  protected final String TEXT_2780 = NL;
  protected final String TEXT_2781 = NL + "\t\treturn ";
  protected final String TEXT_2782 = ".";
  protected final String TEXT_2783 = "(this);";
  protected final String TEXT_2784 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2785 = "' ";
  protected final String TEXT_2786 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2787 = NL + "\t}" + NL;
  protected final String TEXT_2788 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2789 = NL + "\t@Override";
  protected final String TEXT_2790 = NL + "\tpublic ";
  protected final String TEXT_2791 = " ";
  protected final String TEXT_2792 = "(";
  protected final String TEXT_2793 = ")";
  protected final String TEXT_2794 = NL + "\t{";
  protected final String TEXT_2795 = NL + "\t\t";
  protected final String TEXT_2796 = "(";
  protected final String TEXT_2797 = ");";
  protected final String TEXT_2798 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2799 = NL + "\t\treturn ";
  protected final String TEXT_2800 = "(";
  protected final String TEXT_2801 = ");";
  protected final String TEXT_2802 = NL + "\t}" + NL;
  protected final String TEXT_2803 = NL + "} //";
  protected final String TEXT_2804 = NL;

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
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_126);
    if (!isImplementation) {
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_129);
    } else {
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_132);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_137);
    } else {
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_146);
    }
    stringBuffer.append(TEXT_147);
    if (!isImplementation) {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_155);
    }
    stringBuffer.append(TEXT_156);
    if (!isImplementation) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_160);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_162);
    } else {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_165);
    }
    stringBuffer.append(TEXT_166);
    }
    stringBuffer.append(TEXT_167);
    if (!isImplementation) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_171);
    } else {
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_179);
    }
    stringBuffer.append(TEXT_180);
    if (!isImplementation) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_183);
    } else {
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_187);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_191);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_193);
    } else {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_195);
    }
    stringBuffer.append(TEXT_196);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_198);
    } else {
    stringBuffer.append(TEXT_199);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_200);
    }
    stringBuffer.append(TEXT_201);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_203);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_205);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_207);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_209);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_211);
    }
    }
    stringBuffer.append(TEXT_212);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_215);
    }
    stringBuffer.append(TEXT_216);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_218);
    }
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_221);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_224);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_226);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_229);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_232);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_235);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_237);
    }}
    stringBuffer.append(TEXT_238);
    } else {
    stringBuffer.append(TEXT_239);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_242);
    } else {
    if (genModel.useGenerics() && (genFeature.isResolveProxies() && !genFeature.isListType() && !genFeature.isContainer() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast() || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_243);
    }
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_246);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_247);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_248);
    }
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_251);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_259);
    }
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_261);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_265);
    } else {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_268);
    }
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_270);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_273);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_279);
    }
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_291);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_296);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_300);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_304);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_305);
    }
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_307);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_310);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_313);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_314);
    }
    stringBuffer.append(TEXT_315);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_318);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_325);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_329);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_332);
    } else {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_334);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_344);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_351);
    } else {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_353);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_356);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_360);
    } else {
    stringBuffer.append(TEXT_361);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_363);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_364);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_365);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_369);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_371);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_373);
    }
    stringBuffer.append(TEXT_374);
    } else {
    stringBuffer.append(TEXT_375);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_376);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_378);
    }
    stringBuffer.append(TEXT_379);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_381);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    }
    }
    } else {
    stringBuffer.append(TEXT_385);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_387);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_391);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_392);
    }
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_394);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_395);
    }
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_397);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_401);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_402);
    }
    stringBuffer.append(TEXT_403);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_405);
    }
    stringBuffer.append(TEXT_406);
    }
    stringBuffer.append(TEXT_407);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_409);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_412);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_413);
    }
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_423);
    }
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_425);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_427);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_431);
    }
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_441);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_442);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_445);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_446);
    }
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_458);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_459);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_461);
    }
    stringBuffer.append(TEXT_462);
    }
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_467);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_468);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_469);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_471);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_472);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_475);
    } else {
    stringBuffer.append(TEXT_476);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_479);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_481);
    }
    }
    }
    }
    stringBuffer.append(TEXT_482);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_484);
    } else {
    stringBuffer.append(TEXT_485);
    }
    stringBuffer.append(TEXT_486);
    }
    } else {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_489);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_490);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_493);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_496);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_499);
    } else {
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_501);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_506);
    } else {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_510);
    }
    } else {
    stringBuffer.append(TEXT_511);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_512);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_514);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_516);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_517);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_518);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_520);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_521);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_522);
    } else {
    stringBuffer.append(TEXT_523);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_525);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_527);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_529);
    }
    }
    }
    }
    stringBuffer.append(TEXT_530);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_532);
    } else {
    stringBuffer.append(TEXT_533);
    }
    stringBuffer.append(TEXT_534);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_537);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_538);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_544);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(TEXT_549);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_551);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_555);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_558);
    }
    stringBuffer.append(TEXT_559);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_563);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_565);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_573);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_577);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_580);
    }
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_585);
    }
    stringBuffer.append(TEXT_586);
    }
    stringBuffer.append(TEXT_587);
    }
    stringBuffer.append(TEXT_588);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_592);
    } else {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_598);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_600);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_606);
    } else {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_610);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_611);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_616);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_620);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_621);
    } else {
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_623);
    }
    stringBuffer.append(TEXT_624);
    } else {
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_629);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_634);
    }
    stringBuffer.append(TEXT_635);
    }
    stringBuffer.append(TEXT_636);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_638);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_639);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_642);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_645);
    }
    stringBuffer.append(TEXT_646);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_650);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_652);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_653);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_664);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_665);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_667);
    }
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_672);
    }
    stringBuffer.append(TEXT_673);
    }
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_678);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_681);
    } else {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_683);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_686);
    }
    } else {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_689);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_690);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_697);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_700);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_702);
    }
    }
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_704);
    } else {
    stringBuffer.append(TEXT_705);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_708);
    } else {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(TEXT_713);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_718);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_720);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_722);
    }
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_724);
    }
    stringBuffer.append(TEXT_725);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_739);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_743);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_749);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_754);
    }
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_759);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_767);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_771);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_777);
    }
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_781);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_782);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_785);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_789);
    }
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_792);
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
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_804);
    }
    stringBuffer.append(TEXT_805);
    } else {
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
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_816);
    }
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_822);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_826);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_832);
    } else {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_837);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_842);
    } else {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_846);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_850);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_852);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_856);
    }
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_859);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_862);
    }
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_864);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_868);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_872);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_874);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_875);
    } else {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_877);
    }
    stringBuffer.append(TEXT_878);
    }
    } else {
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
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_887);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_889);
    }
    }
    }
    stringBuffer.append(TEXT_890);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_891);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_893);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_894);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_896);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_897);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_900);
    }
    stringBuffer.append(TEXT_901);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_902);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_905);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_907);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_908);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_911);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_915);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_919);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_922);
    }
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_927);
    }
    stringBuffer.append(TEXT_928);
    }
    stringBuffer.append(TEXT_929);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_932);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_934);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_936);
    }
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_938);
    }
    stringBuffer.append(TEXT_939);
    } else {
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_943);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_945);
    }
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_947);
    }
    stringBuffer.append(TEXT_948);
    }
    } else {
    stringBuffer.append(TEXT_949);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_950);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_953);
    } else {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_956);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_957);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_961);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_964);
    } else {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_969);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_971);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_977);
    } else {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_981);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_986);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_988);
    } else {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_990);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_991);
    } else {
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_993);
    }
    stringBuffer.append(TEXT_994);
    }
    } else {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_997);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_998);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1003);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1005);
    }
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1007);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1010);
    }
    stringBuffer.append(TEXT_1011);
    } else {
    stringBuffer.append(TEXT_1012);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1014);
    } else {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1016);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1018);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1023);
    }
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1028);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1033);
    }
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1036);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1040);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1045);
    }
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1047);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1050);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1054);
    }
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1057);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1060);
    }
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1062);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1067);
    }
    stringBuffer.append(TEXT_1068);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1073);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1076);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1080);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1082);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getCapName());
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
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1091);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1094);
    } else {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1096);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1100);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1102);
    } else {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1104);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1105);
    } else {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1107);
    }
    stringBuffer.append(TEXT_1108);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1114);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1117);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1120);
    } else {
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1122);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1126);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1131);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1132);
    } else {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1134);
    }
    stringBuffer.append(TEXT_1135);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1140);
    } else {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1144);
    }
    } else {
    stringBuffer.append(TEXT_1145);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1148);
    } else {
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1151);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1152);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1159);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1161);
    }
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1163);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1166);
    }
    stringBuffer.append(TEXT_1167);
    } else {
    stringBuffer.append(TEXT_1168);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1170);
    } else {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1172);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1174);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1179);
    }
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1184);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1186);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1189);
    } else {
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1191);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1196);
    } else {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1200);
    }
    } else {
    stringBuffer.append(TEXT_1201);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1204);
    } else {
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1207);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1208);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1209);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1216);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1223);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1224);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1229);
    } else {
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1234);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1238);
    } else {
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1242);
    }
    }
    stringBuffer.append(TEXT_1243);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1247);
    }
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1251);
    } else {
    stringBuffer.append(TEXT_1252);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1255);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1256);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1257);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1258);
    }
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1261);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1262);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1266);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1269);
    } else {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1272);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1274);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1282);
    index++;}
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1286);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1287);
    }
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1291);
    }
    stringBuffer.append(TEXT_1292);
    } else {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1295);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1296);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1297);
    }
    } else {
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1299);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1303);
    } else {
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1307);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1309);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1310);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1315);
    } else {
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1320);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1324);
    } else {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1328);
    }
    }
    stringBuffer.append(TEXT_1329);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1333);
    }
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1336);
    } else {
    stringBuffer.append(TEXT_1337);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1341);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1342);
    }
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1346);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1348);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1349);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1350);
    } else {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1355);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1358);
    } else {
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1361);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1363);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1371);
    index++;}
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1375);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1376);
    }
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1380);
    }
    stringBuffer.append(TEXT_1381);
    } else {
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1384);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1385);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1386);
    }
    } else {
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1388);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1392);
    } else {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1396);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1398);
    }
    stringBuffer.append(TEXT_1399);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1404);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1408);
    }
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1412);
    } else {
    stringBuffer.append(TEXT_1413);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1417);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1418);
    }
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1424);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1425);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1426);
    }
    stringBuffer.append(TEXT_1427);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1432);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1436);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1437);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1439);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1441);
    }
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1445);
    } else {
    stringBuffer.append(TEXT_1446);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1450);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1452);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1453);
    }
    stringBuffer.append(TEXT_1454);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1455);
    }
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1459);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1461);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1462);
    }
    stringBuffer.append(TEXT_1463);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1468);
    } else {
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1475);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1478);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1485);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1486);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1489);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1490);
    }
    }
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1495);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1497);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1498);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1500);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1502);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1508);
    } else {
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1513);
    }
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1515);
    index++;}
    stringBuffer.append(TEXT_1516);
    } else {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1523);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1531);
    } else {
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1536);
    }
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1538);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1546);
    } else {
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1551);
    }
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1553);
    }
    index++;}
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1555);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1556);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1557);
    }
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1560);
    }
    stringBuffer.append(TEXT_1561);
    } else {
    stringBuffer.append(TEXT_1562);
    }
    stringBuffer.append(TEXT_1563);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1564);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1565);
    }
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1567);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1568);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1570);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1573);
    } else {
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1576);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1579);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1586);
    } else {
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1588);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
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
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1594);
    }
    }
    } else if (genFeature.isReferenceType()) {
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
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1600);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1604);
    } else {
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1607);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1611);
    } else {
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1614);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1619);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1629);
    } else {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1634);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1636);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1641);
    }
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1646);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1648);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1651);
    } else {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1653);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1658);
    } else {
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1662);
    }
    } else {
    stringBuffer.append(TEXT_1663);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1666);
    } else {
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1669);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1670);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    stringBuffer.append(TEXT_1671);
    if (isInterface) {
    stringBuffer.append(TEXT_1672);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1674);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1677);
    }}
    stringBuffer.append(TEXT_1678);
    } else {
    stringBuffer.append(TEXT_1679);
    }
    if (!isImplementation) {
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
    } else {
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenOperations().contains(genOperation)) {
    stringBuffer.append(TEXT_1685);
    }
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1690);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1696);
    } else {
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1709);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1712);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1714);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1716);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1717);
    }
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1720);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1721);
    }
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1724);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1725);
    }
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1728);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1730);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1732);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1734);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1735);
    }
    stringBuffer.append(TEXT_1736);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1738);
    }
    stringBuffer.append(TEXT_1739);
    }
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1742);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1744);
    }
    } else {
    stringBuffer.append(TEXT_1745);
    }
    }
    stringBuffer.append(TEXT_1746);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1747);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1748);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1749);
    }
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1753);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1755);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1760);
    } else {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1762);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1763);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1766);
    } else {
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1768);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1773);
    }
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1775);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1779);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1784);
    }
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1787);
    }
    }
    stringBuffer.append(TEXT_1788);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1789);
    } else {
    stringBuffer.append(TEXT_1790);
    }
    stringBuffer.append(TEXT_1791);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1792);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1793);
    }
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1797);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1799);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1804);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1808);
    } else {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1811);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1813);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1815);
    } else {
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1817);
    }
    }
    stringBuffer.append(TEXT_1818);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1819);
    } else {
    stringBuffer.append(TEXT_1820);
    }
    stringBuffer.append(TEXT_1821);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1822);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1823);
    }
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1826);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1830);
    }
    stringBuffer.append(TEXT_1831);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1832);
    } else {
    stringBuffer.append(TEXT_1833);
    }
    stringBuffer.append(TEXT_1834);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1835);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1836);
    }
    stringBuffer.append(TEXT_1837);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1839);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1841);
    } else {
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1844);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1847);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1852);
    } else {
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1855);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1859);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1863);
    } else {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1865);
    }
    }
    stringBuffer.append(TEXT_1866);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1867);
    } else {
    stringBuffer.append(TEXT_1868);
    }
    stringBuffer.append(TEXT_1869);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1870);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1871);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1872);
    }
    stringBuffer.append(TEXT_1873);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1875);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1879);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1882);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1887);
    } else {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1890);
    }
    } else {
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1895);
    }
    stringBuffer.append(TEXT_1896);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1900);
    } else {
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1902);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType())) {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1904);
    }
    stringBuffer.append(TEXT_1905);
    }
    stringBuffer.append(TEXT_1906);
    }
    stringBuffer.append(TEXT_1907);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1908);
    } else {
    stringBuffer.append(TEXT_1909);
    }
    stringBuffer.append(TEXT_1910);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1911);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1912);
    }
    stringBuffer.append(TEXT_1913);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1915);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1918);
    } else {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1920);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1922);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1925);
    } else {
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1928);
    }
    stringBuffer.append(TEXT_1929);
    }
    stringBuffer.append(TEXT_1930);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1931);
    } else {
    stringBuffer.append(TEXT_1932);
    }
    stringBuffer.append(TEXT_1933);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(TEXT_1935);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1936);
    }
    stringBuffer.append(TEXT_1937);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1939);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1941);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1944);
    } else {
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1947);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1950);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1957);
    } else {
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1959);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1961);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1963);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1965);
    } else {
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1967);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1969);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1971);
    } else {
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1973);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1977);
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
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getImportedType());
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
    }
    }
    stringBuffer.append(TEXT_2008);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2009);
    } else {
    stringBuffer.append(TEXT_2010);
    }
    stringBuffer.append(TEXT_2011);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2012);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2013);
    }
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2015);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2017);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2020);
    }
    stringBuffer.append(TEXT_2021);
    }
    stringBuffer.append(TEXT_2022);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2023);
    }
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2025);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2027);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2030);
    }
    stringBuffer.append(TEXT_2031);
    }
    stringBuffer.append(TEXT_2032);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2033);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2034);
    }
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2036);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2037);
    }
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2039);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2040);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2041);
    }
    stringBuffer.append(TEXT_2042);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2045);
    }
    stringBuffer.append(TEXT_2046);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2047);
    }
    stringBuffer.append(TEXT_2048);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2051);
    }
    stringBuffer.append(TEXT_2052);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2053);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2054);
    }
    stringBuffer.append(TEXT_2055);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2063);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2066);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2067);
    }
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2071);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2074);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2075);
    }
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2080);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2083);
    } else {
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2085);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2086);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType() : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType() : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2089);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2091);
    } else {
    stringBuffer.append(TEXT_2092);
    }
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2094);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2095);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2097);
    }
    stringBuffer.append(TEXT_2098);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2099);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2102);
    } else {
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_2104);
    }
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2106);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2108);
    } else {
    stringBuffer.append(TEXT_2109);
    }
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2113);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2114);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2116);
    }
    stringBuffer.append(TEXT_2117);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2118);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2121);
    } else {
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_2123);
    }
    stringBuffer.append(TEXT_2124);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2125);
    }
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2129);
    }
    stringBuffer.append(TEXT_2130);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genModel)) {
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2134);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2139);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2140);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2141);
    }
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2146);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2149);
    } else {
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2152);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2156);
    }
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2160);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
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
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2175);
    }
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2179);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2183);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2187);
    } else {
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2194);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2197);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2199);
    } else {
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2202);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2207);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2209);
    }
    }
    }
    stringBuffer.append(TEXT_2210);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2211);
    }
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2213);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2215);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2217);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2218);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2220);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2221);
    }
    } else {
    stringBuffer.append(TEXT_2222);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2224);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2225);
    }
    }
    } else {
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2227);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2228);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2230);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2231);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2233);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2234);
    }
    } else {
    stringBuffer.append(TEXT_2235);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2237);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2238);
    }
    }
    } else {
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2240);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2241);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2243);
    } else {
    stringBuffer.append(TEXT_2244);
    }
    }
    stringBuffer.append(TEXT_2245);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2246);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2247);
    }
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2250);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType().equals(genFeature.getListItemType())) {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2257);
    } else {
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2259);
    }
    } else {
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2261);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType() + ">");
    }
    stringBuffer.append(TEXT_2262);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2263);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2265);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2266);
    } else {
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2268);
    }
    }
    stringBuffer.append(TEXT_2269);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2270);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2271);
    }
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2274);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2275);
    } else {
    stringBuffer.append(TEXT_2276);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2278);
    }
    stringBuffer.append(TEXT_2279);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2280);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2281);
    }
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2287);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2288);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2293);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2295);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2297);
    }
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2299);
    } else {
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2301);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2303);
    }
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2305);
    }
    }
    stringBuffer.append(TEXT_2306);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2307);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2308);
    }
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2312);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2313);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2318);
    }
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2320);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2322);
    }
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2324);
    }
    stringBuffer.append(TEXT_2325);
    }
    stringBuffer.append(TEXT_2326);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2333);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
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
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2340);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2341);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2346);
    } else {
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2351);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2355);
    } else {
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2359);
    }
    }
    stringBuffer.append(TEXT_2360);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2364);
    }
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2368);
    } else {
    stringBuffer.append(TEXT_2369);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2372);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2373);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2374);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2375);
    }
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2378);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2379);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2383);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2386);
    } else {
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2389);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2391);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2399);
    index++;}
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2403);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2404);
    }
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2408);
    }
    stringBuffer.append(TEXT_2409);
    } else {
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2412);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2413);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2414);
    }
    } else {
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2416);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2420);
    } else {
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2424);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2426);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2427);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2432);
    } else {
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2437);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2441);
    } else {
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2445);
    }
    }
    stringBuffer.append(TEXT_2446);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2450);
    }
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2453);
    } else {
    stringBuffer.append(TEXT_2454);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2458);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2459);
    }
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2463);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2465);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2466);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2467);
    } else {
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2472);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2475);
    } else {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2478);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2480);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2488);
    index++;}
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2492);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2493);
    }
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2497);
    }
    stringBuffer.append(TEXT_2498);
    } else {
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2501);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2502);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2503);
    }
    } else {
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2505);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2509);
    } else {
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2513);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2515);
    }
    stringBuffer.append(TEXT_2516);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2521);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2525);
    }
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2529);
    } else {
    stringBuffer.append(TEXT_2530);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2534);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2535);
    }
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2541);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2542);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2543);
    }
    stringBuffer.append(TEXT_2544);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2549);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2553);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2554);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2556);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2558);
    }
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2562);
    } else {
    stringBuffer.append(TEXT_2563);
    }
    if (!isImplementation) {
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
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2572);
    }
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2576);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2578);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2579);
    }
    stringBuffer.append(TEXT_2580);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2585);
    } else {
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2592);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2595);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2602);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2603);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2606);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2607);
    }
    }
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2612);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2614);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2615);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2617);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2619);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2625);
    } else {
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2630);
    }
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2632);
    index++;}
    stringBuffer.append(TEXT_2633);
    } else {
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2640);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2648);
    } else {
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2653);
    }
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2655);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2663);
    } else {
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2668);
    }
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2670);
    }
    index++;}
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2672);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2673);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2674);
    }
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2677);
    }
    stringBuffer.append(TEXT_2678);
    } else {
    stringBuffer.append(TEXT_2679);
    }
    stringBuffer.append(TEXT_2680);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2681);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2682);
    }
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2684);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2685);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2687);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2690);
    } else {
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2693);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2696);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2703);
    } else {
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2705);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2707);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2709);
    } else {
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2711);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2713);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2715);
    } else {
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2717);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2721);
    } else {
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2724);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2728);
    } else {
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2731);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2736);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2746);
    } else {
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2751);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2753);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2758);
    }
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2763);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2765);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2768);
    } else {
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2770);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2775);
    } else {
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2779);
    }
    } else {
    stringBuffer.append(TEXT_2780);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2783);
    } else {
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2786);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2787);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2788);
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genOperation) && !UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_2789);
    }
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2794);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2797);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2798);
    } else {
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2801);
    }
    }
    stringBuffer.append(TEXT_2802);
    }
    }
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2804);
    return stringBuffer.toString();
  }
}
