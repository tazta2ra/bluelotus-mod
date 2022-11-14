
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package xyz.aninuscsalas.bluelotus.init;

import xyz.aninuscsalas.bluelotus.item.BluelotusItem;
import xyz.aninuscsalas.bluelotus.BluelotusMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BluelotusModItems {
	public static Item BLUELOTUS;

	public static void load() {
		BLUELOTUS = Registry.register(Registry.ITEM, new ResourceLocation(BluelotusMod.MODID, "bluelotus"), new BluelotusItem());
	}
}
