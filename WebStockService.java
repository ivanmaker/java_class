package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.StockQuote;
import com.origamisoftware.teach.advanced.util.Interval;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * I assume this interacts with the YF API directly?
 * not needing the servlet
 * I made a simple servlet but couldn't understand how to
 * integrate it into the WenStockService
 */
public class WebStockService implements StockService  {
    private Stock stock;

    @Override
    public StockQuote getQuote(String symbol) throws StockServiceException, IOException {
        stock = YahooFinance.get(symbol);
        String yfSymbol = stock.toString();

        return new StockQuote(new BigDecimal(100), Calendar.getInstance().getTime(), yfSymbol);
    }

    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until, Interval interval) throws StockServiceException, IOException {
        List<StockQuote> stockQuotes = new ArrayList<>();

        stock = YahooFinance.get(symbol, from, until);
        BigDecimal price = stock.getQuote().getPrice();
        Date aDay = (Date) stock.getHistory();
        String yfSymbol = stock.getSymbol();

        stockQuotes.add(new StockQuote(price, aDay, yfSymbol));

        return stockQuotes;
    }
}

