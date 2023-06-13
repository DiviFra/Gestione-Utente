<%@ include file="init.jsp"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%-- <liferay-portlet:actionURL name="/delete_entity" var="addDetailsURL" /> --%>

<%-- <aui:form action="<%= addDetailsURL.toString() %>" method="post"> --%>
<%-- 	<aui:input type="number" name="utenteId" value="<%= ParamUtil.getString(request, "utenteId", "") %>" --%>
<%-- 		required="<%= true %>" /> --%>

<%-- 	<aui:button type="submit" /> --%>
<%-- </aui:form> --%>

<liferay-util:include page="/path/to/init.jsp">
    <liferay-util:param name="utenteId" value="${utente.utenteId}" />
</liferay-util:include>

<liferay-portlet:actionURL name="/delete_entity" var="deleteUtenteURL" />

<aui:form id="deleteUtenteForm" action="<%= deleteUtenteURL.toString() %>" method="post">
    <aui:input type="hidden" name="p_u_i_d" value="<%= ParamUtil.getString(request, "p_u_i_d", "") %>" />
    
   	<aui:input type="number" name="utenteId" value="" required=" <%= true %>" />
   	
  	<aui:input type="text" name="utenteId" value="<%= ParamUtil.getString(request, "utenteId", "") %>" required="<%= true %>" />
   	    

    <aui:input type="number" name="utenteId" value="<%= ParamUtil.getString(request, "utenteId", "") %>"
        required="<%= true %>" />

    <aui:button type="submit" />
</aui:form>

