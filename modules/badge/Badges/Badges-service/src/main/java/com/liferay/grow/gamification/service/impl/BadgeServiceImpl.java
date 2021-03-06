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

import com.liferay.grow.gamification.model.Badge;
import com.liferay.grow.gamification.service.base.BadgeServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the badge remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.grow.gamification.service.BadgeService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Vilmos Papp
 * @see BadgeServiceBaseImpl
 * @see com.liferay.grow.gamification.service.BadgeServiceUtil
 */
public class BadgeServiceImpl extends BadgeServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.grow.gamification.service.BadgeServiceUtil} to access the badge remote service.
	 */
	public List<Badge> getBadgesOfUser(long userId) {
		return badgeLocalService.getBadgesOfUser(userId);
	}

	public List<Badge> getBadgesOfUser(long userId, int start, int end) {
		return badgeLocalService.getBadgesOfUser(userId, start, end);
	}

}