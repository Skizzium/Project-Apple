package xyz.skizzikindustries.projectapple.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import xyz.skizzikindustries.projectapple.ProjectApple;

@Mod.EventBusSubscriber(modid = ProjectApple.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(new ModBlockStatesProvider(generator, helper));
        generator.addProvider(new ModItemModelsProvider(generator, helper));

        generator.addProvider(new ModLootTablesProvider(generator));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);
        generator.addProvider(blockTags);
        generator.addProvider(new ModItemTagsProvider(generator, blockTags, helper));
    }
}
