package StockServices;

import java.util.Calendar;
import java.util.List;

public class StockServiceFactory extends BasicStockService{
    public StockServiceFactory getStockService(String symbol, Calendar fromDate, Calendar toDate){
        BasicStockService BSS = new BasicStockService();
        StockQuote SQ;
        SQ = (StockQuote) BSS.getQuote(symbol, fromDate, toDate);
        return SQ;
        /*returs stock service*/
    }
}
