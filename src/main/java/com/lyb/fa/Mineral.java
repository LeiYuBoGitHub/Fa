package com.lyb.fa;

import com.lyb.loader.RenderLoader;
import com.lyb.server.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by 野性的呼唤 on 2018/7/12.
 */

@Mod(modid = com.lyb.fa.Mineral.MODID, name = com.lyb.fa.Mineral.NAME, version = com.lyb.fa.Mineral.VERSION,useMetadata = true)
public class Mineral {

        public static final String MODID = "mineral";
        public static final String NAME = "Mineral_Tool";
        public static final String VERSION = "1.0.0.1";

        @SidedProxy(clientSide = "com.lyb.client.ClientProxy",serverSide = "com.lyb.server.CommonProxy")
        static CommonProxy proxy;

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                proxy.preInit(event);
        }

        @EventHandler
        public void init(FMLInitializationEvent event)
        {
                proxy.init(event);
        }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event)
        {

        }

    }
