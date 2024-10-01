package jaiz.desertupdate;

import jaiz.desertupdate.block.ModBlocks;
import jaiz.desertupdate.entity.ModEntities;
import jaiz.desertupdate.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class DunesDroughtClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_LEAVES, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_SAPLING, RenderLayer.getCutout());

		EntityRendererRegistry.register(ModEntities.MASON_MOUTH, MasonMouthRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MASON_MOUTH, Masonmouth::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.BANDIT, BanditRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BANDIT, Bandit::getTexturedModelData);
	}
}