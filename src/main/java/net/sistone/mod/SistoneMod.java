package net.sistone.mod;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sistone.mod.block.newblocks;
import net.sistone.mod.item.newitems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SistoneMod implements ModInitializer {

	public static final String MOD_ID = "sistonemod";
	public static final Logger LOGGER =  LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build( new Identifier("sistonemod", "sistonemod"),
	(() -> new ItemStack(newitems.COIN_IRON)));

	@Override
	public void onInitialize() {

		newitems.register();
		newblocks.register();

	}
}
