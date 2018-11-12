package com.origamisoftware.teach.advanced.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.http.*;

/**
 * BasicServlet request data from the web service that is used by the WebStockService
 */
public class YahooServlet extends HttpServlet{
    private String symbol;
    private Calendar d1, d2;

    public YahooServlet(String symbol, Calendar from, Calendar until){
        this.symbol = symbol;
        this.d1 = from;
        this.d2 = until;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("http://finance.yahoo.com/d/quotes.csv?s="+ symbol + "&f=" + d1 + d2);
        out.println("</body>");
        out.println("</html>");
    }
}