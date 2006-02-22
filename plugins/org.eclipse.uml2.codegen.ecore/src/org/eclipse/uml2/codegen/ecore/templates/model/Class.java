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
  protected final String TEXT_81 = "_EDEFAULT = ";
  protected final String TEXT_82 = ";";
  protected final String TEXT_83 = NL;
  protected final String TEXT_84 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_85 = " = 0;" + NL;
  protected final String TEXT_86 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_87 = "() <em>";
  protected final String TEXT_88 = "</em>}' ";
  protected final String TEXT_89 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_90 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_91 = "_EFLAG = 1 ";
  protected final String TEXT_92 = ";" + NL;
  protected final String TEXT_93 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_94 = "() <em>";
  protected final String TEXT_95 = "</em>}' ";
  protected final String TEXT_96 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_97 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_98 = " ";
  protected final String TEXT_99 = " = ";
  protected final String TEXT_100 = "_EDEFAULT;" + NL;
  protected final String TEXT_101 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_102 = " = 0;" + NL;
  protected final String TEXT_103 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_104 = " ";
  protected final String TEXT_105 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_106 = "_ESETFLAG = 1 ";
  protected final String TEXT_107 = ";" + NL;
  protected final String TEXT_108 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_109 = " ";
  protected final String TEXT_110 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_111 = "ESet = false;" + NL;
  protected final String TEXT_112 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_113 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_114 = NL + "\t\t";
  protected final String TEXT_115 = " |= ";
  protected final String TEXT_116 = "_EFLAG;";
  protected final String TEXT_117 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_118 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_119 = ";" + NL + "\t}" + NL;
  protected final String TEXT_120 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_121 = NL + "\t";
  protected final String TEXT_122 = "[] ";
  protected final String TEXT_123 = "();" + NL;
  protected final String TEXT_124 = NL + "\tpublic ";
  protected final String TEXT_125 = "[] ";
  protected final String TEXT_126 = "()" + NL + "\t{";
  protected final String TEXT_127 = NL + "\t\t";
  protected final String TEXT_128 = " list = (";
  protected final String TEXT_129 = ")";
  protected final String TEXT_130 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_131 = "_EEMPTY_ARRAY;";
  protected final String TEXT_132 = NL + "\t\tif (";
  protected final String TEXT_133 = " == null || ";
  protected final String TEXT_134 = ".isEmpty()) return ";
  protected final String TEXT_135 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_136 = " list = (";
  protected final String TEXT_137 = ")";
  protected final String TEXT_138 = ";";
  protected final String TEXT_139 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_140 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_142 = NL + "\t";
  protected final String TEXT_143 = " get";
  protected final String TEXT_144 = "(int index);" + NL;
  protected final String TEXT_145 = NL + "\tpublic ";
  protected final String TEXT_146 = " get";
  protected final String TEXT_147 = "(int index)" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_148 = ")";
  protected final String TEXT_149 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_150 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_151 = NL + "\tint get";
  protected final String TEXT_152 = "Length();" + NL;
  protected final String TEXT_153 = NL + "\tpublic int get";
  protected final String TEXT_154 = "Length()" + NL + "\t{";
  protected final String TEXT_155 = NL + "\t\treturn ";
  protected final String TEXT_156 = "().size();";
  protected final String TEXT_157 = NL + "\t\treturn ";
  protected final String TEXT_158 = " == null ? 0 : ";
  protected final String TEXT_159 = ".size();";
  protected final String TEXT_160 = NL + "\t}" + NL;
  protected final String TEXT_161 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_162 = NL + "\tvoid set";
  protected final String TEXT_163 = "(";
  protected final String TEXT_164 = "[] new";
  protected final String TEXT_165 = ");" + NL;
  protected final String TEXT_166 = NL + "\tpublic void set";
  protected final String TEXT_167 = "(";
  protected final String TEXT_168 = "[] new";
  protected final String TEXT_169 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_170 = ")";
  protected final String TEXT_171 = "()).setData(new";
  protected final String TEXT_172 = ".length, new";
  protected final String TEXT_173 = ");" + NL + "\t}" + NL;
  protected final String TEXT_174 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_175 = NL + "\tvoid set";
  protected final String TEXT_176 = "(int index, ";
  protected final String TEXT_177 = " element);" + NL;
  protected final String TEXT_178 = NL + "\tpublic void set";
  protected final String TEXT_179 = "(int index, ";
  protected final String TEXT_180 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_181 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_182 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_183 = "</b></em>' ";
  protected final String TEXT_184 = ".";
  protected final String TEXT_185 = NL + "\t * The key is of type ";
  protected final String TEXT_186 = "list of {@link ";
  protected final String TEXT_187 = "}";
  protected final String TEXT_188 = "{@link ";
  protected final String TEXT_189 = "}";
  protected final String TEXT_190 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_191 = "list of {@link ";
  protected final String TEXT_192 = "}";
  protected final String TEXT_193 = "{@link ";
  protected final String TEXT_194 = "}";
  protected final String TEXT_195 = ",";
  protected final String TEXT_196 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_197 = "}.";
  protected final String TEXT_198 = NL + "\t * The default value is <code>";
  protected final String TEXT_199 = "</code>.";
  protected final String TEXT_200 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_201 = "}.";
  protected final String TEXT_202 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_203 = "#";
  protected final String TEXT_204 = " <em>";
  protected final String TEXT_205 = "</em>}'.";
  protected final String TEXT_206 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_207 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_208 = "</em>' ";
  protected final String TEXT_209 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_210 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_211 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_212 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_213 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_214 = "</em>' ";
  protected final String TEXT_215 = ".";
  protected final String TEXT_216 = NL + "\t * @see ";
  protected final String TEXT_217 = NL + "\t * @see #isSet";
  protected final String TEXT_218 = "()";
  protected final String TEXT_219 = NL + "\t * @see #unset";
  protected final String TEXT_220 = "()";
  protected final String TEXT_221 = NL + "\t * @see #set";
  protected final String TEXT_222 = "(";
  protected final String TEXT_223 = ")";
  protected final String TEXT_224 = NL + "\t * @see ";
  protected final String TEXT_225 = "#get";
  protected final String TEXT_226 = "()";
  protected final String TEXT_227 = NL + "\t * @see ";
  protected final String TEXT_228 = "#";
  protected final String TEXT_229 = NL + "\t * @model ";
  protected final String TEXT_230 = NL + "\t *        ";
  protected final String TEXT_231 = NL + "\t * @model";
  protected final String TEXT_232 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_233 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_234 = NL + "\t";
  protected final String TEXT_235 = " ";
  protected final String TEXT_236 = "();" + NL;
  protected final String TEXT_237 = NL + "\tpublic ";
  protected final String TEXT_238 = " ";
  protected final String TEXT_239 = "()" + NL + "\t{";
  protected final String TEXT_240 = NL + "\t\treturn ";
  protected final String TEXT_241 = "(";
  protected final String TEXT_242 = "(";
  protected final String TEXT_243 = ")eGet(";
  protected final String TEXT_244 = ", true)";
  protected final String TEXT_245 = ").";
  protected final String TEXT_246 = "()";
  protected final String TEXT_247 = ";";
  protected final String TEXT_248 = NL + "\t\t";
  protected final String TEXT_249 = " ";
  protected final String TEXT_250 = " = (";
  protected final String TEXT_251 = ")eVirtualGet(";
  protected final String TEXT_252 = ");";
  protected final String TEXT_253 = NL + "\t\tif (";
  protected final String TEXT_254 = " == null)" + NL + "\t\t{";
  protected final String TEXT_255 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_256 = ", ";
  protected final String TEXT_257 = " = new ";
  protected final String TEXT_258 = ");";
  protected final String TEXT_259 = NL + "\t\t\t";
  protected final String TEXT_260 = " = new ";
  protected final String TEXT_261 = ";";
  protected final String TEXT_262 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_263 = ";";
  protected final String TEXT_264 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_265 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_266 = ")eContainer();";
  protected final String TEXT_267 = NL + "\t\t";
  protected final String TEXT_268 = " ";
  protected final String TEXT_269 = " = (";
  protected final String TEXT_270 = ")eVirtualGet(";
  protected final String TEXT_271 = ", ";
  protected final String TEXT_272 = "_EDEFAULT";
  protected final String TEXT_273 = ");";
  protected final String TEXT_274 = NL + "\t\tif (";
  protected final String TEXT_275 = " != null && ";
  protected final String TEXT_276 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_277 = " old";
  protected final String TEXT_278 = " = (";
  protected final String TEXT_279 = ")";
  protected final String TEXT_280 = ";" + NL + "\t\t\t";
  protected final String TEXT_281 = " = ";
  protected final String TEXT_282 = "eResolveProxy(old";
  protected final String TEXT_283 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_284 = " != old";
  protected final String TEXT_285 = ")" + NL + "\t\t\t{";
  protected final String TEXT_286 = NL + "\t\t\t\t";
  protected final String TEXT_287 = " new";
  protected final String TEXT_288 = " = (";
  protected final String TEXT_289 = ")";
  protected final String TEXT_290 = ";";
  protected final String TEXT_291 = NL + "\t\t\t\t";
  protected final String TEXT_292 = " msgs = old";
  protected final String TEXT_293 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_294 = ", null, null);";
  protected final String TEXT_295 = NL + "\t\t\t\t";
  protected final String TEXT_296 = " msgs =  old";
  protected final String TEXT_297 = ".eInverseRemove(this, ";
  protected final String TEXT_298 = ", ";
  protected final String TEXT_299 = ".class, null);";
  protected final String TEXT_300 = NL + "\t\t\t\tif (new";
  protected final String TEXT_301 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_302 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_303 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_304 = ", null, msgs);";
  protected final String TEXT_305 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_306 = ".eInverseAdd(this, ";
  protected final String TEXT_307 = ", ";
  protected final String TEXT_308 = ".class, msgs);";
  protected final String TEXT_309 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_310 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_311 = ", ";
  protected final String TEXT_312 = ");";
  protected final String TEXT_313 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_314 = "(this, ";
  protected final String TEXT_315 = ".RESOLVE, ";
  protected final String TEXT_316 = ", old";
  protected final String TEXT_317 = ", ";
  protected final String TEXT_318 = "));";
  protected final String TEXT_319 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_320 = NL + "\t\treturn (";
  protected final String TEXT_321 = ")eVirtualGet(";
  protected final String TEXT_322 = ", ";
  protected final String TEXT_323 = "_EDEFAULT";
  protected final String TEXT_324 = ");";
  protected final String TEXT_325 = NL + "\t\treturn (";
  protected final String TEXT_326 = " & ";
  protected final String TEXT_327 = "_EFLAG) != 0;";
  protected final String TEXT_328 = NL + "\t\treturn ";
  protected final String TEXT_329 = ";";
  protected final String TEXT_330 = NL + "\t\t";
  protected final String TEXT_331 = " ";
  protected final String TEXT_332 = " = basicGet";
  protected final String TEXT_333 = "();" + NL + "\t\treturn ";
  protected final String TEXT_334 = " != null && ";
  protected final String TEXT_335 = ".eIsProxy() ? ";
  protected final String TEXT_336 = "eResolveProxy((";
  protected final String TEXT_337 = ")";
  protected final String TEXT_338 = ") : ";
  protected final String TEXT_339 = ";";
  protected final String TEXT_340 = NL + "\t\treturn new ";
  protected final String TEXT_341 = "((";
  protected final String TEXT_342 = ".Internal)((";
  protected final String TEXT_343 = ".Internal.Wrapper)get";
  protected final String TEXT_344 = "()).featureMap().list(";
  protected final String TEXT_345 = "));";
  protected final String TEXT_346 = NL + "\t\treturn (";
  protected final String TEXT_347 = ")((";
  protected final String TEXT_348 = ")get";
  protected final String TEXT_349 = "()).list(";
  protected final String TEXT_350 = ");";
  protected final String TEXT_351 = NL + "\t\treturn ((";
  protected final String TEXT_352 = ".Internal.Wrapper)get";
  protected final String TEXT_353 = "()).featureMap().list(";
  protected final String TEXT_354 = ");";
  protected final String TEXT_355 = NL + "\t\treturn ((";
  protected final String TEXT_356 = ")get";
  protected final String TEXT_357 = "()).list(";
  protected final String TEXT_358 = ");";
  protected final String TEXT_359 = NL + "\t\treturn ";
  protected final String TEXT_360 = "(";
  protected final String TEXT_361 = "(";
  protected final String TEXT_362 = ")((";
  protected final String TEXT_363 = ".Internal.Wrapper)get";
  protected final String TEXT_364 = "()).featureMap().get(";
  protected final String TEXT_365 = ", true)";
  protected final String TEXT_366 = ").";
  protected final String TEXT_367 = "()";
  protected final String TEXT_368 = ";";
  protected final String TEXT_369 = NL + "\t\treturn ";
  protected final String TEXT_370 = "(";
  protected final String TEXT_371 = "(";
  protected final String TEXT_372 = ")get";
  protected final String TEXT_373 = "().get(";
  protected final String TEXT_374 = ", true)";
  protected final String TEXT_375 = ").";
  protected final String TEXT_376 = "()";
  protected final String TEXT_377 = ";";
  protected final String TEXT_378 = NL;
  protected final String TEXT_379 = NL + "\t\t";
  protected final String TEXT_380 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_381 = " result = (";
  protected final String TEXT_382 = ") cache.get(";
  protected final String TEXT_383 = "eResource(), ";
  protected final String TEXT_384 = "this, ";
  protected final String TEXT_385 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_386 = "eResource(), ";
  protected final String TEXT_387 = "this, ";
  protected final String TEXT_388 = ", result = ";
  protected final String TEXT_389 = "new ";
  protected final String TEXT_390 = "(";
  protected final String TEXT_391 = ".";
  protected final String TEXT_392 = "(this)";
  protected final String TEXT_393 = ")";
  protected final String TEXT_394 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_395 = ".";
  protected final String TEXT_396 = "()";
  protected final String TEXT_397 = ";" + NL + "\t\t}";
  protected final String TEXT_398 = NL + "\t\treturn ";
  protected final String TEXT_399 = ".";
  protected final String TEXT_400 = "(this);";
  protected final String TEXT_401 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_402 = "' ";
  protected final String TEXT_403 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_404 = NL + "\t}" + NL;
  protected final String TEXT_405 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_406 = " basicGet";
  protected final String TEXT_407 = "()" + NL + "\t{";
  protected final String TEXT_408 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_409 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_410 = ")eInternalContainer();";
  protected final String TEXT_411 = NL + "\t\treturn (";
  protected final String TEXT_412 = ")eVirtualGet(";
  protected final String TEXT_413 = ");";
  protected final String TEXT_414 = NL + "\t\treturn ";
  protected final String TEXT_415 = ";";
  protected final String TEXT_416 = NL + "\t\treturn (";
  protected final String TEXT_417 = ")((";
  protected final String TEXT_418 = ".Internal.Wrapper)get";
  protected final String TEXT_419 = "()).featureMap().get(";
  protected final String TEXT_420 = ", false);";
  protected final String TEXT_421 = NL + "\t\treturn (";
  protected final String TEXT_422 = ")get";
  protected final String TEXT_423 = "().get(";
  protected final String TEXT_424 = ", false);";
  protected final String TEXT_425 = NL;
  protected final String TEXT_426 = NL + "\t\treturn ";
  protected final String TEXT_427 = ".";
  protected final String TEXT_428 = "(this);";
  protected final String TEXT_429 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_430 = "' ";
  protected final String TEXT_431 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_432 = NL + "\t}" + NL;
  protected final String TEXT_433 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_434 = " basicSet";
  protected final String TEXT_435 = "(";
  protected final String TEXT_436 = " new";
  protected final String TEXT_437 = ", ";
  protected final String TEXT_438 = " msgs)" + NL + "\t{";
  protected final String TEXT_439 = NL;
  protected final String TEXT_440 = NL + "\t\tif (new";
  protected final String TEXT_441 = " != null && !";
  protected final String TEXT_442 = "().contains(new";
  protected final String TEXT_443 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_444 = "().add(new";
  protected final String TEXT_445 = ");" + NL + "\t\t}";
  protected final String TEXT_446 = NL + "\t\tObject old";
  protected final String TEXT_447 = " = eVirtualSet(";
  protected final String TEXT_448 = ", new";
  protected final String TEXT_449 = ");";
  protected final String TEXT_450 = NL + "\t\t";
  protected final String TEXT_451 = " old";
  protected final String TEXT_452 = " = ";
  protected final String TEXT_453 = ";" + NL + "\t\t";
  protected final String TEXT_454 = " = new";
  protected final String TEXT_455 = ";";
  protected final String TEXT_456 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_457 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_458 = NL + "\t\tboolean old";
  protected final String TEXT_459 = "ESet = (";
  protected final String TEXT_460 = " & ";
  protected final String TEXT_461 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_462 = " |= ";
  protected final String TEXT_463 = "_ESETFLAG;";
  protected final String TEXT_464 = NL + "\t\tboolean old";
  protected final String TEXT_465 = "ESet = ";
  protected final String TEXT_466 = "ESet;" + NL + "\t\t";
  protected final String TEXT_467 = "ESet = true;";
  protected final String TEXT_468 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_469 = NL + "\t\t\t";
  protected final String TEXT_470 = " notification = new ";
  protected final String TEXT_471 = "(this, ";
  protected final String TEXT_472 = ".SET, ";
  protected final String TEXT_473 = ", ";
  protected final String TEXT_474 = "isSetChange ? null : old";
  protected final String TEXT_475 = "old";
  protected final String TEXT_476 = ", new";
  protected final String TEXT_477 = ", ";
  protected final String TEXT_478 = "isSetChange";
  protected final String TEXT_479 = "!old";
  protected final String TEXT_480 = "ESet";
  protected final String TEXT_481 = ");";
  protected final String TEXT_482 = NL + "\t\t\t";
  protected final String TEXT_483 = " notification = new ";
  protected final String TEXT_484 = "(this, ";
  protected final String TEXT_485 = ".SET, ";
  protected final String TEXT_486 = ", ";
  protected final String TEXT_487 = "old";
  protected final String TEXT_488 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_489 = "old";
  protected final String TEXT_490 = ", new";
  protected final String TEXT_491 = ");";
  protected final String TEXT_492 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_493 = NL;
  protected final String TEXT_494 = NL + "\t\tif (";
  protected final String TEXT_495 = " != null && ";
  protected final String TEXT_496 = " != new";
  protected final String TEXT_497 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_498 = "(null);" + NL + "\t\t}";
  protected final String TEXT_499 = NL + "\t\tif (new";
  protected final String TEXT_500 = " != null ||  old";
  protected final String TEXT_501 = " == ";
  protected final String TEXT_502 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_503 = "(new";
  protected final String TEXT_504 = ");" + NL + "\t\t}";
  protected final String TEXT_505 = NL + "\t\treturn msgs;";
  protected final String TEXT_506 = NL + "\t\treturn ((";
  protected final String TEXT_507 = ".Internal)((";
  protected final String TEXT_508 = ".Internal.Wrapper)get";
  protected final String TEXT_509 = "()).featureMap()).basicAdd(";
  protected final String TEXT_510 = ", new";
  protected final String TEXT_511 = ", msgs);";
  protected final String TEXT_512 = NL + "\t\treturn ((";
  protected final String TEXT_513 = ".Internal)get";
  protected final String TEXT_514 = "()).basicAdd(";
  protected final String TEXT_515 = ", new";
  protected final String TEXT_516 = ", msgs);";
  protected final String TEXT_517 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_518 = "' ";
  protected final String TEXT_519 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_520 = NL + "\t}" + NL;
  protected final String TEXT_521 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_522 = "#";
  protected final String TEXT_523 = " <em>";
  protected final String TEXT_524 = "</em>}' ";
  protected final String TEXT_525 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_526 = "</em>' ";
  protected final String TEXT_527 = ".";
  protected final String TEXT_528 = NL + "\t * @see ";
  protected final String TEXT_529 = NL + "\t * @see #isSet";
  protected final String TEXT_530 = "()";
  protected final String TEXT_531 = NL + "\t * @see #unset";
  protected final String TEXT_532 = "()";
  protected final String TEXT_533 = NL + "\t * @see #";
  protected final String TEXT_534 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_535 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_536 = NL + "\tvoid set";
  protected final String TEXT_537 = "(";
  protected final String TEXT_538 = " value);" + NL;
  protected final String TEXT_539 = NL + "\tpublic void set";
  protected final String TEXT_540 = "(";
  protected final String TEXT_541 = " new";
  protected final String TEXT_542 = ")" + NL + "\t{";
  protected final String TEXT_543 = NL;
  protected final String TEXT_544 = NL + "\t\tnew";
  protected final String TEXT_545 = " = new";
  protected final String TEXT_546 = " == null ? ";
  protected final String TEXT_547 = "_EDEFAULT : new";
  protected final String TEXT_548 = ";";
  protected final String TEXT_549 = NL + "\t\tif (new";
  protected final String TEXT_550 = " != null && !";
  protected final String TEXT_551 = "().contains(new";
  protected final String TEXT_552 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_553 = "().add(new";
  protected final String TEXT_554 = ");" + NL + "\t\t}";
  protected final String TEXT_555 = NL + "\t\t";
  protected final String TEXT_556 = " old";
  protected final String TEXT_557 = " = eContainer();";
  protected final String TEXT_558 = NL + "\t\teSet(";
  protected final String TEXT_559 = ", ";
  protected final String TEXT_560 = "new ";
  protected final String TEXT_561 = "(";
  protected final String TEXT_562 = "new";
  protected final String TEXT_563 = ")";
  protected final String TEXT_564 = ");";
  protected final String TEXT_565 = NL + "\t\tif (new";
  protected final String TEXT_566 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_567 = " && new";
  protected final String TEXT_568 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_569 = ".isAncestor(this, ";
  protected final String TEXT_570 = "new";
  protected final String TEXT_571 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_572 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_573 = NL + "\t\t\t";
  protected final String TEXT_574 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_575 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_576 = ")new";
  protected final String TEXT_577 = ").eInverseAdd(this, ";
  protected final String TEXT_578 = ", ";
  protected final String TEXT_579 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_580 = ")new";
  protected final String TEXT_581 = ", ";
  protected final String TEXT_582 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_583 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_584 = "(this, ";
  protected final String TEXT_585 = ".SET, ";
  protected final String TEXT_586 = ", new";
  protected final String TEXT_587 = ", new";
  protected final String TEXT_588 = "));";
  protected final String TEXT_589 = NL + "\t\t";
  protected final String TEXT_590 = " ";
  protected final String TEXT_591 = " = (";
  protected final String TEXT_592 = ")eVirtualGet(";
  protected final String TEXT_593 = ");";
  protected final String TEXT_594 = NL + "\t\tif (new";
  protected final String TEXT_595 = " != ";
  protected final String TEXT_596 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_597 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_598 = " != null)";
  protected final String TEXT_599 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_600 = ")";
  protected final String TEXT_601 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_602 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_603 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_604 = ")new";
  protected final String TEXT_605 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_606 = ", null, msgs);";
  protected final String TEXT_607 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_608 = ")";
  protected final String TEXT_609 = ").eInverseRemove(this, ";
  protected final String TEXT_610 = ", ";
  protected final String TEXT_611 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_612 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_613 = ")new";
  protected final String TEXT_614 = ").eInverseAdd(this, ";
  protected final String TEXT_615 = ", ";
  protected final String TEXT_616 = ".class, msgs);";
  protected final String TEXT_617 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_618 = "(";
  protected final String TEXT_619 = "new";
  protected final String TEXT_620 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_621 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_622 = NL + "\t\t\tboolean old";
  protected final String TEXT_623 = "ESet = eVirtualIsSet(";
  protected final String TEXT_624 = ");";
  protected final String TEXT_625 = NL + "\t\t\tboolean old";
  protected final String TEXT_626 = "ESet = (";
  protected final String TEXT_627 = " & ";
  protected final String TEXT_628 = "_ESETFLAG) != 0;";
  protected final String TEXT_629 = NL + "\t\t\t";
  protected final String TEXT_630 = " |= ";
  protected final String TEXT_631 = "_ESETFLAG;";
  protected final String TEXT_632 = NL + "\t\t\tboolean old";
  protected final String TEXT_633 = "ESet = ";
  protected final String TEXT_634 = "ESet;";
  protected final String TEXT_635 = NL + "\t\t\t";
  protected final String TEXT_636 = "ESet = true;";
  protected final String TEXT_637 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_638 = "(this, ";
  protected final String TEXT_639 = ".SET, ";
  protected final String TEXT_640 = ", new";
  protected final String TEXT_641 = ", new";
  protected final String TEXT_642 = ", !old";
  protected final String TEXT_643 = "ESet));";
  protected final String TEXT_644 = NL + "    \t}";
  protected final String TEXT_645 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_646 = "(this, ";
  protected final String TEXT_647 = ".SET, ";
  protected final String TEXT_648 = ", new";
  protected final String TEXT_649 = ", new";
  protected final String TEXT_650 = "));";
  protected final String TEXT_651 = NL + "\t\t";
  protected final String TEXT_652 = " old";
  protected final String TEXT_653 = " = (";
  protected final String TEXT_654 = " & ";
  protected final String TEXT_655 = "_EFLAG) != 0;";
  protected final String TEXT_656 = NL + "\t\tif (new";
  protected final String TEXT_657 = ") ";
  protected final String TEXT_658 = " |= ";
  protected final String TEXT_659 = "_EFLAG; else ";
  protected final String TEXT_660 = " &= ~";
  protected final String TEXT_661 = "_EFLAG;";
  protected final String TEXT_662 = NL + "\t\t";
  protected final String TEXT_663 = " old";
  protected final String TEXT_664 = " = ";
  protected final String TEXT_665 = ";";
  protected final String TEXT_666 = NL + "\t\t";
  protected final String TEXT_667 = " ";
  protected final String TEXT_668 = " = new";
  protected final String TEXT_669 = " == null ? ";
  protected final String TEXT_670 = "_EDEFAULT : new";
  protected final String TEXT_671 = ";";
  protected final String TEXT_672 = NL + "\t\t";
  protected final String TEXT_673 = " = new";
  protected final String TEXT_674 = " == null ? ";
  protected final String TEXT_675 = "_EDEFAULT : new";
  protected final String TEXT_676 = ";";
  protected final String TEXT_677 = NL + "\t\t";
  protected final String TEXT_678 = " ";
  protected final String TEXT_679 = " = ";
  protected final String TEXT_680 = "new";
  protected final String TEXT_681 = ";";
  protected final String TEXT_682 = NL + "\t\t";
  protected final String TEXT_683 = " = ";
  protected final String TEXT_684 = "new";
  protected final String TEXT_685 = ";";
  protected final String TEXT_686 = NL + "\t\tObject old";
  protected final String TEXT_687 = " = eVirtualSet(";
  protected final String TEXT_688 = ", ";
  protected final String TEXT_689 = ");";
  protected final String TEXT_690 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_691 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_692 = NL + "\t\tboolean old";
  protected final String TEXT_693 = "ESet = (";
  protected final String TEXT_694 = " & ";
  protected final String TEXT_695 = "_ESETFLAG) != 0;";
  protected final String TEXT_696 = NL + "\t\t";
  protected final String TEXT_697 = " |= ";
  protected final String TEXT_698 = "_ESETFLAG;";
  protected final String TEXT_699 = NL + "\t\tboolean old";
  protected final String TEXT_700 = "ESet = ";
  protected final String TEXT_701 = "ESet;";
  protected final String TEXT_702 = NL + "\t\t";
  protected final String TEXT_703 = "ESet = true;";
  protected final String TEXT_704 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_705 = "(this, ";
  protected final String TEXT_706 = ".SET, ";
  protected final String TEXT_707 = ", ";
  protected final String TEXT_708 = "isSetChange ? ";
  protected final String TEXT_709 = "null";
  protected final String TEXT_710 = "_EDEFAULT";
  protected final String TEXT_711 = " : old";
  protected final String TEXT_712 = "old";
  protected final String TEXT_713 = ", ";
  protected final String TEXT_714 = "new";
  protected final String TEXT_715 = ", ";
  protected final String TEXT_716 = "isSetChange";
  protected final String TEXT_717 = "!old";
  protected final String TEXT_718 = "ESet";
  protected final String TEXT_719 = "));";
  protected final String TEXT_720 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_721 = "(this, ";
  protected final String TEXT_722 = ".SET, ";
  protected final String TEXT_723 = ", ";
  protected final String TEXT_724 = "old";
  protected final String TEXT_725 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_726 = "null";
  protected final String TEXT_727 = "_EDEFAULT";
  protected final String TEXT_728 = " : old";
  protected final String TEXT_729 = "old";
  protected final String TEXT_730 = ", ";
  protected final String TEXT_731 = "new";
  protected final String TEXT_732 = "));";
  protected final String TEXT_733 = NL;
  protected final String TEXT_734 = NL + "\t\tif (";
  protected final String TEXT_735 = " != null && ";
  protected final String TEXT_736 = " != new";
  protected final String TEXT_737 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_738 = "(null);" + NL + "\t\t}";
  protected final String TEXT_739 = NL + "\t\tif (new";
  protected final String TEXT_740 = " != null || old";
  protected final String TEXT_741 = " == ";
  protected final String TEXT_742 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_743 = "(new";
  protected final String TEXT_744 = ");" + NL + "\t\t}";
  protected final String TEXT_745 = NL + "\t\t((";
  protected final String TEXT_746 = ".Internal)((";
  protected final String TEXT_747 = ".Internal.Wrapper)get";
  protected final String TEXT_748 = "()).featureMap()).set(";
  protected final String TEXT_749 = ", ";
  protected final String TEXT_750 = "new ";
  protected final String TEXT_751 = "(";
  protected final String TEXT_752 = "new";
  protected final String TEXT_753 = ")";
  protected final String TEXT_754 = ");";
  protected final String TEXT_755 = NL + "\t\t((";
  protected final String TEXT_756 = ".Internal)get";
  protected final String TEXT_757 = "()).set(";
  protected final String TEXT_758 = ", ";
  protected final String TEXT_759 = "new ";
  protected final String TEXT_760 = "(";
  protected final String TEXT_761 = "new";
  protected final String TEXT_762 = ")";
  protected final String TEXT_763 = ");";
  protected final String TEXT_764 = NL;
  protected final String TEXT_765 = NL + "\t\t";
  protected final String TEXT_766 = ".";
  protected final String TEXT_767 = "(this, ";
  protected final String TEXT_768 = ");";
  protected final String TEXT_769 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_770 = "' ";
  protected final String TEXT_771 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_772 = NL + "\t}" + NL;
  protected final String TEXT_773 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_774 = " basicUnset";
  protected final String TEXT_775 = "(";
  protected final String TEXT_776 = " msgs)" + NL + "\t{";
  protected final String TEXT_777 = NL + "\t\tObject old";
  protected final String TEXT_778 = " = eVirtualUnset(";
  protected final String TEXT_779 = ");";
  protected final String TEXT_780 = NL + "\t\t";
  protected final String TEXT_781 = " old";
  protected final String TEXT_782 = " = ";
  protected final String TEXT_783 = ";" + NL + "\t\t";
  protected final String TEXT_784 = " = null;";
  protected final String TEXT_785 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_786 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_787 = NL + "\t\tboolean old";
  protected final String TEXT_788 = "ESet = (";
  protected final String TEXT_789 = " & ";
  protected final String TEXT_790 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_791 = " &= ~";
  protected final String TEXT_792 = "_ESETFLAG;";
  protected final String TEXT_793 = NL + "\t\tboolean old";
  protected final String TEXT_794 = "ESet = ";
  protected final String TEXT_795 = "ESet;" + NL + "\t\t";
  protected final String TEXT_796 = "ESet = false;";
  protected final String TEXT_797 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_798 = " notification = new ";
  protected final String TEXT_799 = "(this, ";
  protected final String TEXT_800 = ".UNSET, ";
  protected final String TEXT_801 = ", ";
  protected final String TEXT_802 = "isSetChange ? old";
  protected final String TEXT_803 = " : null";
  protected final String TEXT_804 = "old";
  protected final String TEXT_805 = ", null, ";
  protected final String TEXT_806 = "isSetChange";
  protected final String TEXT_807 = "old";
  protected final String TEXT_808 = "ESet";
  protected final String TEXT_809 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_810 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_811 = "' ";
  protected final String TEXT_812 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_813 = NL + "\t}" + NL;
  protected final String TEXT_814 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_815 = "#";
  protected final String TEXT_816 = " <em>";
  protected final String TEXT_817 = "</em>}' ";
  protected final String TEXT_818 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_819 = NL + "\t * @see #isSet";
  protected final String TEXT_820 = "()";
  protected final String TEXT_821 = NL + "\t * @see #";
  protected final String TEXT_822 = "()";
  protected final String TEXT_823 = NL + "\t * @see #set";
  protected final String TEXT_824 = "(";
  protected final String TEXT_825 = ")";
  protected final String TEXT_826 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_827 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_828 = NL + "\tvoid unset";
  protected final String TEXT_829 = "();" + NL;
  protected final String TEXT_830 = NL + "\tpublic void unset";
  protected final String TEXT_831 = "()" + NL + "\t{";
  protected final String TEXT_832 = NL + "\t\teUnset(";
  protected final String TEXT_833 = ");";
  protected final String TEXT_834 = NL + "\t\t((";
  protected final String TEXT_835 = ".Unsettable)get";
  protected final String TEXT_836 = "()).unset();";
  protected final String TEXT_837 = NL + "\t\t";
  protected final String TEXT_838 = " ";
  protected final String TEXT_839 = " = (";
  protected final String TEXT_840 = ")eVirtualGet(";
  protected final String TEXT_841 = ");";
  protected final String TEXT_842 = NL + "\t\tif (";
  protected final String TEXT_843 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_844 = " msgs = null;";
  protected final String TEXT_845 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_846 = ")";
  protected final String TEXT_847 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_848 = ", null, msgs);";
  protected final String TEXT_849 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_850 = ")";
  protected final String TEXT_851 = ").eInverseRemove(this, ";
  protected final String TEXT_852 = ", ";
  protected final String TEXT_853 = ".class, msgs);";
  protected final String TEXT_854 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_855 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_856 = NL + "\t\t\tboolean old";
  protected final String TEXT_857 = "ESet = eVirtualIsSet(";
  protected final String TEXT_858 = ");";
  protected final String TEXT_859 = NL + "\t\t\tboolean old";
  protected final String TEXT_860 = "ESet = (";
  protected final String TEXT_861 = " & ";
  protected final String TEXT_862 = "_ESETFLAG) != 0;";
  protected final String TEXT_863 = NL + "\t\t\t";
  protected final String TEXT_864 = " &= ~";
  protected final String TEXT_865 = "_ESETFLAG;";
  protected final String TEXT_866 = NL + "\t\t\tboolean old";
  protected final String TEXT_867 = "ESet = ";
  protected final String TEXT_868 = "ESet;";
  protected final String TEXT_869 = NL + "\t\t\t";
  protected final String TEXT_870 = "ESet = false;";
  protected final String TEXT_871 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_872 = "(this, ";
  protected final String TEXT_873 = ".UNSET, ";
  protected final String TEXT_874 = ", null, null, old";
  protected final String TEXT_875 = "ESet));";
  protected final String TEXT_876 = NL + "    \t}";
  protected final String TEXT_877 = NL + "\t\t";
  protected final String TEXT_878 = " old";
  protected final String TEXT_879 = " = (";
  protected final String TEXT_880 = " & ";
  protected final String TEXT_881 = "_EFLAG) != 0;";
  protected final String TEXT_882 = NL + "\t\tObject old";
  protected final String TEXT_883 = " = eVirtualUnset(";
  protected final String TEXT_884 = ");";
  protected final String TEXT_885 = NL + "\t\t";
  protected final String TEXT_886 = " old";
  protected final String TEXT_887 = " = ";
  protected final String TEXT_888 = ";";
  protected final String TEXT_889 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_890 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_891 = NL + "\t\tboolean old";
  protected final String TEXT_892 = "ESet = (";
  protected final String TEXT_893 = " & ";
  protected final String TEXT_894 = "_ESETFLAG) != 0;";
  protected final String TEXT_895 = NL + "\t\tboolean old";
  protected final String TEXT_896 = "ESet = ";
  protected final String TEXT_897 = "ESet;";
  protected final String TEXT_898 = NL + "\t\t";
  protected final String TEXT_899 = " = null;";
  protected final String TEXT_900 = NL + "\t\t";
  protected final String TEXT_901 = " &= ~";
  protected final String TEXT_902 = "_ESETFLAG;";
  protected final String TEXT_903 = NL + "\t\t";
  protected final String TEXT_904 = "ESet = false;";
  protected final String TEXT_905 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_906 = "(this, ";
  protected final String TEXT_907 = ".UNSET, ";
  protected final String TEXT_908 = ", ";
  protected final String TEXT_909 = "isSetChange ? old";
  protected final String TEXT_910 = " : null";
  protected final String TEXT_911 = "old";
  protected final String TEXT_912 = ", null, ";
  protected final String TEXT_913 = "isSetChange";
  protected final String TEXT_914 = "old";
  protected final String TEXT_915 = "ESet";
  protected final String TEXT_916 = "));";
  protected final String TEXT_917 = NL + "\t\tif (";
  protected final String TEXT_918 = "_EDEFAULT) ";
  protected final String TEXT_919 = " |= ";
  protected final String TEXT_920 = "_EFLAG; else ";
  protected final String TEXT_921 = " &= ~";
  protected final String TEXT_922 = "_EFLAG;";
  protected final String TEXT_923 = NL + "\t\t";
  protected final String TEXT_924 = " = ";
  protected final String TEXT_925 = "_EDEFAULT;";
  protected final String TEXT_926 = NL + "\t\t";
  protected final String TEXT_927 = " &= ~";
  protected final String TEXT_928 = "_ESETFLAG;";
  protected final String TEXT_929 = NL + "\t\t";
  protected final String TEXT_930 = "ESet = false;";
  protected final String TEXT_931 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_932 = "(this, ";
  protected final String TEXT_933 = ".UNSET, ";
  protected final String TEXT_934 = ", ";
  protected final String TEXT_935 = "isSetChange ? old";
  protected final String TEXT_936 = " : ";
  protected final String TEXT_937 = "_EDEFAULT";
  protected final String TEXT_938 = "old";
  protected final String TEXT_939 = ", ";
  protected final String TEXT_940 = "_EDEFAULT, ";
  protected final String TEXT_941 = "isSetChange";
  protected final String TEXT_942 = "old";
  protected final String TEXT_943 = "ESet";
  protected final String TEXT_944 = "));";
  protected final String TEXT_945 = NL + "\t\t((";
  protected final String TEXT_946 = ".Internal)((";
  protected final String TEXT_947 = ".Internal.Wrapper)get";
  protected final String TEXT_948 = "()).featureMap()).clear(";
  protected final String TEXT_949 = ");";
  protected final String TEXT_950 = NL + "\t\t((";
  protected final String TEXT_951 = ".Internal)get";
  protected final String TEXT_952 = "()).clear(";
  protected final String TEXT_953 = ");";
  protected final String TEXT_954 = NL;
  protected final String TEXT_955 = NL + "\t\t";
  protected final String TEXT_956 = ".";
  protected final String TEXT_957 = "(this);";
  protected final String TEXT_958 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_959 = "' ";
  protected final String TEXT_960 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_961 = NL + "\t}" + NL;
  protected final String TEXT_962 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_963 = "#";
  protected final String TEXT_964 = " <em>";
  protected final String TEXT_965 = "</em>}' ";
  protected final String TEXT_966 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_967 = "</em>' ";
  protected final String TEXT_968 = " is set.";
  protected final String TEXT_969 = NL + "\t * @see #unset";
  protected final String TEXT_970 = "()";
  protected final String TEXT_971 = NL + "\t * @see #";
  protected final String TEXT_972 = "()";
  protected final String TEXT_973 = NL + "\t * @see #set";
  protected final String TEXT_974 = "(";
  protected final String TEXT_975 = ")";
  protected final String TEXT_976 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_977 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_978 = NL + "\tboolean isSet";
  protected final String TEXT_979 = "();" + NL;
  protected final String TEXT_980 = NL + "\tpublic boolean isSet";
  protected final String TEXT_981 = "()" + NL + "\t{";
  protected final String TEXT_982 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_983 = ");";
  protected final String TEXT_984 = NL + "\t\t";
  protected final String TEXT_985 = " ";
  protected final String TEXT_986 = " = (";
  protected final String TEXT_987 = ")eVirtualGet(";
  protected final String TEXT_988 = ");";
  protected final String TEXT_989 = NL + "\t\treturn ";
  protected final String TEXT_990 = " != null && ((";
  protected final String TEXT_991 = ".Unsettable)";
  protected final String TEXT_992 = ").isSet();";
  protected final String TEXT_993 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_994 = ");";
  protected final String TEXT_995 = NL + "\t\treturn (";
  protected final String TEXT_996 = " & ";
  protected final String TEXT_997 = "_ESETFLAG) != 0;";
  protected final String TEXT_998 = NL + "\t\treturn ";
  protected final String TEXT_999 = "ESet;";
  protected final String TEXT_1000 = NL + "\t\treturn !((";
  protected final String TEXT_1001 = ".Internal)((";
  protected final String TEXT_1002 = ".Internal.Wrapper)get";
  protected final String TEXT_1003 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1004 = ");";
  protected final String TEXT_1005 = NL + "\t\treturn !((";
  protected final String TEXT_1006 = ".Internal)get";
  protected final String TEXT_1007 = "()).isEmpty(";
  protected final String TEXT_1008 = ");";
  protected final String TEXT_1009 = NL;
  protected final String TEXT_1010 = NL + "\t\treturn ";
  protected final String TEXT_1011 = ".";
  protected final String TEXT_1012 = "(this);";
  protected final String TEXT_1013 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1014 = "' ";
  protected final String TEXT_1015 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1016 = NL + "\t}" + NL;
  protected final String TEXT_1017 = NL;
  protected final String TEXT_1018 = NL + "\t/**";
  protected final String TEXT_1019 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1020 = "}, with the specified ";
  protected final String TEXT_1021 = ", and appends it to the '<em><b>";
  protected final String TEXT_1022 = "</b></em>' ";
  protected final String TEXT_1023 = ".";
  protected final String TEXT_1024 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1025 = "}, with the specified ";
  protected final String TEXT_1026 = ", and sets the '<em><b>";
  protected final String TEXT_1027 = "</b></em>' ";
  protected final String TEXT_1028 = ".";
  protected final String TEXT_1029 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1030 = "} and appends it to the '<em><b>";
  protected final String TEXT_1031 = "</b></em>' ";
  protected final String TEXT_1032 = ".";
  protected final String TEXT_1033 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1034 = "} and sets the '<em><b>";
  protected final String TEXT_1035 = "</b></em>' ";
  protected final String TEXT_1036 = ".";
  protected final String TEXT_1037 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1038 = NL + "\t * @param ";
  protected final String TEXT_1039 = " The ";
  protected final String TEXT_1040 = " for the new {@link ";
  protected final String TEXT_1041 = "}, or <code>null</code>.";
  protected final String TEXT_1042 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1043 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1044 = "}." + NL + "\t * @see #";
  protected final String TEXT_1045 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1046 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1047 = NL + "\t";
  protected final String TEXT_1048 = " create";
  protected final String TEXT_1049 = "(";
  protected final String TEXT_1050 = ", ";
  protected final String TEXT_1051 = " eClass);" + NL;
  protected final String TEXT_1052 = NL + "\tpublic ";
  protected final String TEXT_1053 = " create";
  protected final String TEXT_1054 = "(";
  protected final String TEXT_1055 = ", ";
  protected final String TEXT_1056 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1057 = " new";
  protected final String TEXT_1058 = " = (";
  protected final String TEXT_1059 = ") ";
  protected final String TEXT_1060 = ".create(eClass);";
  protected final String TEXT_1061 = NL + "\t\tint ";
  protected final String TEXT_1062 = "ListSize = 0;";
  protected final String TEXT_1063 = NL + "\t\tint ";
  protected final String TEXT_1064 = "Size = ";
  protected final String TEXT_1065 = " == null ? 0 : ";
  protected final String TEXT_1066 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1067 = "Size > ";
  protected final String TEXT_1068 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1069 = "ListSize = ";
  protected final String TEXT_1070 = "Size;";
  protected final String TEXT_1071 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1072 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1073 = ".create";
  protected final String TEXT_1074 = "(";
  protected final String TEXT_1075 = ", ";
  protected final String TEXT_1076 = "i < ";
  protected final String TEXT_1077 = "Size ? (";
  protected final String TEXT_1078 = ") ";
  protected final String TEXT_1079 = ".get(i) : null";
  protected final String TEXT_1080 = ");" + NL + "\t\t}";
  protected final String TEXT_1081 = NL + "\t\tnew";
  protected final String TEXT_1082 = ".create";
  protected final String TEXT_1083 = "(";
  protected final String TEXT_1084 = ", ";
  protected final String TEXT_1085 = ");";
  protected final String TEXT_1086 = NL + "\t\tif (";
  protected final String TEXT_1087 = " != null)";
  protected final String TEXT_1088 = NL + "\t\t\tnew";
  protected final String TEXT_1089 = ".";
  protected final String TEXT_1090 = "().addAll(";
  protected final String TEXT_1091 = ");";
  protected final String TEXT_1092 = NL + "\t\t\tnew";
  protected final String TEXT_1093 = ".set";
  protected final String TEXT_1094 = "(";
  protected final String TEXT_1095 = ");";
  protected final String TEXT_1096 = NL + "\t\t";
  protected final String TEXT_1097 = "().add(new";
  protected final String TEXT_1098 = ");";
  protected final String TEXT_1099 = NL + "\t\tset";
  protected final String TEXT_1100 = "(new";
  protected final String TEXT_1101 = ");";
  protected final String TEXT_1102 = NL + "\t\treturn new";
  protected final String TEXT_1103 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1104 = NL + "\t/**";
  protected final String TEXT_1105 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1106 = "}, with the specified ";
  protected final String TEXT_1107 = ", and appends it to the '<em><b>";
  protected final String TEXT_1108 = "</b></em>' ";
  protected final String TEXT_1109 = ".";
  protected final String TEXT_1110 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1111 = "},with the specified ";
  protected final String TEXT_1112 = ", and sets the '<em><b>";
  protected final String TEXT_1113 = "</b></em>' ";
  protected final String TEXT_1114 = ".";
  protected final String TEXT_1115 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1116 = "} and appends it to the '<em><b>";
  protected final String TEXT_1117 = "</b></em>' ";
  protected final String TEXT_1118 = ".";
  protected final String TEXT_1119 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1120 = "} and sets the '<em><b>";
  protected final String TEXT_1121 = "</b></em>' ";
  protected final String TEXT_1122 = ".";
  protected final String TEXT_1123 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1124 = NL + "\t * @param ";
  protected final String TEXT_1125 = " The ";
  protected final String TEXT_1126 = " for the new {@link ";
  protected final String TEXT_1127 = "}, or <code>null</code>.";
  protected final String TEXT_1128 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1129 = "}." + NL + "\t * @see #";
  protected final String TEXT_1130 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1131 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1132 = NL + "\t";
  protected final String TEXT_1133 = " create";
  protected final String TEXT_1134 = "(";
  protected final String TEXT_1135 = ");" + NL;
  protected final String TEXT_1136 = NL + "\tpublic ";
  protected final String TEXT_1137 = " create";
  protected final String TEXT_1138 = "(";
  protected final String TEXT_1139 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1140 = " new";
  protected final String TEXT_1141 = " = ";
  protected final String TEXT_1142 = ".eINSTANCE.create";
  protected final String TEXT_1143 = "();";
  protected final String TEXT_1144 = NL + "\t\tint ";
  protected final String TEXT_1145 = "ListSize = 0;";
  protected final String TEXT_1146 = NL + "\t\tint ";
  protected final String TEXT_1147 = "Size = ";
  protected final String TEXT_1148 = " == null ? 0 : ";
  protected final String TEXT_1149 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1150 = "Size > ";
  protected final String TEXT_1151 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1152 = "ListSize = ";
  protected final String TEXT_1153 = "Size;";
  protected final String TEXT_1154 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1155 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1156 = ".create";
  protected final String TEXT_1157 = "(";
  protected final String TEXT_1158 = ", ";
  protected final String TEXT_1159 = "i < ";
  protected final String TEXT_1160 = "Size ? (";
  protected final String TEXT_1161 = ") ";
  protected final String TEXT_1162 = ".get(i) : null";
  protected final String TEXT_1163 = ");" + NL + "\t\t}";
  protected final String TEXT_1164 = NL + "\t\tnew";
  protected final String TEXT_1165 = ".create";
  protected final String TEXT_1166 = "(";
  protected final String TEXT_1167 = ", ";
  protected final String TEXT_1168 = ");";
  protected final String TEXT_1169 = NL + "\t\tif (";
  protected final String TEXT_1170 = " != null)";
  protected final String TEXT_1171 = NL + "\t\t\tnew";
  protected final String TEXT_1172 = ".";
  protected final String TEXT_1173 = "().addAll(";
  protected final String TEXT_1174 = ");";
  protected final String TEXT_1175 = NL + "\t\t\tnew";
  protected final String TEXT_1176 = ".set";
  protected final String TEXT_1177 = "(";
  protected final String TEXT_1178 = ");";
  protected final String TEXT_1179 = NL + "\t\t";
  protected final String TEXT_1180 = "().add(new";
  protected final String TEXT_1181 = ");";
  protected final String TEXT_1182 = NL + "\t\tset";
  protected final String TEXT_1183 = "(new";
  protected final String TEXT_1184 = ");";
  protected final String TEXT_1185 = NL + "\t\treturn new";
  protected final String TEXT_1186 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1187 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1188 = "} with the specified ";
  protected final String TEXT_1189 = " from the '<em><b>";
  protected final String TEXT_1190 = "</b></em>' ";
  protected final String TEXT_1191 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1192 = NL + "\t * @param ";
  protected final String TEXT_1193 = " The ";
  protected final String TEXT_1194 = " of the {@link ";
  protected final String TEXT_1195 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1196 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1197 = "} with the specified ";
  protected final String TEXT_1198 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1199 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1200 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1201 = NL + "\t";
  protected final String TEXT_1202 = " get";
  protected final String TEXT_1203 = "(";
  protected final String TEXT_1204 = ");" + NL;
  protected final String TEXT_1205 = NL + "\tpublic ";
  protected final String TEXT_1206 = " get";
  protected final String TEXT_1207 = "(";
  protected final String TEXT_1208 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1209 = "(";
  protected final String TEXT_1210 = ", false";
  protected final String TEXT_1211 = ", null";
  protected final String TEXT_1212 = ", false";
  protected final String TEXT_1213 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1214 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1215 = "} with the specified ";
  protected final String TEXT_1216 = " from the '<em><b>";
  protected final String TEXT_1217 = "</b></em>' ";
  protected final String TEXT_1218 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1219 = NL + "\t * @param ";
  protected final String TEXT_1220 = " The ";
  protected final String TEXT_1221 = " of the {@link ";
  protected final String TEXT_1222 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1223 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1224 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1225 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1226 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1227 = "} on demand if not found.";
  protected final String TEXT_1228 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1229 = "} with the specified ";
  protected final String TEXT_1230 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1231 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1232 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1233 = NL + "\t";
  protected final String TEXT_1234 = " get";
  protected final String TEXT_1235 = "(";
  protected final String TEXT_1236 = ", boolean ignoreCase";
  protected final String TEXT_1237 = ", ";
  protected final String TEXT_1238 = " eClass";
  protected final String TEXT_1239 = ", boolean createOnDemand";
  protected final String TEXT_1240 = ");" + NL;
  protected final String TEXT_1241 = NL + "\tpublic ";
  protected final String TEXT_1242 = " get";
  protected final String TEXT_1243 = "(";
  protected final String TEXT_1244 = ", boolean ignoreCase";
  protected final String TEXT_1245 = ", ";
  protected final String TEXT_1246 = " eClass";
  protected final String TEXT_1247 = ", boolean createOnDemand";
  protected final String TEXT_1248 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1249 = "Loop: for (";
  protected final String TEXT_1250 = " i = ";
  protected final String TEXT_1251 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1252 = " ";
  protected final String TEXT_1253 = " = (";
  protected final String TEXT_1254 = ") i.next();";
  protected final String TEXT_1255 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1256 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1257 = "Loop;";
  protected final String TEXT_1258 = NL + "\t\t\t";
  protected final String TEXT_1259 = " ";
  protected final String TEXT_1260 = "List = ";
  protected final String TEXT_1261 = ".";
  protected final String TEXT_1262 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1263 = "ListSize = ";
  protected final String TEXT_1264 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1265 = " || (";
  protected final String TEXT_1266 = " != null && ";
  protected final String TEXT_1267 = ".size() != ";
  protected final String TEXT_1268 = "ListSize";
  protected final String TEXT_1269 = ")";
  protected final String TEXT_1270 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1271 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1272 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1273 = " ";
  protected final String TEXT_1274 = " = (";
  protected final String TEXT_1275 = ") ";
  protected final String TEXT_1276 = "List.get(j);";
  protected final String TEXT_1277 = NL + "\t\t\t\tif (";
  protected final String TEXT_1278 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_1279 = ")";
  protected final String TEXT_1280 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1281 = ".";
  protected final String TEXT_1282 = "()) : ";
  protected final String TEXT_1283 = ".get(j).equals(";
  protected final String TEXT_1284 = ".";
  protected final String TEXT_1285 = "())))";
  protected final String TEXT_1286 = NL + "\t\t\t\tif (";
  protected final String TEXT_1287 = " != null && !";
  protected final String TEXT_1288 = ".get(j).equals(";
  protected final String TEXT_1289 = ".";
  protected final String TEXT_1290 = "()))";
  protected final String TEXT_1291 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1292 = "Loop;";
  protected final String TEXT_1293 = NL + "\t\t\t}";
  protected final String TEXT_1294 = NL + "\t\t\t";
  protected final String TEXT_1295 = " ";
  protected final String TEXT_1296 = " = ";
  protected final String TEXT_1297 = ".";
  protected final String TEXT_1298 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1299 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1300 = "Loop;";
  protected final String TEXT_1301 = NL + "\t\t\tif (";
  protected final String TEXT_1302 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1303 = ".equalsIgnoreCase(";
  protected final String TEXT_1304 = ".";
  protected final String TEXT_1305 = "()) : ";
  protected final String TEXT_1306 = ".equals(";
  protected final String TEXT_1307 = ".";
  protected final String TEXT_1308 = "())))";
  protected final String TEXT_1309 = NL + "\t\t\tif (";
  protected final String TEXT_1310 = " != null && !";
  protected final String TEXT_1311 = ".equals(";
  protected final String TEXT_1312 = ".";
  protected final String TEXT_1313 = "()))";
  protected final String TEXT_1314 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1315 = "Loop;";
  protected final String TEXT_1316 = NL + "\t\t\tif (";
  protected final String TEXT_1317 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1318 = ".equalsIgnoreCase(";
  protected final String TEXT_1319 = ".";
  protected final String TEXT_1320 = "()) : ";
  protected final String TEXT_1321 = ".equals(";
  protected final String TEXT_1322 = ".";
  protected final String TEXT_1323 = "())))";
  protected final String TEXT_1324 = NL + "\t\t\tif (";
  protected final String TEXT_1325 = " != null && !";
  protected final String TEXT_1326 = ".equals(";
  protected final String TEXT_1327 = ".";
  protected final String TEXT_1328 = "()))";
  protected final String TEXT_1329 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1330 = "Loop;";
  protected final String TEXT_1331 = NL + "\t\t\treturn ";
  protected final String TEXT_1332 = ";" + NL + "\t\t}";
  protected final String TEXT_1333 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1334 = " && eClass != null";
  protected final String TEXT_1335 = " ? create";
  protected final String TEXT_1336 = "(";
  protected final String TEXT_1337 = ", eClass";
  protected final String TEXT_1338 = ") : null;";
  protected final String TEXT_1339 = NL + "\t\treturn null;";
  protected final String TEXT_1340 = NL + "\t}" + NL;
  protected final String TEXT_1341 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1342 = "()" + NL + "\t{";
  protected final String TEXT_1343 = NL + "  \t\treturn false;";
  protected final String TEXT_1344 = NL + "\t\treturn !((";
  protected final String TEXT_1345 = ".Internal.Wrapper)";
  protected final String TEXT_1346 = "()).featureMap().isEmpty();";
  protected final String TEXT_1347 = NL + "\t\treturn ";
  protected final String TEXT_1348 = " != null && !";
  protected final String TEXT_1349 = ".featureMap().isEmpty();";
  protected final String TEXT_1350 = NL + "\t\treturn ";
  protected final String TEXT_1351 = " != null && !";
  protected final String TEXT_1352 = ".isEmpty();";
  protected final String TEXT_1353 = NL + "\t\t";
  protected final String TEXT_1354 = " ";
  protected final String TEXT_1355 = " = (";
  protected final String TEXT_1356 = ")eVirtualGet(";
  protected final String TEXT_1357 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1358 = " != null && !";
  protected final String TEXT_1359 = ".isEmpty();";
  protected final String TEXT_1360 = NL + "\t\treturn !";
  protected final String TEXT_1361 = "().isEmpty();";
  protected final String TEXT_1362 = NL + "\t\treturn ";
  protected final String TEXT_1363 = " != null;";
  protected final String TEXT_1364 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1365 = ") != null;";
  protected final String TEXT_1366 = NL + "\t\treturn basicGet";
  protected final String TEXT_1367 = "() != null;";
  protected final String TEXT_1368 = NL + "\t\treturn ";
  protected final String TEXT_1369 = " != null;";
  protected final String TEXT_1370 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1371 = ") != null;";
  protected final String TEXT_1372 = NL + "\t\treturn ";
  protected final String TEXT_1373 = "() != null;";
  protected final String TEXT_1374 = NL + "\t\treturn ((";
  protected final String TEXT_1375 = " & ";
  protected final String TEXT_1376 = "_EFLAG) != 0) != ";
  protected final String TEXT_1377 = "_EDEFAULT;";
  protected final String TEXT_1378 = NL + "\t\treturn ";
  protected final String TEXT_1379 = " != ";
  protected final String TEXT_1380 = "_EDEFAULT;";
  protected final String TEXT_1381 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1382 = ", ";
  protected final String TEXT_1383 = "_EDEFAULT) != ";
  protected final String TEXT_1384 = "_EDEFAULT;";
  protected final String TEXT_1385 = NL + "\t\treturn ";
  protected final String TEXT_1386 = "() != ";
  protected final String TEXT_1387 = "_EDEFAULT;";
  protected final String TEXT_1388 = NL + "\t\treturn ";
  protected final String TEXT_1389 = "_EDEFAULT == null ? ";
  protected final String TEXT_1390 = " != null : !";
  protected final String TEXT_1391 = "_EDEFAULT.equals(";
  protected final String TEXT_1392 = ");";
  protected final String TEXT_1393 = NL + "\t\t";
  protected final String TEXT_1394 = " ";
  protected final String TEXT_1395 = " = (";
  protected final String TEXT_1396 = ")eVirtualGet(";
  protected final String TEXT_1397 = ", ";
  protected final String TEXT_1398 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1399 = "_EDEFAULT == null ? ";
  protected final String TEXT_1400 = " != null : !";
  protected final String TEXT_1401 = "_EDEFAULT.equals(";
  protected final String TEXT_1402 = ");";
  protected final String TEXT_1403 = NL + "\t\treturn ";
  protected final String TEXT_1404 = "_EDEFAULT == null ? ";
  protected final String TEXT_1405 = "() != null : !";
  protected final String TEXT_1406 = "_EDEFAULT.equals(";
  protected final String TEXT_1407 = "());";
  protected final String TEXT_1408 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1409 = ");";
  protected final String TEXT_1410 = NL + "\t\t";
  protected final String TEXT_1411 = " ";
  protected final String TEXT_1412 = " = (";
  protected final String TEXT_1413 = ")eVirtualGet(";
  protected final String TEXT_1414 = ");";
  protected final String TEXT_1415 = NL + "\t\treturn ";
  protected final String TEXT_1416 = " != null && ((";
  protected final String TEXT_1417 = ".Unsettable)";
  protected final String TEXT_1418 = ").isSet();";
  protected final String TEXT_1419 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1420 = ");";
  protected final String TEXT_1421 = NL + "\t\treturn (";
  protected final String TEXT_1422 = " & ";
  protected final String TEXT_1423 = "_ESETFLAG) != 0;";
  protected final String TEXT_1424 = NL + "\t\treturn ";
  protected final String TEXT_1425 = "ESet;";
  protected final String TEXT_1426 = NL + "\t\treturn !((";
  protected final String TEXT_1427 = ".Internal)((";
  protected final String TEXT_1428 = ".Internal.Wrapper)get";
  protected final String TEXT_1429 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1430 = ");";
  protected final String TEXT_1431 = NL + "\t\treturn !((";
  protected final String TEXT_1432 = ".Internal)get";
  protected final String TEXT_1433 = "()).isEmpty(";
  protected final String TEXT_1434 = ");";
  protected final String TEXT_1435 = NL;
  protected final String TEXT_1436 = NL + "\t\treturn ";
  protected final String TEXT_1437 = ".";
  protected final String TEXT_1438 = "(this);";
  protected final String TEXT_1439 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1440 = "' ";
  protected final String TEXT_1441 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1442 = NL + "\t}" + NL;
  protected final String TEXT_1443 = NL;
  protected final String TEXT_1444 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1445 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1446 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1447 = NL + "\t * @model ";
  protected final String TEXT_1448 = NL + "\t *        ";
  protected final String TEXT_1449 = NL + "\t * @model";
  protected final String TEXT_1450 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1451 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1452 = NL + "\t";
  protected final String TEXT_1453 = " ";
  protected final String TEXT_1454 = "(";
  protected final String TEXT_1455 = ")";
  protected final String TEXT_1456 = ";" + NL;
  protected final String TEXT_1457 = NL + "\tpublic ";
  protected final String TEXT_1458 = " ";
  protected final String TEXT_1459 = "(";
  protected final String TEXT_1460 = ")";
  protected final String TEXT_1461 = NL + "\t{";
  protected final String TEXT_1462 = NL + "\t\t";
  protected final String TEXT_1463 = NL + "\t\treturn ";
  protected final String TEXT_1464 = ".";
  protected final String TEXT_1465 = "(this, ";
  protected final String TEXT_1466 = ", ";
  protected final String TEXT_1467 = ");";
  protected final String TEXT_1468 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1469 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1470 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1471 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1472 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1473 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1474 = ".";
  protected final String TEXT_1475 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1476 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1477 = "\", ";
  protected final String TEXT_1478 = ".getObjectLabel(this, ";
  protected final String TEXT_1479 = ") }),";
  protected final String TEXT_1480 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1481 = NL + "\t\t";
  protected final String TEXT_1482 = ".";
  protected final String TEXT_1483 = "(this";
  protected final String TEXT_1484 = ", ";
  protected final String TEXT_1485 = ");";
  protected final String TEXT_1486 = NL + "\t\t";
  protected final String TEXT_1487 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1488 = " result = (";
  protected final String TEXT_1489 = ") cache.get(";
  protected final String TEXT_1490 = "eResource(), ";
  protected final String TEXT_1491 = "this, ";
  protected final String TEXT_1492 = ".getEOperations().get(";
  protected final String TEXT_1493 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1494 = "eResource(), ";
  protected final String TEXT_1495 = "this, ";
  protected final String TEXT_1496 = ".getEOperations().get(";
  protected final String TEXT_1497 = "), result = ";
  protected final String TEXT_1498 = "new ";
  protected final String TEXT_1499 = "(";
  protected final String TEXT_1500 = ".";
  protected final String TEXT_1501 = "(this";
  protected final String TEXT_1502 = ", ";
  protected final String TEXT_1503 = ")";
  protected final String TEXT_1504 = ")";
  protected final String TEXT_1505 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1506 = ".";
  protected final String TEXT_1507 = "()";
  protected final String TEXT_1508 = ";" + NL + "\t\t}";
  protected final String TEXT_1509 = NL + "\t\treturn ";
  protected final String TEXT_1510 = ".";
  protected final String TEXT_1511 = "(this";
  protected final String TEXT_1512 = ", ";
  protected final String TEXT_1513 = ");";
  protected final String TEXT_1514 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1515 = NL + "\t}" + NL;
  protected final String TEXT_1516 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1517 = " eInverseAdd(";
  protected final String TEXT_1518 = " otherEnd, int featureID, ";
  protected final String TEXT_1519 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1520 = NL + "\t\t\tcase ";
  protected final String TEXT_1521 = ":";
  protected final String TEXT_1522 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1523 = ")((";
  protected final String TEXT_1524 = ".InternalMapView)";
  protected final String TEXT_1525 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1526 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1527 = ")";
  protected final String TEXT_1528 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1529 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1530 = ", msgs);";
  protected final String TEXT_1531 = NL + "\t\t\t\t";
  protected final String TEXT_1532 = " ";
  protected final String TEXT_1533 = " = (";
  protected final String TEXT_1534 = ")eVirtualGet(";
  protected final String TEXT_1535 = ");";
  protected final String TEXT_1536 = NL + "\t\t\t\tif (";
  protected final String TEXT_1537 = " != null)";
  protected final String TEXT_1538 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1539 = ")";
  protected final String TEXT_1540 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1541 = ", null, msgs);";
  protected final String TEXT_1542 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1543 = ")";
  protected final String TEXT_1544 = ").eInverseRemove(this, ";
  protected final String TEXT_1545 = ", ";
  protected final String TEXT_1546 = ".class, msgs);";
  protected final String TEXT_1547 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1548 = "((";
  protected final String TEXT_1549 = ")otherEnd, msgs);";
  protected final String TEXT_1550 = NL + "\t\t}";
  protected final String TEXT_1551 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1552 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1553 = NL + "\t}" + NL;
  protected final String TEXT_1554 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1555 = " eInverseRemove(";
  protected final String TEXT_1556 = " otherEnd, int featureID, ";
  protected final String TEXT_1557 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1558 = NL + "\t\t\tcase ";
  protected final String TEXT_1559 = ":";
  protected final String TEXT_1560 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1561 = ")((";
  protected final String TEXT_1562 = ".InternalMapView)";
  protected final String TEXT_1563 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1564 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1565 = ")((";
  protected final String TEXT_1566 = ".Internal.Wrapper)";
  protected final String TEXT_1567 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1568 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1569 = ")";
  protected final String TEXT_1570 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1571 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1572 = ", msgs);";
  protected final String TEXT_1573 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1574 = "(msgs);";
  protected final String TEXT_1575 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1576 = "(null, msgs);";
  protected final String TEXT_1577 = NL + "\t\t}";
  protected final String TEXT_1578 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1579 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1580 = NL + "\t}" + NL;
  protected final String TEXT_1581 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1582 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1583 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1584 = NL + "\t\t\tcase ";
  protected final String TEXT_1585 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1586 = ", ";
  protected final String TEXT_1587 = ".class, msgs);";
  protected final String TEXT_1588 = NL + "\t\t}";
  protected final String TEXT_1589 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1590 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1591 = NL + "\t}" + NL;
  protected final String TEXT_1592 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1593 = NL + "\t\t\tcase ";
  protected final String TEXT_1594 = ":";
  protected final String TEXT_1595 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1596 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1597 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1598 = "(";
  protected final String TEXT_1599 = "());";
  protected final String TEXT_1600 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1601 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1602 = "();";
  protected final String TEXT_1603 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1604 = ".InternalMapView)";
  protected final String TEXT_1605 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1606 = "();";
  protected final String TEXT_1607 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1608 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1609 = "().map();";
  protected final String TEXT_1610 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1611 = ".Internal.Wrapper)";
  protected final String TEXT_1612 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1613 = "();";
  protected final String TEXT_1614 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1615 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1616 = ".Internal)";
  protected final String TEXT_1617 = "()).getWrapper();";
  protected final String TEXT_1618 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1619 = "();";
  protected final String TEXT_1620 = NL + "\t\t}";
  protected final String TEXT_1621 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1622 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1623 = NL + "\t}" + NL;
  protected final String TEXT_1624 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1625 = NL + "\t\t\tcase ";
  protected final String TEXT_1626 = ":";
  protected final String TEXT_1627 = NL + "\t\t\t\t((";
  protected final String TEXT_1628 = ".Internal)((";
  protected final String TEXT_1629 = ".Internal.Wrapper)";
  protected final String TEXT_1630 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1631 = NL + "\t\t\t\t((";
  protected final String TEXT_1632 = ".Internal)";
  protected final String TEXT_1633 = "()).set(newValue);";
  protected final String TEXT_1634 = NL + "\t\t\t\t((";
  protected final String TEXT_1635 = ".Setting)((";
  protected final String TEXT_1636 = ".InternalMapView)";
  protected final String TEXT_1637 = "()).eMap()).set(newValue);";
  protected final String TEXT_1638 = NL + "\t\t\t\t((";
  protected final String TEXT_1639 = ".Setting)";
  protected final String TEXT_1640 = "()).set(newValue);";
  protected final String TEXT_1641 = NL + "\t\t\t\t";
  protected final String TEXT_1642 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1643 = "().addAll((";
  protected final String TEXT_1644 = ")newValue);";
  protected final String TEXT_1645 = NL + "\t\t\t\tset";
  protected final String TEXT_1646 = "(((";
  protected final String TEXT_1647 = ")newValue).";
  protected final String TEXT_1648 = "());";
  protected final String TEXT_1649 = NL + "\t\t\t\tset";
  protected final String TEXT_1650 = "((";
  protected final String TEXT_1651 = ")newValue);";
  protected final String TEXT_1652 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1653 = NL + "\t\t}";
  protected final String TEXT_1654 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1655 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1656 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1657 = NL + "\t\t\tcase ";
  protected final String TEXT_1658 = ":";
  protected final String TEXT_1659 = NL + "\t\t\t\t((";
  protected final String TEXT_1660 = ".Internal.Wrapper)";
  protected final String TEXT_1661 = "()).featureMap().clear();";
  protected final String TEXT_1662 = NL + "\t\t\t\t";
  protected final String TEXT_1663 = "().clear();";
  protected final String TEXT_1664 = NL + "\t\t\t\tunset";
  protected final String TEXT_1665 = "();";
  protected final String TEXT_1666 = NL + "\t\t\t\tset";
  protected final String TEXT_1667 = "((";
  protected final String TEXT_1668 = ")null);";
  protected final String TEXT_1669 = NL + "\t\t\t\tset";
  protected final String TEXT_1670 = "(";
  protected final String TEXT_1671 = "_EDEFAULT);";
  protected final String TEXT_1672 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1673 = NL + "\t\t}";
  protected final String TEXT_1674 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1675 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1676 = NL + "\t}" + NL;
  protected final String TEXT_1677 = NL;
  protected final String TEXT_1678 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1679 = NL + "\t\t\tcase ";
  protected final String TEXT_1680 = ":";
  protected final String TEXT_1681 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1682 = "();";
  protected final String TEXT_1683 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1684 = ".Internal.Wrapper)";
  protected final String TEXT_1685 = "()).featureMap().isEmpty();";
  protected final String TEXT_1686 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1687 = " != null && !";
  protected final String TEXT_1688 = ".featureMap().isEmpty();";
  protected final String TEXT_1689 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1690 = " != null && !";
  protected final String TEXT_1691 = ".isEmpty();";
  protected final String TEXT_1692 = NL + "\t\t\t\t";
  protected final String TEXT_1693 = " ";
  protected final String TEXT_1694 = " = (";
  protected final String TEXT_1695 = ")eVirtualGet(";
  protected final String TEXT_1696 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1697 = " != null && !";
  protected final String TEXT_1698 = ".isEmpty();";
  protected final String TEXT_1699 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1700 = "().isEmpty();";
  protected final String TEXT_1701 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1702 = "();";
  protected final String TEXT_1703 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1704 = " != null;";
  protected final String TEXT_1705 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1706 = ") != null;";
  protected final String TEXT_1707 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1708 = "() != null;";
  protected final String TEXT_1709 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1710 = " != null;";
  protected final String TEXT_1711 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1712 = ") != null;";
  protected final String TEXT_1713 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1714 = "() != null;";
  protected final String TEXT_1715 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1716 = " & ";
  protected final String TEXT_1717 = "_EFLAG) != 0) != ";
  protected final String TEXT_1718 = "_EDEFAULT;";
  protected final String TEXT_1719 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1720 = " != ";
  protected final String TEXT_1721 = "_EDEFAULT;";
  protected final String TEXT_1722 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1723 = ", ";
  protected final String TEXT_1724 = "_EDEFAULT) != ";
  protected final String TEXT_1725 = "_EDEFAULT;";
  protected final String TEXT_1726 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1727 = "() != ";
  protected final String TEXT_1728 = "_EDEFAULT;";
  protected final String TEXT_1729 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1730 = "_EDEFAULT == null ? ";
  protected final String TEXT_1731 = " != null : !";
  protected final String TEXT_1732 = "_EDEFAULT.equals(";
  protected final String TEXT_1733 = ");";
  protected final String TEXT_1734 = NL + "\t\t\t\t";
  protected final String TEXT_1735 = " ";
  protected final String TEXT_1736 = " = (";
  protected final String TEXT_1737 = ")eVirtualGet(";
  protected final String TEXT_1738 = ", ";
  protected final String TEXT_1739 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1740 = "_EDEFAULT == null ? ";
  protected final String TEXT_1741 = " != null : !";
  protected final String TEXT_1742 = "_EDEFAULT.equals(";
  protected final String TEXT_1743 = ");";
  protected final String TEXT_1744 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1745 = "_EDEFAULT == null ? ";
  protected final String TEXT_1746 = "() != null : !";
  protected final String TEXT_1747 = "_EDEFAULT.equals(";
  protected final String TEXT_1748 = "());";
  protected final String TEXT_1749 = NL + "\t\t}";
  protected final String TEXT_1750 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1751 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1752 = NL + "\t}" + NL;
  protected final String TEXT_1753 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1754 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1755 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1756 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1757 = ": return ";
  protected final String TEXT_1758 = ";";
  protected final String TEXT_1759 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1760 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1761 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1762 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1763 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1764 = ": return ";
  protected final String TEXT_1765 = ";";
  protected final String TEXT_1766 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1767 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1768 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1769 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1770 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1771 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1772 = NL + "\t\t\tcase ";
  protected final String TEXT_1773 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1774 = ";";
  protected final String TEXT_1775 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1776 = NL + "\t\t\tcase ";
  protected final String TEXT_1777 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1778 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1779 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1780 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1781 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1782 = ": \");";
  protected final String TEXT_1783 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1784 = ": \");";
  protected final String TEXT_1785 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1786 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1787 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1788 = NL + "\t\tif (";
  protected final String TEXT_1789 = "(";
  protected final String TEXT_1790 = " & ";
  protected final String TEXT_1791 = "_ESETFLAG) != 0";
  protected final String TEXT_1792 = "ESet";
  protected final String TEXT_1793 = ") result.append((";
  protected final String TEXT_1794 = " & ";
  protected final String TEXT_1795 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1796 = NL + "\t\tif (";
  protected final String TEXT_1797 = "(";
  protected final String TEXT_1798 = " & ";
  protected final String TEXT_1799 = "_ESETFLAG) != 0";
  protected final String TEXT_1800 = "ESet";
  protected final String TEXT_1801 = ") result.append(";
  protected final String TEXT_1802 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1803 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1804 = ", ";
  protected final String TEXT_1805 = "_EDEFAULT";
  protected final String TEXT_1806 = "));";
  protected final String TEXT_1807 = NL + "\t\tresult.append((";
  protected final String TEXT_1808 = " & ";
  protected final String TEXT_1809 = "_EFLAG) != 0);";
  protected final String TEXT_1810 = NL + "\t\tresult.append(";
  protected final String TEXT_1811 = ");";
  protected final String TEXT_1812 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1813 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1814 = NL + "\t\treturn new ";
  protected final String TEXT_1815 = "(getTypedKey());";
  protected final String TEXT_1816 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1817 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1818 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1819 = ")key);";
  protected final String TEXT_1820 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1821 = ")key).";
  protected final String TEXT_1822 = "());";
  protected final String TEXT_1823 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1824 = ")key);";
  protected final String TEXT_1825 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1826 = NL + "\t\treturn new ";
  protected final String TEXT_1827 = "(getTypedValue());";
  protected final String TEXT_1828 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1829 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1830 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1831 = ")value);";
  protected final String TEXT_1832 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1833 = ")value).";
  protected final String TEXT_1834 = "());";
  protected final String TEXT_1835 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1836 = ")value);";
  protected final String TEXT_1837 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1838 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1839 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1840 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1841 = NL;
  protected final String TEXT_1842 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1843 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1844 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1845 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1846 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_1847 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1848 = " basicGet";
  protected final String TEXT_1849 = "()" + NL + "\t{";
  protected final String TEXT_1850 = NL + "\t\tif (isSet";
  protected final String TEXT_1851 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1852 = "basicGet";
  protected final String TEXT_1853 = "();" + NL + "\t\t}";
  protected final String TEXT_1854 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1855 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1856 = "basicGet";
  protected final String TEXT_1857 = "();" + NL + "\t\t}";
  protected final String TEXT_1858 = NL + "\t\t";
  protected final String TEXT_1859 = " ";
  protected final String TEXT_1860 = " = ";
  protected final String TEXT_1861 = "basicGet";
  protected final String TEXT_1862 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1863 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1864 = ";" + NL + "\t\t}";
  protected final String TEXT_1865 = NL + "\t\treturn ";
  protected final String TEXT_1866 = "super.basicGet";
  protected final String TEXT_1867 = "()";
  protected final String TEXT_1868 = "null";
  protected final String TEXT_1869 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1870 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1871 = " ";
  protected final String TEXT_1872 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1873 = " ";
  protected final String TEXT_1874 = " = basicGet";
  protected final String TEXT_1875 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1876 = " == null ? null : (";
  protected final String TEXT_1877 = ")eResolveProxy((";
  protected final String TEXT_1878 = ")";
  protected final String TEXT_1879 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1880 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1881 = " ";
  protected final String TEXT_1882 = "Helper(";
  protected final String TEXT_1883 = " ";
  protected final String TEXT_1884 = ")" + NL + "\t{";
  protected final String TEXT_1885 = NL + "\t\t";
  protected final String TEXT_1886 = ".addAll(super.";
  protected final String TEXT_1887 = "());";
  protected final String TEXT_1888 = NL + "\t\tsuper.";
  protected final String TEXT_1889 = "Helper(";
  protected final String TEXT_1890 = ");";
  protected final String TEXT_1891 = NL + "\t\tif (isSet";
  protected final String TEXT_1892 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1893 = " i = ((";
  protected final String TEXT_1894 = ") ";
  protected final String TEXT_1895 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1896 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1897 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1898 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1899 = " i = ((";
  protected final String TEXT_1900 = ") ";
  protected final String TEXT_1901 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1902 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1903 = NL + "\t\t";
  protected final String TEXT_1904 = " ";
  protected final String TEXT_1905 = " = ";
  protected final String TEXT_1906 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1907 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1908 = " i = ((";
  protected final String TEXT_1909 = ") ";
  protected final String TEXT_1910 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1911 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1912 = NL + "\t\tif (isSet";
  protected final String TEXT_1913 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1914 = ".addAll(";
  protected final String TEXT_1915 = "());" + NL + "\t\t}";
  protected final String TEXT_1916 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1917 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1918 = ".addAll(";
  protected final String TEXT_1919 = "());" + NL + "\t\t}";
  protected final String TEXT_1920 = NL + "\t\t";
  protected final String TEXT_1921 = " ";
  protected final String TEXT_1922 = " = ";
  protected final String TEXT_1923 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1924 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1925 = ".addAll(";
  protected final String TEXT_1926 = ");" + NL + "\t\t}";
  protected final String TEXT_1927 = NL + "\t\tif (isSet";
  protected final String TEXT_1928 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1929 = ".add(";
  protected final String TEXT_1930 = "basicGet";
  protected final String TEXT_1931 = "());" + NL + "\t\t}";
  protected final String TEXT_1932 = NL + "\t\t";
  protected final String TEXT_1933 = " ";
  protected final String TEXT_1934 = " = ";
  protected final String TEXT_1935 = "basicGet";
  protected final String TEXT_1936 = "();" + NL + "\t\tif (";
  protected final String TEXT_1937 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1938 = ".add(";
  protected final String TEXT_1939 = ");" + NL + "\t\t}";
  protected final String TEXT_1940 = NL + "\t\treturn ";
  protected final String TEXT_1941 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1942 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1943 = " ";
  protected final String TEXT_1944 = "()" + NL + "\t{";
  protected final String TEXT_1945 = NL + "\t\t";
  protected final String TEXT_1946 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_1947 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1948 = " method = getClass().getMethod(\"";
  protected final String TEXT_1949 = "\", null);";
  protected final String TEXT_1950 = NL + "\t\t\t\t";
  protected final String TEXT_1951 = " ";
  protected final String TEXT_1952 = " = (";
  protected final String TEXT_1953 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_1954 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1955 = " union = ";
  protected final String TEXT_1956 = "Helper(new ";
  protected final String TEXT_1957 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_1958 = " = new ";
  protected final String TEXT_1959 = "(this, ";
  protected final String TEXT_1960 = "null";
  protected final String TEXT_1961 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1962 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1963 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_1964 = NL + "\t\t\t";
  protected final String TEXT_1965 = " ";
  protected final String TEXT_1966 = " = (";
  protected final String TEXT_1967 = ") cache.get(eResource(), this, ";
  protected final String TEXT_1968 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_1969 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1970 = " union = ";
  protected final String TEXT_1971 = "Helper(new ";
  protected final String TEXT_1972 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_1973 = ", ";
  protected final String TEXT_1974 = " = new ";
  protected final String TEXT_1975 = "(this, ";
  protected final String TEXT_1976 = "null";
  protected final String TEXT_1977 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_1978 = ";";
  protected final String TEXT_1979 = NL + "\t\t}";
  protected final String TEXT_1980 = NL + "\t\t";
  protected final String TEXT_1981 = " union = ";
  protected final String TEXT_1982 = "Helper(new ";
  protected final String TEXT_1983 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_1984 = "(this, ";
  protected final String TEXT_1985 = "null";
  protected final String TEXT_1986 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_1987 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1988 = " ";
  protected final String TEXT_1989 = "()" + NL + "\t{";
  protected final String TEXT_1990 = NL + "\t\tif (isSet";
  protected final String TEXT_1991 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1992 = "();" + NL + "\t\t}";
  protected final String TEXT_1993 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1994 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1995 = "();" + NL + "\t\t}";
  protected final String TEXT_1996 = NL + "\t\t";
  protected final String TEXT_1997 = " ";
  protected final String TEXT_1998 = " = ";
  protected final String TEXT_1999 = "();" + NL + "\t\tif (";
  protected final String TEXT_2000 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_2001 = ";" + NL + "\t\t}";
  protected final String TEXT_2002 = NL + "\t\treturn ";
  protected final String TEXT_2003 = "super.";
  protected final String TEXT_2004 = "()";
  protected final String TEXT_2005 = "null";
  protected final String TEXT_2006 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2007 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2008 = "()" + NL + "\t{";
  protected final String TEXT_2009 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2010 = "()";
  protected final String TEXT_2011 = NL + "\t\treturn isSet";
  protected final String TEXT_2012 = "()";
  protected final String TEXT_2013 = ";";
  protected final String TEXT_2014 = NL + "\t\treturn !";
  protected final String TEXT_2015 = "().isEmpty()";
  protected final String TEXT_2016 = ";";
  protected final String TEXT_2017 = NL + "\t\treturn ";
  protected final String TEXT_2018 = "basicGet";
  protected final String TEXT_2019 = "() != null";
  protected final String TEXT_2020 = ";";
  protected final String TEXT_2021 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2022 = ")";
  protected final String TEXT_2023 = ";";
  protected final String TEXT_2024 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2025 = "()";
  protected final String TEXT_2026 = ";";
  protected final String TEXT_2027 = NL + "\t\t\t|| !";
  protected final String TEXT_2028 = "().isEmpty()";
  protected final String TEXT_2029 = ";";
  protected final String TEXT_2030 = NL + "\t\t\t|| ";
  protected final String TEXT_2031 = "basicGet";
  protected final String TEXT_2032 = "() != null";
  protected final String TEXT_2033 = ";";
  protected final String TEXT_2034 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2035 = ")";
  protected final String TEXT_2036 = ";";
  protected final String TEXT_2037 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2038 = "();";
  protected final String TEXT_2039 = NL + "\t\treturn false;";
  protected final String TEXT_2040 = NL + "\t}" + NL;
  protected final String TEXT_2041 = NL;
  protected final String TEXT_2042 = NL + "\t/**";
  protected final String TEXT_2043 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2044 = "}, with the specified ";
  protected final String TEXT_2045 = ", and appends it to the '<em><b>";
  protected final String TEXT_2046 = "</b></em>' ";
  protected final String TEXT_2047 = ".";
  protected final String TEXT_2048 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2049 = "}, with the specified ";
  protected final String TEXT_2050 = ", and sets the '<em><b>";
  protected final String TEXT_2051 = "</b></em>' ";
  protected final String TEXT_2052 = ".";
  protected final String TEXT_2053 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2054 = "} and appends it to the '<em><b>";
  protected final String TEXT_2055 = "</b></em>' ";
  protected final String TEXT_2056 = ".";
  protected final String TEXT_2057 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2058 = "} and sets the '<em><b>";
  protected final String TEXT_2059 = "</b></em>' ";
  protected final String TEXT_2060 = ".";
  protected final String TEXT_2061 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2062 = NL + "\t * @param ";
  protected final String TEXT_2063 = " The ";
  protected final String TEXT_2064 = " for the new {@link ";
  protected final String TEXT_2065 = "}, or <code>null</code>.";
  protected final String TEXT_2066 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2067 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2068 = "}." + NL + "\t * @see #";
  protected final String TEXT_2069 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2070 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2071 = NL + "\t";
  protected final String TEXT_2072 = " create";
  protected final String TEXT_2073 = "(";
  protected final String TEXT_2074 = ", ";
  protected final String TEXT_2075 = " eClass);" + NL;
  protected final String TEXT_2076 = NL + "\tpublic ";
  protected final String TEXT_2077 = " create";
  protected final String TEXT_2078 = "(";
  protected final String TEXT_2079 = ", ";
  protected final String TEXT_2080 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2081 = " new";
  protected final String TEXT_2082 = " = (";
  protected final String TEXT_2083 = ") ";
  protected final String TEXT_2084 = ".create(eClass);";
  protected final String TEXT_2085 = NL + "\t\tint ";
  protected final String TEXT_2086 = "ListSize = 0;";
  protected final String TEXT_2087 = NL + "\t\tint ";
  protected final String TEXT_2088 = "Size = ";
  protected final String TEXT_2089 = " == null ? 0 : ";
  protected final String TEXT_2090 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2091 = "Size > ";
  protected final String TEXT_2092 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2093 = "ListSize = ";
  protected final String TEXT_2094 = "Size;";
  protected final String TEXT_2095 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2096 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2097 = ".create";
  protected final String TEXT_2098 = "(";
  protected final String TEXT_2099 = ", ";
  protected final String TEXT_2100 = "i < ";
  protected final String TEXT_2101 = "Size ? (";
  protected final String TEXT_2102 = ") ";
  protected final String TEXT_2103 = ".get(i) : null";
  protected final String TEXT_2104 = ");" + NL + "\t\t}";
  protected final String TEXT_2105 = NL + "\t\tnew";
  protected final String TEXT_2106 = ".create";
  protected final String TEXT_2107 = "(";
  protected final String TEXT_2108 = ", ";
  protected final String TEXT_2109 = ");";
  protected final String TEXT_2110 = NL + "\t\tif (";
  protected final String TEXT_2111 = " != null)";
  protected final String TEXT_2112 = NL + "\t\t\tnew";
  protected final String TEXT_2113 = ".";
  protected final String TEXT_2114 = "().addAll(";
  protected final String TEXT_2115 = ");";
  protected final String TEXT_2116 = NL + "\t\t\tnew";
  protected final String TEXT_2117 = ".set";
  protected final String TEXT_2118 = "(";
  protected final String TEXT_2119 = ");";
  protected final String TEXT_2120 = NL + "\t\t";
  protected final String TEXT_2121 = "().add(new";
  protected final String TEXT_2122 = ");";
  protected final String TEXT_2123 = NL + "\t\tset";
  protected final String TEXT_2124 = "(new";
  protected final String TEXT_2125 = ");";
  protected final String TEXT_2126 = NL + "\t\treturn new";
  protected final String TEXT_2127 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2128 = NL + "\t/**";
  protected final String TEXT_2129 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2130 = "}, with the specified ";
  protected final String TEXT_2131 = ", and appends it to the '<em><b>";
  protected final String TEXT_2132 = "</b></em>' ";
  protected final String TEXT_2133 = ".";
  protected final String TEXT_2134 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2135 = "},with the specified ";
  protected final String TEXT_2136 = ", and sets the '<em><b>";
  protected final String TEXT_2137 = "</b></em>' ";
  protected final String TEXT_2138 = ".";
  protected final String TEXT_2139 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2140 = "} and appends it to the '<em><b>";
  protected final String TEXT_2141 = "</b></em>' ";
  protected final String TEXT_2142 = ".";
  protected final String TEXT_2143 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2144 = "} and sets the '<em><b>";
  protected final String TEXT_2145 = "</b></em>' ";
  protected final String TEXT_2146 = ".";
  protected final String TEXT_2147 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2148 = NL + "\t * @param ";
  protected final String TEXT_2149 = " The ";
  protected final String TEXT_2150 = " for the new {@link ";
  protected final String TEXT_2151 = "}, or <code>null</code>.";
  protected final String TEXT_2152 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2153 = "}." + NL + "\t * @see #";
  protected final String TEXT_2154 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2155 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2156 = NL + "\t";
  protected final String TEXT_2157 = " create";
  protected final String TEXT_2158 = "(";
  protected final String TEXT_2159 = ");" + NL;
  protected final String TEXT_2160 = NL + "\tpublic ";
  protected final String TEXT_2161 = " create";
  protected final String TEXT_2162 = "(";
  protected final String TEXT_2163 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2164 = " new";
  protected final String TEXT_2165 = " = ";
  protected final String TEXT_2166 = ".eINSTANCE.create";
  protected final String TEXT_2167 = "();";
  protected final String TEXT_2168 = NL + "\t\tint ";
  protected final String TEXT_2169 = "ListSize = 0;";
  protected final String TEXT_2170 = NL + "\t\tint ";
  protected final String TEXT_2171 = "Size = ";
  protected final String TEXT_2172 = " == null ? 0 : ";
  protected final String TEXT_2173 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2174 = "Size > ";
  protected final String TEXT_2175 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2176 = "ListSize = ";
  protected final String TEXT_2177 = "Size;";
  protected final String TEXT_2178 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2179 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2180 = ".create";
  protected final String TEXT_2181 = "(";
  protected final String TEXT_2182 = ", ";
  protected final String TEXT_2183 = "i < ";
  protected final String TEXT_2184 = "Size ? (";
  protected final String TEXT_2185 = ") ";
  protected final String TEXT_2186 = ".get(i) : null";
  protected final String TEXT_2187 = ");" + NL + "\t\t}";
  protected final String TEXT_2188 = NL + "\t\tnew";
  protected final String TEXT_2189 = ".create";
  protected final String TEXT_2190 = "(";
  protected final String TEXT_2191 = ", ";
  protected final String TEXT_2192 = ");";
  protected final String TEXT_2193 = NL + "\t\tif (";
  protected final String TEXT_2194 = " != null)";
  protected final String TEXT_2195 = NL + "\t\t\tnew";
  protected final String TEXT_2196 = ".";
  protected final String TEXT_2197 = "().addAll(";
  protected final String TEXT_2198 = ");";
  protected final String TEXT_2199 = NL + "\t\t\tnew";
  protected final String TEXT_2200 = ".set";
  protected final String TEXT_2201 = "(";
  protected final String TEXT_2202 = ");";
  protected final String TEXT_2203 = NL + "\t\t";
  protected final String TEXT_2204 = "().add(new";
  protected final String TEXT_2205 = ");";
  protected final String TEXT_2206 = NL + "\t\tset";
  protected final String TEXT_2207 = "(new";
  protected final String TEXT_2208 = ");";
  protected final String TEXT_2209 = NL + "\t\treturn new";
  protected final String TEXT_2210 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2211 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2212 = "} with the specified ";
  protected final String TEXT_2213 = " from the '<em><b>";
  protected final String TEXT_2214 = "</b></em>' ";
  protected final String TEXT_2215 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2216 = NL + "\t * @param ";
  protected final String TEXT_2217 = " The ";
  protected final String TEXT_2218 = " of the {@link ";
  protected final String TEXT_2219 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2220 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2221 = "} with the specified ";
  protected final String TEXT_2222 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2223 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2224 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2225 = NL + "\t";
  protected final String TEXT_2226 = " get";
  protected final String TEXT_2227 = "(";
  protected final String TEXT_2228 = ");" + NL;
  protected final String TEXT_2229 = NL + "\tpublic ";
  protected final String TEXT_2230 = " get";
  protected final String TEXT_2231 = "(";
  protected final String TEXT_2232 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2233 = "(";
  protected final String TEXT_2234 = ", false";
  protected final String TEXT_2235 = ", null";
  protected final String TEXT_2236 = ", false";
  protected final String TEXT_2237 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2238 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2239 = "} with the specified ";
  protected final String TEXT_2240 = " from the '<em><b>";
  protected final String TEXT_2241 = "</b></em>' ";
  protected final String TEXT_2242 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2243 = NL + "\t * @param ";
  protected final String TEXT_2244 = " The ";
  protected final String TEXT_2245 = " of the {@link ";
  protected final String TEXT_2246 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2247 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2248 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2249 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2250 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2251 = "} on demand if not found.";
  protected final String TEXT_2252 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2253 = "} with the specified ";
  protected final String TEXT_2254 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2255 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2256 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2257 = NL + "\t";
  protected final String TEXT_2258 = " get";
  protected final String TEXT_2259 = "(";
  protected final String TEXT_2260 = ", boolean ignoreCase";
  protected final String TEXT_2261 = ", ";
  protected final String TEXT_2262 = " eClass";
  protected final String TEXT_2263 = ", boolean createOnDemand";
  protected final String TEXT_2264 = ");" + NL;
  protected final String TEXT_2265 = NL + "\tpublic ";
  protected final String TEXT_2266 = " get";
  protected final String TEXT_2267 = "(";
  protected final String TEXT_2268 = ", boolean ignoreCase";
  protected final String TEXT_2269 = ", ";
  protected final String TEXT_2270 = " eClass";
  protected final String TEXT_2271 = ", boolean createOnDemand";
  protected final String TEXT_2272 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2273 = "Loop: for (";
  protected final String TEXT_2274 = " i = ";
  protected final String TEXT_2275 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2276 = " ";
  protected final String TEXT_2277 = " = (";
  protected final String TEXT_2278 = ") i.next();";
  protected final String TEXT_2279 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2280 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2281 = "Loop;";
  protected final String TEXT_2282 = NL + "\t\t\t";
  protected final String TEXT_2283 = " ";
  protected final String TEXT_2284 = "List = ";
  protected final String TEXT_2285 = ".";
  protected final String TEXT_2286 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2287 = "ListSize = ";
  protected final String TEXT_2288 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2289 = " || (";
  protected final String TEXT_2290 = " != null && ";
  protected final String TEXT_2291 = ".size() != ";
  protected final String TEXT_2292 = "ListSize";
  protected final String TEXT_2293 = ")";
  protected final String TEXT_2294 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2295 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2296 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2297 = " ";
  protected final String TEXT_2298 = " = (";
  protected final String TEXT_2299 = ") ";
  protected final String TEXT_2300 = "List.get(j);";
  protected final String TEXT_2301 = NL + "\t\t\t\tif (";
  protected final String TEXT_2302 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2303 = ")";
  protected final String TEXT_2304 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2305 = ".";
  protected final String TEXT_2306 = "()) : ";
  protected final String TEXT_2307 = ".get(j).equals(";
  protected final String TEXT_2308 = ".";
  protected final String TEXT_2309 = "())))";
  protected final String TEXT_2310 = NL + "\t\t\t\tif (";
  protected final String TEXT_2311 = " != null && !";
  protected final String TEXT_2312 = ".get(j).equals(";
  protected final String TEXT_2313 = ".";
  protected final String TEXT_2314 = "()))";
  protected final String TEXT_2315 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2316 = "Loop;";
  protected final String TEXT_2317 = NL + "\t\t\t}";
  protected final String TEXT_2318 = NL + "\t\t\t";
  protected final String TEXT_2319 = " ";
  protected final String TEXT_2320 = " = ";
  protected final String TEXT_2321 = ".";
  protected final String TEXT_2322 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2323 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2324 = "Loop;";
  protected final String TEXT_2325 = NL + "\t\t\tif (";
  protected final String TEXT_2326 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2327 = ".equalsIgnoreCase(";
  protected final String TEXT_2328 = ".";
  protected final String TEXT_2329 = "()) : ";
  protected final String TEXT_2330 = ".equals(";
  protected final String TEXT_2331 = ".";
  protected final String TEXT_2332 = "())))";
  protected final String TEXT_2333 = NL + "\t\t\tif (";
  protected final String TEXT_2334 = " != null && !";
  protected final String TEXT_2335 = ".equals(";
  protected final String TEXT_2336 = ".";
  protected final String TEXT_2337 = "()))";
  protected final String TEXT_2338 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2339 = "Loop;";
  protected final String TEXT_2340 = NL + "\t\t\tif (";
  protected final String TEXT_2341 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2342 = ".equalsIgnoreCase(";
  protected final String TEXT_2343 = ".";
  protected final String TEXT_2344 = "()) : ";
  protected final String TEXT_2345 = ".equals(";
  protected final String TEXT_2346 = ".";
  protected final String TEXT_2347 = "())))";
  protected final String TEXT_2348 = NL + "\t\t\tif (";
  protected final String TEXT_2349 = " != null && !";
  protected final String TEXT_2350 = ".equals(";
  protected final String TEXT_2351 = ".";
  protected final String TEXT_2352 = "()))";
  protected final String TEXT_2353 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2354 = "Loop;";
  protected final String TEXT_2355 = NL + "\t\t\treturn ";
  protected final String TEXT_2356 = ";" + NL + "\t\t}";
  protected final String TEXT_2357 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2358 = " && eClass != null";
  protected final String TEXT_2359 = " ? create";
  protected final String TEXT_2360 = "(";
  protected final String TEXT_2361 = ", eClass";
  protected final String TEXT_2362 = ") : null;";
  protected final String TEXT_2363 = NL + "\t\treturn null;";
  protected final String TEXT_2364 = NL + "\t}" + NL;
  protected final String TEXT_2365 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2366 = "()" + NL + "\t{";
  protected final String TEXT_2367 = NL + "  \t\treturn false;";
  protected final String TEXT_2368 = NL + "\t\treturn !((";
  protected final String TEXT_2369 = ".Internal.Wrapper)";
  protected final String TEXT_2370 = "()).featureMap().isEmpty();";
  protected final String TEXT_2371 = NL + "\t\treturn ";
  protected final String TEXT_2372 = " != null && !";
  protected final String TEXT_2373 = ".featureMap().isEmpty();";
  protected final String TEXT_2374 = NL + "\t\treturn ";
  protected final String TEXT_2375 = " != null && !";
  protected final String TEXT_2376 = ".isEmpty();";
  protected final String TEXT_2377 = NL + "\t\t";
  protected final String TEXT_2378 = " ";
  protected final String TEXT_2379 = " = (";
  protected final String TEXT_2380 = ")eVirtualGet(";
  protected final String TEXT_2381 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2382 = " != null && !";
  protected final String TEXT_2383 = ".isEmpty();";
  protected final String TEXT_2384 = NL + "\t\treturn !";
  protected final String TEXT_2385 = "().isEmpty();";
  protected final String TEXT_2386 = NL + "\t\treturn ";
  protected final String TEXT_2387 = " != null;";
  protected final String TEXT_2388 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2389 = ") != null;";
  protected final String TEXT_2390 = NL + "\t\treturn basicGet";
  protected final String TEXT_2391 = "() != null;";
  protected final String TEXT_2392 = NL + "\t\treturn ";
  protected final String TEXT_2393 = " != null;";
  protected final String TEXT_2394 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2395 = ") != null;";
  protected final String TEXT_2396 = NL + "\t\treturn ";
  protected final String TEXT_2397 = "() != null;";
  protected final String TEXT_2398 = NL + "\t\treturn ((";
  protected final String TEXT_2399 = " & ";
  protected final String TEXT_2400 = "_EFLAG) != 0) != ";
  protected final String TEXT_2401 = "_EDEFAULT;";
  protected final String TEXT_2402 = NL + "\t\treturn ";
  protected final String TEXT_2403 = " != ";
  protected final String TEXT_2404 = "_EDEFAULT;";
  protected final String TEXT_2405 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2406 = ", ";
  protected final String TEXT_2407 = "_EDEFAULT) != ";
  protected final String TEXT_2408 = "_EDEFAULT;";
  protected final String TEXT_2409 = NL + "\t\treturn ";
  protected final String TEXT_2410 = "() != ";
  protected final String TEXT_2411 = "_EDEFAULT;";
  protected final String TEXT_2412 = NL + "\t\treturn ";
  protected final String TEXT_2413 = "_EDEFAULT == null ? ";
  protected final String TEXT_2414 = " != null : !";
  protected final String TEXT_2415 = "_EDEFAULT.equals(";
  protected final String TEXT_2416 = ");";
  protected final String TEXT_2417 = NL + "\t\t";
  protected final String TEXT_2418 = " ";
  protected final String TEXT_2419 = " = (";
  protected final String TEXT_2420 = ")eVirtualGet(";
  protected final String TEXT_2421 = ", ";
  protected final String TEXT_2422 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2423 = "_EDEFAULT == null ? ";
  protected final String TEXT_2424 = " != null : !";
  protected final String TEXT_2425 = "_EDEFAULT.equals(";
  protected final String TEXT_2426 = ");";
  protected final String TEXT_2427 = NL + "\t\treturn ";
  protected final String TEXT_2428 = "_EDEFAULT == null ? ";
  protected final String TEXT_2429 = "() != null : !";
  protected final String TEXT_2430 = "_EDEFAULT.equals(";
  protected final String TEXT_2431 = "());";
  protected final String TEXT_2432 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2433 = ");";
  protected final String TEXT_2434 = NL + "\t\t";
  protected final String TEXT_2435 = " ";
  protected final String TEXT_2436 = " = (";
  protected final String TEXT_2437 = ")eVirtualGet(";
  protected final String TEXT_2438 = ");";
  protected final String TEXT_2439 = NL + "\t\treturn ";
  protected final String TEXT_2440 = " != null && ((";
  protected final String TEXT_2441 = ".Unsettable)";
  protected final String TEXT_2442 = ").isSet();";
  protected final String TEXT_2443 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2444 = ");";
  protected final String TEXT_2445 = NL + "\t\treturn (";
  protected final String TEXT_2446 = " & ";
  protected final String TEXT_2447 = "_ESETFLAG) != 0;";
  protected final String TEXT_2448 = NL + "\t\treturn ";
  protected final String TEXT_2449 = "ESet;";
  protected final String TEXT_2450 = NL + "\t\treturn !((";
  protected final String TEXT_2451 = ".Internal)((";
  protected final String TEXT_2452 = ".Internal.Wrapper)get";
  protected final String TEXT_2453 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2454 = ");";
  protected final String TEXT_2455 = NL + "\t\treturn !((";
  protected final String TEXT_2456 = ".Internal)get";
  protected final String TEXT_2457 = "()).isEmpty(";
  protected final String TEXT_2458 = ");";
  protected final String TEXT_2459 = NL;
  protected final String TEXT_2460 = NL + "\t\treturn ";
  protected final String TEXT_2461 = ".";
  protected final String TEXT_2462 = "(this);";
  protected final String TEXT_2463 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2464 = "' ";
  protected final String TEXT_2465 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2466 = NL + "\t}" + NL;
  protected final String TEXT_2467 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2468 = " ";
  protected final String TEXT_2469 = "()" + NL + "\t{";
  protected final String TEXT_2470 = NL + "\t\treturn ";
  protected final String TEXT_2471 = "();";
  protected final String TEXT_2472 = NL + "\t\treturn new ";
  protected final String TEXT_2473 = ".UnmodifiableEList(this, ";
  protected final String TEXT_2474 = "null";
  protected final String TEXT_2475 = ", 0, ";
  protected final String TEXT_2476 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2477 = NL + "\t\treturn null;";
  protected final String TEXT_2478 = NL + "\t\treturn ";
  protected final String TEXT_2479 = "();";
  protected final String TEXT_2480 = NL + "\t}" + NL;
  protected final String TEXT_2481 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2482 = " basicGet";
  protected final String TEXT_2483 = "()" + NL + "\t{";
  protected final String TEXT_2484 = NL + "\t\treturn null;";
  protected final String TEXT_2485 = NL + "\t\treturn ";
  protected final String TEXT_2486 = "basicGet";
  protected final String TEXT_2487 = "();";
  protected final String TEXT_2488 = NL + "\t}" + NL;
  protected final String TEXT_2489 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2490 = " basicSet";
  protected final String TEXT_2491 = "(";
  protected final String TEXT_2492 = " new";
  protected final String TEXT_2493 = ", ";
  protected final String TEXT_2494 = " msgs)" + NL + "\t{";
  protected final String TEXT_2495 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2496 = NL + "\t\tif (new";
  protected final String TEXT_2497 = " != null && !(new";
  protected final String TEXT_2498 = " instanceof ";
  protected final String TEXT_2499 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2500 = "));" + NL + "\t\t}";
  protected final String TEXT_2501 = NL + "\t\treturn basicSet";
  protected final String TEXT_2502 = "(";
  protected final String TEXT_2503 = "(";
  protected final String TEXT_2504 = ") ";
  protected final String TEXT_2505 = "new";
  protected final String TEXT_2506 = ", msgs);";
  protected final String TEXT_2507 = NL + "\t\tset";
  protected final String TEXT_2508 = "(";
  protected final String TEXT_2509 = "(";
  protected final String TEXT_2510 = ") ";
  protected final String TEXT_2511 = "new";
  protected final String TEXT_2512 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2513 = NL + "\t}" + NL;
  protected final String TEXT_2514 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_2515 = "(";
  protected final String TEXT_2516 = " new";
  protected final String TEXT_2517 = ")" + NL + "\t{";
  protected final String TEXT_2518 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2519 = NL + "\t\tif (new";
  protected final String TEXT_2520 = " != null && !(new";
  protected final String TEXT_2521 = " instanceof ";
  protected final String TEXT_2522 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2523 = "));" + NL + "\t\t}";
  protected final String TEXT_2524 = NL + "\t\tset";
  protected final String TEXT_2525 = "(";
  protected final String TEXT_2526 = "(";
  protected final String TEXT_2527 = ") ";
  protected final String TEXT_2528 = "new";
  protected final String TEXT_2529 = ");";
  protected final String TEXT_2530 = NL + "\t}" + NL;
  protected final String TEXT_2531 = NL;
  protected final String TEXT_2532 = NL + "\t/**";
  protected final String TEXT_2533 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2534 = "}, with the specified ";
  protected final String TEXT_2535 = ", and appends it to the '<em><b>";
  protected final String TEXT_2536 = "</b></em>' ";
  protected final String TEXT_2537 = ".";
  protected final String TEXT_2538 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2539 = "}, with the specified ";
  protected final String TEXT_2540 = ", and sets the '<em><b>";
  protected final String TEXT_2541 = "</b></em>' ";
  protected final String TEXT_2542 = ".";
  protected final String TEXT_2543 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2544 = "} and appends it to the '<em><b>";
  protected final String TEXT_2545 = "</b></em>' ";
  protected final String TEXT_2546 = ".";
  protected final String TEXT_2547 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2548 = "} and sets the '<em><b>";
  protected final String TEXT_2549 = "</b></em>' ";
  protected final String TEXT_2550 = ".";
  protected final String TEXT_2551 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2552 = NL + "\t * @param ";
  protected final String TEXT_2553 = " The ";
  protected final String TEXT_2554 = " for the new {@link ";
  protected final String TEXT_2555 = "}, or <code>null</code>.";
  protected final String TEXT_2556 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2557 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2558 = "}." + NL + "\t * @see #";
  protected final String TEXT_2559 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2560 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2561 = NL + "\t";
  protected final String TEXT_2562 = " create";
  protected final String TEXT_2563 = "(";
  protected final String TEXT_2564 = ", ";
  protected final String TEXT_2565 = " eClass);" + NL;
  protected final String TEXT_2566 = NL + "\tpublic ";
  protected final String TEXT_2567 = " create";
  protected final String TEXT_2568 = "(";
  protected final String TEXT_2569 = ", ";
  protected final String TEXT_2570 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2571 = " new";
  protected final String TEXT_2572 = " = (";
  protected final String TEXT_2573 = ") ";
  protected final String TEXT_2574 = ".create(eClass);";
  protected final String TEXT_2575 = NL + "\t\tint ";
  protected final String TEXT_2576 = "ListSize = 0;";
  protected final String TEXT_2577 = NL + "\t\tint ";
  protected final String TEXT_2578 = "Size = ";
  protected final String TEXT_2579 = " == null ? 0 : ";
  protected final String TEXT_2580 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2581 = "Size > ";
  protected final String TEXT_2582 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2583 = "ListSize = ";
  protected final String TEXT_2584 = "Size;";
  protected final String TEXT_2585 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2586 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2587 = ".create";
  protected final String TEXT_2588 = "(";
  protected final String TEXT_2589 = ", ";
  protected final String TEXT_2590 = "i < ";
  protected final String TEXT_2591 = "Size ? (";
  protected final String TEXT_2592 = ") ";
  protected final String TEXT_2593 = ".get(i) : null";
  protected final String TEXT_2594 = ");" + NL + "\t\t}";
  protected final String TEXT_2595 = NL + "\t\tnew";
  protected final String TEXT_2596 = ".create";
  protected final String TEXT_2597 = "(";
  protected final String TEXT_2598 = ", ";
  protected final String TEXT_2599 = ");";
  protected final String TEXT_2600 = NL + "\t\tif (";
  protected final String TEXT_2601 = " != null)";
  protected final String TEXT_2602 = NL + "\t\t\tnew";
  protected final String TEXT_2603 = ".";
  protected final String TEXT_2604 = "().addAll(";
  protected final String TEXT_2605 = ");";
  protected final String TEXT_2606 = NL + "\t\t\tnew";
  protected final String TEXT_2607 = ".set";
  protected final String TEXT_2608 = "(";
  protected final String TEXT_2609 = ");";
  protected final String TEXT_2610 = NL + "\t\t";
  protected final String TEXT_2611 = "().add(new";
  protected final String TEXT_2612 = ");";
  protected final String TEXT_2613 = NL + "\t\tset";
  protected final String TEXT_2614 = "(new";
  protected final String TEXT_2615 = ");";
  protected final String TEXT_2616 = NL + "\t\treturn new";
  protected final String TEXT_2617 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2618 = NL + "\t/**";
  protected final String TEXT_2619 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2620 = "}, with the specified ";
  protected final String TEXT_2621 = ", and appends it to the '<em><b>";
  protected final String TEXT_2622 = "</b></em>' ";
  protected final String TEXT_2623 = ".";
  protected final String TEXT_2624 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2625 = "},with the specified ";
  protected final String TEXT_2626 = ", and sets the '<em><b>";
  protected final String TEXT_2627 = "</b></em>' ";
  protected final String TEXT_2628 = ".";
  protected final String TEXT_2629 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2630 = "} and appends it to the '<em><b>";
  protected final String TEXT_2631 = "</b></em>' ";
  protected final String TEXT_2632 = ".";
  protected final String TEXT_2633 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2634 = "} and sets the '<em><b>";
  protected final String TEXT_2635 = "</b></em>' ";
  protected final String TEXT_2636 = ".";
  protected final String TEXT_2637 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2638 = NL + "\t * @param ";
  protected final String TEXT_2639 = " The ";
  protected final String TEXT_2640 = " for the new {@link ";
  protected final String TEXT_2641 = "}, or <code>null</code>.";
  protected final String TEXT_2642 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2643 = "}." + NL + "\t * @see #";
  protected final String TEXT_2644 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2645 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2646 = NL + "\t";
  protected final String TEXT_2647 = " create";
  protected final String TEXT_2648 = "(";
  protected final String TEXT_2649 = ");" + NL;
  protected final String TEXT_2650 = NL + "\tpublic ";
  protected final String TEXT_2651 = " create";
  protected final String TEXT_2652 = "(";
  protected final String TEXT_2653 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2654 = " new";
  protected final String TEXT_2655 = " = ";
  protected final String TEXT_2656 = ".eINSTANCE.create";
  protected final String TEXT_2657 = "();";
  protected final String TEXT_2658 = NL + "\t\tint ";
  protected final String TEXT_2659 = "ListSize = 0;";
  protected final String TEXT_2660 = NL + "\t\tint ";
  protected final String TEXT_2661 = "Size = ";
  protected final String TEXT_2662 = " == null ? 0 : ";
  protected final String TEXT_2663 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2664 = "Size > ";
  protected final String TEXT_2665 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2666 = "ListSize = ";
  protected final String TEXT_2667 = "Size;";
  protected final String TEXT_2668 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2669 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2670 = ".create";
  protected final String TEXT_2671 = "(";
  protected final String TEXT_2672 = ", ";
  protected final String TEXT_2673 = "i < ";
  protected final String TEXT_2674 = "Size ? (";
  protected final String TEXT_2675 = ") ";
  protected final String TEXT_2676 = ".get(i) : null";
  protected final String TEXT_2677 = ");" + NL + "\t\t}";
  protected final String TEXT_2678 = NL + "\t\tnew";
  protected final String TEXT_2679 = ".create";
  protected final String TEXT_2680 = "(";
  protected final String TEXT_2681 = ", ";
  protected final String TEXT_2682 = ");";
  protected final String TEXT_2683 = NL + "\t\tif (";
  protected final String TEXT_2684 = " != null)";
  protected final String TEXT_2685 = NL + "\t\t\tnew";
  protected final String TEXT_2686 = ".";
  protected final String TEXT_2687 = "().addAll(";
  protected final String TEXT_2688 = ");";
  protected final String TEXT_2689 = NL + "\t\t\tnew";
  protected final String TEXT_2690 = ".set";
  protected final String TEXT_2691 = "(";
  protected final String TEXT_2692 = ");";
  protected final String TEXT_2693 = NL + "\t\t";
  protected final String TEXT_2694 = "().add(new";
  protected final String TEXT_2695 = ");";
  protected final String TEXT_2696 = NL + "\t\tset";
  protected final String TEXT_2697 = "(new";
  protected final String TEXT_2698 = ");";
  protected final String TEXT_2699 = NL + "\t\treturn new";
  protected final String TEXT_2700 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2701 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2702 = "} with the specified ";
  protected final String TEXT_2703 = " from the '<em><b>";
  protected final String TEXT_2704 = "</b></em>' ";
  protected final String TEXT_2705 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2706 = NL + "\t * @param ";
  protected final String TEXT_2707 = " The ";
  protected final String TEXT_2708 = " of the {@link ";
  protected final String TEXT_2709 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2710 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2711 = "} with the specified ";
  protected final String TEXT_2712 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2713 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2714 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2715 = NL + "\t";
  protected final String TEXT_2716 = " get";
  protected final String TEXT_2717 = "(";
  protected final String TEXT_2718 = ");" + NL;
  protected final String TEXT_2719 = NL + "\tpublic ";
  protected final String TEXT_2720 = " get";
  protected final String TEXT_2721 = "(";
  protected final String TEXT_2722 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2723 = "(";
  protected final String TEXT_2724 = ", false";
  protected final String TEXT_2725 = ", null";
  protected final String TEXT_2726 = ", false";
  protected final String TEXT_2727 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2728 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2729 = "} with the specified ";
  protected final String TEXT_2730 = " from the '<em><b>";
  protected final String TEXT_2731 = "</b></em>' ";
  protected final String TEXT_2732 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2733 = NL + "\t * @param ";
  protected final String TEXT_2734 = " The ";
  protected final String TEXT_2735 = " of the {@link ";
  protected final String TEXT_2736 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2737 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2738 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2739 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2740 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2741 = "} on demand if not found.";
  protected final String TEXT_2742 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2743 = "} with the specified ";
  protected final String TEXT_2744 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2745 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2746 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2747 = NL + "\t";
  protected final String TEXT_2748 = " get";
  protected final String TEXT_2749 = "(";
  protected final String TEXT_2750 = ", boolean ignoreCase";
  protected final String TEXT_2751 = ", ";
  protected final String TEXT_2752 = " eClass";
  protected final String TEXT_2753 = ", boolean createOnDemand";
  protected final String TEXT_2754 = ");" + NL;
  protected final String TEXT_2755 = NL + "\tpublic ";
  protected final String TEXT_2756 = " get";
  protected final String TEXT_2757 = "(";
  protected final String TEXT_2758 = ", boolean ignoreCase";
  protected final String TEXT_2759 = ", ";
  protected final String TEXT_2760 = " eClass";
  protected final String TEXT_2761 = ", boolean createOnDemand";
  protected final String TEXT_2762 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2763 = "Loop: for (";
  protected final String TEXT_2764 = " i = ";
  protected final String TEXT_2765 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2766 = " ";
  protected final String TEXT_2767 = " = (";
  protected final String TEXT_2768 = ") i.next();";
  protected final String TEXT_2769 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2770 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2771 = "Loop;";
  protected final String TEXT_2772 = NL + "\t\t\t";
  protected final String TEXT_2773 = " ";
  protected final String TEXT_2774 = "List = ";
  protected final String TEXT_2775 = ".";
  protected final String TEXT_2776 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2777 = "ListSize = ";
  protected final String TEXT_2778 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2779 = " || (";
  protected final String TEXT_2780 = " != null && ";
  protected final String TEXT_2781 = ".size() != ";
  protected final String TEXT_2782 = "ListSize";
  protected final String TEXT_2783 = ")";
  protected final String TEXT_2784 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2785 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2786 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2787 = " ";
  protected final String TEXT_2788 = " = (";
  protected final String TEXT_2789 = ") ";
  protected final String TEXT_2790 = "List.get(j);";
  protected final String TEXT_2791 = NL + "\t\t\t\tif (";
  protected final String TEXT_2792 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2793 = ")";
  protected final String TEXT_2794 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2795 = ".";
  protected final String TEXT_2796 = "()) : ";
  protected final String TEXT_2797 = ".get(j).equals(";
  protected final String TEXT_2798 = ".";
  protected final String TEXT_2799 = "())))";
  protected final String TEXT_2800 = NL + "\t\t\t\tif (";
  protected final String TEXT_2801 = " != null && !";
  protected final String TEXT_2802 = ".get(j).equals(";
  protected final String TEXT_2803 = ".";
  protected final String TEXT_2804 = "()))";
  protected final String TEXT_2805 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2806 = "Loop;";
  protected final String TEXT_2807 = NL + "\t\t\t}";
  protected final String TEXT_2808 = NL + "\t\t\t";
  protected final String TEXT_2809 = " ";
  protected final String TEXT_2810 = " = ";
  protected final String TEXT_2811 = ".";
  protected final String TEXT_2812 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2813 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2814 = "Loop;";
  protected final String TEXT_2815 = NL + "\t\t\tif (";
  protected final String TEXT_2816 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2817 = ".equalsIgnoreCase(";
  protected final String TEXT_2818 = ".";
  protected final String TEXT_2819 = "()) : ";
  protected final String TEXT_2820 = ".equals(";
  protected final String TEXT_2821 = ".";
  protected final String TEXT_2822 = "())))";
  protected final String TEXT_2823 = NL + "\t\t\tif (";
  protected final String TEXT_2824 = " != null && !";
  protected final String TEXT_2825 = ".equals(";
  protected final String TEXT_2826 = ".";
  protected final String TEXT_2827 = "()))";
  protected final String TEXT_2828 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2829 = "Loop;";
  protected final String TEXT_2830 = NL + "\t\t\tif (";
  protected final String TEXT_2831 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2832 = ".equalsIgnoreCase(";
  protected final String TEXT_2833 = ".";
  protected final String TEXT_2834 = "()) : ";
  protected final String TEXT_2835 = ".equals(";
  protected final String TEXT_2836 = ".";
  protected final String TEXT_2837 = "())))";
  protected final String TEXT_2838 = NL + "\t\t\tif (";
  protected final String TEXT_2839 = " != null && !";
  protected final String TEXT_2840 = ".equals(";
  protected final String TEXT_2841 = ".";
  protected final String TEXT_2842 = "()))";
  protected final String TEXT_2843 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2844 = "Loop;";
  protected final String TEXT_2845 = NL + "\t\t\treturn ";
  protected final String TEXT_2846 = ";" + NL + "\t\t}";
  protected final String TEXT_2847 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2848 = " && eClass != null";
  protected final String TEXT_2849 = " ? create";
  protected final String TEXT_2850 = "(";
  protected final String TEXT_2851 = ", eClass";
  protected final String TEXT_2852 = ") : null;";
  protected final String TEXT_2853 = NL + "\t\treturn null;";
  protected final String TEXT_2854 = NL + "\t}" + NL;
  protected final String TEXT_2855 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2856 = "()" + NL + "\t{";
  protected final String TEXT_2857 = NL + "  \t\treturn false;";
  protected final String TEXT_2858 = NL + "\t\treturn !((";
  protected final String TEXT_2859 = ".Internal.Wrapper)";
  protected final String TEXT_2860 = "()).featureMap().isEmpty();";
  protected final String TEXT_2861 = NL + "\t\treturn ";
  protected final String TEXT_2862 = " != null && !";
  protected final String TEXT_2863 = ".featureMap().isEmpty();";
  protected final String TEXT_2864 = NL + "\t\treturn ";
  protected final String TEXT_2865 = " != null && !";
  protected final String TEXT_2866 = ".isEmpty();";
  protected final String TEXT_2867 = NL + "\t\t";
  protected final String TEXT_2868 = " ";
  protected final String TEXT_2869 = " = (";
  protected final String TEXT_2870 = ")eVirtualGet(";
  protected final String TEXT_2871 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2872 = " != null && !";
  protected final String TEXT_2873 = ".isEmpty();";
  protected final String TEXT_2874 = NL + "\t\treturn !";
  protected final String TEXT_2875 = "().isEmpty();";
  protected final String TEXT_2876 = NL + "\t\treturn ";
  protected final String TEXT_2877 = " != null;";
  protected final String TEXT_2878 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2879 = ") != null;";
  protected final String TEXT_2880 = NL + "\t\treturn basicGet";
  protected final String TEXT_2881 = "() != null;";
  protected final String TEXT_2882 = NL + "\t\treturn ";
  protected final String TEXT_2883 = " != null;";
  protected final String TEXT_2884 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2885 = ") != null;";
  protected final String TEXT_2886 = NL + "\t\treturn ";
  protected final String TEXT_2887 = "() != null;";
  protected final String TEXT_2888 = NL + "\t\treturn ((";
  protected final String TEXT_2889 = " & ";
  protected final String TEXT_2890 = "_EFLAG) != 0) != ";
  protected final String TEXT_2891 = "_EDEFAULT;";
  protected final String TEXT_2892 = NL + "\t\treturn ";
  protected final String TEXT_2893 = " != ";
  protected final String TEXT_2894 = "_EDEFAULT;";
  protected final String TEXT_2895 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2896 = ", ";
  protected final String TEXT_2897 = "_EDEFAULT) != ";
  protected final String TEXT_2898 = "_EDEFAULT;";
  protected final String TEXT_2899 = NL + "\t\treturn ";
  protected final String TEXT_2900 = "() != ";
  protected final String TEXT_2901 = "_EDEFAULT;";
  protected final String TEXT_2902 = NL + "\t\treturn ";
  protected final String TEXT_2903 = "_EDEFAULT == null ? ";
  protected final String TEXT_2904 = " != null : !";
  protected final String TEXT_2905 = "_EDEFAULT.equals(";
  protected final String TEXT_2906 = ");";
  protected final String TEXT_2907 = NL + "\t\t";
  protected final String TEXT_2908 = " ";
  protected final String TEXT_2909 = " = (";
  protected final String TEXT_2910 = ")eVirtualGet(";
  protected final String TEXT_2911 = ", ";
  protected final String TEXT_2912 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2913 = "_EDEFAULT == null ? ";
  protected final String TEXT_2914 = " != null : !";
  protected final String TEXT_2915 = "_EDEFAULT.equals(";
  protected final String TEXT_2916 = ");";
  protected final String TEXT_2917 = NL + "\t\treturn ";
  protected final String TEXT_2918 = "_EDEFAULT == null ? ";
  protected final String TEXT_2919 = "() != null : !";
  protected final String TEXT_2920 = "_EDEFAULT.equals(";
  protected final String TEXT_2921 = "());";
  protected final String TEXT_2922 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2923 = ");";
  protected final String TEXT_2924 = NL + "\t\t";
  protected final String TEXT_2925 = " ";
  protected final String TEXT_2926 = " = (";
  protected final String TEXT_2927 = ")eVirtualGet(";
  protected final String TEXT_2928 = ");";
  protected final String TEXT_2929 = NL + "\t\treturn ";
  protected final String TEXT_2930 = " != null && ((";
  protected final String TEXT_2931 = ".Unsettable)";
  protected final String TEXT_2932 = ").isSet();";
  protected final String TEXT_2933 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2934 = ");";
  protected final String TEXT_2935 = NL + "\t\treturn (";
  protected final String TEXT_2936 = " & ";
  protected final String TEXT_2937 = "_ESETFLAG) != 0;";
  protected final String TEXT_2938 = NL + "\t\treturn ";
  protected final String TEXT_2939 = "ESet;";
  protected final String TEXT_2940 = NL + "\t\treturn !((";
  protected final String TEXT_2941 = ".Internal)((";
  protected final String TEXT_2942 = ".Internal.Wrapper)get";
  protected final String TEXT_2943 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2944 = ");";
  protected final String TEXT_2945 = NL + "\t\treturn !((";
  protected final String TEXT_2946 = ".Internal)get";
  protected final String TEXT_2947 = "()).isEmpty(";
  protected final String TEXT_2948 = ");";
  protected final String TEXT_2949 = NL;
  protected final String TEXT_2950 = NL + "\t\treturn ";
  protected final String TEXT_2951 = ".";
  protected final String TEXT_2952 = "(this);";
  protected final String TEXT_2953 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2954 = "' ";
  protected final String TEXT_2955 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2956 = NL + "\t}" + NL;
  protected final String TEXT_2957 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2958 = " ";
  protected final String TEXT_2959 = "(";
  protected final String TEXT_2960 = ")";
  protected final String TEXT_2961 = NL + "\t{";
  protected final String TEXT_2962 = NL + "\t\t";
  protected final String TEXT_2963 = "(";
  protected final String TEXT_2964 = ");";
  protected final String TEXT_2965 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2966 = NL + "\t\treturn ";
  protected final String TEXT_2967 = "(";
  protected final String TEXT_2968 = ");";
  protected final String TEXT_2969 = NL + "\t}" + NL;
  protected final String TEXT_2970 = NL + "} //";
  protected final String TEXT_2971 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2005 IBM Corporation and others.
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

    GenClass genClass = (GenClass)((Object[])argument)[0]; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
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
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getInterfaceName());
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
    if (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable())) {
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    stringBuffer.append(TEXT_83);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_91);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_92);
    } else {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_100);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_107);
    } else {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_111);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_113);
    for (Iterator i=genClass.getFlagGenFeatures("true").iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_116);
    }
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_119);
    }
    for (Iterator i=(isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures()).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_120);
    if (!isImplementation) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_123);
    } else {
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_126);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_131);
    } else {
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_138);
    }
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    if (!isImplementation) {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_144);
    } else {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_150);
    if (!isImplementation) {
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_154);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_156);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_159);
    }
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    if (!isImplementation) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_165);
    } else {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_173);
    }
    stringBuffer.append(TEXT_174);
    if (!isImplementation) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_177);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_181);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_184);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_185);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_187);
    } else {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_189);
    }
    stringBuffer.append(TEXT_190);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_191);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_192);
    } else {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_194);
    }
    stringBuffer.append(TEXT_195);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_197);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_199);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_201);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_205);
    }
    }
    stringBuffer.append(TEXT_206);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_215);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_218);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_220);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_223);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_226);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_229);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_231);
    }}
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_233);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_236);
    } else {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_239);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_240);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_244);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_246);
    }
    stringBuffer.append(TEXT_247);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_252);
    }
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_254);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_258);
    } else {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_261);
    }
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_263);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_266);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_272);
    }
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_285);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_290);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_294);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_298);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_299);
    }
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_301);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_304);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_307);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_308);
    }
    stringBuffer.append(TEXT_309);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_312);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_319);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_324);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_327);
    } else {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_329);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_339);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_343);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_345);
    } else {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_350);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_352);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_354);
    } else {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_358);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_359);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_360);
    }
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_365);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    } else {
    stringBuffer.append(TEXT_369);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_370);
    }
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_374);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_376);
    }
    stringBuffer.append(TEXT_377);
    }
    }
    } else {
    stringBuffer.append(TEXT_378);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_382);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_385);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_386);
    }
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_388);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_392);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_393);
    }
    stringBuffer.append(TEXT_394);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_397);
    }
    stringBuffer.append(TEXT_398);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_400);
    } else {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_403);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_404);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_407);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_410);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_413);
    } else {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_415);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_420);
    } else {
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_424);
    }
    } else {
    stringBuffer.append(TEXT_425);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_426);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_428);
    } else {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_431);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_432);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_438);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_439);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_445);
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_449);
    } else {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_455);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_457);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_463);
    } else {
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_467);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_468);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_473);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_477);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_478);
    } else {
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_480);
    }
    stringBuffer.append(TEXT_481);
    } else {
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_486);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_491);
    }
    stringBuffer.append(TEXT_492);
    }
    stringBuffer.append(TEXT_493);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_498);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_502);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_504);
    }
    }
    stringBuffer.append(TEXT_505);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_511);
    } else {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_513);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_516);
    }
    } else {
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_519);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_520);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_527);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_530);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_532);
    }
    }
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_534);
    } else {
    stringBuffer.append(TEXT_535);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_538);
    } else {
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(TEXT_543);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_548);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_552);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_554);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_557);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_559);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_561);
    }
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_563);
    }
    stringBuffer.append(TEXT_564);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_582);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_588);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_593);
    }
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_598);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_606);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_615);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_620);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_621);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_624);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_628);
    }
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_631);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_634);
    }
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_636);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_643);
    }
    stringBuffer.append(TEXT_644);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_650);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_655);
    }
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_661);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_665);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_671);
    } else {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_676);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_681);
    } else {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_685);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_689);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_691);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_695);
    }
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_698);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_701);
    }
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_703);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_707);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_708);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_709);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_710);
    }
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_713);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_715);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_716);
    } else {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_718);
    }
    stringBuffer.append(TEXT_719);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_723);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_725);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_726);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_727);
    }
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_730);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_732);
    }
    }
    }
    stringBuffer.append(TEXT_733);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_738);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_744);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_747);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_749);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_751);
    }
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_753);
    }
    stringBuffer.append(TEXT_754);
    } else {
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_758);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_760);
    }
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_762);
    }
    stringBuffer.append(TEXT_763);
    }
    } else {
    stringBuffer.append(TEXT_764);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_765);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_768);
    } else {
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_771);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_772);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_776);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_779);
    } else {
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_784);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_786);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_792);
    } else {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_796);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_801);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    } else {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_805);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_806);
    } else {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_808);
    }
    stringBuffer.append(TEXT_809);
    }
    } else {
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_812);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_813);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_818);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_820);
    }
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_822);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_825);
    }
    stringBuffer.append(TEXT_826);
    } else {
    stringBuffer.append(TEXT_827);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_829);
    } else {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_831);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_833);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_836);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_841);
    }
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_844);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_848);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_851);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_852);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_853);
    }
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_855);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_858);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_862);
    }
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_865);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_868);
    }
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_870);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_875);
    }
    stringBuffer.append(TEXT_876);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_881);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_884);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_888);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_890);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_894);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_897);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_899);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_902);
    } else {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_904);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_908);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_910);
    } else {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_912);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_913);
    } else {
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_915);
    }
    stringBuffer.append(TEXT_916);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_922);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_925);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_928);
    } else {
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_930);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_934);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_937);
    } else {
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_940);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_941);
    } else {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_943);
    }
    stringBuffer.append(TEXT_944);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_949);
    } else {
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_951);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_953);
    }
    } else {
    stringBuffer.append(TEXT_954);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_955);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_957);
    } else {
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_960);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_961);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_968);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_970);
    }
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_972);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_975);
    }
    stringBuffer.append(TEXT_976);
    } else {
    stringBuffer.append(TEXT_977);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_979);
    } else {
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_981);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_983);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_988);
    }
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_992);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_994);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_997);
    } else {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_999);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1004);
    } else {
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1008);
    }
    } else {
    stringBuffer.append(TEXT_1009);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1012);
    } else {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1015);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1016);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1017);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1018);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1023);
    } else {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1028);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1032);
    } else {
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1036);
    }
    }
    stringBuffer.append(TEXT_1037);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1041);
    }
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1045);
    } else {
    stringBuffer.append(TEXT_1046);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1049);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1050);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1051);
    } else { int index = 0;
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1054);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1055);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_1060);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1062);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1070);
    }
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1074);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1075);
    }
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1079);
    }
    stringBuffer.append(TEXT_1080);
    } else {
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1083);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1084);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1085);
    }
    } else {
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1087);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1091);
    } else {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1095);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1098);
    } else {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1101);
    }
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1103);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1104);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1109);
    } else {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1114);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1118);
    } else {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1122);
    }
    }
    stringBuffer.append(TEXT_1123);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1127);
    }
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1130);
    } else {
    stringBuffer.append(TEXT_1131);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1135);
    } else { int index = 0;
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1143);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1145);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1153);
    }
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1157);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1158);
    }
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1162);
    }
    stringBuffer.append(TEXT_1163);
    } else {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1166);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1167);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1168);
    }
    } else {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1170);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1174);
    } else {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1178);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1181);
    } else {
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1184);
    }
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1186);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1191);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1195);
    }
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1199);
    } else {
    stringBuffer.append(TEXT_1200);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1204);
    } else {
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1210);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1211);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1212);
    }
    stringBuffer.append(TEXT_1213);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1218);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1222);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1223);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1225);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1227);
    }
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1231);
    } else {
    stringBuffer.append(TEXT_1232);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1236);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1238);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1239);
    }
    stringBuffer.append(TEXT_1240);
    } else { int index = 0;
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1244);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1246);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1247);
    }
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1254);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1257);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1264);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(n);
    if (!first) {
    stringBuffer.append(TEXT_1265);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1268);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1269);
    }
    }
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1276);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1285);
    } else {
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1290);
    }
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1292);
    }
    stringBuffer.append(TEXT_1293);
    } else {
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1300);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1308);
    } else {
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1313);
    }
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1315);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1323);
    } else {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1328);
    }
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1330);
    }
    }
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1332);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1333);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1334);
    }
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1337);
    }
    stringBuffer.append(TEXT_1338);
    } else {
    stringBuffer.append(TEXT_1339);
    }
    stringBuffer.append(TEXT_1340);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1342);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1343);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1346);
    } else {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1349);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1352);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1359);
    } else {
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1361);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1363);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1365);
    } else {
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1367);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1369);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1371);
    } else {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1373);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1380);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1384);
    } else {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1387);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1392);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1402);
    } else {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1407);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1409);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1414);
    }
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1418);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1420);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1423);
    } else {
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1425);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1430);
    } else {
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1434);
    }
    } else {
    stringBuffer.append(TEXT_1435);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1438);
    } else {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1441);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1442);
    }
    //Class/genFeature.override.javajetinc
    }//for
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1443);
    if (isInterface) {
    stringBuffer.append(TEXT_1444);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1446);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1449);
    }}
    stringBuffer.append(TEXT_1450);
    } else {
    stringBuffer.append(TEXT_1451);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1456);
    } else {
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1461);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1467);
    } else {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1480);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1483);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1485);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1489);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1490);
    }
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1493);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1494);
    }
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1497);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1499);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1501);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1503);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1504);
    }
    stringBuffer.append(TEXT_1505);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1507);
    }
    stringBuffer.append(TEXT_1508);
    }
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1511);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1513);
    }
    } else {
    stringBuffer.append(TEXT_1514);
    }
    }
    stringBuffer.append(TEXT_1515);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1519);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1521);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1525);
    } else {
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1528);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1530);
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1535);
    }
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1537);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1541);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1546);
    }
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1549);
    }
    }
    }
    stringBuffer.append(TEXT_1550);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1551);
    } else {
    stringBuffer.append(TEXT_1552);
    }
    stringBuffer.append(TEXT_1553);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1557);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1559);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1563);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1567);
    } else {
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1570);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1572);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1574);
    } else {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1576);
    }
    }
    }
    stringBuffer.append(TEXT_1577);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1578);
    } else {
    stringBuffer.append(TEXT_1579);
    }
    stringBuffer.append(TEXT_1580);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1583);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1587);
    }
    }
    stringBuffer.append(TEXT_1588);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1589);
    } else {
    stringBuffer.append(TEXT_1590);
    }
    stringBuffer.append(TEXT_1591);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1592);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1594);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1596);
    } else {
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1599);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1602);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1606);
    } else {
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1609);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1613);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1617);
    } else {
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1619);
    }
    }
    }
    stringBuffer.append(TEXT_1620);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1621);
    } else {
    stringBuffer.append(TEXT_1622);
    }
    stringBuffer.append(TEXT_1623);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1624);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1626);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1630);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1633);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1637);
    } else {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1640);
    }
    } else {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1644);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1648);
    } else {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1651);
    }
    stringBuffer.append(TEXT_1652);
    }
    }
    stringBuffer.append(TEXT_1653);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1654);
    } else {
    stringBuffer.append(TEXT_1655);
    }
    stringBuffer.append(TEXT_1656);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1658);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1661);
    } else {
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1663);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1665);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1668);
    } else {
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1671);
    }
    stringBuffer.append(TEXT_1672);
    }
    }
    stringBuffer.append(TEXT_1673);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1674);
    } else {
    stringBuffer.append(TEXT_1675);
    }
    stringBuffer.append(TEXT_1676);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(TEXT_1678);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1680);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1682);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1685);
    } else {
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1688);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1691);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1698);
    } else {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1700);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1702);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1704);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1706);
    } else {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1708);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1710);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1712);
    } else {
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1714);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1718);
    } else {
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1721);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1725);
    } else {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1728);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1733);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1743);
    } else {
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1748);
    }
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1749);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1750);
    } else {
    stringBuffer.append(TEXT_1751);
    }
    stringBuffer.append(TEXT_1752);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1753);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1755);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1758);
    }
    stringBuffer.append(TEXT_1759);
    }
    stringBuffer.append(TEXT_1760);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1762);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1765);
    }
    stringBuffer.append(TEXT_1766);
    }
    stringBuffer.append(TEXT_1767);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1770);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1771);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1774);
    }
    stringBuffer.append(TEXT_1775);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1778);
    }
    stringBuffer.append(TEXT_1779);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1780);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1788);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1791);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1792);
    }
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1796);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1799);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1800);
    }
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1805);
    }
    stringBuffer.append(TEXT_1806);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1809);
    } else {
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1811);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1812);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1813);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1815);
    } else {
    stringBuffer.append(TEXT_1816);
    }
    stringBuffer.append(TEXT_1817);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1819);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1822);
    } else {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1824);
    }
    stringBuffer.append(TEXT_1825);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1827);
    } else {
    stringBuffer.append(TEXT_1828);
    }
    stringBuffer.append(TEXT_1829);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1831);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1834);
    } else {
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1836);
    }
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1840);
    }
    stringBuffer.append(TEXT_1841);
    if (isImplementation) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1846);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1849);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1851);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1853);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1855);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1857);
    } else {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1860);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1864);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1865);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1867);
    } else {
    stringBuffer.append(TEXT_1868);
    }
    stringBuffer.append(TEXT_1869);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1879);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1884);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1887);
    } else {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1890);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1896);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1902);
    } else {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1911);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1915);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1919);
    } else {
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1926);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1929);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1931);
    } else {
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1934);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1939);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1941);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1944);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1946);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1959);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1960);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_1963);
    } else {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1975);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1976);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1978);
    }
    stringBuffer.append(TEXT_1979);
    }
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1984);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1985);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1986);
    }
    }
    } else {
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1989);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1992);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1995);
    } else {
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2001);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2002);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2004);
    } else {
    stringBuffer.append(TEXT_2005);
    }
    stringBuffer.append(TEXT_2006);
    }
    }
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2008);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2010);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2012);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2013);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2015);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2016);
    }
    } else {
    stringBuffer.append(TEXT_2017);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2019);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2020);
    }
    }
    } else {
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2022);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2023);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2025);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2026);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2028);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2029);
    }
    } else {
    stringBuffer.append(TEXT_2030);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2032);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2033);
    }
    }
    } else {
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2035);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2036);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2038);
    } else {
    stringBuffer.append(TEXT_2039);
    }
    }
    stringBuffer.append(TEXT_2040);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2041);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2042);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2047);
    } else {
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2052);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2056);
    } else {
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2060);
    }
    }
    stringBuffer.append(TEXT_2061);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2065);
    }
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2069);
    } else {
    stringBuffer.append(TEXT_2070);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2073);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2074);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2075);
    } else { int index = 0;
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2078);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2079);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2084);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2086);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2094);
    }
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2098);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2099);
    }
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2103);
    }
    stringBuffer.append(TEXT_2104);
    } else {
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2107);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2108);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2109);
    }
    } else {
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2111);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2115);
    } else {
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2119);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2122);
    } else {
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2125);
    }
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2127);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2128);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2133);
    } else {
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2138);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2142);
    } else {
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2146);
    }
    }
    stringBuffer.append(TEXT_2147);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2151);
    }
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2154);
    } else {
    stringBuffer.append(TEXT_2155);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2159);
    } else { int index = 0;
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_2167);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2169);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2177);
    }
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2181);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2182);
    }
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2186);
    }
    stringBuffer.append(TEXT_2187);
    } else {
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2190);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2191);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2192);
    }
    } else {
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2194);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2198);
    } else {
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2202);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2205);
    } else {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2208);
    }
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2210);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2215);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2219);
    }
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2223);
    } else {
    stringBuffer.append(TEXT_2224);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2228);
    } else {
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2234);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2235);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2236);
    }
    stringBuffer.append(TEXT_2237);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2242);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2246);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2247);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2249);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2251);
    }
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2255);
    } else {
    stringBuffer.append(TEXT_2256);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2260);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2262);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2263);
    }
    stringBuffer.append(TEXT_2264);
    } else { int index = 0;
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2268);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2270);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2271);
    }
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2278);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2281);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2288);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(n);
    if (!first) {
    stringBuffer.append(TEXT_2289);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2292);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2293);
    }
    }
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2300);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2309);
    } else {
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2314);
    }
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2316);
    }
    stringBuffer.append(TEXT_2317);
    } else {
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2324);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2332);
    } else {
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2337);
    }
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2339);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2347);
    } else {
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2352);
    }
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2354);
    }
    }
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2356);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2357);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2358);
    }
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2361);
    }
    stringBuffer.append(TEXT_2362);
    } else {
    stringBuffer.append(TEXT_2363);
    }
    stringBuffer.append(TEXT_2364);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2366);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2367);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2370);
    } else {
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2373);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2376);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2383);
    } else {
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2385);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2387);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2389);
    } else {
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2391);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2393);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2395);
    } else {
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2397);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2401);
    } else {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2404);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2408);
    } else {
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2411);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2416);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2426);
    } else {
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2431);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2433);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2438);
    }
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2442);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2444);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2447);
    } else {
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2449);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2454);
    } else {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2458);
    }
    } else {
    stringBuffer.append(TEXT_2459);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2462);
    } else {
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2465);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2466);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2469);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2471);
    } else {
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2473);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2474);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2476);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2477);
    } else {
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2479);
    }
    }
    stringBuffer.append(TEXT_2480);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2483);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2484);
    } else {
    stringBuffer.append(TEXT_2485);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2487);
    }
    stringBuffer.append(TEXT_2488);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2494);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2495);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2500);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2502);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2504);
    }
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2506);
    } else {
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2508);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2510);
    }
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2512);
    }
    }
    stringBuffer.append(TEXT_2513);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2517);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2518);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2523);
    }
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2525);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2527);
    }
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2529);
    }
    stringBuffer.append(TEXT_2530);
    }
    stringBuffer.append(TEXT_2531);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2532);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2537);
    } else {
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2542);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2546);
    } else {
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2550);
    }
    }
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
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2559);
    } else {
    stringBuffer.append(TEXT_2560);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2563);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2564);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2565);
    } else { int index = 0;
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2568);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2569);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2574);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2576);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2584);
    }
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2588);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2589);
    }
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2593);
    }
    stringBuffer.append(TEXT_2594);
    } else {
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2597);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2598);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2599);
    }
    } else {
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2601);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2605);
    } else {
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2609);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2612);
    } else {
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2615);
    }
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2617);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2618);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2623);
    } else {
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2628);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2632);
    } else {
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2636);
    }
    }
    stringBuffer.append(TEXT_2637);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2641);
    }
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2644);
    } else {
    stringBuffer.append(TEXT_2645);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2649);
    } else { int index = 0;
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_2657);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2659);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2667);
    }
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2671);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2672);
    }
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2676);
    }
    stringBuffer.append(TEXT_2677);
    } else {
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2680);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2681);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2682);
    }
    } else {
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2684);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2688);
    } else {
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2692);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2695);
    } else {
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2698);
    }
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2700);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2705);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2709);
    }
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2713);
    } else {
    stringBuffer.append(TEXT_2714);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2718);
    } else {
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2724);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2725);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2726);
    }
    stringBuffer.append(TEXT_2727);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2732);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2736);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2737);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2739);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2741);
    }
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2745);
    } else {
    stringBuffer.append(TEXT_2746);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2750);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2752);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2753);
    }
    stringBuffer.append(TEXT_2754);
    } else { int index = 0;
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2758);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2760);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2761);
    }
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2768);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2771);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2778);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(n);
    if (!first) {
    stringBuffer.append(TEXT_2779);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2782);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2783);
    }
    }
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2790);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2799);
    } else {
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2804);
    }
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2806);
    }
    stringBuffer.append(TEXT_2807);
    } else {
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2814);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2822);
    } else {
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2827);
    }
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2829);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2837);
    } else {
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2842);
    }
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2844);
    }
    }
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2846);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2847);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2848);
    }
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2851);
    }
    stringBuffer.append(TEXT_2852);
    } else {
    stringBuffer.append(TEXT_2853);
    }
    stringBuffer.append(TEXT_2854);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2856);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2857);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2860);
    } else {
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2863);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2866);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2873);
    } else {
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2875);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2877);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2879);
    } else {
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2881);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2883);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2885);
    } else {
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2887);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2891);
    } else {
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2894);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2898);
    } else {
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2901);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2906);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2915);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2916);
    } else {
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2921);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2923);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2925);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2928);
    }
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2932);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2934);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2937);
    } else {
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2939);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2944);
    } else {
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2948);
    }
    } else {
    stringBuffer.append(TEXT_2949);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2951);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2952);
    } else {
    stringBuffer.append(TEXT_2953);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2955);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2956);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2961);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2964);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2965);
    } else {
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2968);
    }
    }
    stringBuffer.append(TEXT_2969);
    }
    }
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2971);
    return stringBuffer.toString();
  }
}
