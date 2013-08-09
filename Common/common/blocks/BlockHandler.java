package common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import common.FaithCraft;
import common.IDHandler;
import common.fluids.BlockWine;
import common.fluids.Wine;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler {
    
    public static Fluid Wine;
    
    public static Block BlockWine;
    public static Block altar;

    public static void configureBlocks(Configuration config) {
        
        Wine = new Wine();
        
        BlockWine = new BlockWine(IDHandler.WineID, Wine, Material.water).setUnlocalizedName("Wine").setCreativeTab(FaithCraft.modTab);
        altar = new Altar(IDHandler.AltarID, Material.rock).setUnlocalizedName("blockAltar").setCreativeTab(FaithCraft.modTab);
        
        registerBlocks(new GameRegistry()); // keep this at the end spent an
                                            // hour trying to figure out why the
                                            // block wasn't there.. it wasn't
                                            // called anywhere....
    }

    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(BlockWine, "BlockWine");
        registry.registerBlock(altar, "blockAltar");
    }

    public static void addToObjectsList() {
        FaithCraft.addToObjectList(Wine);
        
        FaithCraft.addToObjectList(BlockWine);
        FaithCraft.addToObjectList(altar);
    }
    
    private static void registerFluids(){
        FluidRegistry.registerFluid(Wine);
    }

    private static void initializeLiquids(){
        Wine = new BlockWine(3000, Wine, Material.water).getFluid();
    }

    public static void registerFluid(Fluid registry) {
        registerFluid(Wine);
    }
}
