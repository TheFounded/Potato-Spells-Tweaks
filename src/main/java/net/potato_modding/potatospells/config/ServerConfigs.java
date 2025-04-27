package net.potato_modding.potatospells.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ServerConfigs {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec BUILDING;
    public static ModConfigSpec.ConfigValue<String> COOLDOWN_UNCAP;
    public static ModConfigSpec.ConfigValue<String> CAST_UNCAP;
    public static ModConfigSpec.ConfigValue<String> RESIST_UNCAP;

    static {
        {
            BUILDER.push("Potato Spells Utils");
            BUILDER.comment("RE-BALANCE FORMULAS:");
            BUILDER.comment("Accept 'default', 'nerfed' or 'apotheosis'");
            BUILDER.comment("'default': Reaches 100% at ~3.63 (full immunity / instant cast / 0 cooldown)");
            BUILDER.comment("'nerfed': Reaches 100% at ~4.99 (full immunity / instant cast / 0 cooldown)");
            BUILDER.comment("'apotheosis': Reaches 100% at ~8.02 (full immunity / instant cast / 0 cooldown)");
            COOLDOWN_UNCAP = BUILDER.worldRestart().define("Cooldown Formula", "default");
            CAST_UNCAP = BUILDER.worldRestart().define("Cast Time Formula", "default");
            RESIST_UNCAP = BUILDER.worldRestart().define("Spell Resist Formula", "default");
        }
        BUILDER.pop();
        BUILDING = BUILDER.build();
    }
}
