GWT Tutorial StockWatcher:
==========================
GWT Tutorial that showcases the GWT features. This version retrieves the stock
data via RPC.

@See http://www.gwtproject.org/doc/latest/tutorial/RPC.html

Client-Side:
============

StockPrice
StockWatcher:refreshWatchList() -> AsyncCallback<StockPrice[]> callback = new AsyncCallback<StockPrice[]>()

Server-Side:
============
StockPriceServiceImpl:
---------------------
GWT rpc.RemoteServiceServlet that sends random stock data to the client