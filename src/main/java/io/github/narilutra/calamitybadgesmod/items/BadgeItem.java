
package io.github.narilutra.calamitybadgesmod.items;

import io.github.narilutra.calamitybadgesmod.IHasModel;
import io.github.narilutra.calamitybadgesmod.Main;
import io.github.narilutra.calamitybadgesmod.init.ModItems;
import net.minecraft.item.ItemSimpleFoiled;

public class BadgeItem extends ItemSimpleFoiled implements IHasModel
{
	private String regID;
	
    public BadgeItem(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        regID = name;
        setCreativeTab(Main.tabBadge);
        
        ModItems.ITEMS.add(this);
    }
    
    @Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, regID);
	}
}
