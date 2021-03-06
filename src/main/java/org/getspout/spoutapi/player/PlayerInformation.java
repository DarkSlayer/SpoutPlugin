/*
 * This file is part of SpoutPlugin.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * SpoutPlugin is licensed under the GNU Lesser General Public License.
 *
 * SpoutPlugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutPlugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.spoutapi.player;

import java.util.Set;

import org.bukkit.block.Biome;
import org.bukkit.entity.LivingEntity;

import org.getspout.spoutapi.ClientOnly;
import org.getspout.spoutapi.block.SpoutWeather;

@SuppressWarnings("deprecation")
public interface PlayerInformation {
	@ClientOnly
	public SpoutWeather getBiomeWeather(Biome biome);

	@ClientOnly
	public void setBiomeWeather(Biome biome, SpoutWeather weather);

	@ClientOnly
	public Set<Biome> getBiomes();

	@ClientOnly
	public void setEntitySkin(LivingEntity entity, String url);

	@ClientOnly
	public void setEntitySkin(LivingEntity entity, String url, EntitySkinType type);

	@ClientOnly
	public String getEntitySkin(LivingEntity entity, EntitySkinType type);
}
