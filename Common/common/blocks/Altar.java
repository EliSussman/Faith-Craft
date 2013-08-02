package common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import common.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Altar extends Block {

    protected Icon blockIconTop;
    protected Icon blockIconBottom;

    public Altar(int par1, Material par2Material) {
        super(par1, par2Material);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
        return false;
    }

    @Override
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
        if (!canPlaceBlock(par1World, par2, par3, par4))
            return false;
        else
            return super.canPlaceBlockAt(par1World, par2, par3, par4);
    }

    @Override
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
        if (!canPlaceBlock(par1World, par2, par3, par4))
            par1World.destroyBlock(par2, par3, par4, true);
        else
            super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
    }

    @Override
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
        this.setLightValue(1f - par1World.getLightBrightness(par2, par3, par4));
        return super.onBlockPlaced(par1World, par2, par3, par4, par5, par6, par7, par8, par9);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getBlockTexture(IBlockAccess par1iBlockAccess, int par2, int par3, int par4, int par5) {
        return (this.getIcon(par5, par1iBlockAccess.getBlockMetadata(par2, par3, par4)));
    }

    @Override
    public Icon getIcon(int par1, int par2) {
        return ((par1 == 1) ? this.blockIconTop : (par1 == 0 ? this.blockIconBottom : this.blockIcon));
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.modTextureID + ":" + "AltarSide2");
        this.blockIconTop = iconRegister.registerIcon(Reference.modTextureID + ":" + "AltarTop");
        this.blockIconBottom = iconRegister.registerIcon(Reference.modTextureID + ":" + "AltarBottom");
    }

    public boolean canPlaceBlock(World par1World, int par2, int par3, int par4) {
        if ( // if there are surrounding blocks except for underneath it, then
             // the player/object can't place it.
        (par1World.blockExists(par2 - 1, par3, par4) && par1World.getBlockId(par2 - 1, par3, par4) != 0) || (par1World.blockExists(par2 - 1, par3, par4 - 1) && par1World.getBlockId(par2 - 1, par3, par4 - 1) != 0) || (par1World.blockExists(par2 - 1, par3, par4 + 1) && par1World.getBlockId(par2 - 1, par3, par4 + 1) != 0) || (par1World.blockExists(par2 + 1, par3, par4) && par1World.getBlockId(par2 + 1, par3, par4) != 0) || (par1World.blockExists(par2 + 1, par3, par4 + 1) && par1World.getBlockId(par2 + 1, par3, par4 + 1) != 0) || (par1World.blockExists(par2 + 1, par3, par4 - 1) && par1World.getBlockId(par2 + 1, par3, par4 - 1) != 0) || (par1World.blockExists(par2, par3, par4 - 1) && par1World.getBlockId(par2, par3, par4 - 1) != 0)
                || (par1World.blockExists(par2, par3, par4 + 1) && par1World.getBlockId(par2, par3, par4 + 1) != 0) || (par1World.blockExists(par2, par3 + 1, par4) && par1World.getBlockId(par2, par3 + 1, par4) != 0) || (par1World.blockExists(par2 - 1, par3 + 1, par4) && par1World.getBlockId(par2 - 1, par3 + 1, par4) != 0) || (par1World.blockExists(par2 - 1, par3 + 1, par4 - 1) && par1World.getBlockId(par2 - 1, par3 + 1, par4 - 1) != 0) || (par1World.blockExists(par2 - 1, par3 + 1, par4 + 1) && par1World.getBlockId(par2 - 1, par3 + 1, par4 + 1) != 0) || (par1World.blockExists(par2 + 1, par3 + 1, par4) && par1World.getBlockId(par2 + 1, par3 + 1, par4) != 0) || (par1World.blockExists(par2 + 1, par3 + 1, par4 + 1) && par1World.getBlockId(par2 + 1, par3 + 1, par4 + 1) != 0)
                || (par1World.blockExists(par2 + 1, par3 + 1, par4 - 1) && par1World.getBlockId(par2 + 1, par3 + 1, par4 - 1) != 0) || (par1World.blockExists(par2, par3 + 1, par4 - 1) && par1World.getBlockId(par2, par3 + 1, par4 - 1) != 0) || (par1World.blockExists(par2, par3 + 1, par4 + 1) && par1World.getBlockId(par2, par3 + 1, par4 + 1) != 0))
            return false;
        else
            return true;
    }
}
