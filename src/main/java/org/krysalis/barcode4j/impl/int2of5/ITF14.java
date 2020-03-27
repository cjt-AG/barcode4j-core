/*
 * Copyright 2008 Jeremias Maerki.
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

/**
 * This class is an implementation of ITF-14 (as defined by the <a href="http://www.gs1.org">GS1 standards organization</a>). ITF-14 is
 * basically an Interleaved 2 of 5 barcode with an added, so-called bearer bar.
 *
 * @version $Id: ITF14.java,v 1.1 2009/02/19 10:14:54 jmaerki Exp $
 */
public class ITF14 extends Interleaved2Of5 {

	/** Create a new instance. */
	public ITF14() {
		this.bean = new ITF14Bean();
	}

	/**
	 * Returns the underlying {@code ITF14Bean}.
	 *
	 * @return the underlying {@code ITF14Bean}
	 */
	public ITF14Bean getITFBean() {
		return (ITF14Bean) getBean();
	}

}