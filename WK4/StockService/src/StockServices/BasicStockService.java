package StockServices;

import java.util.Calendar;

public class BasicStockService extends StockQuote {
    String bssSymbol;
    Calendar bssFrom;
    Calendar bssUntil;
    Interval bssInterval;

    public BasicStockService(String symbol, Calendar from, Calendar until, Interval interval){
        this.bssSymbol = symbol;
        this .bssFrom = from;
        this.bssUntil = until;
        this.bssInterval = interval;
    }
    public StockQuote getStockQuote(String bssSymbol, Calendar bssFrom, Calendar bssUntil, Interval bssInterval) {
        if (bssFrom == null )
        return new StockQuote(bssSymbol);
        else if (bssInterval == null)
        return new StockQuote(bssSymbol, bssFrom, bssUntil);
        else
        return new StockQuote(bssSymbol, bssFrom, bssUntil, bssInterval);
    }
}

