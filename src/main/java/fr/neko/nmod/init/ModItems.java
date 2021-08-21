package fr.neko.nmod.init;

import fr.neko.nmod.Nmod;
import fr.neko.nmod.utils.CustomArmorMaterials;
import fr.neko.nmod.utils.CustomItemTiers;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Nmod.MODID);
// Items
    public static final RegistryObject<Item> LIQUID_PHAZON = ITEMS.register("liquid_phazon", () -> new Item(new Item.Properties().maxStackSize(9).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> TEA_LEAF = ITEMS.register("tea_leaf", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DRIED_TEA_LEAF = ITEMS.register("dried_tea_leaf", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CUP = ITEMS.register("cup", () -> new Item(new Item.Properties().maxStackSize(4).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> GROUND_COFFEE = ITEMS.register("ground_coffee", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> EDARITE_CRYSTAL = ITEMS.register("edarite_crystal", ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BISMUTH_CRYSTAL = ITEMS.register("bismuth_crystal",()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DARK_INGOT = ITEMS.register("dark_ingot", ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//Arme et Outil
    public static final RegistryObject<Item> PHAZON_SWORD = ITEMS.register("phazon_sword", () -> new SwordItem(CustomItemTiers.PHAZON,4, -2.1f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PHAZON_PICKAXE = ITEMS.register("phazon_pickaxe", () -> new PickaxeItem(CustomItemTiers.PHAZON,2, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));

// Armure
    public static final RegistryObject<Item> PHAZON_HELMET = ITEMS.register("phazon_helmet", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PHAZON_CHESTPLATE = ITEMS.register("phazon_chestplate", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PHAZON_LEGGINGS = ITEMS.register("phazon_leggings", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PHAZON_BOOTS = ITEMS.register("phazon_boots", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DARK_HELMET = ITEMS.register( "dark_helmet",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.HEAD, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DARK_CHESTPLATE = ITEMS.register( "dark_chestplate",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.CHEST, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DARK_LEGGINGS = ITEMS.register( "dark_leggings",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.LEGS, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DARK_BOOTS = ITEMS.register( "dark_boots",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.FEET, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));

// Consomable mangeable
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.3F).fastToEat().effect(()-> new EffectInstance(Effects.INSTANT_HEALTH, 1*1, 0),0.1F).build())));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.3f).fastToEat().build())));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", ()-> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.3f).build())));
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger", ()-> new Item(new Item.Properties().maxStackSize(2).group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(2f).fastToEat().effect(()-> new EffectInstance(Effects.SLOWNESS, 5*10, 0), 1F).effect(()-> new EffectInstance(Effects.WEAKNESS, 5*10, 0), 1F).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", ()-> new Item(new Item.Properties().maxStackSize(8).group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.9F).fastToEat().build())));

// Consomable buvable
    public static final RegistryObject<Item> RED_FRUIT_TEA = ITEMS.register("red_fruit_tea", () -> new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(0.01f).effect(()-> new EffectInstance(Effects.INSTANT_HEALTH, 1*1, 2),0.05f).effect(()-> new EffectInstance(Effects.REGENERATION, 20*10, 1),0.9f).effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 20*30, 1),0.05f).build()))
    {
        @Override
        public UseAction getUseAction(ItemStack stack) {
            return UseAction.DRINK;
        }
    });

    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee", () -> new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder().saturation(0.3f).effect(()-> new EffectInstance(Effects.SPEED,20*10, 1),1.0f).build()))
    {
        @Override
        public UseAction getUseAction(ItemStack stack) { return UseAction.DRINK;}
    });

    public static final RegistryObject<Item> GREEN_TEA = ITEMS.register("green_tea", () -> new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(0.01f).build()))
    {
        @Override
        public UseAction getUseAction(ItemStack stack) { return UseAction.DRINK;}
    });

// Encore en test
   // public static final RegistryObject<Item> PHAZON_BOW = ITEMS.register("phazon_bow", () -> new BowItem((new Item.Properties()).maxDamage(320).group(ItemGroup.COMBAT)));










}
