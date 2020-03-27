/*
 * Copyright 2006 Jeremias Maerki.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krysalis.barcode4j.impl.datamatrix;

import java.awt.Dimension;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * This class is an implementation of the DataMatrix barcode.
 *
 * @version $Id: DataMatrix.java,v 1.4 2008/09/22 08:59:08 jmaerki Exp $
 */
public class DataMatrix extends ConfigurableBarcodeGenerator<DataMatrixBean> {

	/** Create a new instance. */
	public DataMatrix() {
		this.bean = new DataMatrixBean();
	}

	private Dimension parseSymbolSize(final String size) {
		int idx = size.indexOf('x');
		Dimension dim;
		if (idx > 0) {
			dim = new Dimension(Integer.parseInt(size.substring(0, idx)), Integer.parseInt(size.substring(idx + 1)));
		} else {
			int extent = Integer.parseInt(size);
			dim = new Dimension(extent, extent);
		}
		return dim;
	}

	/**
	 * @return the underlying DataMatrix bean
	 */
	public DataMatrixBean getDataMatrixBean() {
		return getBean();
	}

}