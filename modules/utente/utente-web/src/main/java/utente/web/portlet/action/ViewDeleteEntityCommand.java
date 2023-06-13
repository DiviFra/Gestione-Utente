package utente.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import utente.web.constants.UtenteWebPortletKeys;

@Component(
		property = { 
				"javax.portlet.name =" + UtenteWebPortletKeys.UTENTEWEB,
				"mvc.command.name=/delete_entity" 
				
			}, 
		service = MVCRenderCommand.class
	)


public class ViewDeleteEntityCommand  implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/delete_entity.jsp";
	}

}
