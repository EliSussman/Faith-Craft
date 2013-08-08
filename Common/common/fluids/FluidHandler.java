package common.fluids;

import common.FaithCraft;
import common.IDHandler;
import common.items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class FluidHandler{
    
    public static Fluid Wine;
    
    private static void registerFluids(){
        FluidRegistry.registerFluid(Wine);
    }

    private static void initializeLiquids(){
        Wine = new BlockWine(3000, Wine, Material.water).getFluid();
    }

    private static void initializeContainers(){
        FluidContainerRegistry.registerFluidContainer(Wine, new ItemStack(ItemHandler.WineBucket, 1, 1), new ItemStack(Item.bucketEmpty));
    }

    public static void registerFluid(Fluid registry) {
        registerFluid(Wine);
    }
    
}