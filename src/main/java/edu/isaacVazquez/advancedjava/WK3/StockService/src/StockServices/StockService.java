package StockServices;

import java.util.Calendar;
import java.util.List;

public interface StockService {
    /**
     * Return the current price for a share o
     f stock  for the
     * given symbol
     * @param symbol the stock symbol of the company you want a
     * quote for e.g. APPL for APPLE
     * @return a  <CODE>BigDecimal</CODE> instance
     */
    StockQuote getQuote(String symbol);
    /**
     * Get a histo
     rical list of stock quotes for the provided
     * symbol
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until  the date of the last stock quote
     * @return a list of StockQuote instan
    ces.
     * One for each day in the range specified.
     */
    List<StockQuote> getQuote(String symbol, Calendar from,
                              Calendar until);
}
