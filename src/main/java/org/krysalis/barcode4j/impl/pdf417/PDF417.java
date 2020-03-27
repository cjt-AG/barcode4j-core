/*
 * Copyright 2006-2007 Jeremias Maerki.
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
package org.krysalis.barcode4j.impl.pdf417;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * This class is an implementation of the PDF417 barcode.
 *
 * @version $Id: PDF417.java,v 1.6 2008/05/13 13:00:43 jmaerki Exp $
 */
public class PDF417 extends ConfigurableBarcodeGenerator<PDF417Bean> {

	/** Create a new instance. */
	public PDF417() {
		this.bean = new PDF417Bean();
	}

	/**
	 * @return the underlying PDF417Bean
	 */
	public PDF417Bean getPDF417Bean() {
		return getBean();
	}

}