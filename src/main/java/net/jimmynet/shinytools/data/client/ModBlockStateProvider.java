package net.jimmynet.shinytools.data.client;

import net.jimmynet.shinytools.shinytools;
import net.jimmynet.shinytools.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, shinytools.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.SILVER_BLOCK.get());
		simpleBlock(ModBlocks.SILVER_ORE.get());
	}

}
