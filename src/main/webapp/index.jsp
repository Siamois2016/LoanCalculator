<%-- 
    Document   : index
    Created on : Jan 25, 2016, 9:12:37 PM
    Author     : j_gamgo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html"/>
<h1>Calculate your loan</h1>
<c:if test="${message!=null}">
    <p>${message}</p> 
    
</c:if>
   
<form action="Loan" method="get">
    <input type="hidden" name="action" value="add">          
    <label class="pad_top">Loan Amount:</label>
    <input type="text" name="pv" value="${loanbeans.getPv()}" required><br>
    <label class="pad_top">Annual interest Rate(0.0X):</label>
    <input type="text" name="rate" value="${loanbeans.getRate()}" required><br>
    <label class="pad_top">Period/Term(in months):</label>
    <input type="text" name="n" value="${loanbeans.getPeriod()}" required><br>        
   
          
    <label>&nbsp;</label>
    <input type="submit" value="Send Now" class="margin_left">
</form>
    <c:import url="/includes/footer.html" />
