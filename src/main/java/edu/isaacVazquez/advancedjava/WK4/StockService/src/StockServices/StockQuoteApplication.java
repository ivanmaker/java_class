package StockServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StockQuoteApplication {
    public static void main(String[] args) throws ParseException {
        StockServiceFactory SSF = new StockServiceFactory();
        Interval interval = new Interval();
        String symbol, startDate, endDate;

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");

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

        interval.selectWeek(week);

        SSF.getStockService(symbol, from, until, interval);
        System.out.println(SSF);
    }
}
