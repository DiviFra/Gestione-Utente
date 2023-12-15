package utente.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import utente.model.Utente;
import utente.service.UtenteLocalService;
import utente.service.UtenteLocalServiceUtil;
import utente.web.constants.UtenteWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + UtenteWebPortletKeys.UTENTEWEB,
		    "mvc.command.name=/delete_entity"
	},
	service = MVCActionCommand.class
)

public class ActionCommandDeleteUtente extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("invoca Servizio ActionCommandDeleteUtente");
		long userId=ParamUtil.getLong(actionRequest, "utenteId");
		System.out.println("User ID => " + userId );
		
//			
//			
//			_utenteLocalService.deleteUtente(utenteId);	
		
		//Utente utente = UtenteLocalServiceUtil.getUtente(userId);
        UtenteLocalServiceUtil.deleteUtente(UtenteLocalServiceUtil.getUtente(userId));
        			
	}


	@Reference
	private UtenteLocalService _utenteLocalService;
}