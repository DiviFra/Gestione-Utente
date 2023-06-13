/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package utente.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

import utente.exception.UtenteCodiceFiscaleException;
import utente.exception.UtenteNameException;
import utente.exception.UtenteSecondNameException;
import utente.model.Utente;
import utente.service.base.UtenteLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=utente.model.Utente",
	service = AopService.class
)
public class UtenteLocalServiceImpl extends UtenteLocalServiceBaseImpl {
		
	
	@Override
	public Utente addUtente(long userId, String name, String secondName, String codiceFiscale,
			ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		
		User user = userLocalService.getUser(userId);

		//kbarticle prima valida poi crea ogg poi setta infine persistenza
		//al suo interno valida togliere metodo e rimettere qua

		long groupId = serviceContext.getScopeGroupId();
		//ulteriori dati user

		validate(name, secondName, codiceFiscale);

		long utenteId = counterLocalService.increment("utente");

		Utente entity = utentePersistence.create(utenteId);

		entity.setUuid(serviceContext.getUuid());
		entity.setGroupId(groupId);
		entity.setCompanyId(user.getCompanyId());
		entity.setUserId(user.getUserId());
		entity.setUserName(user.getFullName());

		entity.setName(name);
		entity.setSecondName(secondName);
		entity.setCodiceFiscale(codiceFiscale);

		//new
		entity = utentePersistence.update(entity);

		try {
			resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
					Utente.class.getName(), utenteId, false, true, true);
		}
		catch (Exception e){
			_log.error(e, e);
		}

		return entity;
		
	}
	
	
	private void validate(
			String name, String secondName, String codiceFiscale)
			throws PortalException{

		if(Validator.isNull(name)) {
			throw new UtenteNameException();
		}
		if(Validator.isNull(secondName)) {
			throw new UtenteSecondNameException();
		}
		if(Validator.isNull(codiceFiscale)) {
			throw new UtenteCodiceFiscaleException();
		}
	}
	
	private static final Log _log = LogFactoryUtil.getLog(UtenteLocalServiceImpl.class);

	@Override
	public Utente updateUtente(long userId, long entryId, long groupId, String name, String secondName,
			String codiceFiscale, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		
		//Entry
		
		Utente entry = utentePersistence.findByPrimaryKey(entryId);
		
		User user = userLocalService.getUser(userId);
		entry.setUuid(serviceContext.getUuid());
		entry.setGroupId(groupId);
		entry.setCompanyId(user.getCompanyId());
		entry.setUserId(user.getUserId());
		entry.setUserName(user.getFullName());
		
		entry.setName(name);
		entry.setSecondName(secondName);
		entry.setCodiceFiscale(codiceFiscale);
		
		validate(name,secondName,codiceFiscale);
		
		ModelPermissions modelPermissions=serviceContext.getModelPermissions();
		resourceLocalService.updateResources(entry.getCompanyId(),entry.getGroupId(),entry.getName(),
				entry.getPrimaryKey(), modelPermissions	);
		
		return entry;
	}
	
	 @Override
	    public Utente deleteUtente(long utenteId) throws PortalException, SystemException {
	        Utente utente = getUtente(utenteId);
	        ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	        UserLocalServiceUtil.deleteUser(utente.getUserId());
	        return super.deleteUtente(utente);
	    }
	 
	 @ServiceReference(type = UserLocalServiceUtil.class)
	    protected UserLocalService userLocalService; 
	

}