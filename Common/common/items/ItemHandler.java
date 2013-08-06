package common.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

import common.FaithCraft;
import common.IDHandler;
import common.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

    // Items
    public static Item Cross;
    public static Item Torah;
    public static Item Bible;
    public static Item Quran;
    public static Item BodyOfChrist;

    public static void configureItems(Configuration config) {

        Cross = new Cross(IDHandler.CrossID, "Cross").setCreativeTab(FaithCraft.modTab);
        Torah = new Torah(IDHandler.TorahID, "Torah").setCreativeTab(FaithCraft.modTab);
        Bible = new Bible(IDHandler.BibleID, "Bible").setCreativeTab(FaithCraft.modTab);
        Quran = new Quran(IDHandler.QuranID, "Quran").setCreativeTab(FaithCraft.modTab);
        BodyOfChrist = new BodyOfChrist(IDHandler.BodyOfChristID, 10, 20.0F, false, "BodyOfChrist").setCreativeTab(FaithCraft.modTab);

    }

    public static void registerItems(GameRegistry registry) {

        GameRegistry.registerItem(Cross, "Cross", Reference.modid);
        GameRegistry.registerItem(Torah, "Torah", Reference.modid);
        GameRegistry.registerItem(Bible, "Bible", Reference.modid);
        GameRegistry.registerItem(Quran, "Quran", Reference.modid);
        GameRegistry.registerItem(BodyOfChrist, "Body Of Christ", Reference.modid);

    }

    // how the next 2 methods work are temporary
    public static void addToObjectsList() {
        FaithCraft.addToObjectList(Cross);
        FaithCraft.addToObjectList(Torah);
        FaithCraft.addToObjectList(Bible);
        FaithCraft.addToObjectList(Quran);
        FaithCraft.addToObjectList(BodyOfChrist);
    }

    public static void addNames() {
        FaithCraft.addToNameList(Cross.getUnlocalizedName().substring(5) + ":" + "Cross" + ":" + "en_US");
        FaithCraft.addToNameList(Torah.getUnlocalizedName().substring(5) + ":" + "Torah" + ":" + "en_US");
        FaithCraft.addToNameList(Bible.getUnlocalizedName().substring(5) + ":" + "Bible" + ":" + "en_US");
        FaithCraft.addToNameList(Quran.getUnlocalizedName().substring(5) + ":" + "Quran" + ":" + "en_US");
        FaithCraft.addToNameList(BodyOfChrist.getUnlocalizedName().substring(5) + ":" + "Body Of Christ" + ":" + "en_US");
        
        FaithCraft.addToNameList(Cross.getUnlocalizedName().substring(5) + ":" + "Stick Thingy" + ":" + "en_PT");
        FaithCraft.addToNameList(Torah.getUnlocalizedName().substring(5) + ":" + "10 Commandments" + ":" + "en_PT");
        FaithCraft.addToNameList(Bible.getUnlocalizedName().substring(5) + ":" + "Holy Words" + ":" + "en_PT");
        FaithCraft.addToNameList(Quran.getUnlocalizedName().substring(5) + ":" + "Book O' Mecca" + ":" + "en_PT");
        FaithCraft.addToNameList(BodyOfChrist.getUnlocalizedName().substring(5) + ":" + "Body O' Lord" + ":" + "en_PT");
    }
}
