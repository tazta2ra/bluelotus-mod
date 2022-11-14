
package xyz.aninuscsalas.bluelotus.item;

import xyz.aninuscsalas.bluelotus.init.BluelotusModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BluelotusItem extends Item {
	public BluelotusItem() {
		super(new Item.Properties().tab(BluelotusModTabs.TAB_BLUE_LOTUS_TAB).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("This is just a test item :D"));
	}
}
