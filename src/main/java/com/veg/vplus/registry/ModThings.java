package com.veg.vplus.registry;

import com.veg.vplus.CustomCropBlock;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModThings {

    public static final CropBlock RICE_CROP = new CustomCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item RICE_SEEDS = new AliasedBlockItem(ModThings.RICE_CROP, new Item.Settings().group(ItemGroup.MISC));
    public static final Item RICE_GRAIN = new Item(new FabricItemSettings().group(ItemGroup.MISC).food(FoodComponents.POTATO));


    public static void registerItems(){
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RICE_CROP);

        Registry.register(Registry.BLOCK, new Identifier("vplus", "rice_crop"), RICE_CROP);
        Registry.register(Registry.ITEM, new Identifier("vplus", "rice_seeds"), RICE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("vplus", "rice_grain"), RICE_GRAIN);
    }

}
