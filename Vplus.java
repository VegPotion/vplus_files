package com.veg.vplus;

import com.veg.vplus.registry.ModThings;
import net.fabricmc.api.ModInitializer;

public class Vplus implements ModInitializer {



    @Override
    public void onInitialize() {
        ModThings.registerItems();
    }

}
