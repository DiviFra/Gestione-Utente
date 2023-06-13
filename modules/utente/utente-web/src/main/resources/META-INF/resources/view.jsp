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

<liferay-portlet:actionURL name="/delete_entity" var="delteDetailsURL" />

<liferay-portlet:actionURL name="/delete_utente" var="delteDetailsURL" />




<portlet:renderURL var="deleteURL">
    <liferay-portlet:param name="mvcRenderCommandName" value="/delete_entity" />
</portlet:renderURL>

<!-- model -->
<script >
function deleteUser(userId) {
    if (confirm('Are you sure you want to delete this user?' + userId)) {
        AUI().use('aui-io-request', function(A) {
            A.io.request('<%= deleteURL.toString()%>', {
                method: 'POST',
                data: {
                    userId: userId
                },
                on: {
                    success: function() {
                    	location.reload();
                    }
                }
            });
        });
    }
}
</script>


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
			<liferay-ui:search-container-column-text name="Delete">
				<a href="javascript:;"
					onclick="deleteUser('<%=utente.getUtenteId()%>')"
					class="btn btn-danger">Delete</a>
			</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row> 
    
    <liferay-ui:search-iterator markupView="lexicon" paginate="false" />
</liferay-ui:search-container>

<liferay-ui:search-container emptyResultsMessage="no-entries-were-found">
    <liferay-ui:search-container-results
            results="<%= utentes %>"
    />

<liferay-ui:search-container-row 
	className="utente.model.Utente"
	escapedModel="<%= true %>"
	keyProperty="utenteId" 
	modelVar="utente">
	<liferay-ui:search-container-column-text name="utenteId" />
	<liferay-ui:search-container-column-text name="name" />
	<liferay-ui:search-container-column-text name="secondName" />
	<liferay-ui:search-container-column-text name="codiceFiscale" />
	<liferay-ui:search-container-column-text align="right">
		<%
			String utenteId = String.valueOf(utente.getUtenteId());
		%>
		<a href="javascript:;" class="btn btn-primary" onclick="alert('<%= utenteId %>')">Get Utente ID</a>
	</liferay-ui:search-container-column-text>

<liferay-ui:search-container-column-text align="right">
		<%
			String utenteId = String.valueOf(utente.getUtenteId());
		%>
		<a href="<%= deleteURL.toString()%>" class="btn btn-primary" onclick="deleteUser('<%= utenteId %>')">Delete ID</a>
	</liferay-ui:search-container-column-text>
	
</liferay-ui:search-container-row>

   <liferay-ui:search-iterator markupView="lexicon" paginate="false" />
</liferay-ui:search-container>

<portlet:defineObjects />

<portlet:actionURL var="addUtenteURL">
    <portlet:param name="mvcActionCommand" value="/utente/addUtente" />
</portlet:actionURL>

<portlet:actionURL var="deleteUtenteURL">
    <portlet:param name="mvcActionCommand" value="/utente/deleteUtente" />
</portlet:actionURL>

<portlet:renderURL var="viewURL"></portlet:renderURL>

<div>
    <h1>Utente Management</h1>

    <h2>Add Utente</h2>
    <form method="post" action="<%= addUtenteURL %>" >
        Utente ID: <input type="text" name="utenteId" required /><br>
        Nome: <input type="text" name="nome" required /><br>
        Cognome: <input type="text" name="cognome" required /><br>
        <aui:button type="submit" value="Add Utente" />
    </form>

    <h2>Delete Utente</h2>
    <form method="post" action="<%= deleteUtenteURL %>">
        Utente ID: <input type="text" name="utenteId" required /><br>
        <aui:button type="submit" value="Delete Utente" />
    </form>
</div>


