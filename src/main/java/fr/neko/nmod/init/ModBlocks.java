package fr.neko.nmod.init;

import fr.neko.nmod.Nmod;
import fr.neko.nmod.utils.ModItemGroups;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Nmod.MODID);



    public static final RegistryObject<Block> CUIVRE = createBlock("cuivre", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f,15f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> EDARITE_ORE = createBlock("edarite_ore",() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f,15f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAKURA_LOG = createBlock("sakura_log",()  -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(3f, 15f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));


    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModItemGroups.Nmod_TAB)));
        return block;
    }
}
