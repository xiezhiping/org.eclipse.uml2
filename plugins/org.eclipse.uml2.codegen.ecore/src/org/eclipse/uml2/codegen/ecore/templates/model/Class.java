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
  protected final String TEXT_439 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_440 = ")new";
  protected final String TEXT_441 = ", ";
  protected final String TEXT_442 = ", msgs);";
  protected final String TEXT_443 = NL;
  protected final String TEXT_444 = NL + "\t\t";
  protected final String TEXT_445 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_446 = NL + "\t\t\t";
  protected final String TEXT_447 = " ";
  protected final String TEXT_448 = " = ";
  protected final String TEXT_449 = "();";
  protected final String TEXT_450 = NL + "\t\t\tObject ";
  protected final String TEXT_451 = " = eVirtualGet(";
  protected final String TEXT_452 = ");";
  protected final String TEXT_453 = NL + "\t\t\tif (";
  protected final String TEXT_454 = " != null && ";
  protected final String TEXT_455 = " != new";
  protected final String TEXT_456 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_457 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_458 = NL + "\t\t\tif (new";
  protected final String TEXT_459 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_460 = NL + "\t\t\t\t";
  protected final String TEXT_461 = " ";
  protected final String TEXT_462 = " = ";
  protected final String TEXT_463 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_464 = ".contains(new";
  protected final String TEXT_465 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_466 = ".add(new";
  protected final String TEXT_467 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_468 = NL + "\t\t\t\t";
  protected final String TEXT_469 = " ";
  protected final String TEXT_470 = " = ";
  protected final String TEXT_471 = "();";
  protected final String TEXT_472 = NL + "\t\t\t\tObject ";
  protected final String TEXT_473 = " = eVirtualGet(";
  protected final String TEXT_474 = ");";
  protected final String TEXT_475 = NL + "\t\t\t\tif (new";
  protected final String TEXT_476 = " != ";
  protected final String TEXT_477 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_478 = "(new";
  protected final String TEXT_479 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_480 = NL + "\t\t\t}";
  protected final String TEXT_481 = NL + "\t\t}";
  protected final String TEXT_482 = NL + "\t\treturn msgs;";
  protected final String TEXT_483 = NL + "\t\tObject old";
  protected final String TEXT_484 = " = eVirtualSet(";
  protected final String TEXT_485 = ", new";
  protected final String TEXT_486 = ");";
  protected final String TEXT_487 = NL + "\t\t";
  protected final String TEXT_488 = " old";
  protected final String TEXT_489 = " = ";
  protected final String TEXT_490 = ";" + NL + "\t\t";
  protected final String TEXT_491 = " = new";
  protected final String TEXT_492 = ";";
  protected final String TEXT_493 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_494 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_495 = NL + "\t\tboolean old";
  protected final String TEXT_496 = "ESet = (";
  protected final String TEXT_497 = " & ";
  protected final String TEXT_498 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_499 = " |= ";
  protected final String TEXT_500 = "_ESETFLAG;";
  protected final String TEXT_501 = NL + "\t\tboolean old";
  protected final String TEXT_502 = "ESet = ";
  protected final String TEXT_503 = "ESet;" + NL + "\t\t";
  protected final String TEXT_504 = "ESet = true;";
  protected final String TEXT_505 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_506 = NL + "\t\t\t";
  protected final String TEXT_507 = " notification = new ";
  protected final String TEXT_508 = "(this, ";
  protected final String TEXT_509 = ".SET, ";
  protected final String TEXT_510 = ", ";
  protected final String TEXT_511 = "isSetChange ? null : old";
  protected final String TEXT_512 = "old";
  protected final String TEXT_513 = ", new";
  protected final String TEXT_514 = ", ";
  protected final String TEXT_515 = "isSetChange";
  protected final String TEXT_516 = "!old";
  protected final String TEXT_517 = "ESet";
  protected final String TEXT_518 = ");";
  protected final String TEXT_519 = NL + "\t\t\t";
  protected final String TEXT_520 = " notification = new ";
  protected final String TEXT_521 = "(this, ";
  protected final String TEXT_522 = ".SET, ";
  protected final String TEXT_523 = ", ";
  protected final String TEXT_524 = "old";
  protected final String TEXT_525 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_526 = "old";
  protected final String TEXT_527 = ", new";
  protected final String TEXT_528 = ");";
  protected final String TEXT_529 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_530 = NL;
  protected final String TEXT_531 = NL + "\t\t";
  protected final String TEXT_532 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_533 = NL + "\t\t\t";
  protected final String TEXT_534 = " ";
  protected final String TEXT_535 = " = ";
  protected final String TEXT_536 = "();";
  protected final String TEXT_537 = NL + "\t\t\tObject ";
  protected final String TEXT_538 = " = eVirtualGet(";
  protected final String TEXT_539 = ");";
  protected final String TEXT_540 = NL + "\t\t\tif (";
  protected final String TEXT_541 = " != null && ";
  protected final String TEXT_542 = " != new";
  protected final String TEXT_543 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_544 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_545 = NL + "\t\t\tif (new";
  protected final String TEXT_546 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_547 = NL + "\t\t\t\t";
  protected final String TEXT_548 = " ";
  protected final String TEXT_549 = " = ";
  protected final String TEXT_550 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_551 = ".contains(new";
  protected final String TEXT_552 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_553 = ".add(new";
  protected final String TEXT_554 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_555 = NL + "\t\t\t\t";
  protected final String TEXT_556 = " ";
  protected final String TEXT_557 = " = ";
  protected final String TEXT_558 = "();";
  protected final String TEXT_559 = NL + "\t\t\t\tObject ";
  protected final String TEXT_560 = " = eVirtualGet(";
  protected final String TEXT_561 = ");";
  protected final String TEXT_562 = NL + "\t\t\t\tif (new";
  protected final String TEXT_563 = " != ";
  protected final String TEXT_564 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_565 = "(new";
  protected final String TEXT_566 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_567 = NL + "\t\t\t}";
  protected final String TEXT_568 = NL + "\t\t}";
  protected final String TEXT_569 = NL + "\t\treturn msgs;";
  protected final String TEXT_570 = NL + "\t\treturn ((";
  protected final String TEXT_571 = ".Internal)((";
  protected final String TEXT_572 = ".Internal.Wrapper)get";
  protected final String TEXT_573 = "()).featureMap()).basicAdd(";
  protected final String TEXT_574 = ", new";
  protected final String TEXT_575 = ", msgs);";
  protected final String TEXT_576 = NL + "\t\treturn ((";
  protected final String TEXT_577 = ".Internal)get";
  protected final String TEXT_578 = "()).basicAdd(";
  protected final String TEXT_579 = ", new";
  protected final String TEXT_580 = ", msgs);";
  protected final String TEXT_581 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_582 = "' ";
  protected final String TEXT_583 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_584 = NL + "\t}" + NL;
  protected final String TEXT_585 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_586 = "#";
  protected final String TEXT_587 = " <em>";
  protected final String TEXT_588 = "</em>}' ";
  protected final String TEXT_589 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_590 = "</em>' ";
  protected final String TEXT_591 = ".";
  protected final String TEXT_592 = NL + "\t * @see ";
  protected final String TEXT_593 = NL + "\t * @see #isSet";
  protected final String TEXT_594 = "()";
  protected final String TEXT_595 = NL + "\t * @see #unset";
  protected final String TEXT_596 = "()";
  protected final String TEXT_597 = NL + "\t * @see #";
  protected final String TEXT_598 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_599 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_600 = NL + "\tvoid set";
  protected final String TEXT_601 = "(";
  protected final String TEXT_602 = " value);" + NL;
  protected final String TEXT_603 = NL + "\tpublic void set";
  protected final String TEXT_604 = "(";
  protected final String TEXT_605 = " new";
  protected final String TEXT_606 = ")" + NL + "\t{";
  protected final String TEXT_607 = NL;
  protected final String TEXT_608 = NL + "\t\tnew";
  protected final String TEXT_609 = " = new";
  protected final String TEXT_610 = " == null ? ";
  protected final String TEXT_611 = "_EDEFAULT : new";
  protected final String TEXT_612 = ";";
  protected final String TEXT_613 = NL + "\t\teSet(";
  protected final String TEXT_614 = ", ";
  protected final String TEXT_615 = "new ";
  protected final String TEXT_616 = "(";
  protected final String TEXT_617 = "new";
  protected final String TEXT_618 = ")";
  protected final String TEXT_619 = ");";
  protected final String TEXT_620 = NL + "\t\tif (new";
  protected final String TEXT_621 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_622 = " && new";
  protected final String TEXT_623 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_624 = ".isAncestor(this, ";
  protected final String TEXT_625 = "new";
  protected final String TEXT_626 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_627 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_628 = NL + "\t\t\t";
  protected final String TEXT_629 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_630 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_631 = ")new";
  protected final String TEXT_632 = ").eInverseAdd(this, ";
  protected final String TEXT_633 = ", ";
  protected final String TEXT_634 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_635 = "(";
  protected final String TEXT_636 = "new";
  protected final String TEXT_637 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_638 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_639 = "(this, ";
  protected final String TEXT_640 = ".SET, ";
  protected final String TEXT_641 = ", new";
  protected final String TEXT_642 = ", new";
  protected final String TEXT_643 = "));";
  protected final String TEXT_644 = NL + "\t\t";
  protected final String TEXT_645 = " ";
  protected final String TEXT_646 = " = (";
  protected final String TEXT_647 = ")eVirtualGet(";
  protected final String TEXT_648 = ");";
  protected final String TEXT_649 = NL + "\t\tif (new";
  protected final String TEXT_650 = " != ";
  protected final String TEXT_651 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_652 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_653 = " != null)";
  protected final String TEXT_654 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_655 = ")";
  protected final String TEXT_656 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_657 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_658 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_659 = ")new";
  protected final String TEXT_660 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_661 = ", null, msgs);";
  protected final String TEXT_662 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_663 = ")";
  protected final String TEXT_664 = ").eInverseRemove(this, ";
  protected final String TEXT_665 = ", ";
  protected final String TEXT_666 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_667 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_668 = ")new";
  protected final String TEXT_669 = ").eInverseAdd(this, ";
  protected final String TEXT_670 = ", ";
  protected final String TEXT_671 = ".class, msgs);";
  protected final String TEXT_672 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_673 = "(";
  protected final String TEXT_674 = "new";
  protected final String TEXT_675 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_676 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_677 = NL + "\t\t\tboolean old";
  protected final String TEXT_678 = "ESet = eVirtualIsSet(";
  protected final String TEXT_679 = ");";
  protected final String TEXT_680 = NL + "\t\t\tboolean old";
  protected final String TEXT_681 = "ESet = (";
  protected final String TEXT_682 = " & ";
  protected final String TEXT_683 = "_ESETFLAG) != 0;";
  protected final String TEXT_684 = NL + "\t\t\t";
  protected final String TEXT_685 = " |= ";
  protected final String TEXT_686 = "_ESETFLAG;";
  protected final String TEXT_687 = NL + "\t\t\tboolean old";
  protected final String TEXT_688 = "ESet = ";
  protected final String TEXT_689 = "ESet;";
  protected final String TEXT_690 = NL + "\t\t\t";
  protected final String TEXT_691 = "ESet = true;";
  protected final String TEXT_692 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_693 = "(this, ";
  protected final String TEXT_694 = ".SET, ";
  protected final String TEXT_695 = ", new";
  protected final String TEXT_696 = ", new";
  protected final String TEXT_697 = ", !old";
  protected final String TEXT_698 = "ESet));";
  protected final String TEXT_699 = NL + "    \t}";
  protected final String TEXT_700 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_701 = "(this, ";
  protected final String TEXT_702 = ".SET, ";
  protected final String TEXT_703 = ", new";
  protected final String TEXT_704 = ", new";
  protected final String TEXT_705 = "));";
  protected final String TEXT_706 = NL + "\t\t";
  protected final String TEXT_707 = " old";
  protected final String TEXT_708 = " = (";
  protected final String TEXT_709 = " & ";
  protected final String TEXT_710 = "_EFLAG) != 0;";
  protected final String TEXT_711 = NL + "\t\tif (new";
  protected final String TEXT_712 = ") ";
  protected final String TEXT_713 = " |= ";
  protected final String TEXT_714 = "_EFLAG; else ";
  protected final String TEXT_715 = " &= ~";
  protected final String TEXT_716 = "_EFLAG;";
  protected final String TEXT_717 = NL + "\t\t";
  protected final String TEXT_718 = " old";
  protected final String TEXT_719 = " = ";
  protected final String TEXT_720 = ";";
  protected final String TEXT_721 = NL + "\t\t";
  protected final String TEXT_722 = " ";
  protected final String TEXT_723 = " = new";
  protected final String TEXT_724 = " == null ? ";
  protected final String TEXT_725 = "_EDEFAULT : new";
  protected final String TEXT_726 = ";";
  protected final String TEXT_727 = NL + "\t\t";
  protected final String TEXT_728 = " = new";
  protected final String TEXT_729 = " == null ? ";
  protected final String TEXT_730 = "_EDEFAULT : new";
  protected final String TEXT_731 = ";";
  protected final String TEXT_732 = NL + "\t\t";
  protected final String TEXT_733 = " ";
  protected final String TEXT_734 = " = ";
  protected final String TEXT_735 = "new";
  protected final String TEXT_736 = ";";
  protected final String TEXT_737 = NL + "\t\t";
  protected final String TEXT_738 = " = ";
  protected final String TEXT_739 = "new";
  protected final String TEXT_740 = ";";
  protected final String TEXT_741 = NL + "\t\tObject old";
  protected final String TEXT_742 = " = eVirtualSet(";
  protected final String TEXT_743 = ", ";
  protected final String TEXT_744 = ");";
  protected final String TEXT_745 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_746 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_747 = NL + "\t\tboolean old";
  protected final String TEXT_748 = "ESet = (";
  protected final String TEXT_749 = " & ";
  protected final String TEXT_750 = "_ESETFLAG) != 0;";
  protected final String TEXT_751 = NL + "\t\t";
  protected final String TEXT_752 = " |= ";
  protected final String TEXT_753 = "_ESETFLAG;";
  protected final String TEXT_754 = NL + "\t\tboolean old";
  protected final String TEXT_755 = "ESet = ";
  protected final String TEXT_756 = "ESet;";
  protected final String TEXT_757 = NL + "\t\t";
  protected final String TEXT_758 = "ESet = true;";
  protected final String TEXT_759 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_760 = "(this, ";
  protected final String TEXT_761 = ".SET, ";
  protected final String TEXT_762 = ", ";
  protected final String TEXT_763 = "isSetChange ? ";
  protected final String TEXT_764 = "null";
  protected final String TEXT_765 = "_EDEFAULT";
  protected final String TEXT_766 = " : old";
  protected final String TEXT_767 = "old";
  protected final String TEXT_768 = ", ";
  protected final String TEXT_769 = "new";
  protected final String TEXT_770 = ", ";
  protected final String TEXT_771 = "isSetChange";
  protected final String TEXT_772 = "!old";
  protected final String TEXT_773 = "ESet";
  protected final String TEXT_774 = "));";
  protected final String TEXT_775 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_776 = "(this, ";
  protected final String TEXT_777 = ".SET, ";
  protected final String TEXT_778 = ", ";
  protected final String TEXT_779 = "old";
  protected final String TEXT_780 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_781 = "null";
  protected final String TEXT_782 = "_EDEFAULT";
  protected final String TEXT_783 = " : old";
  protected final String TEXT_784 = "old";
  protected final String TEXT_785 = ", ";
  protected final String TEXT_786 = "new";
  protected final String TEXT_787 = "));";
  protected final String TEXT_788 = NL;
  protected final String TEXT_789 = NL;
  protected final String TEXT_790 = NL + "\t\t";
  protected final String TEXT_791 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_792 = NL + "\t\t\t";
  protected final String TEXT_793 = " ";
  protected final String TEXT_794 = " = ";
  protected final String TEXT_795 = "();";
  protected final String TEXT_796 = NL + "\t\t\tObject ";
  protected final String TEXT_797 = " = eVirtualGet(";
  protected final String TEXT_798 = ");";
  protected final String TEXT_799 = NL + "\t\t\tif (";
  protected final String TEXT_800 = " != null && ";
  protected final String TEXT_801 = " != new";
  protected final String TEXT_802 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_803 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_804 = NL + "\t\t\tif (new";
  protected final String TEXT_805 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_806 = NL + "\t\t\t\t";
  protected final String TEXT_807 = " ";
  protected final String TEXT_808 = " = ";
  protected final String TEXT_809 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_810 = ".contains(new";
  protected final String TEXT_811 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_812 = ".add(new";
  protected final String TEXT_813 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_814 = NL + "\t\t\t\t";
  protected final String TEXT_815 = " ";
  protected final String TEXT_816 = " = ";
  protected final String TEXT_817 = "();";
  protected final String TEXT_818 = NL + "\t\t\t\tObject ";
  protected final String TEXT_819 = " = eVirtualGet(";
  protected final String TEXT_820 = ");";
  protected final String TEXT_821 = NL + "\t\t\t\tif (new";
  protected final String TEXT_822 = " != ";
  protected final String TEXT_823 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_824 = "(new";
  protected final String TEXT_825 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_826 = NL + "\t\t\t}";
  protected final String TEXT_827 = NL + "\t\t}";
  protected final String TEXT_828 = NL + "\t\t((";
  protected final String TEXT_829 = ".Internal)((";
  protected final String TEXT_830 = ".Internal.Wrapper)get";
  protected final String TEXT_831 = "()).featureMap()).set(";
  protected final String TEXT_832 = ", ";
  protected final String TEXT_833 = "new ";
  protected final String TEXT_834 = "(";
  protected final String TEXT_835 = "new";
  protected final String TEXT_836 = ")";
  protected final String TEXT_837 = ");";
  protected final String TEXT_838 = NL + "\t\t((";
  protected final String TEXT_839 = ".Internal)get";
  protected final String TEXT_840 = "()).set(";
  protected final String TEXT_841 = ", ";
  protected final String TEXT_842 = "new ";
  protected final String TEXT_843 = "(";
  protected final String TEXT_844 = "new";
  protected final String TEXT_845 = ")";
  protected final String TEXT_846 = ");";
  protected final String TEXT_847 = NL;
  protected final String TEXT_848 = NL + "\t\t";
  protected final String TEXT_849 = ".";
  protected final String TEXT_850 = "(this, ";
  protected final String TEXT_851 = ");";
  protected final String TEXT_852 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_853 = "' ";
  protected final String TEXT_854 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_855 = NL + "\t}" + NL;
  protected final String TEXT_856 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_857 = " basicUnset";
  protected final String TEXT_858 = "(";
  protected final String TEXT_859 = " msgs)" + NL + "\t{";
  protected final String TEXT_860 = NL + "\t\tObject old";
  protected final String TEXT_861 = " = eVirtualUnset(";
  protected final String TEXT_862 = ");";
  protected final String TEXT_863 = NL + "\t\t";
  protected final String TEXT_864 = " old";
  protected final String TEXT_865 = " = ";
  protected final String TEXT_866 = ";" + NL + "\t\t";
  protected final String TEXT_867 = " = null;";
  protected final String TEXT_868 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_869 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_870 = NL + "\t\tboolean old";
  protected final String TEXT_871 = "ESet = (";
  protected final String TEXT_872 = " & ";
  protected final String TEXT_873 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_874 = " &= ~";
  protected final String TEXT_875 = "_ESETFLAG;";
  protected final String TEXT_876 = NL + "\t\tboolean old";
  protected final String TEXT_877 = "ESet = ";
  protected final String TEXT_878 = "ESet;" + NL + "\t\t";
  protected final String TEXT_879 = "ESet = false;";
  protected final String TEXT_880 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_881 = " notification = new ";
  protected final String TEXT_882 = "(this, ";
  protected final String TEXT_883 = ".UNSET, ";
  protected final String TEXT_884 = ", ";
  protected final String TEXT_885 = "isSetChange ? old";
  protected final String TEXT_886 = " : null";
  protected final String TEXT_887 = "old";
  protected final String TEXT_888 = ", null, ";
  protected final String TEXT_889 = "isSetChange";
  protected final String TEXT_890 = "old";
  protected final String TEXT_891 = "ESet";
  protected final String TEXT_892 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_893 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_894 = "' ";
  protected final String TEXT_895 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_896 = NL + "\t}" + NL;
  protected final String TEXT_897 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_898 = "#";
  protected final String TEXT_899 = " <em>";
  protected final String TEXT_900 = "</em>}' ";
  protected final String TEXT_901 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_902 = NL + "\t * @see #isSet";
  protected final String TEXT_903 = "()";
  protected final String TEXT_904 = NL + "\t * @see #";
  protected final String TEXT_905 = "()";
  protected final String TEXT_906 = NL + "\t * @see #set";
  protected final String TEXT_907 = "(";
  protected final String TEXT_908 = ")";
  protected final String TEXT_909 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_910 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_911 = NL + "\tvoid unset";
  protected final String TEXT_912 = "();" + NL;
  protected final String TEXT_913 = NL + "\tpublic void unset";
  protected final String TEXT_914 = "()" + NL + "\t{";
  protected final String TEXT_915 = NL + "\t\teUnset(";
  protected final String TEXT_916 = ");";
  protected final String TEXT_917 = NL + "\t\t((";
  protected final String TEXT_918 = ".Unsettable)get";
  protected final String TEXT_919 = "()).unset();";
  protected final String TEXT_920 = NL + "\t\t";
  protected final String TEXT_921 = " ";
  protected final String TEXT_922 = " = (";
  protected final String TEXT_923 = ")eVirtualGet(";
  protected final String TEXT_924 = ");";
  protected final String TEXT_925 = NL + "\t\tif (";
  protected final String TEXT_926 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_927 = " msgs = null;";
  protected final String TEXT_928 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_929 = ")";
  protected final String TEXT_930 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_931 = ", null, msgs);";
  protected final String TEXT_932 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_933 = ")";
  protected final String TEXT_934 = ").eInverseRemove(this, ";
  protected final String TEXT_935 = ", ";
  protected final String TEXT_936 = ".class, msgs);";
  protected final String TEXT_937 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_938 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_939 = NL + "\t\t\tboolean old";
  protected final String TEXT_940 = "ESet = eVirtualIsSet(";
  protected final String TEXT_941 = ");";
  protected final String TEXT_942 = NL + "\t\t\tboolean old";
  protected final String TEXT_943 = "ESet = (";
  protected final String TEXT_944 = " & ";
  protected final String TEXT_945 = "_ESETFLAG) != 0;";
  protected final String TEXT_946 = NL + "\t\t\t";
  protected final String TEXT_947 = " &= ~";
  protected final String TEXT_948 = "_ESETFLAG;";
  protected final String TEXT_949 = NL + "\t\t\tboolean old";
  protected final String TEXT_950 = "ESet = ";
  protected final String TEXT_951 = "ESet;";
  protected final String TEXT_952 = NL + "\t\t\t";
  protected final String TEXT_953 = "ESet = false;";
  protected final String TEXT_954 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_955 = "(this, ";
  protected final String TEXT_956 = ".UNSET, ";
  protected final String TEXT_957 = ", null, null, old";
  protected final String TEXT_958 = "ESet));";
  protected final String TEXT_959 = NL + "    \t}";
  protected final String TEXT_960 = NL + "\t\t";
  protected final String TEXT_961 = " old";
  protected final String TEXT_962 = " = (";
  protected final String TEXT_963 = " & ";
  protected final String TEXT_964 = "_EFLAG) != 0;";
  protected final String TEXT_965 = NL + "\t\tObject old";
  protected final String TEXT_966 = " = eVirtualUnset(";
  protected final String TEXT_967 = ");";
  protected final String TEXT_968 = NL + "\t\t";
  protected final String TEXT_969 = " old";
  protected final String TEXT_970 = " = ";
  protected final String TEXT_971 = ";";
  protected final String TEXT_972 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_973 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_974 = NL + "\t\tboolean old";
  protected final String TEXT_975 = "ESet = (";
  protected final String TEXT_976 = " & ";
  protected final String TEXT_977 = "_ESETFLAG) != 0;";
  protected final String TEXT_978 = NL + "\t\tboolean old";
  protected final String TEXT_979 = "ESet = ";
  protected final String TEXT_980 = "ESet;";
  protected final String TEXT_981 = NL + "\t\t";
  protected final String TEXT_982 = " = null;";
  protected final String TEXT_983 = NL + "\t\t";
  protected final String TEXT_984 = " &= ~";
  protected final String TEXT_985 = "_ESETFLAG;";
  protected final String TEXT_986 = NL + "\t\t";
  protected final String TEXT_987 = "ESet = false;";
  protected final String TEXT_988 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_989 = "(this, ";
  protected final String TEXT_990 = ".UNSET, ";
  protected final String TEXT_991 = ", ";
  protected final String TEXT_992 = "isSetChange ? old";
  protected final String TEXT_993 = " : null";
  protected final String TEXT_994 = "old";
  protected final String TEXT_995 = ", null, ";
  protected final String TEXT_996 = "isSetChange";
  protected final String TEXT_997 = "old";
  protected final String TEXT_998 = "ESet";
  protected final String TEXT_999 = "));";
  protected final String TEXT_1000 = NL + "\t\tif (";
  protected final String TEXT_1001 = "_EDEFAULT) ";
  protected final String TEXT_1002 = " |= ";
  protected final String TEXT_1003 = "_EFLAG; else ";
  protected final String TEXT_1004 = " &= ~";
  protected final String TEXT_1005 = "_EFLAG;";
  protected final String TEXT_1006 = NL + "\t\t";
  protected final String TEXT_1007 = " = ";
  protected final String TEXT_1008 = "_EDEFAULT;";
  protected final String TEXT_1009 = NL + "\t\t";
  protected final String TEXT_1010 = " &= ~";
  protected final String TEXT_1011 = "_ESETFLAG;";
  protected final String TEXT_1012 = NL + "\t\t";
  protected final String TEXT_1013 = "ESet = false;";
  protected final String TEXT_1014 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1015 = "(this, ";
  protected final String TEXT_1016 = ".UNSET, ";
  protected final String TEXT_1017 = ", ";
  protected final String TEXT_1018 = "isSetChange ? old";
  protected final String TEXT_1019 = " : ";
  protected final String TEXT_1020 = "_EDEFAULT";
  protected final String TEXT_1021 = "old";
  protected final String TEXT_1022 = ", ";
  protected final String TEXT_1023 = "_EDEFAULT, ";
  protected final String TEXT_1024 = "isSetChange";
  protected final String TEXT_1025 = "old";
  protected final String TEXT_1026 = "ESet";
  protected final String TEXT_1027 = "));";
  protected final String TEXT_1028 = NL + "\t\t((";
  protected final String TEXT_1029 = ".Internal)((";
  protected final String TEXT_1030 = ".Internal.Wrapper)get";
  protected final String TEXT_1031 = "()).featureMap()).clear(";
  protected final String TEXT_1032 = ");";
  protected final String TEXT_1033 = NL + "\t\t((";
  protected final String TEXT_1034 = ".Internal)get";
  protected final String TEXT_1035 = "()).clear(";
  protected final String TEXT_1036 = ");";
  protected final String TEXT_1037 = NL;
  protected final String TEXT_1038 = NL + "\t\t";
  protected final String TEXT_1039 = ".";
  protected final String TEXT_1040 = "(this);";
  protected final String TEXT_1041 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1042 = "' ";
  protected final String TEXT_1043 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1044 = NL + "\t}" + NL;
  protected final String TEXT_1045 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1046 = "#";
  protected final String TEXT_1047 = " <em>";
  protected final String TEXT_1048 = "</em>}' ";
  protected final String TEXT_1049 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1050 = "</em>' ";
  protected final String TEXT_1051 = " is set.";
  protected final String TEXT_1052 = NL + "\t * @see #unset";
  protected final String TEXT_1053 = "()";
  protected final String TEXT_1054 = NL + "\t * @see #";
  protected final String TEXT_1055 = "()";
  protected final String TEXT_1056 = NL + "\t * @see #set";
  protected final String TEXT_1057 = "(";
  protected final String TEXT_1058 = ")";
  protected final String TEXT_1059 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1060 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1061 = NL + "\tboolean isSet";
  protected final String TEXT_1062 = "();" + NL;
  protected final String TEXT_1063 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1064 = "()" + NL + "\t{";
  protected final String TEXT_1065 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1066 = ");";
  protected final String TEXT_1067 = NL + "\t\t";
  protected final String TEXT_1068 = " ";
  protected final String TEXT_1069 = " = (";
  protected final String TEXT_1070 = ")eVirtualGet(";
  protected final String TEXT_1071 = ");";
  protected final String TEXT_1072 = NL + "\t\treturn ";
  protected final String TEXT_1073 = " != null && ((";
  protected final String TEXT_1074 = ".Unsettable)";
  protected final String TEXT_1075 = ").isSet();";
  protected final String TEXT_1076 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1077 = ");";
  protected final String TEXT_1078 = NL + "\t\treturn (";
  protected final String TEXT_1079 = " & ";
  protected final String TEXT_1080 = "_ESETFLAG) != 0;";
  protected final String TEXT_1081 = NL + "\t\treturn ";
  protected final String TEXT_1082 = "ESet;";
  protected final String TEXT_1083 = NL + "\t\treturn !((";
  protected final String TEXT_1084 = ".Internal)((";
  protected final String TEXT_1085 = ".Internal.Wrapper)get";
  protected final String TEXT_1086 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1087 = ");";
  protected final String TEXT_1088 = NL + "\t\treturn !((";
  protected final String TEXT_1089 = ".Internal)get";
  protected final String TEXT_1090 = "()).isEmpty(";
  protected final String TEXT_1091 = ");";
  protected final String TEXT_1092 = NL;
  protected final String TEXT_1093 = NL + "\t\treturn ";
  protected final String TEXT_1094 = ".";
  protected final String TEXT_1095 = "(this);";
  protected final String TEXT_1096 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1097 = "' ";
  protected final String TEXT_1098 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1099 = NL + "\t}" + NL;
  protected final String TEXT_1100 = NL;
  protected final String TEXT_1101 = NL + "\t/**";
  protected final String TEXT_1102 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1103 = "}, with the specified ";
  protected final String TEXT_1104 = ", and appends it to the '<em><b>";
  protected final String TEXT_1105 = "</b></em>' ";
  protected final String TEXT_1106 = ".";
  protected final String TEXT_1107 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1108 = "}, with the specified ";
  protected final String TEXT_1109 = ", and sets the '<em><b>";
  protected final String TEXT_1110 = "</b></em>' ";
  protected final String TEXT_1111 = ".";
  protected final String TEXT_1112 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1113 = "} and appends it to the '<em><b>";
  protected final String TEXT_1114 = "</b></em>' ";
  protected final String TEXT_1115 = ".";
  protected final String TEXT_1116 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1117 = "} and sets the '<em><b>";
  protected final String TEXT_1118 = "</b></em>' ";
  protected final String TEXT_1119 = ".";
  protected final String TEXT_1120 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1121 = NL + "\t * @param ";
  protected final String TEXT_1122 = " The ";
  protected final String TEXT_1123 = " for the new {@link ";
  protected final String TEXT_1124 = "}, or <code>null</code>.";
  protected final String TEXT_1125 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1126 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1127 = "}." + NL + "\t * @see #";
  protected final String TEXT_1128 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1129 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1130 = NL + "\t";
  protected final String TEXT_1131 = " create";
  protected final String TEXT_1132 = "(";
  protected final String TEXT_1133 = ", ";
  protected final String TEXT_1134 = " eClass);" + NL;
  protected final String TEXT_1135 = NL + "\tpublic ";
  protected final String TEXT_1136 = " create";
  protected final String TEXT_1137 = "(";
  protected final String TEXT_1138 = ", ";
  protected final String TEXT_1139 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1140 = " new";
  protected final String TEXT_1141 = " = (";
  protected final String TEXT_1142 = ") create(eClass);";
  protected final String TEXT_1143 = NL + "\t\tint ";
  protected final String TEXT_1144 = "ListSize = 0;";
  protected final String TEXT_1145 = NL + "\t\tint ";
  protected final String TEXT_1146 = "Size = ";
  protected final String TEXT_1147 = " == null ? 0 : ";
  protected final String TEXT_1148 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1149 = "Size > ";
  protected final String TEXT_1150 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1151 = "ListSize = ";
  protected final String TEXT_1152 = "Size;";
  protected final String TEXT_1153 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1154 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1155 = ".create";
  protected final String TEXT_1156 = "(";
  protected final String TEXT_1157 = ", ";
  protected final String TEXT_1158 = "i < ";
  protected final String TEXT_1159 = "Size ? (";
  protected final String TEXT_1160 = ") ";
  protected final String TEXT_1161 = ".get(i) : null";
  protected final String TEXT_1162 = ");" + NL + "\t\t}";
  protected final String TEXT_1163 = NL + "\t\tnew";
  protected final String TEXT_1164 = ".create";
  protected final String TEXT_1165 = "(";
  protected final String TEXT_1166 = ", ";
  protected final String TEXT_1167 = ");";
  protected final String TEXT_1168 = NL + "\t\tif (";
  protected final String TEXT_1169 = " != null)";
  protected final String TEXT_1170 = NL + "\t\t\tnew";
  protected final String TEXT_1171 = ".";
  protected final String TEXT_1172 = "().addAll(";
  protected final String TEXT_1173 = ");";
  protected final String TEXT_1174 = NL + "\t\t\tnew";
  protected final String TEXT_1175 = ".set";
  protected final String TEXT_1176 = "(";
  protected final String TEXT_1177 = ");";
  protected final String TEXT_1178 = NL + "\t\t";
  protected final String TEXT_1179 = "().add(new";
  protected final String TEXT_1180 = ");";
  protected final String TEXT_1181 = NL + "\t\tset";
  protected final String TEXT_1182 = "(new";
  protected final String TEXT_1183 = ");";
  protected final String TEXT_1184 = NL + "\t\treturn new";
  protected final String TEXT_1185 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1186 = NL + "\t/**";
  protected final String TEXT_1187 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1188 = "}, with the specified ";
  protected final String TEXT_1189 = ", and appends it to the '<em><b>";
  protected final String TEXT_1190 = "</b></em>' ";
  protected final String TEXT_1191 = ".";
  protected final String TEXT_1192 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1193 = "},with the specified ";
  protected final String TEXT_1194 = ", and sets the '<em><b>";
  protected final String TEXT_1195 = "</b></em>' ";
  protected final String TEXT_1196 = ".";
  protected final String TEXT_1197 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1198 = "} and appends it to the '<em><b>";
  protected final String TEXT_1199 = "</b></em>' ";
  protected final String TEXT_1200 = ".";
  protected final String TEXT_1201 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1202 = "} and sets the '<em><b>";
  protected final String TEXT_1203 = "</b></em>' ";
  protected final String TEXT_1204 = ".";
  protected final String TEXT_1205 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1206 = NL + "\t * @param ";
  protected final String TEXT_1207 = " The ";
  protected final String TEXT_1208 = " for the new {@link ";
  protected final String TEXT_1209 = "}, or <code>null</code>.";
  protected final String TEXT_1210 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1211 = "}." + NL + "\t * @see #";
  protected final String TEXT_1212 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1213 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1214 = NL + "\t";
  protected final String TEXT_1215 = " create";
  protected final String TEXT_1216 = "(";
  protected final String TEXT_1217 = ");" + NL;
  protected final String TEXT_1218 = NL + "\tpublic ";
  protected final String TEXT_1219 = " create";
  protected final String TEXT_1220 = "(";
  protected final String TEXT_1221 = ")" + NL + "\t{";
  protected final String TEXT_1222 = NL + "\t\treturn create";
  protected final String TEXT_1223 = "(";
  protected final String TEXT_1224 = ", ";
  protected final String TEXT_1225 = ");";
  protected final String TEXT_1226 = NL + "\t\t";
  protected final String TEXT_1227 = " new";
  protected final String TEXT_1228 = " = (";
  protected final String TEXT_1229 = ") create(";
  protected final String TEXT_1230 = ");";
  protected final String TEXT_1231 = NL + "\t\tint ";
  protected final String TEXT_1232 = "ListSize = 0;";
  protected final String TEXT_1233 = NL + "\t\tint ";
  protected final String TEXT_1234 = "Size = ";
  protected final String TEXT_1235 = " == null ? 0 : ";
  protected final String TEXT_1236 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1237 = "Size > ";
  protected final String TEXT_1238 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1239 = "ListSize = ";
  protected final String TEXT_1240 = "Size;";
  protected final String TEXT_1241 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1242 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1243 = ".create";
  protected final String TEXT_1244 = "(";
  protected final String TEXT_1245 = ", ";
  protected final String TEXT_1246 = "i < ";
  protected final String TEXT_1247 = "Size ? (";
  protected final String TEXT_1248 = ") ";
  protected final String TEXT_1249 = ".get(i) : null";
  protected final String TEXT_1250 = ");" + NL + "\t\t}";
  protected final String TEXT_1251 = NL + "\t\tnew";
  protected final String TEXT_1252 = ".create";
  protected final String TEXT_1253 = "(";
  protected final String TEXT_1254 = ", ";
  protected final String TEXT_1255 = ");";
  protected final String TEXT_1256 = NL + "\t\tif (";
  protected final String TEXT_1257 = " != null)";
  protected final String TEXT_1258 = NL + "\t\t\tnew";
  protected final String TEXT_1259 = ".";
  protected final String TEXT_1260 = "().addAll(";
  protected final String TEXT_1261 = ");";
  protected final String TEXT_1262 = NL + "\t\t\tnew";
  protected final String TEXT_1263 = ".set";
  protected final String TEXT_1264 = "(";
  protected final String TEXT_1265 = ");";
  protected final String TEXT_1266 = NL + "\t\t";
  protected final String TEXT_1267 = "().add(new";
  protected final String TEXT_1268 = ");";
  protected final String TEXT_1269 = NL + "\t\tset";
  protected final String TEXT_1270 = "(new";
  protected final String TEXT_1271 = ");";
  protected final String TEXT_1272 = NL + "\t\treturn new";
  protected final String TEXT_1273 = ";";
  protected final String TEXT_1274 = NL + "\t}" + NL;
  protected final String TEXT_1275 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1276 = "} with the specified ";
  protected final String TEXT_1277 = " from the '<em><b>";
  protected final String TEXT_1278 = "</b></em>' ";
  protected final String TEXT_1279 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1280 = NL + "\t * @param ";
  protected final String TEXT_1281 = " The ";
  protected final String TEXT_1282 = " of the {@link ";
  protected final String TEXT_1283 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1284 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1285 = "} with the specified ";
  protected final String TEXT_1286 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1287 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1288 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1289 = NL + "\t";
  protected final String TEXT_1290 = " get";
  protected final String TEXT_1291 = "(";
  protected final String TEXT_1292 = ");" + NL;
  protected final String TEXT_1293 = NL + "\tpublic ";
  protected final String TEXT_1294 = " get";
  protected final String TEXT_1295 = "(";
  protected final String TEXT_1296 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1297 = "(";
  protected final String TEXT_1298 = ", false";
  protected final String TEXT_1299 = ", null";
  protected final String TEXT_1300 = ", false";
  protected final String TEXT_1301 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1302 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1303 = "} with the specified ";
  protected final String TEXT_1304 = " from the '<em><b>";
  protected final String TEXT_1305 = "</b></em>' ";
  protected final String TEXT_1306 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1307 = NL + "\t * @param ";
  protected final String TEXT_1308 = " The ";
  protected final String TEXT_1309 = " of the {@link ";
  protected final String TEXT_1310 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1311 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1312 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1313 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1314 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1315 = "} on demand if not found.";
  protected final String TEXT_1316 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1317 = "} with the specified ";
  protected final String TEXT_1318 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1319 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1320 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1321 = NL + "\t";
  protected final String TEXT_1322 = " get";
  protected final String TEXT_1323 = "(";
  protected final String TEXT_1324 = ", boolean ignoreCase";
  protected final String TEXT_1325 = ", ";
  protected final String TEXT_1326 = " eClass";
  protected final String TEXT_1327 = ", boolean createOnDemand";
  protected final String TEXT_1328 = ");" + NL;
  protected final String TEXT_1329 = NL + "\tpublic ";
  protected final String TEXT_1330 = " get";
  protected final String TEXT_1331 = "(";
  protected final String TEXT_1332 = ", boolean ignoreCase";
  protected final String TEXT_1333 = ", ";
  protected final String TEXT_1334 = " eClass";
  protected final String TEXT_1335 = ", boolean createOnDemand";
  protected final String TEXT_1336 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1337 = "Loop: for (";
  protected final String TEXT_1338 = " i = ";
  protected final String TEXT_1339 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1340 = " ";
  protected final String TEXT_1341 = " = (";
  protected final String TEXT_1342 = ") i.next();";
  protected final String TEXT_1343 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1344 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1345 = "Loop;";
  protected final String TEXT_1346 = NL + "\t\t\t";
  protected final String TEXT_1347 = " ";
  protected final String TEXT_1348 = "List = ";
  protected final String TEXT_1349 = ".";
  protected final String TEXT_1350 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1351 = "ListSize = ";
  protected final String TEXT_1352 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1353 = " || (";
  protected final String TEXT_1354 = " != null && ";
  protected final String TEXT_1355 = ".size() != ";
  protected final String TEXT_1356 = "ListSize";
  protected final String TEXT_1357 = ")";
  protected final String TEXT_1358 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1359 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1360 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1361 = " ";
  protected final String TEXT_1362 = " = (";
  protected final String TEXT_1363 = ") ";
  protected final String TEXT_1364 = "List.get(j);";
  protected final String TEXT_1365 = NL + "\t\t\t\tif (";
  protected final String TEXT_1366 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_1367 = ")";
  protected final String TEXT_1368 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1369 = ".";
  protected final String TEXT_1370 = "()) : ";
  protected final String TEXT_1371 = ".get(j).equals(";
  protected final String TEXT_1372 = ".";
  protected final String TEXT_1373 = "())))";
  protected final String TEXT_1374 = NL + "\t\t\t\tif (";
  protected final String TEXT_1375 = " != null && !";
  protected final String TEXT_1376 = ".get(j).equals(";
  protected final String TEXT_1377 = ".";
  protected final String TEXT_1378 = "()))";
  protected final String TEXT_1379 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1380 = "Loop;";
  protected final String TEXT_1381 = NL + "\t\t\t}";
  protected final String TEXT_1382 = NL + "\t\t\t";
  protected final String TEXT_1383 = " ";
  protected final String TEXT_1384 = " = ";
  protected final String TEXT_1385 = ".";
  protected final String TEXT_1386 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1387 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1388 = "Loop;";
  protected final String TEXT_1389 = NL + "\t\t\tif (";
  protected final String TEXT_1390 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1391 = ".equalsIgnoreCase(";
  protected final String TEXT_1392 = ".";
  protected final String TEXT_1393 = "()) : ";
  protected final String TEXT_1394 = ".equals(";
  protected final String TEXT_1395 = ".";
  protected final String TEXT_1396 = "())))";
  protected final String TEXT_1397 = NL + "\t\t\tif (";
  protected final String TEXT_1398 = " != null && !";
  protected final String TEXT_1399 = ".equals(";
  protected final String TEXT_1400 = ".";
  protected final String TEXT_1401 = "()))";
  protected final String TEXT_1402 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1403 = "Loop;";
  protected final String TEXT_1404 = NL + "\t\t\tif (";
  protected final String TEXT_1405 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1406 = ".equalsIgnoreCase(";
  protected final String TEXT_1407 = ".";
  protected final String TEXT_1408 = "()) : ";
  protected final String TEXT_1409 = ".equals(";
  protected final String TEXT_1410 = ".";
  protected final String TEXT_1411 = "())))";
  protected final String TEXT_1412 = NL + "\t\t\tif (";
  protected final String TEXT_1413 = " != null && !";
  protected final String TEXT_1414 = ".equals(";
  protected final String TEXT_1415 = ".";
  protected final String TEXT_1416 = "()))";
  protected final String TEXT_1417 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1418 = "Loop;";
  protected final String TEXT_1419 = NL + "\t\t\treturn ";
  protected final String TEXT_1420 = ";" + NL + "\t\t}";
  protected final String TEXT_1421 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1422 = " && eClass != null";
  protected final String TEXT_1423 = " ? create";
  protected final String TEXT_1424 = "(";
  protected final String TEXT_1425 = ", eClass";
  protected final String TEXT_1426 = ") : null;";
  protected final String TEXT_1427 = NL + "\t\treturn null;";
  protected final String TEXT_1428 = NL + "\t}" + NL;
  protected final String TEXT_1429 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1430 = "()" + NL + "\t{";
  protected final String TEXT_1431 = NL + "  \t\treturn false;";
  protected final String TEXT_1432 = NL + "\t\treturn !((";
  protected final String TEXT_1433 = ".Internal.Wrapper)";
  protected final String TEXT_1434 = "()).featureMap().isEmpty();";
  protected final String TEXT_1435 = NL + "\t\treturn ";
  protected final String TEXT_1436 = " != null && !";
  protected final String TEXT_1437 = ".featureMap().isEmpty();";
  protected final String TEXT_1438 = NL + "\t\treturn ";
  protected final String TEXT_1439 = " != null && !";
  protected final String TEXT_1440 = ".isEmpty();";
  protected final String TEXT_1441 = NL + "\t\t";
  protected final String TEXT_1442 = " ";
  protected final String TEXT_1443 = " = (";
  protected final String TEXT_1444 = ")eVirtualGet(";
  protected final String TEXT_1445 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1446 = " != null && !";
  protected final String TEXT_1447 = ".isEmpty();";
  protected final String TEXT_1448 = NL + "\t\treturn !";
  protected final String TEXT_1449 = "().isEmpty();";
  protected final String TEXT_1450 = NL + "\t\treturn ";
  protected final String TEXT_1451 = " != null;";
  protected final String TEXT_1452 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1453 = ") != null;";
  protected final String TEXT_1454 = NL + "\t\treturn basicGet";
  protected final String TEXT_1455 = "() != null;";
  protected final String TEXT_1456 = NL + "\t\treturn ";
  protected final String TEXT_1457 = " != null;";
  protected final String TEXT_1458 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1459 = ") != null;";
  protected final String TEXT_1460 = NL + "\t\treturn ";
  protected final String TEXT_1461 = "() != null;";
  protected final String TEXT_1462 = NL + "\t\treturn ((";
  protected final String TEXT_1463 = " & ";
  protected final String TEXT_1464 = "_EFLAG) != 0) != ";
  protected final String TEXT_1465 = "_EDEFAULT;";
  protected final String TEXT_1466 = NL + "\t\treturn ";
  protected final String TEXT_1467 = " != ";
  protected final String TEXT_1468 = "_EDEFAULT;";
  protected final String TEXT_1469 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1470 = ", ";
  protected final String TEXT_1471 = "_EDEFAULT) != ";
  protected final String TEXT_1472 = "_EDEFAULT;";
  protected final String TEXT_1473 = NL + "\t\treturn ";
  protected final String TEXT_1474 = "() != ";
  protected final String TEXT_1475 = "_EDEFAULT;";
  protected final String TEXT_1476 = NL + "\t\treturn ";
  protected final String TEXT_1477 = "_EDEFAULT == null ? ";
  protected final String TEXT_1478 = " != null : !";
  protected final String TEXT_1479 = "_EDEFAULT.equals(";
  protected final String TEXT_1480 = ");";
  protected final String TEXT_1481 = NL + "\t\t";
  protected final String TEXT_1482 = " ";
  protected final String TEXT_1483 = " = (";
  protected final String TEXT_1484 = ")eVirtualGet(";
  protected final String TEXT_1485 = ", ";
  protected final String TEXT_1486 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1487 = "_EDEFAULT == null ? ";
  protected final String TEXT_1488 = " != null : !";
  protected final String TEXT_1489 = "_EDEFAULT.equals(";
  protected final String TEXT_1490 = ");";
  protected final String TEXT_1491 = NL + "\t\treturn ";
  protected final String TEXT_1492 = "_EDEFAULT == null ? ";
  protected final String TEXT_1493 = "() != null : !";
  protected final String TEXT_1494 = "_EDEFAULT.equals(";
  protected final String TEXT_1495 = "());";
  protected final String TEXT_1496 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1497 = ");";
  protected final String TEXT_1498 = NL + "\t\t";
  protected final String TEXT_1499 = " ";
  protected final String TEXT_1500 = " = (";
  protected final String TEXT_1501 = ")eVirtualGet(";
  protected final String TEXT_1502 = ");";
  protected final String TEXT_1503 = NL + "\t\treturn ";
  protected final String TEXT_1504 = " != null && ((";
  protected final String TEXT_1505 = ".Unsettable)";
  protected final String TEXT_1506 = ").isSet();";
  protected final String TEXT_1507 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1508 = ");";
  protected final String TEXT_1509 = NL + "\t\treturn (";
  protected final String TEXT_1510 = " & ";
  protected final String TEXT_1511 = "_ESETFLAG) != 0;";
  protected final String TEXT_1512 = NL + "\t\treturn ";
  protected final String TEXT_1513 = "ESet;";
  protected final String TEXT_1514 = NL + "\t\treturn !((";
  protected final String TEXT_1515 = ".Internal)((";
  protected final String TEXT_1516 = ".Internal.Wrapper)get";
  protected final String TEXT_1517 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1518 = ");";
  protected final String TEXT_1519 = NL + "\t\treturn !((";
  protected final String TEXT_1520 = ".Internal)get";
  protected final String TEXT_1521 = "()).isEmpty(";
  protected final String TEXT_1522 = ");";
  protected final String TEXT_1523 = NL;
  protected final String TEXT_1524 = NL + "\t\treturn ";
  protected final String TEXT_1525 = ".";
  protected final String TEXT_1526 = "(this);";
  protected final String TEXT_1527 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1528 = "' ";
  protected final String TEXT_1529 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1530 = NL + "\t}" + NL;
  protected final String TEXT_1531 = NL;
  protected final String TEXT_1532 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1533 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1534 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1535 = NL + "\t * @model ";
  protected final String TEXT_1536 = NL + "\t *        ";
  protected final String TEXT_1537 = NL + "\t * @model";
  protected final String TEXT_1538 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1539 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1540 = NL + "\t";
  protected final String TEXT_1541 = " ";
  protected final String TEXT_1542 = "(";
  protected final String TEXT_1543 = ")";
  protected final String TEXT_1544 = ";" + NL;
  protected final String TEXT_1545 = NL + "\tpublic ";
  protected final String TEXT_1546 = " ";
  protected final String TEXT_1547 = "(";
  protected final String TEXT_1548 = ")";
  protected final String TEXT_1549 = NL + "\t{";
  protected final String TEXT_1550 = NL + "\t\t";
  protected final String TEXT_1551 = NL + "\t\treturn ";
  protected final String TEXT_1552 = ".";
  protected final String TEXT_1553 = "(this, ";
  protected final String TEXT_1554 = ", ";
  protected final String TEXT_1555 = ");";
  protected final String TEXT_1556 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1557 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1558 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1559 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1560 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1561 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1562 = ".";
  protected final String TEXT_1563 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1564 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1565 = "\", ";
  protected final String TEXT_1566 = ".getObjectLabel(this, ";
  protected final String TEXT_1567 = ") }),";
  protected final String TEXT_1568 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1569 = NL + "\t\t";
  protected final String TEXT_1570 = ".";
  protected final String TEXT_1571 = "(this";
  protected final String TEXT_1572 = ", ";
  protected final String TEXT_1573 = ");";
  protected final String TEXT_1574 = NL + "\t\t";
  protected final String TEXT_1575 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1576 = " result = (";
  protected final String TEXT_1577 = ") cache.get(";
  protected final String TEXT_1578 = "eResource(), ";
  protected final String TEXT_1579 = "this, ";
  protected final String TEXT_1580 = ".getEOperations().get(";
  protected final String TEXT_1581 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1582 = "eResource(), ";
  protected final String TEXT_1583 = "this, ";
  protected final String TEXT_1584 = ".getEOperations().get(";
  protected final String TEXT_1585 = "), result = ";
  protected final String TEXT_1586 = "new ";
  protected final String TEXT_1587 = "(";
  protected final String TEXT_1588 = ".";
  protected final String TEXT_1589 = "(this";
  protected final String TEXT_1590 = ", ";
  protected final String TEXT_1591 = ")";
  protected final String TEXT_1592 = ")";
  protected final String TEXT_1593 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1594 = ".";
  protected final String TEXT_1595 = "()";
  protected final String TEXT_1596 = ";" + NL + "\t\t}";
  protected final String TEXT_1597 = NL + "\t\treturn ";
  protected final String TEXT_1598 = ".";
  protected final String TEXT_1599 = "(this";
  protected final String TEXT_1600 = ", ";
  protected final String TEXT_1601 = ");";
  protected final String TEXT_1602 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1603 = NL + "\t}" + NL;
  protected final String TEXT_1604 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1605 = " eInverseAdd(";
  protected final String TEXT_1606 = " otherEnd, int featureID, ";
  protected final String TEXT_1607 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1608 = NL + "\t\t\tcase ";
  protected final String TEXT_1609 = ":";
  protected final String TEXT_1610 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1611 = ")((";
  protected final String TEXT_1612 = ".InternalMapView)";
  protected final String TEXT_1613 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1614 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1615 = ")";
  protected final String TEXT_1616 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1617 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1618 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1619 = "((";
  protected final String TEXT_1620 = ")otherEnd, msgs);";
  protected final String TEXT_1621 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1622 = ", msgs);";
  protected final String TEXT_1623 = NL + "\t\t\t\t";
  protected final String TEXT_1624 = " ";
  protected final String TEXT_1625 = " = (";
  protected final String TEXT_1626 = ")eVirtualGet(";
  protected final String TEXT_1627 = ");";
  protected final String TEXT_1628 = NL + "\t\t\t\tif (";
  protected final String TEXT_1629 = " != null)";
  protected final String TEXT_1630 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1631 = ")";
  protected final String TEXT_1632 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1633 = ", null, msgs);";
  protected final String TEXT_1634 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1635 = ")";
  protected final String TEXT_1636 = ").eInverseRemove(this, ";
  protected final String TEXT_1637 = ", ";
  protected final String TEXT_1638 = ".class, msgs);";
  protected final String TEXT_1639 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1640 = "((";
  protected final String TEXT_1641 = ")otherEnd, msgs);";
  protected final String TEXT_1642 = NL + "\t\t}";
  protected final String TEXT_1643 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1644 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1645 = NL + "\t}" + NL;
  protected final String TEXT_1646 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1647 = " eInverseRemove(";
  protected final String TEXT_1648 = " otherEnd, int featureID, ";
  protected final String TEXT_1649 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1650 = NL + "\t\t\tcase ";
  protected final String TEXT_1651 = ":";
  protected final String TEXT_1652 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1653 = ")((";
  protected final String TEXT_1654 = ".InternalMapView)";
  protected final String TEXT_1655 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1656 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1657 = ")((";
  protected final String TEXT_1658 = ".Internal.Wrapper)";
  protected final String TEXT_1659 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1660 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1661 = ")";
  protected final String TEXT_1662 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1663 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1664 = ", msgs);";
  protected final String TEXT_1665 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1666 = "(msgs);";
  protected final String TEXT_1667 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1668 = "(null, msgs);";
  protected final String TEXT_1669 = NL + "\t\t}";
  protected final String TEXT_1670 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1671 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1672 = NL + "\t}" + NL;
  protected final String TEXT_1673 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1674 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1675 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1676 = NL + "\t\t\tcase ";
  protected final String TEXT_1677 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1678 = ", ";
  protected final String TEXT_1679 = ".class, msgs);";
  protected final String TEXT_1680 = NL + "\t\t}";
  protected final String TEXT_1681 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1682 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1683 = NL + "\t}" + NL;
  protected final String TEXT_1684 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1685 = NL + "\t\t\tcase ";
  protected final String TEXT_1686 = ":";
  protected final String TEXT_1687 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1688 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1689 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1690 = "(";
  protected final String TEXT_1691 = "());";
  protected final String TEXT_1692 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1693 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1694 = "();";
  protected final String TEXT_1695 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1696 = ".InternalMapView)";
  protected final String TEXT_1697 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1698 = "();";
  protected final String TEXT_1699 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1700 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1701 = "().map();";
  protected final String TEXT_1702 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1703 = ".Internal.Wrapper)";
  protected final String TEXT_1704 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1705 = "();";
  protected final String TEXT_1706 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1707 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1708 = ".Internal)";
  protected final String TEXT_1709 = "()).getWrapper();";
  protected final String TEXT_1710 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1711 = "();";
  protected final String TEXT_1712 = NL + "\t\t}";
  protected final String TEXT_1713 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1714 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1715 = NL + "\t}" + NL;
  protected final String TEXT_1716 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1717 = NL + "\t\t\tcase ";
  protected final String TEXT_1718 = ":";
  protected final String TEXT_1719 = NL + "\t\t\t\t((";
  protected final String TEXT_1720 = ".Internal)((";
  protected final String TEXT_1721 = ".Internal.Wrapper)";
  protected final String TEXT_1722 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1723 = NL + "\t\t\t\t((";
  protected final String TEXT_1724 = ".Internal)";
  protected final String TEXT_1725 = "()).set(newValue);";
  protected final String TEXT_1726 = NL + "\t\t\t\t((";
  protected final String TEXT_1727 = ".Setting)((";
  protected final String TEXT_1728 = ".InternalMapView)";
  protected final String TEXT_1729 = "()).eMap()).set(newValue);";
  protected final String TEXT_1730 = NL + "\t\t\t\t((";
  protected final String TEXT_1731 = ".Setting)";
  protected final String TEXT_1732 = "()).set(newValue);";
  protected final String TEXT_1733 = NL + "\t\t\t\t";
  protected final String TEXT_1734 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1735 = "().addAll((";
  protected final String TEXT_1736 = ")newValue);";
  protected final String TEXT_1737 = NL + "\t\t\t\tset";
  protected final String TEXT_1738 = "(((";
  protected final String TEXT_1739 = ")newValue).";
  protected final String TEXT_1740 = "());";
  protected final String TEXT_1741 = NL + "\t\t\t\tset";
  protected final String TEXT_1742 = "((";
  protected final String TEXT_1743 = ")newValue);";
  protected final String TEXT_1744 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1745 = NL + "\t\t}";
  protected final String TEXT_1746 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1747 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1748 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1749 = NL + "\t\t\tcase ";
  protected final String TEXT_1750 = ":";
  protected final String TEXT_1751 = NL + "\t\t\t\t((";
  protected final String TEXT_1752 = ".Internal.Wrapper)";
  protected final String TEXT_1753 = "()).featureMap().clear();";
  protected final String TEXT_1754 = NL + "\t\t\t\t";
  protected final String TEXT_1755 = "().clear();";
  protected final String TEXT_1756 = NL + "\t\t\t\tunset";
  protected final String TEXT_1757 = "();";
  protected final String TEXT_1758 = NL + "\t\t\t\tset";
  protected final String TEXT_1759 = "((";
  protected final String TEXT_1760 = ")null);";
  protected final String TEXT_1761 = NL + "\t\t\t\tset";
  protected final String TEXT_1762 = "(";
  protected final String TEXT_1763 = "_EDEFAULT);";
  protected final String TEXT_1764 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1765 = NL + "\t\t}";
  protected final String TEXT_1766 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1767 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1768 = NL + "\t}" + NL;
  protected final String TEXT_1769 = NL;
  protected final String TEXT_1770 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1771 = NL + "\t\t\tcase ";
  protected final String TEXT_1772 = ":";
  protected final String TEXT_1773 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1774 = "();";
  protected final String TEXT_1775 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1776 = ".Internal.Wrapper)";
  protected final String TEXT_1777 = "()).featureMap().isEmpty();";
  protected final String TEXT_1778 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1779 = " != null && !";
  protected final String TEXT_1780 = ".featureMap().isEmpty();";
  protected final String TEXT_1781 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1782 = " != null && !";
  protected final String TEXT_1783 = ".isEmpty();";
  protected final String TEXT_1784 = NL + "\t\t\t\t";
  protected final String TEXT_1785 = " ";
  protected final String TEXT_1786 = " = (";
  protected final String TEXT_1787 = ")eVirtualGet(";
  protected final String TEXT_1788 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1789 = " != null && !";
  protected final String TEXT_1790 = ".isEmpty();";
  protected final String TEXT_1791 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1792 = "().isEmpty();";
  protected final String TEXT_1793 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1794 = "();";
  protected final String TEXT_1795 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1796 = " != null;";
  protected final String TEXT_1797 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1798 = ") != null;";
  protected final String TEXT_1799 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1800 = "() != null;";
  protected final String TEXT_1801 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1802 = " != null;";
  protected final String TEXT_1803 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1804 = ") != null;";
  protected final String TEXT_1805 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1806 = "() != null;";
  protected final String TEXT_1807 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1808 = " & ";
  protected final String TEXT_1809 = "_EFLAG) != 0) != ";
  protected final String TEXT_1810 = "_EDEFAULT;";
  protected final String TEXT_1811 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1812 = " != ";
  protected final String TEXT_1813 = "_EDEFAULT;";
  protected final String TEXT_1814 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1815 = ", ";
  protected final String TEXT_1816 = "_EDEFAULT) != ";
  protected final String TEXT_1817 = "_EDEFAULT;";
  protected final String TEXT_1818 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1819 = "() != ";
  protected final String TEXT_1820 = "_EDEFAULT;";
  protected final String TEXT_1821 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1822 = "_EDEFAULT == null ? ";
  protected final String TEXT_1823 = " != null : !";
  protected final String TEXT_1824 = "_EDEFAULT.equals(";
  protected final String TEXT_1825 = ");";
  protected final String TEXT_1826 = NL + "\t\t\t\t";
  protected final String TEXT_1827 = " ";
  protected final String TEXT_1828 = " = (";
  protected final String TEXT_1829 = ")eVirtualGet(";
  protected final String TEXT_1830 = ", ";
  protected final String TEXT_1831 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1832 = "_EDEFAULT == null ? ";
  protected final String TEXT_1833 = " != null : !";
  protected final String TEXT_1834 = "_EDEFAULT.equals(";
  protected final String TEXT_1835 = ");";
  protected final String TEXT_1836 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1837 = "_EDEFAULT == null ? ";
  protected final String TEXT_1838 = "() != null : !";
  protected final String TEXT_1839 = "_EDEFAULT.equals(";
  protected final String TEXT_1840 = "());";
  protected final String TEXT_1841 = NL + "\t\t}";
  protected final String TEXT_1842 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1843 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1844 = NL + "\t}" + NL;
  protected final String TEXT_1845 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1846 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1847 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1848 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1849 = ": return ";
  protected final String TEXT_1850 = ";";
  protected final String TEXT_1851 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1852 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1853 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1854 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1855 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1856 = ": return ";
  protected final String TEXT_1857 = ";";
  protected final String TEXT_1858 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1859 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1860 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1861 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1862 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1863 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1864 = NL + "\t\t\tcase ";
  protected final String TEXT_1865 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1866 = ";";
  protected final String TEXT_1867 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1868 = NL + "\t\t\tcase ";
  protected final String TEXT_1869 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1870 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1871 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1872 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1873 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1874 = ": \");";
  protected final String TEXT_1875 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1876 = ": \");";
  protected final String TEXT_1877 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1878 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1879 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1880 = NL + "\t\tif (";
  protected final String TEXT_1881 = "(";
  protected final String TEXT_1882 = " & ";
  protected final String TEXT_1883 = "_ESETFLAG) != 0";
  protected final String TEXT_1884 = "ESet";
  protected final String TEXT_1885 = ") result.append((";
  protected final String TEXT_1886 = " & ";
  protected final String TEXT_1887 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1888 = NL + "\t\tif (";
  protected final String TEXT_1889 = "(";
  protected final String TEXT_1890 = " & ";
  protected final String TEXT_1891 = "_ESETFLAG) != 0";
  protected final String TEXT_1892 = "ESet";
  protected final String TEXT_1893 = ") result.append(";
  protected final String TEXT_1894 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1895 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1896 = ", ";
  protected final String TEXT_1897 = "_EDEFAULT";
  protected final String TEXT_1898 = "));";
  protected final String TEXT_1899 = NL + "\t\tresult.append((";
  protected final String TEXT_1900 = " & ";
  protected final String TEXT_1901 = "_EFLAG) != 0);";
  protected final String TEXT_1902 = NL + "\t\tresult.append(";
  protected final String TEXT_1903 = ");";
  protected final String TEXT_1904 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1905 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1906 = NL + "\t\treturn new ";
  protected final String TEXT_1907 = "(getTypedKey());";
  protected final String TEXT_1908 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1909 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1910 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1911 = ")key);";
  protected final String TEXT_1912 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1913 = ")key).";
  protected final String TEXT_1914 = "());";
  protected final String TEXT_1915 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1916 = ")key);";
  protected final String TEXT_1917 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1918 = NL + "\t\treturn new ";
  protected final String TEXT_1919 = "(getTypedValue());";
  protected final String TEXT_1920 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1921 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1922 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1923 = ")value);";
  protected final String TEXT_1924 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1925 = ")value).";
  protected final String TEXT_1926 = "());";
  protected final String TEXT_1927 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1928 = ")value);";
  protected final String TEXT_1929 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1930 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1931 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1932 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1933 = NL;
  protected final String TEXT_1934 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1935 = " create(";
  protected final String TEXT_1936 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1937 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_1938 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1939 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1940 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1941 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1942 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_1943 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1944 = " basicGet";
  protected final String TEXT_1945 = "()" + NL + "\t{";
  protected final String TEXT_1946 = NL + "\t\tif (isSet";
  protected final String TEXT_1947 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1948 = "basicGet";
  protected final String TEXT_1949 = "();" + NL + "\t\t}";
  protected final String TEXT_1950 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1951 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1952 = "basicGet";
  protected final String TEXT_1953 = "();" + NL + "\t\t}";
  protected final String TEXT_1954 = NL + "\t\t";
  protected final String TEXT_1955 = " ";
  protected final String TEXT_1956 = " = ";
  protected final String TEXT_1957 = "basicGet";
  protected final String TEXT_1958 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1959 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1960 = ";" + NL + "\t\t}";
  protected final String TEXT_1961 = NL + "\t\treturn ";
  protected final String TEXT_1962 = "super.basicGet";
  protected final String TEXT_1963 = "()";
  protected final String TEXT_1964 = "null";
  protected final String TEXT_1965 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1966 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1967 = " ";
  protected final String TEXT_1968 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1969 = " ";
  protected final String TEXT_1970 = " = basicGet";
  protected final String TEXT_1971 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1972 = " == null ? null : (";
  protected final String TEXT_1973 = ")eResolveProxy((";
  protected final String TEXT_1974 = ")";
  protected final String TEXT_1975 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1976 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1977 = " ";
  protected final String TEXT_1978 = "Helper(";
  protected final String TEXT_1979 = " ";
  protected final String TEXT_1980 = ")" + NL + "\t{";
  protected final String TEXT_1981 = NL + "\t\t";
  protected final String TEXT_1982 = ".addAll(super.";
  protected final String TEXT_1983 = "());";
  protected final String TEXT_1984 = NL + "\t\tsuper.";
  protected final String TEXT_1985 = "Helper(";
  protected final String TEXT_1986 = ");";
  protected final String TEXT_1987 = NL + "\t\tif (isSet";
  protected final String TEXT_1988 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1989 = " i = ((";
  protected final String TEXT_1990 = ") ";
  protected final String TEXT_1991 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1992 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1993 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1994 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1995 = " i = ((";
  protected final String TEXT_1996 = ") ";
  protected final String TEXT_1997 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1998 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1999 = NL + "\t\t";
  protected final String TEXT_2000 = " ";
  protected final String TEXT_2001 = " = ";
  protected final String TEXT_2002 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2003 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2004 = " i = ((";
  protected final String TEXT_2005 = ") ";
  protected final String TEXT_2006 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2007 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2008 = NL + "\t\tif (isSet";
  protected final String TEXT_2009 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2010 = ".addAll(";
  protected final String TEXT_2011 = "());" + NL + "\t\t}";
  protected final String TEXT_2012 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2013 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2014 = ".addAll(";
  protected final String TEXT_2015 = "());" + NL + "\t\t}";
  protected final String TEXT_2016 = NL + "\t\t";
  protected final String TEXT_2017 = " ";
  protected final String TEXT_2018 = " = ";
  protected final String TEXT_2019 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2020 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2021 = ".addAll(";
  protected final String TEXT_2022 = ");" + NL + "\t\t}";
  protected final String TEXT_2023 = NL + "\t\tif (isSet";
  protected final String TEXT_2024 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2025 = ".add(";
  protected final String TEXT_2026 = "basicGet";
  protected final String TEXT_2027 = "());" + NL + "\t\t}";
  protected final String TEXT_2028 = NL + "\t\t";
  protected final String TEXT_2029 = " ";
  protected final String TEXT_2030 = " = ";
  protected final String TEXT_2031 = "basicGet";
  protected final String TEXT_2032 = "();" + NL + "\t\tif (";
  protected final String TEXT_2033 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2034 = ".add(";
  protected final String TEXT_2035 = ");" + NL + "\t\t}";
  protected final String TEXT_2036 = NL + "\t\treturn ";
  protected final String TEXT_2037 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2038 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2039 = " ";
  protected final String TEXT_2040 = "()" + NL + "\t{";
  protected final String TEXT_2041 = NL + "\t\t";
  protected final String TEXT_2042 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_2043 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2044 = " method = getClass().getMethod(\"";
  protected final String TEXT_2045 = "\", null);";
  protected final String TEXT_2046 = NL + "\t\t\t\t";
  protected final String TEXT_2047 = " ";
  protected final String TEXT_2048 = " = (";
  protected final String TEXT_2049 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_2050 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_2051 = " union = ";
  protected final String TEXT_2052 = "Helper(new ";
  protected final String TEXT_2053 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_2054 = " = new ";
  protected final String TEXT_2055 = "(this, ";
  protected final String TEXT_2056 = "null";
  protected final String TEXT_2057 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2058 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2059 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_2060 = NL + "\t\t\t";
  protected final String TEXT_2061 = " ";
  protected final String TEXT_2062 = " = (";
  protected final String TEXT_2063 = ") cache.get(eResource(), this, ";
  protected final String TEXT_2064 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_2065 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2066 = " union = ";
  protected final String TEXT_2067 = "Helper(new ";
  protected final String TEXT_2068 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_2069 = ", ";
  protected final String TEXT_2070 = " = new ";
  protected final String TEXT_2071 = "(this, ";
  protected final String TEXT_2072 = "null";
  protected final String TEXT_2073 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_2074 = ";";
  protected final String TEXT_2075 = NL + "\t\t}";
  protected final String TEXT_2076 = NL + "\t\t";
  protected final String TEXT_2077 = " union = ";
  protected final String TEXT_2078 = "Helper(new ";
  protected final String TEXT_2079 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_2080 = "(this, ";
  protected final String TEXT_2081 = "null";
  protected final String TEXT_2082 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_2083 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2084 = " ";
  protected final String TEXT_2085 = "()" + NL + "\t{";
  protected final String TEXT_2086 = NL + "\t\tif (isSet";
  protected final String TEXT_2087 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_2088 = "();" + NL + "\t\t}";
  protected final String TEXT_2089 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2090 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_2091 = "();" + NL + "\t\t}";
  protected final String TEXT_2092 = NL + "\t\t";
  protected final String TEXT_2093 = " ";
  protected final String TEXT_2094 = " = ";
  protected final String TEXT_2095 = "();" + NL + "\t\tif (";
  protected final String TEXT_2096 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_2097 = ";" + NL + "\t\t}";
  protected final String TEXT_2098 = NL + "\t\treturn ";
  protected final String TEXT_2099 = "super.";
  protected final String TEXT_2100 = "()";
  protected final String TEXT_2101 = "null";
  protected final String TEXT_2102 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2103 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2104 = "()" + NL + "\t{";
  protected final String TEXT_2105 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2106 = "()";
  protected final String TEXT_2107 = NL + "\t\treturn isSet";
  protected final String TEXT_2108 = "()";
  protected final String TEXT_2109 = ";";
  protected final String TEXT_2110 = NL + "\t\treturn !";
  protected final String TEXT_2111 = "().isEmpty()";
  protected final String TEXT_2112 = ";";
  protected final String TEXT_2113 = NL + "\t\treturn ";
  protected final String TEXT_2114 = "basicGet";
  protected final String TEXT_2115 = "() != null";
  protected final String TEXT_2116 = ";";
  protected final String TEXT_2117 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2118 = ")";
  protected final String TEXT_2119 = ";";
  protected final String TEXT_2120 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2121 = "()";
  protected final String TEXT_2122 = ";";
  protected final String TEXT_2123 = NL + "\t\t\t|| !";
  protected final String TEXT_2124 = "().isEmpty()";
  protected final String TEXT_2125 = ";";
  protected final String TEXT_2126 = NL + "\t\t\t|| ";
  protected final String TEXT_2127 = "basicGet";
  protected final String TEXT_2128 = "() != null";
  protected final String TEXT_2129 = ";";
  protected final String TEXT_2130 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2131 = ")";
  protected final String TEXT_2132 = ";";
  protected final String TEXT_2133 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2134 = "();";
  protected final String TEXT_2135 = NL + "\t\treturn false;";
  protected final String TEXT_2136 = NL + "\t}" + NL;
  protected final String TEXT_2137 = NL;
  protected final String TEXT_2138 = NL + "\t/**";
  protected final String TEXT_2139 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2140 = "}, with the specified ";
  protected final String TEXT_2141 = ", and appends it to the '<em><b>";
  protected final String TEXT_2142 = "</b></em>' ";
  protected final String TEXT_2143 = ".";
  protected final String TEXT_2144 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2145 = "}, with the specified ";
  protected final String TEXT_2146 = ", and sets the '<em><b>";
  protected final String TEXT_2147 = "</b></em>' ";
  protected final String TEXT_2148 = ".";
  protected final String TEXT_2149 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2150 = "} and appends it to the '<em><b>";
  protected final String TEXT_2151 = "</b></em>' ";
  protected final String TEXT_2152 = ".";
  protected final String TEXT_2153 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2154 = "} and sets the '<em><b>";
  protected final String TEXT_2155 = "</b></em>' ";
  protected final String TEXT_2156 = ".";
  protected final String TEXT_2157 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2158 = NL + "\t * @param ";
  protected final String TEXT_2159 = " The ";
  protected final String TEXT_2160 = " for the new {@link ";
  protected final String TEXT_2161 = "}, or <code>null</code>.";
  protected final String TEXT_2162 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2163 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2164 = "}." + NL + "\t * @see #";
  protected final String TEXT_2165 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2166 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2167 = NL + "\t";
  protected final String TEXT_2168 = " create";
  protected final String TEXT_2169 = "(";
  protected final String TEXT_2170 = ", ";
  protected final String TEXT_2171 = " eClass);" + NL;
  protected final String TEXT_2172 = NL + "\tpublic ";
  protected final String TEXT_2173 = " create";
  protected final String TEXT_2174 = "(";
  protected final String TEXT_2175 = ", ";
  protected final String TEXT_2176 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2177 = " new";
  protected final String TEXT_2178 = " = (";
  protected final String TEXT_2179 = ") create(eClass);";
  protected final String TEXT_2180 = NL + "\t\tint ";
  protected final String TEXT_2181 = "ListSize = 0;";
  protected final String TEXT_2182 = NL + "\t\tint ";
  protected final String TEXT_2183 = "Size = ";
  protected final String TEXT_2184 = " == null ? 0 : ";
  protected final String TEXT_2185 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2186 = "Size > ";
  protected final String TEXT_2187 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2188 = "ListSize = ";
  protected final String TEXT_2189 = "Size;";
  protected final String TEXT_2190 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2191 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2192 = ".create";
  protected final String TEXT_2193 = "(";
  protected final String TEXT_2194 = ", ";
  protected final String TEXT_2195 = "i < ";
  protected final String TEXT_2196 = "Size ? (";
  protected final String TEXT_2197 = ") ";
  protected final String TEXT_2198 = ".get(i) : null";
  protected final String TEXT_2199 = ");" + NL + "\t\t}";
  protected final String TEXT_2200 = NL + "\t\tnew";
  protected final String TEXT_2201 = ".create";
  protected final String TEXT_2202 = "(";
  protected final String TEXT_2203 = ", ";
  protected final String TEXT_2204 = ");";
  protected final String TEXT_2205 = NL + "\t\tif (";
  protected final String TEXT_2206 = " != null)";
  protected final String TEXT_2207 = NL + "\t\t\tnew";
  protected final String TEXT_2208 = ".";
  protected final String TEXT_2209 = "().addAll(";
  protected final String TEXT_2210 = ");";
  protected final String TEXT_2211 = NL + "\t\t\tnew";
  protected final String TEXT_2212 = ".set";
  protected final String TEXT_2213 = "(";
  protected final String TEXT_2214 = ");";
  protected final String TEXT_2215 = NL + "\t\t";
  protected final String TEXT_2216 = "().add(new";
  protected final String TEXT_2217 = ");";
  protected final String TEXT_2218 = NL + "\t\tset";
  protected final String TEXT_2219 = "(new";
  protected final String TEXT_2220 = ");";
  protected final String TEXT_2221 = NL + "\t\treturn new";
  protected final String TEXT_2222 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2223 = NL + "\t/**";
  protected final String TEXT_2224 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2225 = "}, with the specified ";
  protected final String TEXT_2226 = ", and appends it to the '<em><b>";
  protected final String TEXT_2227 = "</b></em>' ";
  protected final String TEXT_2228 = ".";
  protected final String TEXT_2229 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2230 = "},with the specified ";
  protected final String TEXT_2231 = ", and sets the '<em><b>";
  protected final String TEXT_2232 = "</b></em>' ";
  protected final String TEXT_2233 = ".";
  protected final String TEXT_2234 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2235 = "} and appends it to the '<em><b>";
  protected final String TEXT_2236 = "</b></em>' ";
  protected final String TEXT_2237 = ".";
  protected final String TEXT_2238 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2239 = "} and sets the '<em><b>";
  protected final String TEXT_2240 = "</b></em>' ";
  protected final String TEXT_2241 = ".";
  protected final String TEXT_2242 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2243 = NL + "\t * @param ";
  protected final String TEXT_2244 = " The ";
  protected final String TEXT_2245 = " for the new {@link ";
  protected final String TEXT_2246 = "}, or <code>null</code>.";
  protected final String TEXT_2247 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2248 = "}." + NL + "\t * @see #";
  protected final String TEXT_2249 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2250 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2251 = NL + "\t";
  protected final String TEXT_2252 = " create";
  protected final String TEXT_2253 = "(";
  protected final String TEXT_2254 = ");" + NL;
  protected final String TEXT_2255 = NL + "\tpublic ";
  protected final String TEXT_2256 = " create";
  protected final String TEXT_2257 = "(";
  protected final String TEXT_2258 = ")" + NL + "\t{";
  protected final String TEXT_2259 = NL + "\t\treturn create";
  protected final String TEXT_2260 = "(";
  protected final String TEXT_2261 = ", ";
  protected final String TEXT_2262 = ");";
  protected final String TEXT_2263 = NL + "\t\t";
  protected final String TEXT_2264 = " new";
  protected final String TEXT_2265 = " = (";
  protected final String TEXT_2266 = ") create(";
  protected final String TEXT_2267 = ");";
  protected final String TEXT_2268 = NL + "\t\tint ";
  protected final String TEXT_2269 = "ListSize = 0;";
  protected final String TEXT_2270 = NL + "\t\tint ";
  protected final String TEXT_2271 = "Size = ";
  protected final String TEXT_2272 = " == null ? 0 : ";
  protected final String TEXT_2273 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2274 = "Size > ";
  protected final String TEXT_2275 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2276 = "ListSize = ";
  protected final String TEXT_2277 = "Size;";
  protected final String TEXT_2278 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2279 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2280 = ".create";
  protected final String TEXT_2281 = "(";
  protected final String TEXT_2282 = ", ";
  protected final String TEXT_2283 = "i < ";
  protected final String TEXT_2284 = "Size ? (";
  protected final String TEXT_2285 = ") ";
  protected final String TEXT_2286 = ".get(i) : null";
  protected final String TEXT_2287 = ");" + NL + "\t\t}";
  protected final String TEXT_2288 = NL + "\t\tnew";
  protected final String TEXT_2289 = ".create";
  protected final String TEXT_2290 = "(";
  protected final String TEXT_2291 = ", ";
  protected final String TEXT_2292 = ");";
  protected final String TEXT_2293 = NL + "\t\tif (";
  protected final String TEXT_2294 = " != null)";
  protected final String TEXT_2295 = NL + "\t\t\tnew";
  protected final String TEXT_2296 = ".";
  protected final String TEXT_2297 = "().addAll(";
  protected final String TEXT_2298 = ");";
  protected final String TEXT_2299 = NL + "\t\t\tnew";
  protected final String TEXT_2300 = ".set";
  protected final String TEXT_2301 = "(";
  protected final String TEXT_2302 = ");";
  protected final String TEXT_2303 = NL + "\t\t";
  protected final String TEXT_2304 = "().add(new";
  protected final String TEXT_2305 = ");";
  protected final String TEXT_2306 = NL + "\t\tset";
  protected final String TEXT_2307 = "(new";
  protected final String TEXT_2308 = ");";
  protected final String TEXT_2309 = NL + "\t\treturn new";
  protected final String TEXT_2310 = ";";
  protected final String TEXT_2311 = NL + "\t}" + NL;
  protected final String TEXT_2312 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2313 = "} with the specified ";
  protected final String TEXT_2314 = " from the '<em><b>";
  protected final String TEXT_2315 = "</b></em>' ";
  protected final String TEXT_2316 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2317 = NL + "\t * @param ";
  protected final String TEXT_2318 = " The ";
  protected final String TEXT_2319 = " of the {@link ";
  protected final String TEXT_2320 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2321 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2322 = "} with the specified ";
  protected final String TEXT_2323 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2324 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2325 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2326 = NL + "\t";
  protected final String TEXT_2327 = " get";
  protected final String TEXT_2328 = "(";
  protected final String TEXT_2329 = ");" + NL;
  protected final String TEXT_2330 = NL + "\tpublic ";
  protected final String TEXT_2331 = " get";
  protected final String TEXT_2332 = "(";
  protected final String TEXT_2333 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2334 = "(";
  protected final String TEXT_2335 = ", false";
  protected final String TEXT_2336 = ", null";
  protected final String TEXT_2337 = ", false";
  protected final String TEXT_2338 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2339 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2340 = "} with the specified ";
  protected final String TEXT_2341 = " from the '<em><b>";
  protected final String TEXT_2342 = "</b></em>' ";
  protected final String TEXT_2343 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2344 = NL + "\t * @param ";
  protected final String TEXT_2345 = " The ";
  protected final String TEXT_2346 = " of the {@link ";
  protected final String TEXT_2347 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2348 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2349 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2350 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2351 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2352 = "} on demand if not found.";
  protected final String TEXT_2353 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2354 = "} with the specified ";
  protected final String TEXT_2355 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2356 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2357 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2358 = NL + "\t";
  protected final String TEXT_2359 = " get";
  protected final String TEXT_2360 = "(";
  protected final String TEXT_2361 = ", boolean ignoreCase";
  protected final String TEXT_2362 = ", ";
  protected final String TEXT_2363 = " eClass";
  protected final String TEXT_2364 = ", boolean createOnDemand";
  protected final String TEXT_2365 = ");" + NL;
  protected final String TEXT_2366 = NL + "\tpublic ";
  protected final String TEXT_2367 = " get";
  protected final String TEXT_2368 = "(";
  protected final String TEXT_2369 = ", boolean ignoreCase";
  protected final String TEXT_2370 = ", ";
  protected final String TEXT_2371 = " eClass";
  protected final String TEXT_2372 = ", boolean createOnDemand";
  protected final String TEXT_2373 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2374 = "Loop: for (";
  protected final String TEXT_2375 = " i = ";
  protected final String TEXT_2376 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2377 = " ";
  protected final String TEXT_2378 = " = (";
  protected final String TEXT_2379 = ") i.next();";
  protected final String TEXT_2380 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2381 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2382 = "Loop;";
  protected final String TEXT_2383 = NL + "\t\t\t";
  protected final String TEXT_2384 = " ";
  protected final String TEXT_2385 = "List = ";
  protected final String TEXT_2386 = ".";
  protected final String TEXT_2387 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2388 = "ListSize = ";
  protected final String TEXT_2389 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2390 = " || (";
  protected final String TEXT_2391 = " != null && ";
  protected final String TEXT_2392 = ".size() != ";
  protected final String TEXT_2393 = "ListSize";
  protected final String TEXT_2394 = ")";
  protected final String TEXT_2395 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2396 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2397 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2398 = " ";
  protected final String TEXT_2399 = " = (";
  protected final String TEXT_2400 = ") ";
  protected final String TEXT_2401 = "List.get(j);";
  protected final String TEXT_2402 = NL + "\t\t\t\tif (";
  protected final String TEXT_2403 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2404 = ")";
  protected final String TEXT_2405 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2406 = ".";
  protected final String TEXT_2407 = "()) : ";
  protected final String TEXT_2408 = ".get(j).equals(";
  protected final String TEXT_2409 = ".";
  protected final String TEXT_2410 = "())))";
  protected final String TEXT_2411 = NL + "\t\t\t\tif (";
  protected final String TEXT_2412 = " != null && !";
  protected final String TEXT_2413 = ".get(j).equals(";
  protected final String TEXT_2414 = ".";
  protected final String TEXT_2415 = "()))";
  protected final String TEXT_2416 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2417 = "Loop;";
  protected final String TEXT_2418 = NL + "\t\t\t}";
  protected final String TEXT_2419 = NL + "\t\t\t";
  protected final String TEXT_2420 = " ";
  protected final String TEXT_2421 = " = ";
  protected final String TEXT_2422 = ".";
  protected final String TEXT_2423 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2424 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2425 = "Loop;";
  protected final String TEXT_2426 = NL + "\t\t\tif (";
  protected final String TEXT_2427 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2428 = ".equalsIgnoreCase(";
  protected final String TEXT_2429 = ".";
  protected final String TEXT_2430 = "()) : ";
  protected final String TEXT_2431 = ".equals(";
  protected final String TEXT_2432 = ".";
  protected final String TEXT_2433 = "())))";
  protected final String TEXT_2434 = NL + "\t\t\tif (";
  protected final String TEXT_2435 = " != null && !";
  protected final String TEXT_2436 = ".equals(";
  protected final String TEXT_2437 = ".";
  protected final String TEXT_2438 = "()))";
  protected final String TEXT_2439 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2440 = "Loop;";
  protected final String TEXT_2441 = NL + "\t\t\tif (";
  protected final String TEXT_2442 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2443 = ".equalsIgnoreCase(";
  protected final String TEXT_2444 = ".";
  protected final String TEXT_2445 = "()) : ";
  protected final String TEXT_2446 = ".equals(";
  protected final String TEXT_2447 = ".";
  protected final String TEXT_2448 = "())))";
  protected final String TEXT_2449 = NL + "\t\t\tif (";
  protected final String TEXT_2450 = " != null && !";
  protected final String TEXT_2451 = ".equals(";
  protected final String TEXT_2452 = ".";
  protected final String TEXT_2453 = "()))";
  protected final String TEXT_2454 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2455 = "Loop;";
  protected final String TEXT_2456 = NL + "\t\t\treturn ";
  protected final String TEXT_2457 = ";" + NL + "\t\t}";
  protected final String TEXT_2458 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2459 = " && eClass != null";
  protected final String TEXT_2460 = " ? create";
  protected final String TEXT_2461 = "(";
  protected final String TEXT_2462 = ", eClass";
  protected final String TEXT_2463 = ") : null;";
  protected final String TEXT_2464 = NL + "\t\treturn null;";
  protected final String TEXT_2465 = NL + "\t}" + NL;
  protected final String TEXT_2466 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2467 = "()" + NL + "\t{";
  protected final String TEXT_2468 = NL + "  \t\treturn false;";
  protected final String TEXT_2469 = NL + "\t\treturn !((";
  protected final String TEXT_2470 = ".Internal.Wrapper)";
  protected final String TEXT_2471 = "()).featureMap().isEmpty();";
  protected final String TEXT_2472 = NL + "\t\treturn ";
  protected final String TEXT_2473 = " != null && !";
  protected final String TEXT_2474 = ".featureMap().isEmpty();";
  protected final String TEXT_2475 = NL + "\t\treturn ";
  protected final String TEXT_2476 = " != null && !";
  protected final String TEXT_2477 = ".isEmpty();";
  protected final String TEXT_2478 = NL + "\t\t";
  protected final String TEXT_2479 = " ";
  protected final String TEXT_2480 = " = (";
  protected final String TEXT_2481 = ")eVirtualGet(";
  protected final String TEXT_2482 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2483 = " != null && !";
  protected final String TEXT_2484 = ".isEmpty();";
  protected final String TEXT_2485 = NL + "\t\treturn !";
  protected final String TEXT_2486 = "().isEmpty();";
  protected final String TEXT_2487 = NL + "\t\treturn ";
  protected final String TEXT_2488 = " != null;";
  protected final String TEXT_2489 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2490 = ") != null;";
  protected final String TEXT_2491 = NL + "\t\treturn basicGet";
  protected final String TEXT_2492 = "() != null;";
  protected final String TEXT_2493 = NL + "\t\treturn ";
  protected final String TEXT_2494 = " != null;";
  protected final String TEXT_2495 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2496 = ") != null;";
  protected final String TEXT_2497 = NL + "\t\treturn ";
  protected final String TEXT_2498 = "() != null;";
  protected final String TEXT_2499 = NL + "\t\treturn ((";
  protected final String TEXT_2500 = " & ";
  protected final String TEXT_2501 = "_EFLAG) != 0) != ";
  protected final String TEXT_2502 = "_EDEFAULT;";
  protected final String TEXT_2503 = NL + "\t\treturn ";
  protected final String TEXT_2504 = " != ";
  protected final String TEXT_2505 = "_EDEFAULT;";
  protected final String TEXT_2506 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2507 = ", ";
  protected final String TEXT_2508 = "_EDEFAULT) != ";
  protected final String TEXT_2509 = "_EDEFAULT;";
  protected final String TEXT_2510 = NL + "\t\treturn ";
  protected final String TEXT_2511 = "() != ";
  protected final String TEXT_2512 = "_EDEFAULT;";
  protected final String TEXT_2513 = NL + "\t\treturn ";
  protected final String TEXT_2514 = "_EDEFAULT == null ? ";
  protected final String TEXT_2515 = " != null : !";
  protected final String TEXT_2516 = "_EDEFAULT.equals(";
  protected final String TEXT_2517 = ");";
  protected final String TEXT_2518 = NL + "\t\t";
  protected final String TEXT_2519 = " ";
  protected final String TEXT_2520 = " = (";
  protected final String TEXT_2521 = ")eVirtualGet(";
  protected final String TEXT_2522 = ", ";
  protected final String TEXT_2523 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2524 = "_EDEFAULT == null ? ";
  protected final String TEXT_2525 = " != null : !";
  protected final String TEXT_2526 = "_EDEFAULT.equals(";
  protected final String TEXT_2527 = ");";
  protected final String TEXT_2528 = NL + "\t\treturn ";
  protected final String TEXT_2529 = "_EDEFAULT == null ? ";
  protected final String TEXT_2530 = "() != null : !";
  protected final String TEXT_2531 = "_EDEFAULT.equals(";
  protected final String TEXT_2532 = "());";
  protected final String TEXT_2533 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2534 = ");";
  protected final String TEXT_2535 = NL + "\t\t";
  protected final String TEXT_2536 = " ";
  protected final String TEXT_2537 = " = (";
  protected final String TEXT_2538 = ")eVirtualGet(";
  protected final String TEXT_2539 = ");";
  protected final String TEXT_2540 = NL + "\t\treturn ";
  protected final String TEXT_2541 = " != null && ((";
  protected final String TEXT_2542 = ".Unsettable)";
  protected final String TEXT_2543 = ").isSet();";
  protected final String TEXT_2544 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2545 = ");";
  protected final String TEXT_2546 = NL + "\t\treturn (";
  protected final String TEXT_2547 = " & ";
  protected final String TEXT_2548 = "_ESETFLAG) != 0;";
  protected final String TEXT_2549 = NL + "\t\treturn ";
  protected final String TEXT_2550 = "ESet;";
  protected final String TEXT_2551 = NL + "\t\treturn !((";
  protected final String TEXT_2552 = ".Internal)((";
  protected final String TEXT_2553 = ".Internal.Wrapper)get";
  protected final String TEXT_2554 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2555 = ");";
  protected final String TEXT_2556 = NL + "\t\treturn !((";
  protected final String TEXT_2557 = ".Internal)get";
  protected final String TEXT_2558 = "()).isEmpty(";
  protected final String TEXT_2559 = ");";
  protected final String TEXT_2560 = NL;
  protected final String TEXT_2561 = NL + "\t\treturn ";
  protected final String TEXT_2562 = ".";
  protected final String TEXT_2563 = "(this);";
  protected final String TEXT_2564 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2565 = "' ";
  protected final String TEXT_2566 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2567 = NL + "\t}" + NL;
  protected final String TEXT_2568 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2569 = " ";
  protected final String TEXT_2570 = "()" + NL + "\t{";
  protected final String TEXT_2571 = NL + "\t\treturn ";
  protected final String TEXT_2572 = "();";
  protected final String TEXT_2573 = NL + "\t\treturn new ";
  protected final String TEXT_2574 = ".UnmodifiableEList(this, ";
  protected final String TEXT_2575 = "null";
  protected final String TEXT_2576 = ", 0, ";
  protected final String TEXT_2577 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2578 = NL + "\t\treturn null;";
  protected final String TEXT_2579 = NL + "\t\treturn ";
  protected final String TEXT_2580 = "();";
  protected final String TEXT_2581 = NL + "\t}" + NL;
  protected final String TEXT_2582 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2583 = " basicGet";
  protected final String TEXT_2584 = "()" + NL + "\t{";
  protected final String TEXT_2585 = NL + "\t\treturn null;";
  protected final String TEXT_2586 = NL + "\t\treturn ";
  protected final String TEXT_2587 = "basicGet";
  protected final String TEXT_2588 = "();";
  protected final String TEXT_2589 = NL + "\t}" + NL;
  protected final String TEXT_2590 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2591 = " basicSet";
  protected final String TEXT_2592 = "(";
  protected final String TEXT_2593 = " new";
  protected final String TEXT_2594 = ", ";
  protected final String TEXT_2595 = " msgs)" + NL + "\t{";
  protected final String TEXT_2596 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2597 = NL + "\t\tif (new";
  protected final String TEXT_2598 = " != null && !(new";
  protected final String TEXT_2599 = " instanceof ";
  protected final String TEXT_2600 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2601 = "));" + NL + "\t\t}";
  protected final String TEXT_2602 = NL + "\t\treturn basicSet";
  protected final String TEXT_2603 = "(";
  protected final String TEXT_2604 = "(";
  protected final String TEXT_2605 = ") ";
  protected final String TEXT_2606 = "new";
  protected final String TEXT_2607 = ", msgs);";
  protected final String TEXT_2608 = NL + "\t\tset";
  protected final String TEXT_2609 = "(";
  protected final String TEXT_2610 = "(";
  protected final String TEXT_2611 = ") ";
  protected final String TEXT_2612 = "new";
  protected final String TEXT_2613 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2614 = NL + "\t}" + NL;
  protected final String TEXT_2615 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_2616 = "(";
  protected final String TEXT_2617 = " new";
  protected final String TEXT_2618 = ")" + NL + "\t{";
  protected final String TEXT_2619 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2620 = NL + "\t\tif (new";
  protected final String TEXT_2621 = " != null && !(new";
  protected final String TEXT_2622 = " instanceof ";
  protected final String TEXT_2623 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2624 = "));" + NL + "\t\t}";
  protected final String TEXT_2625 = NL + "\t\tset";
  protected final String TEXT_2626 = "(";
  protected final String TEXT_2627 = "(";
  protected final String TEXT_2628 = ") ";
  protected final String TEXT_2629 = "new";
  protected final String TEXT_2630 = ");";
  protected final String TEXT_2631 = NL + "\t}" + NL;
  protected final String TEXT_2632 = NL;
  protected final String TEXT_2633 = NL + "\t/**";
  protected final String TEXT_2634 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2635 = "}, with the specified ";
  protected final String TEXT_2636 = ", and appends it to the '<em><b>";
  protected final String TEXT_2637 = "</b></em>' ";
  protected final String TEXT_2638 = ".";
  protected final String TEXT_2639 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2640 = "}, with the specified ";
  protected final String TEXT_2641 = ", and sets the '<em><b>";
  protected final String TEXT_2642 = "</b></em>' ";
  protected final String TEXT_2643 = ".";
  protected final String TEXT_2644 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2645 = "} and appends it to the '<em><b>";
  protected final String TEXT_2646 = "</b></em>' ";
  protected final String TEXT_2647 = ".";
  protected final String TEXT_2648 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2649 = "} and sets the '<em><b>";
  protected final String TEXT_2650 = "</b></em>' ";
  protected final String TEXT_2651 = ".";
  protected final String TEXT_2652 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2653 = NL + "\t * @param ";
  protected final String TEXT_2654 = " The ";
  protected final String TEXT_2655 = " for the new {@link ";
  protected final String TEXT_2656 = "}, or <code>null</code>.";
  protected final String TEXT_2657 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2658 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2659 = "}." + NL + "\t * @see #";
  protected final String TEXT_2660 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2661 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2662 = NL + "\t";
  protected final String TEXT_2663 = " create";
  protected final String TEXT_2664 = "(";
  protected final String TEXT_2665 = ", ";
  protected final String TEXT_2666 = " eClass);" + NL;
  protected final String TEXT_2667 = NL + "\tpublic ";
  protected final String TEXT_2668 = " create";
  protected final String TEXT_2669 = "(";
  protected final String TEXT_2670 = ", ";
  protected final String TEXT_2671 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2672 = " new";
  protected final String TEXT_2673 = " = (";
  protected final String TEXT_2674 = ") create(eClass);";
  protected final String TEXT_2675 = NL + "\t\tint ";
  protected final String TEXT_2676 = "ListSize = 0;";
  protected final String TEXT_2677 = NL + "\t\tint ";
  protected final String TEXT_2678 = "Size = ";
  protected final String TEXT_2679 = " == null ? 0 : ";
  protected final String TEXT_2680 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2681 = "Size > ";
  protected final String TEXT_2682 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2683 = "ListSize = ";
  protected final String TEXT_2684 = "Size;";
  protected final String TEXT_2685 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2686 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2687 = ".create";
  protected final String TEXT_2688 = "(";
  protected final String TEXT_2689 = ", ";
  protected final String TEXT_2690 = "i < ";
  protected final String TEXT_2691 = "Size ? (";
  protected final String TEXT_2692 = ") ";
  protected final String TEXT_2693 = ".get(i) : null";
  protected final String TEXT_2694 = ");" + NL + "\t\t}";
  protected final String TEXT_2695 = NL + "\t\tnew";
  protected final String TEXT_2696 = ".create";
  protected final String TEXT_2697 = "(";
  protected final String TEXT_2698 = ", ";
  protected final String TEXT_2699 = ");";
  protected final String TEXT_2700 = NL + "\t\tif (";
  protected final String TEXT_2701 = " != null)";
  protected final String TEXT_2702 = NL + "\t\t\tnew";
  protected final String TEXT_2703 = ".";
  protected final String TEXT_2704 = "().addAll(";
  protected final String TEXT_2705 = ");";
  protected final String TEXT_2706 = NL + "\t\t\tnew";
  protected final String TEXT_2707 = ".set";
  protected final String TEXT_2708 = "(";
  protected final String TEXT_2709 = ");";
  protected final String TEXT_2710 = NL + "\t\t";
  protected final String TEXT_2711 = "().add(new";
  protected final String TEXT_2712 = ");";
  protected final String TEXT_2713 = NL + "\t\tset";
  protected final String TEXT_2714 = "(new";
  protected final String TEXT_2715 = ");";
  protected final String TEXT_2716 = NL + "\t\treturn new";
  protected final String TEXT_2717 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2718 = NL + "\t/**";
  protected final String TEXT_2719 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2720 = "}, with the specified ";
  protected final String TEXT_2721 = ", and appends it to the '<em><b>";
  protected final String TEXT_2722 = "</b></em>' ";
  protected final String TEXT_2723 = ".";
  protected final String TEXT_2724 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2725 = "},with the specified ";
  protected final String TEXT_2726 = ", and sets the '<em><b>";
  protected final String TEXT_2727 = "</b></em>' ";
  protected final String TEXT_2728 = ".";
  protected final String TEXT_2729 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2730 = "} and appends it to the '<em><b>";
  protected final String TEXT_2731 = "</b></em>' ";
  protected final String TEXT_2732 = ".";
  protected final String TEXT_2733 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2734 = "} and sets the '<em><b>";
  protected final String TEXT_2735 = "</b></em>' ";
  protected final String TEXT_2736 = ".";
  protected final String TEXT_2737 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2738 = NL + "\t * @param ";
  protected final String TEXT_2739 = " The ";
  protected final String TEXT_2740 = " for the new {@link ";
  protected final String TEXT_2741 = "}, or <code>null</code>.";
  protected final String TEXT_2742 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2743 = "}." + NL + "\t * @see #";
  protected final String TEXT_2744 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2745 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2746 = NL + "\t";
  protected final String TEXT_2747 = " create";
  protected final String TEXT_2748 = "(";
  protected final String TEXT_2749 = ");" + NL;
  protected final String TEXT_2750 = NL + "\tpublic ";
  protected final String TEXT_2751 = " create";
  protected final String TEXT_2752 = "(";
  protected final String TEXT_2753 = ")" + NL + "\t{";
  protected final String TEXT_2754 = NL + "\t\treturn create";
  protected final String TEXT_2755 = "(";
  protected final String TEXT_2756 = ", ";
  protected final String TEXT_2757 = ");";
  protected final String TEXT_2758 = NL + "\t\t";
  protected final String TEXT_2759 = " new";
  protected final String TEXT_2760 = " = (";
  protected final String TEXT_2761 = ") create(";
  protected final String TEXT_2762 = ");";
  protected final String TEXT_2763 = NL + "\t\tint ";
  protected final String TEXT_2764 = "ListSize = 0;";
  protected final String TEXT_2765 = NL + "\t\tint ";
  protected final String TEXT_2766 = "Size = ";
  protected final String TEXT_2767 = " == null ? 0 : ";
  protected final String TEXT_2768 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2769 = "Size > ";
  protected final String TEXT_2770 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2771 = "ListSize = ";
  protected final String TEXT_2772 = "Size;";
  protected final String TEXT_2773 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2774 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2775 = ".create";
  protected final String TEXT_2776 = "(";
  protected final String TEXT_2777 = ", ";
  protected final String TEXT_2778 = "i < ";
  protected final String TEXT_2779 = "Size ? (";
  protected final String TEXT_2780 = ") ";
  protected final String TEXT_2781 = ".get(i) : null";
  protected final String TEXT_2782 = ");" + NL + "\t\t}";
  protected final String TEXT_2783 = NL + "\t\tnew";
  protected final String TEXT_2784 = ".create";
  protected final String TEXT_2785 = "(";
  protected final String TEXT_2786 = ", ";
  protected final String TEXT_2787 = ");";
  protected final String TEXT_2788 = NL + "\t\tif (";
  protected final String TEXT_2789 = " != null)";
  protected final String TEXT_2790 = NL + "\t\t\tnew";
  protected final String TEXT_2791 = ".";
  protected final String TEXT_2792 = "().addAll(";
  protected final String TEXT_2793 = ");";
  protected final String TEXT_2794 = NL + "\t\t\tnew";
  protected final String TEXT_2795 = ".set";
  protected final String TEXT_2796 = "(";
  protected final String TEXT_2797 = ");";
  protected final String TEXT_2798 = NL + "\t\t";
  protected final String TEXT_2799 = "().add(new";
  protected final String TEXT_2800 = ");";
  protected final String TEXT_2801 = NL + "\t\tset";
  protected final String TEXT_2802 = "(new";
  protected final String TEXT_2803 = ");";
  protected final String TEXT_2804 = NL + "\t\treturn new";
  protected final String TEXT_2805 = ";";
  protected final String TEXT_2806 = NL + "\t}" + NL;
  protected final String TEXT_2807 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2808 = "} with the specified ";
  protected final String TEXT_2809 = " from the '<em><b>";
  protected final String TEXT_2810 = "</b></em>' ";
  protected final String TEXT_2811 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2812 = NL + "\t * @param ";
  protected final String TEXT_2813 = " The ";
  protected final String TEXT_2814 = " of the {@link ";
  protected final String TEXT_2815 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2816 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2817 = "} with the specified ";
  protected final String TEXT_2818 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2819 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2820 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2821 = NL + "\t";
  protected final String TEXT_2822 = " get";
  protected final String TEXT_2823 = "(";
  protected final String TEXT_2824 = ");" + NL;
  protected final String TEXT_2825 = NL + "\tpublic ";
  protected final String TEXT_2826 = " get";
  protected final String TEXT_2827 = "(";
  protected final String TEXT_2828 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2829 = "(";
  protected final String TEXT_2830 = ", false";
  protected final String TEXT_2831 = ", null";
  protected final String TEXT_2832 = ", false";
  protected final String TEXT_2833 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2834 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2835 = "} with the specified ";
  protected final String TEXT_2836 = " from the '<em><b>";
  protected final String TEXT_2837 = "</b></em>' ";
  protected final String TEXT_2838 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2839 = NL + "\t * @param ";
  protected final String TEXT_2840 = " The ";
  protected final String TEXT_2841 = " of the {@link ";
  protected final String TEXT_2842 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2843 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2844 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2845 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2846 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2847 = "} on demand if not found.";
  protected final String TEXT_2848 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2849 = "} with the specified ";
  protected final String TEXT_2850 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2851 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2852 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2853 = NL + "\t";
  protected final String TEXT_2854 = " get";
  protected final String TEXT_2855 = "(";
  protected final String TEXT_2856 = ", boolean ignoreCase";
  protected final String TEXT_2857 = ", ";
  protected final String TEXT_2858 = " eClass";
  protected final String TEXT_2859 = ", boolean createOnDemand";
  protected final String TEXT_2860 = ");" + NL;
  protected final String TEXT_2861 = NL + "\tpublic ";
  protected final String TEXT_2862 = " get";
  protected final String TEXT_2863 = "(";
  protected final String TEXT_2864 = ", boolean ignoreCase";
  protected final String TEXT_2865 = ", ";
  protected final String TEXT_2866 = " eClass";
  protected final String TEXT_2867 = ", boolean createOnDemand";
  protected final String TEXT_2868 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2869 = "Loop: for (";
  protected final String TEXT_2870 = " i = ";
  protected final String TEXT_2871 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2872 = " ";
  protected final String TEXT_2873 = " = (";
  protected final String TEXT_2874 = ") i.next();";
  protected final String TEXT_2875 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2876 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2877 = "Loop;";
  protected final String TEXT_2878 = NL + "\t\t\t";
  protected final String TEXT_2879 = " ";
  protected final String TEXT_2880 = "List = ";
  protected final String TEXT_2881 = ".";
  protected final String TEXT_2882 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2883 = "ListSize = ";
  protected final String TEXT_2884 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2885 = " || (";
  protected final String TEXT_2886 = " != null && ";
  protected final String TEXT_2887 = ".size() != ";
  protected final String TEXT_2888 = "ListSize";
  protected final String TEXT_2889 = ")";
  protected final String TEXT_2890 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2891 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2892 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2893 = " ";
  protected final String TEXT_2894 = " = (";
  protected final String TEXT_2895 = ") ";
  protected final String TEXT_2896 = "List.get(j);";
  protected final String TEXT_2897 = NL + "\t\t\t\tif (";
  protected final String TEXT_2898 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2899 = ")";
  protected final String TEXT_2900 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2901 = ".";
  protected final String TEXT_2902 = "()) : ";
  protected final String TEXT_2903 = ".get(j).equals(";
  protected final String TEXT_2904 = ".";
  protected final String TEXT_2905 = "())))";
  protected final String TEXT_2906 = NL + "\t\t\t\tif (";
  protected final String TEXT_2907 = " != null && !";
  protected final String TEXT_2908 = ".get(j).equals(";
  protected final String TEXT_2909 = ".";
  protected final String TEXT_2910 = "()))";
  protected final String TEXT_2911 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2912 = "Loop;";
  protected final String TEXT_2913 = NL + "\t\t\t}";
  protected final String TEXT_2914 = NL + "\t\t\t";
  protected final String TEXT_2915 = " ";
  protected final String TEXT_2916 = " = ";
  protected final String TEXT_2917 = ".";
  protected final String TEXT_2918 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2919 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2920 = "Loop;";
  protected final String TEXT_2921 = NL + "\t\t\tif (";
  protected final String TEXT_2922 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2923 = ".equalsIgnoreCase(";
  protected final String TEXT_2924 = ".";
  protected final String TEXT_2925 = "()) : ";
  protected final String TEXT_2926 = ".equals(";
  protected final String TEXT_2927 = ".";
  protected final String TEXT_2928 = "())))";
  protected final String TEXT_2929 = NL + "\t\t\tif (";
  protected final String TEXT_2930 = " != null && !";
  protected final String TEXT_2931 = ".equals(";
  protected final String TEXT_2932 = ".";
  protected final String TEXT_2933 = "()))";
  protected final String TEXT_2934 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2935 = "Loop;";
  protected final String TEXT_2936 = NL + "\t\t\tif (";
  protected final String TEXT_2937 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2938 = ".equalsIgnoreCase(";
  protected final String TEXT_2939 = ".";
  protected final String TEXT_2940 = "()) : ";
  protected final String TEXT_2941 = ".equals(";
  protected final String TEXT_2942 = ".";
  protected final String TEXT_2943 = "())))";
  protected final String TEXT_2944 = NL + "\t\t\tif (";
  protected final String TEXT_2945 = " != null && !";
  protected final String TEXT_2946 = ".equals(";
  protected final String TEXT_2947 = ".";
  protected final String TEXT_2948 = "()))";
  protected final String TEXT_2949 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2950 = "Loop;";
  protected final String TEXT_2951 = NL + "\t\t\treturn ";
  protected final String TEXT_2952 = ";" + NL + "\t\t}";
  protected final String TEXT_2953 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2954 = " && eClass != null";
  protected final String TEXT_2955 = " ? create";
  protected final String TEXT_2956 = "(";
  protected final String TEXT_2957 = ", eClass";
  protected final String TEXT_2958 = ") : null;";
  protected final String TEXT_2959 = NL + "\t\treturn null;";
  protected final String TEXT_2960 = NL + "\t}" + NL;
  protected final String TEXT_2961 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2962 = "()" + NL + "\t{";
  protected final String TEXT_2963 = NL + "  \t\treturn false;";
  protected final String TEXT_2964 = NL + "\t\treturn !((";
  protected final String TEXT_2965 = ".Internal.Wrapper)";
  protected final String TEXT_2966 = "()).featureMap().isEmpty();";
  protected final String TEXT_2967 = NL + "\t\treturn ";
  protected final String TEXT_2968 = " != null && !";
  protected final String TEXT_2969 = ".featureMap().isEmpty();";
  protected final String TEXT_2970 = NL + "\t\treturn ";
  protected final String TEXT_2971 = " != null && !";
  protected final String TEXT_2972 = ".isEmpty();";
  protected final String TEXT_2973 = NL + "\t\t";
  protected final String TEXT_2974 = " ";
  protected final String TEXT_2975 = " = (";
  protected final String TEXT_2976 = ")eVirtualGet(";
  protected final String TEXT_2977 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2978 = " != null && !";
  protected final String TEXT_2979 = ".isEmpty();";
  protected final String TEXT_2980 = NL + "\t\treturn !";
  protected final String TEXT_2981 = "().isEmpty();";
  protected final String TEXT_2982 = NL + "\t\treturn ";
  protected final String TEXT_2983 = " != null;";
  protected final String TEXT_2984 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2985 = ") != null;";
  protected final String TEXT_2986 = NL + "\t\treturn basicGet";
  protected final String TEXT_2987 = "() != null;";
  protected final String TEXT_2988 = NL + "\t\treturn ";
  protected final String TEXT_2989 = " != null;";
  protected final String TEXT_2990 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2991 = ") != null;";
  protected final String TEXT_2992 = NL + "\t\treturn ";
  protected final String TEXT_2993 = "() != null;";
  protected final String TEXT_2994 = NL + "\t\treturn ((";
  protected final String TEXT_2995 = " & ";
  protected final String TEXT_2996 = "_EFLAG) != 0) != ";
  protected final String TEXT_2997 = "_EDEFAULT;";
  protected final String TEXT_2998 = NL + "\t\treturn ";
  protected final String TEXT_2999 = " != ";
  protected final String TEXT_3000 = "_EDEFAULT;";
  protected final String TEXT_3001 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3002 = ", ";
  protected final String TEXT_3003 = "_EDEFAULT) != ";
  protected final String TEXT_3004 = "_EDEFAULT;";
  protected final String TEXT_3005 = NL + "\t\treturn ";
  protected final String TEXT_3006 = "() != ";
  protected final String TEXT_3007 = "_EDEFAULT;";
  protected final String TEXT_3008 = NL + "\t\treturn ";
  protected final String TEXT_3009 = "_EDEFAULT == null ? ";
  protected final String TEXT_3010 = " != null : !";
  protected final String TEXT_3011 = "_EDEFAULT.equals(";
  protected final String TEXT_3012 = ");";
  protected final String TEXT_3013 = NL + "\t\t";
  protected final String TEXT_3014 = " ";
  protected final String TEXT_3015 = " = (";
  protected final String TEXT_3016 = ")eVirtualGet(";
  protected final String TEXT_3017 = ", ";
  protected final String TEXT_3018 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_3019 = "_EDEFAULT == null ? ";
  protected final String TEXT_3020 = " != null : !";
  protected final String TEXT_3021 = "_EDEFAULT.equals(";
  protected final String TEXT_3022 = ");";
  protected final String TEXT_3023 = NL + "\t\treturn ";
  protected final String TEXT_3024 = "_EDEFAULT == null ? ";
  protected final String TEXT_3025 = "() != null : !";
  protected final String TEXT_3026 = "_EDEFAULT.equals(";
  protected final String TEXT_3027 = "());";
  protected final String TEXT_3028 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3029 = ");";
  protected final String TEXT_3030 = NL + "\t\t";
  protected final String TEXT_3031 = " ";
  protected final String TEXT_3032 = " = (";
  protected final String TEXT_3033 = ")eVirtualGet(";
  protected final String TEXT_3034 = ");";
  protected final String TEXT_3035 = NL + "\t\treturn ";
  protected final String TEXT_3036 = " != null && ((";
  protected final String TEXT_3037 = ".Unsettable)";
  protected final String TEXT_3038 = ").isSet();";
  protected final String TEXT_3039 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3040 = ");";
  protected final String TEXT_3041 = NL + "\t\treturn (";
  protected final String TEXT_3042 = " & ";
  protected final String TEXT_3043 = "_ESETFLAG) != 0;";
  protected final String TEXT_3044 = NL + "\t\treturn ";
  protected final String TEXT_3045 = "ESet;";
  protected final String TEXT_3046 = NL + "\t\treturn !((";
  protected final String TEXT_3047 = ".Internal)((";
  protected final String TEXT_3048 = ".Internal.Wrapper)get";
  protected final String TEXT_3049 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3050 = ");";
  protected final String TEXT_3051 = NL + "\t\treturn !((";
  protected final String TEXT_3052 = ".Internal)get";
  protected final String TEXT_3053 = "()).isEmpty(";
  protected final String TEXT_3054 = ");";
  protected final String TEXT_3055 = NL;
  protected final String TEXT_3056 = NL + "\t\treturn ";
  protected final String TEXT_3057 = ".";
  protected final String TEXT_3058 = "(this);";
  protected final String TEXT_3059 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3060 = "' ";
  protected final String TEXT_3061 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3062 = NL + "\t}" + NL;
  protected final String TEXT_3063 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_3064 = " ";
  protected final String TEXT_3065 = "(";
  protected final String TEXT_3066 = ")";
  protected final String TEXT_3067 = NL + "\t{";
  protected final String TEXT_3068 = NL + "\t\t";
  protected final String TEXT_3069 = "(";
  protected final String TEXT_3070 = ");";
  protected final String TEXT_3071 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3072 = NL + "\t\treturn ";
  protected final String TEXT_3073 = "(";
  protected final String TEXT_3074 = ");";
  protected final String TEXT_3075 = NL + "\t}" + NL;
  protected final String TEXT_3076 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
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

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
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
    new Runnable() { public void run() {
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
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(TEXT_443);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_445);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_449);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_452);
    }
    stringBuffer.append(TEXT_453);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_457);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_459);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_467);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_471);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_472);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_474);
    }
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_479);
    }
    stringBuffer.append(TEXT_480);
    }
    stringBuffer.append(TEXT_481);
    }
    stringBuffer.append(TEXT_482);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_486);
    } else {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_492);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_494);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_500);
    } else {
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_504);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_505);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_510);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_514);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_515);
    } else {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_517);
    }
    stringBuffer.append(TEXT_518);
    } else {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_523);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(TEXT_529);
    }
    stringBuffer.append(TEXT_530);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_532);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_533);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_534);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_535);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_536);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_539);
    }
    stringBuffer.append(TEXT_540);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_544);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_546);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_547);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_552);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_554);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_558);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_561);
    }
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_566);
    }
    stringBuffer.append(TEXT_567);
    }
    stringBuffer.append(TEXT_568);
    }
    stringBuffer.append(TEXT_569);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_572);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_575);
    } else {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_580);
    }
    } else {
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_583);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_584);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_591);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_594);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_596);
    }
    }
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_598);
    } else {
    stringBuffer.append(TEXT_599);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_602);
    } else {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(TEXT_607);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_614);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_618);
    }
    stringBuffer.append(TEXT_619);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_637);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_643);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_648);
    }
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_661);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_671);
    }
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_675);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_676);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_679);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_683);
    }
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_686);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_689);
    }
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_691);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_698);
    }
    stringBuffer.append(TEXT_699);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_710);
    }
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_716);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_720);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    } else {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_731);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_736);
    } else {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_744);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_746);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_753);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_756);
    }
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_758);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_762);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_763);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_764);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_765);
    }
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_768);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_770);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_771);
    } else {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_773);
    }
    stringBuffer.append(TEXT_774);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_778);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_781);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_782);
    }
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_785);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_787);
    }
    }
    }
    stringBuffer.append(TEXT_788);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_789);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_791);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_792);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_793);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_795);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_796);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_798);
    }
    stringBuffer.append(TEXT_799);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_803);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_805);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_813);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_817);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_818);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_820);
    }
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    }
    stringBuffer.append(TEXT_826);
    }
    stringBuffer.append(TEXT_827);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_830);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_832);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_834);
    }
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_836);
    }
    stringBuffer.append(TEXT_837);
    } else {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_839);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_841);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_843);
    }
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_845);
    }
    stringBuffer.append(TEXT_846);
    }
    } else {
    stringBuffer.append(TEXT_847);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_848);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_851);
    } else {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_854);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_855);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_859);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_862);
    } else {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_867);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_869);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_875);
    } else {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_879);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_884);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_886);
    } else {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_888);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_889);
    } else {
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_891);
    }
    stringBuffer.append(TEXT_892);
    }
    } else {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_895);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_896);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_901);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_903);
    }
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_905);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_908);
    }
    stringBuffer.append(TEXT_909);
    } else {
    stringBuffer.append(TEXT_910);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_912);
    } else {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_914);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_916);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_919);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_924);
    }
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_927);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_931);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_935);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_936);
    }
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_938);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_941);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_945);
    }
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_948);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_951);
    }
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_953);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    }
    stringBuffer.append(TEXT_959);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_964);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_967);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_971);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_973);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getCapName());
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
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_982);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_985);
    } else {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_987);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_991);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_993);
    } else {
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_995);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_996);
    } else {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_998);
    }
    stringBuffer.append(TEXT_999);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1005);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1008);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1011);
    } else {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1013);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1017);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1020);
    } else {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1023);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1024);
    } else {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1026);
    }
    stringBuffer.append(TEXT_1027);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1032);
    } else {
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1036);
    }
    } else {
    stringBuffer.append(TEXT_1037);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1040);
    } else {
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1043);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1044);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1051);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1053);
    }
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1055);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1058);
    }
    stringBuffer.append(TEXT_1059);
    } else {
    stringBuffer.append(TEXT_1060);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1062);
    } else {
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1064);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1066);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1071);
    }
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1075);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1077);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1080);
    } else {
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1082);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1087);
    } else {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1091);
    }
    } else {
    stringBuffer.append(TEXT_1092);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1095);
    } else {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1098);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1099);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1100);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1101);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1106);
    } else {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1111);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1115);
    } else {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1119);
    }
    }
    stringBuffer.append(TEXT_1120);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1124);
    }
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1128);
    } else {
    stringBuffer.append(TEXT_1129);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1132);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1133);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1134);
    } else { int index = 0;
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1137);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1138);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1142);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1144);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1152);
    }
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1156);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1157);
    }
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1161);
    }
    stringBuffer.append(TEXT_1162);
    } else {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1165);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1166);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1167);
    }
    } else {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1169);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1173);
    } else {
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1177);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1180);
    } else {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1183);
    }
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1185);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1186);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1191);
    } else {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1196);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1200);
    } else {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1204);
    }
    }
    stringBuffer.append(TEXT_1205);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1209);
    }
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1212);
    } else {
    stringBuffer.append(TEXT_1213);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1217);
    } else { int index = 0;
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1221);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1223);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1224);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1225);
    } else {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1230);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1232);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1240);
    }
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1244);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1245);
    }
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1249);
    }
    stringBuffer.append(TEXT_1250);
    } else {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1253);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1254);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1255);
    }
    } else {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1257);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1261);
    } else {
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1265);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1268);
    } else {
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1271);
    }
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1273);
    }
    stringBuffer.append(TEXT_1274);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1279);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1283);
    }
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1287);
    } else {
    stringBuffer.append(TEXT_1288);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1292);
    } else {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1298);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1299);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1300);
    }
    stringBuffer.append(TEXT_1301);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1306);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1310);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1311);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1313);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1315);
    }
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1319);
    } else {
    stringBuffer.append(TEXT_1320);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1324);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1326);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1327);
    }
    stringBuffer.append(TEXT_1328);
    } else { int index = 0;
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1332);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1334);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1335);
    }
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1342);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1345);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1352);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(n);
    if (!first) {
    stringBuffer.append(TEXT_1353);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1356);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1357);
    }
    }
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1364);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1373);
    } else {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1378);
    }
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1380);
    }
    stringBuffer.append(TEXT_1381);
    } else {
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1388);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1396);
    } else {
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1401);
    }
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1403);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1411);
    } else {
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1416);
    }
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1418);
    }
    }
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1420);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1421);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1422);
    }
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1425);
    }
    stringBuffer.append(TEXT_1426);
    } else {
    stringBuffer.append(TEXT_1427);
    }
    stringBuffer.append(TEXT_1428);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1430);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1431);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1434);
    } else {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1437);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1440);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1447);
    } else {
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1449);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1451);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1453);
    } else {
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1455);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1457);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1459);
    } else {
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1461);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1465);
    } else {
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1468);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1472);
    } else {
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1475);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1480);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1490);
    } else {
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1495);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1497);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1502);
    }
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1506);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1508);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1511);
    } else {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1513);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1518);
    } else {
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1522);
    }
    } else {
    stringBuffer.append(TEXT_1523);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1526);
    } else {
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1529);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1530);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1531);
    if (isInterface) {
    stringBuffer.append(TEXT_1532);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1534);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1537);
    }}
    stringBuffer.append(TEXT_1538);
    } else {
    stringBuffer.append(TEXT_1539);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1544);
    } else {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1549);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1555);
    } else {
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1568);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1571);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1573);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1577);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1578);
    }
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1581);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1582);
    }
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1585);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1587);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1589);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1591);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1592);
    }
    stringBuffer.append(TEXT_1593);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1595);
    }
    stringBuffer.append(TEXT_1596);
    }
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1599);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1601);
    }
    } else {
    stringBuffer.append(TEXT_1602);
    }
    }
    stringBuffer.append(TEXT_1603);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1607);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1609);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1613);
    } else {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1616);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1617);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1620);
    } else {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1622);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1627);
    }
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1629);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1633);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1638);
    }
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1641);
    }
    }
    }
    stringBuffer.append(TEXT_1642);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1643);
    } else {
    stringBuffer.append(TEXT_1644);
    }
    stringBuffer.append(TEXT_1645);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1649);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1651);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1655);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1659);
    } else {
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1662);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1664);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1666);
    } else {
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1668);
    }
    }
    }
    stringBuffer.append(TEXT_1669);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1670);
    } else {
    stringBuffer.append(TEXT_1671);
    }
    stringBuffer.append(TEXT_1672);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1675);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1679);
    }
    }
    stringBuffer.append(TEXT_1680);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1681);
    } else {
    stringBuffer.append(TEXT_1682);
    }
    stringBuffer.append(TEXT_1683);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1684);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1686);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1688);
    } else {
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1691);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1694);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1698);
    } else {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1701);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1705);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1709);
    } else {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1711);
    }
    }
    }
    stringBuffer.append(TEXT_1712);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1713);
    } else {
    stringBuffer.append(TEXT_1714);
    }
    stringBuffer.append(TEXT_1715);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1716);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1718);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1722);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1725);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1729);
    } else {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1732);
    }
    } else {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1736);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1740);
    } else {
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1743);
    }
    stringBuffer.append(TEXT_1744);
    }
    }
    stringBuffer.append(TEXT_1745);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1746);
    } else {
    stringBuffer.append(TEXT_1747);
    }
    stringBuffer.append(TEXT_1748);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1750);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1753);
    } else {
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1755);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1757);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1760);
    } else {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1763);
    }
    stringBuffer.append(TEXT_1764);
    }
    }
    stringBuffer.append(TEXT_1765);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1766);
    } else {
    stringBuffer.append(TEXT_1767);
    }
    stringBuffer.append(TEXT_1768);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(TEXT_1770);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1772);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1774);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1777);
    } else {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1780);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1783);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1790);
    } else {
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1792);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1794);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1796);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1798);
    } else {
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1800);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1802);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1804);
    } else {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1806);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1810);
    } else {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1813);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1817);
    } else {
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1820);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1825);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1835);
    } else {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1840);
    }
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1841);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1842);
    } else {
    stringBuffer.append(TEXT_1843);
    }
    stringBuffer.append(TEXT_1844);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1845);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1847);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1850);
    }
    stringBuffer.append(TEXT_1851);
    }
    stringBuffer.append(TEXT_1852);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1854);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1857);
    }
    stringBuffer.append(TEXT_1858);
    }
    stringBuffer.append(TEXT_1859);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1862);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1863);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1866);
    }
    stringBuffer.append(TEXT_1867);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1870);
    }
    stringBuffer.append(TEXT_1871);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1872);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1880);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1883);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1884);
    }
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1888);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1891);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1892);
    }
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1897);
    }
    stringBuffer.append(TEXT_1898);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1901);
    } else {
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1903);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1904);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1905);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1907);
    } else {
    stringBuffer.append(TEXT_1908);
    }
    stringBuffer.append(TEXT_1909);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1911);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1914);
    } else {
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1916);
    }
    stringBuffer.append(TEXT_1917);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1919);
    } else {
    stringBuffer.append(TEXT_1920);
    }
    stringBuffer.append(TEXT_1921);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1923);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1926);
    } else {
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1928);
    }
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1932);
    }
    stringBuffer.append(TEXT_1933);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genModel)) {
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_1937);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1942);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1945);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1947);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1949);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1951);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1953);
    } else {
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1956);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1960);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1961);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1963);
    } else {
    stringBuffer.append(TEXT_1964);
    }
    stringBuffer.append(TEXT_1965);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1975);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1980);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1983);
    } else {
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1986);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1992);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1998);
    } else {
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2007);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2011);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2015);
    } else {
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2022);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2025);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2027);
    } else {
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2030);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2035);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2037);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2040);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2042);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_2055);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2056);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_2059);
    } else {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_2071);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2072);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2074);
    }
    stringBuffer.append(TEXT_2075);
    }
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_2080);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2081);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2082);
    }
    }
    } else {
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2085);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2088);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2091);
    } else {
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2097);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2098);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2100);
    } else {
    stringBuffer.append(TEXT_2101);
    }
    stringBuffer.append(TEXT_2102);
    }
    }
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2104);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2106);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2108);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2109);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2111);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2112);
    }
    } else {
    stringBuffer.append(TEXT_2113);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2115);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2116);
    }
    }
    } else {
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2118);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2119);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2121);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2122);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2124);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2125);
    }
    } else {
    stringBuffer.append(TEXT_2126);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2128);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2129);
    }
    }
    } else {
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2131);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2132);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2134);
    } else {
    stringBuffer.append(TEXT_2135);
    }
    }
    stringBuffer.append(TEXT_2136);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2137);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2138);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2143);
    } else {
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2148);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2152);
    } else {
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2156);
    }
    }
    stringBuffer.append(TEXT_2157);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2161);
    }
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2165);
    } else {
    stringBuffer.append(TEXT_2166);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2169);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2170);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2171);
    } else { int index = 0;
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2174);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2175);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2179);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2181);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2189);
    }
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2193);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2194);
    }
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2198);
    }
    stringBuffer.append(TEXT_2199);
    } else {
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2202);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2203);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2204);
    }
    } else {
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2206);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2210);
    } else {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2214);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2217);
    } else {
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2220);
    }
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2222);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2223);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2228);
    } else {
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2233);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2237);
    } else {
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2241);
    }
    }
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
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2249);
    } else {
    stringBuffer.append(TEXT_2250);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2254);
    } else { int index = 0;
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2258);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2260);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2261);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2262);
    } else {
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2267);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2269);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2277);
    }
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2281);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2282);
    }
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2286);
    }
    stringBuffer.append(TEXT_2287);
    } else {
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2290);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2291);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2292);
    }
    } else {
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2294);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2298);
    } else {
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2302);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2305);
    } else {
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2308);
    }
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2310);
    }
    stringBuffer.append(TEXT_2311);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2316);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2320);
    }
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2324);
    } else {
    stringBuffer.append(TEXT_2325);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2329);
    } else {
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2335);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2336);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2337);
    }
    stringBuffer.append(TEXT_2338);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2343);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2347);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2348);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2350);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2352);
    }
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2356);
    } else {
    stringBuffer.append(TEXT_2357);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2361);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2363);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2364);
    }
    stringBuffer.append(TEXT_2365);
    } else { int index = 0;
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2369);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2371);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2372);
    }
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2379);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2382);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2389);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(n);
    if (!first) {
    stringBuffer.append(TEXT_2390);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2393);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2394);
    }
    }
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2401);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2410);
    } else {
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2415);
    }
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2417);
    }
    stringBuffer.append(TEXT_2418);
    } else {
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2425);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2433);
    } else {
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2438);
    }
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2440);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2448);
    } else {
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2453);
    }
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2455);
    }
    }
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2457);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2458);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2459);
    }
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2462);
    }
    stringBuffer.append(TEXT_2463);
    } else {
    stringBuffer.append(TEXT_2464);
    }
    stringBuffer.append(TEXT_2465);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2467);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2468);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2471);
    } else {
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2474);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2477);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2484);
    } else {
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2486);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2488);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2490);
    } else {
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2492);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2494);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2496);
    } else {
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2498);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2502);
    } else {
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2505);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2509);
    } else {
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2512);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2517);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2527);
    } else {
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2532);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2534);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2539);
    }
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2543);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2545);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2548);
    } else {
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2550);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2555);
    } else {
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2559);
    }
    } else {
    stringBuffer.append(TEXT_2560);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2563);
    } else {
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2566);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2567);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2570);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2572);
    } else {
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2574);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2575);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2577);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2578);
    } else {
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2580);
    }
    }
    stringBuffer.append(TEXT_2581);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2584);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2585);
    } else {
    stringBuffer.append(TEXT_2586);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2588);
    }
    stringBuffer.append(TEXT_2589);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2595);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2596);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2601);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2603);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2605);
    }
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2607);
    } else {
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2609);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2611);
    }
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2613);
    }
    }
    stringBuffer.append(TEXT_2614);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2618);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2619);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2624);
    }
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2626);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2628);
    }
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2630);
    }
    stringBuffer.append(TEXT_2631);
    }
    stringBuffer.append(TEXT_2632);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2633);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2638);
    } else {
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2643);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2647);
    } else {
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2651);
    }
    }
    stringBuffer.append(TEXT_2652);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2656);
    }
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2660);
    } else {
    stringBuffer.append(TEXT_2661);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2664);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2665);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2666);
    } else { int index = 0;
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2669);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2670);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2674);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2676);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2684);
    }
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2688);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2689);
    }
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2693);
    }
    stringBuffer.append(TEXT_2694);
    } else {
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2697);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2698);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2699);
    }
    } else {
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2701);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2705);
    } else {
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2709);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2712);
    } else {
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2715);
    }
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2717);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2718);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2723);
    } else {
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2728);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2732);
    } else {
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2736);
    }
    }
    stringBuffer.append(TEXT_2737);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2741);
    }
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2744);
    } else {
    stringBuffer.append(TEXT_2745);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2749);
    } else { int index = 0;
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2753);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2755);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2756);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2757);
    } else {
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2762);
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2764);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2772);
    }
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2776);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2777);
    }
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2781);
    }
    stringBuffer.append(TEXT_2782);
    } else {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2785);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2786);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2787);
    }
    } else {
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2789);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2793);
    } else {
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2797);
    }
    }
    }
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2800);
    } else {
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2803);
    }
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2805);
    }
    stringBuffer.append(TEXT_2806);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2811);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2815);
    }
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2819);
    } else {
    stringBuffer.append(TEXT_2820);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2824);
    } else {
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2830);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2831);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2832);
    }
    stringBuffer.append(TEXT_2833);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2838);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2842);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2843);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2845);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2847);
    }
    stringBuffer.append(TEXT_2848);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2851);
    } else {
    stringBuffer.append(TEXT_2852);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2856);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2858);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2859);
    }
    stringBuffer.append(TEXT_2860);
    } else { int index = 0;
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2864);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2866);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2867);
    }
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2874);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2875);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2877);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2884);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(n);
    if (!first) {
    stringBuffer.append(TEXT_2885);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2888);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2889);
    }
    }
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2896);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2898);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2905);
    } else {
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2910);
    }
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2912);
    }
    stringBuffer.append(TEXT_2913);
    } else {
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2915);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2920);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2925);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2928);
    } else {
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2933);
    }
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2935);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2943);
    } else {
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2948);
    }
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2950);
    }
    }
    stringBuffer.append(TEXT_2951);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2952);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2953);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2954);
    }
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2957);
    }
    stringBuffer.append(TEXT_2958);
    } else {
    stringBuffer.append(TEXT_2959);
    }
    stringBuffer.append(TEXT_2960);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2961);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2962);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2963);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2965);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2966);
    } else {
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2969);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2972);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2974);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2976);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2978);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2979);
    } else {
    stringBuffer.append(TEXT_2980);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2981);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2983);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2985);
    } else {
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2987);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2989);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2991);
    } else {
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2993);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2997);
    } else {
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2999);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3000);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3001);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3004);
    } else {
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3007);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3008);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3012);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3013);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3016);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3017);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3018);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3022);
    } else {
    stringBuffer.append(TEXT_3023);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3024);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3026);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3027);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3028);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3029);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3030);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3031);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3034);
    }
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3036);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3038);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3040);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3043);
    } else {
    stringBuffer.append(TEXT_3044);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3045);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3046);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3049);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3050);
    } else {
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3052);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3053);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3054);
    }
    } else {
    stringBuffer.append(TEXT_3055);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_3056);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3058);
    } else {
    stringBuffer.append(TEXT_3059);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3060);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3061);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3062);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_3064);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_3067);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3068);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3069);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3070);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3071);
    } else {
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3073);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3074);
    }
    }
    stringBuffer.append(TEXT_3075);
    }
    }
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
