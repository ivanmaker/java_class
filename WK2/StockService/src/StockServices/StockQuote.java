package StockServices;

import java.util.Calendar;
import java.util.List;

public class StockQuote extends StockServiceFactory implements StockService {
    @Override
    public StockQuote getQuote(String symbol) {
        return null;
    }
    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until) {
        return null;
    }
}
