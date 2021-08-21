package fr.neko.nmod.utils;

import fr.neko.nmod.Nmod;
import fr.neko.nmod.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum CustomArmorMaterials implements IArmorMaterial {


    PHAZON_ARMOR(Nmod.MODID + ":phazon",37, new int[]{4, 6, 8, 4}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.2f, 0.1f, () -> {
        return Ingredient.fromItems(ModItems.LIQUID_PHAZON.get());
    }),

    DARK_ARMOR(Nmod.MODID + ":dark", 40, new int[]{4, 7, 9, 4}, 7, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5f, 0.3f, () -> {
        return Ingredient.fromItems(ModItems.DARK_INGOT.get());
    }),

    STEEL_ARMOR(Nmod.MODID + ":steel",22, new int[]{2, 6, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1f,0f, () ->{
        return Ingredient.fromItems(ModItems.STEEL_INGOT.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    CustomArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float func_230304_f_() {
        return this.knockbackResistance;
    }
}
