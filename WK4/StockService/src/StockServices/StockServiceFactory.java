package StockServices;

import java.util.Calendar;

public class StockServiceFactory{
    public StockServiceFactory() {
    }
    public StockServiceFactory getStockService(String Symbol, Calendar From, Calendar Until, Interval INTERVAL){
        BasicStockService basicStockService = new BasicStockService(Symbol, From, Until, INTERVAL);
        StockServiceFactory stockServiceFactory = new StockServiceFactory();
        basicStockService.getStockQuote(Symbol, From, Until, INTERVAL);
        return stockServiceFactory;
        /*returs stock service*/
    }
}