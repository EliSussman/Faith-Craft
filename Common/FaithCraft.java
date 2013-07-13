import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod( channels = {"Mod.CHANNELS"}, clientSideRequired = true, serverSideRequired = true )

public class FaithCraft {
    
    @Instance
    public static FaithCraft instance;

    @SidedProxy(clientSide = "ClientProxy", serverSide = "CommonProxy")
    public static CommonProxy proxy;

    // Blocks

    // Configuration Values

    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        // Loading in Configuration Data
        Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try {
            cfg.load();

            // Load Block IDs

            // Load Item IDs
           
        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, "FaithCraft failed to load its configuration!");
        } finally {
            cfg.save();
        }
    }

    @Init
    public void init(FMLInitializationEvent evt)
    {
        // Initialize Blocks

        // Register Blocks

        // Add Localization Data

        // Register Recipes

        // Register Rendering Information
        proxy.registerRenderInformation();
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent evt)
    {
        //Post-Initialization code such as mod hooks
    }
}
