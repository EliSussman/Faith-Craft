import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = "FaithCraft", name = "FaithCraft", version = "1.0 Alpha")
@NetworkMod( channels = {""}, clientSideRequired = true, serverSideRequired = true )

public class FaithCraft {
    
    @EventHandler
    public static void preInit( FMLPreInitializationEvent event ) {

    }

    @EventHandler
    public static void init( FMLInitializationEvent event ) {

    }

    @EventHandler
    public static void postInit( FMLPostInitializationEvent event ) {

    }
    
}
