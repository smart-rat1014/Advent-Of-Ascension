package net.tslat.aoa3.client.render.entities.projectiles.mob;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.fx.FXFlickeringFluffyTrail;
import net.tslat.aoa3.entity.projectiles.mob.EntityVineWizardShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class VineWizardShotRenderer extends Render<EntityVineWizardShot> {
	private final ResourceLocation texture;

	public VineWizardShotRenderer(final RenderManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void doRender(EntityVineWizardShot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		new FXFlickeringFluffyTrail(entity.world, entity.posX, entity.posY, entity.posZ, 0, 0, 0, Enums.RGBIntegers.GREEN, 8, 1).create();
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityVineWizardShot entity) {
		return texture;
	}
}
