/*******************************************************************************
 * Copyright (c) 2011 Software Engineering Institute, TU Dortmund.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    {SecSE group} - initial API and implementation and/or initial documentation
 *******************************************************************************/
package carisma.core.analysis;

import java.io.File;

import carisma.core.checks.CheckParameter;
import carisma.core.checks.CheckParameterDescriptor;


/**
 * Representation of a file check parameter.
 * @see CheckParameter
 * @author wenzel
 *
 */
public class InputFileParameter extends CheckParameter {
	/**
	 * value of this parameter.
	 */
	private File value;
	/**
	 * Constructor.
	 * @param descriptor the CheckParameterDescriptor
	 */
	public InputFileParameter(final CheckParameterDescriptor descriptor) {
		super(descriptor, !descriptor.isOptional());
	}
	/**
	 * Constructor.
	 * @param descriptor the CheckParameterDescriptor
	 * @param value value of this parameter
	 */
	public InputFileParameter(final CheckParameterDescriptor descriptor, final File value) {
		super(descriptor, !descriptor.isOptional());
		this.value = value;
	}
	/**
	 * getter for value.
	 * @return value of this parameter
	 */
	public final File getValue() {
		return this.value;
	}
	/**
	 * setter for value.
	 * @param value value of this parameter 
	 */
	public final void setValue(final File value) {
		this.value = value;
	}
	
}
