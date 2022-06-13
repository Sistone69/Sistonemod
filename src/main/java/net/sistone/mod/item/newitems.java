package net.sistone.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sistone.mod.SistoneMod;
import net.sistone.mod.block.newblocks;

public class newitems {
    
    public static final Item COIN_ALUMINIUM =new CoinItem(new FabricItemSettings().group(SistoneMod.ITEM_GROUP));
	public static final Item COIN_BRONZE =new CoinItem(new FabricItemSettings().group(SistoneMod.ITEM_GROUP));
	public static final Item COIN_COPPER =new CoinItem(new FabricItemSettings().group(SistoneMod.ITEM_GROUP));
	public static final Item COIN_GOLD =new CoinItem(new FabricItemSettings().group(SistoneMod.ITEM_GROUP));
	public static final Item COIN_IRON =new CoinItem(new FabricItemSettings().group(SistoneMod.ITEM_GROUP));
	public static final Item BITUMEN =new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item GALVRON_NUGGET =new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item GALVRON_INGOT =new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item GALVRON_GREATSWORD =new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item WOODEN_ROD =new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item PEARL =new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item PEWTER_INGOT =new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static void register(){
        Registry.register(Registry.ITEM, new Identifier("sistonemod", "coin_aluminium"), COIN_ALUMINIUM);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "coin_bronze"), COIN_BRONZE);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "coin_copper"), COIN_COPPER);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "coin_gold"), COIN_GOLD);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "coin_iron"), COIN_IRON);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "asphalt_block"), new BlockItem(newblocks.ASPHALT_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "bitumen"), BITUMEN);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "galvron_nugget"), GALVRON_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "galvron_greatsword"), GALVRON_GREATSWORD);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "wooden_rod"), WOODEN_ROD);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "pearl"), PEARL);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "pewter_ingot"), PEWTER_INGOT);
		Registry.register(Registry.ITEM, new Identifier("sistonemod", "galvron_ingot"), GALVRON_INGOT);
    }

}
