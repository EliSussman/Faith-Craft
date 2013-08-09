package common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.fluids.FluidContainerRegistry;
import common.FaithCraft;
import common.IDHandler;
import common.Reference;
import common.blocks.BlockHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

    // Items
    public static Item Cross;
    public static Item Torah;
    public static Item Bible;
    public static Item Quran;
    public static Item BodyOfChrist;
    public static Item WineBucket;

    public static void configureItems(Configuration config) {

        Cross = new Cross(IDHandler.CrossID, "Cross").setCreativeTab(FaithCraft.modTab);
        Torah = new Torah(IDHandler.TorahID, "Torah").setCreativeTab(FaithCraft.modTab);
        Bible = new Bible(IDHandler.BibleID, "Bible").setCreativeTab(FaithCraft.modTab);
        Quran = new Quran(IDHandler.QuranID, "Quran").setCreativeTab(FaithCraft.modTab);
        BodyOfChrist = new BodyOfChrist(IDHandler.BodyOfChristID, 10, 20.0F, false, "BodyOfChrist").setCreativeTab(FaithCraft.modTab);
        WineBucket = new WineBucket(IDHandler.WineBucketID, 1, "WineBucket").setCreativeTab(FaithCraft.modTab);

    }

    public static void registerItems(GameRegistry registry) {

        GameRegistry.registerItem(Cross, "Cross", Reference.modid);
        GameRegistry.registerItem(Torah, "Torah", Reference.modid);
        GameRegistry.registerItem(Bible, "Bible", Reference.modid);
        GameRegistry.registerItem(Quran, "Quran", Reference.modid);
        GameRegistry.registerItem(BodyOfChrist, "Body Of Christ", Reference.modid);
        GameRegistry.registerItem(WineBucket, "Wine Bucket", Reference.modid);

    }

    // how the next 2 methods work are temporary
    public static void addToObjectsList() {
        FaithCraft.addToObjectList(Cross);
        FaithCraft.addToObjectList(Torah);
        FaithCraft.addToObjectList(Bible);
        FaithCraft.addToObjectList(Quran);
        FaithCraft.addToObjectList(BodyOfChrist);
        FaithCraft.addToObjectList(WineBucket);
    }
    
    private static void initializeContainers(){
        FluidContainerRegistry.registerFluidContainer(BlockHandler.Wine, new ItemStack(ItemHandler.WineBucket, 1, 1), new ItemStack(Item.bucketEmpty));
    }
}
