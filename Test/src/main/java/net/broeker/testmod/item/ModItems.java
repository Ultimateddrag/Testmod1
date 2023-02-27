package net.broeker.testmod.item;

import net.broeker.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);


    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon", () -> new Item(new Item.Properties().stacksTo(64) ));
    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword", () -> new Item(new Item.Properties().stacksTo(1) ));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }

}
