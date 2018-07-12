package com.lyb.client;

import com.lyb.loader.BlockLoader;
import com.lyb.loader.ItemLoader;
import com.lyb.loader.RenderLoader;
import com.lyb.server.CommonProxy;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by 野性的呼唤 on 2018/7/6.
 */
public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        new RenderLoader();
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
