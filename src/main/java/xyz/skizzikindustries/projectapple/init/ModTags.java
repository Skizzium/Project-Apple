package xyz.skizzikindustries.projectapple.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import xyz.skizzikindustries.projectapple.ProjectApple;

public final class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> LOGS = minecraft("logs");
        public static final ITag.INamedTag<Block> LOGS_THAT_BURN = minecraft("logs_that_burn");
        public static final ITag.INamedTag<Block> CANDY_LOGS = mod("candy_logs");

        private static ITag.INamedTag<Block> minecraft(String path) {
            return BlockTags.bind(new ResourceLocation("minecraft", path).toString());
        }

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(ProjectApple.MOD_ID, path).toString());
        }
    }
    public static final class Items {
        public static final ITag.INamedTag<Item> LOGS = minecraft("logs");
        public static final ITag.INamedTag<Item> LOGS_THAT_BURN = minecraft("logs_that_burn");
        public static final ITag.INamedTag<Item> CANDY_LOGS = mod("candy_logs");

        public static final ITag.INamedTag<Item> ALL_GEMS = mod("all_gems");
        public static final ITag.INamedTag<Item> BASE_GEMS = mod("base_gems");

        private static ITag.INamedTag<Item> minecraft(String path) {
            return ItemTags.bind(new ResourceLocation("minecraft", path).toString());
        }

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(ProjectApple.MOD_ID, path).toString());
        }
    }
}
