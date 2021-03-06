package com.evoslab.breadcrumbs.core.registry;

import com.evoslab.breadcrumbs.core.Breadcrumbs;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Breadcrumbs.MOD_ID, bus = Bus.MOD)
public class BreadcrumbsBlocks {

    public static final BlockSubRegistryHelper HELPER = Breadcrumbs.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> BREAD_BLOCK = HELPER.createBlock("bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_SLAB = HELPER.createBlock("bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_STAIRS = HELPER.createBlock("bread_stairs", () -> new AbnormalsStairsBlock(BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_WALL = HELPER.createBlock("bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BREAD_VERTICAL_SLAB = HELPER.createCompatBlock(Mods.QUARK, "bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> POLISHED_BREAD_BLOCK = HELPER.createBlock("polished_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BREAD_SLAB = HELPER.createBlock("polished_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BREAD_STAIRS = HELPER.createBlock("polished_bread_stairs", () -> new AbnormalsStairsBlock(POLISHED_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BREAD_WALL = HELPER.createCompatBlock(Mods.LEPTON, "polished_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> POLISHED_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock(Mods.QUARK, "polished_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> BREAD_BRICKS = HELPER.createBlock("bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_SLAB = HELPER.createBlock("bread_brick_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_STAIRS = HELPER.createBlock("bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_WALL = HELPER.createBlock("bread_brick_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(Mods.QUARK, "bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> BREAD_PAVEMENT = HELPER.createCompatBlock(Mods.QUARK, "bread_pavement", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_PILLAR = HELPER.createCompatBlock(Mods.QUARK, "bread_pillar", () -> new RotatedPillarBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHISELED_BREAD_BRICKS = HELPER.createCompatBlock(Mods.QUARK, "chiseled_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> HONEY_BREAD_BLOCK = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_SLAB = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_STAIRS = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_stairs", () -> new AbnormalsStairsBlock(HONEY_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_WALL = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> HONEY_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("honey_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.BUZZIER_BEES);
    
    public static final RegistryObject<Block> POLISHED_HONEY_BREAD_BLOCK = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "polished_honey_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_HONEY_BREAD_SLAB = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "polished_honey_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_HONEY_BREAD_STAIRS = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "polished_honey_bread_stairs", () -> new AbnormalsStairsBlock(POLISHED_HONEY_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_HONEY_BREAD_WALL = HELPER.createCompatBlock("polished_honey_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS, Mods.LEPTON, Mods.BUZZIER_BEES);
    public static final RegistryObject<Block> POLISHED_HONEY_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("polished_honey_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.BUZZIER_BEES);
    
    public static final RegistryObject<Block> HONEY_BREAD_BRICKS = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_SLAB = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_brick_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_brick_stairs", () -> new AbnormalsStairsBlock(HONEY_BREAD_BRICKS.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_WALL = HELPER.createCompatBlock(Mods.BUZZIER_BEES, "honey_bread_brick_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("honey_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.BUZZIER_BEES, Mods.QUARK);
    
    public static final RegistryObject<Block> HONEY_BREAD_PAVEMENT = HELPER.createCompatBlock("honey_bread_pavement", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.BUZZIER_BEES);
    public static final RegistryObject<Block> HONEY_BREAD_PILLAR = HELPER.createCompatBlock("honey_bread_pillar", () -> new RotatedPillarBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.BUZZIER_BEES);
    public static final RegistryObject<Block> CHISELED_HONEY_BREAD_BRICKS = HELPER.createCompatBlock("chiseled_honey_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.BUZZIER_BEES);
    
    public static final RegistryObject<Block> MULBERRY_BREAD_BLOCK = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_SLAB = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_STAIRS = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_stairs", () -> new AbnormalsStairsBlock(MULBERRY_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_WALL = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> MULBERRY_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("mulberry_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.UPGRADE_AQUATIC);
    
    public static final RegistryObject<Block> POLISHED_MULBERRY_BREAD_BLOCK = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "polished_mulberry_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_MULBERRY_BREAD_SLAB = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "polished_mulberry_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_MULBERRY_BREAD_STAIRS = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "polished_mulberry_bread_stairs", () -> new AbnormalsStairsBlock(POLISHED_MULBERRY_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_MULBERRY_BREAD_WALL = HELPER.createCompatBlock("polished_mulberry_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS, Mods.LEPTON, Mods.UPGRADE_AQUATIC);
    public static final RegistryObject<Block> POLISHED_MULBERRY_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("polished_mulberry_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.UPGRADE_AQUATIC);
    
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICKS = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_SLAB = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_brick_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_brick_stairs", () -> new AbnormalsStairsBlock(MULBERRY_BREAD_BRICKS.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_WALL = HELPER.createCompatBlock(Mods.UPGRADE_AQUATIC, "mulberry_bread_brick_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("mulberry_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.UPGRADE_AQUATIC, Mods.QUARK);

    public static final RegistryObject<Block> MULBERRY_BREAD_PAVEMENT = HELPER.createCompatBlock("mulberry_bread_pavement", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.UPGRADE_AQUATIC);
    public static final RegistryObject<Block> MULBERRY_BREAD_PILLAR = HELPER.createCompatBlock("mulberry_bread_pillar", () -> new RotatedPillarBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.UPGRADE_AQUATIC);
    public static final RegistryObject<Block> CHISELED_MULBERRY_BREAD_BRICKS = HELPER.createCompatBlock("chiseled_mulberry_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.UPGRADE_AQUATIC);
    
    public static final RegistryObject<Block> BANANA_BREAD_BLOCK = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_SLAB = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_STAIRS = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_stairs", () -> new AbnormalsStairsBlock(BANANA_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_WALL = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BANANA_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("banana_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.NEAPOLITAN);
    
    public static final RegistryObject<Block> POLISHED_BANANA_BREAD_BLOCK = HELPER.createCompatBlock(Mods.NEAPOLITAN, "polished_banana_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BANANA_BREAD_SLAB = HELPER.createCompatBlock(Mods.NEAPOLITAN, "polished_banana_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BANANA_BREAD_STAIRS = HELPER.createCompatBlock(Mods.NEAPOLITAN, "polished_banana_bread_stairs", () -> new AbnormalsStairsBlock(POLISHED_BANANA_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BANANA_BREAD_WALL = HELPER.createCompatBlock("polished_banana_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS, Mods.LEPTON, Mods.NEAPOLITAN);
    public static final RegistryObject<Block> POLISHED_BANANA_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("polished_banana_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.NEAPOLITAN);
    
    public static final RegistryObject<Block> BANANA_BREAD_BRICKS = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_SLAB = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_brick_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_brick_stairs", () -> new AbnormalsStairsBlock(BANANA_BREAD_BRICKS.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_WALL = HELPER.createCompatBlock(Mods.NEAPOLITAN, "banana_bread_brick_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("banana_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.NEAPOLITAN, Mods.QUARK);
    
    public static final RegistryObject<Block> BANANA_BREAD_PAVEMENT = HELPER.createCompatBlock("banana_bread_pavement", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.NEAPOLITAN);
    public static final RegistryObject<Block> BANANA_BREAD_PILLAR = HELPER.createCompatBlock("banana_bread_pillar", () -> new RotatedPillarBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.NEAPOLITAN);
    public static final RegistryObject<Block> CHISELED_BANANA_BREAD_BRICKS = HELPER.createCompatBlock("chiseled_banana_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.NEAPOLITAN);
    
    public static final RegistryObject<Block> PUMPKIN_BREAD_BLOCK = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_SLAB = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_STAIRS = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_stairs", () -> new AbnormalsStairsBlock(PUMPKIN_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_WALL = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("pumpkin_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.AUTUMNITY);
    
    public static final RegistryObject<Block> POLISHED_PUMPKIN_BREAD_BLOCK = HELPER.createCompatBlock(Mods.AUTUMNITY, "polished_pumpkin_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_PUMPKIN_BREAD_SLAB = HELPER.createCompatBlock(Mods.AUTUMNITY, "polished_pumpkin_bread_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_PUMPKIN_BREAD_STAIRS = HELPER.createCompatBlock(Mods.AUTUMNITY, "polished_pumpkin_bread_stairs", () -> new AbnormalsStairsBlock(POLISHED_PUMPKIN_BREAD_BLOCK.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_PUMPKIN_BREAD_WALL = HELPER.createCompatBlock("polished_pumpkin_bread_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS, Mods.LEPTON, Mods.AUTUMNITY);
    public static final RegistryObject<Block> POLISHED_PUMPKIN_BREAD_VERTICAL_SLAB = HELPER.createCompatBlock("polished_pumpkin_bread_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.AUTUMNITY);
    
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICKS = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_SLAB = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_brick_slab", () -> new SlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_brick_stairs", () -> new AbnormalsStairsBlock(PUMPKIN_BREAD_BRICKS.get().getDefaultState(), Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_WALL = HELPER.createCompatBlock(Mods.AUTUMNITY, "pumpkin_bread_brick_wall", () -> new WallBlock(Properties.BREAD), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("pumpkin_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.AUTUMNITY, Mods.QUARK);
    
    public static final RegistryObject<Block> PUMPKIN_BREAD_PAVEMENT = HELPER.createCompatBlock("pumpkin_bread_pavement", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.AUTUMNITY);
    public static final RegistryObject<Block> PUMPKIN_BREAD_PILLAR = HELPER.createCompatBlock("pumpkin_bread_pillar", () -> new RotatedPillarBlock(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.AUTUMNITY);
    public static final RegistryObject<Block> CHISELED_PUMPKIN_BREAD_BRICKS = HELPER.createCompatBlock("chiseled_pumpkin_bread_bricks", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS, Mods.QUARK, Mods.AUTUMNITY);
    
    public static class Properties {
    	public static final Block.Properties BREAD = Block.Properties.create(Material.WOOL)
    			.hardnessAndResistance(1.0f, 1.0f)
    			.sound(SoundType.CLOTH)
    			.harvestTool(ToolType.HOE);
    }
    
    public static class Mods {
    	public static final String AUTUMNITY = "autumnity";
    	public static final String BUZZIER_BEES = "buzzier_bees";
    	public static final String LEPTON = "lepton";
    	public static final String NEAPOLITAN = "neapolitan";
    	public static final String QUARK = "quark";
    	public static final String UPGRADE_AQUATIC = "upgrade_aquatic";
    }
    
}
