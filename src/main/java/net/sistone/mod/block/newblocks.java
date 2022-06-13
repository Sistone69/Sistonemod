package net.sistone.mod.block;


import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class newblocks {

    public static final Block ASPHALT_BLOCK = new AsphaltBlock();

     public static void register(){
        Registry.register(Registry.BLOCK, new Identifier("sistonemod", "asphalt_block"), ASPHALT_BLOCK);
    }   
}   
