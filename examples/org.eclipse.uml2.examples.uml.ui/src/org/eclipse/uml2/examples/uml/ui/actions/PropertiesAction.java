/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PropertiesAction.java,v 1.2 2007/01/04 18:47:13 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.uml2.common.util.UML2Util;

public abstract class PropertiesAction
		extends CommandAction {

	protected static final String PROPERTIES_SEPARATOR = " = "; //$NON-NLS-1$

	protected static String format(String name, String separator,
			String prefix, boolean includePrefix) {

		List<String> parsedName = new ArrayList<String>();

		if (prefix != null) {

			if (name.startsWith(prefix)) {
				name = name.substring(prefix.length());
			}

			if (includePrefix) {
				parsedName = parseName(prefix, '_');
			}
		}

		if (name.length() != 0) {
			parsedName.addAll(parseName(name, '_'));
		}

		StringBuffer result = new StringBuffer();

		for (Iterator<String> nameIter = parsedName.iterator(); nameIter
			.hasNext();) {
			String nameComponent = nameIter.next();

			result.append(result.length() == 0
				? nameComponent
				: capName(nameComponent));

			if (nameIter.hasNext() && nameComponent.length() > 1) {
				result.append(separator);
			}
		}

		return result.length() == 0 && prefix != null
			? prefix
			: result.toString();
	}

	protected static List<String> parseName(String sourceName,
			char sourceSeparator) {
		List<String> result = new ArrayList<String>();
		StringBuffer currentWord = new StringBuffer();

		int length = sourceName.length();
		boolean lastIsLower = false;

		for (int index = 0; index < length; index++) {
			char curChar = sourceName.charAt(index);

			if (Character.isUpperCase(curChar)
				|| (!lastIsLower && Character.isDigit(curChar))
				|| curChar == sourceSeparator) {

				if (lastIsLower || curChar == sourceSeparator) {
					result.add(currentWord.toString());
					currentWord = new StringBuffer();
				}

				lastIsLower = false;
			} else {

				if (!lastIsLower) {
					int currentWordLength = currentWord.length();

					if (currentWordLength > 1) {
						char lastChar = currentWord.charAt(--currentWordLength);
						currentWord.setLength(currentWordLength);

						result.add(currentWord.toString());

						currentWord = new StringBuffer();
						currentWord.append(lastChar);
					}
				}

				lastIsLower = true;
			}

			if (curChar != sourceSeparator) {
				currentWord.append(curChar);
			}
		}

		result.add(currentWord.toString());

		return result;
	}

	protected static String capName(String name) {
		return name.length() == 0
			? name
			: (name.substring(0, 1).toUpperCase() + name.substring(1));
	}

	protected static String getPropertiesKey(String prefix, String string) {
		return prefix
			+ UML2Util.getValidJavaIdentifier(string.replace(':', '_'));
	}

	protected static PrintWriter getPropertiesWriter(EObject eObject) {
		Resource eResource = eObject.eResource();
		ResourceSet resourceSet = eResource.getResourceSet();

		URI uri = eResource.getURI().trimFileExtension().appendFileExtension(
			UML2Util.PROPERTIES_FILE_EXTENSION);

		List<String> properties = new ArrayList<String>();

		LineNumberReader lineNumberReader = null;

		try {
			lineNumberReader = new LineNumberReader(new InputStreamReader(
				resourceSet.getURIConverter().createInputStream(uri)));

			for (String line = lineNumberReader.readLine(); null != line; line = lineNumberReader
				.readLine()) {

				properties.add(line);
			}
		} catch (Exception e) {
			// ignore
		} finally {

			try {

				if (null != lineNumberReader) {
					lineNumberReader.close();
				}
			} catch (IOException ioe) {
				// ignore
			}
		}

		PrintWriter printWriter = null;

		try {
			printWriter = new PrintWriter(resourceSet.getURIConverter()
				.createOutputStream(uri), true);

			if (!properties.isEmpty()) {

				for (String property : properties) {
					printWriter.println(property);
				}

				printWriter.println();
			}
		} catch (IOException ioe) {
			// ignore
		}

		return printWriter;
	}
}
