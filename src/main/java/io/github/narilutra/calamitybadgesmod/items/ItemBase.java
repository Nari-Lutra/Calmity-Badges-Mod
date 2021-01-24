
package io.github.narilutra.calamitybadgesmod.items;

import io.github.narilutra.calamitybadgesmod.IHasModel;
import io.github.narilutra.calamitybadgesmod.Main;
import io.github.narilutra.calamitybadgesmod.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	private String regID;
	
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        regID = name;
        setCreativeTab(Main.tabCalamity);
        
        ModItems.ITEMS.add(this);
    }
    
    @Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, regID);
	}
}
