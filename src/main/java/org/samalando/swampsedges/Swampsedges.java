package org.samalando.swampsedges;

import net.fabricmc.api.ModInitializer;
import org.samalando.swampsedges.items.cattail;

public class Swampsedges implements ModInitializer {
public static final String MOD_ID = "swampsedges";
    @Override
    public void onInitialize() {
        cattail.initialize();
    }
}
