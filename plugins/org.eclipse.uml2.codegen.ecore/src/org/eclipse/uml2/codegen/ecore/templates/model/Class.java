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
  protected final String TEXT_240 = NL;
  protected final String TEXT_241 = NL + "\t@Override";
  protected final String TEXT_242 = NL + "\t";
  protected final String TEXT_243 = " ";
  protected final String TEXT_244 = "();" + NL;
  protected final String TEXT_245 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_246 = NL + "\tpublic ";
  protected final String TEXT_247 = " ";
  protected final String TEXT_248 = "()" + NL + "\t{";
  protected final String TEXT_249 = NL + "\t\treturn ";
  protected final String TEXT_250 = "(";
  protected final String TEXT_251 = "(";
  protected final String TEXT_252 = ")eGet(";
  protected final String TEXT_253 = ", true)";
  protected final String TEXT_254 = ").";
  protected final String TEXT_255 = "()";
  protected final String TEXT_256 = ";";
  protected final String TEXT_257 = NL + "\t\t";
  protected final String TEXT_258 = " ";
  protected final String TEXT_259 = " = (";
  protected final String TEXT_260 = ")eVirtualGet(";
  protected final String TEXT_261 = ");";
  protected final String TEXT_262 = NL + "\t\tif (";
  protected final String TEXT_263 = " == null)" + NL + "\t\t{";
  protected final String TEXT_264 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_265 = ", ";
  protected final String TEXT_266 = " = new ";
  protected final String TEXT_267 = ");";
  protected final String TEXT_268 = NL + "\t\t\t";
  protected final String TEXT_269 = " = new ";
  protected final String TEXT_270 = ";";
  protected final String TEXT_271 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_272 = ";";
  protected final String TEXT_273 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_274 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_275 = ")eContainer();";
  protected final String TEXT_276 = NL + "\t\t";
  protected final String TEXT_277 = " ";
  protected final String TEXT_278 = " = (";
  protected final String TEXT_279 = ")eVirtualGet(";
  protected final String TEXT_280 = ", ";
  protected final String TEXT_281 = ");";
  protected final String TEXT_282 = NL + "\t\tif (";
  protected final String TEXT_283 = " != null && ";
  protected final String TEXT_284 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_285 = " old";
  protected final String TEXT_286 = " = (";
  protected final String TEXT_287 = ")";
  protected final String TEXT_288 = ";" + NL + "\t\t\t";
  protected final String TEXT_289 = " = ";
  protected final String TEXT_290 = "eResolveProxy(old";
  protected final String TEXT_291 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_292 = " != old";
  protected final String TEXT_293 = ")" + NL + "\t\t\t{";
  protected final String TEXT_294 = NL + "\t\t\t\t";
  protected final String TEXT_295 = " new";
  protected final String TEXT_296 = " = (";
  protected final String TEXT_297 = ")";
  protected final String TEXT_298 = ";";
  protected final String TEXT_299 = NL + "\t\t\t\t";
  protected final String TEXT_300 = " msgs = old";
  protected final String TEXT_301 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_302 = ", null, null);";
  protected final String TEXT_303 = NL + "\t\t\t\t";
  protected final String TEXT_304 = " msgs =  old";
  protected final String TEXT_305 = ".eInverseRemove(this, ";
  protected final String TEXT_306 = ", ";
  protected final String TEXT_307 = ".class, null);";
  protected final String TEXT_308 = NL + "\t\t\t\tif (new";
  protected final String TEXT_309 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_310 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_311 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_312 = ", null, msgs);";
  protected final String TEXT_313 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_314 = ".eInverseAdd(this, ";
  protected final String TEXT_315 = ", ";
  protected final String TEXT_316 = ".class, msgs);";
  protected final String TEXT_317 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_318 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_319 = ", ";
  protected final String TEXT_320 = ");";
  protected final String TEXT_321 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_322 = "(this, ";
  protected final String TEXT_323 = ".RESOLVE, ";
  protected final String TEXT_324 = ", old";
  protected final String TEXT_325 = ", ";
  protected final String TEXT_326 = "));";
  protected final String TEXT_327 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_328 = NL + "\t\treturn (";
  protected final String TEXT_329 = ")eVirtualGet(";
  protected final String TEXT_330 = ", ";
  protected final String TEXT_331 = ");";
  protected final String TEXT_332 = NL + "\t\treturn (";
  protected final String TEXT_333 = " & ";
  protected final String TEXT_334 = "_EFLAG) != 0;";
  protected final String TEXT_335 = NL + "\t\treturn ";
  protected final String TEXT_336 = ";";
  protected final String TEXT_337 = NL + "\t\t";
  protected final String TEXT_338 = " ";
  protected final String TEXT_339 = " = basicGet";
  protected final String TEXT_340 = "();" + NL + "\t\treturn ";
  protected final String TEXT_341 = " != null && ";
  protected final String TEXT_342 = ".eIsProxy() ? ";
  protected final String TEXT_343 = "eResolveProxy((";
  protected final String TEXT_344 = ")";
  protected final String TEXT_345 = ") : ";
  protected final String TEXT_346 = ";";
  protected final String TEXT_347 = NL + "\t\treturn new ";
  protected final String TEXT_348 = "((";
  protected final String TEXT_349 = ".Internal)((";
  protected final String TEXT_350 = ".Internal.Wrapper)get";
  protected final String TEXT_351 = "()).featureMap().";
  protected final String TEXT_352 = "list(";
  protected final String TEXT_353 = "));";
  protected final String TEXT_354 = NL + "\t\treturn (";
  protected final String TEXT_355 = ")get";
  protected final String TEXT_356 = "().";
  protected final String TEXT_357 = "list(";
  protected final String TEXT_358 = ");";
  protected final String TEXT_359 = NL + "\t\treturn ((";
  protected final String TEXT_360 = ".Internal.Wrapper)get";
  protected final String TEXT_361 = "()).featureMap().list(";
  protected final String TEXT_362 = ");";
  protected final String TEXT_363 = NL + "\t\treturn get";
  protected final String TEXT_364 = "().list(";
  protected final String TEXT_365 = ");";
  protected final String TEXT_366 = NL + "\t\treturn ";
  protected final String TEXT_367 = "(";
  protected final String TEXT_368 = "(";
  protected final String TEXT_369 = ")";
  protected final String TEXT_370 = "((";
  protected final String TEXT_371 = ".Internal.Wrapper)get";
  protected final String TEXT_372 = "()).featureMap().get(";
  protected final String TEXT_373 = ", true)";
  protected final String TEXT_374 = ").";
  protected final String TEXT_375 = "()";
  protected final String TEXT_376 = ";";
  protected final String TEXT_377 = NL + "\t\treturn ";
  protected final String TEXT_378 = "(";
  protected final String TEXT_379 = "(";
  protected final String TEXT_380 = ")";
  protected final String TEXT_381 = "get";
  protected final String TEXT_382 = "().get(";
  protected final String TEXT_383 = ", true)";
  protected final String TEXT_384 = ").";
  protected final String TEXT_385 = "()";
  protected final String TEXT_386 = ";";
  protected final String TEXT_387 = NL;
  protected final String TEXT_388 = NL + "\t\t";
  protected final String TEXT_389 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_390 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_391 = NL + "\t\t\t";
  protected final String TEXT_392 = " result = (";
  protected final String TEXT_393 = ") cache.get(";
  protected final String TEXT_394 = "eResource(), ";
  protected final String TEXT_395 = "this, ";
  protected final String TEXT_396 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_397 = "eResource(), ";
  protected final String TEXT_398 = "this, ";
  protected final String TEXT_399 = ", result = ";
  protected final String TEXT_400 = "new ";
  protected final String TEXT_401 = "(";
  protected final String TEXT_402 = ".";
  protected final String TEXT_403 = "(this)";
  protected final String TEXT_404 = ")";
  protected final String TEXT_405 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_406 = ".";
  protected final String TEXT_407 = "()";
  protected final String TEXT_408 = ";" + NL + "\t\t}";
  protected final String TEXT_409 = NL + "\t\treturn ";
  protected final String TEXT_410 = ".";
  protected final String TEXT_411 = "(this);";
  protected final String TEXT_412 = NL + "\t\t";
  protected final String TEXT_413 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_414 = " eResource = eResource();";
  protected final String TEXT_415 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_416 = NL + "\t\t\t";
  protected final String TEXT_417 = " ";
  protected final String TEXT_418 = " = (";
  protected final String TEXT_419 = ") cache.get(eResource, this, ";
  protected final String TEXT_420 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_421 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_422 = ", ";
  protected final String TEXT_423 = " = new ";
  protected final String TEXT_424 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_425 = ";" + NL + "\t\t}";
  protected final String TEXT_426 = NL + "\t\treturn new ";
  protected final String TEXT_427 = ";";
  protected final String TEXT_428 = NL + "\t\t";
  protected final String TEXT_429 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_430 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_431 = " method = getClass().getMethod(\"";
  protected final String TEXT_432 = "\", null);";
  protected final String TEXT_433 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_434 = NL + "\t\t\t\t";
  protected final String TEXT_435 = " ";
  protected final String TEXT_436 = " = (";
  protected final String TEXT_437 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_438 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_439 = " union = ";
  protected final String TEXT_440 = "Helper(new ";
  protected final String TEXT_441 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_442 = " = new ";
  protected final String TEXT_443 = "(this, ";
  protected final String TEXT_444 = "null";
  protected final String TEXT_445 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_446 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_447 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_448 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_449 = NL + "\t\t\t";
  protected final String TEXT_450 = " ";
  protected final String TEXT_451 = " = (";
  protected final String TEXT_452 = ") cache.get(eResource(), this, ";
  protected final String TEXT_453 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_454 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_455 = " union = ";
  protected final String TEXT_456 = "Helper(new ";
  protected final String TEXT_457 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_458 = ", ";
  protected final String TEXT_459 = " = new ";
  protected final String TEXT_460 = "(this, ";
  protected final String TEXT_461 = "null";
  protected final String TEXT_462 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_463 = ";";
  protected final String TEXT_464 = NL + "\t\t}";
  protected final String TEXT_465 = NL + "\t\t";
  protected final String TEXT_466 = " union = ";
  protected final String TEXT_467 = "Helper(new ";
  protected final String TEXT_468 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_469 = "(this, ";
  protected final String TEXT_470 = "null";
  protected final String TEXT_471 = ", union.size(), union.toArray());";
  protected final String TEXT_472 = NL + "\t\tif (isSet";
  protected final String TEXT_473 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_474 = "();" + NL + "\t\t}";
  protected final String TEXT_475 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_476 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_477 = "();" + NL + "\t\t}";
  protected final String TEXT_478 = NL + "\t\t";
  protected final String TEXT_479 = " ";
  protected final String TEXT_480 = " = ";
  protected final String TEXT_481 = "();" + NL + "\t\tif (";
  protected final String TEXT_482 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_483 = ";" + NL + "\t\t}";
  protected final String TEXT_484 = NL + "\t\treturn ";
  protected final String TEXT_485 = "super.";
  protected final String TEXT_486 = "()";
  protected final String TEXT_487 = "null";
  protected final String TEXT_488 = ";";
  protected final String TEXT_489 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_490 = "' ";
  protected final String TEXT_491 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_492 = NL + "\t}" + NL;
  protected final String TEXT_493 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_494 = NL;
  protected final String TEXT_495 = NL + "\t@Override";
  protected final String TEXT_496 = NL + "\tpublic ";
  protected final String TEXT_497 = " basicGet";
  protected final String TEXT_498 = "()" + NL + "\t{";
  protected final String TEXT_499 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_500 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_501 = ")eInternalContainer();";
  protected final String TEXT_502 = NL + "\t\treturn (";
  protected final String TEXT_503 = ")eVirtualGet(";
  protected final String TEXT_504 = ");";
  protected final String TEXT_505 = NL + "\t\treturn ";
  protected final String TEXT_506 = ";";
  protected final String TEXT_507 = NL + "\t\treturn (";
  protected final String TEXT_508 = ")((";
  protected final String TEXT_509 = ".Internal.Wrapper)get";
  protected final String TEXT_510 = "()).featureMap().get(";
  protected final String TEXT_511 = ", false);";
  protected final String TEXT_512 = NL + "\t\treturn (";
  protected final String TEXT_513 = ")get";
  protected final String TEXT_514 = "().get(";
  protected final String TEXT_515 = ", false);";
  protected final String TEXT_516 = NL;
  protected final String TEXT_517 = NL + "\t\treturn ";
  protected final String TEXT_518 = ".";
  protected final String TEXT_519 = "(this);";
  protected final String TEXT_520 = NL + "\t\tif (isSet";
  protected final String TEXT_521 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_522 = "basicGet";
  protected final String TEXT_523 = "();" + NL + "\t\t}";
  protected final String TEXT_524 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_525 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_526 = "basicGet";
  protected final String TEXT_527 = "();" + NL + "\t\t}";
  protected final String TEXT_528 = NL + "\t\t";
  protected final String TEXT_529 = " ";
  protected final String TEXT_530 = " = ";
  protected final String TEXT_531 = "basicGet";
  protected final String TEXT_532 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_533 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_534 = ";" + NL + "\t\t}";
  protected final String TEXT_535 = NL + "\t\treturn ";
  protected final String TEXT_536 = "super.basicGet";
  protected final String TEXT_537 = "()";
  protected final String TEXT_538 = "null";
  protected final String TEXT_539 = ";";
  protected final String TEXT_540 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_541 = "' ";
  protected final String TEXT_542 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_543 = NL + "\t}" + NL;
  protected final String TEXT_544 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_545 = NL;
  protected final String TEXT_546 = NL + "\t@Override";
  protected final String TEXT_547 = NL + "\tpublic ";
  protected final String TEXT_548 = " basicSet";
  protected final String TEXT_549 = "(";
  protected final String TEXT_550 = " new";
  protected final String TEXT_551 = ", ";
  protected final String TEXT_552 = " msgs)" + NL + "\t{";
  protected final String TEXT_553 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_554 = ")new";
  protected final String TEXT_555 = ", ";
  protected final String TEXT_556 = ", msgs);";
  protected final String TEXT_557 = NL;
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
  protected final String TEXT_644 = NL;
  protected final String TEXT_645 = NL + "\t\t";
  protected final String TEXT_646 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_647 = NL + "\t\t\t";
  protected final String TEXT_648 = " ";
  protected final String TEXT_649 = " = ";
  protected final String TEXT_650 = "();";
  protected final String TEXT_651 = NL + "\t\t\tObject ";
  protected final String TEXT_652 = " = eVirtualGet(";
  protected final String TEXT_653 = ");";
  protected final String TEXT_654 = NL + "\t\t\tif (";
  protected final String TEXT_655 = " != null && ";
  protected final String TEXT_656 = " != new";
  protected final String TEXT_657 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_658 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_659 = NL + "\t\t\tif (new";
  protected final String TEXT_660 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_661 = NL + "\t\t\t\t";
  protected final String TEXT_662 = " ";
  protected final String TEXT_663 = " = ";
  protected final String TEXT_664 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_665 = ".contains(new";
  protected final String TEXT_666 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_667 = ".add(new";
  protected final String TEXT_668 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_669 = NL + "\t\t\t\t";
  protected final String TEXT_670 = " ";
  protected final String TEXT_671 = " = ";
  protected final String TEXT_672 = "();";
  protected final String TEXT_673 = NL + "\t\t\t\tObject ";
  protected final String TEXT_674 = " = eVirtualGet(";
  protected final String TEXT_675 = ");";
  protected final String TEXT_676 = NL + "\t\t\t\tif (new";
  protected final String TEXT_677 = " != ";
  protected final String TEXT_678 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_679 = "(new";
  protected final String TEXT_680 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_681 = NL + "\t\t\t}";
  protected final String TEXT_682 = NL + "\t\t}";
  protected final String TEXT_683 = NL + "\t\treturn msgs;";
  protected final String TEXT_684 = NL + "\t\treturn ((";
  protected final String TEXT_685 = ".Internal)((";
  protected final String TEXT_686 = ".Internal.Wrapper)get";
  protected final String TEXT_687 = "()).featureMap()).basicAdd(";
  protected final String TEXT_688 = ", new";
  protected final String TEXT_689 = ", msgs);";
  protected final String TEXT_690 = NL + "\t\treturn ((";
  protected final String TEXT_691 = ".Internal)get";
  protected final String TEXT_692 = "()).basicAdd(";
  protected final String TEXT_693 = ", new";
  protected final String TEXT_694 = ", msgs);";
  protected final String TEXT_695 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_696 = "' ";
  protected final String TEXT_697 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_698 = NL + "\t}" + NL;
  protected final String TEXT_699 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_700 = "#";
  protected final String TEXT_701 = " <em>";
  protected final String TEXT_702 = "</em>}' ";
  protected final String TEXT_703 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
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
  protected final String TEXT_714 = NL;
  protected final String TEXT_715 = NL + "\t@Override";
  protected final String TEXT_716 = NL + "\tvoid set";
  protected final String TEXT_717 = "(";
  protected final String TEXT_718 = " value);" + NL;
  protected final String TEXT_719 = NL + "\tpublic void set";
  protected final String TEXT_720 = "(";
  protected final String TEXT_721 = " new";
  protected final String TEXT_722 = ")" + NL + "\t{";
  protected final String TEXT_723 = NL;
  protected final String TEXT_724 = NL + "\t\tnew";
  protected final String TEXT_725 = " = new";
  protected final String TEXT_726 = " == null ? ";
  protected final String TEXT_727 = " : new";
  protected final String TEXT_728 = ";";
  protected final String TEXT_729 = NL + "\t\teSet(";
  protected final String TEXT_730 = ", ";
  protected final String TEXT_731 = "new ";
  protected final String TEXT_732 = "(";
  protected final String TEXT_733 = "new";
  protected final String TEXT_734 = ")";
  protected final String TEXT_735 = ");";
  protected final String TEXT_736 = NL + "\t\tif (new";
  protected final String TEXT_737 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_738 = " && new";
  protected final String TEXT_739 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_740 = ".isAncestor(this, ";
  protected final String TEXT_741 = "new";
  protected final String TEXT_742 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_743 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_744 = NL + "\t\t\t";
  protected final String TEXT_745 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_746 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_747 = ")new";
  protected final String TEXT_748 = ").eInverseAdd(this, ";
  protected final String TEXT_749 = ", ";
  protected final String TEXT_750 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_751 = "(";
  protected final String TEXT_752 = "new";
  protected final String TEXT_753 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_754 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_755 = "(this, ";
  protected final String TEXT_756 = ".SET, ";
  protected final String TEXT_757 = ", new";
  protected final String TEXT_758 = ", new";
  protected final String TEXT_759 = "));";
  protected final String TEXT_760 = NL + "\t\t";
  protected final String TEXT_761 = " ";
  protected final String TEXT_762 = " = (";
  protected final String TEXT_763 = ")eVirtualGet(";
  protected final String TEXT_764 = ");";
  protected final String TEXT_765 = NL + "\t\tif (new";
  protected final String TEXT_766 = " != ";
  protected final String TEXT_767 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_768 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_769 = " != null)";
  protected final String TEXT_770 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_771 = ")";
  protected final String TEXT_772 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_773 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_774 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_775 = ")new";
  protected final String TEXT_776 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_777 = ", null, msgs);";
  protected final String TEXT_778 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_779 = ")";
  protected final String TEXT_780 = ").eInverseRemove(this, ";
  protected final String TEXT_781 = ", ";
  protected final String TEXT_782 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_783 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_784 = ")new";
  protected final String TEXT_785 = ").eInverseAdd(this, ";
  protected final String TEXT_786 = ", ";
  protected final String TEXT_787 = ".class, msgs);";
  protected final String TEXT_788 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_789 = "(";
  protected final String TEXT_790 = "new";
  protected final String TEXT_791 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_792 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_793 = NL + "\t\t\tboolean old";
  protected final String TEXT_794 = "ESet = eVirtualIsSet(";
  protected final String TEXT_795 = ");";
  protected final String TEXT_796 = NL + "\t\t\tboolean old";
  protected final String TEXT_797 = "ESet = (";
  protected final String TEXT_798 = " & ";
  protected final String TEXT_799 = "_ESETFLAG) != 0;";
  protected final String TEXT_800 = NL + "\t\t\t";
  protected final String TEXT_801 = " |= ";
  protected final String TEXT_802 = "_ESETFLAG;";
  protected final String TEXT_803 = NL + "\t\t\tboolean old";
  protected final String TEXT_804 = "ESet = ";
  protected final String TEXT_805 = "ESet;";
  protected final String TEXT_806 = NL + "\t\t\t";
  protected final String TEXT_807 = "ESet = true;";
  protected final String TEXT_808 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_809 = "(this, ";
  protected final String TEXT_810 = ".SET, ";
  protected final String TEXT_811 = ", new";
  protected final String TEXT_812 = ", new";
  protected final String TEXT_813 = ", !old";
  protected final String TEXT_814 = "ESet));";
  protected final String TEXT_815 = NL + "\t\t}";
  protected final String TEXT_816 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_817 = "(this, ";
  protected final String TEXT_818 = ".SET, ";
  protected final String TEXT_819 = ", new";
  protected final String TEXT_820 = ", new";
  protected final String TEXT_821 = "));";
  protected final String TEXT_822 = NL + "\t\t";
  protected final String TEXT_823 = " old";
  protected final String TEXT_824 = " = (";
  protected final String TEXT_825 = " & ";
  protected final String TEXT_826 = "_EFLAG) != 0;";
  protected final String TEXT_827 = NL + "\t\tif (new";
  protected final String TEXT_828 = ") ";
  protected final String TEXT_829 = " |= ";
  protected final String TEXT_830 = "_EFLAG; else ";
  protected final String TEXT_831 = " &= ~";
  protected final String TEXT_832 = "_EFLAG;";
  protected final String TEXT_833 = NL + "\t\t";
  protected final String TEXT_834 = " old";
  protected final String TEXT_835 = " = ";
  protected final String TEXT_836 = ";";
  protected final String TEXT_837 = NL + "\t\t";
  protected final String TEXT_838 = " ";
  protected final String TEXT_839 = " = new";
  protected final String TEXT_840 = " == null ? ";
  protected final String TEXT_841 = " : new";
  protected final String TEXT_842 = ";";
  protected final String TEXT_843 = NL + "\t\t";
  protected final String TEXT_844 = " = new";
  protected final String TEXT_845 = " == null ? ";
  protected final String TEXT_846 = " : new";
  protected final String TEXT_847 = ";";
  protected final String TEXT_848 = NL + "\t\t";
  protected final String TEXT_849 = " ";
  protected final String TEXT_850 = " = ";
  protected final String TEXT_851 = "new";
  protected final String TEXT_852 = ";";
  protected final String TEXT_853 = NL + "\t\t";
  protected final String TEXT_854 = " = ";
  protected final String TEXT_855 = "new";
  protected final String TEXT_856 = ";";
  protected final String TEXT_857 = NL + "\t\tObject old";
  protected final String TEXT_858 = " = eVirtualSet(";
  protected final String TEXT_859 = ", ";
  protected final String TEXT_860 = ");";
  protected final String TEXT_861 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_862 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_863 = NL + "\t\tboolean old";
  protected final String TEXT_864 = "ESet = (";
  protected final String TEXT_865 = " & ";
  protected final String TEXT_866 = "_ESETFLAG) != 0;";
  protected final String TEXT_867 = NL + "\t\t";
  protected final String TEXT_868 = " |= ";
  protected final String TEXT_869 = "_ESETFLAG;";
  protected final String TEXT_870 = NL + "\t\tboolean old";
  protected final String TEXT_871 = "ESet = ";
  protected final String TEXT_872 = "ESet;";
  protected final String TEXT_873 = NL + "\t\t";
  protected final String TEXT_874 = "ESet = true;";
  protected final String TEXT_875 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_876 = "(this, ";
  protected final String TEXT_877 = ".SET, ";
  protected final String TEXT_878 = ", ";
  protected final String TEXT_879 = "isSetChange ? ";
  protected final String TEXT_880 = " : old";
  protected final String TEXT_881 = "old";
  protected final String TEXT_882 = ", ";
  protected final String TEXT_883 = "new";
  protected final String TEXT_884 = ", ";
  protected final String TEXT_885 = "isSetChange";
  protected final String TEXT_886 = "!old";
  protected final String TEXT_887 = "ESet";
  protected final String TEXT_888 = "));";
  protected final String TEXT_889 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_890 = "(this, ";
  protected final String TEXT_891 = ".SET, ";
  protected final String TEXT_892 = ", ";
  protected final String TEXT_893 = "old";
  protected final String TEXT_894 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_895 = " : old";
  protected final String TEXT_896 = "old";
  protected final String TEXT_897 = ", ";
  protected final String TEXT_898 = "new";
  protected final String TEXT_899 = "));";
  protected final String TEXT_900 = NL;
  protected final String TEXT_901 = NL;
  protected final String TEXT_902 = NL + "\t\t";
  protected final String TEXT_903 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_904 = NL + "\t\t\t";
  protected final String TEXT_905 = " ";
  protected final String TEXT_906 = " = ";
  protected final String TEXT_907 = "();";
  protected final String TEXT_908 = NL + "\t\t\tObject ";
  protected final String TEXT_909 = " = eVirtualGet(";
  protected final String TEXT_910 = ");";
  protected final String TEXT_911 = NL + "\t\t\tif (";
  protected final String TEXT_912 = " != null && ";
  protected final String TEXT_913 = " != new";
  protected final String TEXT_914 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_915 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_916 = NL + "\t\t\tif (new";
  protected final String TEXT_917 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_918 = NL + "\t\t\t\t";
  protected final String TEXT_919 = " ";
  protected final String TEXT_920 = " = ";
  protected final String TEXT_921 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_922 = ".contains(new";
  protected final String TEXT_923 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_924 = ".add(new";
  protected final String TEXT_925 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_926 = NL + "\t\t\t\t";
  protected final String TEXT_927 = " ";
  protected final String TEXT_928 = " = ";
  protected final String TEXT_929 = "();";
  protected final String TEXT_930 = NL + "\t\t\t\tObject ";
  protected final String TEXT_931 = " = eVirtualGet(";
  protected final String TEXT_932 = ");";
  protected final String TEXT_933 = NL + "\t\t\t\tif (new";
  protected final String TEXT_934 = " != ";
  protected final String TEXT_935 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_936 = "(new";
  protected final String TEXT_937 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_938 = NL + "\t\t\t}";
  protected final String TEXT_939 = NL + "\t\t}";
  protected final String TEXT_940 = NL + "\t\t((";
  protected final String TEXT_941 = ".Internal)((";
  protected final String TEXT_942 = ".Internal.Wrapper)get";
  protected final String TEXT_943 = "()).featureMap()).set(";
  protected final String TEXT_944 = ", ";
  protected final String TEXT_945 = "new ";
  protected final String TEXT_946 = "(";
  protected final String TEXT_947 = "new";
  protected final String TEXT_948 = ")";
  protected final String TEXT_949 = ");";
  protected final String TEXT_950 = NL + "\t\t((";
  protected final String TEXT_951 = ".Internal)get";
  protected final String TEXT_952 = "()).set(";
  protected final String TEXT_953 = ", ";
  protected final String TEXT_954 = "new ";
  protected final String TEXT_955 = "(";
  protected final String TEXT_956 = "new";
  protected final String TEXT_957 = ")";
  protected final String TEXT_958 = ");";
  protected final String TEXT_959 = NL;
  protected final String TEXT_960 = NL + "\t\t";
  protected final String TEXT_961 = ".";
  protected final String TEXT_962 = "(this, ";
  protected final String TEXT_963 = ");";
  protected final String TEXT_964 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_965 = "' ";
  protected final String TEXT_966 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_967 = NL + "\t}" + NL;
  protected final String TEXT_968 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_969 = NL;
  protected final String TEXT_970 = NL + "\t@Override";
  protected final String TEXT_971 = NL + "\tpublic ";
  protected final String TEXT_972 = " basicUnset";
  protected final String TEXT_973 = "(";
  protected final String TEXT_974 = " msgs)" + NL + "\t{";
  protected final String TEXT_975 = NL + "\t\tObject old";
  protected final String TEXT_976 = " = eVirtualUnset(";
  protected final String TEXT_977 = ");";
  protected final String TEXT_978 = NL + "\t\t";
  protected final String TEXT_979 = " old";
  protected final String TEXT_980 = " = ";
  protected final String TEXT_981 = ";" + NL + "\t\t";
  protected final String TEXT_982 = " = null;";
  protected final String TEXT_983 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_984 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_985 = NL + "\t\tboolean old";
  protected final String TEXT_986 = "ESet = (";
  protected final String TEXT_987 = " & ";
  protected final String TEXT_988 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_989 = " &= ~";
  protected final String TEXT_990 = "_ESETFLAG;";
  protected final String TEXT_991 = NL + "\t\tboolean old";
  protected final String TEXT_992 = "ESet = ";
  protected final String TEXT_993 = "ESet;" + NL + "\t\t";
  protected final String TEXT_994 = "ESet = false;";
  protected final String TEXT_995 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_996 = " notification = new ";
  protected final String TEXT_997 = "(this, ";
  protected final String TEXT_998 = ".UNSET, ";
  protected final String TEXT_999 = ", ";
  protected final String TEXT_1000 = "isSetChange ? old";
  protected final String TEXT_1001 = " : null";
  protected final String TEXT_1002 = "old";
  protected final String TEXT_1003 = ", null, ";
  protected final String TEXT_1004 = "isSetChange";
  protected final String TEXT_1005 = "old";
  protected final String TEXT_1006 = "ESet";
  protected final String TEXT_1007 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1008 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1009 = "' ";
  protected final String TEXT_1010 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1011 = NL + "\t}" + NL;
  protected final String TEXT_1012 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1013 = "#";
  protected final String TEXT_1014 = " <em>";
  protected final String TEXT_1015 = "</em>}' ";
  protected final String TEXT_1016 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1017 = NL + "\t * @see #isSet";
  protected final String TEXT_1018 = "()";
  protected final String TEXT_1019 = NL + "\t * @see #";
  protected final String TEXT_1020 = "()";
  protected final String TEXT_1021 = NL + "\t * @see #set";
  protected final String TEXT_1022 = "(";
  protected final String TEXT_1023 = ")";
  protected final String TEXT_1024 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1025 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1026 = NL;
  protected final String TEXT_1027 = NL + "\t@Override";
  protected final String TEXT_1028 = NL + "\tvoid unset";
  protected final String TEXT_1029 = "();" + NL;
  protected final String TEXT_1030 = NL + "\tpublic void unset";
  protected final String TEXT_1031 = "()" + NL + "\t{";
  protected final String TEXT_1032 = NL + "\t\teUnset(";
  protected final String TEXT_1033 = ");";
  protected final String TEXT_1034 = NL + "\t\t";
  protected final String TEXT_1035 = " ";
  protected final String TEXT_1036 = " = (";
  protected final String TEXT_1037 = ")eVirtualGet(";
  protected final String TEXT_1038 = ");";
  protected final String TEXT_1039 = NL + "\t\tif (";
  protected final String TEXT_1040 = " != null) ((";
  protected final String TEXT_1041 = ".Unsettable";
  protected final String TEXT_1042 = ")";
  protected final String TEXT_1043 = ").unset();";
  protected final String TEXT_1044 = NL + "\t\t";
  protected final String TEXT_1045 = " ";
  protected final String TEXT_1046 = " = (";
  protected final String TEXT_1047 = ")eVirtualGet(";
  protected final String TEXT_1048 = ");";
  protected final String TEXT_1049 = NL + "\t\tif (";
  protected final String TEXT_1050 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1051 = " msgs = null;";
  protected final String TEXT_1052 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1053 = ")";
  protected final String TEXT_1054 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1055 = ", null, msgs);";
  protected final String TEXT_1056 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1057 = ")";
  protected final String TEXT_1058 = ").eInverseRemove(this, ";
  protected final String TEXT_1059 = ", ";
  protected final String TEXT_1060 = ".class, msgs);";
  protected final String TEXT_1061 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1062 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1063 = NL + "\t\t\tboolean old";
  protected final String TEXT_1064 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1065 = ");";
  protected final String TEXT_1066 = NL + "\t\t\tboolean old";
  protected final String TEXT_1067 = "ESet = (";
  protected final String TEXT_1068 = " & ";
  protected final String TEXT_1069 = "_ESETFLAG) != 0;";
  protected final String TEXT_1070 = NL + "\t\t\t";
  protected final String TEXT_1071 = " &= ~";
  protected final String TEXT_1072 = "_ESETFLAG;";
  protected final String TEXT_1073 = NL + "\t\t\tboolean old";
  protected final String TEXT_1074 = "ESet = ";
  protected final String TEXT_1075 = "ESet;";
  protected final String TEXT_1076 = NL + "\t\t\t";
  protected final String TEXT_1077 = "ESet = false;";
  protected final String TEXT_1078 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1079 = "(this, ";
  protected final String TEXT_1080 = ".UNSET, ";
  protected final String TEXT_1081 = ", null, null, old";
  protected final String TEXT_1082 = "ESet));";
  protected final String TEXT_1083 = NL + "\t\t}";
  protected final String TEXT_1084 = NL + "\t\t";
  protected final String TEXT_1085 = " old";
  protected final String TEXT_1086 = " = (";
  protected final String TEXT_1087 = " & ";
  protected final String TEXT_1088 = "_EFLAG) != 0;";
  protected final String TEXT_1089 = NL + "\t\tObject old";
  protected final String TEXT_1090 = " = eVirtualUnset(";
  protected final String TEXT_1091 = ");";
  protected final String TEXT_1092 = NL + "\t\t";
  protected final String TEXT_1093 = " old";
  protected final String TEXT_1094 = " = ";
  protected final String TEXT_1095 = ";";
  protected final String TEXT_1096 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1097 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1098 = NL + "\t\tboolean old";
  protected final String TEXT_1099 = "ESet = (";
  protected final String TEXT_1100 = " & ";
  protected final String TEXT_1101 = "_ESETFLAG) != 0;";
  protected final String TEXT_1102 = NL + "\t\tboolean old";
  protected final String TEXT_1103 = "ESet = ";
  protected final String TEXT_1104 = "ESet;";
  protected final String TEXT_1105 = NL + "\t\t";
  protected final String TEXT_1106 = " = null;";
  protected final String TEXT_1107 = NL + "\t\t";
  protected final String TEXT_1108 = " &= ~";
  protected final String TEXT_1109 = "_ESETFLAG;";
  protected final String TEXT_1110 = NL + "\t\t";
  protected final String TEXT_1111 = "ESet = false;";
  protected final String TEXT_1112 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1113 = "(this, ";
  protected final String TEXT_1114 = ".UNSET, ";
  protected final String TEXT_1115 = ", ";
  protected final String TEXT_1116 = "isSetChange ? old";
  protected final String TEXT_1117 = " : null";
  protected final String TEXT_1118 = "old";
  protected final String TEXT_1119 = ", null, ";
  protected final String TEXT_1120 = "isSetChange";
  protected final String TEXT_1121 = "old";
  protected final String TEXT_1122 = "ESet";
  protected final String TEXT_1123 = "));";
  protected final String TEXT_1124 = NL + "\t\tif (";
  protected final String TEXT_1125 = ") ";
  protected final String TEXT_1126 = " |= ";
  protected final String TEXT_1127 = "_EFLAG; else ";
  protected final String TEXT_1128 = " &= ~";
  protected final String TEXT_1129 = "_EFLAG;";
  protected final String TEXT_1130 = NL + "\t\t";
  protected final String TEXT_1131 = " = ";
  protected final String TEXT_1132 = ";";
  protected final String TEXT_1133 = NL + "\t\t";
  protected final String TEXT_1134 = " &= ~";
  protected final String TEXT_1135 = "_ESETFLAG;";
  protected final String TEXT_1136 = NL + "\t\t";
  protected final String TEXT_1137 = "ESet = false;";
  protected final String TEXT_1138 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1139 = "(this, ";
  protected final String TEXT_1140 = ".UNSET, ";
  protected final String TEXT_1141 = ", ";
  protected final String TEXT_1142 = "isSetChange ? old";
  protected final String TEXT_1143 = " : ";
  protected final String TEXT_1144 = "old";
  protected final String TEXT_1145 = ", ";
  protected final String TEXT_1146 = ", ";
  protected final String TEXT_1147 = "isSetChange";
  protected final String TEXT_1148 = "old";
  protected final String TEXT_1149 = "ESet";
  protected final String TEXT_1150 = "));";
  protected final String TEXT_1151 = NL + "\t\t((";
  protected final String TEXT_1152 = ".Internal)((";
  protected final String TEXT_1153 = ".Internal.Wrapper)get";
  protected final String TEXT_1154 = "()).featureMap()).clear(";
  protected final String TEXT_1155 = ");";
  protected final String TEXT_1156 = NL + "\t\t((";
  protected final String TEXT_1157 = ".Internal)get";
  protected final String TEXT_1158 = "()).clear(";
  protected final String TEXT_1159 = ");";
  protected final String TEXT_1160 = NL;
  protected final String TEXT_1161 = NL + "\t\t";
  protected final String TEXT_1162 = ".";
  protected final String TEXT_1163 = "(this);";
  protected final String TEXT_1164 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1165 = "' ";
  protected final String TEXT_1166 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1167 = NL + "\t}" + NL;
  protected final String TEXT_1168 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1169 = "#";
  protected final String TEXT_1170 = " <em>";
  protected final String TEXT_1171 = "</em>}' ";
  protected final String TEXT_1172 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1173 = "</em>' ";
  protected final String TEXT_1174 = " is set.";
  protected final String TEXT_1175 = NL + "\t * @see #unset";
  protected final String TEXT_1176 = "()";
  protected final String TEXT_1177 = NL + "\t * @see #";
  protected final String TEXT_1178 = "()";
  protected final String TEXT_1179 = NL + "\t * @see #set";
  protected final String TEXT_1180 = "(";
  protected final String TEXT_1181 = ")";
  protected final String TEXT_1182 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1183 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1184 = NL;
  protected final String TEXT_1185 = NL + "\t@Override";
  protected final String TEXT_1186 = NL + "\tboolean isSet";
  protected final String TEXT_1187 = "();" + NL;
  protected final String TEXT_1188 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1189 = "()" + NL + "\t{";
  protected final String TEXT_1190 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1191 = ");";
  protected final String TEXT_1192 = NL + "\t\t";
  protected final String TEXT_1193 = " ";
  protected final String TEXT_1194 = " = (";
  protected final String TEXT_1195 = ")eVirtualGet(";
  protected final String TEXT_1196 = ");";
  protected final String TEXT_1197 = NL + "\t\treturn ";
  protected final String TEXT_1198 = " != null && ((";
  protected final String TEXT_1199 = ".Unsettable";
  protected final String TEXT_1200 = ")";
  protected final String TEXT_1201 = ").isSet();";
  protected final String TEXT_1202 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1203 = ");";
  protected final String TEXT_1204 = NL + "\t\treturn (";
  protected final String TEXT_1205 = " & ";
  protected final String TEXT_1206 = "_ESETFLAG) != 0;";
  protected final String TEXT_1207 = NL + "\t\treturn ";
  protected final String TEXT_1208 = "ESet;";
  protected final String TEXT_1209 = NL + "\t\treturn !((";
  protected final String TEXT_1210 = ".Internal)((";
  protected final String TEXT_1211 = ".Internal.Wrapper)get";
  protected final String TEXT_1212 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1213 = ");";
  protected final String TEXT_1214 = NL + "\t\treturn !((";
  protected final String TEXT_1215 = ".Internal)get";
  protected final String TEXT_1216 = "()).isEmpty(";
  protected final String TEXT_1217 = ");";
  protected final String TEXT_1218 = NL;
  protected final String TEXT_1219 = NL + "\t\treturn ";
  protected final String TEXT_1220 = ".";
  protected final String TEXT_1221 = "(this);";
  protected final String TEXT_1222 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1223 = "' ";
  protected final String TEXT_1224 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1225 = NL + "\t}" + NL;
  protected final String TEXT_1226 = NL;
  protected final String TEXT_1227 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1228 = "() <em>";
  protected final String TEXT_1229 = "</em>}' ";
  protected final String TEXT_1230 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1231 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1232 = "_ESUBSETS = ";
  protected final String TEXT_1233 = ";" + NL;
  protected final String TEXT_1234 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1235 = "() <em>";
  protected final String TEXT_1236 = "</em>}' ";
  protected final String TEXT_1237 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1238 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1239 = "_ESUPERSETS = ";
  protected final String TEXT_1240 = ";" + NL;
  protected final String TEXT_1241 = NL + "\t/**";
  protected final String TEXT_1242 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1243 = "}, with the specified ";
  protected final String TEXT_1244 = ", and appends it to the '<em><b>";
  protected final String TEXT_1245 = "</b></em>' ";
  protected final String TEXT_1246 = ".";
  protected final String TEXT_1247 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1248 = "}, with the specified ";
  protected final String TEXT_1249 = ", and sets the '<em><b>";
  protected final String TEXT_1250 = "</b></em>' ";
  protected final String TEXT_1251 = ".";
  protected final String TEXT_1252 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1253 = "} and appends it to the '<em><b>";
  protected final String TEXT_1254 = "</b></em>' ";
  protected final String TEXT_1255 = ".";
  protected final String TEXT_1256 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1257 = "} and sets the '<em><b>";
  protected final String TEXT_1258 = "</b></em>' ";
  protected final String TEXT_1259 = ".";
  protected final String TEXT_1260 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1261 = NL + "\t * @param ";
  protected final String TEXT_1262 = " The ";
  protected final String TEXT_1263 = " for the new {@link ";
  protected final String TEXT_1264 = "}, or <code>null</code>.";
  protected final String TEXT_1265 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1266 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1267 = "}." + NL + "\t * @see #";
  protected final String TEXT_1268 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1269 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1270 = NL + "\t";
  protected final String TEXT_1271 = " create";
  protected final String TEXT_1272 = "(";
  protected final String TEXT_1273 = ", ";
  protected final String TEXT_1274 = " eClass);" + NL;
  protected final String TEXT_1275 = NL + "\t@Override";
  protected final String TEXT_1276 = NL + "\tpublic ";
  protected final String TEXT_1277 = " create";
  protected final String TEXT_1278 = "(";
  protected final String TEXT_1279 = ", ";
  protected final String TEXT_1280 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1281 = " new";
  protected final String TEXT_1282 = " = (";
  protected final String TEXT_1283 = ") create(eClass);";
  protected final String TEXT_1284 = NL + "\t\t";
  protected final String TEXT_1285 = "().add(new";
  protected final String TEXT_1286 = ");";
  protected final String TEXT_1287 = NL + "\t\tset";
  protected final String TEXT_1288 = "(new";
  protected final String TEXT_1289 = ");";
  protected final String TEXT_1290 = NL + "\t\tint ";
  protected final String TEXT_1291 = "ListSize = 0;";
  protected final String TEXT_1292 = NL + "\t\tint ";
  protected final String TEXT_1293 = "Size = ";
  protected final String TEXT_1294 = " == null ? 0 : ";
  protected final String TEXT_1295 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1296 = "Size > ";
  protected final String TEXT_1297 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1298 = "ListSize = ";
  protected final String TEXT_1299 = "Size;";
  protected final String TEXT_1300 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1301 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1302 = ".create";
  protected final String TEXT_1303 = "(";
  protected final String TEXT_1304 = ", ";
  protected final String TEXT_1305 = "i < ";
  protected final String TEXT_1306 = "Size ? (";
  protected final String TEXT_1307 = ") ";
  protected final String TEXT_1308 = ".get(i) : null";
  protected final String TEXT_1309 = ");" + NL + "\t\t}";
  protected final String TEXT_1310 = NL + "\t\tnew";
  protected final String TEXT_1311 = ".create";
  protected final String TEXT_1312 = "(";
  protected final String TEXT_1313 = ", ";
  protected final String TEXT_1314 = ");";
  protected final String TEXT_1315 = NL + "\t\tif (";
  protected final String TEXT_1316 = " != null)";
  protected final String TEXT_1317 = NL + "\t\t\tnew";
  protected final String TEXT_1318 = ".";
  protected final String TEXT_1319 = "().addAll(";
  protected final String TEXT_1320 = ");";
  protected final String TEXT_1321 = NL + "\t\t\tnew";
  protected final String TEXT_1322 = ".set";
  protected final String TEXT_1323 = "(";
  protected final String TEXT_1324 = ");";
  protected final String TEXT_1325 = NL + "\t\treturn new";
  protected final String TEXT_1326 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1327 = NL + "\t/**";
  protected final String TEXT_1328 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1329 = "}, with the specified ";
  protected final String TEXT_1330 = ", and appends it to the '<em><b>";
  protected final String TEXT_1331 = "</b></em>' ";
  protected final String TEXT_1332 = ".";
  protected final String TEXT_1333 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1334 = "},with the specified ";
  protected final String TEXT_1335 = ", and sets the '<em><b>";
  protected final String TEXT_1336 = "</b></em>' ";
  protected final String TEXT_1337 = ".";
  protected final String TEXT_1338 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1339 = "} and appends it to the '<em><b>";
  protected final String TEXT_1340 = "</b></em>' ";
  protected final String TEXT_1341 = ".";
  protected final String TEXT_1342 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1343 = "} and sets the '<em><b>";
  protected final String TEXT_1344 = "</b></em>' ";
  protected final String TEXT_1345 = ".";
  protected final String TEXT_1346 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1347 = NL + "\t * @param ";
  protected final String TEXT_1348 = " The ";
  protected final String TEXT_1349 = " for the new {@link ";
  protected final String TEXT_1350 = "}, or <code>null</code>.";
  protected final String TEXT_1351 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1352 = "}." + NL + "\t * @see #";
  protected final String TEXT_1353 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1354 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1355 = NL + "\t";
  protected final String TEXT_1356 = " create";
  protected final String TEXT_1357 = "(";
  protected final String TEXT_1358 = ");" + NL;
  protected final String TEXT_1359 = NL + "\t@Override";
  protected final String TEXT_1360 = NL + "\tpublic ";
  protected final String TEXT_1361 = " create";
  protected final String TEXT_1362 = "(";
  protected final String TEXT_1363 = ")" + NL + "\t{";
  protected final String TEXT_1364 = NL + "\t\treturn create";
  protected final String TEXT_1365 = "(";
  protected final String TEXT_1366 = ", ";
  protected final String TEXT_1367 = ");";
  protected final String TEXT_1368 = NL + "\t\t";
  protected final String TEXT_1369 = " new";
  protected final String TEXT_1370 = " = (";
  protected final String TEXT_1371 = ") create(";
  protected final String TEXT_1372 = ");";
  protected final String TEXT_1373 = NL + "\t\t";
  protected final String TEXT_1374 = "().add(new";
  protected final String TEXT_1375 = ");";
  protected final String TEXT_1376 = NL + "\t\tset";
  protected final String TEXT_1377 = "(new";
  protected final String TEXT_1378 = ");";
  protected final String TEXT_1379 = NL + "\t\tint ";
  protected final String TEXT_1380 = "ListSize = 0;";
  protected final String TEXT_1381 = NL + "\t\tint ";
  protected final String TEXT_1382 = "Size = ";
  protected final String TEXT_1383 = " == null ? 0 : ";
  protected final String TEXT_1384 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1385 = "Size > ";
  protected final String TEXT_1386 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1387 = "ListSize = ";
  protected final String TEXT_1388 = "Size;";
  protected final String TEXT_1389 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1390 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1391 = ".create";
  protected final String TEXT_1392 = "(";
  protected final String TEXT_1393 = ", ";
  protected final String TEXT_1394 = "i < ";
  protected final String TEXT_1395 = "Size ? (";
  protected final String TEXT_1396 = ") ";
  protected final String TEXT_1397 = ".get(i) : null";
  protected final String TEXT_1398 = ");" + NL + "\t\t}";
  protected final String TEXT_1399 = NL + "\t\tnew";
  protected final String TEXT_1400 = ".create";
  protected final String TEXT_1401 = "(";
  protected final String TEXT_1402 = ", ";
  protected final String TEXT_1403 = ");";
  protected final String TEXT_1404 = NL + "\t\tif (";
  protected final String TEXT_1405 = " != null)";
  protected final String TEXT_1406 = NL + "\t\t\tnew";
  protected final String TEXT_1407 = ".";
  protected final String TEXT_1408 = "().addAll(";
  protected final String TEXT_1409 = ");";
  protected final String TEXT_1410 = NL + "\t\t\tnew";
  protected final String TEXT_1411 = ".set";
  protected final String TEXT_1412 = "(";
  protected final String TEXT_1413 = ");";
  protected final String TEXT_1414 = NL + "\t\treturn new";
  protected final String TEXT_1415 = ";";
  protected final String TEXT_1416 = NL + "\t}" + NL;
  protected final String TEXT_1417 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1418 = "} with the specified ";
  protected final String TEXT_1419 = " from the '<em><b>";
  protected final String TEXT_1420 = "</b></em>' ";
  protected final String TEXT_1421 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1422 = NL + "\t * @param ";
  protected final String TEXT_1423 = " The ";
  protected final String TEXT_1424 = " of the {@link ";
  protected final String TEXT_1425 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1426 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1427 = "} with the specified ";
  protected final String TEXT_1428 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1429 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1430 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1431 = NL + "\t";
  protected final String TEXT_1432 = " get";
  protected final String TEXT_1433 = "(";
  protected final String TEXT_1434 = ");" + NL;
  protected final String TEXT_1435 = NL + "\t@Override";
  protected final String TEXT_1436 = NL + "\tpublic ";
  protected final String TEXT_1437 = " get";
  protected final String TEXT_1438 = "(";
  protected final String TEXT_1439 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1440 = "(";
  protected final String TEXT_1441 = ", false";
  protected final String TEXT_1442 = ", null";
  protected final String TEXT_1443 = ", false";
  protected final String TEXT_1444 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1445 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1446 = "} with the specified ";
  protected final String TEXT_1447 = " from the '<em><b>";
  protected final String TEXT_1448 = "</b></em>' ";
  protected final String TEXT_1449 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1450 = NL + "\t * @param ";
  protected final String TEXT_1451 = " The ";
  protected final String TEXT_1452 = " of the {@link ";
  protected final String TEXT_1453 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1454 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1455 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1456 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1457 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1458 = "} on demand if not found.";
  protected final String TEXT_1459 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1460 = "} with the specified ";
  protected final String TEXT_1461 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1462 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1463 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1464 = NL + "\t";
  protected final String TEXT_1465 = " get";
  protected final String TEXT_1466 = "(";
  protected final String TEXT_1467 = ", boolean ignoreCase";
  protected final String TEXT_1468 = ", ";
  protected final String TEXT_1469 = " eClass";
  protected final String TEXT_1470 = ", boolean createOnDemand";
  protected final String TEXT_1471 = ");" + NL;
  protected final String TEXT_1472 = NL + "\t@Override";
  protected final String TEXT_1473 = NL + "\tpublic ";
  protected final String TEXT_1474 = " get";
  protected final String TEXT_1475 = "(";
  protected final String TEXT_1476 = ", boolean ignoreCase";
  protected final String TEXT_1477 = ", ";
  protected final String TEXT_1478 = " eClass";
  protected final String TEXT_1479 = ", boolean createOnDemand";
  protected final String TEXT_1480 = ")" + NL + "\t{";
  protected final String TEXT_1481 = NL + "\t\t";
  protected final String TEXT_1482 = "Loop: for (";
  protected final String TEXT_1483 = " ";
  protected final String TEXT_1484 = " : ";
  protected final String TEXT_1485 = "())" + NL + "\t\t{";
  protected final String TEXT_1486 = NL + "\t\t";
  protected final String TEXT_1487 = "Loop: for (";
  protected final String TEXT_1488 = " i = ";
  protected final String TEXT_1489 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1490 = " ";
  protected final String TEXT_1491 = " = (";
  protected final String TEXT_1492 = ") i.next();";
  protected final String TEXT_1493 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1494 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1495 = "Loop;";
  protected final String TEXT_1496 = NL + "\t\t\t";
  protected final String TEXT_1497 = " ";
  protected final String TEXT_1498 = "List = ";
  protected final String TEXT_1499 = ".";
  protected final String TEXT_1500 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1501 = "ListSize = ";
  protected final String TEXT_1502 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1503 = " || (";
  protected final String TEXT_1504 = " != null && ";
  protected final String TEXT_1505 = ".size() != ";
  protected final String TEXT_1506 = "ListSize";
  protected final String TEXT_1507 = ")";
  protected final String TEXT_1508 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1509 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1510 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1511 = " ";
  protected final String TEXT_1512 = " = ";
  protected final String TEXT_1513 = "(";
  protected final String TEXT_1514 = ") ";
  protected final String TEXT_1515 = "List.get(j);";
  protected final String TEXT_1516 = NL + "\t\t\t\tif (";
  protected final String TEXT_1517 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1518 = "(";
  protected final String TEXT_1519 = ")";
  protected final String TEXT_1520 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1521 = ".";
  protected final String TEXT_1522 = "()) : ";
  protected final String TEXT_1523 = ".get(j).equals(";
  protected final String TEXT_1524 = ".";
  protected final String TEXT_1525 = "())))";
  protected final String TEXT_1526 = NL + "\t\t\t\tif (";
  protected final String TEXT_1527 = " != null && !";
  protected final String TEXT_1528 = ".get(j).equals(";
  protected final String TEXT_1529 = ".";
  protected final String TEXT_1530 = "()))";
  protected final String TEXT_1531 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1532 = "Loop;";
  protected final String TEXT_1533 = NL + "\t\t\t}";
  protected final String TEXT_1534 = NL + "\t\t\t";
  protected final String TEXT_1535 = " ";
  protected final String TEXT_1536 = " = ";
  protected final String TEXT_1537 = ".";
  protected final String TEXT_1538 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1539 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1540 = "Loop;";
  protected final String TEXT_1541 = NL + "\t\t\tif (";
  protected final String TEXT_1542 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1543 = ".equalsIgnoreCase(";
  protected final String TEXT_1544 = ".";
  protected final String TEXT_1545 = "()) : ";
  protected final String TEXT_1546 = ".equals(";
  protected final String TEXT_1547 = ".";
  protected final String TEXT_1548 = "())))";
  protected final String TEXT_1549 = NL + "\t\t\tif (";
  protected final String TEXT_1550 = " != null && !";
  protected final String TEXT_1551 = ".equals(";
  protected final String TEXT_1552 = ".";
  protected final String TEXT_1553 = "()))";
  protected final String TEXT_1554 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1555 = "Loop;";
  protected final String TEXT_1556 = NL + "\t\t\tif (";
  protected final String TEXT_1557 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1558 = ".equalsIgnoreCase(";
  protected final String TEXT_1559 = ".";
  protected final String TEXT_1560 = "()) : ";
  protected final String TEXT_1561 = ".equals(";
  protected final String TEXT_1562 = ".";
  protected final String TEXT_1563 = "())))";
  protected final String TEXT_1564 = NL + "\t\t\tif (";
  protected final String TEXT_1565 = " != null && !";
  protected final String TEXT_1566 = ".equals(";
  protected final String TEXT_1567 = ".";
  protected final String TEXT_1568 = "()))";
  protected final String TEXT_1569 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1570 = "Loop;";
  protected final String TEXT_1571 = NL + "\t\t\treturn ";
  protected final String TEXT_1572 = ";" + NL + "\t\t}";
  protected final String TEXT_1573 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1574 = " && eClass != null";
  protected final String TEXT_1575 = " ? create";
  protected final String TEXT_1576 = "(";
  protected final String TEXT_1577 = ", eClass";
  protected final String TEXT_1578 = ") : null;";
  protected final String TEXT_1579 = NL + "\t\treturn null;";
  protected final String TEXT_1580 = NL + "\t}" + NL;
  protected final String TEXT_1581 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1582 = "()" + NL + "\t{" + NL + "\t//genFeature";
  protected final String TEXT_1583 = NL + "  \t\treturn false;";
  protected final String TEXT_1584 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1585 = ");";
  protected final String TEXT_1586 = NL + "\t\treturn !((";
  protected final String TEXT_1587 = ".Internal.Wrapper)";
  protected final String TEXT_1588 = "()).featureMap().isEmpty();";
  protected final String TEXT_1589 = NL + "\t\treturn ";
  protected final String TEXT_1590 = " != null && !";
  protected final String TEXT_1591 = ".featureMap().isEmpty();";
  protected final String TEXT_1592 = NL + "\t\treturn ";
  protected final String TEXT_1593 = " != null && !";
  protected final String TEXT_1594 = ".isEmpty();";
  protected final String TEXT_1595 = NL + "\t\t";
  protected final String TEXT_1596 = " ";
  protected final String TEXT_1597 = " = (";
  protected final String TEXT_1598 = ")eVirtualGet(";
  protected final String TEXT_1599 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1600 = " != null && !";
  protected final String TEXT_1601 = ".isEmpty();";
  protected final String TEXT_1602 = NL + "\t\treturn !";
  protected final String TEXT_1603 = "().isEmpty();";
  protected final String TEXT_1604 = NL + "\t\treturn ";
  protected final String TEXT_1605 = " != null;";
  protected final String TEXT_1606 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1607 = ") != null;";
  protected final String TEXT_1608 = NL + "\t\treturn basicGet";
  protected final String TEXT_1609 = "() != null;";
  protected final String TEXT_1610 = NL + "\t\treturn ";
  protected final String TEXT_1611 = " != null;";
  protected final String TEXT_1612 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1613 = ") != null;";
  protected final String TEXT_1614 = NL + "\t\treturn ";
  protected final String TEXT_1615 = "() != null;";
  protected final String TEXT_1616 = NL + "\t\treturn ((";
  protected final String TEXT_1617 = " & ";
  protected final String TEXT_1618 = "_EFLAG) != 0) != ";
  protected final String TEXT_1619 = ";";
  protected final String TEXT_1620 = NL + "\t\treturn ";
  protected final String TEXT_1621 = " != ";
  protected final String TEXT_1622 = ";";
  protected final String TEXT_1623 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1624 = ", ";
  protected final String TEXT_1625 = ") != ";
  protected final String TEXT_1626 = ";";
  protected final String TEXT_1627 = NL + "\t\treturn ";
  protected final String TEXT_1628 = "() != ";
  protected final String TEXT_1629 = ";";
  protected final String TEXT_1630 = NL + "\t\treturn ";
  protected final String TEXT_1631 = " == null ? ";
  protected final String TEXT_1632 = " != null : !";
  protected final String TEXT_1633 = ".equals(";
  protected final String TEXT_1634 = ");";
  protected final String TEXT_1635 = NL + "\t\t";
  protected final String TEXT_1636 = " ";
  protected final String TEXT_1637 = " = (";
  protected final String TEXT_1638 = ")eVirtualGet(";
  protected final String TEXT_1639 = ", ";
  protected final String TEXT_1640 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1641 = " == null ? ";
  protected final String TEXT_1642 = " != null : !";
  protected final String TEXT_1643 = ".equals(";
  protected final String TEXT_1644 = ");";
  protected final String TEXT_1645 = NL + "\t\treturn ";
  protected final String TEXT_1646 = " == null ? ";
  protected final String TEXT_1647 = "() != null : !";
  protected final String TEXT_1648 = ".equals(";
  protected final String TEXT_1649 = "());";
  protected final String TEXT_1650 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1651 = ");";
  protected final String TEXT_1652 = NL + "\t\t";
  protected final String TEXT_1653 = " ";
  protected final String TEXT_1654 = " = (";
  protected final String TEXT_1655 = ")eVirtualGet(";
  protected final String TEXT_1656 = ");";
  protected final String TEXT_1657 = NL + "\t\treturn ";
  protected final String TEXT_1658 = " != null && ((";
  protected final String TEXT_1659 = ".Unsettable";
  protected final String TEXT_1660 = ")";
  protected final String TEXT_1661 = ").isSet();";
  protected final String TEXT_1662 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1663 = ");";
  protected final String TEXT_1664 = NL + "\t\treturn (";
  protected final String TEXT_1665 = " & ";
  protected final String TEXT_1666 = "_ESETFLAG) != 0;";
  protected final String TEXT_1667 = NL + "\t\treturn ";
  protected final String TEXT_1668 = "ESet;";
  protected final String TEXT_1669 = NL + "\t\treturn !((";
  protected final String TEXT_1670 = ".Internal)((";
  protected final String TEXT_1671 = ".Internal.Wrapper)get";
  protected final String TEXT_1672 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1673 = ");";
  protected final String TEXT_1674 = NL + "\t\treturn !((";
  protected final String TEXT_1675 = ".Internal)get";
  protected final String TEXT_1676 = "()).isEmpty(";
  protected final String TEXT_1677 = ");";
  protected final String TEXT_1678 = NL;
  protected final String TEXT_1679 = NL + "\t\treturn ";
  protected final String TEXT_1680 = ".";
  protected final String TEXT_1681 = "(this);";
  protected final String TEXT_1682 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1683 = "' ";
  protected final String TEXT_1684 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1685 = NL + "\t}" + NL;
  protected final String TEXT_1686 = NL;
  protected final String TEXT_1687 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1688 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1689 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1690 = NL + "\t * @model ";
  protected final String TEXT_1691 = NL + "\t *        ";
  protected final String TEXT_1692 = NL + "\t * @model";
  protected final String TEXT_1693 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1694 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1695 = NL;
  protected final String TEXT_1696 = NL + "\t@Override";
  protected final String TEXT_1697 = NL + "\t";
  protected final String TEXT_1698 = " ";
  protected final String TEXT_1699 = "(";
  protected final String TEXT_1700 = ")";
  protected final String TEXT_1701 = ";" + NL;
  protected final String TEXT_1702 = NL + "\tpublic ";
  protected final String TEXT_1703 = " ";
  protected final String TEXT_1704 = "(";
  protected final String TEXT_1705 = ")";
  protected final String TEXT_1706 = NL + "\t{";
  protected final String TEXT_1707 = NL + "\t\t";
  protected final String TEXT_1708 = NL + "\t\treturn ";
  protected final String TEXT_1709 = ".";
  protected final String TEXT_1710 = "(this, ";
  protected final String TEXT_1711 = ", ";
  protected final String TEXT_1712 = ");";
  protected final String TEXT_1713 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1714 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1715 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1716 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1717 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1718 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1719 = ".";
  protected final String TEXT_1720 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1721 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1722 = "\", ";
  protected final String TEXT_1723 = ".getObjectLabel(this, ";
  protected final String TEXT_1724 = ") }),";
  protected final String TEXT_1725 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1726 = NL + "\t\t";
  protected final String TEXT_1727 = ".";
  protected final String TEXT_1728 = "(this";
  protected final String TEXT_1729 = ", ";
  protected final String TEXT_1730 = ");";
  protected final String TEXT_1731 = NL + "\t\t";
  protected final String TEXT_1732 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1733 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1734 = NL + "\t\t\t";
  protected final String TEXT_1735 = " result = (";
  protected final String TEXT_1736 = ") cache.get(";
  protected final String TEXT_1737 = "eResource(), ";
  protected final String TEXT_1738 = "this, ";
  protected final String TEXT_1739 = ".getEOperations().get(";
  protected final String TEXT_1740 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1741 = "eResource(), ";
  protected final String TEXT_1742 = "this, ";
  protected final String TEXT_1743 = ".getEOperations().get(";
  protected final String TEXT_1744 = "), result = ";
  protected final String TEXT_1745 = "new ";
  protected final String TEXT_1746 = "(";
  protected final String TEXT_1747 = ".";
  protected final String TEXT_1748 = "(this";
  protected final String TEXT_1749 = ", ";
  protected final String TEXT_1750 = ")";
  protected final String TEXT_1751 = ")";
  protected final String TEXT_1752 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1753 = ".";
  protected final String TEXT_1754 = "()";
  protected final String TEXT_1755 = ";" + NL + "\t\t}";
  protected final String TEXT_1756 = NL + "\t\treturn ";
  protected final String TEXT_1757 = ".";
  protected final String TEXT_1758 = "(this";
  protected final String TEXT_1759 = ", ";
  protected final String TEXT_1760 = ");";
  protected final String TEXT_1761 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1762 = NL + "\t}" + NL;
  protected final String TEXT_1763 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1764 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1765 = NL + "\t@Override";
  protected final String TEXT_1766 = NL + "\tpublic ";
  protected final String TEXT_1767 = " eInverseAdd(";
  protected final String TEXT_1768 = " otherEnd, int featureID, ";
  protected final String TEXT_1769 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1770 = NL + "\t\t\tcase ";
  protected final String TEXT_1771 = ":";
  protected final String TEXT_1772 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1773 = "(";
  protected final String TEXT_1774 = ".InternalMapView";
  protected final String TEXT_1775 = ")";
  protected final String TEXT_1776 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1777 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1778 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1779 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1780 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1781 = "((";
  protected final String TEXT_1782 = ")otherEnd, msgs);";
  protected final String TEXT_1783 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1784 = ", msgs);";
  protected final String TEXT_1785 = NL + "\t\t\t\t";
  protected final String TEXT_1786 = " ";
  protected final String TEXT_1787 = " = (";
  protected final String TEXT_1788 = ")eVirtualGet(";
  protected final String TEXT_1789 = ");";
  protected final String TEXT_1790 = NL + "\t\t\t\tif (";
  protected final String TEXT_1791 = " != null)";
  protected final String TEXT_1792 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1793 = ")";
  protected final String TEXT_1794 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1795 = ", null, msgs);";
  protected final String TEXT_1796 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1797 = ")";
  protected final String TEXT_1798 = ").eInverseRemove(this, ";
  protected final String TEXT_1799 = ", ";
  protected final String TEXT_1800 = ".class, msgs);";
  protected final String TEXT_1801 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1802 = "((";
  protected final String TEXT_1803 = ")otherEnd, msgs);";
  protected final String TEXT_1804 = NL + "\t\t}";
  protected final String TEXT_1805 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1806 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1807 = NL + "\t}" + NL;
  protected final String TEXT_1808 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1809 = NL + "\t@Override";
  protected final String TEXT_1810 = NL + "\tpublic ";
  protected final String TEXT_1811 = " eInverseRemove(";
  protected final String TEXT_1812 = " otherEnd, int featureID, ";
  protected final String TEXT_1813 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1814 = NL + "\t\t\tcase ";
  protected final String TEXT_1815 = ":";
  protected final String TEXT_1816 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1817 = ")((";
  protected final String TEXT_1818 = ".InternalMapView";
  protected final String TEXT_1819 = ")";
  protected final String TEXT_1820 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1821 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1822 = ")((";
  protected final String TEXT_1823 = ".Internal.Wrapper)";
  protected final String TEXT_1824 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1825 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1826 = ")";
  protected final String TEXT_1827 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1828 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1829 = ", msgs);";
  protected final String TEXT_1830 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1831 = "(msgs);";
  protected final String TEXT_1832 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1833 = "(null, msgs);";
  protected final String TEXT_1834 = NL + "\t\t}";
  protected final String TEXT_1835 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1836 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1837 = NL + "\t}" + NL;
  protected final String TEXT_1838 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1839 = NL + "\t@Override";
  protected final String TEXT_1840 = NL + "\tpublic ";
  protected final String TEXT_1841 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1842 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1843 = NL + "\t\t\tcase ";
  protected final String TEXT_1844 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1845 = ", ";
  protected final String TEXT_1846 = ".class, msgs);";
  protected final String TEXT_1847 = NL + "\t\t}";
  protected final String TEXT_1848 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1849 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1850 = NL + "\t}" + NL;
  protected final String TEXT_1851 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1852 = NL + "\t@Override";
  protected final String TEXT_1853 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1854 = NL + "\t\t\tcase ";
  protected final String TEXT_1855 = ":";
  protected final String TEXT_1856 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1857 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1858 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1859 = "(";
  protected final String TEXT_1860 = "());";
  protected final String TEXT_1861 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1862 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1863 = "();";
  protected final String TEXT_1864 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1865 = ".InternalMapView";
  protected final String TEXT_1866 = ")";
  protected final String TEXT_1867 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1868 = "();";
  protected final String TEXT_1869 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1870 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1871 = "().map();";
  protected final String TEXT_1872 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1873 = ".Internal.Wrapper)";
  protected final String TEXT_1874 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1875 = "();";
  protected final String TEXT_1876 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1877 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1878 = ".Internal)";
  protected final String TEXT_1879 = "()).getWrapper();";
  protected final String TEXT_1880 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1881 = "();";
  protected final String TEXT_1882 = NL + "\t\t}";
  protected final String TEXT_1883 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1884 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1885 = NL + "\t}" + NL;
  protected final String TEXT_1886 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1887 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1888 = NL + "\t@Override";
  protected final String TEXT_1889 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1890 = NL + "\t\t\tcase ";
  protected final String TEXT_1891 = ":";
  protected final String TEXT_1892 = NL + "\t\t\t\t((";
  protected final String TEXT_1893 = ".Internal)((";
  protected final String TEXT_1894 = ".Internal.Wrapper)";
  protected final String TEXT_1895 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1896 = NL + "\t\t\t\t((";
  protected final String TEXT_1897 = ".Internal)";
  protected final String TEXT_1898 = "()).set(newValue);";
  protected final String TEXT_1899 = NL + "\t\t\t\t((";
  protected final String TEXT_1900 = ".Setting)((";
  protected final String TEXT_1901 = ".InternalMapView";
  protected final String TEXT_1902 = ")";
  protected final String TEXT_1903 = "()).eMap()).set(newValue);";
  protected final String TEXT_1904 = NL + "\t\t\t\t((";
  protected final String TEXT_1905 = ".Setting)";
  protected final String TEXT_1906 = "()).set(newValue);";
  protected final String TEXT_1907 = NL + "\t\t\t\t";
  protected final String TEXT_1908 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1909 = "().addAll((";
  protected final String TEXT_1910 = "<? extends ";
  protected final String TEXT_1911 = ">";
  protected final String TEXT_1912 = ")newValue);";
  protected final String TEXT_1913 = NL + "\t\t\t\tset";
  protected final String TEXT_1914 = "(((";
  protected final String TEXT_1915 = ")newValue).";
  protected final String TEXT_1916 = "());";
  protected final String TEXT_1917 = NL + "\t\t\t\tset";
  protected final String TEXT_1918 = "(";
  protected final String TEXT_1919 = "(";
  protected final String TEXT_1920 = ")";
  protected final String TEXT_1921 = "newValue);";
  protected final String TEXT_1922 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1923 = NL + "\t\t}";
  protected final String TEXT_1924 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1925 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1926 = NL + "\t}" + NL;
  protected final String TEXT_1927 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1928 = NL + "\t@Override";
  protected final String TEXT_1929 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1930 = NL + "\t\t\tcase ";
  protected final String TEXT_1931 = ":";
  protected final String TEXT_1932 = NL + "\t\t\t\t((";
  protected final String TEXT_1933 = ".Internal.Wrapper)";
  protected final String TEXT_1934 = "()).featureMap().clear();";
  protected final String TEXT_1935 = NL + "\t\t\t\t";
  protected final String TEXT_1936 = "().clear();";
  protected final String TEXT_1937 = NL + "\t\t\t\tunset";
  protected final String TEXT_1938 = "();";
  protected final String TEXT_1939 = NL + "\t\t\t\tset";
  protected final String TEXT_1940 = "((";
  protected final String TEXT_1941 = ")null);";
  protected final String TEXT_1942 = NL + "\t\t\t\tset";
  protected final String TEXT_1943 = "(";
  protected final String TEXT_1944 = ");";
  protected final String TEXT_1945 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1946 = NL + "\t\t}";
  protected final String TEXT_1947 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1948 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1949 = NL + "\t}" + NL;
  protected final String TEXT_1950 = NL;
  protected final String TEXT_1951 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1952 = NL + "\t@Override";
  protected final String TEXT_1953 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1954 = NL + "\t\t\tcase ";
  protected final String TEXT_1955 = ":";
  protected final String TEXT_1956 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1957 = "();";
  protected final String TEXT_1958 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1959 = ".Internal.Wrapper)";
  protected final String TEXT_1960 = "()).featureMap().isEmpty();";
  protected final String TEXT_1961 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1962 = " != null && !";
  protected final String TEXT_1963 = ".featureMap().isEmpty();";
  protected final String TEXT_1964 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1965 = " != null && !";
  protected final String TEXT_1966 = ".isEmpty();";
  protected final String TEXT_1967 = NL + "\t\t\t\t";
  protected final String TEXT_1968 = " ";
  protected final String TEXT_1969 = " = (";
  protected final String TEXT_1970 = ")eVirtualGet(";
  protected final String TEXT_1971 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1972 = " != null && !";
  protected final String TEXT_1973 = ".isEmpty();";
  protected final String TEXT_1974 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1975 = "().isEmpty();";
  protected final String TEXT_1976 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1977 = "();";
  protected final String TEXT_1978 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1979 = " != null;";
  protected final String TEXT_1980 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1981 = ") != null;";
  protected final String TEXT_1982 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1983 = "() != null;";
  protected final String TEXT_1984 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1985 = " != null;";
  protected final String TEXT_1986 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1987 = ") != null;";
  protected final String TEXT_1988 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1989 = "() != null;";
  protected final String TEXT_1990 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1991 = " & ";
  protected final String TEXT_1992 = "_EFLAG) != 0) != ";
  protected final String TEXT_1993 = ";";
  protected final String TEXT_1994 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1995 = " != ";
  protected final String TEXT_1996 = ";";
  protected final String TEXT_1997 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1998 = ", ";
  protected final String TEXT_1999 = ") != ";
  protected final String TEXT_2000 = ";";
  protected final String TEXT_2001 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2002 = "() != ";
  protected final String TEXT_2003 = ";";
  protected final String TEXT_2004 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2005 = " == null ? ";
  protected final String TEXT_2006 = " != null : !";
  protected final String TEXT_2007 = ".equals(";
  protected final String TEXT_2008 = ");";
  protected final String TEXT_2009 = NL + "\t\t\t\t";
  protected final String TEXT_2010 = " ";
  protected final String TEXT_2011 = " = (";
  protected final String TEXT_2012 = ")eVirtualGet(";
  protected final String TEXT_2013 = ", ";
  protected final String TEXT_2014 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2015 = " == null ? ";
  protected final String TEXT_2016 = " != null : !";
  protected final String TEXT_2017 = ".equals(";
  protected final String TEXT_2018 = ");";
  protected final String TEXT_2019 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2020 = " == null ? ";
  protected final String TEXT_2021 = "() != null : !";
  protected final String TEXT_2022 = ".equals(";
  protected final String TEXT_2023 = "());";
  protected final String TEXT_2024 = NL + "\t\t}";
  protected final String TEXT_2025 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2026 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2027 = NL + "\t}" + NL;
  protected final String TEXT_2028 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2029 = NL + "\t@Override";
  protected final String TEXT_2030 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2031 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2032 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2033 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2034 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2035 = ": return ";
  protected final String TEXT_2036 = ";";
  protected final String TEXT_2037 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2038 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2039 = NL + "\t@Override";
  protected final String TEXT_2040 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2041 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2042 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2043 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2044 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2045 = ": return ";
  protected final String TEXT_2046 = ";";
  protected final String TEXT_2047 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2048 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2049 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2050 = NL + "\t@Override";
  protected final String TEXT_2051 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2052 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2053 = NL + "\t@Override";
  protected final String TEXT_2054 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2055 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2056 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2057 = NL + "\t@Override";
  protected final String TEXT_2058 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2059 = NL + "\t\t\tcase ";
  protected final String TEXT_2060 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2061 = ";";
  protected final String TEXT_2062 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2063 = NL + "\t@Override";
  protected final String TEXT_2064 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2065 = NL + "\t\t\tcase ";
  protected final String TEXT_2066 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2067 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2068 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2069 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2070 = NL + "\t@Override";
  protected final String TEXT_2071 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2072 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2073 = ": \");";
  protected final String TEXT_2074 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2075 = ": \");";
  protected final String TEXT_2076 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2077 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2078 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2079 = NL + "\t\tif (";
  protected final String TEXT_2080 = "(";
  protected final String TEXT_2081 = " & ";
  protected final String TEXT_2082 = "_ESETFLAG) != 0";
  protected final String TEXT_2083 = "ESet";
  protected final String TEXT_2084 = ") result.append((";
  protected final String TEXT_2085 = " & ";
  protected final String TEXT_2086 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2087 = NL + "\t\tif (";
  protected final String TEXT_2088 = "(";
  protected final String TEXT_2089 = " & ";
  protected final String TEXT_2090 = "_ESETFLAG) != 0";
  protected final String TEXT_2091 = "ESet";
  protected final String TEXT_2092 = ") result.append(";
  protected final String TEXT_2093 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2094 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2095 = ", ";
  protected final String TEXT_2096 = "));";
  protected final String TEXT_2097 = NL + "\t\tresult.append((";
  protected final String TEXT_2098 = " & ";
  protected final String TEXT_2099 = "_EFLAG) != 0);";
  protected final String TEXT_2100 = NL + "\t\tresult.append(";
  protected final String TEXT_2101 = ");";
  protected final String TEXT_2102 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2103 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2104 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2105 = " getKey()" + NL + "\t{";
  protected final String TEXT_2106 = NL + "\t\treturn new ";
  protected final String TEXT_2107 = "(getTypedKey());";
  protected final String TEXT_2108 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2109 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2110 = " key)" + NL + "\t{";
  protected final String TEXT_2111 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2112 = "(";
  protected final String TEXT_2113 = ")";
  protected final String TEXT_2114 = "key);";
  protected final String TEXT_2115 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2116 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2117 = ")key).";
  protected final String TEXT_2118 = "());";
  protected final String TEXT_2119 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2120 = ")key);";
  protected final String TEXT_2121 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2122 = " getValue()" + NL + "\t{";
  protected final String TEXT_2123 = NL + "\t\treturn new ";
  protected final String TEXT_2124 = "(getTypedValue());";
  protected final String TEXT_2125 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2126 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2127 = " setValue(";
  protected final String TEXT_2128 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2129 = " oldValue = getValue();";
  protected final String TEXT_2130 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2131 = "(";
  protected final String TEXT_2132 = ")";
  protected final String TEXT_2133 = "value);";
  protected final String TEXT_2134 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2135 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2136 = ")value).";
  protected final String TEXT_2137 = "());";
  protected final String TEXT_2138 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2139 = ")value);";
  protected final String TEXT_2140 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2141 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2142 = NL + "\tpublic ";
  protected final String TEXT_2143 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2144 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2145 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2146 = NL;
  protected final String TEXT_2147 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2148 = " create(";
  protected final String TEXT_2149 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2150 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2151 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2152 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2153 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2154 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2155 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2156 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2157 = NL + "\t@Override";
  protected final String TEXT_2158 = NL + "\tprotected ";
  protected final String TEXT_2159 = " ";
  protected final String TEXT_2160 = "Helper(";
  protected final String TEXT_2161 = " ";
  protected final String TEXT_2162 = ")" + NL + "\t{";
  protected final String TEXT_2163 = NL + "\t\t";
  protected final String TEXT_2164 = ".addAll(super.";
  protected final String TEXT_2165 = "());";
  protected final String TEXT_2166 = NL + "\t\tsuper.";
  protected final String TEXT_2167 = "Helper(";
  protected final String TEXT_2168 = ");";
  protected final String TEXT_2169 = NL + "\t\tif (isSet";
  protected final String TEXT_2170 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2171 = "<";
  protected final String TEXT_2172 = ">";
  protected final String TEXT_2173 = " i = ((";
  protected final String TEXT_2174 = ") ";
  protected final String TEXT_2175 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2176 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2177 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2178 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2179 = "<";
  protected final String TEXT_2180 = ">";
  protected final String TEXT_2181 = " i = ((";
  protected final String TEXT_2182 = ") ";
  protected final String TEXT_2183 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2184 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2185 = NL + "\t\t";
  protected final String TEXT_2186 = " ";
  protected final String TEXT_2187 = " = ";
  protected final String TEXT_2188 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2189 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2190 = "<";
  protected final String TEXT_2191 = ">";
  protected final String TEXT_2192 = " i = ((";
  protected final String TEXT_2193 = ") ";
  protected final String TEXT_2194 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2195 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2196 = NL + "\t\tif (isSet";
  protected final String TEXT_2197 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2198 = ".addAll(";
  protected final String TEXT_2199 = "());" + NL + "\t\t}";
  protected final String TEXT_2200 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2201 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2202 = ".addAll(";
  protected final String TEXT_2203 = "());" + NL + "\t\t}";
  protected final String TEXT_2204 = NL + "\t\t";
  protected final String TEXT_2205 = " ";
  protected final String TEXT_2206 = " = ";
  protected final String TEXT_2207 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2208 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2209 = ".addAll(";
  protected final String TEXT_2210 = ");" + NL + "\t\t}";
  protected final String TEXT_2211 = NL + "\t\tif (isSet";
  protected final String TEXT_2212 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2213 = ".add(";
  protected final String TEXT_2214 = "basicGet";
  protected final String TEXT_2215 = "());" + NL + "\t\t}";
  protected final String TEXT_2216 = NL + "\t\t";
  protected final String TEXT_2217 = " ";
  protected final String TEXT_2218 = " = ";
  protected final String TEXT_2219 = "basicGet";
  protected final String TEXT_2220 = "();" + NL + "\t\tif (";
  protected final String TEXT_2221 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2222 = ".add(";
  protected final String TEXT_2223 = ");" + NL + "\t\t}";
  protected final String TEXT_2224 = NL + "\t\treturn ";
  protected final String TEXT_2225 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2226 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2227 = NL;
  protected final String TEXT_2228 = NL + "\t@Override";
  protected final String TEXT_2229 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2230 = "()" + NL + "\t{";
  protected final String TEXT_2231 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2232 = "()";
  protected final String TEXT_2233 = NL + "\t\treturn isSet";
  protected final String TEXT_2234 = "()";
  protected final String TEXT_2235 = ";";
  protected final String TEXT_2236 = NL + "\t\treturn !";
  protected final String TEXT_2237 = "().isEmpty()";
  protected final String TEXT_2238 = ";";
  protected final String TEXT_2239 = NL + "\t\treturn ";
  protected final String TEXT_2240 = "basicGet";
  protected final String TEXT_2241 = "() != null";
  protected final String TEXT_2242 = ";";
  protected final String TEXT_2243 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2244 = ")";
  protected final String TEXT_2245 = ";";
  protected final String TEXT_2246 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2247 = "()";
  protected final String TEXT_2248 = ";";
  protected final String TEXT_2249 = NL + "\t\t\t|| !";
  protected final String TEXT_2250 = "().isEmpty()";
  protected final String TEXT_2251 = ";";
  protected final String TEXT_2252 = NL + "\t\t\t|| ";
  protected final String TEXT_2253 = "basicGet";
  protected final String TEXT_2254 = "() != null";
  protected final String TEXT_2255 = ";";
  protected final String TEXT_2256 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2257 = ")";
  protected final String TEXT_2258 = ";";
  protected final String TEXT_2259 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2260 = "();";
  protected final String TEXT_2261 = NL + "\t\treturn false;";
  protected final String TEXT_2262 = NL + "\t}" + NL;
  protected final String TEXT_2263 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2264 = NL;
  protected final String TEXT_2265 = NL + "\t@Override";
  protected final String TEXT_2266 = NL + "\tpublic ";
  protected final String TEXT_2267 = " ";
  protected final String TEXT_2268 = "()" + NL + "\t{";
  protected final String TEXT_2269 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2270 = " ";
  protected final String TEXT_2271 = " = (";
  protected final String TEXT_2272 = ")((";
  protected final String TEXT_2273 = ")";
  protected final String TEXT_2274 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2275 = ";";
  protected final String TEXT_2276 = NL + "\t\treturn ";
  protected final String TEXT_2277 = "();";
  protected final String TEXT_2278 = NL + "\t\treturn new ";
  protected final String TEXT_2279 = ".UnmodifiableEList";
  protected final String TEXT_2280 = "(this, ";
  protected final String TEXT_2281 = "null";
  protected final String TEXT_2282 = ", 0, ";
  protected final String TEXT_2283 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2284 = NL + "\t\treturn null;";
  protected final String TEXT_2285 = NL + "\t\treturn ";
  protected final String TEXT_2286 = "();";
  protected final String TEXT_2287 = NL + "\t}" + NL;
  protected final String TEXT_2288 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2289 = NL;
  protected final String TEXT_2290 = NL + "\t@Override";
  protected final String TEXT_2291 = NL + "\tpublic ";
  protected final String TEXT_2292 = " basicGet";
  protected final String TEXT_2293 = "()" + NL + "\t{";
  protected final String TEXT_2294 = NL + "\t\treturn null;";
  protected final String TEXT_2295 = NL + "\t\treturn ";
  protected final String TEXT_2296 = "basicGet";
  protected final String TEXT_2297 = "();";
  protected final String TEXT_2298 = NL + "\t}" + NL;
  protected final String TEXT_2299 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2300 = NL;
  protected final String TEXT_2301 = NL + "\t@Override";
  protected final String TEXT_2302 = NL + "\tpublic ";
  protected final String TEXT_2303 = " basicSet";
  protected final String TEXT_2304 = "(";
  protected final String TEXT_2305 = " new";
  protected final String TEXT_2306 = ", ";
  protected final String TEXT_2307 = " msgs)" + NL + "\t{";
  protected final String TEXT_2308 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2309 = NL + "\t\tif (new";
  protected final String TEXT_2310 = " != null && !(new";
  protected final String TEXT_2311 = " instanceof ";
  protected final String TEXT_2312 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2313 = "));" + NL + "\t\t}";
  protected final String TEXT_2314 = NL + "\t\treturn basicSet";
  protected final String TEXT_2315 = "(";
  protected final String TEXT_2316 = "(";
  protected final String TEXT_2317 = ") ";
  protected final String TEXT_2318 = "new";
  protected final String TEXT_2319 = ", msgs);";
  protected final String TEXT_2320 = NL + "\t\tset";
  protected final String TEXT_2321 = "(";
  protected final String TEXT_2322 = "(";
  protected final String TEXT_2323 = ") ";
  protected final String TEXT_2324 = "new";
  protected final String TEXT_2325 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2326 = NL + "\t}" + NL;
  protected final String TEXT_2327 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2328 = NL;
  protected final String TEXT_2329 = NL + "\t@Override";
  protected final String TEXT_2330 = NL + "\tpublic void set";
  protected final String TEXT_2331 = "(";
  protected final String TEXT_2332 = " new";
  protected final String TEXT_2333 = ")" + NL + "\t{";
  protected final String TEXT_2334 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2335 = NL + "\t\tif (new";
  protected final String TEXT_2336 = " != null && !(new";
  protected final String TEXT_2337 = " instanceof ";
  protected final String TEXT_2338 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2339 = "));" + NL + "\t\t}";
  protected final String TEXT_2340 = NL + "\t\tset";
  protected final String TEXT_2341 = "(";
  protected final String TEXT_2342 = "(";
  protected final String TEXT_2343 = ") ";
  protected final String TEXT_2344 = "new";
  protected final String TEXT_2345 = ");";
  protected final String TEXT_2346 = NL + "\t}" + NL;
  protected final String TEXT_2347 = NL;
  protected final String TEXT_2348 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2349 = "() <em>";
  protected final String TEXT_2350 = "</em>}' ";
  protected final String TEXT_2351 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2352 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2353 = "_ESUBSETS = ";
  protected final String TEXT_2354 = ";" + NL;
  protected final String TEXT_2355 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2356 = "() <em>";
  protected final String TEXT_2357 = "</em>}' ";
  protected final String TEXT_2358 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2359 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2360 = "_ESUPERSETS = ";
  protected final String TEXT_2361 = ";" + NL;
  protected final String TEXT_2362 = NL + "\t/**";
  protected final String TEXT_2363 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2364 = "}, with the specified ";
  protected final String TEXT_2365 = ", and appends it to the '<em><b>";
  protected final String TEXT_2366 = "</b></em>' ";
  protected final String TEXT_2367 = ".";
  protected final String TEXT_2368 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2369 = "}, with the specified ";
  protected final String TEXT_2370 = ", and sets the '<em><b>";
  protected final String TEXT_2371 = "</b></em>' ";
  protected final String TEXT_2372 = ".";
  protected final String TEXT_2373 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2374 = "} and appends it to the '<em><b>";
  protected final String TEXT_2375 = "</b></em>' ";
  protected final String TEXT_2376 = ".";
  protected final String TEXT_2377 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2378 = "} and sets the '<em><b>";
  protected final String TEXT_2379 = "</b></em>' ";
  protected final String TEXT_2380 = ".";
  protected final String TEXT_2381 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2382 = NL + "\t * @param ";
  protected final String TEXT_2383 = " The ";
  protected final String TEXT_2384 = " for the new {@link ";
  protected final String TEXT_2385 = "}, or <code>null</code>.";
  protected final String TEXT_2386 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2387 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2388 = "}." + NL + "\t * @see #";
  protected final String TEXT_2389 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2390 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2391 = NL + "\t";
  protected final String TEXT_2392 = " create";
  protected final String TEXT_2393 = "(";
  protected final String TEXT_2394 = ", ";
  protected final String TEXT_2395 = " eClass);" + NL;
  protected final String TEXT_2396 = NL + "\t@Override";
  protected final String TEXT_2397 = NL + "\tpublic ";
  protected final String TEXT_2398 = " create";
  protected final String TEXT_2399 = "(";
  protected final String TEXT_2400 = ", ";
  protected final String TEXT_2401 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2402 = " new";
  protected final String TEXT_2403 = " = (";
  protected final String TEXT_2404 = ") create(eClass);";
  protected final String TEXT_2405 = NL + "\t\t";
  protected final String TEXT_2406 = "().add(new";
  protected final String TEXT_2407 = ");";
  protected final String TEXT_2408 = NL + "\t\tset";
  protected final String TEXT_2409 = "(new";
  protected final String TEXT_2410 = ");";
  protected final String TEXT_2411 = NL + "\t\tint ";
  protected final String TEXT_2412 = "ListSize = 0;";
  protected final String TEXT_2413 = NL + "\t\tint ";
  protected final String TEXT_2414 = "Size = ";
  protected final String TEXT_2415 = " == null ? 0 : ";
  protected final String TEXT_2416 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2417 = "Size > ";
  protected final String TEXT_2418 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2419 = "ListSize = ";
  protected final String TEXT_2420 = "Size;";
  protected final String TEXT_2421 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2422 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2423 = ".create";
  protected final String TEXT_2424 = "(";
  protected final String TEXT_2425 = ", ";
  protected final String TEXT_2426 = "i < ";
  protected final String TEXT_2427 = "Size ? (";
  protected final String TEXT_2428 = ") ";
  protected final String TEXT_2429 = ".get(i) : null";
  protected final String TEXT_2430 = ");" + NL + "\t\t}";
  protected final String TEXT_2431 = NL + "\t\tnew";
  protected final String TEXT_2432 = ".create";
  protected final String TEXT_2433 = "(";
  protected final String TEXT_2434 = ", ";
  protected final String TEXT_2435 = ");";
  protected final String TEXT_2436 = NL + "\t\tif (";
  protected final String TEXT_2437 = " != null)";
  protected final String TEXT_2438 = NL + "\t\t\tnew";
  protected final String TEXT_2439 = ".";
  protected final String TEXT_2440 = "().addAll(";
  protected final String TEXT_2441 = ");";
  protected final String TEXT_2442 = NL + "\t\t\tnew";
  protected final String TEXT_2443 = ".set";
  protected final String TEXT_2444 = "(";
  protected final String TEXT_2445 = ");";
  protected final String TEXT_2446 = NL + "\t\treturn new";
  protected final String TEXT_2447 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2448 = NL + "\t/**";
  protected final String TEXT_2449 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2450 = "}, with the specified ";
  protected final String TEXT_2451 = ", and appends it to the '<em><b>";
  protected final String TEXT_2452 = "</b></em>' ";
  protected final String TEXT_2453 = ".";
  protected final String TEXT_2454 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2455 = "},with the specified ";
  protected final String TEXT_2456 = ", and sets the '<em><b>";
  protected final String TEXT_2457 = "</b></em>' ";
  protected final String TEXT_2458 = ".";
  protected final String TEXT_2459 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2460 = "} and appends it to the '<em><b>";
  protected final String TEXT_2461 = "</b></em>' ";
  protected final String TEXT_2462 = ".";
  protected final String TEXT_2463 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2464 = "} and sets the '<em><b>";
  protected final String TEXT_2465 = "</b></em>' ";
  protected final String TEXT_2466 = ".";
  protected final String TEXT_2467 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2468 = NL + "\t * @param ";
  protected final String TEXT_2469 = " The ";
  protected final String TEXT_2470 = " for the new {@link ";
  protected final String TEXT_2471 = "}, or <code>null</code>.";
  protected final String TEXT_2472 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2473 = "}." + NL + "\t * @see #";
  protected final String TEXT_2474 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2475 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2476 = NL + "\t";
  protected final String TEXT_2477 = " create";
  protected final String TEXT_2478 = "(";
  protected final String TEXT_2479 = ");" + NL;
  protected final String TEXT_2480 = NL + "\t@Override";
  protected final String TEXT_2481 = NL + "\tpublic ";
  protected final String TEXT_2482 = " create";
  protected final String TEXT_2483 = "(";
  protected final String TEXT_2484 = ")" + NL + "\t{";
  protected final String TEXT_2485 = NL + "\t\treturn create";
  protected final String TEXT_2486 = "(";
  protected final String TEXT_2487 = ", ";
  protected final String TEXT_2488 = ");";
  protected final String TEXT_2489 = NL + "\t\t";
  protected final String TEXT_2490 = " new";
  protected final String TEXT_2491 = " = (";
  protected final String TEXT_2492 = ") create(";
  protected final String TEXT_2493 = ");";
  protected final String TEXT_2494 = NL + "\t\t";
  protected final String TEXT_2495 = "().add(new";
  protected final String TEXT_2496 = ");";
  protected final String TEXT_2497 = NL + "\t\tset";
  protected final String TEXT_2498 = "(new";
  protected final String TEXT_2499 = ");";
  protected final String TEXT_2500 = NL + "\t\tint ";
  protected final String TEXT_2501 = "ListSize = 0;";
  protected final String TEXT_2502 = NL + "\t\tint ";
  protected final String TEXT_2503 = "Size = ";
  protected final String TEXT_2504 = " == null ? 0 : ";
  protected final String TEXT_2505 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2506 = "Size > ";
  protected final String TEXT_2507 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2508 = "ListSize = ";
  protected final String TEXT_2509 = "Size;";
  protected final String TEXT_2510 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2511 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2512 = ".create";
  protected final String TEXT_2513 = "(";
  protected final String TEXT_2514 = ", ";
  protected final String TEXT_2515 = "i < ";
  protected final String TEXT_2516 = "Size ? (";
  protected final String TEXT_2517 = ") ";
  protected final String TEXT_2518 = ".get(i) : null";
  protected final String TEXT_2519 = ");" + NL + "\t\t}";
  protected final String TEXT_2520 = NL + "\t\tnew";
  protected final String TEXT_2521 = ".create";
  protected final String TEXT_2522 = "(";
  protected final String TEXT_2523 = ", ";
  protected final String TEXT_2524 = ");";
  protected final String TEXT_2525 = NL + "\t\tif (";
  protected final String TEXT_2526 = " != null)";
  protected final String TEXT_2527 = NL + "\t\t\tnew";
  protected final String TEXT_2528 = ".";
  protected final String TEXT_2529 = "().addAll(";
  protected final String TEXT_2530 = ");";
  protected final String TEXT_2531 = NL + "\t\t\tnew";
  protected final String TEXT_2532 = ".set";
  protected final String TEXT_2533 = "(";
  protected final String TEXT_2534 = ");";
  protected final String TEXT_2535 = NL + "\t\treturn new";
  protected final String TEXT_2536 = ";";
  protected final String TEXT_2537 = NL + "\t}" + NL;
  protected final String TEXT_2538 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2539 = "} with the specified ";
  protected final String TEXT_2540 = " from the '<em><b>";
  protected final String TEXT_2541 = "</b></em>' ";
  protected final String TEXT_2542 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2543 = NL + "\t * @param ";
  protected final String TEXT_2544 = " The ";
  protected final String TEXT_2545 = " of the {@link ";
  protected final String TEXT_2546 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2547 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2548 = "} with the specified ";
  protected final String TEXT_2549 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2550 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2551 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2552 = NL + "\t";
  protected final String TEXT_2553 = " get";
  protected final String TEXT_2554 = "(";
  protected final String TEXT_2555 = ");" + NL;
  protected final String TEXT_2556 = NL + "\t@Override";
  protected final String TEXT_2557 = NL + "\tpublic ";
  protected final String TEXT_2558 = " get";
  protected final String TEXT_2559 = "(";
  protected final String TEXT_2560 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2561 = "(";
  protected final String TEXT_2562 = ", false";
  protected final String TEXT_2563 = ", null";
  protected final String TEXT_2564 = ", false";
  protected final String TEXT_2565 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2566 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2567 = "} with the specified ";
  protected final String TEXT_2568 = " from the '<em><b>";
  protected final String TEXT_2569 = "</b></em>' ";
  protected final String TEXT_2570 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2571 = NL + "\t * @param ";
  protected final String TEXT_2572 = " The ";
  protected final String TEXT_2573 = " of the {@link ";
  protected final String TEXT_2574 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2575 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2576 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2577 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2578 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2579 = "} on demand if not found.";
  protected final String TEXT_2580 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2581 = "} with the specified ";
  protected final String TEXT_2582 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2583 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2584 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2585 = NL + "\t";
  protected final String TEXT_2586 = " get";
  protected final String TEXT_2587 = "(";
  protected final String TEXT_2588 = ", boolean ignoreCase";
  protected final String TEXT_2589 = ", ";
  protected final String TEXT_2590 = " eClass";
  protected final String TEXT_2591 = ", boolean createOnDemand";
  protected final String TEXT_2592 = ");" + NL;
  protected final String TEXT_2593 = NL + "\t@Override";
  protected final String TEXT_2594 = NL + "\tpublic ";
  protected final String TEXT_2595 = " get";
  protected final String TEXT_2596 = "(";
  protected final String TEXT_2597 = ", boolean ignoreCase";
  protected final String TEXT_2598 = ", ";
  protected final String TEXT_2599 = " eClass";
  protected final String TEXT_2600 = ", boolean createOnDemand";
  protected final String TEXT_2601 = ")" + NL + "\t{";
  protected final String TEXT_2602 = NL + "\t\t";
  protected final String TEXT_2603 = "Loop: for (";
  protected final String TEXT_2604 = " ";
  protected final String TEXT_2605 = " : ";
  protected final String TEXT_2606 = "())" + NL + "\t\t{";
  protected final String TEXT_2607 = NL + "\t\t";
  protected final String TEXT_2608 = "Loop: for (";
  protected final String TEXT_2609 = " i = ";
  protected final String TEXT_2610 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2611 = " ";
  protected final String TEXT_2612 = " = (";
  protected final String TEXT_2613 = ") i.next();";
  protected final String TEXT_2614 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2615 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2616 = "Loop;";
  protected final String TEXT_2617 = NL + "\t\t\t";
  protected final String TEXT_2618 = " ";
  protected final String TEXT_2619 = "List = ";
  protected final String TEXT_2620 = ".";
  protected final String TEXT_2621 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2622 = "ListSize = ";
  protected final String TEXT_2623 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2624 = " || (";
  protected final String TEXT_2625 = " != null && ";
  protected final String TEXT_2626 = ".size() != ";
  protected final String TEXT_2627 = "ListSize";
  protected final String TEXT_2628 = ")";
  protected final String TEXT_2629 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2630 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2631 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2632 = " ";
  protected final String TEXT_2633 = " = ";
  protected final String TEXT_2634 = "(";
  protected final String TEXT_2635 = ") ";
  protected final String TEXT_2636 = "List.get(j);";
  protected final String TEXT_2637 = NL + "\t\t\t\tif (";
  protected final String TEXT_2638 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2639 = "(";
  protected final String TEXT_2640 = ")";
  protected final String TEXT_2641 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2642 = ".";
  protected final String TEXT_2643 = "()) : ";
  protected final String TEXT_2644 = ".get(j).equals(";
  protected final String TEXT_2645 = ".";
  protected final String TEXT_2646 = "())))";
  protected final String TEXT_2647 = NL + "\t\t\t\tif (";
  protected final String TEXT_2648 = " != null && !";
  protected final String TEXT_2649 = ".get(j).equals(";
  protected final String TEXT_2650 = ".";
  protected final String TEXT_2651 = "()))";
  protected final String TEXT_2652 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2653 = "Loop;";
  protected final String TEXT_2654 = NL + "\t\t\t}";
  protected final String TEXT_2655 = NL + "\t\t\t";
  protected final String TEXT_2656 = " ";
  protected final String TEXT_2657 = " = ";
  protected final String TEXT_2658 = ".";
  protected final String TEXT_2659 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2660 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2661 = "Loop;";
  protected final String TEXT_2662 = NL + "\t\t\tif (";
  protected final String TEXT_2663 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2664 = ".equalsIgnoreCase(";
  protected final String TEXT_2665 = ".";
  protected final String TEXT_2666 = "()) : ";
  protected final String TEXT_2667 = ".equals(";
  protected final String TEXT_2668 = ".";
  protected final String TEXT_2669 = "())))";
  protected final String TEXT_2670 = NL + "\t\t\tif (";
  protected final String TEXT_2671 = " != null && !";
  protected final String TEXT_2672 = ".equals(";
  protected final String TEXT_2673 = ".";
  protected final String TEXT_2674 = "()))";
  protected final String TEXT_2675 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2676 = "Loop;";
  protected final String TEXT_2677 = NL + "\t\t\tif (";
  protected final String TEXT_2678 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2679 = ".equalsIgnoreCase(";
  protected final String TEXT_2680 = ".";
  protected final String TEXT_2681 = "()) : ";
  protected final String TEXT_2682 = ".equals(";
  protected final String TEXT_2683 = ".";
  protected final String TEXT_2684 = "())))";
  protected final String TEXT_2685 = NL + "\t\t\tif (";
  protected final String TEXT_2686 = " != null && !";
  protected final String TEXT_2687 = ".equals(";
  protected final String TEXT_2688 = ".";
  protected final String TEXT_2689 = "()))";
  protected final String TEXT_2690 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2691 = "Loop;";
  protected final String TEXT_2692 = NL + "\t\t\treturn ";
  protected final String TEXT_2693 = ";" + NL + "\t\t}";
  protected final String TEXT_2694 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2695 = " && eClass != null";
  protected final String TEXT_2696 = " ? create";
  protected final String TEXT_2697 = "(";
  protected final String TEXT_2698 = ", eClass";
  protected final String TEXT_2699 = ") : null;";
  protected final String TEXT_2700 = NL + "\t\treturn null;";
  protected final String TEXT_2701 = NL + "\t}" + NL;
  protected final String TEXT_2702 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2703 = "()" + NL + "\t{" + NL + "\t//genFeature";
  protected final String TEXT_2704 = NL + "  \t\treturn false;";
  protected final String TEXT_2705 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2706 = ");";
  protected final String TEXT_2707 = NL + "\t\treturn !((";
  protected final String TEXT_2708 = ".Internal.Wrapper)";
  protected final String TEXT_2709 = "()).featureMap().isEmpty();";
  protected final String TEXT_2710 = NL + "\t\treturn ";
  protected final String TEXT_2711 = " != null && !";
  protected final String TEXT_2712 = ".featureMap().isEmpty();";
  protected final String TEXT_2713 = NL + "\t\treturn ";
  protected final String TEXT_2714 = " != null && !";
  protected final String TEXT_2715 = ".isEmpty();";
  protected final String TEXT_2716 = NL + "\t\t";
  protected final String TEXT_2717 = " ";
  protected final String TEXT_2718 = " = (";
  protected final String TEXT_2719 = ")eVirtualGet(";
  protected final String TEXT_2720 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2721 = " != null && !";
  protected final String TEXT_2722 = ".isEmpty();";
  protected final String TEXT_2723 = NL + "\t\treturn !";
  protected final String TEXT_2724 = "().isEmpty();";
  protected final String TEXT_2725 = NL + "\t\treturn ";
  protected final String TEXT_2726 = " != null;";
  protected final String TEXT_2727 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2728 = ") != null;";
  protected final String TEXT_2729 = NL + "\t\treturn basicGet";
  protected final String TEXT_2730 = "() != null;";
  protected final String TEXT_2731 = NL + "\t\treturn ";
  protected final String TEXT_2732 = " != null;";
  protected final String TEXT_2733 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2734 = ") != null;";
  protected final String TEXT_2735 = NL + "\t\treturn ";
  protected final String TEXT_2736 = "() != null;";
  protected final String TEXT_2737 = NL + "\t\treturn ((";
  protected final String TEXT_2738 = " & ";
  protected final String TEXT_2739 = "_EFLAG) != 0) != ";
  protected final String TEXT_2740 = ";";
  protected final String TEXT_2741 = NL + "\t\treturn ";
  protected final String TEXT_2742 = " != ";
  protected final String TEXT_2743 = ";";
  protected final String TEXT_2744 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2745 = ", ";
  protected final String TEXT_2746 = ") != ";
  protected final String TEXT_2747 = ";";
  protected final String TEXT_2748 = NL + "\t\treturn ";
  protected final String TEXT_2749 = "() != ";
  protected final String TEXT_2750 = ";";
  protected final String TEXT_2751 = NL + "\t\treturn ";
  protected final String TEXT_2752 = " == null ? ";
  protected final String TEXT_2753 = " != null : !";
  protected final String TEXT_2754 = ".equals(";
  protected final String TEXT_2755 = ");";
  protected final String TEXT_2756 = NL + "\t\t";
  protected final String TEXT_2757 = " ";
  protected final String TEXT_2758 = " = (";
  protected final String TEXT_2759 = ")eVirtualGet(";
  protected final String TEXT_2760 = ", ";
  protected final String TEXT_2761 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2762 = " == null ? ";
  protected final String TEXT_2763 = " != null : !";
  protected final String TEXT_2764 = ".equals(";
  protected final String TEXT_2765 = ");";
  protected final String TEXT_2766 = NL + "\t\treturn ";
  protected final String TEXT_2767 = " == null ? ";
  protected final String TEXT_2768 = "() != null : !";
  protected final String TEXT_2769 = ".equals(";
  protected final String TEXT_2770 = "());";
  protected final String TEXT_2771 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2772 = ");";
  protected final String TEXT_2773 = NL + "\t\t";
  protected final String TEXT_2774 = " ";
  protected final String TEXT_2775 = " = (";
  protected final String TEXT_2776 = ")eVirtualGet(";
  protected final String TEXT_2777 = ");";
  protected final String TEXT_2778 = NL + "\t\treturn ";
  protected final String TEXT_2779 = " != null && ((";
  protected final String TEXT_2780 = ".Unsettable";
  protected final String TEXT_2781 = ")";
  protected final String TEXT_2782 = ").isSet();";
  protected final String TEXT_2783 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2784 = ");";
  protected final String TEXT_2785 = NL + "\t\treturn (";
  protected final String TEXT_2786 = " & ";
  protected final String TEXT_2787 = "_ESETFLAG) != 0;";
  protected final String TEXT_2788 = NL + "\t\treturn ";
  protected final String TEXT_2789 = "ESet;";
  protected final String TEXT_2790 = NL + "\t\treturn !((";
  protected final String TEXT_2791 = ".Internal)((";
  protected final String TEXT_2792 = ".Internal.Wrapper)get";
  protected final String TEXT_2793 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2794 = ");";
  protected final String TEXT_2795 = NL + "\t\treturn !((";
  protected final String TEXT_2796 = ".Internal)get";
  protected final String TEXT_2797 = "()).isEmpty(";
  protected final String TEXT_2798 = ");";
  protected final String TEXT_2799 = NL;
  protected final String TEXT_2800 = NL + "\t\treturn ";
  protected final String TEXT_2801 = ".";
  protected final String TEXT_2802 = "(this);";
  protected final String TEXT_2803 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2804 = "' ";
  protected final String TEXT_2805 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2806 = NL + "\t}" + NL;
  protected final String TEXT_2807 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2808 = NL;
  protected final String TEXT_2809 = NL + "\t@Override";
  protected final String TEXT_2810 = NL + "\tpublic ";
  protected final String TEXT_2811 = " ";
  protected final String TEXT_2812 = "(";
  protected final String TEXT_2813 = ")";
  protected final String TEXT_2814 = NL + "\t{";
  protected final String TEXT_2815 = NL + "\t\t";
  protected final String TEXT_2816 = "(";
  protected final String TEXT_2817 = ");";
  protected final String TEXT_2818 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2819 = NL + "\t\treturn ";
  protected final String TEXT_2820 = "(";
  protected final String TEXT_2821 = ");";
  protected final String TEXT_2822 = NL + "\t}" + NL;
  protected final String TEXT_2823 = NL + "} //";
  protected final String TEXT_2824 = NL;

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
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_240);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_241);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_244);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast() || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_245);
    }
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_248);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_249);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_250);
    }
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_253);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_256);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_261);
    }
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_263);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_267);
    } else {
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_270);
    }
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_272);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_275);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_281);
    }
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_293);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_298);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_302);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_306);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_307);
    }
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_309);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_312);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_316);
    }
    stringBuffer.append(TEXT_317);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_320);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_326);
    }
    stringBuffer.append(TEXT_327);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_331);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_334);
    } else {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_336);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_346);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_350);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_351);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_353);
    } else {
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_355);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_358);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_360);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_362);
    } else {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_365);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_366);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_367);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_369);
    }
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_371);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_373);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_375);
    }
    stringBuffer.append(TEXT_376);
    } else {
    stringBuffer.append(TEXT_377);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_378);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_383);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_385);
    }
    stringBuffer.append(TEXT_386);
    }
    }
    } else {
    stringBuffer.append(TEXT_387);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_389);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_393);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_394);
    }
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_396);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_397);
    }
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_399);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_401);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_403);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_404);
    }
    stringBuffer.append(TEXT_405);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_407);
    }
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_409);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_411);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_414);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_415);
    }
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_425);
    }
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_427);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_429);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_433);
    }
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_443);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_444);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_447);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_448);
    }
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_460);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_461);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_463);
    }
    stringBuffer.append(TEXT_464);
    }
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_469);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_470);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_471);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_472);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_474);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_476);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_477);
    } else {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_479);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_481);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_483);
    }
    }
    }
    }
    stringBuffer.append(TEXT_484);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_486);
    } else {
    stringBuffer.append(TEXT_487);
    }
    stringBuffer.append(TEXT_488);
    }
    } else {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_491);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_492);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_493);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_494);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_495);
    }
    }
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_498);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_501);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_504);
    } else {
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_506);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_511);
    } else {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_513);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_515);
    }
    } else {
    stringBuffer.append(TEXT_516);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_517);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_519);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_520);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_521);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_523);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_525);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_527);
    } else {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_530);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_532);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_534);
    }
    }
    }
    }
    stringBuffer.append(TEXT_535);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_537);
    } else {
    stringBuffer.append(TEXT_538);
    }
    stringBuffer.append(TEXT_539);
    } else {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_542);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_543);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_544);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_545);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_546);
    }
    }
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_552);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_556);
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
    stringBuffer.append(TEXT_644);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_646);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_647);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_650);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_653);
    }
    stringBuffer.append(TEXT_654);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_658);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_668);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_672);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_675);
    }
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_680);
    }
    stringBuffer.append(TEXT_681);
    }
    stringBuffer.append(TEXT_682);
    }
    stringBuffer.append(TEXT_683);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_686);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_689);
    } else {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_694);
    }
    } else {
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_697);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_698);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getFeatureKind());
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
    } else {
    stringBuffer.append(TEXT_713);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_714);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_715);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_718);
    } else {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(TEXT_723);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_728);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_730);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_732);
    }
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_734);
    }
    stringBuffer.append(TEXT_735);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_753);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_759);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_764);
    }
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_769);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_777);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_787);
    }
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_791);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_792);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_795);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_799);
    }
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_802);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_805);
    }
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_807);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_814);
    }
    stringBuffer.append(TEXT_815);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_826);
    }
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_832);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_836);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_842);
    } else {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_847);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_852);
    } else {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_856);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_860);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_862);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_866);
    }
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_869);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_872);
    }
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_874);
    }
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
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_882);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_884);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_885);
    } else {
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_887);
    }
    stringBuffer.append(TEXT_888);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_892);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_897);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_899);
    }
    }
    }
    stringBuffer.append(TEXT_900);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_901);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_903);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_907);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_908);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_910);
    }
    stringBuffer.append(TEXT_911);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_915);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_917);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_918);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_919);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_925);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_927);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_928);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_929);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_932);
    }
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_935);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_937);
    }
    stringBuffer.append(TEXT_938);
    }
    stringBuffer.append(TEXT_939);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_944);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_946);
    }
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_948);
    }
    stringBuffer.append(TEXT_949);
    } else {
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_951);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_953);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_955);
    }
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_957);
    }
    stringBuffer.append(TEXT_958);
    }
    } else {
    stringBuffer.append(TEXT_959);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_960);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_963);
    } else {
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_966);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_967);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_968);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_969);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_970);
    }
    }
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_974);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_977);
    } else {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_982);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_984);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_990);
    } else {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_994);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_999);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1001);
    } else {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1003);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1004);
    } else {
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1006);
    }
    stringBuffer.append(TEXT_1007);
    }
    } else {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1010);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1011);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1016);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1018);
    }
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1020);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1023);
    }
    stringBuffer.append(TEXT_1024);
    } else {
    stringBuffer.append(TEXT_1025);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_1026);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1027);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1029);
    } else {
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1031);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1033);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1038);
    }
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1043);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1048);
    }
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1051);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1055);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1060);
    }
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1062);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1065);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1069);
    }
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1072);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1075);
    }
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1077);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1082);
    }
    stringBuffer.append(TEXT_1083);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1088);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1091);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1095);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1097);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1101);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1104);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1106);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1109);
    } else {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1111);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1115);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1117);
    } else {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1119);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1120);
    } else {
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1122);
    }
    stringBuffer.append(TEXT_1123);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1129);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1132);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1135);
    } else {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1137);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1141);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1146);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1147);
    } else {
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1149);
    }
    stringBuffer.append(TEXT_1150);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1155);
    } else {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1159);
    }
    } else {
    stringBuffer.append(TEXT_1160);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1163);
    } else {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1166);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1167);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1174);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1176);
    }
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1178);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1181);
    }
    stringBuffer.append(TEXT_1182);
    } else {
    stringBuffer.append(TEXT_1183);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_1184);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1185);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1187);
    } else {
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1189);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1191);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1196);
    }
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1201);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1203);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1206);
    } else {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1208);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1213);
    } else {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1217);
    }
    } else {
    stringBuffer.append(TEXT_1218);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1221);
    } else {
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1224);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1225);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1226);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1233);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1240);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1241);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1246);
    } else {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1251);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1255);
    } else {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1259);
    }
    }
    stringBuffer.append(TEXT_1260);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1264);
    }
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1268);
    } else {
    stringBuffer.append(TEXT_1269);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1272);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1273);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1274);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1275);
    }
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1278);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1279);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1283);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1286);
    } else {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1289);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1291);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1299);
    index++;}
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1303);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1304);
    }
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1308);
    }
    stringBuffer.append(TEXT_1309);
    } else {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1312);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1313);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1314);
    }
    } else {
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1316);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1320);
    } else {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1324);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1326);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1327);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1332);
    } else {
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1337);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1341);
    } else {
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1345);
    }
    }
    stringBuffer.append(TEXT_1346);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1350);
    }
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1353);
    } else {
    stringBuffer.append(TEXT_1354);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1358);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1359);
    }
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1363);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1365);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1366);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1367);
    } else {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1372);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1375);
    } else {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1378);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1380);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1388);
    index++;}
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1392);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1393);
    }
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1397);
    }
    stringBuffer.append(TEXT_1398);
    } else {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1401);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1402);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1403);
    }
    } else {
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1405);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1409);
    } else {
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1413);
    }
    }
    index++;}
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1415);
    }
    stringBuffer.append(TEXT_1416);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1421);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
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
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1434);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1435);
    }
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1441);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1442);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1443);
    }
    stringBuffer.append(TEXT_1444);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1449);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1453);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1454);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1456);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1458);
    }
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1462);
    } else {
    stringBuffer.append(TEXT_1463);
    }
    if (!isImplementation) {
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
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1472);
    }
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1476);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1478);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1479);
    }
    stringBuffer.append(TEXT_1480);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1485);
    } else {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1492);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1495);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1502);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1503);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1506);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1507);
    }
    }
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1512);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1514);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1515);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1517);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1519);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1525);
    } else {
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1530);
    }
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1532);
    index++;}
    stringBuffer.append(TEXT_1533);
    } else {
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1540);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1548);
    } else {
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1553);
    }
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1555);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1563);
    } else {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1568);
    }
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1570);
    }
    index++;}
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1572);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1573);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1574);
    }
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1577);
    }
    stringBuffer.append(TEXT_1578);
    } else {
    stringBuffer.append(TEXT_1579);
    }
    stringBuffer.append(TEXT_1580);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1582);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1583);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1585);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1588);
    } else {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1591);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1594);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1601);
    } else {
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1603);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1605);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1607);
    } else {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1609);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1611);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1613);
    } else {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1615);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1619);
    } else {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1622);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1626);
    } else {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1629);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1634);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1644);
    } else {
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1649);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1651);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1656);
    }
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1661);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1663);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1666);
    } else {
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1668);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1673);
    } else {
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1677);
    }
    } else {
    stringBuffer.append(TEXT_1678);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1681);
    } else {
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1684);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1685);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    stringBuffer.append(TEXT_1686);
    if (isInterface) {
    stringBuffer.append(TEXT_1687);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1689);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1692);
    }}
    stringBuffer.append(TEXT_1693);
    } else {
    stringBuffer.append(TEXT_1694);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1695);
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1696);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1701);
    } else {
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1706);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1712);
    } else {
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1725);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1728);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1730);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1732);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1733);
    }
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1736);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1737);
    }
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1740);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1741);
    }
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1744);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1746);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1748);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1750);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1751);
    }
    stringBuffer.append(TEXT_1752);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1754);
    }
    stringBuffer.append(TEXT_1755);
    }
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1758);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1760);
    }
    } else {
    stringBuffer.append(TEXT_1761);
    }
    }
    stringBuffer.append(TEXT_1762);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1763);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1764);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1765);
    }
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1769);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1771);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1776);
    } else {
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1778);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1779);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1782);
    } else {
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1784);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1789);
    }
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1791);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1795);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1800);
    }
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1803);
    }
    }
    stringBuffer.append(TEXT_1804);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1805);
    } else {
    stringBuffer.append(TEXT_1806);
    }
    stringBuffer.append(TEXT_1807);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1808);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1809);
    }
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1813);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1815);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1820);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1824);
    } else {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1827);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1829);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1831);
    } else {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1833);
    }
    }
    stringBuffer.append(TEXT_1834);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1835);
    } else {
    stringBuffer.append(TEXT_1836);
    }
    stringBuffer.append(TEXT_1837);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1838);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1839);
    }
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1842);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1846);
    }
    stringBuffer.append(TEXT_1847);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1848);
    } else {
    stringBuffer.append(TEXT_1849);
    }
    stringBuffer.append(TEXT_1850);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1851);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1852);
    }
    stringBuffer.append(TEXT_1853);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1855);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1857);
    } else {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1860);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1863);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1868);
    } else {
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1871);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1875);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1879);
    } else {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1881);
    }
    }
    stringBuffer.append(TEXT_1882);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1883);
    } else {
    stringBuffer.append(TEXT_1884);
    }
    stringBuffer.append(TEXT_1885);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1886);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1887);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1888);
    }
    stringBuffer.append(TEXT_1889);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1891);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1895);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1898);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments());
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1903);
    } else {
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1906);
    }
    } else {
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_1911);
    }
    stringBuffer.append(TEXT_1912);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1916);
    } else {
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1918);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType())) {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1920);
    }
    stringBuffer.append(TEXT_1921);
    }
    stringBuffer.append(TEXT_1922);
    }
    stringBuffer.append(TEXT_1923);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1924);
    } else {
    stringBuffer.append(TEXT_1925);
    }
    stringBuffer.append(TEXT_1926);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1927);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1928);
    }
    stringBuffer.append(TEXT_1929);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1931);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1934);
    } else {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1936);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1938);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1941);
    } else {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1944);
    }
    stringBuffer.append(TEXT_1945);
    }
    stringBuffer.append(TEXT_1946);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1947);
    } else {
    stringBuffer.append(TEXT_1948);
    }
    stringBuffer.append(TEXT_1949);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(TEXT_1951);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1952);
    }
    stringBuffer.append(TEXT_1953);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1955);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1957);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1960);
    } else {
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1963);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1966);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1973);
    } else {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1975);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1977);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1979);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1981);
    } else {
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1983);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1985);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1987);
    } else {
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1989);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1993);
    } else {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1996);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2000);
    } else {
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2003);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2008);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2018);
    } else {
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2023);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2024);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2025);
    } else {
    stringBuffer.append(TEXT_2026);
    }
    stringBuffer.append(TEXT_2027);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2028);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2029);
    }
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2031);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2033);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2036);
    }
    stringBuffer.append(TEXT_2037);
    }
    stringBuffer.append(TEXT_2038);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2039);
    }
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2041);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2043);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2046);
    }
    stringBuffer.append(TEXT_2047);
    }
    stringBuffer.append(TEXT_2048);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2049);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2050);
    }
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2052);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2053);
    }
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2055);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2056);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2057);
    }
    stringBuffer.append(TEXT_2058);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2061);
    }
    stringBuffer.append(TEXT_2062);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2063);
    }
    stringBuffer.append(TEXT_2064);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2067);
    }
    stringBuffer.append(TEXT_2068);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2069);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2070);
    }
    stringBuffer.append(TEXT_2071);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2079);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2082);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2083);
    }
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2087);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2090);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2091);
    }
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2096);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2099);
    } else {
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2101);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2102);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType() : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType() : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2105);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2107);
    } else {
    stringBuffer.append(TEXT_2108);
    }
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2110);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2111);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2113);
    }
    stringBuffer.append(TEXT_2114);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2115);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2118);
    } else {
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_2120);
    }
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2122);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2124);
    } else {
    stringBuffer.append(TEXT_2125);
    }
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2129);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2130);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2132);
    }
    stringBuffer.append(TEXT_2133);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2134);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2137);
    } else {
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_2139);
    }
    stringBuffer.append(TEXT_2140);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2141);
    }
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2145);
    }
    stringBuffer.append(TEXT_2146);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2150);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2155);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2156);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2157);
    }
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2162);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2165);
    } else {
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2168);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(subsetGenFeature.getAccessorName());
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
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2180);
    }
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2184);
    } else {
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2191);
    }
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2195);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2199);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2203);
    } else {
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2210);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2213);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2215);
    } else {
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2218);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2223);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2225);
    }
    }
    }
    stringBuffer.append(TEXT_2226);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //isSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2227);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2228);
    }
    }
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2230);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2232);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2234);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2235);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2237);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2238);
    }
    } else {
    stringBuffer.append(TEXT_2239);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2241);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2242);
    }
    }
    } else {
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2244);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2245);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2247);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2248);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2250);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2251);
    }
    } else {
    stringBuffer.append(TEXT_2252);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2254);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2255);
    }
    }
    } else {
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2257);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2258);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2260);
    } else {
    stringBuffer.append(TEXT_2261);
    }
    }
    stringBuffer.append(TEXT_2262);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2263);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //getGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2264);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2265);
    }
    }
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2268);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType().equals(genFeature.getListItemType())) {
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2275);
    } else {
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2277);
    }
    } else {
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2279);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType() + ">");
    }
    stringBuffer.append(TEXT_2280);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2281);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2283);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2284);
    } else {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2286);
    }
    }
    stringBuffer.append(TEXT_2287);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2288);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2289);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2290);
    }
    }
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2293);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2294);
    } else {
    stringBuffer.append(TEXT_2295);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2297);
    }
    stringBuffer.append(TEXT_2298);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2299);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2300);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2301);
    }
    }
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2307);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2308);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2313);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2315);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2317);
    }
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2319);
    } else {
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2321);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2323);
    }
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2325);
    }
    }
    stringBuffer.append(TEXT_2326);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2327);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //setGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2328);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2329);
    }
    }
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2333);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2334);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2339);
    }
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2341);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2343);
    }
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2345);
    }
    stringBuffer.append(TEXT_2346);
    }
    stringBuffer.append(TEXT_2347);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2354);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2361);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2362);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2367);
    } else {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2372);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2376);
    } else {
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2380);
    }
    }
    stringBuffer.append(TEXT_2381);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2385);
    }
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2389);
    } else {
    stringBuffer.append(TEXT_2390);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2393);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2394);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2395);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2396);
    }
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2399);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2400);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2404);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2407);
    } else {
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2410);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2412);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2420);
    index++;}
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2424);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2425);
    }
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2429);
    }
    stringBuffer.append(TEXT_2430);
    } else {
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2433);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2434);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2435);
    }
    } else {
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2437);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2441);
    } else {
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2445);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2447);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2448);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2453);
    } else {
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2458);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2462);
    } else {
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2466);
    }
    }
    stringBuffer.append(TEXT_2467);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2471);
    }
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2474);
    } else {
    stringBuffer.append(TEXT_2475);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2479);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2480);
    }
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2484);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2486);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2487);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2488);
    } else {
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2493);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2496);
    } else {
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2499);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2501);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2509);
    index++;}
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2513);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2514);
    }
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2518);
    }
    stringBuffer.append(TEXT_2519);
    } else {
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2522);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2523);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2524);
    }
    } else {
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2526);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2530);
    } else {
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2534);
    }
    }
    index++;}
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2536);
    }
    stringBuffer.append(TEXT_2537);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2542);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2546);
    }
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2550);
    } else {
    stringBuffer.append(TEXT_2551);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2555);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2556);
    }
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2562);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2563);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2564);
    }
    stringBuffer.append(TEXT_2565);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2570);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2574);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2575);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2577);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2579);
    }
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2583);
    } else {
    stringBuffer.append(TEXT_2584);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2588);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2590);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2591);
    }
    stringBuffer.append(TEXT_2592);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2593);
    }
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
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType()));
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2606);
    } else {
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2613);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2616);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2623);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2624);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2627);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2628);
    }
    }
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2633);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2635);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2636);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2638);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2640);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2646);
    } else {
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2651);
    }
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2653);
    index++;}
    stringBuffer.append(TEXT_2654);
    } else {
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2661);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2669);
    } else {
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2674);
    }
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2676);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2684);
    } else {
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2689);
    }
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2691);
    }
    index++;}
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2693);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2694);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2695);
    }
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2698);
    }
    stringBuffer.append(TEXT_2699);
    } else {
    stringBuffer.append(TEXT_2700);
    }
    stringBuffer.append(TEXT_2701);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2703);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2704);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2706);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2709);
    } else {
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2712);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2715);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2722);
    } else {
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2724);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2726);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2728);
    } else {
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2730);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2732);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2734);
    } else {
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2736);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2740);
    } else {
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2743);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2747);
    } else {
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2750);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2755);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2765);
    } else {
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2770);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2772);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2777);
    }
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2782);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2784);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2787);
    } else {
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2789);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2794);
    } else {
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2798);
    }
    } else {
    stringBuffer.append(TEXT_2799);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2802);
    } else {
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2805);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2806);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2807);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    stringBuffer.append(TEXT_2808);
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2809);
    }
    }
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2814);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2817);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2818);
    } else {
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2821);
    }
    }
    stringBuffer.append(TEXT_2822);
    }
    }
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2824);
    return stringBuffer.toString();
  }
}
