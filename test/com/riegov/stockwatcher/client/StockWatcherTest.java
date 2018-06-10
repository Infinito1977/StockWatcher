package com.riegov.stockwatcher.client;

import org.junit.jupiter.api.Test;

import com.google.gwt.junit.client.GWTTestCase;

class StockWatcherTest extends GWTTestCase {
    @Override
    public String getModuleName() {
	return "com.riegov.stockwatcher.StockWatcher";
    }

    @Test
    void test() {
	assertTrue(true);
    }
    
    /**
     * Verify that the instance fields in the StockPrice class are set correctly.
     */
    @Test
    public void testStockPrice() {
      String symbol = "XYZ";
      double price = 70.0;
      double change = 2.0;
      double changePercent = 100.0 * change / price;

      StockPrice sp = new StockPrice(symbol, price, change);
      assertNotNull(sp);
      assertEquals(symbol, sp.getSymbol());
      assertEquals(price, sp.getPrice(), 0.001);
      assertEquals(change, sp.getChange(), 0.001);
      assertEquals(changePercent, sp.getChangePercent(), 0.001);
    }
}
