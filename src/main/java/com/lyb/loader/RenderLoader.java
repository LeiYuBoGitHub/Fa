package com.lyb.loader;

/**
 * Created by 野性的呼唤 on 2018/7/12.
 */
public class RenderLoader {

    public RenderLoader(){
        //注册物品材质
        ItemLoader.registerRenders();
        //注册方块材质
        BlockLoader.registerRenders();
    }
}
