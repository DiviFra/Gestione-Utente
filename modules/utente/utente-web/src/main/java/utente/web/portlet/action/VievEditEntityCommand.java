package utente.web.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import utente.web.constants.UtenteWebPortletKeys;

@Component(
		property = { 
				"javax.portlet.name =" + UtenteWebPortletKeys.UTENTEWEB,
				"mvc.command.name=/edit_entity" 
				
			}, 
		service = MVCRenderCommand.class
	)

public class VievEditEntityCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		if (_log.isDebugEnabled()) {
			_log.debug("log tramite class log");
		}
		return "/edit_entity.jsp";
	}
	
	private static final Log _log = LogFactoryUtil.getLog(VievEditEntityCommand.class);


}
