package com.cypherpsycho.bombamod.client;

import com.cypherpsycho.bombamod.blocks.SmokeBombBlock;
import com.cypherpsycho.bombamod.items.SmokeBombItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BombaModClient implements ClientModInitializer {
    public static final SmokeBombBlock SMOKE_BOMB = new SmokeBombBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    @Override
    public void onInitializeClient() {
        Registry.register(Registries.BLOCK, new Identifier("bombamod","smokebomb"), SMOKE_BOMB);
        Registry.register(Registries.ITEM, new Identifier("bombamod", "smokebomb"), new BlockItem(SMOKE_BOMB, new FabricItemSettings()));
    }
}
