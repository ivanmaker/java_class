<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<jsp:useBean id="StockQuery" class="com.origamisoftware.teach.advanced.model.StockQuery" scope="request"/>
<jsp:useBean id="Interval" class="com.origamisoftware.teach.advanced.util.Interval" scope="request"/>
<jsp:setProperty name="StockQuery" property="*"/>
<jsp:setProperty name="Interval" property="*"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Stock Quote Request</title>
</head>
<body>
<h2>
    Please enter StockQuery information: <br>
</h2>
<P></P>
<form name="stockQuote" action="stockQuoteResults.jsp" method="post">
    Stock Symbol : <input type="text" name="symbol"
                        value='<%= StockQuery.getSymbol() == null ? "" : StockQuery.getSymbol() %>'><br>
    Stock Date From : <input type="text" name="from"
                       value='<%= StockQuery.getFrom()== null ? "" : StockQuery.getFrom() %>'><br>
    Stock Date Until : <input type="text" name="until"
                             value='<%= StockQuery.getUntil()== null ? "" : StockQuery.getUntil() %>'><br>
    Stock Date Interval : <input type="text" name="interval"
                             value='<%= Interval.getMinutes() != 0 ? "" : Interval.getMinutes() %>'><br>
    <input type="SUBMIT" value="OK">
    <input type="HIDDEN" name="submit" value="true">
</form>

</body>
</html>
