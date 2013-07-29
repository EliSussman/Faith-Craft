package common.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Altar extends BlockContainer {

    public Altar(int par1, Material par2Material) {
        super(par1, par2Material);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return null;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    public int getRenderType() {
        return 0;
    }

    public boolean isOpaqueCube() {
        return true;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public int damageDropped(int par1) {
        return par1;
    }

    public boolean blockEventRecieved(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {

        int p = MathHelper.floor_double((double) ((par5EntityPlayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;

        byte byte0 = 3;

        if (p == 0) {
            byte0 = 4;
        }
        if (p == 1) {
            byte0 = 3;
        }
        if (p == 2) {
            byte0 = 2;
        }
        if (p == 3) {
            byte0 = 1;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0, p);

        return true;
    }

}
