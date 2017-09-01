<%-- 
    Document   : bye
    Created on : Jan 25, 2016, 9:12:50 PM
    Author     : j_gamgo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.josianegamgo.loancalculator.beans.Loan"%>
<% Loan loanbeans =(Loan) request.getAttribute("loanbeans");

%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

<h1>Thanks for using our calculator</h1>
<p>Here is the information that you entered:</p>
<label>Loan Amount:</label>
<span>${loanbeans.getPv()}</span><br>
<label>Annual interest Rate(0.0X):</label>
<span>${loanbeans.getRate()}</span><br>
<label>Period/Term(in months):</label>
<span>${loanbeans.getPeriod()}</span><br>
<label>&nbsp;</label>
<label>Payment(CAD):</label>
<span>${loanbeans.getPmt()}</span><br>



<p>To enter another loan values, click on the Back 
button in your browser or the Return button shown 
below.</p>

<form action="" method="get">
    
    
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>

<c:import url="/includes/footer.html"/>

