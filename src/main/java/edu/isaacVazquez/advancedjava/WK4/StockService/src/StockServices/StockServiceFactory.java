package StockServices;

import java.util.Calendar;
import java.util.List;

public class StockServiceFactory extends BasicStockService{
    private StockQuote SQ;
    public StockServiceFactory getStockService(String symbol, Calendar from, Calendar until, Interval interval){
        BasicStockService BSS = new BasicStockService();

        SQ = (StockQuote) BSS.getQuote(symbol, from, until, interval);
        return SQ;
        /*returs stock service*/
    }
}
