package com.lyb.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by 野性的呼唤 on 2018/7/10.
 */
public class TreeBlock extends Block {

    public TreeBlock(Material blockMaterialIn) {
        super(blockMaterialIn);
        //注册方块ID和名字
        setRegistryName("tree_mineral");
        //控制破坏方块所需要的时间。它可以是任意的值。方便参考起见，石头(Stone)的硬度(Hardness)为1.5，泥土(Dirt)的硬度为0.5。
        setHardness(0.5f);
        //本地化名称
        setUnlocalizedName("树矿");
        //设置方块在工具栏
        setCreativeTab(CreativeTabs.FOOD);
        //控制方块的发光程度。
        setLightLevel(1);
        //设定方块的可挖掘等级
        setHarvestLevel("木",1);
    }
}
