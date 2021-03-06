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
package org.krysalis.barcode4j.impl.fourstate;

import org.krysalis.barcode4j.impl.ConfigurableBarcodeGenerator;

/**
 * Implements the USPS Intelligent Mail Barcode (Four State Customer Barcode).
 *
 * @author Jeremias Maerki
 * @version $Id: USPSIntelligentMail.java,v 1.1 2008/05/13 13:00:43 jmaerki Exp $
 */
public class USPSIntelligentMail extends ConfigurableBarcodeGenerator<USPSIntelligentMailBean> {

	/** Create a new instance. */
	public USPSIntelligentMail() {
		this.bean = new USPSIntelligentMailBean();
	}

	/**
	 * Returns the underlying USPSIntelligentMailBean.
	 *
	 * @return the underlying USPSIntelligentMailBean
	 */
	public USPSIntelligentMailBean getUSPSIntelligentMailBean() {
		return getBean();
	}

}