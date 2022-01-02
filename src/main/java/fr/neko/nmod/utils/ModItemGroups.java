package fr.neko.nmod.utils;

import fr.neko.nmod.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups
{
    public static final CreativeModeTab Nmod_TAB = new CreativeModeTab("NmodTAB") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.EDARITE_CRYSTAL.get());}
    };
}
