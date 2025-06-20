package net.meh.forged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_PILLAR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_PILLAR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_SPRUCE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_BIRCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_JUNGLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_ACACIA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_DARK_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_MANGROVE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_CRIMSON_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_WARPED_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_BAMBOO_PLANKS);
        blockStateModelGenerator.registerLog(ModBlocks.MAPLE_LOG).log(ModBlocks.MAPLE_LOG).wood(ModBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAPLE_LOG).log(ModBlocks.STRIPPED_MAPLE_LOG).wood(ModBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_MAPLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_MAPLE_LEAVES);
        BlockStateModelGenerator.BlockTexturePool maplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAPLE_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.MAPLE_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_MAPLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAPLE_BEAM);
        blockStateModelGenerator.registerSingleton(ModBlocks.OAK_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.SPRUCE_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BIRCH_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.JUNGLE_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.ACACIA_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.DARK_OAK_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.MANGROVE_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHERRY_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CRIMSON_SHROOM_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.WARPED_SHROOM_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.MAPLE_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLEAK_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.FIR_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.PALM_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BAYOU_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.WISTERIA_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BAOBAB_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BAMBOO_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.FUNGAL_PAPER_LANTERN, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSingleton(ModBlocks.OAK_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.SPRUCE_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BIRCH_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.JUNGLE_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.ACACIA_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.DARK_OAK_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.MANGROVE_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHERRY_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CRIMSON_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.WARPED_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_DRIPSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_MUD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDY_LIMESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PACKED_DIRT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PACKED_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PACKED_RED_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIED_SILT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILT_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_SILT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLUE_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TAINTED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_SOUL_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BASALT_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BASALT_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_POLISHED_BASALT);

        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_ANDESITE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_DIORITE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_GRANITE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_DRIPSTONE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_LIMESTONE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_STONE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_MUD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_SILT_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_BLUE_NETHER_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_RED_NETHER_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_SOUL_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_POLISHED_BASALT, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSingleton(ModBlocks.SLATE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLATE_BRICKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_SLATE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_SLATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_BRICK);
        blockStateModelGenerator.registerLog(ModBlocks.DIAMOND_PILLAR).log(ModBlocks.DIAMOND_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMERALD_BRICK);
        blockStateModelGenerator.registerLog(ModBlocks.EMERALD_PILLAR).log(ModBlocks.EMERALD_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLD_BRICK);
        blockStateModelGenerator.registerLog(ModBlocks.GOLD_PILLAR).log(ModBlocks.GOLD_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_BRICK);
        blockStateModelGenerator.registerLog(ModBlocks.IRON_PILLAR).log(ModBlocks.IRON_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_BRICK);
        blockStateModelGenerator.registerLog(ModBlocks.NETHERITE_PILLAR).log(ModBlocks.NETHERITE_PILLAR);

        maplePool.stairs(ModBlocks.MAPLE_STAIRS);
        maplePool.slab(ModBlocks.MAPLE_SLAB);
        maplePool.button(ModBlocks.MAPLE_BUTTON);
        maplePool.pressurePlate(ModBlocks.MAPLE_PRESSURE_PLATE);
        maplePool.fence(ModBlocks.MAPLE_FENCE);
        maplePool.fenceGate(ModBlocks.MAPLE_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.BLEAK_LOG).log(ModBlocks.BLEAK_LOG).wood(ModBlocks.BLEAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLEAK_LOG).log(ModBlocks.STRIPPED_BLEAK_LOG).wood(ModBlocks.STRIPPED_BLEAK_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLEAK_LEAVES);
        BlockStateModelGenerator.BlockTexturePool bleakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLEAK_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLEAK_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_BLEAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLEAK_BEAM);


        bleakPool.stairs(ModBlocks.BLEAK_STAIRS);
        bleakPool.slab(ModBlocks.BLEAK_SLAB);
        bleakPool.button(ModBlocks.BLEAK_BUTTON);
        bleakPool.pressurePlate(ModBlocks.BLEAK_PRESSURE_PLATE);
        bleakPool.fence(ModBlocks.BLEAK_FENCE);
        bleakPool.fenceGate(ModBlocks.BLEAK_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.FIR_LOG).log(ModBlocks.FIR_LOG).wood(ModBlocks.FIR_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_FIR_LOG).log(ModBlocks.STRIPPED_FIR_LOG).wood(ModBlocks.STRIPPED_FIR_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_FIR_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_FIR_LEAVES);
        BlockStateModelGenerator.BlockTexturePool firPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIR_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.FIR_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_FIR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIR_BEAM);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRCH_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNGLE_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGROVE_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHERRY_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_BEAM);

        firPool.stairs(ModBlocks.FIR_STAIRS);
        firPool.slab(ModBlocks.FIR_SLAB);
        firPool.button(ModBlocks.FIR_BUTTON);
        firPool.pressurePlate(ModBlocks.FIR_PRESSURE_PLATE);
        firPool.fence(ModBlocks.FIR_FENCE);
        firPool.fenceGate(ModBlocks.FIR_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_LEAVES);
        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.PALM_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_PALM_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_BEAM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_CROWN);

        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);
        palmPool.button(ModBlocks.PALM_BUTTON);
        palmPool.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        palmPool.fence(ModBlocks.PALM_FENCE);
        palmPool.fenceGate(ModBlocks.PALM_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.BAYOU_LOG).log(ModBlocks.BAYOU_LOG).wood(ModBlocks.BAYOU_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BAYOU_LOG).log(ModBlocks.STRIPPED_BAYOU_LOG).wood(ModBlocks.STRIPPED_BAYOU_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAYOU_LEAVES);
        BlockStateModelGenerator.BlockTexturePool bayouPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAYOU_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.BAYOU_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_BAYOU_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAYOU_BEAM);

        bayouPool.stairs(ModBlocks.BAYOU_STAIRS);
        bayouPool.slab(ModBlocks.BAYOU_SLAB);
        bayouPool.button(ModBlocks.BAYOU_BUTTON);
        bayouPool.pressurePlate(ModBlocks.BAYOU_PRESSURE_PLATE);
        bayouPool.fence(ModBlocks.BAYOU_FENCE);
        bayouPool.fenceGate(ModBlocks.BAYOU_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.WISTERIA_LOG).log(ModBlocks.WISTERIA_LOG).wood(ModBlocks.WISTERIA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WISTERIA_LOG).log(ModBlocks.STRIPPED_WISTERIA_LOG).wood(ModBlocks.STRIPPED_WISTERIA_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_PINK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_PURPLE);
        BlockStateModelGenerator.BlockTexturePool wisteriaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WISTERIA_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.WISTERIA_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_WISTERIA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_BEAM);

        wisteriaPool.stairs(ModBlocks.WISTERIA_STAIRS);
        wisteriaPool.slab(ModBlocks.WISTERIA_SLAB);
        wisteriaPool.button(ModBlocks.WISTERIA_BUTTON);
        wisteriaPool.pressurePlate(ModBlocks.WISTERIA_PRESSURE_PLATE);
        wisteriaPool.fence(ModBlocks.WISTERIA_FENCE);
        wisteriaPool.fenceGate(ModBlocks.WISTERIA_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.BAOBAB_LOG).log(ModBlocks.BAOBAB_LOG).wood(ModBlocks.BAOBAB_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BAOBAB_LOG).log(ModBlocks.STRIPPED_BAOBAB_LOG).wood(ModBlocks.STRIPPED_BAOBAB_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAOBAB_LEAVES);
        BlockStateModelGenerator.BlockTexturePool baobabPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAOBAB_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.BAOBAB_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_BAOBAB_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAOBAB_BEAM);

        baobabPool.stairs(ModBlocks.BAOBAB_STAIRS);
        baobabPool.slab(ModBlocks.BAOBAB_SLAB);
        baobabPool.button(ModBlocks.BAOBAB_BUTTON);
        baobabPool.pressurePlate(ModBlocks.BAOBAB_PRESSURE_PLATE);
        baobabPool.fence(ModBlocks.BAOBAB_FENCE);
        baobabPool.fenceGate(ModBlocks.BAOBAB_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool fungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FUNGAL_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.FUNGAL_PLANKS_CARVED, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_FUNGAL_PLANKS);

        fungalPool.stairs(ModBlocks.FUNGAL_STAIRS);
        fungalPool.slab(ModBlocks.FUNGAL_SLAB);
        fungalPool.button(ModBlocks.FUNGAL_BUTTON);
        fungalPool.pressurePlate(ModBlocks.FUNGAL_PRESSURE_PLATE);
        fungalPool.fence(ModBlocks.FUNGAL_FENCE);
        fungalPool.fenceGate(ModBlocks.FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool whiteFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_FUNGAL_PLANKS);

        whiteFungalPool.stairs(ModBlocks.WHITE_FUNGAL_STAIRS);
        whiteFungalPool.slab(ModBlocks.WHITE_FUNGAL_SLAB);
        whiteFungalPool.button(ModBlocks.WHITE_FUNGAL_BUTTON);
        whiteFungalPool.pressurePlate(ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE);
        whiteFungalPool.fence(ModBlocks.WHITE_FUNGAL_FENCE);
        whiteFungalPool.fenceGate(ModBlocks.WHITE_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool lightGrayFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS);

        lightGrayFungalPool.stairs(ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS);
        lightGrayFungalPool.slab(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB);
        lightGrayFungalPool.button(ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON);
        lightGrayFungalPool.pressurePlate(ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE);
        lightGrayFungalPool.fence(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE);
        lightGrayFungalPool.fenceGate(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool grayFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_FUNGAL_PLANKS);

        grayFungalPool.stairs(ModBlocks.GRAY_FUNGAL_STAIRS);
        grayFungalPool.slab(ModBlocks.GRAY_FUNGAL_SLAB);
        grayFungalPool.button(ModBlocks.GRAY_FUNGAL_BUTTON);
        grayFungalPool.pressurePlate(ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE);
        grayFungalPool.fence(ModBlocks.GRAY_FUNGAL_FENCE);
        grayFungalPool.fenceGate(ModBlocks.GRAY_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool blackFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_FUNGAL_PLANKS);

        blackFungalPool.stairs(ModBlocks.BLACK_FUNGAL_STAIRS);
        blackFungalPool.slab(ModBlocks.BLACK_FUNGAL_SLAB);
        blackFungalPool.button(ModBlocks.BLACK_FUNGAL_BUTTON);
        blackFungalPool.pressurePlate(ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE);
        blackFungalPool.fence(ModBlocks.BLACK_FUNGAL_FENCE);
        blackFungalPool.fenceGate(ModBlocks.BLACK_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool brownFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_FUNGAL_PLANKS);

        brownFungalPool.stairs(ModBlocks.BROWN_FUNGAL_STAIRS);
        brownFungalPool.slab(ModBlocks.BROWN_FUNGAL_SLAB);
        brownFungalPool.button(ModBlocks.BROWN_FUNGAL_BUTTON);
        brownFungalPool.pressurePlate(ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE);
        brownFungalPool.fence(ModBlocks.BROWN_FUNGAL_FENCE);
        brownFungalPool.fenceGate(ModBlocks.BROWN_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool redFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_FUNGAL_PLANKS);

        redFungalPool.stairs(ModBlocks.RED_FUNGAL_STAIRS);
        redFungalPool.slab(ModBlocks.RED_FUNGAL_SLAB);
        redFungalPool.button(ModBlocks.RED_FUNGAL_BUTTON);
        redFungalPool.pressurePlate(ModBlocks.RED_FUNGAL_PRESSURE_PLATE);
        redFungalPool.fence(ModBlocks.RED_FUNGAL_FENCE);
        redFungalPool.fenceGate(ModBlocks.RED_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool orangeFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_FUNGAL_PLANKS);

        orangeFungalPool.stairs(ModBlocks.ORANGE_FUNGAL_STAIRS);
        orangeFungalPool.slab(ModBlocks.ORANGE_FUNGAL_SLAB);
        orangeFungalPool.button(ModBlocks.ORANGE_FUNGAL_BUTTON);
        orangeFungalPool.pressurePlate(ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE);
        orangeFungalPool.fence(ModBlocks.ORANGE_FUNGAL_FENCE);
        orangeFungalPool.fenceGate(ModBlocks.ORANGE_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool yellowFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_FUNGAL_PLANKS);

        yellowFungalPool.stairs(ModBlocks.YELLOW_FUNGAL_STAIRS);
        yellowFungalPool.slab(ModBlocks.YELLOW_FUNGAL_SLAB);
        yellowFungalPool.button(ModBlocks.YELLOW_FUNGAL_BUTTON);
        yellowFungalPool.pressurePlate(ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE);
        yellowFungalPool.fence(ModBlocks.YELLOW_FUNGAL_FENCE);
        yellowFungalPool.fenceGate(ModBlocks.YELLOW_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool limeFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_FUNGAL_PLANKS);

        limeFungalPool.stairs(ModBlocks.LIME_FUNGAL_STAIRS);
        limeFungalPool.slab(ModBlocks.LIME_FUNGAL_SLAB);
        limeFungalPool.button(ModBlocks.LIME_FUNGAL_BUTTON);
        limeFungalPool.pressurePlate(ModBlocks.LIME_FUNGAL_PRESSURE_PLATE);
        limeFungalPool.fence(ModBlocks.LIME_FUNGAL_FENCE);
        limeFungalPool.fenceGate(ModBlocks.LIME_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool greenFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_FUNGAL_PLANKS);

        greenFungalPool.stairs(ModBlocks.GREEN_FUNGAL_STAIRS);
        greenFungalPool.slab(ModBlocks.GREEN_FUNGAL_SLAB);
        greenFungalPool.button(ModBlocks.GREEN_FUNGAL_BUTTON);
        greenFungalPool.pressurePlate(ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE);
        greenFungalPool.fence(ModBlocks.GREEN_FUNGAL_FENCE);
        greenFungalPool.fenceGate(ModBlocks.GREEN_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool cyanFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_FUNGAL_PLANKS);

        cyanFungalPool.stairs(ModBlocks.CYAN_FUNGAL_STAIRS);
        cyanFungalPool.slab(ModBlocks.CYAN_FUNGAL_SLAB);
        cyanFungalPool.button(ModBlocks.CYAN_FUNGAL_BUTTON);
        cyanFungalPool.pressurePlate(ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE);
        cyanFungalPool.fence(ModBlocks.CYAN_FUNGAL_FENCE);
        cyanFungalPool.fenceGate(ModBlocks.CYAN_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool lightBlueFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS);

        lightBlueFungalPool.stairs(ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS);
        lightBlueFungalPool.slab(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB);
        lightBlueFungalPool.button(ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON);
        lightBlueFungalPool.pressurePlate(ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE);
        lightBlueFungalPool.fence(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE);
        lightBlueFungalPool.fenceGate(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool blueFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_FUNGAL_PLANKS);

        blueFungalPool.stairs(ModBlocks.BLUE_FUNGAL_STAIRS);
        blueFungalPool.slab(ModBlocks.BLUE_FUNGAL_SLAB);
        blueFungalPool.button(ModBlocks.BLUE_FUNGAL_BUTTON);
        blueFungalPool.pressurePlate(ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE);
        blueFungalPool.fence(ModBlocks.BLUE_FUNGAL_FENCE);
        blueFungalPool.fenceGate(ModBlocks.BLUE_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool purpleFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_FUNGAL_PLANKS);

        purpleFungalPool.stairs(ModBlocks.PURPLE_FUNGAL_STAIRS);
        purpleFungalPool.slab(ModBlocks.PURPLE_FUNGAL_SLAB);
        purpleFungalPool.button(ModBlocks.PURPLE_FUNGAL_BUTTON);
        purpleFungalPool.pressurePlate(ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE);
        purpleFungalPool.fence(ModBlocks.PURPLE_FUNGAL_FENCE);
        purpleFungalPool.fenceGate(ModBlocks.PURPLE_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool magentaFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_FUNGAL_PLANKS);

        magentaFungalPool.stairs(ModBlocks.MAGENTA_FUNGAL_STAIRS);
        magentaFungalPool.slab(ModBlocks.MAGENTA_FUNGAL_SLAB);
        magentaFungalPool.button(ModBlocks.MAGENTA_FUNGAL_BUTTON);
        magentaFungalPool.pressurePlate(ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE);
        magentaFungalPool.fence(ModBlocks.MAGENTA_FUNGAL_FENCE);
        magentaFungalPool.fenceGate(ModBlocks.MAGENTA_FUNGAL_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool pinkFungalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_FUNGAL_PLANKS);

        pinkFungalPool.stairs(ModBlocks.PINK_FUNGAL_STAIRS);
        pinkFungalPool.slab(ModBlocks.PINK_FUNGAL_SLAB);
        pinkFungalPool.button(ModBlocks.PINK_FUNGAL_BUTTON);
        pinkFungalPool.pressurePlate(ModBlocks.PINK_FUNGAL_PRESSURE_PLATE);
        pinkFungalPool.fence(ModBlocks.PINK_FUNGAL_FENCE);
        pinkFungalPool.fenceGate(ModBlocks.PINK_FUNGAL_FENCE_GATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_LIGHT_15);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_LIGHT_30);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_DARK_15);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_DARK_30);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_DARK_45);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_DARK_60);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_DARK_75);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_DARK_90);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINED_STONE_DARK_105);





    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.PLATINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_BOOTS));
    }
}
