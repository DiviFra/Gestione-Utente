package utente.web.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import utente.service.UtenteLocalService;
import utente.web.constants.UtenteWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + UtenteWebPortletKeys.UTENTEWEB,
		    "mvc.command.name=/modify_utente"
	},
	service = MVCActionCommand.class
)


public class ActionCommandModifyUtente extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		
		
			System.out.println("Modify user =>  \n");

			
			ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
				WebKeys.THEME_DISPLAY);
			
			long utenteId=ParamUtil.getLong(actionRequest, "utenteId");
			String name = ParamUtil.getString(actionRequest, "name");
			String secondName = ParamUtil.getString(actionRequest, "secondName");
			String codiceFiscale = ParamUtil.getString(actionRequest, "codiceFiscale");
			
			_log.info("Name: " + name);
			_log.info("secondName: " + secondName);
			_log.info("codiceFiscale: " + codiceFiscale);
			
			 _utenteLocalService.updateUtente(themeDisplay.getUserId(),
						utenteId, themeDisplay.getScopeGroupId(), name, secondName, codiceFiscale,
						ServiceContextFactory.getInstance(actionRequest));
			 
			 System.out.println(" \n END Modify user =>  \n");
		}
		
		@Reference
		private UtenteLocalService _utenteLocalService;
		
		private static final Log _log = LogFactoryUtil.getLog(ActionCommandModifyUtente.class);
		
	

}