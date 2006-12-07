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
  protected final String TEXT_81 = " = ";
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
  protected final String TEXT_100 = ";" + NL;
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
  protected final String TEXT_117 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_118 = NL + "\t@Override";
  protected final String TEXT_119 = NL + "\tprotected ";
  protected final String TEXT_120 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_121 = ";" + NL + "\t}" + NL;
  protected final String TEXT_122 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_123 = NL + "\t";
  protected final String TEXT_124 = "[] ";
  protected final String TEXT_125 = "();" + NL;
  protected final String TEXT_126 = NL + "\tpublic ";
  protected final String TEXT_127 = "[] ";
  protected final String TEXT_128 = "()" + NL + "\t{";
  protected final String TEXT_129 = NL + "\t\t";
  protected final String TEXT_130 = " list = (";
  protected final String TEXT_131 = ")";
  protected final String TEXT_132 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_133 = "_EEMPTY_ARRAY;";
  protected final String TEXT_134 = NL + "\t\tif (";
  protected final String TEXT_135 = " == null || ";
  protected final String TEXT_136 = ".isEmpty()) return ";
  protected final String TEXT_137 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_138 = " list = (";
  protected final String TEXT_139 = ")";
  protected final String TEXT_140 = ";";
  protected final String TEXT_141 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_142 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_143 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_144 = NL + "\t";
  protected final String TEXT_145 = " get";
  protected final String TEXT_146 = "(int index);" + NL;
  protected final String TEXT_147 = NL + "\tpublic ";
  protected final String TEXT_148 = " get";
  protected final String TEXT_149 = "(int index)" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_150 = ")";
  protected final String TEXT_151 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_152 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_153 = NL + "\tint get";
  protected final String TEXT_154 = "Length();" + NL;
  protected final String TEXT_155 = NL + "\tpublic int get";
  protected final String TEXT_156 = "Length()" + NL + "\t{";
  protected final String TEXT_157 = NL + "\t\treturn ";
  protected final String TEXT_158 = "().size();";
  protected final String TEXT_159 = NL + "\t\treturn ";
  protected final String TEXT_160 = " == null ? 0 : ";
  protected final String TEXT_161 = ".size();";
  protected final String TEXT_162 = NL + "\t}" + NL;
  protected final String TEXT_163 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_164 = NL + "\tvoid set";
  protected final String TEXT_165 = "(";
  protected final String TEXT_166 = "[] new";
  protected final String TEXT_167 = ");" + NL;
  protected final String TEXT_168 = NL + "\tpublic void set";
  protected final String TEXT_169 = "(";
  protected final String TEXT_170 = "[] new";
  protected final String TEXT_171 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_172 = ")";
  protected final String TEXT_173 = "()).setData(new";
  protected final String TEXT_174 = ".length, new";
  protected final String TEXT_175 = ");" + NL + "\t}" + NL;
  protected final String TEXT_176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_177 = NL + "\tvoid set";
  protected final String TEXT_178 = "(int index, ";
  protected final String TEXT_179 = " element);" + NL;
  protected final String TEXT_180 = NL + "\tpublic void set";
  protected final String TEXT_181 = "(int index, ";
  protected final String TEXT_182 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_183 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_184 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_185 = "</b></em>' ";
  protected final String TEXT_186 = ".";
  protected final String TEXT_187 = NL + "\t * The key is of type ";
  protected final String TEXT_188 = "list of {@link ";
  protected final String TEXT_189 = "}";
  protected final String TEXT_190 = "{@link ";
  protected final String TEXT_191 = "}";
  protected final String TEXT_192 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_193 = "list of {@link ";
  protected final String TEXT_194 = "}";
  protected final String TEXT_195 = "{@link ";
  protected final String TEXT_196 = "}";
  protected final String TEXT_197 = ",";
  protected final String TEXT_198 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_199 = "}.";
  protected final String TEXT_200 = NL + "\t * The default value is <code>";
  protected final String TEXT_201 = "</code>.";
  protected final String TEXT_202 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_203 = "}.";
  protected final String TEXT_204 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_205 = "#";
  protected final String TEXT_206 = " <em>";
  protected final String TEXT_207 = "</em>}'.";
  protected final String TEXT_208 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_209 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_210 = "</em>' ";
  protected final String TEXT_211 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_212 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_213 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_214 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_215 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_216 = "</em>' ";
  protected final String TEXT_217 = ".";
  protected final String TEXT_218 = NL + "\t * @see ";
  protected final String TEXT_219 = NL + "\t * @see #isSet";
  protected final String TEXT_220 = "()";
  protected final String TEXT_221 = NL + "\t * @see #unset";
  protected final String TEXT_222 = "()";
  protected final String TEXT_223 = NL + "\t * @see #set";
  protected final String TEXT_224 = "(";
  protected final String TEXT_225 = ")";
  protected final String TEXT_226 = NL + "\t * @see ";
  protected final String TEXT_227 = "#get";
  protected final String TEXT_228 = "()";
  protected final String TEXT_229 = NL + "\t * @see ";
  protected final String TEXT_230 = "#";
  protected final String TEXT_231 = NL + "\t * @model ";
  protected final String TEXT_232 = NL + "\t *        ";
  protected final String TEXT_233 = NL + "\t * @model";
  protected final String TEXT_234 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_235 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_236 = NL + "\t";
  protected final String TEXT_237 = " ";
  protected final String TEXT_238 = "();" + NL;
  protected final String TEXT_239 = NL + "\tpublic ";
  protected final String TEXT_240 = " ";
  protected final String TEXT_241 = "()" + NL + "\t{";
  protected final String TEXT_242 = NL + "\t\treturn ";
  protected final String TEXT_243 = "(";
  protected final String TEXT_244 = "(";
  protected final String TEXT_245 = ")eGet(";
  protected final String TEXT_246 = ", true)";
  protected final String TEXT_247 = ").";
  protected final String TEXT_248 = "()";
  protected final String TEXT_249 = ";";
  protected final String TEXT_250 = NL + "\t\t";
  protected final String TEXT_251 = " ";
  protected final String TEXT_252 = " = (";
  protected final String TEXT_253 = ")eVirtualGet(";
  protected final String TEXT_254 = ");";
  protected final String TEXT_255 = NL + "\t\tif (";
  protected final String TEXT_256 = " == null)" + NL + "\t\t{";
  protected final String TEXT_257 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_258 = ", ";
  protected final String TEXT_259 = " = new ";
  protected final String TEXT_260 = ");";
  protected final String TEXT_261 = NL + "\t\t\t";
  protected final String TEXT_262 = " = new ";
  protected final String TEXT_263 = ";";
  protected final String TEXT_264 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_265 = ";";
  protected final String TEXT_266 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_267 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_268 = ")eContainer();";
  protected final String TEXT_269 = NL + "\t\t";
  protected final String TEXT_270 = " ";
  protected final String TEXT_271 = " = (";
  protected final String TEXT_272 = ")eVirtualGet(";
  protected final String TEXT_273 = ", ";
  protected final String TEXT_274 = ");";
  protected final String TEXT_275 = NL + "\t\tif (";
  protected final String TEXT_276 = " != null && ";
  protected final String TEXT_277 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_278 = " old";
  protected final String TEXT_279 = " = (";
  protected final String TEXT_280 = ")";
  protected final String TEXT_281 = ";" + NL + "\t\t\t";
  protected final String TEXT_282 = " = ";
  protected final String TEXT_283 = "eResolveProxy(old";
  protected final String TEXT_284 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_285 = " != old";
  protected final String TEXT_286 = ")" + NL + "\t\t\t{";
  protected final String TEXT_287 = NL + "\t\t\t\t";
  protected final String TEXT_288 = " new";
  protected final String TEXT_289 = " = (";
  protected final String TEXT_290 = ")";
  protected final String TEXT_291 = ";";
  protected final String TEXT_292 = NL + "\t\t\t\t";
  protected final String TEXT_293 = " msgs = old";
  protected final String TEXT_294 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_295 = ", null, null);";
  protected final String TEXT_296 = NL + "\t\t\t\t";
  protected final String TEXT_297 = " msgs =  old";
  protected final String TEXT_298 = ".eInverseRemove(this, ";
  protected final String TEXT_299 = ", ";
  protected final String TEXT_300 = ".class, null);";
  protected final String TEXT_301 = NL + "\t\t\t\tif (new";
  protected final String TEXT_302 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_303 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_304 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_305 = ", null, msgs);";
  protected final String TEXT_306 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_307 = ".eInverseAdd(this, ";
  protected final String TEXT_308 = ", ";
  protected final String TEXT_309 = ".class, msgs);";
  protected final String TEXT_310 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_311 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_312 = ", ";
  protected final String TEXT_313 = ");";
  protected final String TEXT_314 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_315 = "(this, ";
  protected final String TEXT_316 = ".RESOLVE, ";
  protected final String TEXT_317 = ", old";
  protected final String TEXT_318 = ", ";
  protected final String TEXT_319 = "));";
  protected final String TEXT_320 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_321 = NL + "\t\treturn (";
  protected final String TEXT_322 = ")eVirtualGet(";
  protected final String TEXT_323 = ", ";
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
  protected final String TEXT_344 = "()).featureMap().";
  protected final String TEXT_345 = "list(";
  protected final String TEXT_346 = "));";
  protected final String TEXT_347 = NL + "\t\treturn (";
  protected final String TEXT_348 = ")get";
  protected final String TEXT_349 = "().";
  protected final String TEXT_350 = "list(";
  protected final String TEXT_351 = ");";
  protected final String TEXT_352 = NL + "\t\treturn ((";
  protected final String TEXT_353 = ".Internal.Wrapper)get";
  protected final String TEXT_354 = "()).featureMap().list(";
  protected final String TEXT_355 = ");";
  protected final String TEXT_356 = NL + "\t\treturn get";
  protected final String TEXT_357 = "().list(";
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
  protected final String TEXT_401 = NL + "\t\t";
  protected final String TEXT_402 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_403 = " eResource = eResource();" + NL + "\t\t\t";
  protected final String TEXT_404 = " ";
  protected final String TEXT_405 = " = (";
  protected final String TEXT_406 = ") cache.get(eResource, this, ";
  protected final String TEXT_407 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_408 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_409 = ", ";
  protected final String TEXT_410 = " = new ";
  protected final String TEXT_411 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_412 = ";" + NL + "\t\t}";
  protected final String TEXT_413 = NL + "\t\treturn new ";
  protected final String TEXT_414 = ";";
  protected final String TEXT_415 = NL + "\t\t";
  protected final String TEXT_416 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_417 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_418 = " method = getClass().getMethod(\"";
  protected final String TEXT_419 = "\", null);";
  protected final String TEXT_420 = NL + "\t\t\t\t";
  protected final String TEXT_421 = " ";
  protected final String TEXT_422 = " = (";
  protected final String TEXT_423 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_424 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_425 = " union = ";
  protected final String TEXT_426 = "Helper(new ";
  protected final String TEXT_427 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_428 = " = new ";
  protected final String TEXT_429 = "(this, ";
  protected final String TEXT_430 = "null";
  protected final String TEXT_431 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_432 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_433 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_434 = NL + "\t\t\t";
  protected final String TEXT_435 = " ";
  protected final String TEXT_436 = " = (";
  protected final String TEXT_437 = ") cache.get(eResource(), this, ";
  protected final String TEXT_438 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_439 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_440 = " union = ";
  protected final String TEXT_441 = "Helper(new ";
  protected final String TEXT_442 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_443 = ", ";
  protected final String TEXT_444 = " = new ";
  protected final String TEXT_445 = "(this, ";
  protected final String TEXT_446 = "null";
  protected final String TEXT_447 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_448 = ";";
  protected final String TEXT_449 = NL + "\t\t}";
  protected final String TEXT_450 = NL + "\t\t";
  protected final String TEXT_451 = " union = ";
  protected final String TEXT_452 = "Helper(new ";
  protected final String TEXT_453 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_454 = "(this, ";
  protected final String TEXT_455 = "null";
  protected final String TEXT_456 = ", union.size(), union.toArray());";
  protected final String TEXT_457 = NL + "\t\tif (isSet";
  protected final String TEXT_458 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_459 = "();" + NL + "\t\t}";
  protected final String TEXT_460 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_461 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_462 = "();" + NL + "\t\t}";
  protected final String TEXT_463 = NL + "\t\t";
  protected final String TEXT_464 = " ";
  protected final String TEXT_465 = " = ";
  protected final String TEXT_466 = "();" + NL + "\t\tif (";
  protected final String TEXT_467 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_468 = ";" + NL + "\t\t}";
  protected final String TEXT_469 = NL + "\t\treturn ";
  protected final String TEXT_470 = "super.";
  protected final String TEXT_471 = "()";
  protected final String TEXT_472 = "null";
  protected final String TEXT_473 = ";";
  protected final String TEXT_474 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_475 = "' ";
  protected final String TEXT_476 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_477 = NL + "\t}" + NL;
  protected final String TEXT_478 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_479 = " basicGet";
  protected final String TEXT_480 = "()" + NL + "\t{";
  protected final String TEXT_481 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_482 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_483 = ")eInternalContainer();";
  protected final String TEXT_484 = NL + "\t\treturn (";
  protected final String TEXT_485 = ")eVirtualGet(";
  protected final String TEXT_486 = ");";
  protected final String TEXT_487 = NL + "\t\treturn ";
  protected final String TEXT_488 = ";";
  protected final String TEXT_489 = NL + "\t\treturn (";
  protected final String TEXT_490 = ")((";
  protected final String TEXT_491 = ".Internal.Wrapper)get";
  protected final String TEXT_492 = "()).featureMap().get(";
  protected final String TEXT_493 = ", false);";
  protected final String TEXT_494 = NL + "\t\treturn (";
  protected final String TEXT_495 = ")get";
  protected final String TEXT_496 = "().get(";
  protected final String TEXT_497 = ", false);";
  protected final String TEXT_498 = NL;
  protected final String TEXT_499 = NL + "\t\treturn ";
  protected final String TEXT_500 = ".";
  protected final String TEXT_501 = "(this);";
  protected final String TEXT_502 = NL + "\t\tif (isSet";
  protected final String TEXT_503 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_504 = "basicGet";
  protected final String TEXT_505 = "();" + NL + "\t\t}";
  protected final String TEXT_506 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_507 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_508 = "basicGet";
  protected final String TEXT_509 = "();" + NL + "\t\t}";
  protected final String TEXT_510 = NL + "\t\t";
  protected final String TEXT_511 = " ";
  protected final String TEXT_512 = " = ";
  protected final String TEXT_513 = "basicGet";
  protected final String TEXT_514 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_515 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_516 = ";" + NL + "\t\t}";
  protected final String TEXT_517 = NL + "\t\treturn ";
  protected final String TEXT_518 = "super.basicGet";
  protected final String TEXT_519 = "()";
  protected final String TEXT_520 = "null";
  protected final String TEXT_521 = ";";
  protected final String TEXT_522 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_523 = "' ";
  protected final String TEXT_524 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_525 = NL + "\t}" + NL;
  protected final String TEXT_526 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_527 = " basicSet";
  protected final String TEXT_528 = "(";
  protected final String TEXT_529 = " new";
  protected final String TEXT_530 = ", ";
  protected final String TEXT_531 = " msgs)" + NL + "\t{";
  protected final String TEXT_532 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_533 = ")new";
  protected final String TEXT_534 = ", ";
  protected final String TEXT_535 = ", msgs);";
  protected final String TEXT_536 = NL;
  protected final String TEXT_537 = NL + "\t\t";
  protected final String TEXT_538 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_539 = NL + "\t\t\t";
  protected final String TEXT_540 = " ";
  protected final String TEXT_541 = " = ";
  protected final String TEXT_542 = "();";
  protected final String TEXT_543 = NL + "\t\t\tObject ";
  protected final String TEXT_544 = " = eVirtualGet(";
  protected final String TEXT_545 = ");";
  protected final String TEXT_546 = NL + "\t\t\tif (";
  protected final String TEXT_547 = " != null && ";
  protected final String TEXT_548 = " != new";
  protected final String TEXT_549 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_550 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_551 = NL + "\t\t\tif (new";
  protected final String TEXT_552 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_553 = NL + "\t\t\t\t";
  protected final String TEXT_554 = " ";
  protected final String TEXT_555 = " = ";
  protected final String TEXT_556 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_557 = ".contains(new";
  protected final String TEXT_558 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_559 = ".add(new";
  protected final String TEXT_560 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_561 = NL + "\t\t\t\t";
  protected final String TEXT_562 = " ";
  protected final String TEXT_563 = " = ";
  protected final String TEXT_564 = "();";
  protected final String TEXT_565 = NL + "\t\t\t\tObject ";
  protected final String TEXT_566 = " = eVirtualGet(";
  protected final String TEXT_567 = ");";
  protected final String TEXT_568 = NL + "\t\t\t\tif (new";
  protected final String TEXT_569 = " != ";
  protected final String TEXT_570 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_571 = "(new";
  protected final String TEXT_572 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_573 = NL + "\t\t\t}";
  protected final String TEXT_574 = NL + "\t\t}";
  protected final String TEXT_575 = NL + "\t\treturn msgs;";
  protected final String TEXT_576 = NL + "\t\tObject old";
  protected final String TEXT_577 = " = eVirtualSet(";
  protected final String TEXT_578 = ", new";
  protected final String TEXT_579 = ");";
  protected final String TEXT_580 = NL + "\t\t";
  protected final String TEXT_581 = " old";
  protected final String TEXT_582 = " = ";
  protected final String TEXT_583 = ";" + NL + "\t\t";
  protected final String TEXT_584 = " = new";
  protected final String TEXT_585 = ";";
  protected final String TEXT_586 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_587 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_588 = NL + "\t\tboolean old";
  protected final String TEXT_589 = "ESet = (";
  protected final String TEXT_590 = " & ";
  protected final String TEXT_591 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_592 = " |= ";
  protected final String TEXT_593 = "_ESETFLAG;";
  protected final String TEXT_594 = NL + "\t\tboolean old";
  protected final String TEXT_595 = "ESet = ";
  protected final String TEXT_596 = "ESet;" + NL + "\t\t";
  protected final String TEXT_597 = "ESet = true;";
  protected final String TEXT_598 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_599 = NL + "\t\t\t";
  protected final String TEXT_600 = " notification = new ";
  protected final String TEXT_601 = "(this, ";
  protected final String TEXT_602 = ".SET, ";
  protected final String TEXT_603 = ", ";
  protected final String TEXT_604 = "isSetChange ? null : old";
  protected final String TEXT_605 = "old";
  protected final String TEXT_606 = ", new";
  protected final String TEXT_607 = ", ";
  protected final String TEXT_608 = "isSetChange";
  protected final String TEXT_609 = "!old";
  protected final String TEXT_610 = "ESet";
  protected final String TEXT_611 = ");";
  protected final String TEXT_612 = NL + "\t\t\t";
  protected final String TEXT_613 = " notification = new ";
  protected final String TEXT_614 = "(this, ";
  protected final String TEXT_615 = ".SET, ";
  protected final String TEXT_616 = ", ";
  protected final String TEXT_617 = "old";
  protected final String TEXT_618 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_619 = "old";
  protected final String TEXT_620 = ", new";
  protected final String TEXT_621 = ");";
  protected final String TEXT_622 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_623 = NL;
  protected final String TEXT_624 = NL + "\t\t";
  protected final String TEXT_625 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_626 = NL + "\t\t\t";
  protected final String TEXT_627 = " ";
  protected final String TEXT_628 = " = ";
  protected final String TEXT_629 = "();";
  protected final String TEXT_630 = NL + "\t\t\tObject ";
  protected final String TEXT_631 = " = eVirtualGet(";
  protected final String TEXT_632 = ");";
  protected final String TEXT_633 = NL + "\t\t\tif (";
  protected final String TEXT_634 = " != null && ";
  protected final String TEXT_635 = " != new";
  protected final String TEXT_636 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_637 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_638 = NL + "\t\t\tif (new";
  protected final String TEXT_639 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_640 = NL + "\t\t\t\t";
  protected final String TEXT_641 = " ";
  protected final String TEXT_642 = " = ";
  protected final String TEXT_643 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_644 = ".contains(new";
  protected final String TEXT_645 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_646 = ".add(new";
  protected final String TEXT_647 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_648 = NL + "\t\t\t\t";
  protected final String TEXT_649 = " ";
  protected final String TEXT_650 = " = ";
  protected final String TEXT_651 = "();";
  protected final String TEXT_652 = NL + "\t\t\t\tObject ";
  protected final String TEXT_653 = " = eVirtualGet(";
  protected final String TEXT_654 = ");";
  protected final String TEXT_655 = NL + "\t\t\t\tif (new";
  protected final String TEXT_656 = " != ";
  protected final String TEXT_657 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_658 = "(new";
  protected final String TEXT_659 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_660 = NL + "\t\t\t}";
  protected final String TEXT_661 = NL + "\t\t}";
  protected final String TEXT_662 = NL + "\t\treturn msgs;";
  protected final String TEXT_663 = NL + "\t\treturn ((";
  protected final String TEXT_664 = ".Internal)((";
  protected final String TEXT_665 = ".Internal.Wrapper)get";
  protected final String TEXT_666 = "()).featureMap()).basicAdd(";
  protected final String TEXT_667 = ", new";
  protected final String TEXT_668 = ", msgs);";
  protected final String TEXT_669 = NL + "\t\treturn ((";
  protected final String TEXT_670 = ".Internal)get";
  protected final String TEXT_671 = "()).basicAdd(";
  protected final String TEXT_672 = ", new";
  protected final String TEXT_673 = ", msgs);";
  protected final String TEXT_674 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_675 = "' ";
  protected final String TEXT_676 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_677 = NL + "\t}" + NL;
  protected final String TEXT_678 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_679 = "#";
  protected final String TEXT_680 = " <em>";
  protected final String TEXT_681 = "</em>}' ";
  protected final String TEXT_682 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_683 = "</em>' ";
  protected final String TEXT_684 = ".";
  protected final String TEXT_685 = NL + "\t * @see ";
  protected final String TEXT_686 = NL + "\t * @see #isSet";
  protected final String TEXT_687 = "()";
  protected final String TEXT_688 = NL + "\t * @see #unset";
  protected final String TEXT_689 = "()";
  protected final String TEXT_690 = NL + "\t * @see #";
  protected final String TEXT_691 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_692 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_693 = NL + "\tvoid set";
  protected final String TEXT_694 = "(";
  protected final String TEXT_695 = " value);" + NL;
  protected final String TEXT_696 = NL + "\tpublic void set";
  protected final String TEXT_697 = "(";
  protected final String TEXT_698 = " new";
  protected final String TEXT_699 = ")" + NL + "\t{";
  protected final String TEXT_700 = NL;
  protected final String TEXT_701 = NL + "\t\tnew";
  protected final String TEXT_702 = " = new";
  protected final String TEXT_703 = " == null ? ";
  protected final String TEXT_704 = "_EDEFAULT : new";
  protected final String TEXT_705 = ";";
  protected final String TEXT_706 = NL + "\t\teSet(";
  protected final String TEXT_707 = ", ";
  protected final String TEXT_708 = "new ";
  protected final String TEXT_709 = "(";
  protected final String TEXT_710 = "new";
  protected final String TEXT_711 = ")";
  protected final String TEXT_712 = ");";
  protected final String TEXT_713 = NL + "\t\tif (new";
  protected final String TEXT_714 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_715 = " && new";
  protected final String TEXT_716 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_717 = ".isAncestor(this, ";
  protected final String TEXT_718 = "new";
  protected final String TEXT_719 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_720 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_721 = NL + "\t\t\t";
  protected final String TEXT_722 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_723 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_724 = ")new";
  protected final String TEXT_725 = ").eInverseAdd(this, ";
  protected final String TEXT_726 = ", ";
  protected final String TEXT_727 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_728 = "(";
  protected final String TEXT_729 = "new";
  protected final String TEXT_730 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_731 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_732 = "(this, ";
  protected final String TEXT_733 = ".SET, ";
  protected final String TEXT_734 = ", new";
  protected final String TEXT_735 = ", new";
  protected final String TEXT_736 = "));";
  protected final String TEXT_737 = NL + "\t\t";
  protected final String TEXT_738 = " ";
  protected final String TEXT_739 = " = (";
  protected final String TEXT_740 = ")eVirtualGet(";
  protected final String TEXT_741 = ");";
  protected final String TEXT_742 = NL + "\t\tif (new";
  protected final String TEXT_743 = " != ";
  protected final String TEXT_744 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_745 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_746 = " != null)";
  protected final String TEXT_747 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_748 = ")";
  protected final String TEXT_749 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_750 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_751 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_752 = ")new";
  protected final String TEXT_753 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_754 = ", null, msgs);";
  protected final String TEXT_755 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_756 = ")";
  protected final String TEXT_757 = ").eInverseRemove(this, ";
  protected final String TEXT_758 = ", ";
  protected final String TEXT_759 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_760 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_761 = ")new";
  protected final String TEXT_762 = ").eInverseAdd(this, ";
  protected final String TEXT_763 = ", ";
  protected final String TEXT_764 = ".class, msgs);";
  protected final String TEXT_765 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_766 = "(";
  protected final String TEXT_767 = "new";
  protected final String TEXT_768 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_769 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_770 = NL + "\t\t\tboolean old";
  protected final String TEXT_771 = "ESet = eVirtualIsSet(";
  protected final String TEXT_772 = ");";
  protected final String TEXT_773 = NL + "\t\t\tboolean old";
  protected final String TEXT_774 = "ESet = (";
  protected final String TEXT_775 = " & ";
  protected final String TEXT_776 = "_ESETFLAG) != 0;";
  protected final String TEXT_777 = NL + "\t\t\t";
  protected final String TEXT_778 = " |= ";
  protected final String TEXT_779 = "_ESETFLAG;";
  protected final String TEXT_780 = NL + "\t\t\tboolean old";
  protected final String TEXT_781 = "ESet = ";
  protected final String TEXT_782 = "ESet;";
  protected final String TEXT_783 = NL + "\t\t\t";
  protected final String TEXT_784 = "ESet = true;";
  protected final String TEXT_785 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_786 = "(this, ";
  protected final String TEXT_787 = ".SET, ";
  protected final String TEXT_788 = ", new";
  protected final String TEXT_789 = ", new";
  protected final String TEXT_790 = ", !old";
  protected final String TEXT_791 = "ESet));";
  protected final String TEXT_792 = NL + "\t\t}";
  protected final String TEXT_793 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_794 = "(this, ";
  protected final String TEXT_795 = ".SET, ";
  protected final String TEXT_796 = ", new";
  protected final String TEXT_797 = ", new";
  protected final String TEXT_798 = "));";
  protected final String TEXT_799 = NL + "\t\t";
  protected final String TEXT_800 = " old";
  protected final String TEXT_801 = " = (";
  protected final String TEXT_802 = " & ";
  protected final String TEXT_803 = "_EFLAG) != 0;";
  protected final String TEXT_804 = NL + "\t\tif (new";
  protected final String TEXT_805 = ") ";
  protected final String TEXT_806 = " |= ";
  protected final String TEXT_807 = "_EFLAG; else ";
  protected final String TEXT_808 = " &= ~";
  protected final String TEXT_809 = "_EFLAG;";
  protected final String TEXT_810 = NL + "\t\t";
  protected final String TEXT_811 = " old";
  protected final String TEXT_812 = " = ";
  protected final String TEXT_813 = ";";
  protected final String TEXT_814 = NL + "\t\t";
  protected final String TEXT_815 = " ";
  protected final String TEXT_816 = " = new";
  protected final String TEXT_817 = " == null ? ";
  protected final String TEXT_818 = " : new";
  protected final String TEXT_819 = ";";
  protected final String TEXT_820 = NL + "\t\t";
  protected final String TEXT_821 = " = new";
  protected final String TEXT_822 = " == null ? ";
  protected final String TEXT_823 = " : new";
  protected final String TEXT_824 = ";";
  protected final String TEXT_825 = NL + "\t\t";
  protected final String TEXT_826 = " ";
  protected final String TEXT_827 = " = ";
  protected final String TEXT_828 = "new";
  protected final String TEXT_829 = ";";
  protected final String TEXT_830 = NL + "\t\t";
  protected final String TEXT_831 = " = ";
  protected final String TEXT_832 = "new";
  protected final String TEXT_833 = ";";
  protected final String TEXT_834 = NL + "\t\tObject old";
  protected final String TEXT_835 = " = eVirtualSet(";
  protected final String TEXT_836 = ", ";
  protected final String TEXT_837 = ");";
  protected final String TEXT_838 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_839 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_840 = NL + "\t\tboolean old";
  protected final String TEXT_841 = "ESet = (";
  protected final String TEXT_842 = " & ";
  protected final String TEXT_843 = "_ESETFLAG) != 0;";
  protected final String TEXT_844 = NL + "\t\t";
  protected final String TEXT_845 = " |= ";
  protected final String TEXT_846 = "_ESETFLAG;";
  protected final String TEXT_847 = NL + "\t\tboolean old";
  protected final String TEXT_848 = "ESet = ";
  protected final String TEXT_849 = "ESet;";
  protected final String TEXT_850 = NL + "\t\t";
  protected final String TEXT_851 = "ESet = true;";
  protected final String TEXT_852 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_853 = "(this, ";
  protected final String TEXT_854 = ".SET, ";
  protected final String TEXT_855 = ", ";
  protected final String TEXT_856 = "isSetChange ? ";
  protected final String TEXT_857 = " : old";
  protected final String TEXT_858 = "old";
  protected final String TEXT_859 = ", ";
  protected final String TEXT_860 = "new";
  protected final String TEXT_861 = ", ";
  protected final String TEXT_862 = "isSetChange";
  protected final String TEXT_863 = "!old";
  protected final String TEXT_864 = "ESet";
  protected final String TEXT_865 = "));";
  protected final String TEXT_866 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_867 = "(this, ";
  protected final String TEXT_868 = ".SET, ";
  protected final String TEXT_869 = ", ";
  protected final String TEXT_870 = "old";
  protected final String TEXT_871 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_872 = " : old";
  protected final String TEXT_873 = "old";
  protected final String TEXT_874 = ", ";
  protected final String TEXT_875 = "new";
  protected final String TEXT_876 = "));";
  protected final String TEXT_877 = NL;
  protected final String TEXT_878 = NL;
  protected final String TEXT_879 = NL + "\t\t";
  protected final String TEXT_880 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_881 = NL + "\t\t\t";
  protected final String TEXT_882 = " ";
  protected final String TEXT_883 = " = ";
  protected final String TEXT_884 = "();";
  protected final String TEXT_885 = NL + "\t\t\tObject ";
  protected final String TEXT_886 = " = eVirtualGet(";
  protected final String TEXT_887 = ");";
  protected final String TEXT_888 = NL + "\t\t\tif (";
  protected final String TEXT_889 = " != null && ";
  protected final String TEXT_890 = " != new";
  protected final String TEXT_891 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_892 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_893 = NL + "\t\t\tif (new";
  protected final String TEXT_894 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_895 = NL + "\t\t\t\t";
  protected final String TEXT_896 = " ";
  protected final String TEXT_897 = " = ";
  protected final String TEXT_898 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_899 = ".contains(new";
  protected final String TEXT_900 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_901 = ".add(new";
  protected final String TEXT_902 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_903 = NL + "\t\t\t\t";
  protected final String TEXT_904 = " ";
  protected final String TEXT_905 = " = ";
  protected final String TEXT_906 = "();";
  protected final String TEXT_907 = NL + "\t\t\t\tObject ";
  protected final String TEXT_908 = " = eVirtualGet(";
  protected final String TEXT_909 = ");";
  protected final String TEXT_910 = NL + "\t\t\t\tif (new";
  protected final String TEXT_911 = " != ";
  protected final String TEXT_912 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_913 = "(new";
  protected final String TEXT_914 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_915 = NL + "\t\t\t}";
  protected final String TEXT_916 = NL + "\t\t}";
  protected final String TEXT_917 = NL + "\t\t((";
  protected final String TEXT_918 = ".Internal)((";
  protected final String TEXT_919 = ".Internal.Wrapper)get";
  protected final String TEXT_920 = "()).featureMap()).set(";
  protected final String TEXT_921 = ", ";
  protected final String TEXT_922 = "new ";
  protected final String TEXT_923 = "(";
  protected final String TEXT_924 = "new";
  protected final String TEXT_925 = ")";
  protected final String TEXT_926 = ");";
  protected final String TEXT_927 = NL + "\t\t((";
  protected final String TEXT_928 = ".Internal)get";
  protected final String TEXT_929 = "()).set(";
  protected final String TEXT_930 = ", ";
  protected final String TEXT_931 = "new ";
  protected final String TEXT_932 = "(";
  protected final String TEXT_933 = "new";
  protected final String TEXT_934 = ")";
  protected final String TEXT_935 = ");";
  protected final String TEXT_936 = NL;
  protected final String TEXT_937 = NL + "\t\t";
  protected final String TEXT_938 = ".";
  protected final String TEXT_939 = "(this, ";
  protected final String TEXT_940 = ");";
  protected final String TEXT_941 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_942 = "' ";
  protected final String TEXT_943 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_944 = NL + "\t}" + NL;
  protected final String TEXT_945 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_946 = " basicUnset";
  protected final String TEXT_947 = "(";
  protected final String TEXT_948 = " msgs)" + NL + "\t{";
  protected final String TEXT_949 = NL + "\t\tObject old";
  protected final String TEXT_950 = " = eVirtualUnset(";
  protected final String TEXT_951 = ");";
  protected final String TEXT_952 = NL + "\t\t";
  protected final String TEXT_953 = " old";
  protected final String TEXT_954 = " = ";
  protected final String TEXT_955 = ";" + NL + "\t\t";
  protected final String TEXT_956 = " = null;";
  protected final String TEXT_957 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_958 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_959 = NL + "\t\tboolean old";
  protected final String TEXT_960 = "ESet = (";
  protected final String TEXT_961 = " & ";
  protected final String TEXT_962 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_963 = " &= ~";
  protected final String TEXT_964 = "_ESETFLAG;";
  protected final String TEXT_965 = NL + "\t\tboolean old";
  protected final String TEXT_966 = "ESet = ";
  protected final String TEXT_967 = "ESet;" + NL + "\t\t";
  protected final String TEXT_968 = "ESet = false;";
  protected final String TEXT_969 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_970 = " notification = new ";
  protected final String TEXT_971 = "(this, ";
  protected final String TEXT_972 = ".UNSET, ";
  protected final String TEXT_973 = ", ";
  protected final String TEXT_974 = "isSetChange ? old";
  protected final String TEXT_975 = " : null";
  protected final String TEXT_976 = "old";
  protected final String TEXT_977 = ", null, ";
  protected final String TEXT_978 = "isSetChange";
  protected final String TEXT_979 = "old";
  protected final String TEXT_980 = "ESet";
  protected final String TEXT_981 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_982 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_983 = "' ";
  protected final String TEXT_984 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_985 = NL + "\t}" + NL;
  protected final String TEXT_986 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_987 = "#";
  protected final String TEXT_988 = " <em>";
  protected final String TEXT_989 = "</em>}' ";
  protected final String TEXT_990 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_991 = NL + "\t * @see #isSet";
  protected final String TEXT_992 = "()";
  protected final String TEXT_993 = NL + "\t * @see #";
  protected final String TEXT_994 = "()";
  protected final String TEXT_995 = NL + "\t * @see #set";
  protected final String TEXT_996 = "(";
  protected final String TEXT_997 = ")";
  protected final String TEXT_998 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_999 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1000 = NL + "\tvoid unset";
  protected final String TEXT_1001 = "();" + NL;
  protected final String TEXT_1002 = NL + "\tpublic void unset";
  protected final String TEXT_1003 = "()" + NL + "\t{";
  protected final String TEXT_1004 = NL + "\t\teUnset(";
  protected final String TEXT_1005 = ");";
  protected final String TEXT_1006 = NL + "\t\t";
  protected final String TEXT_1007 = " ";
  protected final String TEXT_1008 = " = (";
  protected final String TEXT_1009 = ")eVirtualGet(";
  protected final String TEXT_1010 = ");";
  protected final String TEXT_1011 = NL + "\t\tif (";
  protected final String TEXT_1012 = " != null) ((";
  protected final String TEXT_1013 = ".Unsettable";
  protected final String TEXT_1014 = ")";
  protected final String TEXT_1015 = ").unset();";
  protected final String TEXT_1016 = NL + "\t\t";
  protected final String TEXT_1017 = " ";
  protected final String TEXT_1018 = " = (";
  protected final String TEXT_1019 = ")eVirtualGet(";
  protected final String TEXT_1020 = ");";
  protected final String TEXT_1021 = NL + "\t\tif (";
  protected final String TEXT_1022 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1023 = " msgs = null;";
  protected final String TEXT_1024 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1025 = ")";
  protected final String TEXT_1026 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1027 = ", null, msgs);";
  protected final String TEXT_1028 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1029 = ")";
  protected final String TEXT_1030 = ").eInverseRemove(this, ";
  protected final String TEXT_1031 = ", ";
  protected final String TEXT_1032 = ".class, msgs);";
  protected final String TEXT_1033 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1034 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1035 = NL + "\t\t\tboolean old";
  protected final String TEXT_1036 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1037 = ");";
  protected final String TEXT_1038 = NL + "\t\t\tboolean old";
  protected final String TEXT_1039 = "ESet = (";
  protected final String TEXT_1040 = " & ";
  protected final String TEXT_1041 = "_ESETFLAG) != 0;";
  protected final String TEXT_1042 = NL + "\t\t\t";
  protected final String TEXT_1043 = " &= ~";
  protected final String TEXT_1044 = "_ESETFLAG;";
  protected final String TEXT_1045 = NL + "\t\t\tboolean old";
  protected final String TEXT_1046 = "ESet = ";
  protected final String TEXT_1047 = "ESet;";
  protected final String TEXT_1048 = NL + "\t\t\t";
  protected final String TEXT_1049 = "ESet = false;";
  protected final String TEXT_1050 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1051 = "(this, ";
  protected final String TEXT_1052 = ".UNSET, ";
  protected final String TEXT_1053 = ", null, null, old";
  protected final String TEXT_1054 = "ESet));";
  protected final String TEXT_1055 = NL + "\t\t}";
  protected final String TEXT_1056 = NL + "\t\t";
  protected final String TEXT_1057 = " old";
  protected final String TEXT_1058 = " = (";
  protected final String TEXT_1059 = " & ";
  protected final String TEXT_1060 = "_EFLAG) != 0;";
  protected final String TEXT_1061 = NL + "\t\tObject old";
  protected final String TEXT_1062 = " = eVirtualUnset(";
  protected final String TEXT_1063 = ");";
  protected final String TEXT_1064 = NL + "\t\t";
  protected final String TEXT_1065 = " old";
  protected final String TEXT_1066 = " = ";
  protected final String TEXT_1067 = ";";
  protected final String TEXT_1068 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1069 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1070 = NL + "\t\tboolean old";
  protected final String TEXT_1071 = "ESet = (";
  protected final String TEXT_1072 = " & ";
  protected final String TEXT_1073 = "_ESETFLAG) != 0;";
  protected final String TEXT_1074 = NL + "\t\tboolean old";
  protected final String TEXT_1075 = "ESet = ";
  protected final String TEXT_1076 = "ESet;";
  protected final String TEXT_1077 = NL + "\t\t";
  protected final String TEXT_1078 = " = null;";
  protected final String TEXT_1079 = NL + "\t\t";
  protected final String TEXT_1080 = " &= ~";
  protected final String TEXT_1081 = "_ESETFLAG;";
  protected final String TEXT_1082 = NL + "\t\t";
  protected final String TEXT_1083 = "ESet = false;";
  protected final String TEXT_1084 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1085 = "(this, ";
  protected final String TEXT_1086 = ".UNSET, ";
  protected final String TEXT_1087 = ", ";
  protected final String TEXT_1088 = "isSetChange ? old";
  protected final String TEXT_1089 = " : null";
  protected final String TEXT_1090 = "old";
  protected final String TEXT_1091 = ", null, ";
  protected final String TEXT_1092 = "isSetChange";
  protected final String TEXT_1093 = "old";
  protected final String TEXT_1094 = "ESet";
  protected final String TEXT_1095 = "));";
  protected final String TEXT_1096 = NL + "\t\tif (";
  protected final String TEXT_1097 = ") ";
  protected final String TEXT_1098 = " |= ";
  protected final String TEXT_1099 = "_EFLAG; else ";
  protected final String TEXT_1100 = " &= ~";
  protected final String TEXT_1101 = "_EFLAG;";
  protected final String TEXT_1102 = NL + "\t\t";
  protected final String TEXT_1103 = " = ";
  protected final String TEXT_1104 = ";";
  protected final String TEXT_1105 = NL + "\t\t";
  protected final String TEXT_1106 = " &= ~";
  protected final String TEXT_1107 = "_ESETFLAG;";
  protected final String TEXT_1108 = NL + "\t\t";
  protected final String TEXT_1109 = "ESet = false;";
  protected final String TEXT_1110 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1111 = "(this, ";
  protected final String TEXT_1112 = ".UNSET, ";
  protected final String TEXT_1113 = ", ";
  protected final String TEXT_1114 = "isSetChange ? old";
  protected final String TEXT_1115 = " : ";
  protected final String TEXT_1116 = "old";
  protected final String TEXT_1117 = ", ";
  protected final String TEXT_1118 = ", ";
  protected final String TEXT_1119 = "isSetChange";
  protected final String TEXT_1120 = "old";
  protected final String TEXT_1121 = "ESet";
  protected final String TEXT_1122 = "));";
  protected final String TEXT_1123 = NL + "\t\t((";
  protected final String TEXT_1124 = ".Internal)((";
  protected final String TEXT_1125 = ".Internal.Wrapper)get";
  protected final String TEXT_1126 = "()).featureMap()).clear(";
  protected final String TEXT_1127 = ");";
  protected final String TEXT_1128 = NL + "\t\t((";
  protected final String TEXT_1129 = ".Internal)get";
  protected final String TEXT_1130 = "()).clear(";
  protected final String TEXT_1131 = ");";
  protected final String TEXT_1132 = NL;
  protected final String TEXT_1133 = NL + "\t\t";
  protected final String TEXT_1134 = ".";
  protected final String TEXT_1135 = "(this);";
  protected final String TEXT_1136 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1137 = "' ";
  protected final String TEXT_1138 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1139 = NL + "\t}" + NL;
  protected final String TEXT_1140 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1141 = "#";
  protected final String TEXT_1142 = " <em>";
  protected final String TEXT_1143 = "</em>}' ";
  protected final String TEXT_1144 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1145 = "</em>' ";
  protected final String TEXT_1146 = " is set.";
  protected final String TEXT_1147 = NL + "\t * @see #unset";
  protected final String TEXT_1148 = "()";
  protected final String TEXT_1149 = NL + "\t * @see #";
  protected final String TEXT_1150 = "()";
  protected final String TEXT_1151 = NL + "\t * @see #set";
  protected final String TEXT_1152 = "(";
  protected final String TEXT_1153 = ")";
  protected final String TEXT_1154 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1155 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1156 = NL + "\tboolean isSet";
  protected final String TEXT_1157 = "();" + NL;
  protected final String TEXT_1158 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1159 = "()" + NL + "\t{";
  protected final String TEXT_1160 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1161 = ");";
  protected final String TEXT_1162 = NL + "\t\t";
  protected final String TEXT_1163 = " ";
  protected final String TEXT_1164 = " = (";
  protected final String TEXT_1165 = ")eVirtualGet(";
  protected final String TEXT_1166 = ");";
  protected final String TEXT_1167 = NL + "\t\treturn ";
  protected final String TEXT_1168 = " != null && ((";
  protected final String TEXT_1169 = ".Unsettable";
  protected final String TEXT_1170 = ")";
  protected final String TEXT_1171 = ").isSet();";
  protected final String TEXT_1172 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1173 = ");";
  protected final String TEXT_1174 = NL + "\t\treturn (";
  protected final String TEXT_1175 = " & ";
  protected final String TEXT_1176 = "_ESETFLAG) != 0;";
  protected final String TEXT_1177 = NL + "\t\treturn ";
  protected final String TEXT_1178 = "ESet;";
  protected final String TEXT_1179 = NL + "\t\treturn !((";
  protected final String TEXT_1180 = ".Internal)((";
  protected final String TEXT_1181 = ".Internal.Wrapper)get";
  protected final String TEXT_1182 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1183 = ");";
  protected final String TEXT_1184 = NL + "\t\treturn !((";
  protected final String TEXT_1185 = ".Internal)get";
  protected final String TEXT_1186 = "()).isEmpty(";
  protected final String TEXT_1187 = ");";
  protected final String TEXT_1188 = NL;
  protected final String TEXT_1189 = NL + "\t\treturn ";
  protected final String TEXT_1190 = ".";
  protected final String TEXT_1191 = "(this);";
  protected final String TEXT_1192 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1193 = "' ";
  protected final String TEXT_1194 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1195 = NL + "\t}" + NL;
  protected final String TEXT_1196 = NL;
  protected final String TEXT_1197 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1198 = "() <em>";
  protected final String TEXT_1199 = "</em>}' ";
  protected final String TEXT_1200 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1201 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1202 = "_ESUBSETS = ";
  protected final String TEXT_1203 = ";" + NL;
  protected final String TEXT_1204 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1205 = "() <em>";
  protected final String TEXT_1206 = "</em>}' ";
  protected final String TEXT_1207 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1208 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1209 = "_ESUPERSETS = ";
  protected final String TEXT_1210 = ";" + NL;
  protected final String TEXT_1211 = NL + "\t/**";
  protected final String TEXT_1212 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1213 = "}, with the specified ";
  protected final String TEXT_1214 = ", and appends it to the '<em><b>";
  protected final String TEXT_1215 = "</b></em>' ";
  protected final String TEXT_1216 = ".";
  protected final String TEXT_1217 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1218 = "}, with the specified ";
  protected final String TEXT_1219 = ", and sets the '<em><b>";
  protected final String TEXT_1220 = "</b></em>' ";
  protected final String TEXT_1221 = ".";
  protected final String TEXT_1222 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1223 = "} and appends it to the '<em><b>";
  protected final String TEXT_1224 = "</b></em>' ";
  protected final String TEXT_1225 = ".";
  protected final String TEXT_1226 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1227 = "} and sets the '<em><b>";
  protected final String TEXT_1228 = "</b></em>' ";
  protected final String TEXT_1229 = ".";
  protected final String TEXT_1230 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1231 = NL + "\t * @param ";
  protected final String TEXT_1232 = " The ";
  protected final String TEXT_1233 = " for the new {@link ";
  protected final String TEXT_1234 = "}, or <code>null</code>.";
  protected final String TEXT_1235 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1236 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1237 = "}." + NL + "\t * @see #";
  protected final String TEXT_1238 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1239 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1240 = NL + "\t";
  protected final String TEXT_1241 = " create";
  protected final String TEXT_1242 = "(";
  protected final String TEXT_1243 = ", ";
  protected final String TEXT_1244 = " eClass);" + NL;
  protected final String TEXT_1245 = NL + "\tpublic ";
  protected final String TEXT_1246 = " create";
  protected final String TEXT_1247 = "(";
  protected final String TEXT_1248 = ", ";
  protected final String TEXT_1249 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1250 = " new";
  protected final String TEXT_1251 = " = (";
  protected final String TEXT_1252 = ") create(eClass);";
  protected final String TEXT_1253 = NL + "\t\t";
  protected final String TEXT_1254 = "().add(new";
  protected final String TEXT_1255 = ");";
  protected final String TEXT_1256 = NL + "\t\tset";
  protected final String TEXT_1257 = "(new";
  protected final String TEXT_1258 = ");";
  protected final String TEXT_1259 = NL + "\t\tint ";
  protected final String TEXT_1260 = "ListSize = 0;";
  protected final String TEXT_1261 = NL + "\t\tint ";
  protected final String TEXT_1262 = "Size = ";
  protected final String TEXT_1263 = " == null ? 0 : ";
  protected final String TEXT_1264 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1265 = "Size > ";
  protected final String TEXT_1266 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1267 = "ListSize = ";
  protected final String TEXT_1268 = "Size;";
  protected final String TEXT_1269 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1270 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1271 = ".create";
  protected final String TEXT_1272 = "(";
  protected final String TEXT_1273 = ", ";
  protected final String TEXT_1274 = "i < ";
  protected final String TEXT_1275 = "Size ? (";
  protected final String TEXT_1276 = ") ";
  protected final String TEXT_1277 = ".get(i) : null";
  protected final String TEXT_1278 = ");" + NL + "\t\t}";
  protected final String TEXT_1279 = NL + "\t\tnew";
  protected final String TEXT_1280 = ".create";
  protected final String TEXT_1281 = "(";
  protected final String TEXT_1282 = ", ";
  protected final String TEXT_1283 = ");";
  protected final String TEXT_1284 = NL + "\t\tif (";
  protected final String TEXT_1285 = " != null)";
  protected final String TEXT_1286 = NL + "\t\t\tnew";
  protected final String TEXT_1287 = ".";
  protected final String TEXT_1288 = "().addAll(";
  protected final String TEXT_1289 = ");";
  protected final String TEXT_1290 = NL + "\t\t\tnew";
  protected final String TEXT_1291 = ".set";
  protected final String TEXT_1292 = "(";
  protected final String TEXT_1293 = ");";
  protected final String TEXT_1294 = NL + "\t\treturn new";
  protected final String TEXT_1295 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1296 = NL + "\t/**";
  protected final String TEXT_1297 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1298 = "}, with the specified ";
  protected final String TEXT_1299 = ", and appends it to the '<em><b>";
  protected final String TEXT_1300 = "</b></em>' ";
  protected final String TEXT_1301 = ".";
  protected final String TEXT_1302 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1303 = "},with the specified ";
  protected final String TEXT_1304 = ", and sets the '<em><b>";
  protected final String TEXT_1305 = "</b></em>' ";
  protected final String TEXT_1306 = ".";
  protected final String TEXT_1307 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1308 = "} and appends it to the '<em><b>";
  protected final String TEXT_1309 = "</b></em>' ";
  protected final String TEXT_1310 = ".";
  protected final String TEXT_1311 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1312 = "} and sets the '<em><b>";
  protected final String TEXT_1313 = "</b></em>' ";
  protected final String TEXT_1314 = ".";
  protected final String TEXT_1315 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1316 = NL + "\t * @param ";
  protected final String TEXT_1317 = " The ";
  protected final String TEXT_1318 = " for the new {@link ";
  protected final String TEXT_1319 = "}, or <code>null</code>.";
  protected final String TEXT_1320 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1321 = "}." + NL + "\t * @see #";
  protected final String TEXT_1322 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1323 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1324 = NL + "\t";
  protected final String TEXT_1325 = " create";
  protected final String TEXT_1326 = "(";
  protected final String TEXT_1327 = ");" + NL;
  protected final String TEXT_1328 = NL + "\tpublic ";
  protected final String TEXT_1329 = " create";
  protected final String TEXT_1330 = "(";
  protected final String TEXT_1331 = ")" + NL + "\t{";
  protected final String TEXT_1332 = NL + "\t\treturn create";
  protected final String TEXT_1333 = "(";
  protected final String TEXT_1334 = ", ";
  protected final String TEXT_1335 = ");";
  protected final String TEXT_1336 = NL + "\t\t";
  protected final String TEXT_1337 = " new";
  protected final String TEXT_1338 = " = (";
  protected final String TEXT_1339 = ") create(";
  protected final String TEXT_1340 = ");";
  protected final String TEXT_1341 = NL + "\t\t";
  protected final String TEXT_1342 = "().add(new";
  protected final String TEXT_1343 = ");";
  protected final String TEXT_1344 = NL + "\t\tset";
  protected final String TEXT_1345 = "(new";
  protected final String TEXT_1346 = ");";
  protected final String TEXT_1347 = NL + "\t\tint ";
  protected final String TEXT_1348 = "ListSize = 0;";
  protected final String TEXT_1349 = NL + "\t\tint ";
  protected final String TEXT_1350 = "Size = ";
  protected final String TEXT_1351 = " == null ? 0 : ";
  protected final String TEXT_1352 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1353 = "Size > ";
  protected final String TEXT_1354 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1355 = "ListSize = ";
  protected final String TEXT_1356 = "Size;";
  protected final String TEXT_1357 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1358 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1359 = ".create";
  protected final String TEXT_1360 = "(";
  protected final String TEXT_1361 = ", ";
  protected final String TEXT_1362 = "i < ";
  protected final String TEXT_1363 = "Size ? (";
  protected final String TEXT_1364 = ") ";
  protected final String TEXT_1365 = ".get(i) : null";
  protected final String TEXT_1366 = ");" + NL + "\t\t}";
  protected final String TEXT_1367 = NL + "\t\tnew";
  protected final String TEXT_1368 = ".create";
  protected final String TEXT_1369 = "(";
  protected final String TEXT_1370 = ", ";
  protected final String TEXT_1371 = ");";
  protected final String TEXT_1372 = NL + "\t\tif (";
  protected final String TEXT_1373 = " != null)";
  protected final String TEXT_1374 = NL + "\t\t\tnew";
  protected final String TEXT_1375 = ".";
  protected final String TEXT_1376 = "().addAll(";
  protected final String TEXT_1377 = ");";
  protected final String TEXT_1378 = NL + "\t\t\tnew";
  protected final String TEXT_1379 = ".set";
  protected final String TEXT_1380 = "(";
  protected final String TEXT_1381 = ");";
  protected final String TEXT_1382 = NL + "\t\treturn new";
  protected final String TEXT_1383 = ";";
  protected final String TEXT_1384 = NL + "\t}" + NL;
  protected final String TEXT_1385 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1386 = "} with the specified ";
  protected final String TEXT_1387 = " from the '<em><b>";
  protected final String TEXT_1388 = "</b></em>' ";
  protected final String TEXT_1389 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1390 = NL + "\t * @param ";
  protected final String TEXT_1391 = " The ";
  protected final String TEXT_1392 = " of the {@link ";
  protected final String TEXT_1393 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1394 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1395 = "} with the specified ";
  protected final String TEXT_1396 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1397 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1398 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1399 = NL + "\t";
  protected final String TEXT_1400 = " get";
  protected final String TEXT_1401 = "(";
  protected final String TEXT_1402 = ");" + NL;
  protected final String TEXT_1403 = NL + "\tpublic ";
  protected final String TEXT_1404 = " get";
  protected final String TEXT_1405 = "(";
  protected final String TEXT_1406 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1407 = "(";
  protected final String TEXT_1408 = ", false";
  protected final String TEXT_1409 = ", null";
  protected final String TEXT_1410 = ", false";
  protected final String TEXT_1411 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1412 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1413 = "} with the specified ";
  protected final String TEXT_1414 = " from the '<em><b>";
  protected final String TEXT_1415 = "</b></em>' ";
  protected final String TEXT_1416 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1417 = NL + "\t * @param ";
  protected final String TEXT_1418 = " The ";
  protected final String TEXT_1419 = " of the {@link ";
  protected final String TEXT_1420 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1421 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1422 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1423 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1424 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1425 = "} on demand if not found.";
  protected final String TEXT_1426 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1427 = "} with the specified ";
  protected final String TEXT_1428 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1429 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1430 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1431 = NL + "\t";
  protected final String TEXT_1432 = " get";
  protected final String TEXT_1433 = "(";
  protected final String TEXT_1434 = ", boolean ignoreCase";
  protected final String TEXT_1435 = ", ";
  protected final String TEXT_1436 = " eClass";
  protected final String TEXT_1437 = ", boolean createOnDemand";
  protected final String TEXT_1438 = ");" + NL;
  protected final String TEXT_1439 = NL + "\tpublic ";
  protected final String TEXT_1440 = " get";
  protected final String TEXT_1441 = "(";
  protected final String TEXT_1442 = ", boolean ignoreCase";
  protected final String TEXT_1443 = ", ";
  protected final String TEXT_1444 = " eClass";
  protected final String TEXT_1445 = ", boolean createOnDemand";
  protected final String TEXT_1446 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1447 = "Loop: for (";
  protected final String TEXT_1448 = " i = ";
  protected final String TEXT_1449 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1450 = " ";
  protected final String TEXT_1451 = " = (";
  protected final String TEXT_1452 = ") i.next();";
  protected final String TEXT_1453 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1454 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1455 = "Loop;";
  protected final String TEXT_1456 = NL + "\t\t\t";
  protected final String TEXT_1457 = " ";
  protected final String TEXT_1458 = "List = ";
  protected final String TEXT_1459 = ".";
  protected final String TEXT_1460 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1461 = "ListSize = ";
  protected final String TEXT_1462 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1463 = " || (";
  protected final String TEXT_1464 = " != null && ";
  protected final String TEXT_1465 = ".size() != ";
  protected final String TEXT_1466 = "ListSize";
  protected final String TEXT_1467 = ")";
  protected final String TEXT_1468 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1469 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1470 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1471 = " ";
  protected final String TEXT_1472 = " = (";
  protected final String TEXT_1473 = ") ";
  protected final String TEXT_1474 = "List.get(j);";
  protected final String TEXT_1475 = NL + "\t\t\t\tif (";
  protected final String TEXT_1476 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_1477 = ")";
  protected final String TEXT_1478 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1479 = ".";
  protected final String TEXT_1480 = "()) : ";
  protected final String TEXT_1481 = ".get(j).equals(";
  protected final String TEXT_1482 = ".";
  protected final String TEXT_1483 = "())))";
  protected final String TEXT_1484 = NL + "\t\t\t\tif (";
  protected final String TEXT_1485 = " != null && !";
  protected final String TEXT_1486 = ".get(j).equals(";
  protected final String TEXT_1487 = ".";
  protected final String TEXT_1488 = "()))";
  protected final String TEXT_1489 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1490 = "Loop;";
  protected final String TEXT_1491 = NL + "\t\t\t}";
  protected final String TEXT_1492 = NL + "\t\t\t";
  protected final String TEXT_1493 = " ";
  protected final String TEXT_1494 = " = ";
  protected final String TEXT_1495 = ".";
  protected final String TEXT_1496 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1497 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1498 = "Loop;";
  protected final String TEXT_1499 = NL + "\t\t\tif (";
  protected final String TEXT_1500 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1501 = ".equalsIgnoreCase(";
  protected final String TEXT_1502 = ".";
  protected final String TEXT_1503 = "()) : ";
  protected final String TEXT_1504 = ".equals(";
  protected final String TEXT_1505 = ".";
  protected final String TEXT_1506 = "())))";
  protected final String TEXT_1507 = NL + "\t\t\tif (";
  protected final String TEXT_1508 = " != null && !";
  protected final String TEXT_1509 = ".equals(";
  protected final String TEXT_1510 = ".";
  protected final String TEXT_1511 = "()))";
  protected final String TEXT_1512 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1513 = "Loop;";
  protected final String TEXT_1514 = NL + "\t\t\tif (";
  protected final String TEXT_1515 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1516 = ".equalsIgnoreCase(";
  protected final String TEXT_1517 = ".";
  protected final String TEXT_1518 = "()) : ";
  protected final String TEXT_1519 = ".equals(";
  protected final String TEXT_1520 = ".";
  protected final String TEXT_1521 = "())))";
  protected final String TEXT_1522 = NL + "\t\t\tif (";
  protected final String TEXT_1523 = " != null && !";
  protected final String TEXT_1524 = ".equals(";
  protected final String TEXT_1525 = ".";
  protected final String TEXT_1526 = "()))";
  protected final String TEXT_1527 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1528 = "Loop;";
  protected final String TEXT_1529 = NL + "\t\t\treturn ";
  protected final String TEXT_1530 = ";" + NL + "\t\t}";
  protected final String TEXT_1531 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1532 = " && eClass != null";
  protected final String TEXT_1533 = " ? create";
  protected final String TEXT_1534 = "(";
  protected final String TEXT_1535 = ", eClass";
  protected final String TEXT_1536 = ") : null;";
  protected final String TEXT_1537 = NL + "\t\treturn null;";
  protected final String TEXT_1538 = NL + "\t}" + NL;
  protected final String TEXT_1539 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1540 = "()" + NL + "\t{";
  protected final String TEXT_1541 = NL + "  \t\treturn false;";
  protected final String TEXT_1542 = NL + "\t\treturn !((";
  protected final String TEXT_1543 = ".Internal.Wrapper)";
  protected final String TEXT_1544 = "()).featureMap().isEmpty();";
  protected final String TEXT_1545 = NL + "\t\treturn ";
  protected final String TEXT_1546 = " != null && !";
  protected final String TEXT_1547 = ".featureMap().isEmpty();";
  protected final String TEXT_1548 = NL + "\t\treturn ";
  protected final String TEXT_1549 = " != null && !";
  protected final String TEXT_1550 = ".isEmpty();";
  protected final String TEXT_1551 = NL + "\t\t";
  protected final String TEXT_1552 = " ";
  protected final String TEXT_1553 = " = (";
  protected final String TEXT_1554 = ")eVirtualGet(";
  protected final String TEXT_1555 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1556 = " != null && !";
  protected final String TEXT_1557 = ".isEmpty();";
  protected final String TEXT_1558 = NL + "\t\treturn !";
  protected final String TEXT_1559 = "().isEmpty();";
  protected final String TEXT_1560 = NL + "\t\treturn ";
  protected final String TEXT_1561 = " != null;";
  protected final String TEXT_1562 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1563 = ") != null;";
  protected final String TEXT_1564 = NL + "\t\treturn basicGet";
  protected final String TEXT_1565 = "() != null;";
  protected final String TEXT_1566 = NL + "\t\treturn ";
  protected final String TEXT_1567 = " != null;";
  protected final String TEXT_1568 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1569 = ") != null;";
  protected final String TEXT_1570 = NL + "\t\treturn ";
  protected final String TEXT_1571 = "() != null;";
  protected final String TEXT_1572 = NL + "\t\treturn ((";
  protected final String TEXT_1573 = " & ";
  protected final String TEXT_1574 = "_EFLAG) != 0) != ";
  protected final String TEXT_1575 = "_EDEFAULT;";
  protected final String TEXT_1576 = NL + "\t\treturn ";
  protected final String TEXT_1577 = " != ";
  protected final String TEXT_1578 = "_EDEFAULT;";
  protected final String TEXT_1579 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1580 = ", ";
  protected final String TEXT_1581 = "_EDEFAULT) != ";
  protected final String TEXT_1582 = "_EDEFAULT;";
  protected final String TEXT_1583 = NL + "\t\treturn ";
  protected final String TEXT_1584 = "() != ";
  protected final String TEXT_1585 = "_EDEFAULT;";
  protected final String TEXT_1586 = NL + "\t\treturn ";
  protected final String TEXT_1587 = "_EDEFAULT == null ? ";
  protected final String TEXT_1588 = " != null : !";
  protected final String TEXT_1589 = "_EDEFAULT.equals(";
  protected final String TEXT_1590 = ");";
  protected final String TEXT_1591 = NL + "\t\t";
  protected final String TEXT_1592 = " ";
  protected final String TEXT_1593 = " = (";
  protected final String TEXT_1594 = ")eVirtualGet(";
  protected final String TEXT_1595 = ", ";
  protected final String TEXT_1596 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1597 = "_EDEFAULT == null ? ";
  protected final String TEXT_1598 = " != null : !";
  protected final String TEXT_1599 = "_EDEFAULT.equals(";
  protected final String TEXT_1600 = ");";
  protected final String TEXT_1601 = NL + "\t\treturn ";
  protected final String TEXT_1602 = "_EDEFAULT == null ? ";
  protected final String TEXT_1603 = "() != null : !";
  protected final String TEXT_1604 = "_EDEFAULT.equals(";
  protected final String TEXT_1605 = "());";
  protected final String TEXT_1606 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1607 = ");";
  protected final String TEXT_1608 = NL + "\t\t";
  protected final String TEXT_1609 = " ";
  protected final String TEXT_1610 = " = (";
  protected final String TEXT_1611 = ")eVirtualGet(";
  protected final String TEXT_1612 = ");";
  protected final String TEXT_1613 = NL + "\t\treturn ";
  protected final String TEXT_1614 = " != null && ((";
  protected final String TEXT_1615 = ".Unsettable)";
  protected final String TEXT_1616 = ").isSet();";
  protected final String TEXT_1617 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1618 = ");";
  protected final String TEXT_1619 = NL + "\t\treturn (";
  protected final String TEXT_1620 = " & ";
  protected final String TEXT_1621 = "_ESETFLAG) != 0;";
  protected final String TEXT_1622 = NL + "\t\treturn ";
  protected final String TEXT_1623 = "ESet;";
  protected final String TEXT_1624 = NL + "\t\treturn !((";
  protected final String TEXT_1625 = ".Internal)((";
  protected final String TEXT_1626 = ".Internal.Wrapper)get";
  protected final String TEXT_1627 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1628 = ");";
  protected final String TEXT_1629 = NL + "\t\treturn !((";
  protected final String TEXT_1630 = ".Internal)get";
  protected final String TEXT_1631 = "()).isEmpty(";
  protected final String TEXT_1632 = ");";
  protected final String TEXT_1633 = NL;
  protected final String TEXT_1634 = NL + "\t\treturn ";
  protected final String TEXT_1635 = ".";
  protected final String TEXT_1636 = "(this);";
  protected final String TEXT_1637 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1638 = "' ";
  protected final String TEXT_1639 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1640 = NL + "\t}" + NL;
  protected final String TEXT_1641 = NL;
  protected final String TEXT_1642 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1643 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1644 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1645 = NL + "\t * @model ";
  protected final String TEXT_1646 = NL + "\t *        ";
  protected final String TEXT_1647 = NL + "\t * @model";
  protected final String TEXT_1648 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1649 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1650 = NL + "\t";
  protected final String TEXT_1651 = " ";
  protected final String TEXT_1652 = "(";
  protected final String TEXT_1653 = ")";
  protected final String TEXT_1654 = ";" + NL;
  protected final String TEXT_1655 = NL + "\tpublic ";
  protected final String TEXT_1656 = " ";
  protected final String TEXT_1657 = "(";
  protected final String TEXT_1658 = ")";
  protected final String TEXT_1659 = NL + "\t{";
  protected final String TEXT_1660 = NL + "\t\t";
  protected final String TEXT_1661 = NL + "\t\treturn ";
  protected final String TEXT_1662 = ".";
  protected final String TEXT_1663 = "(this, ";
  protected final String TEXT_1664 = ", ";
  protected final String TEXT_1665 = ");";
  protected final String TEXT_1666 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1667 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1668 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1669 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1670 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1671 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1672 = ".";
  protected final String TEXT_1673 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1674 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1675 = "\", ";
  protected final String TEXT_1676 = ".getObjectLabel(this, ";
  protected final String TEXT_1677 = ") }),";
  protected final String TEXT_1678 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1679 = NL + "\t\t";
  protected final String TEXT_1680 = ".";
  protected final String TEXT_1681 = "(this";
  protected final String TEXT_1682 = ", ";
  protected final String TEXT_1683 = ");";
  protected final String TEXT_1684 = NL + "\t\t";
  protected final String TEXT_1685 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1686 = " result = (";
  protected final String TEXT_1687 = ") cache.get(";
  protected final String TEXT_1688 = "eResource(), ";
  protected final String TEXT_1689 = "this, ";
  protected final String TEXT_1690 = ".getEOperations().get(";
  protected final String TEXT_1691 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1692 = "eResource(), ";
  protected final String TEXT_1693 = "this, ";
  protected final String TEXT_1694 = ".getEOperations().get(";
  protected final String TEXT_1695 = "), result = ";
  protected final String TEXT_1696 = "new ";
  protected final String TEXT_1697 = "(";
  protected final String TEXT_1698 = ".";
  protected final String TEXT_1699 = "(this";
  protected final String TEXT_1700 = ", ";
  protected final String TEXT_1701 = ")";
  protected final String TEXT_1702 = ")";
  protected final String TEXT_1703 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1704 = ".";
  protected final String TEXT_1705 = "()";
  protected final String TEXT_1706 = ";" + NL + "\t\t}";
  protected final String TEXT_1707 = NL + "\t\treturn ";
  protected final String TEXT_1708 = ".";
  protected final String TEXT_1709 = "(this";
  protected final String TEXT_1710 = ", ";
  protected final String TEXT_1711 = ");";
  protected final String TEXT_1712 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1713 = NL + "\t}" + NL;
  protected final String TEXT_1714 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1715 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1716 = NL + "\t@Override";
  protected final String TEXT_1717 = NL + "\tpublic ";
  protected final String TEXT_1718 = " eInverseAdd(";
  protected final String TEXT_1719 = " otherEnd, int featureID, ";
  protected final String TEXT_1720 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1721 = NL + "\t\t\tcase ";
  protected final String TEXT_1722 = ":";
  protected final String TEXT_1723 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1724 = "(";
  protected final String TEXT_1725 = ".InternalMapView";
  protected final String TEXT_1726 = ")";
  protected final String TEXT_1727 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1728 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1729 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1730 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1731 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1732 = "((";
  protected final String TEXT_1733 = ")otherEnd, msgs);";
  protected final String TEXT_1734 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1735 = ", msgs);";
  protected final String TEXT_1736 = NL + "\t\t\t\t";
  protected final String TEXT_1737 = " ";
  protected final String TEXT_1738 = " = (";
  protected final String TEXT_1739 = ")eVirtualGet(";
  protected final String TEXT_1740 = ");";
  protected final String TEXT_1741 = NL + "\t\t\t\tif (";
  protected final String TEXT_1742 = " != null)";
  protected final String TEXT_1743 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1744 = ")";
  protected final String TEXT_1745 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1746 = ", null, msgs);";
  protected final String TEXT_1747 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1748 = ")";
  protected final String TEXT_1749 = ").eInverseRemove(this, ";
  protected final String TEXT_1750 = ", ";
  protected final String TEXT_1751 = ".class, msgs);";
  protected final String TEXT_1752 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1753 = "((";
  protected final String TEXT_1754 = ")otherEnd, msgs);";
  protected final String TEXT_1755 = NL + "\t\t}";
  protected final String TEXT_1756 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1757 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1758 = NL + "\t}" + NL;
  protected final String TEXT_1759 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1760 = NL + "\t@Override";
  protected final String TEXT_1761 = NL + "\tpublic ";
  protected final String TEXT_1762 = " eInverseRemove(";
  protected final String TEXT_1763 = " otherEnd, int featureID, ";
  protected final String TEXT_1764 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1765 = NL + "\t\t\tcase ";
  protected final String TEXT_1766 = ":";
  protected final String TEXT_1767 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1768 = ")((";
  protected final String TEXT_1769 = ".InternalMapView)";
  protected final String TEXT_1770 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1771 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1772 = ")((";
  protected final String TEXT_1773 = ".Internal.Wrapper)";
  protected final String TEXT_1774 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1775 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1776 = ")";
  protected final String TEXT_1777 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1778 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1779 = ", msgs);";
  protected final String TEXT_1780 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1781 = "(msgs);";
  protected final String TEXT_1782 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1783 = "(null, msgs);";
  protected final String TEXT_1784 = NL + "\t\t}";
  protected final String TEXT_1785 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1786 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1787 = NL + "\t}" + NL;
  protected final String TEXT_1788 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1789 = NL + "\t@Override";
  protected final String TEXT_1790 = NL + "\tpublic ";
  protected final String TEXT_1791 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1792 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1793 = NL + "\t\t\tcase ";
  protected final String TEXT_1794 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1795 = ", ";
  protected final String TEXT_1796 = ".class, msgs);";
  protected final String TEXT_1797 = NL + "\t\t}";
  protected final String TEXT_1798 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1799 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1800 = NL + "\t}" + NL;
  protected final String TEXT_1801 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1802 = NL + "\t@Override";
  protected final String TEXT_1803 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1804 = NL + "\t\t\tcase ";
  protected final String TEXT_1805 = ":";
  protected final String TEXT_1806 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1807 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1808 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1809 = "(";
  protected final String TEXT_1810 = "());";
  protected final String TEXT_1811 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1812 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1813 = "();";
  protected final String TEXT_1814 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1815 = ".InternalMapView)";
  protected final String TEXT_1816 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1817 = "();";
  protected final String TEXT_1818 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1819 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1820 = "().map();";
  protected final String TEXT_1821 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1822 = ".Internal.Wrapper)";
  protected final String TEXT_1823 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1824 = "();";
  protected final String TEXT_1825 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1826 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1827 = ".Internal)";
  protected final String TEXT_1828 = "()).getWrapper();";
  protected final String TEXT_1829 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1830 = "();";
  protected final String TEXT_1831 = NL + "\t\t}";
  protected final String TEXT_1832 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1833 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1834 = NL + "\t}" + NL;
  protected final String TEXT_1835 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1836 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1837 = NL + "\t@Override";
  protected final String TEXT_1838 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1839 = NL + "\t\t\tcase ";
  protected final String TEXT_1840 = ":";
  protected final String TEXT_1841 = NL + "\t\t\t\t((";
  protected final String TEXT_1842 = ".Internal)((";
  protected final String TEXT_1843 = ".Internal.Wrapper)";
  protected final String TEXT_1844 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1845 = NL + "\t\t\t\t((";
  protected final String TEXT_1846 = ".Internal)";
  protected final String TEXT_1847 = "()).set(newValue);";
  protected final String TEXT_1848 = NL + "\t\t\t\t((";
  protected final String TEXT_1849 = ".Setting)((";
  protected final String TEXT_1850 = ".InternalMapView)";
  protected final String TEXT_1851 = "()).eMap()).set(newValue);";
  protected final String TEXT_1852 = NL + "\t\t\t\t((";
  protected final String TEXT_1853 = ".Setting)";
  protected final String TEXT_1854 = "()).set(newValue);";
  protected final String TEXT_1855 = NL + "\t\t\t\t";
  protected final String TEXT_1856 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1857 = "().addAll((";
  protected final String TEXT_1858 = "<? extends ";
  protected final String TEXT_1859 = ">";
  protected final String TEXT_1860 = ")newValue);";
  protected final String TEXT_1861 = NL + "\t\t\t\tset";
  protected final String TEXT_1862 = "(((";
  protected final String TEXT_1863 = ")newValue).";
  protected final String TEXT_1864 = "());";
  protected final String TEXT_1865 = NL + "\t\t\t\tset";
  protected final String TEXT_1866 = "(";
  protected final String TEXT_1867 = "(";
  protected final String TEXT_1868 = ")";
  protected final String TEXT_1869 = "newValue);";
  protected final String TEXT_1870 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1871 = NL + "\t\t}";
  protected final String TEXT_1872 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1873 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1874 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1875 = NL + "\t@Override";
  protected final String TEXT_1876 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1877 = NL + "\t\t\tcase ";
  protected final String TEXT_1878 = ":";
  protected final String TEXT_1879 = NL + "\t\t\t\t((";
  protected final String TEXT_1880 = ".Internal.Wrapper)";
  protected final String TEXT_1881 = "()).featureMap().clear();";
  protected final String TEXT_1882 = NL + "\t\t\t\t";
  protected final String TEXT_1883 = "().clear();";
  protected final String TEXT_1884 = NL + "\t\t\t\tunset";
  protected final String TEXT_1885 = "();";
  protected final String TEXT_1886 = NL + "\t\t\t\tset";
  protected final String TEXT_1887 = "((";
  protected final String TEXT_1888 = ")null);";
  protected final String TEXT_1889 = NL + "\t\t\t\tset";
  protected final String TEXT_1890 = "(";
  protected final String TEXT_1891 = ");";
  protected final String TEXT_1892 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1893 = NL + "\t\t}";
  protected final String TEXT_1894 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1895 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1896 = NL + "\t}" + NL;
  protected final String TEXT_1897 = NL;
  protected final String TEXT_1898 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1899 = NL + "\t\t\tcase ";
  protected final String TEXT_1900 = ":";
  protected final String TEXT_1901 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1902 = "();";
  protected final String TEXT_1903 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1904 = ".Internal.Wrapper)";
  protected final String TEXT_1905 = "()).featureMap().isEmpty();";
  protected final String TEXT_1906 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1907 = " != null && !";
  protected final String TEXT_1908 = ".featureMap().isEmpty();";
  protected final String TEXT_1909 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1910 = " != null && !";
  protected final String TEXT_1911 = ".isEmpty();";
  protected final String TEXT_1912 = NL + "\t\t\t\t";
  protected final String TEXT_1913 = " ";
  protected final String TEXT_1914 = " = (";
  protected final String TEXT_1915 = ")eVirtualGet(";
  protected final String TEXT_1916 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1917 = " != null && !";
  protected final String TEXT_1918 = ".isEmpty();";
  protected final String TEXT_1919 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1920 = "().isEmpty();";
  protected final String TEXT_1921 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1922 = "();";
  protected final String TEXT_1923 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1924 = " != null;";
  protected final String TEXT_1925 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1926 = ") != null;";
  protected final String TEXT_1927 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1928 = "() != null;";
  protected final String TEXT_1929 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1930 = " != null;";
  protected final String TEXT_1931 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1932 = ") != null;";
  protected final String TEXT_1933 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1934 = "() != null;";
  protected final String TEXT_1935 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1936 = " & ";
  protected final String TEXT_1937 = "_EFLAG) != 0) != ";
  protected final String TEXT_1938 = "_EDEFAULT;";
  protected final String TEXT_1939 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1940 = " != ";
  protected final String TEXT_1941 = "_EDEFAULT;";
  protected final String TEXT_1942 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1943 = ", ";
  protected final String TEXT_1944 = "_EDEFAULT) != ";
  protected final String TEXT_1945 = "_EDEFAULT;";
  protected final String TEXT_1946 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1947 = "() != ";
  protected final String TEXT_1948 = "_EDEFAULT;";
  protected final String TEXT_1949 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1950 = "_EDEFAULT == null ? ";
  protected final String TEXT_1951 = " != null : !";
  protected final String TEXT_1952 = "_EDEFAULT.equals(";
  protected final String TEXT_1953 = ");";
  protected final String TEXT_1954 = NL + "\t\t\t\t";
  protected final String TEXT_1955 = " ";
  protected final String TEXT_1956 = " = (";
  protected final String TEXT_1957 = ")eVirtualGet(";
  protected final String TEXT_1958 = ", ";
  protected final String TEXT_1959 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1960 = "_EDEFAULT == null ? ";
  protected final String TEXT_1961 = " != null : !";
  protected final String TEXT_1962 = "_EDEFAULT.equals(";
  protected final String TEXT_1963 = ");";
  protected final String TEXT_1964 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1965 = "_EDEFAULT == null ? ";
  protected final String TEXT_1966 = "() != null : !";
  protected final String TEXT_1967 = "_EDEFAULT.equals(";
  protected final String TEXT_1968 = "());";
  protected final String TEXT_1969 = NL + "\t\t}";
  protected final String TEXT_1970 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1971 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1972 = NL + "\t}" + NL;
  protected final String TEXT_1973 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1974 = NL + "\t@Override";
  protected final String TEXT_1975 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1976 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1977 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1978 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1979 = ": return ";
  protected final String TEXT_1980 = ";";
  protected final String TEXT_1981 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1982 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1983 = NL + "\t@Override";
  protected final String TEXT_1984 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1985 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1986 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1987 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1988 = ": return ";
  protected final String TEXT_1989 = ";";
  protected final String TEXT_1990 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1991 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1992 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1993 = NL + "\t@Override";
  protected final String TEXT_1994 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1995 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1996 = NL + "\t@Override";
  protected final String TEXT_1997 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1998 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1999 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2000 = NL + "\t@Override";
  protected final String TEXT_2001 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2002 = NL + "\t\t\tcase ";
  protected final String TEXT_2003 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2004 = ";";
  protected final String TEXT_2005 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2006 = NL + "\t@Override";
  protected final String TEXT_2007 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2008 = NL + "\t\t\tcase ";
  protected final String TEXT_2009 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2010 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2011 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2013 = NL + "\t@Override";
  protected final String TEXT_2014 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2015 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2016 = ": \");";
  protected final String TEXT_2017 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2018 = ": \");";
  protected final String TEXT_2019 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2020 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2021 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2022 = NL + "\t\tif (";
  protected final String TEXT_2023 = "(";
  protected final String TEXT_2024 = " & ";
  protected final String TEXT_2025 = "_ESETFLAG) != 0";
  protected final String TEXT_2026 = "ESet";
  protected final String TEXT_2027 = ") result.append((";
  protected final String TEXT_2028 = " & ";
  protected final String TEXT_2029 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2030 = NL + "\t\tif (";
  protected final String TEXT_2031 = "(";
  protected final String TEXT_2032 = " & ";
  protected final String TEXT_2033 = "_ESETFLAG) != 0";
  protected final String TEXT_2034 = "ESet";
  protected final String TEXT_2035 = ") result.append(";
  protected final String TEXT_2036 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2037 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2038 = ", ";
  protected final String TEXT_2039 = "));";
  protected final String TEXT_2040 = NL + "\t\tresult.append((";
  protected final String TEXT_2041 = " & ";
  protected final String TEXT_2042 = "_EFLAG) != 0);";
  protected final String TEXT_2043 = NL + "\t\tresult.append(";
  protected final String TEXT_2044 = ");";
  protected final String TEXT_2045 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2046 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2047 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2048 = " getKey()" + NL + "\t{";
  protected final String TEXT_2049 = NL + "\t\treturn new ";
  protected final String TEXT_2050 = "(getTypedKey());";
  protected final String TEXT_2051 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2052 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2053 = " key)" + NL + "\t{";
  protected final String TEXT_2054 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_2055 = ")key);";
  protected final String TEXT_2056 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2057 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2058 = ")key).";
  protected final String TEXT_2059 = "());";
  protected final String TEXT_2060 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2061 = ")key);";
  protected final String TEXT_2062 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2063 = " getValue()" + NL + "\t{";
  protected final String TEXT_2064 = NL + "\t\treturn new ";
  protected final String TEXT_2065 = "(getTypedValue());";
  protected final String TEXT_2066 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2067 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2068 = " setValue(";
  protected final String TEXT_2069 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2070 = " oldValue = getValue();";
  protected final String TEXT_2071 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_2072 = ")value);";
  protected final String TEXT_2073 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2074 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2075 = ")value).";
  protected final String TEXT_2076 = "());";
  protected final String TEXT_2077 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2078 = ")value);";
  protected final String TEXT_2079 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2080 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2081 = NL + "\tpublic ";
  protected final String TEXT_2082 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2083 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2084 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2085 = NL;
  protected final String TEXT_2086 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2087 = " create(";
  protected final String TEXT_2088 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2089 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2090 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2091 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2092 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2093 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2094 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2095 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2096 = " ";
  protected final String TEXT_2097 = "Helper(";
  protected final String TEXT_2098 = " ";
  protected final String TEXT_2099 = ")" + NL + "\t{";
  protected final String TEXT_2100 = NL + "\t\t";
  protected final String TEXT_2101 = ".addAll(super.";
  protected final String TEXT_2102 = "());";
  protected final String TEXT_2103 = NL + "\t\tsuper.";
  protected final String TEXT_2104 = "Helper(";
  protected final String TEXT_2105 = ");";
  protected final String TEXT_2106 = NL + "\t\tif (isSet";
  protected final String TEXT_2107 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2108 = " i = ((";
  protected final String TEXT_2109 = ") ";
  protected final String TEXT_2110 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2111 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2112 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2113 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2114 = " i = ((";
  protected final String TEXT_2115 = ") ";
  protected final String TEXT_2116 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2117 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2118 = NL + "\t\t";
  protected final String TEXT_2119 = " ";
  protected final String TEXT_2120 = " = ";
  protected final String TEXT_2121 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2122 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2123 = " i = ((";
  protected final String TEXT_2124 = ") ";
  protected final String TEXT_2125 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2126 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2127 = NL + "\t\tif (isSet";
  protected final String TEXT_2128 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2129 = ".addAll(";
  protected final String TEXT_2130 = "());" + NL + "\t\t}";
  protected final String TEXT_2131 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2132 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2133 = ".addAll(";
  protected final String TEXT_2134 = "());" + NL + "\t\t}";
  protected final String TEXT_2135 = NL + "\t\t";
  protected final String TEXT_2136 = " ";
  protected final String TEXT_2137 = " = ";
  protected final String TEXT_2138 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2139 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2140 = ".addAll(";
  protected final String TEXT_2141 = ");" + NL + "\t\t}";
  protected final String TEXT_2142 = NL + "\t\tif (isSet";
  protected final String TEXT_2143 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2144 = ".add(";
  protected final String TEXT_2145 = "basicGet";
  protected final String TEXT_2146 = "());" + NL + "\t\t}";
  protected final String TEXT_2147 = NL + "\t\t";
  protected final String TEXT_2148 = " ";
  protected final String TEXT_2149 = " = ";
  protected final String TEXT_2150 = "basicGet";
  protected final String TEXT_2151 = "();" + NL + "\t\tif (";
  protected final String TEXT_2152 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2153 = ".add(";
  protected final String TEXT_2154 = ");" + NL + "\t\t}";
  protected final String TEXT_2155 = NL + "\t\treturn ";
  protected final String TEXT_2156 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2157 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2158 = "()" + NL + "\t{";
  protected final String TEXT_2159 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2160 = "()";
  protected final String TEXT_2161 = NL + "\t\treturn isSet";
  protected final String TEXT_2162 = "()";
  protected final String TEXT_2163 = ";";
  protected final String TEXT_2164 = NL + "\t\treturn !";
  protected final String TEXT_2165 = "().isEmpty()";
  protected final String TEXT_2166 = ";";
  protected final String TEXT_2167 = NL + "\t\treturn ";
  protected final String TEXT_2168 = "basicGet";
  protected final String TEXT_2169 = "() != null";
  protected final String TEXT_2170 = ";";
  protected final String TEXT_2171 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2172 = ")";
  protected final String TEXT_2173 = ";";
  protected final String TEXT_2174 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2175 = "()";
  protected final String TEXT_2176 = ";";
  protected final String TEXT_2177 = NL + "\t\t\t|| !";
  protected final String TEXT_2178 = "().isEmpty()";
  protected final String TEXT_2179 = ";";
  protected final String TEXT_2180 = NL + "\t\t\t|| ";
  protected final String TEXT_2181 = "basicGet";
  protected final String TEXT_2182 = "() != null";
  protected final String TEXT_2183 = ";";
  protected final String TEXT_2184 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2185 = ")";
  protected final String TEXT_2186 = ";";
  protected final String TEXT_2187 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2188 = "();";
  protected final String TEXT_2189 = NL + "\t\treturn false;";
  protected final String TEXT_2190 = NL + "\t}" + NL;
  protected final String TEXT_2191 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2192 = " ";
  protected final String TEXT_2193 = "()" + NL + "\t{";
  protected final String TEXT_2194 = NL + "\t\treturn ";
  protected final String TEXT_2195 = "();";
  protected final String TEXT_2196 = NL + "\t\treturn new ";
  protected final String TEXT_2197 = ".UnmodifiableEList(this, ";
  protected final String TEXT_2198 = "null";
  protected final String TEXT_2199 = ", 0, ";
  protected final String TEXT_2200 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2201 = NL + "\t\treturn null;";
  protected final String TEXT_2202 = NL + "\t\treturn ";
  protected final String TEXT_2203 = "();";
  protected final String TEXT_2204 = NL + "\t}" + NL;
  protected final String TEXT_2205 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2206 = " basicGet";
  protected final String TEXT_2207 = "()" + NL + "\t{";
  protected final String TEXT_2208 = NL + "\t\treturn null;";
  protected final String TEXT_2209 = NL + "\t\treturn ";
  protected final String TEXT_2210 = "basicGet";
  protected final String TEXT_2211 = "();";
  protected final String TEXT_2212 = NL + "\t}" + NL;
  protected final String TEXT_2213 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2214 = " basicSet";
  protected final String TEXT_2215 = "(";
  protected final String TEXT_2216 = " new";
  protected final String TEXT_2217 = ", ";
  protected final String TEXT_2218 = " msgs)" + NL + "\t{";
  protected final String TEXT_2219 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2220 = NL + "\t\tif (new";
  protected final String TEXT_2221 = " != null && !(new";
  protected final String TEXT_2222 = " instanceof ";
  protected final String TEXT_2223 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2224 = "));" + NL + "\t\t}";
  protected final String TEXT_2225 = NL + "\t\treturn basicSet";
  protected final String TEXT_2226 = "(";
  protected final String TEXT_2227 = "(";
  protected final String TEXT_2228 = ") ";
  protected final String TEXT_2229 = "new";
  protected final String TEXT_2230 = ", msgs);";
  protected final String TEXT_2231 = NL + "\t\tset";
  protected final String TEXT_2232 = "(";
  protected final String TEXT_2233 = "(";
  protected final String TEXT_2234 = ") ";
  protected final String TEXT_2235 = "new";
  protected final String TEXT_2236 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2237 = NL + "\t}" + NL;
  protected final String TEXT_2238 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_2239 = "(";
  protected final String TEXT_2240 = " new";
  protected final String TEXT_2241 = ")" + NL + "\t{";
  protected final String TEXT_2242 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2243 = NL + "\t\tif (new";
  protected final String TEXT_2244 = " != null && !(new";
  protected final String TEXT_2245 = " instanceof ";
  protected final String TEXT_2246 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2247 = "));" + NL + "\t\t}";
  protected final String TEXT_2248 = NL + "\t\tset";
  protected final String TEXT_2249 = "(";
  protected final String TEXT_2250 = "(";
  protected final String TEXT_2251 = ") ";
  protected final String TEXT_2252 = "new";
  protected final String TEXT_2253 = ");";
  protected final String TEXT_2254 = NL + "\t}" + NL;
  protected final String TEXT_2255 = NL;
  protected final String TEXT_2256 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2257 = "() <em>";
  protected final String TEXT_2258 = "</em>}' ";
  protected final String TEXT_2259 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2260 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2261 = "_ESUBSETS = ";
  protected final String TEXT_2262 = ";" + NL;
  protected final String TEXT_2263 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2264 = "() <em>";
  protected final String TEXT_2265 = "</em>}' ";
  protected final String TEXT_2266 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2267 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2268 = "_ESUPERSETS = ";
  protected final String TEXT_2269 = ";" + NL;
  protected final String TEXT_2270 = NL + "\t/**";
  protected final String TEXT_2271 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2272 = "}, with the specified ";
  protected final String TEXT_2273 = ", and appends it to the '<em><b>";
  protected final String TEXT_2274 = "</b></em>' ";
  protected final String TEXT_2275 = ".";
  protected final String TEXT_2276 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2277 = "}, with the specified ";
  protected final String TEXT_2278 = ", and sets the '<em><b>";
  protected final String TEXT_2279 = "</b></em>' ";
  protected final String TEXT_2280 = ".";
  protected final String TEXT_2281 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2282 = "} and appends it to the '<em><b>";
  protected final String TEXT_2283 = "</b></em>' ";
  protected final String TEXT_2284 = ".";
  protected final String TEXT_2285 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2286 = "} and sets the '<em><b>";
  protected final String TEXT_2287 = "</b></em>' ";
  protected final String TEXT_2288 = ".";
  protected final String TEXT_2289 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2290 = NL + "\t * @param ";
  protected final String TEXT_2291 = " The ";
  protected final String TEXT_2292 = " for the new {@link ";
  protected final String TEXT_2293 = "}, or <code>null</code>.";
  protected final String TEXT_2294 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2295 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2296 = "}." + NL + "\t * @see #";
  protected final String TEXT_2297 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2298 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2299 = NL + "\t";
  protected final String TEXT_2300 = " create";
  protected final String TEXT_2301 = "(";
  protected final String TEXT_2302 = ", ";
  protected final String TEXT_2303 = " eClass);" + NL;
  protected final String TEXT_2304 = NL + "\tpublic ";
  protected final String TEXT_2305 = " create";
  protected final String TEXT_2306 = "(";
  protected final String TEXT_2307 = ", ";
  protected final String TEXT_2308 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2309 = " new";
  protected final String TEXT_2310 = " = (";
  protected final String TEXT_2311 = ") create(eClass);";
  protected final String TEXT_2312 = NL + "\t\t";
  protected final String TEXT_2313 = "().add(new";
  protected final String TEXT_2314 = ");";
  protected final String TEXT_2315 = NL + "\t\tset";
  protected final String TEXT_2316 = "(new";
  protected final String TEXT_2317 = ");";
  protected final String TEXT_2318 = NL + "\t\tint ";
  protected final String TEXT_2319 = "ListSize = 0;";
  protected final String TEXT_2320 = NL + "\t\tint ";
  protected final String TEXT_2321 = "Size = ";
  protected final String TEXT_2322 = " == null ? 0 : ";
  protected final String TEXT_2323 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2324 = "Size > ";
  protected final String TEXT_2325 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2326 = "ListSize = ";
  protected final String TEXT_2327 = "Size;";
  protected final String TEXT_2328 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2329 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2330 = ".create";
  protected final String TEXT_2331 = "(";
  protected final String TEXT_2332 = ", ";
  protected final String TEXT_2333 = "i < ";
  protected final String TEXT_2334 = "Size ? (";
  protected final String TEXT_2335 = ") ";
  protected final String TEXT_2336 = ".get(i) : null";
  protected final String TEXT_2337 = ");" + NL + "\t\t}";
  protected final String TEXT_2338 = NL + "\t\tnew";
  protected final String TEXT_2339 = ".create";
  protected final String TEXT_2340 = "(";
  protected final String TEXT_2341 = ", ";
  protected final String TEXT_2342 = ");";
  protected final String TEXT_2343 = NL + "\t\tif (";
  protected final String TEXT_2344 = " != null)";
  protected final String TEXT_2345 = NL + "\t\t\tnew";
  protected final String TEXT_2346 = ".";
  protected final String TEXT_2347 = "().addAll(";
  protected final String TEXT_2348 = ");";
  protected final String TEXT_2349 = NL + "\t\t\tnew";
  protected final String TEXT_2350 = ".set";
  protected final String TEXT_2351 = "(";
  protected final String TEXT_2352 = ");";
  protected final String TEXT_2353 = NL + "\t\treturn new";
  protected final String TEXT_2354 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2355 = NL + "\t/**";
  protected final String TEXT_2356 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2357 = "}, with the specified ";
  protected final String TEXT_2358 = ", and appends it to the '<em><b>";
  protected final String TEXT_2359 = "</b></em>' ";
  protected final String TEXT_2360 = ".";
  protected final String TEXT_2361 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2362 = "},with the specified ";
  protected final String TEXT_2363 = ", and sets the '<em><b>";
  protected final String TEXT_2364 = "</b></em>' ";
  protected final String TEXT_2365 = ".";
  protected final String TEXT_2366 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2367 = "} and appends it to the '<em><b>";
  protected final String TEXT_2368 = "</b></em>' ";
  protected final String TEXT_2369 = ".";
  protected final String TEXT_2370 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2371 = "} and sets the '<em><b>";
  protected final String TEXT_2372 = "</b></em>' ";
  protected final String TEXT_2373 = ".";
  protected final String TEXT_2374 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2375 = NL + "\t * @param ";
  protected final String TEXT_2376 = " The ";
  protected final String TEXT_2377 = " for the new {@link ";
  protected final String TEXT_2378 = "}, or <code>null</code>.";
  protected final String TEXT_2379 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2380 = "}." + NL + "\t * @see #";
  protected final String TEXT_2381 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2382 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2383 = NL + "\t";
  protected final String TEXT_2384 = " create";
  protected final String TEXT_2385 = "(";
  protected final String TEXT_2386 = ");" + NL;
  protected final String TEXT_2387 = NL + "\tpublic ";
  protected final String TEXT_2388 = " create";
  protected final String TEXT_2389 = "(";
  protected final String TEXT_2390 = ")" + NL + "\t{";
  protected final String TEXT_2391 = NL + "\t\treturn create";
  protected final String TEXT_2392 = "(";
  protected final String TEXT_2393 = ", ";
  protected final String TEXT_2394 = ");";
  protected final String TEXT_2395 = NL + "\t\t";
  protected final String TEXT_2396 = " new";
  protected final String TEXT_2397 = " = (";
  protected final String TEXT_2398 = ") create(";
  protected final String TEXT_2399 = ");";
  protected final String TEXT_2400 = NL + "\t\t";
  protected final String TEXT_2401 = "().add(new";
  protected final String TEXT_2402 = ");";
  protected final String TEXT_2403 = NL + "\t\tset";
  protected final String TEXT_2404 = "(new";
  protected final String TEXT_2405 = ");";
  protected final String TEXT_2406 = NL + "\t\tint ";
  protected final String TEXT_2407 = "ListSize = 0;";
  protected final String TEXT_2408 = NL + "\t\tint ";
  protected final String TEXT_2409 = "Size = ";
  protected final String TEXT_2410 = " == null ? 0 : ";
  protected final String TEXT_2411 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2412 = "Size > ";
  protected final String TEXT_2413 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2414 = "ListSize = ";
  protected final String TEXT_2415 = "Size;";
  protected final String TEXT_2416 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2417 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2418 = ".create";
  protected final String TEXT_2419 = "(";
  protected final String TEXT_2420 = ", ";
  protected final String TEXT_2421 = "i < ";
  protected final String TEXT_2422 = "Size ? (";
  protected final String TEXT_2423 = ") ";
  protected final String TEXT_2424 = ".get(i) : null";
  protected final String TEXT_2425 = ");" + NL + "\t\t}";
  protected final String TEXT_2426 = NL + "\t\tnew";
  protected final String TEXT_2427 = ".create";
  protected final String TEXT_2428 = "(";
  protected final String TEXT_2429 = ", ";
  protected final String TEXT_2430 = ");";
  protected final String TEXT_2431 = NL + "\t\tif (";
  protected final String TEXT_2432 = " != null)";
  protected final String TEXT_2433 = NL + "\t\t\tnew";
  protected final String TEXT_2434 = ".";
  protected final String TEXT_2435 = "().addAll(";
  protected final String TEXT_2436 = ");";
  protected final String TEXT_2437 = NL + "\t\t\tnew";
  protected final String TEXT_2438 = ".set";
  protected final String TEXT_2439 = "(";
  protected final String TEXT_2440 = ");";
  protected final String TEXT_2441 = NL + "\t\treturn new";
  protected final String TEXT_2442 = ";";
  protected final String TEXT_2443 = NL + "\t}" + NL;
  protected final String TEXT_2444 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2445 = "} with the specified ";
  protected final String TEXT_2446 = " from the '<em><b>";
  protected final String TEXT_2447 = "</b></em>' ";
  protected final String TEXT_2448 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2449 = NL + "\t * @param ";
  protected final String TEXT_2450 = " The ";
  protected final String TEXT_2451 = " of the {@link ";
  protected final String TEXT_2452 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2453 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2454 = "} with the specified ";
  protected final String TEXT_2455 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2456 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2457 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2458 = NL + "\t";
  protected final String TEXT_2459 = " get";
  protected final String TEXT_2460 = "(";
  protected final String TEXT_2461 = ");" + NL;
  protected final String TEXT_2462 = NL + "\tpublic ";
  protected final String TEXT_2463 = " get";
  protected final String TEXT_2464 = "(";
  protected final String TEXT_2465 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2466 = "(";
  protected final String TEXT_2467 = ", false";
  protected final String TEXT_2468 = ", null";
  protected final String TEXT_2469 = ", false";
  protected final String TEXT_2470 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2471 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2472 = "} with the specified ";
  protected final String TEXT_2473 = " from the '<em><b>";
  protected final String TEXT_2474 = "</b></em>' ";
  protected final String TEXT_2475 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2476 = NL + "\t * @param ";
  protected final String TEXT_2477 = " The ";
  protected final String TEXT_2478 = " of the {@link ";
  protected final String TEXT_2479 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2480 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2481 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2482 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2483 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2484 = "} on demand if not found.";
  protected final String TEXT_2485 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2486 = "} with the specified ";
  protected final String TEXT_2487 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2488 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2489 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2490 = NL + "\t";
  protected final String TEXT_2491 = " get";
  protected final String TEXT_2492 = "(";
  protected final String TEXT_2493 = ", boolean ignoreCase";
  protected final String TEXT_2494 = ", ";
  protected final String TEXT_2495 = " eClass";
  protected final String TEXT_2496 = ", boolean createOnDemand";
  protected final String TEXT_2497 = ");" + NL;
  protected final String TEXT_2498 = NL + "\tpublic ";
  protected final String TEXT_2499 = " get";
  protected final String TEXT_2500 = "(";
  protected final String TEXT_2501 = ", boolean ignoreCase";
  protected final String TEXT_2502 = ", ";
  protected final String TEXT_2503 = " eClass";
  protected final String TEXT_2504 = ", boolean createOnDemand";
  protected final String TEXT_2505 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2506 = "Loop: for (";
  protected final String TEXT_2507 = " i = ";
  protected final String TEXT_2508 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2509 = " ";
  protected final String TEXT_2510 = " = (";
  protected final String TEXT_2511 = ") i.next();";
  protected final String TEXT_2512 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2513 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2514 = "Loop;";
  protected final String TEXT_2515 = NL + "\t\t\t";
  protected final String TEXT_2516 = " ";
  protected final String TEXT_2517 = "List = ";
  protected final String TEXT_2518 = ".";
  protected final String TEXT_2519 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2520 = "ListSize = ";
  protected final String TEXT_2521 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2522 = " || (";
  protected final String TEXT_2523 = " != null && ";
  protected final String TEXT_2524 = ".size() != ";
  protected final String TEXT_2525 = "ListSize";
  protected final String TEXT_2526 = ")";
  protected final String TEXT_2527 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2528 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2529 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2530 = " ";
  protected final String TEXT_2531 = " = (";
  protected final String TEXT_2532 = ") ";
  protected final String TEXT_2533 = "List.get(j);";
  protected final String TEXT_2534 = NL + "\t\t\t\tif (";
  protected final String TEXT_2535 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2536 = ")";
  protected final String TEXT_2537 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2538 = ".";
  protected final String TEXT_2539 = "()) : ";
  protected final String TEXT_2540 = ".get(j).equals(";
  protected final String TEXT_2541 = ".";
  protected final String TEXT_2542 = "())))";
  protected final String TEXT_2543 = NL + "\t\t\t\tif (";
  protected final String TEXT_2544 = " != null && !";
  protected final String TEXT_2545 = ".get(j).equals(";
  protected final String TEXT_2546 = ".";
  protected final String TEXT_2547 = "()))";
  protected final String TEXT_2548 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2549 = "Loop;";
  protected final String TEXT_2550 = NL + "\t\t\t}";
  protected final String TEXT_2551 = NL + "\t\t\t";
  protected final String TEXT_2552 = " ";
  protected final String TEXT_2553 = " = ";
  protected final String TEXT_2554 = ".";
  protected final String TEXT_2555 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2556 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2557 = "Loop;";
  protected final String TEXT_2558 = NL + "\t\t\tif (";
  protected final String TEXT_2559 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2560 = ".equalsIgnoreCase(";
  protected final String TEXT_2561 = ".";
  protected final String TEXT_2562 = "()) : ";
  protected final String TEXT_2563 = ".equals(";
  protected final String TEXT_2564 = ".";
  protected final String TEXT_2565 = "())))";
  protected final String TEXT_2566 = NL + "\t\t\tif (";
  protected final String TEXT_2567 = " != null && !";
  protected final String TEXT_2568 = ".equals(";
  protected final String TEXT_2569 = ".";
  protected final String TEXT_2570 = "()))";
  protected final String TEXT_2571 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2572 = "Loop;";
  protected final String TEXT_2573 = NL + "\t\t\tif (";
  protected final String TEXT_2574 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2575 = ".equalsIgnoreCase(";
  protected final String TEXT_2576 = ".";
  protected final String TEXT_2577 = "()) : ";
  protected final String TEXT_2578 = ".equals(";
  protected final String TEXT_2579 = ".";
  protected final String TEXT_2580 = "())))";
  protected final String TEXT_2581 = NL + "\t\t\tif (";
  protected final String TEXT_2582 = " != null && !";
  protected final String TEXT_2583 = ".equals(";
  protected final String TEXT_2584 = ".";
  protected final String TEXT_2585 = "()))";
  protected final String TEXT_2586 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2587 = "Loop;";
  protected final String TEXT_2588 = NL + "\t\t\treturn ";
  protected final String TEXT_2589 = ";" + NL + "\t\t}";
  protected final String TEXT_2590 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2591 = " && eClass != null";
  protected final String TEXT_2592 = " ? create";
  protected final String TEXT_2593 = "(";
  protected final String TEXT_2594 = ", eClass";
  protected final String TEXT_2595 = ") : null;";
  protected final String TEXT_2596 = NL + "\t\treturn null;";
  protected final String TEXT_2597 = NL + "\t}" + NL;
  protected final String TEXT_2598 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2599 = "()" + NL + "\t{";
  protected final String TEXT_2600 = NL + "  \t\treturn false;";
  protected final String TEXT_2601 = NL + "\t\treturn !((";
  protected final String TEXT_2602 = ".Internal.Wrapper)";
  protected final String TEXT_2603 = "()).featureMap().isEmpty();";
  protected final String TEXT_2604 = NL + "\t\treturn ";
  protected final String TEXT_2605 = " != null && !";
  protected final String TEXT_2606 = ".featureMap().isEmpty();";
  protected final String TEXT_2607 = NL + "\t\treturn ";
  protected final String TEXT_2608 = " != null && !";
  protected final String TEXT_2609 = ".isEmpty();";
  protected final String TEXT_2610 = NL + "\t\t";
  protected final String TEXT_2611 = " ";
  protected final String TEXT_2612 = " = (";
  protected final String TEXT_2613 = ")eVirtualGet(";
  protected final String TEXT_2614 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2615 = " != null && !";
  protected final String TEXT_2616 = ".isEmpty();";
  protected final String TEXT_2617 = NL + "\t\treturn !";
  protected final String TEXT_2618 = "().isEmpty();";
  protected final String TEXT_2619 = NL + "\t\treturn ";
  protected final String TEXT_2620 = " != null;";
  protected final String TEXT_2621 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2622 = ") != null;";
  protected final String TEXT_2623 = NL + "\t\treturn basicGet";
  protected final String TEXT_2624 = "() != null;";
  protected final String TEXT_2625 = NL + "\t\treturn ";
  protected final String TEXT_2626 = " != null;";
  protected final String TEXT_2627 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2628 = ") != null;";
  protected final String TEXT_2629 = NL + "\t\treturn ";
  protected final String TEXT_2630 = "() != null;";
  protected final String TEXT_2631 = NL + "\t\treturn ((";
  protected final String TEXT_2632 = " & ";
  protected final String TEXT_2633 = "_EFLAG) != 0) != ";
  protected final String TEXT_2634 = "_EDEFAULT;";
  protected final String TEXT_2635 = NL + "\t\treturn ";
  protected final String TEXT_2636 = " != ";
  protected final String TEXT_2637 = "_EDEFAULT;";
  protected final String TEXT_2638 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2639 = ", ";
  protected final String TEXT_2640 = "_EDEFAULT) != ";
  protected final String TEXT_2641 = "_EDEFAULT;";
  protected final String TEXT_2642 = NL + "\t\treturn ";
  protected final String TEXT_2643 = "() != ";
  protected final String TEXT_2644 = "_EDEFAULT;";
  protected final String TEXT_2645 = NL + "\t\treturn ";
  protected final String TEXT_2646 = "_EDEFAULT == null ? ";
  protected final String TEXT_2647 = " != null : !";
  protected final String TEXT_2648 = "_EDEFAULT.equals(";
  protected final String TEXT_2649 = ");";
  protected final String TEXT_2650 = NL + "\t\t";
  protected final String TEXT_2651 = " ";
  protected final String TEXT_2652 = " = (";
  protected final String TEXT_2653 = ")eVirtualGet(";
  protected final String TEXT_2654 = ", ";
  protected final String TEXT_2655 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2656 = "_EDEFAULT == null ? ";
  protected final String TEXT_2657 = " != null : !";
  protected final String TEXT_2658 = "_EDEFAULT.equals(";
  protected final String TEXT_2659 = ");";
  protected final String TEXT_2660 = NL + "\t\treturn ";
  protected final String TEXT_2661 = "_EDEFAULT == null ? ";
  protected final String TEXT_2662 = "() != null : !";
  protected final String TEXT_2663 = "_EDEFAULT.equals(";
  protected final String TEXT_2664 = "());";
  protected final String TEXT_2665 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2666 = ");";
  protected final String TEXT_2667 = NL + "\t\t";
  protected final String TEXT_2668 = " ";
  protected final String TEXT_2669 = " = (";
  protected final String TEXT_2670 = ")eVirtualGet(";
  protected final String TEXT_2671 = ");";
  protected final String TEXT_2672 = NL + "\t\treturn ";
  protected final String TEXT_2673 = " != null && ((";
  protected final String TEXT_2674 = ".Unsettable)";
  protected final String TEXT_2675 = ").isSet();";
  protected final String TEXT_2676 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2677 = ");";
  protected final String TEXT_2678 = NL + "\t\treturn (";
  protected final String TEXT_2679 = " & ";
  protected final String TEXT_2680 = "_ESETFLAG) != 0;";
  protected final String TEXT_2681 = NL + "\t\treturn ";
  protected final String TEXT_2682 = "ESet;";
  protected final String TEXT_2683 = NL + "\t\treturn !((";
  protected final String TEXT_2684 = ".Internal)((";
  protected final String TEXT_2685 = ".Internal.Wrapper)get";
  protected final String TEXT_2686 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2687 = ");";
  protected final String TEXT_2688 = NL + "\t\treturn !((";
  protected final String TEXT_2689 = ".Internal)get";
  protected final String TEXT_2690 = "()).isEmpty(";
  protected final String TEXT_2691 = ");";
  protected final String TEXT_2692 = NL;
  protected final String TEXT_2693 = NL + "\t\treturn ";
  protected final String TEXT_2694 = ".";
  protected final String TEXT_2695 = "(this);";
  protected final String TEXT_2696 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2697 = "' ";
  protected final String TEXT_2698 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2699 = NL + "\t}" + NL;
  protected final String TEXT_2700 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2701 = " ";
  protected final String TEXT_2702 = "(";
  protected final String TEXT_2703 = ")";
  protected final String TEXT_2704 = NL + "\t{";
  protected final String TEXT_2705 = NL + "\t\t";
  protected final String TEXT_2706 = "(";
  protected final String TEXT_2707 = ");";
  protected final String TEXT_2708 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2709 = NL + "\t\treturn ";
  protected final String TEXT_2710 = "(";
  protected final String TEXT_2711 = ");";
  protected final String TEXT_2712 = NL + "\t}" + NL;
  protected final String TEXT_2713 = NL + "} //";
  protected final String TEXT_2714 = NL;

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
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) {
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
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getEDefault());
    }
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
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_118);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_121);
    }
    new Runnable() { public void run() {
    for (Iterator i=(isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures()).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_122);
    if (!isImplementation) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_125);
    } else {
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_128);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_133);
    } else {
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_143);
    if (!isImplementation) {
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_146);
    } else {
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_151);
    }
    stringBuffer.append(TEXT_152);
    if (!isImplementation) {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_154);
    } else {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_156);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_161);
    }
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(TEXT_163);
    if (!isImplementation) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_167);
    } else {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_175);
    }
    stringBuffer.append(TEXT_176);
    if (!isImplementation) {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_179);
    } else {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_183);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_186);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_187);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_189);
    } else {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(TEXT_192);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_194);
    } else {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(TEXT_197);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_199);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_201);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_203);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_207);
    }
    }
    stringBuffer.append(TEXT_208);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_211);
    }
    stringBuffer.append(TEXT_212);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_217);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_220);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_222);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_225);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_228);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_231);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_232);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_233);
    }}
    stringBuffer.append(TEXT_234);
    } else {
    stringBuffer.append(TEXT_235);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_238);
    } else {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_241);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_242);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_243);
    }
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_246);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_248);
    }
    stringBuffer.append(TEXT_249);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_254);
    }
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_256);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_260);
    } else {
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_263);
    }
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_265);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_268);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_286);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_291);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_295);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_300);
    }
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_302);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_305);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_309);
    }
    stringBuffer.append(TEXT_310);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_313);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_320);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getEDefault());
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
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
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
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_346);
    } else {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_351);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_353);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_355);
    } else {
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
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_412);
    }
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_414);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_416);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_429);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_430);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_433);
    } else {
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_445);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_446);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_448);
    }
    stringBuffer.append(TEXT_449);
    }
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_454);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_455);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_456);
    }
    } else {
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_459);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_462);
    } else {
    stringBuffer.append(TEXT_463);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_468);
    }
    }
    }
    }
    stringBuffer.append(TEXT_469);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_471);
    } else {
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_473);
    }
    } else {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_476);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_477);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_480);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_483);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_486);
    } else {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_488);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_493);
    } else {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_495);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_497);
    }
    } else {
    stringBuffer.append(TEXT_498);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_499);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_501);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_503);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_505);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_507);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_509);
    } else {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_512);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_514);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_516);
    }
    }
    }
    }
    stringBuffer.append(TEXT_517);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_519);
    } else {
    stringBuffer.append(TEXT_520);
    }
    stringBuffer.append(TEXT_521);
    } else {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_524);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_525);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_531);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(TEXT_536);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_538);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_539);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_542);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_545);
    }
    stringBuffer.append(TEXT_546);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_550);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_552);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_560);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_561);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_564);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_565);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_567);
    }
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_573);
    }
    stringBuffer.append(TEXT_574);
    }
    stringBuffer.append(TEXT_575);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_579);
    } else {
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_585);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_587);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_593);
    } else {
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_597);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_598);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_603);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_607);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_608);
    } else {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    }
    stringBuffer.append(TEXT_611);
    } else {
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
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_621);
    }
    stringBuffer.append(TEXT_622);
    }
    stringBuffer.append(TEXT_623);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_625);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_626);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_629);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_632);
    }
    stringBuffer.append(TEXT_633);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_637);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_639);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_645);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_647);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_654);
    }
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_659);
    }
    stringBuffer.append(TEXT_660);
    }
    stringBuffer.append(TEXT_661);
    }
    stringBuffer.append(TEXT_662);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_668);
    } else {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_673);
    }
    } else {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_676);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_677);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_684);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_687);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_689);
    }
    }
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_691);
    } else {
    stringBuffer.append(TEXT_692);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_695);
    } else {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(TEXT_700);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_707);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_709);
    }
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_711);
    }
    stringBuffer.append(TEXT_712);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_726);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_730);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_736);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_741);
    }
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_754);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_764);
    }
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_768);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_769);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_772);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_776);
    }
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_779);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_782);
    }
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_784);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_791);
    }
    stringBuffer.append(TEXT_792);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_798);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_803);
    }
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_809);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_813);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    } else {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_824);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_829);
    } else {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_833);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_837);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_839);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_843);
    }
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_846);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_849);
    }
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_851);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_855);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_859);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_861);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_862);
    } else {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_864);
    }
    stringBuffer.append(TEXT_865);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_869);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_874);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_876);
    }
    }
    }
    stringBuffer.append(TEXT_877);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_878);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_880);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_884);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_887);
    }
    stringBuffer.append(TEXT_888);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_889);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_891);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_892);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_894);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_895);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_896);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_897);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_900);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_902);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_906);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_909);
    }
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_911);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_914);
    }
    stringBuffer.append(TEXT_915);
    }
    stringBuffer.append(TEXT_916);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_919);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_921);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_923);
    }
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_925);
    }
    stringBuffer.append(TEXT_926);
    } else {
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
    }
    } else {
    stringBuffer.append(TEXT_936);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_937);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_940);
    } else {
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_943);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_944);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_948);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_951);
    } else {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_956);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_964);
    } else {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_968);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_973);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_975);
    } else {
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_977);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_978);
    } else {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_980);
    }
    stringBuffer.append(TEXT_981);
    }
    } else {
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_984);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_985);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_990);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_992);
    }
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_994);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_997);
    }
    stringBuffer.append(TEXT_998);
    } else {
    stringBuffer.append(TEXT_999);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1001);
    } else {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1003);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1005);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1010);
    }
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1015);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1020);
    }
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1023);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1027);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1032);
    }
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1034);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1037);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1041);
    }
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1044);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1047);
    }
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1049);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1054);
    }
    stringBuffer.append(TEXT_1055);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1060);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1063);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1067);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1069);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1073);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1076);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1078);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1081);
    } else {
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1083);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1087);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1089);
    } else {
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1091);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1092);
    } else {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1094);
    }
    stringBuffer.append(TEXT_1095);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1101);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1104);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1107);
    } else {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1109);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1113);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1118);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1119);
    } else {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1121);
    }
    stringBuffer.append(TEXT_1122);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1127);
    } else {
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1131);
    }
    } else {
    stringBuffer.append(TEXT_1132);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1135);
    } else {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1138);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1139);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1146);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1148);
    }
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1150);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1153);
    }
    stringBuffer.append(TEXT_1154);
    } else {
    stringBuffer.append(TEXT_1155);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1157);
    } else {
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1159);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1161);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1166);
    }
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1171);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1173);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1176);
    } else {
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1178);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1183);
    } else {
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1187);
    }
    } else {
    stringBuffer.append(TEXT_1188);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1191);
    } else {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1194);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1195);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1196);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1203);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1210);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1211);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1216);
    } else {
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1221);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1225);
    } else {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1229);
    }
    }
    stringBuffer.append(TEXT_1230);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1234);
    }
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1238);
    } else {
    stringBuffer.append(TEXT_1239);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1242);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1243);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1244);
    } else { int index = 0;
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1247);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1248);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1252);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1255);
    } else {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1258);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1260);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1268);
    }
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1272);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1273);
    }
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1277);
    }
    stringBuffer.append(TEXT_1278);
    } else {
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1281);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1282);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1283);
    }
    } else {
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1285);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1289);
    } else {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1293);
    }
    }
    }
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1295);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1296);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1301);
    } else {
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1306);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1310);
    } else {
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1314);
    }
    }
    stringBuffer.append(TEXT_1315);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1319);
    }
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1322);
    } else {
    stringBuffer.append(TEXT_1323);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1327);
    } else { int index = 0;
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1331);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1333);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1334);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1335);
    } else {
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1340);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1343);
    } else {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1346);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1348);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1356);
    }
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1360);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1361);
    }
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1365);
    }
    stringBuffer.append(TEXT_1366);
    } else {
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1369);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1370);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1371);
    }
    } else {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1373);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1381);
    }
    }
    }
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1383);
    }
    stringBuffer.append(TEXT_1384);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1389);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1393);
    }
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1397);
    } else {
    stringBuffer.append(TEXT_1398);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1402);
    } else {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1408);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1409);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1410);
    }
    stringBuffer.append(TEXT_1411);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1416);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1420);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1421);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1423);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1425);
    }
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1429);
    } else {
    stringBuffer.append(TEXT_1430);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1434);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1436);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1437);
    }
    stringBuffer.append(TEXT_1438);
    } else { int index = 0;
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1442);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1444);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1445);
    }
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1452);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1455);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1462);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1463);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1466);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1467);
    }
    }
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1474);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1483);
    } else {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1488);
    }
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1490);
    }
    stringBuffer.append(TEXT_1491);
    } else {
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1498);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1506);
    } else {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1511);
    }
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1513);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1521);
    } else {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1526);
    }
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1528);
    }
    }
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1530);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1531);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1532);
    }
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1535);
    }
    stringBuffer.append(TEXT_1536);
    } else {
    stringBuffer.append(TEXT_1537);
    }
    stringBuffer.append(TEXT_1538);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1540);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1541);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1544);
    } else {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1547);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1550);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1557);
    } else {
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1559);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1561);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1563);
    } else {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1565);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1567);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1569);
    } else {
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1571);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1575);
    } else {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1578);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1582);
    } else {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1585);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1590);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1600);
    } else {
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1605);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1607);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1612);
    }
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1616);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1618);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1621);
    } else {
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1623);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1628);
    } else {
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1632);
    }
    } else {
    stringBuffer.append(TEXT_1633);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1636);
    } else {
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1639);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1640);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1641);
    if (isInterface) {
    stringBuffer.append(TEXT_1642);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1644);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1647);
    }}
    stringBuffer.append(TEXT_1648);
    } else {
    stringBuffer.append(TEXT_1649);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1654);
    } else {
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1659);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1665);
    } else {
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1678);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1681);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1683);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1687);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1688);
    }
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1691);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1692);
    }
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1695);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1697);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1699);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1701);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1702);
    }
    stringBuffer.append(TEXT_1703);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1705);
    }
    stringBuffer.append(TEXT_1706);
    }
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1709);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1711);
    }
    } else {
    stringBuffer.append(TEXT_1712);
    }
    }
    stringBuffer.append(TEXT_1713);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1714);
    if (genModel.useGenerics()) {
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1715);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1716);
    }
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1720);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1722);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1727);
    } else {
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1729);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1730);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1733);
    } else {
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1735);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1740);
    }
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1742);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1746);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1751);
    }
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1754);
    }
    }
    stringBuffer.append(TEXT_1755);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1756);
    } else {
    stringBuffer.append(TEXT_1757);
    }
    stringBuffer.append(TEXT_1758);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1759);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1760);
    }
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1764);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1766);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1770);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1774);
    } else {
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1777);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1779);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1781);
    } else {
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1783);
    }
    }
    stringBuffer.append(TEXT_1784);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1785);
    } else {
    stringBuffer.append(TEXT_1786);
    }
    stringBuffer.append(TEXT_1787);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1788);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1789);
    }
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1792);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1796);
    }
    stringBuffer.append(TEXT_1797);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1798);
    } else {
    stringBuffer.append(TEXT_1799);
    }
    stringBuffer.append(TEXT_1800);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1801);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1802);
    }
    stringBuffer.append(TEXT_1803);
    for (Iterator i=genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenFeatures().iterator() : genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1805);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1807);
    } else {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1810);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1813);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1817);
    } else {
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1820);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1824);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1828);
    } else {
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1830);
    }
    }
    stringBuffer.append(TEXT_1831);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1832);
    } else {
    stringBuffer.append(TEXT_1833);
    }
    stringBuffer.append(TEXT_1834);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1835);
    if (genModel.useGenerics()) {
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1836);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1837);
    }
    stringBuffer.append(TEXT_1838);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1840);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1844);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1847);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1851);
    } else {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1854);
    }
    } else {
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1859);
    }
    stringBuffer.append(TEXT_1860);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1864);
    } else {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1866);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType())) {
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1868);
    }
    stringBuffer.append(TEXT_1869);
    }
    stringBuffer.append(TEXT_1870);
    }
    stringBuffer.append(TEXT_1871);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1872);
    } else {
    stringBuffer.append(TEXT_1873);
    }
    stringBuffer.append(TEXT_1874);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1875);
    }
    stringBuffer.append(TEXT_1876);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1878);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1881);
    } else {
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1883);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1885);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1888);
    } else {
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1891);
    }
    stringBuffer.append(TEXT_1892);
    }
    stringBuffer.append(TEXT_1893);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1894);
    } else {
    stringBuffer.append(TEXT_1895);
    }
    stringBuffer.append(TEXT_1896);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(TEXT_1898);
    for (Iterator i=genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenFeatures().iterator() : genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1900);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1902);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1905);
    } else {
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1908);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1911);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1918);
    } else {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1920);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1922);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1924);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1926);
    } else {
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1928);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1930);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1932);
    } else {
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1934);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1938);
    } else {
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1941);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1945);
    } else {
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1948);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1953);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1963);
    } else {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1968);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1969);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1970);
    } else {
    stringBuffer.append(TEXT_1971);
    }
    stringBuffer.append(TEXT_1972);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1973);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1974);
    }
    stringBuffer.append(TEXT_1975);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1977);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1980);
    }
    stringBuffer.append(TEXT_1981);
    }
    stringBuffer.append(TEXT_1982);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1983);
    }
    stringBuffer.append(TEXT_1984);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1986);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1989);
    }
    stringBuffer.append(TEXT_1990);
    }
    stringBuffer.append(TEXT_1991);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1992);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1993);
    }
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1995);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1996);
    }
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1998);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1999);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2000);
    }
    stringBuffer.append(TEXT_2001);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2004);
    }
    stringBuffer.append(TEXT_2005);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2006);
    }
    stringBuffer.append(TEXT_2007);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2010);
    }
    stringBuffer.append(TEXT_2011);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2012);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2013);
    }
    stringBuffer.append(TEXT_2014);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2022);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2025);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2026);
    }
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2030);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2033);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2034);
    }
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2039);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2042);
    } else {
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2044);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2045);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType() : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType() : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2048);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2050);
    } else {
    stringBuffer.append(TEXT_2051);
    }
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2053);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2055);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2056);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2059);
    } else {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_2061);
    }
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2063);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2065);
    } else {
    stringBuffer.append(TEXT_2066);
    }
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2070);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2072);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2073);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2076);
    } else {
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_2078);
    }
    stringBuffer.append(TEXT_2079);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2080);
    }
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2084);
    }
    stringBuffer.append(TEXT_2085);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genModel)) {
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2089);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2094);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2099);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2102);
    } else {
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2105);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2111);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2117);
    } else {
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2126);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2130);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2134);
    } else {
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2141);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2144);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2146);
    } else {
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2149);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2154);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2156);
    }
    }
    }
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2158);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2160);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2162);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2163);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2165);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2166);
    }
    } else {
    stringBuffer.append(TEXT_2167);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2169);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2170);
    }
    }
    } else {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2172);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2173);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2175);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2176);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2178);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2179);
    }
    } else {
    stringBuffer.append(TEXT_2180);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2182);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2183);
    }
    }
    } else {
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2185);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2186);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2188);
    } else {
    stringBuffer.append(TEXT_2189);
    }
    }
    stringBuffer.append(TEXT_2190);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2193);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2195);
    } else {
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2197);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2198);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2200);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2201);
    } else {
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2203);
    }
    }
    stringBuffer.append(TEXT_2204);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2207);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2208);
    } else {
    stringBuffer.append(TEXT_2209);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2211);
    }
    stringBuffer.append(TEXT_2212);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2218);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2219);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2224);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2226);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2228);
    }
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2230);
    } else {
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2232);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2234);
    }
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2236);
    }
    }
    stringBuffer.append(TEXT_2237);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2241);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2242);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2247);
    }
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2249);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2251);
    }
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2253);
    }
    stringBuffer.append(TEXT_2254);
    }
    stringBuffer.append(TEXT_2255);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2262);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2269);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2270);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2275);
    } else {
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2280);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2284);
    } else {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2288);
    }
    }
    stringBuffer.append(TEXT_2289);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2293);
    }
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2297);
    } else {
    stringBuffer.append(TEXT_2298);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2301);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2302);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2303);
    } else { int index = 0;
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2306);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2307);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2311);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2314);
    } else {
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2317);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2319);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2327);
    }
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2331);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2332);
    }
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2336);
    }
    stringBuffer.append(TEXT_2337);
    } else {
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2340);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2341);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2342);
    }
    } else {
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2344);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2348);
    } else {
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2352);
    }
    }
    }
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2354);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2355);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2360);
    } else {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2365);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2369);
    } else {
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2373);
    }
    }
    stringBuffer.append(TEXT_2374);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2378);
    }
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2381);
    } else {
    stringBuffer.append(TEXT_2382);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2386);
    } else { int index = 0;
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2390);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2392);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2393);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2394);
    } else {
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2399);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2402);
    } else {
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2405);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2407);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2415);
    }
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2419);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2420);
    }
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2424);
    }
    stringBuffer.append(TEXT_2425);
    } else {
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2428);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2429);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2430);
    }
    } else {
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2432);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2436);
    } else {
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2440);
    }
    }
    }
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2442);
    }
    stringBuffer.append(TEXT_2443);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2448);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2452);
    }
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2456);
    } else {
    stringBuffer.append(TEXT_2457);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2461);
    } else {
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2467);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2468);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2469);
    }
    stringBuffer.append(TEXT_2470);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2475);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2479);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2480);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2482);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2484);
    }
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2488);
    } else {
    stringBuffer.append(TEXT_2489);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2493);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2495);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2496);
    }
    stringBuffer.append(TEXT_2497);
    } else { int index = 0;
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2501);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2503);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2504);
    }
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2511);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2514);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2521);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2522);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2525);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2526);
    }
    }
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2533);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2542);
    } else {
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2547);
    }
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2549);
    }
    stringBuffer.append(TEXT_2550);
    } else {
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2557);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2565);
    } else {
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2570);
    }
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2572);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2580);
    } else {
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2585);
    }
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2587);
    }
    }
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2589);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2590);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2591);
    }
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2594);
    }
    stringBuffer.append(TEXT_2595);
    } else {
    stringBuffer.append(TEXT_2596);
    }
    stringBuffer.append(TEXT_2597);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2599);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2600);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2603);
    } else {
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2606);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2609);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2616);
    } else {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2618);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2620);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2622);
    } else {
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2624);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2626);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2628);
    } else {
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2630);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2634);
    } else {
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2637);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2641);
    } else {
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2644);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2649);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2659);
    } else {
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2664);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2666);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2671);
    }
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2675);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2677);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2680);
    } else {
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2682);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2687);
    } else {
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2691);
    }
    } else {
    stringBuffer.append(TEXT_2692);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2695);
    } else {
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2698);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2699);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2704);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2707);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2708);
    } else {
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2711);
    }
    }
    stringBuffer.append(TEXT_2712);
    }
    }
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2714);
    return stringBuffer.toString();
  }
}
