package common.fluids;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class Wine extends Fluid{
    public Wine(){
        super("Wine");
        setDensity(7);
        setViscosity(700);
        FluidRegistry.registerFluid(this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getStillIcon(){
        return BlockWine.WineStillIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getFlowingIcon(){
        return BlockWine.WineFlowingIcon;
    }   
}
