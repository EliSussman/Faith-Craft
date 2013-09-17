package common.entity;

import common.IDHandler;
import common.items.ItemHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class EntityAngel extends EntityAgeable implements IMerchant, INpc{

    public EntityAngel(World par1World) {
        super(par1World);
        this.experienceValue = 100;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntitySpider.class, 0.3D, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 0.3D, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityZombie.class, 0.3D, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityCreeper.class, 0.3D, false));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.6D));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityVillager.class, 5.0F, 0.02F));
        this.tasks.addTask(9, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
    }

    protected boolean isAIEnabled(){
        return true;
    }
    
    public int getMaxHealth(){
        return 200;
    }
    
    protected String getLivingSound(){
        return "mob.villager.idle";
    }

    protected String getHurtSound(){
        return "mob.villager.hit";
    }
    
    protected String getDeathSound(){
        return "mob.villager.death";
    }
    
    protected int getItemId(){
        return Item.ingotGold.itemID;
    }
    
    protected void dropRareDrop(int par1){
        switch (this.rand.nextInt(3)){
            case 0:
                this.dropItem(IDHandler.CrossID, 1);
                break;
            case 1:
                this.dropItem(IDHandler.BibleID, 1);
                break;
        }
    }
    
    

    @Override
    public void setCustomer(EntityPlayer entityplayer) {
        
    }

    @Override
    public EntityPlayer getCustomer() {
        return null;
    }

    @Override
    public MerchantRecipeList getRecipes(EntityPlayer entityplayer) {
        return null;
    }

    @Override
    public void setRecipes(MerchantRecipeList merchantrecipelist) {
        
    }

    @Override
    public void useRecipe(MerchantRecipe merchantrecipe) {
        
    }

    @Override
    public void func_110297_a_(ItemStack itemstack) {
        
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }

}
