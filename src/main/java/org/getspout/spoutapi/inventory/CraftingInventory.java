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
package org.getspout.spoutapi.inventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public interface CraftingInventory extends Inventory {
	/**
	 * Get's the item in the result slot of the crafting table
	 * @return result
	 */
	public ItemStack getResult();

	/**
	 * Get's the matrix of items in the crafting table
	 * @return matrix of items
	 */
	public ItemStack[] getMatrix();

	/**
	 * Set's the result item in the result slot of the crafting table
	 * @param newResult to set
	 */
	public void setResult(ItemStack newResult);

	/**
	 * Set's the matrix of items in the crafting table
	 * @param contents to set
	 */
	public void setMatrix(ItemStack[] contents);
}
