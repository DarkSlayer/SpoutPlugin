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
package org.getspout.spout.entity;

import java.util.List;
import org.getspout.spoutapi.entity.SpoutEntity;
import org.getspout.spoutapi.entity.ai.SpoutAI;

public class SpoutcraftEntity implements SpoutEntity {
	private EntityBase base;
	
	public SpoutcraftEntity(EntityBase base) {
		this.base = base;
	}

	@Override
	public void addTask(SpoutAI task) {
		base.addTask(task);
	}

	@Override
	public List<SpoutAI> getTasks() {
		return base.getTasks();
	}
	
}
