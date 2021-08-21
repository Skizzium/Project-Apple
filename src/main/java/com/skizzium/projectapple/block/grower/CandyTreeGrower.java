package com.skizzium.projectapple.block.grower;

import com.skizzium.projectapple.init.world.PA_ConfiguredFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

import javax.annotation.Nullable;
import java.util.Random;

public class CandyTreeGrower extends AbstractTreeGrower {
    public CandyTreeGrower() {}

    @Nullable
    protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random p_60038_, boolean p_60039_) {
        if (p_60038_.nextInt(10) == 0) {
            return p_60039_ ? PA_ConfiguredFeatures.FANCY_CANDY_BEES_005 : PA_ConfiguredFeatures.FANCY_CANDY;
        } else {
            return p_60039_ ? PA_ConfiguredFeatures.CANDY_BEES_005 : PA_ConfiguredFeatures.CANDY;
        }
    }
}