package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.internal.resource.XMI212UMLResourceFactoryImpl;

/**
 * XMI resource required for model migration.
 * OMG:  UML 2.1.x and UML 2.2 
 * API:  UML2 2.2.x and UML2 3.0.x 
 * 
 * @since 3.0
 */
public interface XMI212UMLResource
		extends UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new XMI212UMLResourceFactoryImpl();
	}
}
