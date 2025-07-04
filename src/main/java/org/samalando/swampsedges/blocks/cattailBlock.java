package org.samalando.swampsedges.blocks;

import org.samalando.swampsedges.Swampsedges;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class cattailBlock {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier cattail = Identifier.of(Swampsedges.MOD_ID, "cattail_top");

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, cattail, blockItem);
        }

        return Registry.register(Registries.BLOCK, cattail, block);
    }

    public static void initialize() {
    }
}