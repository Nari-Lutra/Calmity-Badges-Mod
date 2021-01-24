
package io.github.narilutra.calamitybadgesmod.init;

import java.util.ArrayList;
import java.util.List;

import io.github.narilutra.calamitybadgesmod.Reference;
import io.github.narilutra.calamitybadgesmod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TITAN_BADGE = new ItemBase("titanbadge");

}
