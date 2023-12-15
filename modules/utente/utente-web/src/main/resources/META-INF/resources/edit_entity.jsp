<%@page import="utente.model.Utente"%>
<%@ include file="init.jsp" %>

<liferay-portlet:actionURL name="/add_utente" var="addDetailsURL" />

<aui:form action="<%= addDetailsURL.toString() %>" method="post" >
    <aui:input type="hidden" name="CMD" value="ADD" />

    <aui:input type="text" name="name" value="" required="<%= true %>" />
    <aui:input type="text" name="secondName" value="" required="<%= true %>" />
    <aui:input type="text" name="codiceFiscale" value="" required="<%= true %>" />
    
    <aui:button type="submit" />     
    
 
</aui:form>
 
    
    