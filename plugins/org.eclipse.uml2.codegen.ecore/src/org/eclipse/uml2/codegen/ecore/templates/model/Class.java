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
  protected final String TEXT_5 = NL + " */" + NL + "package ";
  protected final String TEXT_6 = ";" + NL;
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_8 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_9 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_10 = NL + " *   <li>{@link ";
  protected final String TEXT_11 = "#";
  protected final String TEXT_12 = " <em>";
  protected final String TEXT_13 = "</em>}</li>";
  protected final String TEXT_14 = NL + " * </ul>";
  protected final String TEXT_15 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */" + NL + "public";
  protected final String TEXT_16 = " abstract";
  protected final String TEXT_17 = " class ";
  protected final String TEXT_18 = NL + "{";
  protected final String TEXT_19 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_20 = " copyright = \"";
  protected final String TEXT_21 = "\";";
  protected final String TEXT_22 = NL;
  protected final String TEXT_23 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_24 = " mofDriverNumber = \"";
  protected final String TEXT_25 = "\";";
  protected final String TEXT_26 = NL;
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_28 = " = 0;" + NL;
  protected final String TEXT_29 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_30 = "() <em>";
  protected final String TEXT_31 = "</em>}' ";
  protected final String TEXT_32 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_33 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_34 = " ";
  protected final String TEXT_35 = " = null;" + NL;
  protected final String TEXT_36 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_37 = "() <em>";
  protected final String TEXT_38 = "</em>}' ";
  protected final String TEXT_39 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_40 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_41 = " ";
  protected final String TEXT_42 = "_EDEFAULT = ";
  protected final String TEXT_43 = ";";
  protected final String TEXT_44 = NL;
  protected final String TEXT_45 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_46 = " = 0;" + NL;
  protected final String TEXT_47 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_48 = "() <em>";
  protected final String TEXT_49 = "</em>}' ";
  protected final String TEXT_50 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_51 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_52 = "_EFLAG = 1 ";
  protected final String TEXT_53 = ";" + NL;
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_55 = "() <em>";
  protected final String TEXT_56 = "</em>}' ";
  protected final String TEXT_57 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_58 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_59 = " ";
  protected final String TEXT_60 = " = ";
  protected final String TEXT_61 = "_EDEFAULT;" + NL;
  protected final String TEXT_62 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_63 = " = 0;" + NL;
  protected final String TEXT_64 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_65 = " ";
  protected final String TEXT_66 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_67 = "_ESETFLAG = 1 ";
  protected final String TEXT_68 = ";" + NL;
  protected final String TEXT_69 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_70 = " ";
  protected final String TEXT_71 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_72 = "ESet = false;" + NL;
  protected final String TEXT_73 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_74 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_75 = NL + "\t\t";
  protected final String TEXT_76 = " |= ";
  protected final String TEXT_77 = "_EFLAG;";
  protected final String TEXT_78 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_79 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_80 = ".eINSTANCE.get";
  protected final String TEXT_81 = "();" + NL + "\t}" + NL;
  protected final String TEXT_82 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_83 = " ";
  protected final String TEXT_84 = "()" + NL + "\t{";
  protected final String TEXT_85 = NL + "\t\treturn ";
  protected final String TEXT_86 = "(";
  protected final String TEXT_87 = "(";
  protected final String TEXT_88 = ")eGet(";
  protected final String TEXT_89 = ".eINSTANCE.get";
  protected final String TEXT_90 = "(), true)";
  protected final String TEXT_91 = ").";
  protected final String TEXT_92 = "()";
  protected final String TEXT_93 = ";";
  protected final String TEXT_94 = NL + "\t\tif (";
  protected final String TEXT_95 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_96 = " = new ";
  protected final String TEXT_97 = ";" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_98 = ";";
  protected final String TEXT_99 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_100 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_101 = ")eContainer;";
  protected final String TEXT_102 = NL + "\t\tif (";
  protected final String TEXT_103 = " != null && ";
  protected final String TEXT_104 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_105 = " old";
  protected final String TEXT_106 = " = ";
  protected final String TEXT_107 = ";" + NL + "\t\t\t";
  protected final String TEXT_108 = " = ";
  protected final String TEXT_109 = "eResolveProxy((";
  protected final String TEXT_110 = ")";
  protected final String TEXT_111 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_112 = " != old";
  protected final String TEXT_113 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_114 = "(this, ";
  protected final String TEXT_115 = ".RESOLVE, ";
  protected final String TEXT_116 = ", old";
  protected final String TEXT_117 = ", ";
  protected final String TEXT_118 = "));" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_119 = NL + "\t\treturn (";
  protected final String TEXT_120 = " & ";
  protected final String TEXT_121 = "_EFLAG) != 0;";
  protected final String TEXT_122 = NL + "\t\treturn ";
  protected final String TEXT_123 = ";";
  protected final String TEXT_124 = NL + "\t\t";
  protected final String TEXT_125 = " ";
  protected final String TEXT_126 = " = basicGet";
  protected final String TEXT_127 = "();" + NL + "\t\treturn ";
  protected final String TEXT_128 = " == null ? null : (";
  protected final String TEXT_129 = ".eIsProxy() ? ";
  protected final String TEXT_130 = "eResolveProxy((";
  protected final String TEXT_131 = ")";
  protected final String TEXT_132 = ") : ";
  protected final String TEXT_133 = ");";
  protected final String TEXT_134 = NL + "\t\treturn new ";
  protected final String TEXT_135 = "((";
  protected final String TEXT_136 = ")((";
  protected final String TEXT_137 = ")get";
  protected final String TEXT_138 = "()).featureMap().list(";
  protected final String TEXT_139 = "()));";
  protected final String TEXT_140 = NL + "\t\treturn (";
  protected final String TEXT_141 = ")((";
  protected final String TEXT_142 = ")get";
  protected final String TEXT_143 = "()).list(";
  protected final String TEXT_144 = "());";
  protected final String TEXT_145 = NL + "\t\treturn ((";
  protected final String TEXT_146 = ")get";
  protected final String TEXT_147 = "()).featureMap().list(";
  protected final String TEXT_148 = "());";
  protected final String TEXT_149 = NL + "\t\treturn ((";
  protected final String TEXT_150 = ")get";
  protected final String TEXT_151 = "()).list(";
  protected final String TEXT_152 = "());";
  protected final String TEXT_153 = NL + "\t\treturn ";
  protected final String TEXT_154 = "(";
  protected final String TEXT_155 = "(";
  protected final String TEXT_156 = ")((";
  protected final String TEXT_157 = ")get";
  protected final String TEXT_158 = "()).featureMap().get(";
  protected final String TEXT_159 = "(), true)";
  protected final String TEXT_160 = ").";
  protected final String TEXT_161 = "()";
  protected final String TEXT_162 = ";";
  protected final String TEXT_163 = NL + "\t\treturn ";
  protected final String TEXT_164 = "(";
  protected final String TEXT_165 = "(";
  protected final String TEXT_166 = ")get";
  protected final String TEXT_167 = "().get(";
  protected final String TEXT_168 = "(), true)";
  protected final String TEXT_169 = ").";
  protected final String TEXT_170 = "()";
  protected final String TEXT_171 = ";";
  protected final String TEXT_172 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_173 = "' ";
  protected final String TEXT_174 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_175 = NL + "\t}" + NL;
  protected final String TEXT_176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_177 = " basicGet";
  protected final String TEXT_178 = "()" + NL + "\t{";
  protected final String TEXT_179 = NL + "\t\treturn ";
  protected final String TEXT_180 = ";";
  protected final String TEXT_181 = NL + "\t\treturn (";
  protected final String TEXT_182 = ")((";
  protected final String TEXT_183 = ")get";
  protected final String TEXT_184 = "()).featureMap().get(";
  protected final String TEXT_185 = "(), false);";
  protected final String TEXT_186 = NL + "\t\treturn (";
  protected final String TEXT_187 = ")get";
  protected final String TEXT_188 = "().get(";
  protected final String TEXT_189 = "(), false);";
  protected final String TEXT_190 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_191 = "' ";
  protected final String TEXT_192 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_193 = NL + "\t}" + NL;
  protected final String TEXT_194 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_195 = " basicSet";
  protected final String TEXT_196 = "(";
  protected final String TEXT_197 = " new";
  protected final String TEXT_198 = ", ";
  protected final String TEXT_199 = " msgs)" + NL + "\t{";
  protected final String TEXT_200 = NL;
  protected final String TEXT_201 = NL + "\t\tif (new";
  protected final String TEXT_202 = " != null && !";
  protected final String TEXT_203 = "().contains(new";
  protected final String TEXT_204 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_205 = "().add(new";
  protected final String TEXT_206 = ");" + NL + "\t\t}";
  protected final String TEXT_207 = NL + "\t\t";
  protected final String TEXT_208 = " old";
  protected final String TEXT_209 = " = ";
  protected final String TEXT_210 = ";" + NL + "\t\t";
  protected final String TEXT_211 = " = new";
  protected final String TEXT_212 = ";";
  protected final String TEXT_213 = NL + "\t\tboolean old";
  protected final String TEXT_214 = "ESet = (";
  protected final String TEXT_215 = " & ";
  protected final String TEXT_216 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_217 = " |= ";
  protected final String TEXT_218 = "_ESETFLAG;";
  protected final String TEXT_219 = NL + "\t\tboolean old";
  protected final String TEXT_220 = "ESet = ";
  protected final String TEXT_221 = "ESet;" + NL + "\t\t";
  protected final String TEXT_222 = "ESet = true;";
  protected final String TEXT_223 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_224 = NL + "\t\t\t";
  protected final String TEXT_225 = " notification = new ";
  protected final String TEXT_226 = "(this, ";
  protected final String TEXT_227 = ".SET, ";
  protected final String TEXT_228 = ", old";
  protected final String TEXT_229 = ", new";
  protected final String TEXT_230 = ", !old";
  protected final String TEXT_231 = "ESet);";
  protected final String TEXT_232 = NL + "\t\t\t";
  protected final String TEXT_233 = " notification = new ";
  protected final String TEXT_234 = "(this, ";
  protected final String TEXT_235 = ".SET, ";
  protected final String TEXT_236 = ", old";
  protected final String TEXT_237 = ", new";
  protected final String TEXT_238 = ");";
  protected final String TEXT_239 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_240 = NL;
  protected final String TEXT_241 = NL + "\t\tif (";
  protected final String TEXT_242 = " != null && ";
  protected final String TEXT_243 = " != new";
  protected final String TEXT_244 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_245 = "(null);" + NL + "\t\t}";
  protected final String TEXT_246 = NL + "\t\tif (new";
  protected final String TEXT_247 = " != null ||  old";
  protected final String TEXT_248 = " == ";
  protected final String TEXT_249 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_250 = "(new";
  protected final String TEXT_251 = ");" + NL + "\t\t}";
  protected final String TEXT_252 = NL + "\t\treturn msgs;";
  protected final String TEXT_253 = NL + "\t\treturn ((";
  protected final String TEXT_254 = ".Internal)((";
  protected final String TEXT_255 = ")get";
  protected final String TEXT_256 = "()).featureMap()).basicAdd(";
  protected final String TEXT_257 = "(), new";
  protected final String TEXT_258 = ", msgs);";
  protected final String TEXT_259 = NL + "\t\treturn ((";
  protected final String TEXT_260 = ".Internal)get";
  protected final String TEXT_261 = "()).basicAdd(";
  protected final String TEXT_262 = "(), new";
  protected final String TEXT_263 = ", msgs);";
  protected final String TEXT_264 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_265 = "' ";
  protected final String TEXT_266 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_267 = NL + "\t}" + NL;
  protected final String TEXT_268 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_269 = "(";
  protected final String TEXT_270 = " new";
  protected final String TEXT_271 = ")" + NL + "\t{";
  protected final String TEXT_272 = NL;
  protected final String TEXT_273 = NL + "\t\tnew";
  protected final String TEXT_274 = " = new";
  protected final String TEXT_275 = " == null ? ";
  protected final String TEXT_276 = "_EDEFAULT : new";
  protected final String TEXT_277 = ";";
  protected final String TEXT_278 = NL + "\t\tif (new";
  protected final String TEXT_279 = " != null && !";
  protected final String TEXT_280 = "().contains(new";
  protected final String TEXT_281 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_282 = "().add(new";
  protected final String TEXT_283 = ");" + NL + "\t\t}";
  protected final String TEXT_284 = NL + "\t\t";
  protected final String TEXT_285 = " old";
  protected final String TEXT_286 = " = eContainer;";
  protected final String TEXT_287 = NL + "\t\teSet(";
  protected final String TEXT_288 = ".eINSTANCE.get";
  protected final String TEXT_289 = "(), ";
  protected final String TEXT_290 = "new ";
  protected final String TEXT_291 = "(";
  protected final String TEXT_292 = "new";
  protected final String TEXT_293 = ")";
  protected final String TEXT_294 = ");";
  protected final String TEXT_295 = NL + "\t\tif (new";
  protected final String TEXT_296 = " != eContainer || (eContainerFeatureID != ";
  protected final String TEXT_297 = " && new";
  protected final String TEXT_298 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_299 = ".isAncestor(this, ";
  protected final String TEXT_300 = "new";
  protected final String TEXT_301 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_302 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_303 = NL + "\t\t\t";
  protected final String TEXT_304 = " msgs = null;" + NL + "\t\t\tif (eContainer != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_305 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_306 = ")new";
  protected final String TEXT_307 = ").eInverseAdd(this, ";
  protected final String TEXT_308 = ", ";
  protected final String TEXT_309 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_310 = ")new";
  protected final String TEXT_311 = ", ";
  protected final String TEXT_312 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_313 = "(this, ";
  protected final String TEXT_314 = ".SET, ";
  protected final String TEXT_315 = ", new";
  protected final String TEXT_316 = ", new";
  protected final String TEXT_317 = "));";
  protected final String TEXT_318 = NL + "\t\tif (new";
  protected final String TEXT_319 = " != ";
  protected final String TEXT_320 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_321 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_322 = " != null)";
  protected final String TEXT_323 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_324 = ")";
  protected final String TEXT_325 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_326 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_327 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_328 = ")new";
  protected final String TEXT_329 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_330 = ", null, msgs);";
  protected final String TEXT_331 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_332 = ")";
  protected final String TEXT_333 = ").eInverseRemove(this, ";
  protected final String TEXT_334 = ", ";
  protected final String TEXT_335 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_336 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_337 = ")new";
  protected final String TEXT_338 = ").eInverseAdd(this, ";
  protected final String TEXT_339 = ", ";
  protected final String TEXT_340 = ".class, msgs);";
  protected final String TEXT_341 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_342 = "(";
  protected final String TEXT_343 = "new";
  protected final String TEXT_344 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_345 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_346 = NL + "\t\tboolean old";
  protected final String TEXT_347 = "ESet = (";
  protected final String TEXT_348 = " & ";
  protected final String TEXT_349 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_350 = " |= ";
  protected final String TEXT_351 = "_ESETFLAG;";
  protected final String TEXT_352 = NL + "\t\t\tboolean old";
  protected final String TEXT_353 = "ESet = ";
  protected final String TEXT_354 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_355 = "ESet = true;";
  protected final String TEXT_356 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_357 = "(this, ";
  protected final String TEXT_358 = ".SET, ";
  protected final String TEXT_359 = ", new";
  protected final String TEXT_360 = ", new";
  protected final String TEXT_361 = ", !old";
  protected final String TEXT_362 = "ESet));" + NL + "    \t}";
  protected final String TEXT_363 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_364 = "(this, ";
  protected final String TEXT_365 = ".SET, ";
  protected final String TEXT_366 = ", new";
  protected final String TEXT_367 = ", new";
  protected final String TEXT_368 = "));";
  protected final String TEXT_369 = NL + "\t\t";
  protected final String TEXT_370 = " old";
  protected final String TEXT_371 = " = (";
  protected final String TEXT_372 = " & ";
  protected final String TEXT_373 = "_EFLAG) != 0;" + NL + "\t\tif (new";
  protected final String TEXT_374 = ") ";
  protected final String TEXT_375 = " |= ";
  protected final String TEXT_376 = "_EFLAG; else ";
  protected final String TEXT_377 = " &= ~";
  protected final String TEXT_378 = "_EFLAG;";
  protected final String TEXT_379 = NL + "\t\t";
  protected final String TEXT_380 = " old";
  protected final String TEXT_381 = " = ";
  protected final String TEXT_382 = ";";
  protected final String TEXT_383 = NL + "\t\t";
  protected final String TEXT_384 = " = new";
  protected final String TEXT_385 = " == null ? ";
  protected final String TEXT_386 = "_EDEFAULT : new";
  protected final String TEXT_387 = ";";
  protected final String TEXT_388 = NL + "\t\t";
  protected final String TEXT_389 = " = ";
  protected final String TEXT_390 = "new";
  protected final String TEXT_391 = ";";
  protected final String TEXT_392 = NL + "\t\tboolean old";
  protected final String TEXT_393 = "ESet = (";
  protected final String TEXT_394 = " & ";
  protected final String TEXT_395 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_396 = " |= ";
  protected final String TEXT_397 = "_ESETFLAG;";
  protected final String TEXT_398 = NL + "\t\tboolean old";
  protected final String TEXT_399 = "ESet = ";
  protected final String TEXT_400 = "ESet;" + NL + "\t\t";
  protected final String TEXT_401 = "ESet = true;";
  protected final String TEXT_402 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_403 = "(this, ";
  protected final String TEXT_404 = ".SET, ";
  protected final String TEXT_405 = ", old";
  protected final String TEXT_406 = ", ";
  protected final String TEXT_407 = "new";
  protected final String TEXT_408 = ", !old";
  protected final String TEXT_409 = "ESet));";
  protected final String TEXT_410 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_411 = "(this, ";
  protected final String TEXT_412 = ".SET, ";
  protected final String TEXT_413 = ", old";
  protected final String TEXT_414 = ", ";
  protected final String TEXT_415 = "new";
  protected final String TEXT_416 = "));";
  protected final String TEXT_417 = NL;
  protected final String TEXT_418 = NL + "\t\tif (";
  protected final String TEXT_419 = " != null && ";
  protected final String TEXT_420 = " != new";
  protected final String TEXT_421 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_422 = "(null);" + NL + "\t\t}";
  protected final String TEXT_423 = NL + "\t\tif (new";
  protected final String TEXT_424 = " != null || old";
  protected final String TEXT_425 = " == ";
  protected final String TEXT_426 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_427 = "(new";
  protected final String TEXT_428 = ");" + NL + "\t\t}";
  protected final String TEXT_429 = NL + "\t\t((";
  protected final String TEXT_430 = ".Internal)((";
  protected final String TEXT_431 = ")get";
  protected final String TEXT_432 = "()).featureMap()).set(";
  protected final String TEXT_433 = "(), ";
  protected final String TEXT_434 = "new ";
  protected final String TEXT_435 = "(";
  protected final String TEXT_436 = "new";
  protected final String TEXT_437 = ")";
  protected final String TEXT_438 = ");";
  protected final String TEXT_439 = NL + "\t\t((";
  protected final String TEXT_440 = ".Internal)get";
  protected final String TEXT_441 = "()).set(";
  protected final String TEXT_442 = "(), ";
  protected final String TEXT_443 = "new ";
  protected final String TEXT_444 = "(";
  protected final String TEXT_445 = "new";
  protected final String TEXT_446 = ")";
  protected final String TEXT_447 = ");";
  protected final String TEXT_448 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_449 = "' ";
  protected final String TEXT_450 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_451 = NL + "\t}" + NL;
  protected final String TEXT_452 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_453 = " basicUnset";
  protected final String TEXT_454 = "(";
  protected final String TEXT_455 = " msgs)" + NL + "\t{";
  protected final String TEXT_456 = NL + "\t\t";
  protected final String TEXT_457 = " old";
  protected final String TEXT_458 = " = ";
  protected final String TEXT_459 = ";" + NL + "\t\t";
  protected final String TEXT_460 = " = null;";
  protected final String TEXT_461 = NL + "\t\tboolean old";
  protected final String TEXT_462 = "ESet = (";
  protected final String TEXT_463 = " & ";
  protected final String TEXT_464 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_465 = " &= ~";
  protected final String TEXT_466 = "_ESETFLAG;";
  protected final String TEXT_467 = NL + "\t\tboolean old";
  protected final String TEXT_468 = "ESet = ";
  protected final String TEXT_469 = "ESet;" + NL + "\t\t";
  protected final String TEXT_470 = "ESet = false;";
  protected final String TEXT_471 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_472 = " notification = new ";
  protected final String TEXT_473 = "(this, ";
  protected final String TEXT_474 = ".UNSET, ";
  protected final String TEXT_475 = ", old";
  protected final String TEXT_476 = ", null, old";
  protected final String TEXT_477 = "ESet);" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_478 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_479 = "' ";
  protected final String TEXT_480 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_481 = NL + "\t}" + NL;
  protected final String TEXT_482 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void unset";
  protected final String TEXT_483 = "()" + NL + "\t{";
  protected final String TEXT_484 = NL + "\t\teUnset(";
  protected final String TEXT_485 = ".eINSTANCE.get";
  protected final String TEXT_486 = "());";
  protected final String TEXT_487 = NL + "\t\t((";
  protected final String TEXT_488 = ".Unsettable)get";
  protected final String TEXT_489 = "()).unset();";
  protected final String TEXT_490 = NL + "\t\tif (";
  protected final String TEXT_491 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_492 = " msgs = null;";
  protected final String TEXT_493 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_494 = ")";
  protected final String TEXT_495 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_496 = ", null, msgs);";
  protected final String TEXT_497 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_498 = ")";
  protected final String TEXT_499 = ").eInverseRemove(this, ";
  protected final String TEXT_500 = ", ";
  protected final String TEXT_501 = ".class, msgs);";
  protected final String TEXT_502 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_503 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_504 = NL + "\t\t\tboolean old";
  protected final String TEXT_505 = "ESet = (";
  protected final String TEXT_506 = " & ";
  protected final String TEXT_507 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_508 = " &= ~";
  protected final String TEXT_509 = "_ESETFLAG;";
  protected final String TEXT_510 = NL + "\t\t\tboolean old";
  protected final String TEXT_511 = "ESet = ";
  protected final String TEXT_512 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_513 = "ESet = false;";
  protected final String TEXT_514 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_515 = "(this, ";
  protected final String TEXT_516 = ".UNSET, ";
  protected final String TEXT_517 = ", null, null, old";
  protected final String TEXT_518 = "ESet));" + NL + "    \t}";
  protected final String TEXT_519 = NL + "\t\t";
  protected final String TEXT_520 = " old";
  protected final String TEXT_521 = " = (";
  protected final String TEXT_522 = " & ";
  protected final String TEXT_523 = "_EFLAG) != 0;";
  protected final String TEXT_524 = NL + "\t\t";
  protected final String TEXT_525 = " old";
  protected final String TEXT_526 = " = ";
  protected final String TEXT_527 = ";";
  protected final String TEXT_528 = NL + "\t\tboolean old";
  protected final String TEXT_529 = "ESet = (";
  protected final String TEXT_530 = " & ";
  protected final String TEXT_531 = "_ESETFLAG) != 0;";
  protected final String TEXT_532 = NL + "\t\tboolean old";
  protected final String TEXT_533 = "ESet = ";
  protected final String TEXT_534 = "ESet;";
  protected final String TEXT_535 = NL + "\t\t";
  protected final String TEXT_536 = " = null;";
  protected final String TEXT_537 = NL + "\t\t";
  protected final String TEXT_538 = " &= ~";
  protected final String TEXT_539 = "_ESETFLAG;";
  protected final String TEXT_540 = NL + "\t\t";
  protected final String TEXT_541 = "ESet = false;";
  protected final String TEXT_542 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_543 = "(this, ";
  protected final String TEXT_544 = ".UNSET, ";
  protected final String TEXT_545 = ", old";
  protected final String TEXT_546 = ", null, old";
  protected final String TEXT_547 = "ESet));";
  protected final String TEXT_548 = NL + "\t\tif (";
  protected final String TEXT_549 = "_EDEFAULT) ";
  protected final String TEXT_550 = " |= ";
  protected final String TEXT_551 = "_EFLAG; else ";
  protected final String TEXT_552 = " &= ~";
  protected final String TEXT_553 = "_EFLAG;";
  protected final String TEXT_554 = NL + "\t\t";
  protected final String TEXT_555 = " = ";
  protected final String TEXT_556 = "_EDEFAULT;";
  protected final String TEXT_557 = NL + "\t\t";
  protected final String TEXT_558 = " &= ~";
  protected final String TEXT_559 = "_ESETFLAG;";
  protected final String TEXT_560 = NL + "\t\t";
  protected final String TEXT_561 = "ESet = false;";
  protected final String TEXT_562 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_563 = "(this, ";
  protected final String TEXT_564 = ".UNSET, ";
  protected final String TEXT_565 = ", old";
  protected final String TEXT_566 = ", ";
  protected final String TEXT_567 = "_EDEFAULT, old";
  protected final String TEXT_568 = "ESet));";
  protected final String TEXT_569 = NL + "\t\t((";
  protected final String TEXT_570 = ".Internal)((";
  protected final String TEXT_571 = ")get";
  protected final String TEXT_572 = "()).featureMap()).clear(";
  protected final String TEXT_573 = "());";
  protected final String TEXT_574 = NL + "\t\t((";
  protected final String TEXT_575 = ".Internal)get";
  protected final String TEXT_576 = "()).clear(";
  protected final String TEXT_577 = "());";
  protected final String TEXT_578 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_579 = "' ";
  protected final String TEXT_580 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_581 = NL + "\t}" + NL;
  protected final String TEXT_582 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_583 = "()" + NL + "\t{";
  protected final String TEXT_584 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_585 = ".eINSTANCE.get";
  protected final String TEXT_586 = "());";
  protected final String TEXT_587 = NL + "\t\treturn ";
  protected final String TEXT_588 = " != null && ((";
  protected final String TEXT_589 = ".Unsettable)";
  protected final String TEXT_590 = ").isSet();";
  protected final String TEXT_591 = NL + "\t\treturn (";
  protected final String TEXT_592 = " & ";
  protected final String TEXT_593 = "_ESETFLAG) != 0;";
  protected final String TEXT_594 = NL + "\t\treturn ";
  protected final String TEXT_595 = "ESet;";
  protected final String TEXT_596 = NL + "\t\treturn !((";
  protected final String TEXT_597 = ".Internal)((";
  protected final String TEXT_598 = ")get";
  protected final String TEXT_599 = "()).featureMap()).isEmpty(";
  protected final String TEXT_600 = "());";
  protected final String TEXT_601 = NL + "\t\treturn !((";
  protected final String TEXT_602 = ".Internal)get";
  protected final String TEXT_603 = "()).isEmpty(";
  protected final String TEXT_604 = "());";
  protected final String TEXT_605 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_606 = "' ";
  protected final String TEXT_607 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_608 = NL + "\t}" + NL;
  protected final String TEXT_609 = NL;
  protected final String TEXT_610 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_611 = " create";
  protected final String TEXT_612 = "(";
  protected final String TEXT_613 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_614 = " new";
  protected final String TEXT_615 = " = (";
  protected final String TEXT_616 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);" + NL + "\t\tif (eNotificationRequired()) {" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_617 = "(this, 0, ";
  protected final String TEXT_618 = ", null, new";
  protected final String TEXT_619 = "));" + NL + "\t\t}";
  protected final String TEXT_620 = NL + "\t\t";
  protected final String TEXT_621 = "().add(new";
  protected final String TEXT_622 = ");";
  protected final String TEXT_623 = NL + "\t\tset";
  protected final String TEXT_624 = "(new";
  protected final String TEXT_625 = ");";
  protected final String TEXT_626 = NL + "\t\treturn new";
  protected final String TEXT_627 = ";" + NL + "\t}" + NL;
  protected final String TEXT_628 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_629 = " create";
  protected final String TEXT_630 = "() {" + NL + "\t\t";
  protected final String TEXT_631 = " new";
  protected final String TEXT_632 = " = ";
  protected final String TEXT_633 = ".eINSTANCE.create";
  protected final String TEXT_634 = "();" + NL + "\t\tif (eNotificationRequired()) {" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_635 = "(this, 0, ";
  protected final String TEXT_636 = ", null, new";
  protected final String TEXT_637 = "));" + NL + "\t\t}";
  protected final String TEXT_638 = NL + "\t\t";
  protected final String TEXT_639 = "().add(new";
  protected final String TEXT_640 = ");";
  protected final String TEXT_641 = NL + "\t\tset";
  protected final String TEXT_642 = "(new";
  protected final String TEXT_643 = ");";
  protected final String TEXT_644 = NL + "\t\treturn new";
  protected final String TEXT_645 = ";" + NL + "\t}" + NL;
  protected final String TEXT_646 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_647 = " get";
  protected final String TEXT_648 = "(";
  protected final String TEXT_649 = " ";
  protected final String TEXT_650 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_651 = " i = ";
  protected final String TEXT_652 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_653 = " ";
  protected final String TEXT_654 = " = (";
  protected final String TEXT_655 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_656 = ".equals(";
  protected final String TEXT_657 = ".";
  protected final String TEXT_658 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_659 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_660 = NL;
  protected final String TEXT_661 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_662 = " ";
  protected final String TEXT_663 = "(";
  protected final String TEXT_664 = ")";
  protected final String TEXT_665 = NL + "\t{";
  protected final String TEXT_666 = NL + "\t\t";
  protected final String TEXT_667 = NL + "\t\treturn ";
  protected final String TEXT_668 = ".";
  protected final String TEXT_669 = "(this, ";
  protected final String TEXT_670 = ", ";
  protected final String TEXT_671 = ");";
  protected final String TEXT_672 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_673 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_674 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_675 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_676 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_677 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_678 = ".";
  protected final String TEXT_679 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_680 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_681 = "\", ";
  protected final String TEXT_682 = ".getObjectLabel(this, ";
  protected final String TEXT_683 = ") }),";
  protected final String TEXT_684 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_685 = NL + "\t\t";
  protected final String TEXT_686 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_687 = " result = (";
  protected final String TEXT_688 = ") cache.get(";
  protected final String TEXT_689 = "eResource(), ";
  protected final String TEXT_690 = "this, ";
  protected final String TEXT_691 = ".eINSTANCE.get";
  protected final String TEXT_692 = "().getEOperations().get(";
  protected final String TEXT_693 = "));" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_694 = "eResource(), ";
  protected final String TEXT_695 = "this, ";
  protected final String TEXT_696 = ".eINSTANCE.get";
  protected final String TEXT_697 = "().getEOperations().get(";
  protected final String TEXT_698 = "), result = ";
  protected final String TEXT_699 = "new ";
  protected final String TEXT_700 = "(";
  protected final String TEXT_701 = ".";
  protected final String TEXT_702 = "(this";
  protected final String TEXT_703 = ", ";
  protected final String TEXT_704 = ")";
  protected final String TEXT_705 = ")";
  protected final String TEXT_706 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_707 = ".";
  protected final String TEXT_708 = "()";
  protected final String TEXT_709 = ";" + NL + "\t\t}";
  protected final String TEXT_710 = NL + "\t\treturn ";
  protected final String TEXT_711 = ".";
  protected final String TEXT_712 = "(this";
  protected final String TEXT_713 = ", ";
  protected final String TEXT_714 = ");";
  protected final String TEXT_715 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_716 = NL + "\t}" + NL;
  protected final String TEXT_717 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_718 = " eInverseAdd(";
  protected final String TEXT_719 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_720 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_721 = NL + "\t\t\t\tcase ";
  protected final String TEXT_722 = ":";
  protected final String TEXT_723 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_724 = ")((";
  protected final String TEXT_725 = ")";
  protected final String TEXT_726 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_727 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_728 = ")";
  protected final String TEXT_729 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_730 = NL + "\t\t\t\t\tif (eContainer != null)" + NL + "\t\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_731 = ", msgs);";
  protected final String TEXT_732 = NL + "\t\t\t\t\tif (";
  protected final String TEXT_733 = " != null)";
  protected final String TEXT_734 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_735 = ")";
  protected final String TEXT_736 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_737 = ", null, msgs);";
  protected final String TEXT_738 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_739 = ")";
  protected final String TEXT_740 = ").eInverseRemove(this, ";
  protected final String TEXT_741 = ", ";
  protected final String TEXT_742 = ".class, msgs);";
  protected final String TEXT_743 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_744 = "((";
  protected final String TEXT_745 = ")otherEnd, msgs);";
  protected final String TEXT_746 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (eContainer != null)" + NL + "\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\treturn eBasicSetContainer(otherEnd, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_747 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_748 = " eInverseRemove(";
  protected final String TEXT_749 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_750 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_751 = NL + "\t\t\t\tcase ";
  protected final String TEXT_752 = ":";
  protected final String TEXT_753 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_754 = ")((";
  protected final String TEXT_755 = ")";
  protected final String TEXT_756 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_757 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_758 = ")((";
  protected final String TEXT_759 = ")";
  protected final String TEXT_760 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_761 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_762 = ")";
  protected final String TEXT_763 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_764 = NL + "\t\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_765 = ", msgs);";
  protected final String TEXT_766 = NL + "\t\t\t\t\treturn basicUnset";
  protected final String TEXT_767 = "(msgs);";
  protected final String TEXT_768 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_769 = "(null, msgs);";
  protected final String TEXT_770 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eBasicSetContainer(null, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_771 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_772 = " eBasicRemoveFromContainer(";
  protected final String TEXT_773 = " msgs)" + NL + "\t{" + NL + "\t\tif (eContainerFeatureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eContainerFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_774 = NL + "\t\t\t\tcase ";
  protected final String TEXT_775 = ":" + NL + "\t\t\t\t\treturn eContainer.eInverseRemove(this, ";
  protected final String TEXT_776 = ", ";
  protected final String TEXT_777 = ".class, msgs);";
  protected final String TEXT_778 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicBasicRemoveFromContainer(msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_779 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(";
  protected final String TEXT_780 = " eFeature, boolean resolve)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_781 = NL + "\t\t\tcase ";
  protected final String TEXT_782 = ":";
  protected final String TEXT_783 = NL + "\t\t\t\treturn ";
  protected final String TEXT_784 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_785 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_786 = "(";
  protected final String TEXT_787 = "());";
  protected final String TEXT_788 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_789 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_790 = "();";
  protected final String TEXT_791 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_792 = ")";
  protected final String TEXT_793 = "()).eMap();";
  protected final String TEXT_794 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_795 = ")";
  protected final String TEXT_796 = "()).featureMap();";
  protected final String TEXT_797 = NL + "\t\t\t\treturn ";
  protected final String TEXT_798 = "();";
  protected final String TEXT_799 = NL + "\t\t}" + NL + "\t\treturn eDynamicGet(eFeature, resolve);" + NL + "\t}" + NL;
  protected final String TEXT_800 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(";
  protected final String TEXT_801 = " eFeature, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_802 = NL + "\t\t\tcase ";
  protected final String TEXT_803 = ":";
  protected final String TEXT_804 = NL + "\t\t\t\t((";
  protected final String TEXT_805 = ")";
  protected final String TEXT_806 = "()).featureMap().clear();";
  protected final String TEXT_807 = NL + "\t\t\t\t";
  protected final String TEXT_808 = "().clear();";
  protected final String TEXT_809 = NL + "\t\t\t\t((";
  protected final String TEXT_810 = ")";
  protected final String TEXT_811 = "()).featureMap().addAll((";
  protected final String TEXT_812 = ")newValue);";
  protected final String TEXT_813 = NL + "\t\t\t\t((";
  protected final String TEXT_814 = ")";
  protected final String TEXT_815 = "()).eMap().addAll((";
  protected final String TEXT_816 = ")newValue);";
  protected final String TEXT_817 = NL + "\t\t\t\t";
  protected final String TEXT_818 = "().addAll((";
  protected final String TEXT_819 = ")newValue);";
  protected final String TEXT_820 = NL + "\t\t\t\tset";
  protected final String TEXT_821 = "(((";
  protected final String TEXT_822 = ")newValue).";
  protected final String TEXT_823 = "());";
  protected final String TEXT_824 = NL + "\t\t\t\tset";
  protected final String TEXT_825 = "((";
  protected final String TEXT_826 = ")newValue);";
  protected final String TEXT_827 = NL + "\t\t\t\treturn;";
  protected final String TEXT_828 = NL + "\t\t}" + NL + "\t\teDynamicSet(eFeature, newValue);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(";
  protected final String TEXT_829 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_830 = NL + "\t\t\tcase ";
  protected final String TEXT_831 = ":";
  protected final String TEXT_832 = NL + "\t\t\t\t((";
  protected final String TEXT_833 = ")";
  protected final String TEXT_834 = "()).featureMap().clear();";
  protected final String TEXT_835 = NL + "\t\t\t\t";
  protected final String TEXT_836 = "().clear();";
  protected final String TEXT_837 = NL + "\t\t\t\tunset";
  protected final String TEXT_838 = "();";
  protected final String TEXT_839 = NL + "\t\t\t\tset";
  protected final String TEXT_840 = "((";
  protected final String TEXT_841 = ")null);";
  protected final String TEXT_842 = NL + "\t\t\t\tset";
  protected final String TEXT_843 = "(";
  protected final String TEXT_844 = "_EDEFAULT);";
  protected final String TEXT_845 = NL + "\t\t\t\treturn;";
  protected final String TEXT_846 = NL + "\t\t}" + NL + "\t\teDynamicUnset(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_847 = NL;
  protected final String TEXT_848 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(";
  protected final String TEXT_849 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_850 = NL + "\t\t\tcase ";
  protected final String TEXT_851 = ":";
  protected final String TEXT_852 = NL + "\t\t\t\treturn !";
  protected final String TEXT_853 = "().isEmpty()";
  protected final String TEXT_854 = ";";
  protected final String TEXT_855 = NL + "\t\t\t\treturn ";
  protected final String TEXT_856 = "basicGet";
  protected final String TEXT_857 = "() != null";
  protected final String TEXT_858 = ";";
  protected final String TEXT_859 = NL + "\t\t\t\treturn eIsSet(";
  protected final String TEXT_860 = "())";
  protected final String TEXT_861 = ";";
  protected final String TEXT_862 = NL + "\t\t\t\t\t|| !";
  protected final String TEXT_863 = "().isEmpty()";
  protected final String TEXT_864 = ";";
  protected final String TEXT_865 = NL + "\t\t\t\t\t|| ";
  protected final String TEXT_866 = "basicGet";
  protected final String TEXT_867 = "() != null";
  protected final String TEXT_868 = ";";
  protected final String TEXT_869 = NL + "\t\t\t\t\t|| eIsSet(";
  protected final String TEXT_870 = "())";
  protected final String TEXT_871 = ";";
  protected final String TEXT_872 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_873 = ")";
  protected final String TEXT_874 = "()).featureMap().isEmpty();";
  protected final String TEXT_875 = NL + "\t\t\t\treturn ";
  protected final String TEXT_876 = " != null && !";
  protected final String TEXT_877 = ".featureMap().isEmpty();";
  protected final String TEXT_878 = NL + "\t\t\t\treturn ";
  protected final String TEXT_879 = " != null && !";
  protected final String TEXT_880 = ".isEmpty();";
  protected final String TEXT_881 = NL + "\t\t\t\treturn !";
  protected final String TEXT_882 = "().isEmpty();";
  protected final String TEXT_883 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_884 = "();";
  protected final String TEXT_885 = NL + "\t\t\t\treturn ";
  protected final String TEXT_886 = " != null;";
  protected final String TEXT_887 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_888 = "() != null;";
  protected final String TEXT_889 = NL + "\t\t\t\treturn ";
  protected final String TEXT_890 = " != null;";
  protected final String TEXT_891 = NL + "\t\t\t\treturn ";
  protected final String TEXT_892 = "() != null;";
  protected final String TEXT_893 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_894 = " & ";
  protected final String TEXT_895 = "_EFLAG) != 0) != ";
  protected final String TEXT_896 = "_EDEFAULT;";
  protected final String TEXT_897 = NL + "\t\t\t\treturn ";
  protected final String TEXT_898 = " != ";
  protected final String TEXT_899 = "_EDEFAULT;";
  protected final String TEXT_900 = NL + "\t\t\t\treturn ";
  protected final String TEXT_901 = "() != ";
  protected final String TEXT_902 = "_EDEFAULT;";
  protected final String TEXT_903 = NL + "\t\t\t\treturn ";
  protected final String TEXT_904 = "_EDEFAULT == null ? ";
  protected final String TEXT_905 = " != null : !";
  protected final String TEXT_906 = "_EDEFAULT.equals(";
  protected final String TEXT_907 = ");";
  protected final String TEXT_908 = NL + "\t\t\t\treturn ";
  protected final String TEXT_909 = "_EDEFAULT == null ? ";
  protected final String TEXT_910 = "() != null : !";
  protected final String TEXT_911 = "_EDEFAULT.equals(";
  protected final String TEXT_912 = "());";
  protected final String TEXT_913 = NL + "\t\t}" + NL + "\t\treturn eDynamicIsSet(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_914 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_915 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_916 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_917 = NL + "\t\t\t\tcase ";
  protected final String TEXT_918 = ": return ";
  protected final String TEXT_919 = ";";
  protected final String TEXT_920 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_921 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_922 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_923 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_924 = NL + "\t\t\t\tcase ";
  protected final String TEXT_925 = ": return ";
  protected final String TEXT_926 = ";";
  protected final String TEXT_927 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_928 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_929 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_930 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_931 = ": \");";
  protected final String TEXT_932 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_933 = ": \");";
  protected final String TEXT_934 = NL + "\t\tif (";
  protected final String TEXT_935 = "(";
  protected final String TEXT_936 = " & ";
  protected final String TEXT_937 = "_ESETFLAG) != 0";
  protected final String TEXT_938 = "ESet";
  protected final String TEXT_939 = ") result.append((";
  protected final String TEXT_940 = " & ";
  protected final String TEXT_941 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_942 = NL + "\t\tif (";
  protected final String TEXT_943 = "(";
  protected final String TEXT_944 = " & ";
  protected final String TEXT_945 = "_ESETFLAG) != 0";
  protected final String TEXT_946 = "ESet";
  protected final String TEXT_947 = ") result.append(";
  protected final String TEXT_948 = "); else result.append(\"<unset>\");";
  protected final String TEXT_949 = NL + "\t\tresult.append((";
  protected final String TEXT_950 = " & ";
  protected final String TEXT_951 = "_EFLAG) != 0);";
  protected final String TEXT_952 = NL + "\t\tresult.append(";
  protected final String TEXT_953 = ");";
  protected final String TEXT_954 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_955 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_956 = NL + "\t\treturn new ";
  protected final String TEXT_957 = "(getTypedKey());";
  protected final String TEXT_958 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_959 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_960 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_961 = ")key);";
  protected final String TEXT_962 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_963 = ")key).";
  protected final String TEXT_964 = "());";
  protected final String TEXT_965 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_966 = ")key);";
  protected final String TEXT_967 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_968 = NL + "\t\treturn new ";
  protected final String TEXT_969 = "(getTypedValue());";
  protected final String TEXT_970 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_971 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_972 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_973 = ")value);";
  protected final String TEXT_974 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_975 = ")value).";
  protected final String TEXT_976 = "());";
  protected final String TEXT_977 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_978 = ")value);";
  protected final String TEXT_979 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_980 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_981 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_982 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_983 = NL;
  protected final String TEXT_984 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_985 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_986 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_987 = " getCacheAdapter() {" + NL + "\t\tfor (";
  protected final String TEXT_988 = " i = eAdapters().iterator(); i.hasNext();) {" + NL + "\t\t\t";
  protected final String TEXT_989 = " adapter = (";
  protected final String TEXT_990 = ") i.next();" + NL + "\t\t\tif (adapter instanceof ";
  protected final String TEXT_991 = ") {" + NL + "\t\t\t\treturn (";
  protected final String TEXT_992 = ") adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_993 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_994 = " basicGet";
  protected final String TEXT_995 = "()" + NL + "\t{";
  protected final String TEXT_996 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_997 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_998 = "basicGet";
  protected final String TEXT_999 = "();" + NL + "\t\t}";
  protected final String TEXT_1000 = NL + "\t\t";
  protected final String TEXT_1001 = " ";
  protected final String TEXT_1002 = " = ";
  protected final String TEXT_1003 = "basicGet";
  protected final String TEXT_1004 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1005 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1006 = ";" + NL + "\t\t}";
  protected final String TEXT_1007 = NL + "\t\treturn ";
  protected final String TEXT_1008 = "super.basicGet";
  protected final String TEXT_1009 = "()";
  protected final String TEXT_1010 = "null";
  protected final String TEXT_1011 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1013 = " ";
  protected final String TEXT_1014 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1015 = " ";
  protected final String TEXT_1016 = " = basicGet";
  protected final String TEXT_1017 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1018 = " == null ? null : (";
  protected final String TEXT_1019 = ")eResolveProxy((";
  protected final String TEXT_1020 = ")";
  protected final String TEXT_1021 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1022 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1023 = " ";
  protected final String TEXT_1024 = "()" + NL + "\t{";
  protected final String TEXT_1025 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1026 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1027 = "();" + NL + "\t\t}";
  protected final String TEXT_1028 = NL + "\t\t";
  protected final String TEXT_1029 = " ";
  protected final String TEXT_1030 = " = ";
  protected final String TEXT_1031 = "();" + NL + "\t\tif (";
  protected final String TEXT_1032 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1033 = ";" + NL + "\t\t}";
  protected final String TEXT_1034 = NL + "\t\treturn ";
  protected final String TEXT_1035 = "super.";
  protected final String TEXT_1036 = "()";
  protected final String TEXT_1037 = "null";
  protected final String TEXT_1038 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1039 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1040 = " ";
  protected final String TEXT_1041 = "()" + NL + "\t{";
  protected final String TEXT_1042 = NL + "\t\treturn ";
  protected final String TEXT_1043 = "();";
  protected final String TEXT_1044 = NL + "\t\treturn new ";
  protected final String TEXT_1045 = ".UnmodifiableEList(this, ";
  protected final String TEXT_1046 = "null";
  protected final String TEXT_1047 = "()";
  protected final String TEXT_1048 = ", 0, ";
  protected final String TEXT_1049 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_1050 = NL + "\t\treturn null;";
  protected final String TEXT_1051 = NL + "\t\treturn ";
  protected final String TEXT_1052 = "();";
  protected final String TEXT_1053 = NL + "\t}" + NL;
  protected final String TEXT_1054 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1055 = " basicGet";
  protected final String TEXT_1056 = "()" + NL + "\t{";
  protected final String TEXT_1057 = NL + "\t\treturn null;";
  protected final String TEXT_1058 = NL + "\t\treturn ";
  protected final String TEXT_1059 = "basicGet";
  protected final String TEXT_1060 = "();";
  protected final String TEXT_1061 = NL + "\t}" + NL;
  protected final String TEXT_1062 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1063 = " basicSet";
  protected final String TEXT_1064 = "(";
  protected final String TEXT_1065 = " new";
  protected final String TEXT_1066 = ", ";
  protected final String TEXT_1067 = " msgs)" + NL + "\t{";
  protected final String TEXT_1068 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1069 = NL + "\t\tif (new";
  protected final String TEXT_1070 = " != null && !(new";
  protected final String TEXT_1071 = " instanceof ";
  protected final String TEXT_1072 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1073 = "));" + NL + "\t\t}";
  protected final String TEXT_1074 = NL + "\t\treturn basicSet";
  protected final String TEXT_1075 = "(";
  protected final String TEXT_1076 = "(";
  protected final String TEXT_1077 = ") ";
  protected final String TEXT_1078 = "new";
  protected final String TEXT_1079 = ", msgs);";
  protected final String TEXT_1080 = NL + "\t\tset";
  protected final String TEXT_1081 = "(";
  protected final String TEXT_1082 = "(";
  protected final String TEXT_1083 = ") ";
  protected final String TEXT_1084 = "new";
  protected final String TEXT_1085 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1086 = NL + "\t}" + NL;
  protected final String TEXT_1087 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1088 = "(";
  protected final String TEXT_1089 = " new";
  protected final String TEXT_1090 = ")" + NL + "\t{";
  protected final String TEXT_1091 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1092 = NL + "\t\tif (new";
  protected final String TEXT_1093 = " != null && !(new";
  protected final String TEXT_1094 = " instanceof ";
  protected final String TEXT_1095 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1096 = "));" + NL + "\t\t}";
  protected final String TEXT_1097 = NL + "\t\tset";
  protected final String TEXT_1098 = "(";
  protected final String TEXT_1099 = "(";
  protected final String TEXT_1100 = ") ";
  protected final String TEXT_1101 = "new";
  protected final String TEXT_1102 = ");";
  protected final String TEXT_1103 = NL + "\t}" + NL;
  protected final String TEXT_1104 = NL;
  protected final String TEXT_1105 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1106 = " create";
  protected final String TEXT_1107 = "(";
  protected final String TEXT_1108 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1109 = " new";
  protected final String TEXT_1110 = " = (";
  protected final String TEXT_1111 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);" + NL + "\t\tif (eNotificationRequired()) {" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1112 = "(this, 0, ";
  protected final String TEXT_1113 = ", null, new";
  protected final String TEXT_1114 = "));" + NL + "\t\t}";
  protected final String TEXT_1115 = NL + "\t\t";
  protected final String TEXT_1116 = "().add(new";
  protected final String TEXT_1117 = ");";
  protected final String TEXT_1118 = NL + "\t\tset";
  protected final String TEXT_1119 = "(new";
  protected final String TEXT_1120 = ");";
  protected final String TEXT_1121 = NL + "\t\treturn new";
  protected final String TEXT_1122 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1123 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1124 = " create";
  protected final String TEXT_1125 = "() {" + NL + "\t\t";
  protected final String TEXT_1126 = " new";
  protected final String TEXT_1127 = " = ";
  protected final String TEXT_1128 = ".eINSTANCE.create";
  protected final String TEXT_1129 = "();" + NL + "\t\tif (eNotificationRequired()) {" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1130 = "(this, 0, ";
  protected final String TEXT_1131 = ", null, new";
  protected final String TEXT_1132 = "));" + NL + "\t\t}";
  protected final String TEXT_1133 = NL + "\t\t";
  protected final String TEXT_1134 = "().add(new";
  protected final String TEXT_1135 = ");";
  protected final String TEXT_1136 = NL + "\t\tset";
  protected final String TEXT_1137 = "(new";
  protected final String TEXT_1138 = ");";
  protected final String TEXT_1139 = NL + "\t\treturn new";
  protected final String TEXT_1140 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1141 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1142 = " get";
  protected final String TEXT_1143 = "(";
  protected final String TEXT_1144 = " ";
  protected final String TEXT_1145 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1146 = " i = ";
  protected final String TEXT_1147 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1148 = " ";
  protected final String TEXT_1149 = " = (";
  protected final String TEXT_1150 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1151 = ".equals(";
  protected final String TEXT_1152 = ".";
  protected final String TEXT_1153 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1154 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1155 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1156 = " ";
  protected final String TEXT_1157 = "(";
  protected final String TEXT_1158 = ")";
  protected final String TEXT_1159 = NL + "\t{";
  protected final String TEXT_1160 = NL + "\t\t";
  protected final String TEXT_1161 = "(";
  protected final String TEXT_1162 = ");";
  protected final String TEXT_1163 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1164 = NL + "\t\treturn ";
  protected final String TEXT_1165 = "(";
  protected final String TEXT_1166 = ");";
  protected final String TEXT_1167 = NL + "\t}" + NL;
  protected final String TEXT_1168 = NL + "} //";
  protected final String TEXT_1169 = NL;

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

    GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_6);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_8);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_9);
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    stringBuffer.append(TEXT_18);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_22);
    }
    if (genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_26);
    }
    if (genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_28);
    }
    if (!genModel.isReflectiveDelegation()) {
    for (Iterator i=genClass.getDeclaredFieldGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_35);
    }
    } else {
    if (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable())) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    stringBuffer.append(TEXT_44);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_53);
    } else {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_61);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_63);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_68);
    } else {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_72);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_74);
    for (Iterator i=genClass.getFlagGenFeatures("true").iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_77);
    }
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_81);
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_84);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_85);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_90);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_93);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_98);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_101);
    } else {
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_118);
    }
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_121);
    } else {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_123);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_133);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap$Internal"));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_139);
    } else {
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_144);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_148);
    } else {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_152);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_153);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_154);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_159);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_161);
    }
    stringBuffer.append(TEXT_162);
    } else {
    stringBuffer.append(TEXT_163);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_168);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    }
    }
    } else {
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_174);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_175);
    //Class/getGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_178);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_180);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_185);
    } else {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_189);
    }
    } else {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_192);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_193);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_199);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_200);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_206);
    }
    }
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_212);
    if (genFeature.isUnsettable()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_218);
    } else {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_222);
    }
    }
    stringBuffer.append(TEXT_223);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_231);
    } else {
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_238);
    }
    stringBuffer.append(TEXT_239);
    stringBuffer.append(TEXT_240);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_245);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_249);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_251);
    }
    }
    stringBuffer.append(TEXT_252);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_254);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_258);
    } else {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_263);
    }
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_266);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_267);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(TEXT_272);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_277);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_283);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_286);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_289);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_291);
    }
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_322);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_330);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_334);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_339);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_340);
    }
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_344);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_345);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_351);
    } else {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_355);
    }
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    } else {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_368);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_378);
    } else {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_382);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_387);
    } else {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_391);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    } else {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_401);
    }
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_406);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_409);
    } else {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_414);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_416);
    }
    }
    stringBuffer.append(TEXT_417);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_418);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_422);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_428);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_430);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_431);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_433);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_435);
    }
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_437);
    }
    stringBuffer.append(TEXT_438);
    } else {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_440);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_442);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_444);
    }
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_446);
    }
    stringBuffer.append(TEXT_447);
    }
    } else {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_450);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_451);
    //Class/setGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_455);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_460);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_466);
    } else {
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_470);
    }
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_477);
    } else {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_480);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_481);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset()) {
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_483);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_486);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_489);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_492);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_496);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_501);
    }
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_503);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_509);
    } else {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_513);
    }
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_518);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_523);
    } else {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_527);
    }
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_531);
    } else {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_534);
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_536);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_539);
    } else {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_541);
    }
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_547);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_553);
    } else {
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_556);
    }
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_559);
    } else {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_561);
    }
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_568);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_570);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_573);
    } else {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_575);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_577);
    }
    } else {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_580);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_581);
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_583);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_586);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_590);
    } else {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_593);
    } else {
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_595);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_597);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_600);
    } else {
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_602);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_604);
    }
    } else {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_607);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_608);
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_609);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_619);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_622);
    } else {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_625);
    }
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_627);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_628);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_633);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_637);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_640);
    } else {
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_643);
    }
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_645);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_646);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_655);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_659);
    }
    }
    //Class/implementedGenFeature.override.javajetinc
    }//for
    for (Iterator i=genClass.getImplementedGenOperations().iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_660);
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_665);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_667);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_670);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_671);
    } else {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_673);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_676);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_682);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_684);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (!genOperation.isVoid() && UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_688);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_689);
    }
    stringBuffer.append(TEXT_690);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_693);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_694);
    }
    stringBuffer.append(TEXT_695);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_698);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_700);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_702);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_704);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_705);
    }
    stringBuffer.append(TEXT_706);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_708);
    }
    stringBuffer.append(TEXT_709);
    }
    stringBuffer.append(TEXT_710);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_712);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_714);
    } else {
    stringBuffer.append(TEXT_715);
    }
    }
    stringBuffer.append(TEXT_716);
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_720);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_722);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_726);
    } else {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_729);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_731);
    } else {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_733);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_737);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_742);
    }
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_745);
    }
    }
    stringBuffer.append(TEXT_746);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_750);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_752);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_756);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_760);
    } else {
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_763);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_765);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_767);
    } else {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_769);
    }
    }
    stringBuffer.append(TEXT_770);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_773);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_777);
    }
    stringBuffer.append(TEXT_778);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_780);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_782);
    if (genFeature.isPrimitiveType() && !genFeature.isListType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_784);
    } else {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_787);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_790);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_793);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_796);
    } else {
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_798);
    }
    }
    stringBuffer.append(TEXT_799);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_801);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_803);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_806);
    } else {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_808);
    }
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_812);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_816);
    } else {
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_819);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_823);
    } else {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_826);
    }
    stringBuffer.append(TEXT_827);
    }
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_829);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_831);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_834);
    } else {
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_836);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_838);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_841);
    } else {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_844);
    }
    stringBuffer.append(TEXT_845);
    }
    stringBuffer.append(TEXT_846);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_849);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_851);
    if (UML2GenModelUtil.isUnion(genFeature) && !UML2GenModelUtil.getEIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    for (Iterator j = UML2GenModelUtil.getEIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_853);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_854);
    }
    } else {
    stringBuffer.append(TEXT_855);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_857);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_858);
    }
    }
    } else {
    stringBuffer.append(TEXT_859);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_860);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_861);
    }
    }
    } else {
    if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_862);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_863);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_864);
    }
    } else {
    stringBuffer.append(TEXT_865);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_866);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_867);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_868);
    }
    }
    } else {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_870);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_871);
    }
    }
    }
    }
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_874);
    } else {
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_877);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_880);
    } else {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_882);
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_884);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_886);
    } else {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_888);
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_890);
    } else {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_892);
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_896);
    } else {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_899);
    }
    } else {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_902);
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_907);
    } else {
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_912);
    }
    }
    }
    }
    stringBuffer.append(TEXT_913);
    //Class/eIsSet.override.javajetinc
    }
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_914);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_915);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_916);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_918);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_919);
    }
    stringBuffer.append(TEXT_920);
    }
    stringBuffer.append(TEXT_921);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_922);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_923);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_924);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_926);
    }
    stringBuffer.append(TEXT_927);
    }
    stringBuffer.append(TEXT_928);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_929);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_934);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_937);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_938);
    }
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_942);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_945);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_946);
    }
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_951);
    } else {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_953);
    }
    }
    }
    }
    stringBuffer.append(TEXT_954);
    }
    if (genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_955);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_957);
    } else {
    stringBuffer.append(TEXT_958);
    }
    stringBuffer.append(TEXT_959);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_961);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_964);
    } else {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_966);
    }
    stringBuffer.append(TEXT_967);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_968);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_969);
    } else {
    stringBuffer.append(TEXT_970);
    }
    stringBuffer.append(TEXT_971);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_973);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_976);
    } else {
    stringBuffer.append(TEXT_977);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_978);
    }
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_982);
    }
    stringBuffer.append(TEXT_983);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_992);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_995);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_996);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_997);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_999);
    } else {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1002);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1006);
    }
    }
    }
    stringBuffer.append(TEXT_1007);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1009);
    } else {
    stringBuffer.append(TEXT_1010);
    }
    stringBuffer.append(TEXT_1011);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1021);
    }
    } else if (genFeature.isGet()) {
    if (!genFeature.isListType()) {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1024);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1027);
    } else {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1033);
    }
    }
    }
    stringBuffer.append(TEXT_1034);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1036);
    } else {
    stringBuffer.append(TEXT_1037);
    }
    stringBuffer.append(TEXT_1038);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1041);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1043);
    } else {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_1045);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1046);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1047);
    }
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_1049);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1050);
    } else {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1052);
    }
    }
    stringBuffer.append(TEXT_1053);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1056);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1057);
    } else {
    stringBuffer.append(TEXT_1058);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1060);
    }
    stringBuffer.append(TEXT_1061);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1067);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1068);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1073);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1075);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1077);
    }
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1079);
    } else {
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1081);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1083);
    }
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1085);
    }
    }
    stringBuffer.append(TEXT_1086);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1090);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1091);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1096);
    }
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1098);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1100);
    }
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1102);
    }
    stringBuffer.append(TEXT_1103);
    }
    stringBuffer.append(TEXT_1104);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1114);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1117);
    } else {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1120);
    }
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1122);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1132);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1135);
    } else {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1138);
    }
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1140);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1154);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1159);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1162);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_1163);
    } else {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1166);
    }
    }
    stringBuffer.append(TEXT_1167);
    }
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genClass.getClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1169);
    return stringBuffer.toString();
  }
}
