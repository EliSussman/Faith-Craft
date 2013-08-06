package common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import common.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BodyOfChrist extends ItemFood{
    
    private String itemName;
    
    public BodyOfChrist(int id, int hunger, float saturation, boolean wolfFood, String name) {
        super(id, hunger, saturation, wolfFood);
        this.itemName = name;
        this.setUnlocalizedName(name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
}