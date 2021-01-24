
package io.github.narilutra.calmitybadgesmod.init;

import io.github.narilutra.calmitybadgesmod.Reference;
import io.github.narilutra.calmitybadgesmod.items.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModItems 
{
    static Item titanbadge;

    public static void init()
        {
            titanbadge = new ItemBase("titanbadge");
        }

@SubscribeEvent
public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(titanbadge);
    }
public static void registerRenders(ModelRegistryEvent event) 
    {
        registerRender(titanbadge);
    }
private static void registerRender(Item item) 
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
