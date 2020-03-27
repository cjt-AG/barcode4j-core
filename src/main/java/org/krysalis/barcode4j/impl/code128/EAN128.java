/*
 * Copyright 2002-2004 Jeremias Maerki.
 * Copyright 2005 Jeremias Maerki, Dietmar Bürkle.
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

/**
 * This class is an implementation of the Code 128 barcode.
 *
 * @author Jeremias Maerki, Dietmar Bürkle
 */
public class EAN128 extends Code128 {

	/** Create a new instance. */
	public EAN128() {
		this.bean = new EAN128Bean();
	}

	/**
	 * @return the underlying Code128Bean
	 */
	public EAN128Bean getEAN128Bean() {
		return (EAN128Bean) getBean();
	}

	private char getFirstChar(final String s) {
		if (s != null && s.length() > 0) {
			return s.charAt(0);
		} else {
			throw new IllegalArgumentException("Value must have at least one character");
		}
	}
}