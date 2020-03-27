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
package org.krysalis.barcode4j.impl.int2of5;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * This class is an implementation of the Interleaved 2 of 5 barcode.
 *
 * @author Jeremias Maerki
 * @version $Id: Interleaved2Of5.java,v 1.3 2009/02/19 10:14:54 jmaerki Exp $
 */
public class Interleaved2Of5 extends ConfigurableBarcodeGenerator<Interleaved2Of5Bean> {

	/** Create a new instance. */
	public Interleaved2Of5() {
		this.bean = new Interleaved2Of5Bean();
	}

	/**
	 * Returns the underlying {@code Interleaved2Of5Bean}.
	 *
	 * @return the underlying Interleaved2Of5Bean
	 */
	public Interleaved2Of5Bean getInterleaved2Of5Bean() {
		return getBean();
	}

}