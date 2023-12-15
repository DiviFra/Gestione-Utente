package utente.web.portlet.configuration;

import com.liferay.portal.kernel.portlet.configuration.icon.BasePortletConfigurationIcon;
import com.liferay.portal.kernel.portlet.configuration.icon.PortletConfigurationIcon;

import javax.portlet.PortletRequest;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		service = PortletConfigurationIcon.class
	)
public class ConfigurationIcon extends BasePortletConfigurationIcon {

	@Override
	public boolean isShow(PortletRequest portletRequest) {
		// TODO Auto-generated method stub
		return false;
	}

}
