package com.herobrine.future.config;

import com.herobrine.future.init.Init;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Init.MODID, name = FutureConfig.CONFIG_NAME)
public class FutureConfig {
    private static final String MODID = "future-mc";
    static final String CONFIG_NAME = MODID + "/" + MODID;
    @Name("General")
    @Comment("Most config options for the mod are found here.")
    public static General general = new General();

    @Name("Flowers")
    @Comment("Config options related to the new flowers are found here.")
    public static Flowers modFlowers = new Flowers();

    public static class General {
        @Name("ItemTrident")
        @Comment("Whether the ItemTrident weapon is added to the game.")
        @RequiresMcRestart
        public boolean trident = true;

        @Name("Lantern")
        @Comment("Whether the Lantern block is added to the game.")
        @RequiresMcRestart
        public boolean lantern = true;

        @Name("Stonecutter")
        @Comment({"Whether the Stonecutter block is added to the game.",
                "This block is decorative only."})
        @RequiresMcRestart
        public boolean stonecutter = true;

        @Name("Old Stonecutter Model")
        @Comment("Whether the Stonecutter block uses the old model from Minecraft PE.")
        @RequiresMcRestart
        public boolean stonecutterOld = false;

        @Name("Loom")
        @Comment({"Whether the Loom block is added to the game.",
                "This block is decorative only."})
        @RequiresMcRestart
        public boolean loom = true;

        @Name("Barrel")
        @Comment("Whether the Barrel storage block is added to the game.")
        @RequiresMcRestart
        public boolean barrel = true;

        @Name("Berry Bush")
        @Comment({"Whether the Berry Bush is added to the game.",
                "If disabled, sweetberries are also disabled."})
        @RequiresMcRestart
        public boolean berryBush = true;

        @Name("Berry Bush generates")
        @Comment("Whether the Berry Bush naturally generates in the world.")
        @RequiresMcRestart
        public boolean berryBushGen = true;

        @Name("Campfire")
        @Comment("Whether the Campfire block is added to the game.")
        @RequiresMcRestart
        public boolean campfire = true;

        @Name("Campfire damage")
        @Comment("Whether the Campfire hurts you when you walk on it.")
        public boolean campfireDMG = true;

        @Name("New Wall Variants")
        @Comment("Whether the 1.14 Wall Variants are added.")
        @RequiresMcRestart
        public boolean newWallVariants = true;

        //@Name("New Slab Variants")
        //@Comment("Whether the 1.14 Slab Variants are added.")
        //@RequiresMcRestart
        //public boolean newSlabVariants = false;

        @Name("Stripped Logs")
        @Comment({"Whether stripped logs are added to the game, ",
                "and whether using an axe on general log will strip the log"})
        @RequiresMcRestart
        public boolean strippedLogs = true;

        @Name("Smooth Stone")
        @Comment("Whether the smooth stone block is added to the game.")
        @RequiresMcRestart
        public boolean smoothStone = true;

        @Name("Smooth Quartz")
        @Comment("Whether the smooth quartz block is added to the game.")
        @RequiresMcRestart
        public boolean smoothQuartz = true;

        @Name("Smoker")
        @Comment("Whether the Smoker block is added to the game.")
        @RequiresMcRestart
        public boolean smoker = true;

        @Name("Blast Furnace")
        @Comment("Whether the Blast Furnace block is added to the game.")
        @RequiresMcRestart
        public boolean blastFurnace = true;

        @Name("Fletching Table")
        @Comment({"Whether the Fletching Table block is added to the game.",
                    "This block is decorative only."})
        @RequiresMcRestart
        public boolean fletchingTable = true;

        @Name("Smithing Table")
        @Comment({"Whether the Smithing Table block is added to the game.",
                "This block is decorative only."})
        @RequiresMcRestart
        public boolean smithingTable = true;

        @Name("Smoker and Blast Furnace use more fuel")
        @Comment("Whether the Smoker and Blast Furnace consume fuel as fast as they smelt items. " +
                "False means a piece of coal will smelt sixteen items, and True means a piece of" +
                " coal only smelts eight items.")
        @RequiresMcRestart
        public boolean furnaceDoubleFuel = false;

        @Name("Grindstone")
        @Comment("Whether the Grindstone block is added to the game.")
        @RequiresMcRestart
        public boolean grindstone = true;

        //@Name("Crossbow")
        //@Comment("Whether the Crossbow item is added to the game.")
        //@RequiresMcRestart
        //public boolean crossbow = true;

        @Name("Bamboo")
        @Comment("Whether the Bamboo plant is added to the game.")
        @RequiresMcRestart
        public boolean bamboo = true;
    }

    public static class Flowers {
        @Name("Lily of the Valley")
        @Comment("Whether the Lily of the Valley flower is added to the game.")
        @RequiresMcRestart
        public boolean lily = true;

        @Name("Lily of the Valley generates")
        @Comment("Whether the Lily of the Valley flower naturally generates in the world.")
        @RequiresMcRestart
        public boolean lilyGen = true;

        @Name("Cornflower")
        @Comment("Whether the Cornflower flower is added to the game.")
        @RequiresMcRestart
        public boolean cornflower = true;

        @Name("Cornflower generates")
        @Comment("Whether the Cornflower flower naturally generates in the world.")
        @RequiresMcRestart
        public boolean cornflowerGen = true;

        @Name("Wither Rose")
        @Comment("Whether the Wither Rose flower is added to the game.")
        @RequiresMcRestart
        public boolean witherRose = true;

        @Name("Wither Rose Damage")
        @Comment("Whether the Wither Rose flower will deal damage when walked on.")
        public boolean witherRoseDMG = true;

        @Name("New Dyes")
        @Comment("Whether the new dyes from 1.14 are added to the game.")
        @RequiresMcRestart
        public boolean dyes = true;

        @Name("Suspicious Stew")
        @Comment("Whether the Suspicious Stew item is added to the game.")
        @RequiresMcRestart
        public boolean suspiciousStew = true;

        @Name("Suspicious Stew effects")
        @Comment("Whether the Suspicious Stew item gives an effect when consumed.")
        public boolean suspiciousStewEffect = true;

        @Name("Suspicious Stew Random Effect")
        @Comment("Whether the Suspicious Stew grants a random effect rather than an effect based on what flower it was crafted with")
        public boolean isSuspiciousStewRandom = true;
    }

    @Mod.EventBusSubscriber(modid = Init.MODID)
    protected static class ChangeHandler {
        @SubscribeEvent
        public static void onConfigChangedEvent(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if(event.getModID().equals(Init.MODID)) {
                ConfigManager.sync(Init.MODID, Type.INSTANCE);
            }
        }
    }
}
