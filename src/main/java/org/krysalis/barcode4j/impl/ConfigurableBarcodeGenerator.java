/*
 * Copyright 2002-2007 Jeremias Maerki or contributors to Barcode4J, as applicable
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
package org.krysalis.barcode4j.impl;

import java.util.ArrayList;
import java.util.List;

import org.krysalis.barcode4j.BarcodeDimension;
import org.krysalis.barcode4j.BarcodeGenerator;
import org.krysalis.barcode4j.BarcodeUtil;
import org.krysalis.barcode4j.output.CanvasProvider;

/**
 * Base class for most Avalon-Configurable barcode implementation proxies.
 *
 * @version $Id: ConfigurableBarcodeGenerator.java,v 1.13 2009/02/19 10:14:54 jmaerki Exp $
 */
public abstract class ConfigurableBarcodeGenerator<T extends AbstractBarcodeBean> implements BarcodeGenerator {

	/**
	 * Contains all possible element names that may appear in barcode XML.
	 */
	public static final String[] BARCODE_ELEMENTS;

	static {
		List<String> elements = new ArrayList<>();
		// All barcode names
		elements.addAll(BarcodeUtil.getInstance().getClassResolver().getBarcodeNames());
		// All configuration element names
		elements.add("height");
		elements.add("module-width");
		elements.add("wide-factor");
		elements.add("quiet-zone");
		elements.add("vertical-quiet-zone");
		elements.add("checksum");
		elements.add("human-readable");
		elements.add("human-readable-font");
		elements.add("human-readable-size");
		elements.add("font-name");
		elements.add("font-size");
		elements.add("placement");
		elements.add("pattern");
		elements.add("display-start-stop");
		elements.add("display-checksum");
		elements.add("interchar-gap-width");
		elements.add("tall-bar-height");
		elements.add("short-bar-height");
		elements.add("track-height");
		elements.add("ascender-height");
		elements.add("baseline-alignment");
		elements.add("template");
		elements.add("group-separator");
		elements.add("check-digit-marker");
		elements.add("omit-brackets");
		elements.add("shape"); // DataMatrix
		elements.add("row-height"); // PDF417
		elements.add("columns"); // PDF417
		elements.add("min-columns"); // PDF417
		elements.add("max-columns"); // PDF417
		elements.add("min-rows"); // PDF417
		elements.add("max-rows"); // PDF417
		elements.add("ec-level"); // PDF417
		elements.add("width-to-height-ratio");
		elements.add("min-symbol-size"); // DataMatrix
		elements.add("max-symbol-size"); // DataMatrix
		elements.add("codesets"); // Code128
		elements.add("bearer-bar-width"); // ITF-14
		elements.add("bearer-box"); // ITF-14
		BARCODE_ELEMENTS = elements.toArray(new String[elements.size()]);
	}

	/** Proxy target. Barcode bean to configure. */
	protected T bean;

	/**
	 * Provides access to the underlying barcode bean.
	 *
	 * @return the underlying barcode bean
	 */
	public T getBean() {
		return this.bean;
	}

	/** {@inheritDoc} */
	@Override
	public void generateBarcode(final CanvasProvider canvas, final String msg) {
		getBean().generateBarcode(canvas, msg);
	}

	/** {@inheritDoc} */
	@Override
	public BarcodeDimension calcDimensions(final String msg) {
		return getBean().calcDimensions(msg);
	}

}
