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

package utente.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Utente}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Utente
 * @generated
 */
public class UtenteWrapper
	extends BaseModelWrapper<Utente> implements ModelWrapper<Utente>, Utente {

	public UtenteWrapper(Utente utente) {
		super(utente);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("utenteId", getUtenteId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("secondName", getSecondName());
		attributes.put("codiceFiscale", getCodiceFiscale());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long utenteId = (Long)attributes.get("utenteId");

		if (utenteId != null) {
			setUtenteId(utenteId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String secondName = (String)attributes.get("secondName");

		if (secondName != null) {
			setSecondName(secondName);
		}

		String codiceFiscale = (String)attributes.get("codiceFiscale");

		if (codiceFiscale != null) {
			setCodiceFiscale(codiceFiscale);
		}
	}

	@Override
	public Utente cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice fiscale of this utente.
	 *
	 * @return the codice fiscale of this utente
	 */
	@Override
	public String getCodiceFiscale() {
		return model.getCodiceFiscale();
	}

	/**
	 * Returns the company ID of this utente.
	 *
	 * @return the company ID of this utente
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this utente.
	 *
	 * @return the create date of this utente
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this utente.
	 *
	 * @return the group ID of this utente
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this utente.
	 *
	 * @return the modified date of this utente
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this utente.
	 *
	 * @return the name of this utente
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this utente.
	 *
	 * @return the primary key of this utente
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the second name of this utente.
	 *
	 * @return the second name of this utente
	 */
	@Override
	public String getSecondName() {
		return model.getSecondName();
	}

	/**
	 * Returns the user ID of this utente.
	 *
	 * @return the user ID of this utente
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this utente.
	 *
	 * @return the user name of this utente
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this utente.
	 *
	 * @return the user uuid of this utente
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the utente ID of this utente.
	 *
	 * @return the utente ID of this utente
	 */
	@Override
	public long getUtenteId() {
		return model.getUtenteId();
	}

	/**
	 * Returns the uuid of this utente.
	 *
	 * @return the uuid of this utente
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the codice fiscale of this utente.
	 *
	 * @param codiceFiscale the codice fiscale of this utente
	 */
	@Override
	public void setCodiceFiscale(String codiceFiscale) {
		model.setCodiceFiscale(codiceFiscale);
	}

	/**
	 * Sets the company ID of this utente.
	 *
	 * @param companyId the company ID of this utente
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this utente.
	 *
	 * @param createDate the create date of this utente
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this utente.
	 *
	 * @param groupId the group ID of this utente
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this utente.
	 *
	 * @param modifiedDate the modified date of this utente
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this utente.
	 *
	 * @param name the name of this utente
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this utente.
	 *
	 * @param primaryKey the primary key of this utente
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the second name of this utente.
	 *
	 * @param secondName the second name of this utente
	 */
	@Override
	public void setSecondName(String secondName) {
		model.setSecondName(secondName);
	}

	/**
	 * Sets the user ID of this utente.
	 *
	 * @param userId the user ID of this utente
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this utente.
	 *
	 * @param userName the user name of this utente
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this utente.
	 *
	 * @param userUuid the user uuid of this utente
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the utente ID of this utente.
	 *
	 * @param utenteId the utente ID of this utente
	 */
	@Override
	public void setUtenteId(long utenteId) {
		model.setUtenteId(utenteId);
	}

	/**
	 * Sets the uuid of this utente.
	 *
	 * @param uuid the uuid of this utente
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected UtenteWrapper wrap(Utente utente) {
		return new UtenteWrapper(utente);
	}

}