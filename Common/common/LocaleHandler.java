package common;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocaleHandler {

    // Not temporary, will be working around this
    public static void loadLanguages(List<Object> objects, List<String> names) {
        for (int i = 0; i < objects.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                String info[] = names.get(j).split(":");

                if (objects.get(i) instanceof Block) {
                    Block block = (Block) objects.get(i);
                    if (block.getUnlocalizedName().substring(5).equals(info[0])) LanguageRegistry.instance().addNameForObject(objects.get(i), info[2], info[1]);
                }

                else if (objects.get(i) instanceof Item) {
                    Item item = (Item) objects.get(i);
                    if (item.getUnlocalizedName().substring(5).equals(info[0])) LanguageRegistry.instance().addNameForObject(objects.get(i), info[2], info[1]);
                }

            }
        }
    }
}