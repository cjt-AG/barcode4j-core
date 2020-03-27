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
package org.krysalis.barcode4j.impl.fourstate;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * Implements the Royal Mail Customer Barcode.
 *
 * @author Jeremias Maerki
 * @version $Id: RoyalMailCBC.java,v 1.3 2008/05/13 13:00:43 jmaerki Exp $
 */
public class RoyalMailCBC extends ConfigurableBarcodeGenerator<RoyalMailCBCBean> {

	/** Create a new instance. */
	public RoyalMailCBC() {
		this.bean = new RoyalMailCBCBean();
	}

	/**
	 * Returns the underlying RoyalMailCBCBean.
	 *
	 * @return the underlying RoyalMailCBCBean
	 */
	public RoyalMailCBCBean getRoyalMailCBCBean() {
		return getBean();
	}

}