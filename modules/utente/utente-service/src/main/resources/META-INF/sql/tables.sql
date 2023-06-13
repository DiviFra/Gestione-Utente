create table Utente_Utente (
	uuid_ VARCHAR(75) null,
	utenteId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	secondName VARCHAR(75) null,
	codiceFiscale VARCHAR(75) null
);