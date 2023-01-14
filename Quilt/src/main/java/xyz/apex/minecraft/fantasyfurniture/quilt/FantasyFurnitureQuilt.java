package xyz.apex.minecraft.fantasyfurniture.quilt;

import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;

import xyz.apex.minecraft.apexcore.quilt.platform.QuiltModPlatform;
import xyz.apex.minecraft.fantasyfurniture.shared.FantasyFurniture;
import xyz.apex.minecraft.fantasyfurniture.shared.client.renderer.MultiBlockRenderer;

public final class FantasyFurnitureQuilt extends QuiltModPlatform implements FantasyFurniture
{
    public static final QuiltModPlatform INSTANCE = new FantasyFurnitureQuilt();

    @SuppressWarnings("DataFlowIssue")
    private FantasyFurnitureQuilt()
    {
        super(ID, REGISTRAR);

        // frustum is non-null during AFTER_ENTITIES
        EnvExecutor.runInEnv(Env.CLIENT, () -> () -> WorldRenderEvents.AFTER_TRANSLUCENT.register(ctx -> MultiBlockRenderer.INSTANCE.get().render(ctx.worldRenderer(), ctx.matrixStack(), ctx.tickDelta(), ctx.camera(), ctx.frustum())));
    }
}
