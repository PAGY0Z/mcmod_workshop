package com.example.examplemod;

import java.util.ArrayList;

public class cacamod {
    public static  void setItemName(Item Item, String name) {
        item.setRegistryName(cacamod.MODID, name).setUnlocalized(ModidMod.MODID + "." + name);
        ITEMS.add(item);
    }
    public static void setItemBlockBame(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
    }
    public static final ArrayList<Item> {

    }
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    protected static void register ItemModels(ModelRegistryEvent e) {
        ITEMS.forEach(item -> registerModel(item, 0));
    }
    @SideOnlu(Side.CLIENT)
    protected static void registerModel(Item item, int metadata) {
        ModelLoader.setCustomModelRessourceLocation(item, metadata, new, ModelResourceLocation(item.getRegistryName(), "inventory"))
    }
}
