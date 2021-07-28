GWT Tutorial StockWatcher:
==========================
GWT Tutorial that showcases the GWT features. This version retrieves the stock
data from a python file (JsonStockDataServlet) via JSON.

!!!Attention!!!
Currently only works on a web server, not in development mode
because of the cross site problematic!

@See http://www.gwtproject.org/doc/latest/tutorial/JSON.html

Client-Side:
============

StockData (JavaScriptObject): GWT overlay type to use Json Data
StockWatcher:refreshWatchList() -> AsyncCallback<StockPrice[]> callback = new AsyncCallback<StockPrice[]>()

Server-Side:
============
war\StockPrices.php
-------------------
PHP server file that sends random stock data to the client