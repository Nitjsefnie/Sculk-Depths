package net.ugi.sculk_depths.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamilies;
import net.ugi.sculk_depths.block.ModBlocks;
import net.ugi.sculk_depths.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /*
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
         */
        BlockStateModelGenerator.BlockTexturePool valtroxPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VALTROX_PLANKS);
        BlockStateModelGenerator.BlockTexturePool driedValtroxPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRIED_VALTROX_PLANKS);
        BlockStateModelGenerator.BlockTexturePool petrifiedValtroxPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PETRIFIED_VALTROX_SLATES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PENEBRIUM_SHROOM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PENEBRIUM_SPORE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUAZARITH_BLOCK);

        valtroxPlankPool.fenceGate(ModBlocks.VALTROX_FENCE_GATE);
        valtroxPlankPool.family(BlockFamilies.register(ModBlocks.VALTROX_PLANKS).sign(ModBlocks.VALTROX_SIGN, ModBlocks.VALTROX_WALL_SIGN).build());
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_VALTROX_LOG, ModBlocks.VALTROX_HANGING_SIGN, ModBlocks.VALTROX_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerDoor(ModBlocks.VALTROX_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.VALTROX_TRAPDOOR);

        driedValtroxPlankPool.fenceGate(ModBlocks.DRIED_VALTROX_FENCE_GATE);
        driedValtroxPlankPool.family(BlockFamilies.register(ModBlocks.DRIED_VALTROX_PLANKS).sign(ModBlocks.DRIED_VALTROX_SIGN, ModBlocks.DRIED_VALTROX_WALL_SIGN).build());
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_DRIED_VALTROX_LOG, ModBlocks.DRIED_VALTROX_HANGING_SIGN, ModBlocks.DRIED_VALTROX_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerDoor(ModBlocks.DRIED_VALTROX_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DRIED_VALTROX_TRAPDOOR);

        petrifiedValtroxPlankPool.fenceGate(ModBlocks.PETRIFIED_VALTROX_WALL_GATE);
        petrifiedValtroxPlankPool.family(BlockFamilies.register(ModBlocks.PETRIFIED_VALTROX_SLATES).sign(ModBlocks.PETRIFIED_VALTROX_SIGN, ModBlocks.PETRIFIED_VALTROX_WALL_SIGN).build());
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_PETRIFIED_VALTROX_LOG, ModBlocks.PETRIFIED_VALTROX_HANGING_SIGN, ModBlocks.PETRIFIED_VALTROX_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerDoor(ModBlocks.PETRIFIED_VALTROX_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PETRIFIED_VALTROX_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        /*
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
         */
        itemModelGenerator.register(ModItems.CRUX, Models.GENERATED);
    }
}
