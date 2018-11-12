
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.http.*" %>
<jsp:useBean id="StockQuery" class="com.origamisoftware.teach.advanced.model.StockQuery" scope="request"/>
<jsp:useBean id="Interval" class="com.origamisoftware.teach.advanced.util.Interval" scope="request"/>
<jsp:useBean id="YahooServlet" class="com.origamisoftware.teach.advanced.services.YahooServlet" scope="request"/>
<jsp:setProperty name="StockQuery" property="*"/>
<jsp:setProperty name="Interval" property="*"/>
<jsp:setProperty name="YahooServlet" property="*"/>

<html>
<head>
    <title>Stock Quote Query Results</title>
</head>
<body>
<h1>Your Stock Quote</h1>

Symbol: <%= StockQuery.getSymbol() %>
Date From: <%= StockQuery.getFrom() %>
Date Until: <%= StockQuery.getUntil() %>
Interval in Minutes: <%= Interval.getMinutes() %>

<%=
YahooServlet.doGet(HttpServletRequest request, HttpServletResponse response)
%>
Thank you!
</body>
</html>
