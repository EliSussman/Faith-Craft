package common;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocaleHandler {

    private static List<String> getFiles(String path){
        InputStream stream = LocaleHandler.class.getResourceAsStream(path+"langs.txt");
        List<String> names = new ArrayList<String>();
        Scanner scanner = new Scanner(stream);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            if(!line.equals("")){
                names.add(line+".lang");
            }
        }
        scanner.close();
        return names;
    }

    public static void getNames(List<String> names, String path) {
        List<String> files = getFiles(path);

        for (int i = 0; i < files.size(); i++) {
            String file = path+files.get(i);
            InputStream stream = LocaleHandler.class.getResourceAsStream(file);
            try {
                Scanner scanner = new Scanner(stream);
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    if (!line.equals("") && line.contains("=")) {
                        String[] line2 = line.split("=");
                        String locale = file.substring(file.lastIndexOf('/') + 1, file.lastIndexOf('/') + 6);
                        names.add(line2[0] + ":" + line2[1] + ":" + locale);
                    }
                }
                scanner.close();
            }
            catch (Exception e) {

            }
        }

    }

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