package common.blocks;

import common.CreativeTab;
import common.FaithCraft;
import common.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {

    static Block altar;

    public static void configureBlocks(Configuration config) {
        altar = new Altar(config.get("Blocks", "Altar", 2000).getInt(), Material.rock).setUnlocalizedName("blockAltar").setHardness(3.0f).setResistance(10f).setCreativeTab(FaithCraft.modTab);
    }

    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(altar, altar.getUnlocalizedName().substring(5));
    }
    
    public static void addNames(){
        // en_US
        //FaithCraft.addToNameList("Altar");
    }
    
    public static void addToObjectsList(){
        //FaithCraft.addToObjectList(altar);
    }
}
