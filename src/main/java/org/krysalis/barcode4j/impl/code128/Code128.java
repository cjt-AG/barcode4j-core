/*
 * Copyright 2002-2004,2009 Jeremias Maerki.
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
package org.krysalis.barcode4j.impl.code128;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * This class is an implementation of the Code 128 barcode.
 *
 * @version $Id: Code128.java,v 1.2 2009/02/18 16:22:23 jmaerki Exp $
 */
public class Code128 extends ConfigurableBarcodeGenerator<Code128Bean> {

	/** Create a new instance. */
	public Code128() {
		this.bean = new Code128Bean();
	}

	/**
	 * @return the underlying Code128Bean
	 */
	public Code128Bean getCode128Bean() {
		return getBean();
	}

}