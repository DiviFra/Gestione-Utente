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

package utente.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import utente.model.Utente;

/**
 * The cache model class for representing Utente in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UtenteCacheModel implements CacheModel<Utente>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UtenteCacheModel)) {
			return false;
		}

		UtenteCacheModel utenteCacheModel = (UtenteCacheModel)object;

		if (utenteId == utenteCacheModel.utenteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, utenteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", utenteId=");
		sb.append(utenteId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", secondName=");
		sb.append(secondName);
		sb.append(", codiceFiscale=");
		sb.append(codiceFiscale);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Utente toEntityModel() {
		UtenteImpl utenteImpl = new UtenteImpl();

		if (uuid == null) {
			utenteImpl.setUuid("");
		}
		else {
			utenteImpl.setUuid(uuid);
		}

		utenteImpl.setUtenteId(utenteId);
		utenteImpl.setGroupId(groupId);
		utenteImpl.setCompanyId(companyId);
		utenteImpl.setUserId(userId);

		if (userName == null) {
			utenteImpl.setUserName("");
		}
		else {
			utenteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			utenteImpl.setCreateDate(null);
		}
		else {
			utenteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			utenteImpl.setModifiedDate(null);
		}
		else {
			utenteImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			utenteImpl.setName("");
		}
		else {
			utenteImpl.setName(name);
		}

		if (secondName == null) {
			utenteImpl.setSecondName("");
		}
		else {
			utenteImpl.setSecondName(secondName);
		}

		if (codiceFiscale == null) {
			utenteImpl.setCodiceFiscale("");
		}
		else {
			utenteImpl.setCodiceFiscale(codiceFiscale);
		}

		utenteImpl.resetOriginalValues();

		return utenteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		utenteId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		secondName = objectInput.readUTF();
		codiceFiscale = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(utenteId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (secondName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondName);
		}

		if (codiceFiscale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codiceFiscale);
		}
	}

	public String uuid;
	public long utenteId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String secondName;
	public String codiceFiscale;

}