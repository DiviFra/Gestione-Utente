<%@ include file="init.jsp"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<liferay-portlet:actionURL name="/delete_entity" var="addDetailsURL" />

<aui:form action="<%= addDetailsURL.toString() %>" method="post">
	<aui:input type="number" name="utenteId" value="<%= ParamUtil.getString(request, "utenteId", "") %>"
		required="<%= true %>" />

	<aui:button type="submit" />
</aui:form>
