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

</liferay-ui:search-container-row>

   <liferay-ui:search-iterator markupView="lexicon" paginate="false" />
</liferay-ui:search-container>

-------------------------------------------------


<liferay-ui:search-container emptyResultsMessage="no-entries-were-found">
    <liferay-ui:search-container-results
            results="<%= utentes %>"
    />
    <liferay-ui:search-container-column-text name="utenteId" />
    <liferay-ui:search-container-column-text name="name" />
    <liferay-ui:search-container-column-text name="secondName" />
    <liferay-ui:search-container-column-text name="codiceFiscale" />
    <liferay-ui:search-container-column-jsp align="right">
        <%
            PortletURL deleteURL = renderResponse.createActionURL();
            deleteURL.setParameter(ActionRequest.ACTION_NAME, "/deleteUserAction");
            deleteURL.setParameter("utenteId", String.valueOf(utente.getUtenteId()));
        %>
        <liferay-ui:icon
                message="delete"
                url="<%= deleteURL.toString() %>"
                label="delete"
                iconCssClass="icon-remove"
        />
    </liferay-ui:search-container-column-jsp>
    <liferay-ui:search-iterator markupView="lexicon" paginate="false" />
</liferay-ui:search-container>


------------------------------------------------------------------

<%@ include file="init.jsp" %>

<liferay-portlet:actionURL name="/delete_entity" var="addDetailsURL" />

<aui:form action="<%= addDetailsURL.toString() %>" method="post" >
    
	    <liferay-ui:message key="Utente:"/>
	    </br>
	   		<div>	
   	   			<aui:input type="number" name="utenteId" value="" required=" <%= true %>" />
			</div>
	    </br>
   	    <liferay-ui:message key="Eliminare Utente?"/>

	<aui:button type="submit" />   <aui:button type="button" value="Cancel" />
	
</aui:form>


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

    
    <liferay-ui:search-container-column-text name="Delete3">
    
	</liferay-ui:search-container-column-text>
	
</liferay-ui:search-container-row>

   <liferay-ui:search-iterator markupView="lexicon" paginate="false" />
</liferay-ui:search-container>
