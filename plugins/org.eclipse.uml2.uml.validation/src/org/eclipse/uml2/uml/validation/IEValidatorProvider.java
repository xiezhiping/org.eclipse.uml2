/*
 * Copyright (c) 2012 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 */
package org.eclipse.uml2.uml.validation;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * A protocol for package-to-validator mappings.
 */
public interface IEValidatorProvider {

	/**
	 * Obtains an appropriate {@link EValidator} for validation of instances of
	 * the specified {@code ePackage}.
	 * 
	 * @param ePackage
	 *            a package for which to obtain a validator
	 * 
	 * @return a suitable validator, or {@code null} if none could be found
	 */
	EValidator getEValidator(EPackage ePackage);

	/**
	 * Obtains an appropriate substitution-label provider for presentation of
	 * element names in validation of elements of the specified {@code ePackage}
	 * .
	 * 
	 * @param ePackage
	 *            a package for which to obtain a substitution-label provider
	 * 
	 * @return a suitable provider, or @{code null} if none could be found
	 */
	EValidator.SubstitutionLabelProvider getSubstitutionLabelProvider(
			EPackage ePackage);

	//
	// Nested types
	//

	/**
	 * The default {@link EValidator} provider uses the validator registry to
	 * look up whatever validator is there.
	 */
	class Default
			implements IEValidatorProvider {

		public EValidator getEValidator(EPackage ePackage) {
			return EValidator.Registry.INSTANCE.getEValidator(ePackage);
		}

		public SubstitutionLabelProvider getSubstitutionLabelProvider(
				EPackage ePackage) {

			return new EValidator.SubstitutionLabelProvider() {

				public String getObjectLabel(EObject eObject) {
					String result = UMLUtil.getQualifiedText(eObject);

					if ((result == null) || (result.length() == 0)) {
						result = Diagnostician.INSTANCE.getObjectLabel(eObject);
					}

					return result;
				}

				public String getFeatureLabel(
						EStructuralFeature eStructuralFeature) {

					return Diagnostician.INSTANCE
						.getFeatureLabel(eStructuralFeature);
				}

				public String getValueLabel(EDataType eDataType, Object value) {
					return Diagnostician.INSTANCE.getValueLabel(eDataType,
						value);
				}
			};
		}
	}

	/**
	 * The UML {@link IEValidatorProvider} maps the UML package to the standard UML
	 * validator. For other packages, uses the validator registry to look up
	 * whatever validator is there.
	 */
	class UML
			extends Default {

		@Override
		public EValidator getEValidator(EPackage ePackage) {
			return (ePackage == UMLPackage.eINSTANCE)
				? UMLValidator.INSTANCE
				: super.getEValidator(ePackage);
		}
	}
}
