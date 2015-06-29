package net.stegr.plim;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.stegr.plim.init.ModBlocks;
import net.stegr.plim.init.ModTileEntities;
import net.stegr.plim.proxy.IProxy;
import net.stegr.plim.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,version = Reference.VERSION)
public class PlayerInterfaceMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static  PlayerInterfaceMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide =  Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModTileEntities.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}