package common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;

import common.FaithCraft;
import common.IDHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler {

    static Block altar;

    public static void configureBlocks(Configuration config) {
        altar = new Altar(IDHandler.AltarID, Material.rock).setUnlocalizedName("blockAltar").setCreativeTab(FaithCraft.modTab);

        registerBlocks(new GameRegistry()); // keep this at the end spent an
                                            // hour trying to figure out why the
                                            // block wasn't there.. it wasn't
                                            // called anywhere....
    }

    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(altar, "blockAltar");
    }

    public static void addNames() {
        FaithCraft.addToNameList(altar.getUnlocalizedName().substring(5) + ":" + "Altar" + ":" + "en_US");

        FaithCraft.addToNameList(altar.getUnlocalizedName().substring(5) + ":" + "Block O' Worship" + ":" + "en_PT");
    }

    public static void addToObjectsList() {
        FaithCraft.addToObjectList(altar);
    }
}
