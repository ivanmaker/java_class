package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.StockQuote;
import com.origamisoftware.teach.advanced.util.Interval;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.*;

/**
 * BasicServlet request data from the web service that is used by the WebStockService
 */
public class BasicServlet extends HttpServlet{
    private String symbol;
    private Calendar date;

    public BasicServlet(String symbol, Calendar date){
        this.symbol = symbol;
        this.date = date;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("http://finance.yahoo.com/d/quotes.csv?s="+ symbol + "d2=" + date);
        out.println("</body>");
        out.println("</html>");
    }
}