package com.Maeluth.TIM;

import com.Maeluth.TIM.proxy.CommonProxy;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.Maeluth.TIM.proxy.CommonProxy;
import org.lwjgl.input.Keyboard;


// Tells Forge that this is a mod and it should be loaded.
@Mod(modid = TransportationInformationMod.MODID, name = TransportationInformationMod.NAME, version = TransportationInformationMod.VERSION)
public class TransportationInformationMod {
    public static final String MODID = "maeluthtransportationinformationmod";
    public static final String NAME = "Transportation Information Mod";
    public static final String VERSION = ".1";

    private static Logger logger;


    //differentiate between client and server here
    @SidedProxy(clientSide = "com.Maeluth.TIM.proxy.ClientProxy;", serverSide = "com.Maeluth.TIM.proxy.CommonProxy;")
    public static CommonProxy proxy;


    @Mod.Instance
    public static TransportationInformationMod instance;


    //Initializer Methods
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        logger = event.getModLog();
/*
Keybinds.register();
MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
*/

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new TransportationInformationModEventHandler());
        proxy.postInit(event);
    }
}