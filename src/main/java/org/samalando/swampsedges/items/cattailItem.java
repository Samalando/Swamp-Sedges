package org.samalando.swampsedges.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.samalando.swampsedges.Swampsedges;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class cattailItem {


    public static final Item CATTAIL = register(new Item(new Item.Settings()), "cattail");
    public static Item register(Item item, String id) {
        Identifier cattail = Identifier.of(Swampsedges.MOD_ID, "cattail");

        // Register the item.


        Item registeredItem = Registry.register(Registries.ITEM, cattail, item);

        // Return the registered item!
        return registeredItem;
    }

    public static void initialize() {
        // Get the event for modifying entries in the ingredients group.
// And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(cattailItem.CATTAIL));
    }
}