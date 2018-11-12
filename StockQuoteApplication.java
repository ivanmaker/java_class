package StockServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StockQuoteApplication {
    public static void main(String[] args) throws ParseException {
        StockServiceFactory SSF = new StockServiceFactory();
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        String symbol, startDate, endDate;

        System.out.println("What is the Stocks symbol? ");
            symbol = input.nextLine();
        System.out.println("View stocks starting at what date? ");
            startDate = input.nextLine();
            Date fromDate = sdf.parse(startDate);
            Calendar startCalendar = Calendar.getInstance();
            startCalendar.setTime(fromDate);


        System.out.println("End list of stocks at what date? ");
            endDate = input.nextLine();
            Date toDate = sdf.parse(endDate);
            Calendar endCalendar = Calendar.getInstance();
            endCalendar.setTime(toDate);

        SSF.getStockService(symbol, startCalendar, endCalendar);
        System.out.println(SSF);
    }
}
