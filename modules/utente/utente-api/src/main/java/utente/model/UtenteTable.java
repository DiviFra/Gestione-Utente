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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Utente_Utente&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Utente
 * @generated
 */
public class UtenteTable extends BaseTable<UtenteTable> {

	public static final UtenteTable INSTANCE = new UtenteTable();

	public final Column<UtenteTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, Long> utenteId = createColumn(
		"utenteId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UtenteTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, String> secondName = createColumn(
		"secondName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UtenteTable, String> codiceFiscale = createColumn(
		"codiceFiscale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private UtenteTable() {
		super("Utente_Utente", UtenteTable::new);
	}

}