
package io.github.narilutra.calamitybadgesmod.init;

import java.util.ArrayList;
import java.util.List;

import io.github.narilutra.calamitybadgesmod.Reference;
import io.github.narilutra.calamitybadgesmod.items.BadgeItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TITAN_BADGE = new BadgeItem("titan_badge");
	public static final Item STORM_BADGE = new BadgeItem("storm_badge");
	public static final Item PERMAFROST_BADGE = new BadgeItem("permafrost_badge");
	public static final Item NIGHTWEAVER_BADGE = new BadgeItem("nightweaver_badge");
}
