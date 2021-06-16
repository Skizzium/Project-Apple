package com.skizzium.projectapple.data.models;

import com.skizzium.projectapple.ProjectApple;
import com.skizzium.projectapple.init.block.ModBlocks;
import net.minecraft.data.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, ProjectApple.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.COMMAND_BLOCK.get());
        simpleBlock(ModBlocks.DEACTIVATED_COMMAND_BLOCK.get());
        simpleBlock(ModBlocks.BROKEN_COMMAND_BLOCK.get());

        //directionalBlock(ModBlocks.SKIZZIK_HEAD.get(), new ModelFile.ExistingModelFile(new ResourceLocation("minecraft:block/skull"), this.models().existingFileHelper));
        simpleBlock(ModBlocks.SKIZZIK_FLESH_BLOCK.get());

        simpleBlock(ModBlocks.CORRUPTED_BLOCK.get());

        simpleBlock(ModBlocks.WHITE_CHOCOLATE_BLOCK.get());
        simpleBlock(ModBlocks.CHOCOLATE_BLOCK.get());
        simpleBlock(ModBlocks.DARK_CHOCOLATE_BLOCK.get());
        simpleBlock(ModBlocks.WAFFLE_BLOCK.get());

        simpleBlock(ModBlocks.CANDIANITE_ORE.get());

        simpleBlock(ModBlocks.CANDY_PLANKS.get());
        slabBlock(ModBlocks.CANDY_SLAB.get(), new ResourceLocation("skizzik:block/candy_planks"), new ResourceLocation("skizzik:block/candy_planks"));
        stairsBlock(ModBlocks.CANDY_STAIRS.get(), new ResourceLocation("skizzik:block/candy_planks"));

        fenceBlock(ModBlocks.CANDY_FENCE.get(), new ResourceLocation("skizzik:block/candy_planks"));
        fenceGateBlock(ModBlocks.CANDY_FENCE_GATE.get(), new ResourceLocation("skizzik:block/candy_planks"));

        trapdoorBlock(ModBlocks.CANDY_TRAPDOOR.get(), new ResourceLocation("skizzik:block/candy_trapdoor"), false);
        doorBlock(ModBlocks.CANDY_DOOR.get(), new ResourceLocation("skizzik:block/candy_door_bottom"), new ResourceLocation("skizzik:block/candy_door_top"));

        logBlock(ModBlocks.CANDY_LOG.get());
        logBlock(ModBlocks.STRIPPED_CANDY_LOG.get());

        simpleBlock(ModBlocks.CANDY_LEAVES.get());
        simpleBlock(ModBlocks.CANDYRACK.get());

        simpleBlock(ModBlocks.RAINBOW_ORE.get());

        simpleBlock(ModBlocks.RAINBOW_GEM_BLOCK.get());
        simpleBlock(ModBlocks.BLACK_GEM_BLOCK.get());
        simpleBlock(ModBlocks.BLUE_GEM_BLOCK.get());
        simpleBlock(ModBlocks.BROWN_GEM_BLOCK.get());
        simpleBlock(ModBlocks.YELLOW_GEM_BLOCK.get());
        simpleBlock(ModBlocks.ORANGE_GEM_BLOCK.get());
        simpleBlock(ModBlocks.GREEN_GEM_BLOCK.get());
        simpleBlock(ModBlocks.PINK_GEM_BLOCK.get());
    }
}