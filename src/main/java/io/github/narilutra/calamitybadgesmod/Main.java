package io.github.narilutra.calamitybadgesmod;

import io.github.narilutra.calamitybadgesmod.handlers.RegistryHandler;
import io.github.narilutra.calamitybadgesmod.init.ModItems;
import io.github.narilutra.calamitybadgesmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class Main 
{
    @Instance
    public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
        System.out.println(Reference.MODID + ":preInit");
        
        RegistryHandler.preInitRegistries();
    }
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println(Reference.MODID + ":init");
    }
	
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
        System.out.println(Reference.MODID + ":postInit");
    }
    
    public static CreativeTabs tabCalamity = new CreativeTabs("tab_calamity") {
    	
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.TITAN_BADGE);
		}
	};
}
