package net.sistone.mod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class AsphaltBlock extends Block{
    
    public AsphaltBlock() {
        super(FabricBlockSettings.copy(Blocks.SAND));
    }
}
