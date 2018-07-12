package com.lyb.server;

import com.lyb.loader.BlockLoader;
import com.lyb.loader.ItemLoader;
import com.lyb.loader.RenderLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by 野性的呼唤 on 2018/7/6.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        //注册物品
        new ItemLoader(event);
        //注册方块
        new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
