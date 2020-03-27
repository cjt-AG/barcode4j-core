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
package org.krysalis.barcode4j.impl.code39;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * This class is an implementation of the Code39 barcode.
 *
 * @author Jeremias Maerki
 * @version $Id: Code39.java,v 1.3 2008/05/14 08:05:08 jmaerki Exp $
 */
public class Code39 extends ConfigurableBarcodeGenerator<Code39Bean> {

	/** Create a new instance. */
	public Code39() {
		this.bean = new Code39Bean();
	}

	/**
	 * @return the underlying Code39Bean
	 */
	public Code39Bean getCode39Bean() {
		return getBean();
	}

}