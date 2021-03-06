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

package com.liferay.grow.gamification.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the BadgeGroup service. Represents a row in the &quot;gamification_BadgeGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.grow.gamification.model.impl.BadgeGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.grow.gamification.model.impl.BadgeGroupImpl}.
 * </p>
 *
 * @author Vilmos Papp
 * @see BadgeGroup
 * @see com.liferay.grow.gamification.model.impl.BadgeGroupImpl
 * @see com.liferay.grow.gamification.model.impl.BadgeGroupModelImpl
 * @generated
 */
@ProviderType
public interface BadgeGroupModel extends BaseModel<BadgeGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a badge group model instance should use the {@link BadgeGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this badge group.
	 *
	 * @return the primary key of this badge group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this badge group.
	 *
	 * @param primaryKey the primary key of this badge group
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the badge group ID of this badge group.
	 *
	 * @return the badge group ID of this badge group
	 */
	public long getBadgeGroupId();

	/**
	 * Sets the badge group ID of this badge group.
	 *
	 * @param badgeGroupId the badge group ID of this badge group
	 */
	public void setBadgeGroupId(long badgeGroupId);

	/**
	 * Returns the group name of this badge group.
	 *
	 * @return the group name of this badge group
	 */
	@AutoEscape
	public String getGroupName();

	/**
	 * Sets the group name of this badge group.
	 *
	 * @param groupName the group name of this badge group
	 */
	public void setGroupName(String groupName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(BadgeGroup badgeGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<BadgeGroup> toCacheModel();

	@Override
	public BadgeGroup toEscapedModel();

	@Override
	public BadgeGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}