package net.ugi.sculk_depths.block.dryable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WoodType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.ugi.sculk_depths.block.ModBlocks;

public class DryableFenceGateBlock extends FenceGateBlock implements Dryable {
    public DryableFenceGateBlock(Settings settings, WoodType type) {
        super(settings, type);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        Dryable.DryBlock(state, world, pos, random, this.asBlock());
    }
}
