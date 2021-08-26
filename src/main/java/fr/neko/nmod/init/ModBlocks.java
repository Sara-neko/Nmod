package fr.neko.nmod.init;

import fr.neko.nmod.Nmod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Nmod.MODID);



    public static final RegistryObject<Block> CUIVRE = createBlock("cuivre", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(3)));
    public static final RegistryObject<Block> EDARITE_ORE = createBlock("edarite_ore",() -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(3)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
