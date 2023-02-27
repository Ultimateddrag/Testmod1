package net.broeker.testmod.item;

import net.broeker.testmod.TestMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;

@Mod.EventBusSubscriber(modid = TestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab ZIRCON_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ZIRCON_TAB =  event.registerCreativeModeTab(new ResourceLocation(TestMod.MOD_ID, "zircon_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ZIRCON_SWORD.get())).title(Component.translatable("creativemodetab.zircon_tab")));

    }
}
