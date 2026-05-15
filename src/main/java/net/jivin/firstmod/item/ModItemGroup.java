package net.jivin.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jivin.firstmod.FirstMod;
//import net.jivin.firstmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PINK_GARNETS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
                                                            Identifier.of(FirstMod.MOD_ID, "pink_garnet_items"),
                                                            FabricItemGroup.builder()
                                                            .icon( () -> new ItemStack(ModItems.PINK_GARNET))
                                                            .displayName(Text.translatable("itemgroup.firstmod.pink_garnet_items"))
                                                            .entries((displayContx, entries) -> {
                                                                entries.add(ModItems.PINK_GARNET);
                                                                entries.add(ModItems.RAW_PINK_GARNET);
                                                            })
                                                            .build());
    
    /*public static final ItemGroup PINK_GARNETS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
                                                            Identifier.of(FirstMod.MOD_ID, "pink_garnet_blocks"),
                                                            FabricItemGroup.builder()
                                                            .icon( () -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                                                            .displayName(Text.translatable("itemgroup.firstmod.pink_garnet_blocks"))
                                                            .entries((displayContx, entries) -> {
                                                                entries.add(ModBlocks.PINK_GARNET_BLOCK);
                                                                entries.add(ModBlocks.PINK_GARNET_BLOCK);
                                                            })
                                                            .build());*/

    public static void registerItemGroups(){
        FirstMod.LOGGER.info("Registering Item groups for first mod" + FirstMod.MOD_ID);
    }
}
