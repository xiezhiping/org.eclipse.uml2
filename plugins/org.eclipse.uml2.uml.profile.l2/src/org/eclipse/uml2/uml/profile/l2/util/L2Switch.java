/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.profile.l2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.profile.l2.Auxiliary;
import org.eclipse.uml2.uml.profile.l2.Call;
import org.eclipse.uml2.uml.profile.l2.Create;
import org.eclipse.uml2.uml.profile.l2.Derive;
import org.eclipse.uml2.uml.profile.l2.Destroy;
import org.eclipse.uml2.uml.profile.l2.Document;
import org.eclipse.uml2.uml.profile.l2.Entity;
import org.eclipse.uml2.uml.profile.l2.Executable;
import org.eclipse.uml2.uml.profile.l2.File;
import org.eclipse.uml2.uml.profile.l2.Focus;
import org.eclipse.uml2.uml.profile.l2.Framework;
import org.eclipse.uml2.uml.profile.l2.Implement;
import org.eclipse.uml2.uml.profile.l2.ImplementationClass;
import org.eclipse.uml2.uml.profile.l2.Instantiate;
import org.eclipse.uml2.uml.profile.l2.L2Package;
import org.eclipse.uml2.uml.profile.l2.Library;
import org.eclipse.uml2.uml.profile.l2.Metaclass;
import org.eclipse.uml2.uml.profile.l2.ModelLibrary;
import org.eclipse.uml2.uml.profile.l2.Realization;
import org.eclipse.uml2.uml.profile.l2.Refine;
import org.eclipse.uml2.uml.profile.l2.Responsibility;
import org.eclipse.uml2.uml.profile.l2.Script;
import org.eclipse.uml2.uml.profile.l2.Send;
import org.eclipse.uml2.uml.profile.l2.Service;
import org.eclipse.uml2.uml.profile.l2.Source;
import org.eclipse.uml2.uml.profile.l2.Specification;
import org.eclipse.uml2.uml.profile.l2.Subsystem;
import org.eclipse.uml2.uml.profile.l2.Trace;
import org.eclipse.uml2.uml.profile.l2.Type;
import org.eclipse.uml2.uml.profile.l2.Utility;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.profile.l2.L2Package
 * @generated
 */
public class L2Switch<T>
		extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static L2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L2Switch() {
		if (modelPackage == null) {
			modelPackage = L2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case L2Package.AUXILIARY : {
				Auxiliary auxiliary = (Auxiliary) theEObject;
				T result = caseAuxiliary(auxiliary);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.CALL : {
				Call call = (Call) theEObject;
				T result = caseCall(call);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.CREATE : {
				Create create = (Create) theEObject;
				T result = caseCreate(create);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.DERIVE : {
				Derive derive = (Derive) theEObject;
				T result = caseDerive(derive);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.DESTROY : {
				Destroy destroy = (Destroy) theEObject;
				T result = caseDestroy(destroy);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.DOCUMENT : {
				Document document = (Document) theEObject;
				T result = caseDocument(document);
				if (result == null)
					result = caseFile(document);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.FILE : {
				File file = (File) theEObject;
				T result = caseFile(file);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.ENTITY : {
				Entity entity = (Entity) theEObject;
				T result = caseEntity(entity);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.EXECUTABLE : {
				Executable executable = (Executable) theEObject;
				T result = caseExecutable(executable);
				if (result == null)
					result = caseFile(executable);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.FOCUS : {
				Focus focus = (Focus) theEObject;
				T result = caseFocus(focus);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.FRAMEWORK : {
				Framework framework = (Framework) theEObject;
				T result = caseFramework(framework);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.IMPLEMENT : {
				Implement implement = (Implement) theEObject;
				T result = caseImplement(implement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.IMPLEMENTATION_CLASS : {
				ImplementationClass implementationClass = (ImplementationClass) theEObject;
				T result = caseImplementationClass(implementationClass);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.INSTANTIATE : {
				Instantiate instantiate = (Instantiate) theEObject;
				T result = caseInstantiate(instantiate);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.LIBRARY : {
				Library library = (Library) theEObject;
				T result = caseLibrary(library);
				if (result == null)
					result = caseFile(library);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.METACLASS : {
				Metaclass metaclass = (Metaclass) theEObject;
				T result = caseMetaclass(metaclass);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.MODEL_LIBRARY : {
				ModelLibrary modelLibrary = (ModelLibrary) theEObject;
				T result = caseModelLibrary(modelLibrary);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.PROCESS : {
				org.eclipse.uml2.uml.profile.l2.Process process = (org.eclipse.uml2.uml.profile.l2.Process) theEObject;
				T result = caseProcess(process);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.REALIZATION : {
				Realization realization = (Realization) theEObject;
				T result = caseRealization(realization);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.REFINE : {
				Refine refine = (Refine) theEObject;
				T result = caseRefine(refine);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.RESPONSIBILITY : {
				Responsibility responsibility = (Responsibility) theEObject;
				T result = caseResponsibility(responsibility);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.SCRIPT : {
				Script script = (Script) theEObject;
				T result = caseScript(script);
				if (result == null)
					result = caseFile(script);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.SEND : {
				Send send = (Send) theEObject;
				T result = caseSend(send);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.SERVICE : {
				Service service = (Service) theEObject;
				T result = caseService(service);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.SOURCE : {
				Source source = (Source) theEObject;
				T result = caseSource(source);
				if (result == null)
					result = caseFile(source);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.SPECIFICATION : {
				Specification specification = (Specification) theEObject;
				T result = caseSpecification(specification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.SUBSYSTEM : {
				Subsystem subsystem = (Subsystem) theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.TRACE : {
				Trace trace = (Trace) theEObject;
				T result = caseTrace(trace);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.TYPE : {
				Type type = (Type) theEObject;
				T result = caseType(type);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case L2Package.UTILITY : {
				Utility utility = (Utility) theEObject;
				T result = caseUtility(utility);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default :
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliary(Auxiliary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerive(Derive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroy(Destroy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutable(Executable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Focus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Focus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFocus(Focus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFramework(Framework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplement(Implement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationClass(ImplementationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiate(Instantiate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metaclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaclass(Metaclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLibrary(ModelLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.eclipse.uml2.uml.profile.l2.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefine(Refine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibility(Responsibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSend(Send object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtility(Utility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //L2Switch
