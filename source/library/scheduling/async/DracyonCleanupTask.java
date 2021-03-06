package net.tslat.aoa3.library.scheduling.async;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.utils.ModUtil;

import java.util.concurrent.TimeUnit;

public class DracyonCleanupTask implements Runnable {
    private final World world;
    private final BlockPos waterPosition;

    public DracyonCleanupTask(World world, BlockPos waterPos) {
        this.world = world;
        this.waterPosition = waterPos;
    }

    @Override
    public void run() {
        if (world.getBlockState(waterPosition).getBlock() == Blocks.WATER)
            world.setBlockToAir(waterPosition);
    }

    public void schedule(Integer time, TimeUnit units) {
        ModUtil.scheduleRequiredAsyncTask(this, time, units);
    }
}
