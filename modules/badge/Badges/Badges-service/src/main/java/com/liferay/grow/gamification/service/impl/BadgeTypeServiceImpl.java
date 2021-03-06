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

package com.liferay.grow.gamification.service.impl;

import com.liferay.grow.gamification.model.BadgeType;
import com.liferay.grow.gamification.service.base.BadgeTypeServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the badge type remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.grow.gamification.service.BadgeTypeService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Vilmos Papp
 * @see BadgeTypeServiceBaseImpl
 * @see com.liferay.grow.gamification.service.BadgeTypeServiceUtil
 */
public class BadgeTypeServiceImpl extends BadgeTypeServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.grow.gamification.service.BadgeTypeServiceUtil} to access the badge type remote service.
	 */
	public List<BadgeType> getAvailableBadgeTypes() {
		return badgeTypeLocalService.getAvailableBadgeTypes();
	}

}