package common;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocaleHandler {

    public static void addLocalizations() {
        FaithCraft.addToLocalizationList("en_US");
        FaithCraft.addToLocalizationList("en_PT"); //en_PT is the pirate one, so have fun with it!!
    }

    // Not temporary, will be working around this
    public static void loadLanguages(List<Object> objects, List<String> localizations, List<String> names) {
        for (int i = 0; i < localizations.size(); i++) {
            for (int j = 0; j < objects.size(); j++) {
                LanguageRegistry.instance().addNameForObject(objects.get(j), localizations.get(i), names.get(j + (objects.size() * i)));
            }
        }
    }
}