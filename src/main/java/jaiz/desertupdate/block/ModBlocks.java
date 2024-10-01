package jaiz.desertupdate.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import jaiz.desertupdate.DunesDrought;
import jaiz.desertupdate.world.ModConfiguredFeatures;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModBlocks {

    public static final Block FANCY_WHITE_WOOL = registerBlock("fancy_white_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLUE_WOOL = registerBlock("fancy_blue_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_CYAN_WOOL = registerBlock("fancy_cyan_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_BLUE_WOOL = registerBlock("fancy_light_blue_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BROWN_WOOL = registerBlock("fancy_brown_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PINK_WOOL = registerBlock("fancy_pink_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_MAGENTA_WOOL = registerBlock("fancy_magenta_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PURPLE_WOOL = registerBlock("fancy_purple_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLACK_WOOL = registerBlock("fancy_black_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_GRAY_WOOL = registerBlock("fancy_light_gray_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GRAY_WOOL = registerBlock("fancy_gray_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIME_WOOL = registerBlock("fancy_lime_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GREEN_WOOL = registerBlock("fancy_green_wool",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_ORANGE_WOOL = registerBlock("fancy_orange_wool",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_RED_WOOL = registerBlock("fancy_red_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_YELLOW_WOOL = registerBlock("fancy_yellow_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).sounds(BlockSoundGroup.WOOL)));

    //Carpets

    public static final Block FANCY_WHITE_CARPET = registerBlock("fancy_white_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLUE_CARPET = registerBlock("fancy_blue_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_CYAN_CARPET = registerBlock("fancy_cyan_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_BLUE_CARPET = registerBlock("fancy_light_blue_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BROWN_CARPET = registerBlock("fancy_brown_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PINK_CARPET = registerBlock("fancy_pink_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PINK_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_MAGENTA_CARPET = registerBlock("fancy_magenta_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PURPLE_CARPET = registerBlock("fancy_purple_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLACK_CARPET = registerBlock("fancy_black_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_GRAY_CARPET = registerBlock("fancy_light_gray_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GRAY_CARPET = registerBlock("fancy_gray_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIME_CARPET = registerBlock("fancy_lime_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIME_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GREEN_CARPET = registerBlock("fancy_green_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_ORANGE_CARPET = registerBlock("fancy_orange_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_RED_CARPET = registerBlock("fancy_red_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.RED_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_YELLOW_CARPET = registerBlock("fancy_yellow_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET).sounds(BlockSoundGroup.WOOL)));

    //sandstone

    public static final Block GILDED_SANDSTONE = registerBlock("gilded_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE).requiresTool()));
    public static final Block GILDED_CUT_SANDSTONE = registerBlock("gilded_cut_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE).requiresTool()));
    public static final Block GILDED_CHISELED_SANDSTONE = registerBlock("gilded_chiseled_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE).requiresTool()));


    public static final Block DESERT_OAK_LOG = registerBlock("desert_oak_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));

    public static final SaplingGenerator DESERT_OAK = new SaplingGenerator("desert_oak",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.DESERT_OAK_KEY),
            Optional.empty());
    public static final Block DESERT_OAK_SAPLING = registerBlock("desert_oak_sapling",
            new SaplingBlock(DESERT_OAK, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block DESERT_OAK_WOOD = registerBlock("desert_oak_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));

    public static final Block STRIPPED_DESERT_OAK_LOG = registerBlock("stripped_desert_oak_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));

    public static final Block STRIPPED_DESERT_OAK_WOOD = registerBlock("stripped_desert_oak_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final Block DESERT_OAK_PLANKS = registerBlock("desert_oak_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block DESERT_OAK_BUTTON = registerBlock("desert_oak_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block DESERT_OAK_PRESSURE_PLATE = registerBlock("desert_oak_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

    public static final Block DESERT_OAK_LEAVES = registerBlock("desert_oak_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));

    public static final Identifier DESERT_OAK_SIGN_TEXTURE = Identifier.of(DunesDrought.MOD_ID, "entity/signs/desert_oak");
    public static final Identifier DESERT_OAK_HANGING_SIGN_TEXTURE = Identifier.of(DunesDrought.MOD_ID, "entity/signs/hanging/desert_oak");
    public static final Identifier DESERT_OAK_HANGING_GUI_SIGN_TEXTURE = Identifier.of(DunesDrought.MOD_ID, "textures/gui/hanging_signs/desert_oak");

    public static final Block STANDING_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, Identifier.of(DunesDrought.MOD_ID, "desert_oak_standing_sign"),
    new TerraformSignBlock(DESERT_OAK_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));

    public static final Block WALL_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, Identifier.of(DunesDrought.MOD_ID, "desert_oak_wall_sign"),
            new TerraformWallSignBlock(DESERT_OAK_SIGN_TEXTURE, AbstractBlock.Settings.copy(ModBlocks.STANDING_DESERT_OAK_SIGN)));

    public static final Block HANGING_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, Identifier.of(DunesDrought.MOD_ID, "desert_oak_hanging_sign"),
            new TerraformHangingSignBlock(DESERT_OAK_HANGING_SIGN_TEXTURE, DESERT_OAK_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));

    public static final Block WALL_HANGING_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, Identifier.of(DunesDrought.MOD_ID, "desert_oak_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(DESERT_OAK_HANGING_SIGN_TEXTURE, DESERT_OAK_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(ModBlocks.HANGING_DESERT_OAK_SIGN)));

    // Fancy Bits for the desert oak
    public static final Block DESERT_OAK_STAIRS = registerBlock("desert_oak_stairs",
            new StairsBlock(ModBlocks.DESERT_OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block DESERT_OAK_SLAB = registerBlock("desert_oak_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

    public static final Block DESERT_OAK_FENCE = registerBlock("desert_oak_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block DESERT_OAK_FENCE_GATE = registerBlock("desert_oak_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block DESERT_OAK_DOOR = registerBlock("desert_oak_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block DESERT_OAK_TRAPDOOR = registerBlock("desert_oak_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()));


    public static final BlockFamily DESERT_OAK_FAMILY = BlockFamilies.register(ModBlocks.DESERT_OAK_PLANKS)
            .sign(ModBlocks.STANDING_DESERT_OAK_SIGN, ModBlocks.WALL_DESERT_OAK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily TERRACOTTA_BRICK_FAMILY = BlockFamilies.register(ModBlocks.TERRACOTTA_BRICKS)
            .group("terracotta").build();


    public static final Block FOSSIL_SOIL = registerBlock(
            "fossil_soil",
            new BrushableBlock(
                    Blocks.DIRT,
                    SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL,
                    SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL_COMPLETE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sounds(BlockSoundGroup.SUSPICIOUS_GRAVEL)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block HONEYCOMB_DIRT = registerBlock("honeycomb_dirt",
            new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).strength(2f)));

    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.TERRACOTTA).requiresTool()));

    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            new StairsBlock(ModBlocks.TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_BRICK_STAIRS).requiresTool()));

    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB).requiresTool()));

    public static final Block TERRACOTTA_BRICK_WALL= registerBlock("terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL).requiresTool()));

    public static final Block SPICE_BARREL = registerBlock("spice_barrel",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DunesDrought.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(DunesDrought.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        DunesDrought.LOGGER.info("Registering ModBlocks for " + DunesDrought.MOD_ID);
    }

}
