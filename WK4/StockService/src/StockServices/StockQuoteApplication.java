package StockServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StockQuoteApplication {
    public static void main(String[] args) throws ParseException {

        String symbol, startDate, endDate;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");

        symbol = "ABC";

        startDate = "2018 01 01";
        Date fromDate = sdf.parse(startDate);
        Calendar from = Calendar.getInstance();
        from.setTime(fromDate);

        endDate = "2018 01 07";
        Date toDate = sdf.parse(endDate);
        Calendar until = Calendar.getInstance();
        until.setTime(toDate);

        String week = "WK1";
        Interval interval;

        if (week == "WK1") {
            interval = new Interval(Interval.chooseWeek.WK1);
            interval.weekChosen();
        }
        else if (week == "WK2") {
            interval = new Interval(Interval.chooseWeek.WK2);
            interval.weekChosen();
        }
        else if (week == "WK3") {
            interval = new Interval(Interval.chooseWeek.WK3);
            interval.weekChosen();
        }
        else {
            interval = new Interval(Interval.chooseWeek.WK4);
            interval.weekChosen();
        }

        StockServiceFactory stockServiceFactory = new StockServiceFactory(symbol, from, until, interval);
        stockServiceFactory.getStockService(symbol, from, until, interval);
        System.out.println(stockServiceFactory);
    }
}
