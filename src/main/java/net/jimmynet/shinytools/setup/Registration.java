package net.jimmynet.shinytools.setup;

import net.jimmynet.shinytools.shinytools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;

public class Registration {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, shinytools.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, shinytools.MOD_ID);
	
	public static void register() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
		
		ModItems.register();
		ModBlocks.register();
	}
}
