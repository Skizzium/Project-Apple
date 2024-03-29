package com.skizzium.projectapple.world.biome;

import com.skizzium.projectapple.init.world.PA_Features;
import com.skizzium.projectapple.init.world.PA_SurfaceBuilders;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.world.level.biome.*;

public class CandyPlains implements PA_BiomeInterface {

    @Override
    public Biome.Precipitation getRainType() {
        return Biome.Precipitation.RAIN;
    }

    @Override
    public Biome.BiomeCategory getCategory() {
        return Biome.BiomeCategory.PLAINS;
    }

    @Override
    public float getDepth() {
        return 0.125F;
    }

    @Override
    public float getScale() {
        return 0.05F;
    }

    @Override
    public float getTemperature() {
        return 0.8F;
    }

    @Override
    public float getDownfall() {
        return 0.4F;
    }

    @Override
    public BiomeSpecialEffects getBiomeAmbience() {
//        BiomeSpecialEffects.Builder ambience = new BiomeSpecialEffects.Builder();
//        ambience.waterColor(-786388);
//        ambience.waterFogColor(-786388);
//        ambience.fogColor(12638463);
//        ambience.skyColor(12638463);
//        ambience.foliageColorOverride(-786388);
//        ambience.grassColorOverride(-786388);
//        ambience.ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS);
//        return ambience.build();
        return null;
    }

    @Override
    public MobSpawnSettings getMobSpawnSettings() {
        MobSpawnSettings.Builder mobSpawns = new MobSpawnSettings.Builder();
        //PA_Features.candyPlainsSpawns(mobSpawns);
        //mobSpawns.setPlayerCanSpawn();
        return mobSpawns.build();
    }

    @Override
    public BiomeGenerationSettings getBiomeGenerationSettings() {
//        BiomeGenerationSettings.Builder settings = (new BiomeGenerationSettings.Builder()).surfaceBuilder(PA_SurfaceBuilders.CANDY);
//        //settings.addStructureStart(StructureFeatures.VILLAGE_PLAINS).addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
//        settings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
//
//        PA_Features.addCandyPlainsLakes(settings);
//        PA_Features.addCandyPlainVegetation(settings); // CUSTOM FOLIAGE
//        PA_Features.addCandyPlainsExtraVegetation(settings);
//
//        BiomeDefaultFeatures.addDefaultOverworldLandStructures(settings);
//        BiomeDefaultFeatures.addDefaultCarvers(settings);
//        BiomeDefaultFeatures.addDefaultCrystalFormations(settings);
//        BiomeDefaultFeatures.addDefaultMonsterRoom(settings);
//        BiomeDefaultFeatures.addPlainGrass(settings); // CUSTOM FOLIAGE
//        BiomeDefaultFeatures.addDefaultUndergroundVariety(settings);
//        BiomeDefaultFeatures.addDefaultOres(settings);
//        BiomeDefaultFeatures.addDefaultSoftDisks(settings);
//        BiomeDefaultFeatures.addDefaultMushrooms(settings);
//        BiomeDefaultFeatures.addDefaultSprings(settings);
//        BiomeDefaultFeatures.addSurfaceFreezing(settings);
//
//        return settings.build();
        return null;
    }
}