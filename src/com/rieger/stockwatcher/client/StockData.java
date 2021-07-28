package com.rieger.stockwatcher.client;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Marco Rieger
 *
 * @description JavaScriptObject gets special treatment from the GWT compiler
 *              and development mode code server. Its purpose is to provide an
 *              opaque representation of native JavaScript objects to Java code.
 */
public class StockData extends JavaScriptObject {
	// Overlay types always have protected, zero argument constructors.
	protected StockData() {
	}

	/**
	 * JSNI methods to get stock data. Typically methods on overlay types are JSNI.
	 * These getters directly access the JSON fields you know exist.
	 */
	public final native String getSymbol() /*-{
		return this.symbol;
	}-*/;

	public final native double getPrice() /*-{
		return this.price;
	}-*/;

	public final native double getChange() /*-{
		return this.change;
	}-*/;

	/**
	 * Non-JSNI method to return change percentage. Methods on overlay types are not
	 * required to be JSNI.
	 */
	public final double getChangePercent() {
		return 100.0 * getChange() / getPrice();
	}
}
