package com.gmail.garrettpayne23.supcom_mod.items;

import com.gmail.garrettpayne23.supcom_mod.SupcomMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
	// Create a register for Creative Mode Tabs
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SupcomMod.MODID);
	
	// Add my custom Creative Mode Tab
	public static final RegistryObject<CreativeModeTab> SUPCOM_TAB = CREATIVE_MODE_TABS.register("supcom_tab", () -> CreativeModeTab.builder()
			.icon(() -> new ItemStack(ModItems.OVERCHARGE.get())) // Make the Tab Icon my custom Overcharge item
			.title(Component.translatable("creativetab.supcom_tab")) // Make the name of the Tab translatable, if possible
			.displayItems((pParamaters, pOutput) -> { 
				// Add my custom Items to the custom Creative Tab
				pOutput.accept(ModItems.OVERCHARGE.get());
				pOutput.accept(ModItems.RECLAIM.get());
			})
			.build());
	
	// method for easy access from the main mod class
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
