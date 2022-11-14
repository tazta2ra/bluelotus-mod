
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package xyz.aninuscsalas.bluelotus.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class BluelotusModTabs {
	public static CreativeModeTab TAB_BLUE_LOTUS_TAB;

	public static void load() {
		TAB_BLUE_LOTUS_TAB = FabricItemGroupBuilder.create(new ResourceLocation("bluelotus", "blue_lotus_tab"))
				.icon(() -> new ItemStack(BluelotusModItems.BLUELOTUS)).build();
	}
}
