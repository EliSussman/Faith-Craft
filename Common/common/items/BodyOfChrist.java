package common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import common.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BodyOfChrist extends Item{
    private String itemName;

    public BodyOfChrist(int par1, String name) {
        super(par1);
        this.itemName = name;
        this.setUnlocalizedName(name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
}