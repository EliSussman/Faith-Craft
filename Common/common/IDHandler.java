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
        
        // Liquid IDs
    
    public static void runConfiguration(Configuration config) {
        
        // Block IDs

        // Item IDs
        CrossID = config.get(itemids, "Cross ID", 1000).getInt();
        
        // Liquid IDs
        
    }

    
}
