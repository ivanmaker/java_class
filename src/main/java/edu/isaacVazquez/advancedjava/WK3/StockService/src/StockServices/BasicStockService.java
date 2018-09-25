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
    public List<StockQuote> getQuote(String symbol, Calendar startCalendar, Calendar endCalendar) {
        StockQuote Quote = new StockQuote();
        Quote.getQuote(symbol, startCalendar, endCalendar);
        List<StockQuote> SQL = new ArrayList<>(Arrays.asList(Quote));
        return SQL;
    }
}

