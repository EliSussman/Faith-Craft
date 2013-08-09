package common.items;

import common.IDHandler;
import common.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;

public class WineBucket extends ItemBucket{

    private String itemName;
    
    public WineBucket(int id, int par1, String name) {
        super(id, par1);
        this.itemName = name;
        this.setUnlocalizedName(name);
    }
    
    @ForgeSubscribe
    public void onBucketFill( FillBucketEvent event )
    {
        ItemStack result = attemptFill( event.world, event.target );
        
        if ( result != null )
        {
            event.result = result;
            event.setResult( Result.ALLOW );
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
   
    @ForgeSubscribe(priority = EventPriority.NORMAL)
    public void FillBucket(FillBucketEvent event) {
    ItemStack result = attemptFill(event.world, event.target);
    if (result != null) {
    event.result = result;
    event.setResult(Result.ALLOW);
    }
    }

    private ItemStack attemptFill( World world, MovingObjectPosition p )
    {
    int id = world.getBlockId( p.blockX, p.blockY, p.blockZ );

    if ( id == IDHandler.WineID )
    {
    if ( world.getBlockMetadata( p.blockX, p.blockY, p.blockZ ) == 0 ) // Check that it is a source block
    {
    world.setBlock( p.blockX, p.blockY, p.blockZ, 0 ); // Remove the fluid block

    return new ItemStack(ItemHandler.WineBucket); // Return the filled bucked item here.
    }
    }

    return null;
    }
    
}
