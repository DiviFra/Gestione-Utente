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

package utente.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import utente.model.Utente;

/**
 * Provides a wrapper for {@link UtenteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UtenteLocalService
 * @generated
 */
public class UtenteLocalServiceWrapper
	implements ServiceWrapper<UtenteLocalService>, UtenteLocalService {

	public UtenteLocalServiceWrapper() {
		this(null);
	}

	public UtenteLocalServiceWrapper(UtenteLocalService utenteLocalService) {
		_utenteLocalService = utenteLocalService;
	}

	@Override
	public utente.model.Utente addUtente(
			long userId, String name, String secondName, String codiceFiscale,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _utenteLocalService.addUtente(
			userId, name, secondName, codiceFiscale, serviceContext);
	}

	/**
	 * Adds the utente to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UtenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param utente the utente
	 * @return the utente that was added
	 */
	@Override
	public utente.model.Utente addUtente(utente.model.Utente utente) {
		return _utenteLocalService.addUtente(utente);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _utenteLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new utente with the primary key. Does not add the utente to the database.
	 *
	 * @param utenteId the primary key for the new utente
	 * @return the new utente
	 */
	@Override
	public utente.model.Utente createUtente(long utenteId) {
		return _utenteLocalService.createUtente(utenteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _utenteLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the utente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UtenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param utenteId the primary key of the utente
	 * @return the utente that was removed
	 * @throws PortalException if a utente with the primary key could not be found
	 */
	@Override
	public utente.model.Utente deleteUtente(long utenteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _utenteLocalService.deleteUtente(utenteId);
	}

	/**
	 * Deletes the utente from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UtenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param utente the utente
	 * @return the utente that was removed
	 */
	@Override
	public utente.model.Utente deleteUtente(utente.model.Utente utente) {
		return _utenteLocalService.deleteUtente(utente);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _utenteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _utenteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _utenteLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _utenteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>utente.model.impl.UtenteModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _utenteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>utente.model.impl.UtenteModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _utenteLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _utenteLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _utenteLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public utente.model.Utente fetchUtente(long utenteId) {
		return _utenteLocalService.fetchUtente(utenteId);
	}

	/**
	 * Returns the utente matching the UUID and group.
	 *
	 * @param uuid the utente's UUID
	 * @param groupId the primary key of the group
	 * @return the matching utente, or <code>null</code> if a matching utente could not be found
	 */
	@Override
	public utente.model.Utente fetchUtenteByUuidAndGroupId(
		String uuid, long groupId) {

		return _utenteLocalService.fetchUtenteByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _utenteLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _utenteLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _utenteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _utenteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _utenteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the utente with the primary key.
	 *
	 * @param utenteId the primary key of the utente
	 * @return the utente
	 * @throws PortalException if a utente with the primary key could not be found
	 */
	@Override
	public utente.model.Utente getUtente(long utenteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _utenteLocalService.getUtente(utenteId);
	}

	/**
	 * Returns the utente matching the UUID and group.
	 *
	 * @param uuid the utente's UUID
	 * @param groupId the primary key of the group
	 * @return the matching utente
	 * @throws PortalException if a matching utente could not be found
	 */
	@Override
	public utente.model.Utente getUtenteByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _utenteLocalService.getUtenteByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the utentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>utente.model.impl.UtenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of utentes
	 * @param end the upper bound of the range of utentes (not inclusive)
	 * @return the range of utentes
	 */
	@Override
	public java.util.List<utente.model.Utente> getUtentes(int start, int end) {
		return _utenteLocalService.getUtentes(start, end);
	}

	/**
	 * Returns all the utentes matching the UUID and company.
	 *
	 * @param uuid the UUID of the utentes
	 * @param companyId the primary key of the company
	 * @return the matching utentes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<utente.model.Utente> getUtentesByUuidAndCompanyId(
		String uuid, long companyId) {

		return _utenteLocalService.getUtentesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of utentes matching the UUID and company.
	 *
	 * @param uuid the UUID of the utentes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of utentes
	 * @param end the upper bound of the range of utentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching utentes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<utente.model.Utente> getUtentesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<utente.model.Utente>
			orderByComparator) {

		return _utenteLocalService.getUtentesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of utentes.
	 *
	 * @return the number of utentes
	 */
	@Override
	public int getUtentesCount() {
		return _utenteLocalService.getUtentesCount();
	}

	/**
	 * Updates the utente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UtenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param utente the utente
	 * @return the utente that was updated
	 */
	@Override
	public utente.model.Utente updateUtente(utente.model.Utente utente) {
		return _utenteLocalService.updateUtente(utente);
	}

	@Override
	public UtenteLocalService getWrappedService() {
		return _utenteLocalService;
	}

	@Override
	public void setWrappedService(UtenteLocalService utenteLocalService) {
		_utenteLocalService = utenteLocalService;
	}

	private UtenteLocalService _utenteLocalService;

	@Override
	public Utente updateUtente(long userId, long entryId, long groupId, String name, String secondName,
			String codiceFiscale, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

}