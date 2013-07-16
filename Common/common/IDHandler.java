package common;

import net.minecraftforge.common.Configuration;

public class IDHandler {

    // Configuration categories
    public static String blockids = "Block IDs";
    public static String itemids = "Item IDs";
    public static String liquidids = "Liquid IDs";
    
        // Block IDs
    
        // Item IDs
        public static int CrossID;
        public static int TorahID;
        public static int BibleID;
        public static int QuranID;
        
        // Liquid IDs
    
    public static void runConfiguration(Configuration config) {
        
        // Block IDs

        // Item IDs
        CrossID = config.get(itemids, "Cross ID", 1000).getInt();
        TorahID = config.get(itemids, "Torah ID", 1001).getInt();
        BibleID = config.get(itemids, "Bible ID", 1002).getInt();
        QuranID = config.get(itemids, "Quran ID", 1003).getInt();
        
        // Liquid IDs
        
    }

    
}
