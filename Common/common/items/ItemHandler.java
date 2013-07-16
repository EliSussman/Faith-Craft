package common.items;

import common.FaithCraft;
import common.IDHandler;
import common.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHandler {

    // Items
    public static Item Cross;
    
    public static void configureItems(Configuration config) {
       
        Cross = new Cross(IDHandler.CrossID, "Cross").setCreativeTab(FaithCraft.modTab);
        
    }

    public static void registerItems(GameRegistry registry) {
        
        GameRegistry.registerItem(Cross, "Cross", Reference.modid);
        
    }
}
