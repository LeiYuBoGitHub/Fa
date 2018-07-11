package com.lyb.loader;

import com.lyb.item.ItemEgg;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.http.config.RegistryBuilder;
import org.lwjgl.Sys;

/**
 * Created by 野性的呼唤 on 2018/7/11.
 */
public class ItemLoader {

    public static Item dogEgg = new ItemEgg();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(dogEgg);
        System.out.println("物品本地化名称:" + dogEgg.getUnlocalizedName());
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(dogEgg);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        System.out.println("注册物品名称:" + item.getRegistryName());
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
