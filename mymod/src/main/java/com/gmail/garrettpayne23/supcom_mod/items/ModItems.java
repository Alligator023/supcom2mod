package com.gmail.garrettpayne23.supcom_mod.items;

import com.gmail.garrettpayne23.supcom_mod.SupcomMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	// Create the Items register
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SupcomMod.MODID);
	
	// Add my custom Items to the register
	public static final RegistryObject<Item> OVERCHARGE = ITEMS.register("overcharge", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> RECLAIM = ITEMS.register("reclaim", () -> new Item(new Item.Properties()));
	
	// Register method for easy access from the main mod class
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
