package common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

import common.blocks.BlockHandler;
import common.items.ItemHandler;
import common.items.WineBucket;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class FaithCraft {

    static int startEntityId = 300;
    static List<Object> objects = new ArrayList<Object>();
    static List<String> names = new ArrayList<String>();

    @Instance(ModInfo.NAME)
    public static FaithCraft instance;

    public static CreativeTabs modTab = new CreativeTab(CreativeTabs.getNextID(), "FaithCraft");

    @SidedProxy(clientSide = "client.ClientProxy", serverSide = "common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new WineBucket(0, 0, null));
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        IDHandler.runConfiguration(config);
        config.save();

        BlockHandler.configureBlocks(config);
        ItemHandler.configureItems(config);

        BlockHandler.addToObjectsList();
        ItemHandler.addToObjectsList();

        proxy.init();

        LocaleHandler.getNames(names, "../assets/faithcraft/lang/");
        LocaleHandler.loadLanguages(objects, names);

        craftingRecipes();
        smeltingRecipes();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    public static void addToObjectList(Object object) {
        objects.add(object);
    }

    public static void addToNameList(String name) {
        names.add(name);
    }

    private static void craftingRecipes() {

    }

    private static void smeltingRecipes() {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
