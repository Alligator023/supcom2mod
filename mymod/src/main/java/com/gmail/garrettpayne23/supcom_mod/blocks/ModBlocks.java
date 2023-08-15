package com.gmail.garrettpayne23.supcom_mod.blocks;

import com.gmail.garrettpayne23.supcom_mod.SupcomMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	// Create the Blocks register
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SupcomMod.MODID);
	
	// Add my custom Blocks to the register
		// NATURAL
		public static final RegistryObject<Block> MASS_DEPOSIT = BLOCKS.register("mass_deposit", null);
		// ECONOMY
		public static final RegistryObject<Block> MASS_EXTRACTOR = BLOCKS.register("mass_extractor", null);
		public static final RegistryObject<Block> POWER_GENERATOR = BLOCKS.register("power_generator", null);
		public static final RegistryObject<Block> RESEARCH_STATION = BLOCKS.register("research_station", null);
		// DEFENSE
		public static final RegistryObject<Block> POINT_DEFENSE = BLOCKS.register("point_defense", null);
		public static final RegistryObject<Block> ANTI_AIR_TOWER = BLOCKS.register("aa_tower", null);
		public static final RegistryObject<Block> SHIELD_GENERATOR = BLOCKS.register("shield_gen", null);
		// INTEL
		public static final RegistryObject<Block> RADAR_STATION = BLOCKS.register("radar", null);
		// FACTORIES
		public static final RegistryObject<Block> LAND_FACTORY = BLOCKS.register("land_factory", null);
		public static final RegistryObject<Block> AIR_FACTORY = BLOCKS.register("air_factory", null);
		public static final RegistryObject<Block> NAVAL_FACTORY = BLOCKS.register("naval_factory", null);
	
	// method for easy access from the main mod class
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
