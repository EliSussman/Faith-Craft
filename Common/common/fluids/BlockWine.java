package common.fluids;

import java.util.Random;

import common.FaithCraft;
import common.IDHandler;
import common.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;

public class BlockWine extends BlockFluidClassic{
    
    public static Icon WineStillIcon;
    public static Icon WineFlowingIcon;
    
    public BlockWine(int id, Fluid fluid, Material material) {
        super(id, fluid, material);
        stack = new FluidStack(fluid, FluidContainerRegistry.BUCKET_VOLUME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
    return Block.waterMoving.getIcon(side, meta);
    }

    @Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
    return 0x990000; // HEX color code
    }
    
    
}
