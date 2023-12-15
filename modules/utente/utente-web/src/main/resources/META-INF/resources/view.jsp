<%@ include file="/init.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="utente.model.Utente" %>
<%@ page import="utente.service.UtenteLocalServiceUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="javax.portlet.ActionRequest" %>


<%
    List<Utente> utentes = UtenteLocalServiceUtil.getUtentes(-1, -1);
%>

<!-- RenderURL / ActionURL-->
<portlet:renderURL var="editURL">
    <liferay-portlet:param name="mvcRenderCommandName" value="/edit_entity" />
</portlet:renderURL>

<portlet:renderURL var="modifyURL">
    <liferay-portlet:param name="mvcRenderCommandName" value="/modify_entity" />
</portlet:renderURL>

<portlet:renderURL var="deleteURL">
    <liferay-portlet:param name="mvcRenderCommandName" value="/delete_entity" />
</portlet:renderURL>

<p>
	<b><liferay-ui:message key="utenteweb.caption"/></b>
	<br>
	<liferay-ui:message key="utenteweb.caption"/>
	<div blue-link>
	<a href="<%= editURL.toString()%>"> Edit page </a>
	<div>
	<div> Scrivo Qualcosa </div>
</p>
  
<!--   Botton  -->
<div>	
    <aui:button-row>
        <aui:button href="<%= editURL.toString()%>" value="Add Utente"></aui:button>
        <aui:button href="<%= modifyURL.toString()%>" value="Modify Utente"></aui:button>
		<aui:button href="<%= deleteURL.toString()%>" value="Delete Utente"></aui:button>
    </aui:button-row>
</div>

<!-- search-container -->
<liferay-ui:search-container emptyResultsMessage="no-entries-were-found">
    <liferay-ui:search-container-results
            results="<%= utentes %>"
    />

    <liferay-ui:search-container-row
            className="utente.model.Utente"
            escapedModel="<%= true %>"
            keyProperty="utenteId"
            modelVar="utente">
        <liferay-ui:search-container-column-text name="utenteId"  />
        <liferay-ui:search-container-column-text name="name" />
        <liferay-ui:search-container-column-text name="secondName" />
        <liferay-ui:search-container-column-text name="codiceFiscale" />
	</liferay-ui:search-container-row> 
    
    <liferay-ui:search-iterator markupView="lexicon" paginate="false" />
</liferay-ui:search-container>

