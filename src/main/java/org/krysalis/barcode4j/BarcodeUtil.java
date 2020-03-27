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
package org.krysalis.barcode4j;

import java.lang.reflect.InvocationTargetException;

import org.krysalis.barcode4j.output.svg.SVGCanvasProvider;
import org.w3c.dom.DocumentFragment;

/**
 * This is a convenience class to generate barcodes. It is implemented as Singleton to cache the BarcodeClassResolver. However, the class
 * also contains a set of static methods which you can use of you manage your own BarcodeClassResolver.
 *
 * @author Jeremias Maerki
 * @version $Id: BarcodeUtil.java,v 1.5 2007/02/14 10:19:07 jmaerki Exp $
 */
public class BarcodeUtil {

	private static BarcodeUtil instance = null;

	private BarcodeClassResolver classResolver = new DefaultBarcodeClassResolver();

	/**
	 * Creates a new BarcodeUtil object. This constructor is protected because this class is designed as a singleton.
	 */
	protected BarcodeUtil() {
		// nop
	}

	/**
	 * Returns the default instance of this class.
	 *
	 * @return the singleton
	 */
	public static BarcodeUtil getInstance() {
		if (instance == null) {
			instance = new BarcodeUtil();
		}
		return instance;
	}

	/**
	 * Returns the class resolver used by this class.
	 *
	 * @return a BarcodeClassResolver instance
	 */
	public BarcodeClassResolver getClassResolver() {
		return this.classResolver;
	}

	/**
	 * Creates a BarcoderGenerator.
	 *
	 * @param cfg
	 *            Configuration object that specifies the barcode to produce.
	 * @param classResolver
	 *            The BarcodeClassResolver to use for lookup of barcode implementations.
	 * @return the newly instantiated BarcodeGenerator
	 * @throws BarcodeException
	 *             if setting up a BarcodeGenerator fails
	 */
	public static BarcodeGenerator createBarcodeGenerator(final String type, final BarcodeClassResolver classResolver)
			throws BarcodeException {
		Class<BarcodeGenerator> cl = null;
		try {
			// First, check Configuration directly
			cl = classResolver.resolve(type);

			// Instantiate the BarcodeGenerator
			BarcodeGenerator gen = cl.getConstructor().newInstance();
			return gen;
		} catch (IllegalAccessException ia) {
			throw new RuntimeException("Problem while instantiating a barcode generator: " + ia.getMessage(), ia);
		} catch (InstantiationException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException ie) {
			throw new BarcodeException("Error instantiating a barcode generator: " + type, ie);
		} catch (ClassNotFoundException e) {
			throw new BarcodeException("No barcode configuration element found for type: " + type, e);
		}
	}

	/**
	 * Creates a BarcoderGenerator.
	 *
	 * @param type
	 *            Configuration object that specifies the barcode to produce.
	 * @return the newly instantiated BarcodeGenerator
	 * @throws BarcodeException
	 *             if setting up a BarcodeGenerator fails
	 */
	public BarcodeGenerator createBarcodeGenerator(final String type) throws BarcodeException {
		return createBarcodeGenerator(type, this.classResolver);
	}

	/**
	 * Convenience method to create an SVG barocde as a DOM fragment.
	 *
	 * @param type
	 *            Configuration object that specifies the barcode to produce.
	 * @param msg
	 *            message to encode.
	 * @return the requested barcode as an DOM fragment (SVG format)
	 * @throws BarcodeException
	 *             if setting up a BarcodeGenerator fails
	 */
	public DocumentFragment generateSVGBarcode(final String type, final String msg) throws BarcodeException {
		BarcodeGenerator gen = createBarcodeGenerator(type);
		SVGCanvasProvider svg = new SVGCanvasProvider(false, 0);

		// Create Barcode and render it to SVG
		gen.generateBarcode(svg, msg);

		return svg.getDOMFragment();
	}

}
