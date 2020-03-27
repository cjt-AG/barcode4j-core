/*
 * Copyright 2002-2004 Jeremias Maerki.
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
package org.krysalis.barcode4j.impl.codabar;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * This class is an implementation of the Codabar barcode.
 *
 * @author Jeremias Maerki
 * @version $Id: Codabar.java,v 1.2 2008/11/22 09:57:10 jmaerki Exp $
 */
public class Codabar extends ConfigurableBarcodeGenerator<CodabarBean> {

	/** Create a new instance. */
	public Codabar() {
		this.bean = new CodabarBean();
	}

	/**
	 * Returns the underlying Codabar Java Bean.
	 *
	 * @return the underlying CodabarBean
	 */
	public CodabarBean getCodabarBean() {
		return getBean();
	}

}