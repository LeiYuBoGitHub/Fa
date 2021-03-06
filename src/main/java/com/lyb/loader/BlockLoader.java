package com.lyb.loader;

import com.lyb.block.TreeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by 野性的呼唤 on 2018/7/10.
 */
public class BlockLoader {

    public static Block treeBlock = new TreeBlock(Material.WOOD);

    public BlockLoader(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Item> event) {
        System.out.println("开始注册方块......");
        event.getRegistry().register(new ItemBlock(treeBlock).setRegistryName("tree_mineral"));
        System.out.println("方块本地化名称:" + treeBlock.getUnlocalizedName());
        //注册材质
        registerRenders();

    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        System.out.println("开始注册方块材质......");
        registerRender(treeBlock);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        System.out.println("注册材质时获取到的方块名称:" + block.getRegistryName());
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
    }
}
