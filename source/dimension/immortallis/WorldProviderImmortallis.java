package net.tslat.aoa3.dimension.immortallis;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.audio.MusicTicker;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.DimensionRegister;
import net.tslat.aoa3.dimension.AoATeleporter;
import net.tslat.aoa3.dimension.AoAWorldProvider;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class WorldProviderImmortallis extends WorldProvider implements AoAWorldProvider {
	@Override
	public DimensionType getDimensionType() {
		return DimensionRegister.DIM_IMMORTALLIS;
	}

	@Override
	protected void init() {
		this.hasSkyLight = false;
		this.biomeProvider = DimensionRegister.WORLD_IMMORTALLIS.getBiomeProvider(world);
	}

	@Override
	public boolean hasSkyLight() {
		return false;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player, @Nullable BlockPos pos, @Nullable Entity interactedEntity, ItemStack heldStack) {
		Item item = heldStack.getItem();

		if (item instanceof ItemBlock || item instanceof ItemBucket || item instanceof ItemArmorStand || item instanceof ItemHangingEntity)
			return false;

		return true;
	}

	@Override
	public boolean canPlaceBlock(@Nullable EntityPlayer player, BlockPos pos, IBlockState block) {
		return (player != null && player.isCreative()) || block.getBlock() instanceof BlockTorch;
	}

	@Override
	public boolean canMineBlock(EntityPlayer player, BlockPos pos) {
		return player.isCreative() || world.getBlockState(pos).getBlock() instanceof BlockTorch;
	}

	@Override
	public AoATeleporter getTeleporter(WorldServer fromWorld) {
		return new ImmortallisTeleporter(fromWorld);
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return DimensionRegister.WORLD_IMMORTALLIS.getChunkGenerator(world, null);
	}

	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}

	@Override
	public boolean canSnowAt(BlockPos pos, boolean checkLight) {
		return false;
	}

	@Nullable
	@Override
	public String getSaveFolder() {
		return "AoA_Immortallis";
	}

	@Override
	public boolean canDoLightning(Chunk chunk) {
		return false;
	}

	@Override
	public boolean doesXZShowFog(int x, int z) {
		return false;
	}

	@Nullable
	@Override
	public MusicTicker.MusicType getMusicType() {
		return Enums.NULL_MUSIC;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public float getCloudHeight() {
		return 128f;
	}

	@Nullable
	@Override
	public IRenderHandler getCloudRenderer() {
		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float x, float z) {
		return new Vec3d(0 ,0 ,0);
	}

	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0.4F;
	}
}
