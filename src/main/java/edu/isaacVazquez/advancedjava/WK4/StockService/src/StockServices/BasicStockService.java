package StockServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class BasicStockService implements StockService {
    @Override
    public StockQuote getQuote(String symbol) {
        StockQuote Symbol = new StockQuote();
        Symbol.getQuote(symbol);
        return Symbol;
    }

    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until) {
        StockQuote Quote = new StockQuote();
        Quote.getQuote(symbol, from, until);
        return new ArrayList<>(Arrays.asList(Quote));
    }

    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until, Interval interval) {
        StockQuote Quote = new StockQuote();
        Quote.getQuote(symbol, from, until, interval);
        return new ArrayList<>(Arrays.asList(Quote));
    }
}

