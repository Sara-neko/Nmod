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
    public static final RegistryObject<Item> LIQUID_PHAZON = ITEMS.register("liquid_phazon", () -> new Item(new Item.Properties().stacksTo(4).tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TEA_LEAF = ITEMS.register("tea_leaf", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> DRIED_TEA_LEAF = ITEMS.register("dried_tea_leaf", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> CUP = ITEMS.register("cup", () -> new Item(new Item.Properties().stacksTo(4).tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> GROUND_COFFEE = ITEMS.register("ground_coffee", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> EDARITE_CRYSTAL = ITEMS.register("edarite_crystal", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> BISMUTH_CRYSTAL = ITEMS.register("bismuth_crystal",()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> DARK_INGOT = ITEMS.register("dark_ingot", ()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> LAVA_ROCK = ITEMS.register("lava_rock",() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

//Arme et Outil
    public static final RegistryObject<Item> PHAZON_SWORD = ITEMS.register("phazon_sword", () -> new SwordItem(CustomItemTiers.PHAZON,4, -2.1f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PHAZON_PICKAXE = ITEMS.register("phazon_pickaxe", () -> new PickaxeItem(CustomItemTiers.PHAZON,2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));

// Armure
    public static final RegistryObject<Item> PHAZON_HELMET = ITEMS.register("phazon_helmet", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PHAZON_CHESTPLATE = ITEMS.register("phazon_chestplate", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PHAZON_LEGGINGS = ITEMS.register("phazon_leggings", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PHAZON_BOOTS = ITEMS.register("phazon_boots", () -> new ArmorItem(CustomArmorMaterials.PHAZON_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_HELMET = ITEMS.register( "dark_helmet",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_CHESTPLATE = ITEMS.register( "dark_chestplate",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_LEGGINGS = ITEMS.register( "dark_leggings",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_BOOTS = ITEMS.register( "dark_boots",() -> new ArmorItem(CustomArmorMaterials.DARK_ARMOR,EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(CustomArmorMaterials.STEEL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(CustomArmorMaterials.STEEL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(CustomArmorMaterials.STEEL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(CustomArmorMaterials.STEEL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

// Consomable mangeable
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(2).saturationMod(0.3f).fast().effect(()-> new EffectInstance(Effects.HEAL, 1*1, 0),0.1F).build())));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(2).saturationMod(0.3f).fast().build())));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", ()-> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(3).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger", ()-> new Item(new Item.Properties().stacksTo(2).tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(10).saturationMod(2f).fast().effect(()-> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 5*10, 0), 1F).effect(()-> new EffectInstance(Effects.WEAKNESS, 5*10, 0), 1F).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", ()-> new Item(new Item.Properties().stacksTo(8).tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(5).saturationMod(0.9f).fast().build())));
    public static final RegistryObject<Item> SOFT_BREAD = ITEMS.register("soft_bread" , ()-> new Item(new Item.Properties().stacksTo(16).tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(6).saturationMod(0.9f).fast().build())));

// Consomable buvable
    public static final RegistryObject<Item> RED_FRUIT_TEA = ITEMS.register("red_fruit_tea", () -> new Item(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(1).saturationMod(0.01f).effect(()-> new EffectInstance(Effects.HEAL, 1*1, 2),0.05f).effect(()-> new EffectInstance(Effects.REGENERATION, 20*10, 1),0.9f).effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 20*30, 1),0.05f).build()))
    {
        @Override
        public UseAction getUseAnimation(ItemStack stack) {
            return UseAction.DRINK;
         }
    });

    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee", () -> new Item(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_FOOD).food(new Food.Builder().saturationMod(0.3f).effect(()-> new EffectInstance(Effects.MOVEMENT_SPEED,20*10, 1),1.0f).build()))
    {
        @Override
        public UseAction getUseAnimation(ItemStack stack) {
            return UseAction.DRINK;}
    });

    public static final RegistryObject<Item> GREEN_TEA = ITEMS.register("green_tea", () -> new Item(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(1).saturationMod(0.01f).build()))
    {
        @Override
        public UseAction getUseAnimation(ItemStack stack) {
            return UseAction.DRINK;}
    });

// Encore en test
   // public static final RegistryObject<Item> PHAZON_BOW = ITEMS.register("phazon_bow", () -> new BowItem((new Item.Properties()).maxDamage(320).group(ItemGroup.COMBAT)));










}
