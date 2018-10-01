package StockServices;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class StockQuote implements StockService {
    String sqSymbol;
    Calendar sqFrom, sqUntil;
    Interval sqInterval;

    public StockQuote(String symbol) {
        this.sqSymbol = symbol;
    }
    public StockQuote(String symbol, Calendar from, Calendar until) {
        this.sqSymbol = symbol;
        this.sqFrom = from;
        this.sqUntil = until;
    }
    public StockQuote(String symbol, Calendar from, Calendar until, Interval interval) {
        this.sqSymbol = symbol;
        this.sqFrom = from;
        this.sqUntil = until;
        this.sqInterval = interval;
    }
    public StockQuote() {
    }

    @Override
    public StockQuote getQuote(String symbol) {
        return new StockQuote(sqSymbol);
    }
    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until) {
        List<StockQuote> stockQuoteList = new ArrayList<>();
        StockQuote stockQuote = new StockQuote();
        StockService stockService = new StockQuote();
        stockService.getQuote(sqSymbol, sqFrom, sqUntil);
        stockQuoteList.add(stockQuote);
        return stockQuoteList;
    }
    @Override
    public List<StockQuote> getQuote(String sqSymbol, Calendar sqFrom, Calendar sqUntil, Interval sqInterval) {
        List<StockQuote> stockQuoteList = new ArrayList<>();
        StockQuote stockQuote = new StockQuote(sqSymbol, sqFrom, sqUntil, sqInterval);
        stockQuoteList.add(stockQuote);
        return stockQuoteList;
    }
}
