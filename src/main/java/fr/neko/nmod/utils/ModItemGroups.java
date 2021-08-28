package fr.neko.nmod.utils;

import fr.neko.nmod.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups
{
    public static final ItemGroup Nmod_TAB = new ItemGroup("NmodTAB") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.EDARITE_CRYSTAL.get());}
    };
}
