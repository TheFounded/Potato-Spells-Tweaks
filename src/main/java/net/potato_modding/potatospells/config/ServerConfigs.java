package net.potato_modding.potatospells.config;

import net.neoforged.neoforge.common.ModConfigSpec;

@SuppressWarnings("unused")
public class ServerConfigs {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec BUILDING;
    public static ModConfigSpec.ConfigValue<String> COOLDOWN_UNCAP;
    public static ModConfigSpec.ConfigValue<String> CAST_UNCAP;
    public static ModConfigSpec.ConfigValue<String> RESIST_UNCAP;
    public static ModConfigSpec.ConfigValue<Double> KING_HEALTH;
    public static ModConfigSpec.ConfigValue<Double> KING_ARMOR;
    public static ModConfigSpec.ConfigValue<Double> KING_KNOCKBACK_RESIST;
    public static ModConfigSpec.ConfigValue<Double> KING_FOLLOW_RANGE;
    public static ModConfigSpec.ConfigValue<Double> KING_RANGE;
    public static ModConfigSpec.ConfigValue<Double> KING_ATTACK;
    public static ModConfigSpec.ConfigValue<Double> KING_SPELLPOWER;
    public static ModConfigSpec.ConfigValue<Double> KING_SPELLRESIST;
    public static ModConfigSpec.ConfigValue<Double> KING_KNOCKBACK;
    public static ModConfigSpec.ConfigValue<Double> KING_SPEED;
    public static ModConfigSpec.ConfigValue<Double> KING_FLYING_SPEED;

    static {
        {
            BUILDER.push("Potato Spells Utils");
            BUILDER.comment("");
            BUILDER.comment("RE-BALANCE FORMULAS:");
            BUILDER.comment("Accept '1', '2' or '3'");
            BUILDER.comment("");
            BUILDER.comment("1 = 'default': Reaches 100% at ~3.63 (full immunity / instant cast / 0 cooldown)");
            BUILDER.comment("2 = 'nerfed': Reaches 100% at ~4.99 (full immunity / instant cast / 0 cooldown)");
            BUILDER.comment("3 = 'apotheosis': Reaches 100% at ~8.02 (full immunity / instant cast / 0 cooldown)");
            BUILDER.comment("");
            COOLDOWN_UNCAP = BUILDER.worldRestart().define("Cooldown Formula", "1");
            CAST_UNCAP = BUILDER.worldRestart().define("Cast Time Formula", "1");
            RESIST_UNCAP = BUILDER.worldRestart().define("Spell Resist Formula", "1");
            BUILDER.pop();
        }

        /*
        {
            BUILDER.push("Potato Boss Config");
            BUILDER.comment("DEAD KING BOSS:");
            BUILDER.comment("");
            BUILDER.comment("Default Max Health: 500");
            BUILDER.comment("Range: above 1");
            KING_HEALTH = BUILDER.define("Max Health", Double.valueOf("100.00"));
            BUILDER.comment("Default Armor: 15");
            BUILDER.comment("Range: 0 or higher");
            KING_ARMOR = BUILDER.define("Armor", Double.valueOf("15.00"));
            BUILDER.comment("Default Spell Resistance: 1");
            BUILDER.comment("Range: From 0 to whatever was defined in the configs above");
            BUILDER.comment("Warning: You can use negative numbers, but things might break!");
            KING_SPELLRESIST = BUILDER.define("Spell Resistance", Double.valueOf("1.00"));
            BUILDER.comment("Default Knockback Resist: 0.8");
            BUILDER.comment("Range: 0 ~ 1");
            KING_KNOCKBACK_RESIST = BUILDER.define("Knockback Resist", Double.valueOf("0.8"));
            BUILDER.comment("Default Attack: 10");
            BUILDER.comment("Range: 0 or higher");
            KING_ATTACK = BUILDER.define("Attack Damage", Double.valueOf("10.00"));
            BUILDER.comment("Default Spell Power: 1.15");
            BUILDER.comment("Range: 0 or higher");
            BUILDER.comment("Warning: 2 means 2x more damage!");
            KING_SPELLPOWER = BUILDER.define("Spell Power", Double.valueOf("1.15"));
            BUILDER.comment("Default Knockback: 0.6");
            BUILDER.comment("Range: 0 or higher");
            BUILDER.comment("Warning: 2 means he will throw you back 2 blocks with attacks!");
            KING_KNOCKBACK = BUILDER.define("Attack Knockback", Double.valueOf("0.60"));
            BUILDER.comment("Default Range: 4");
            BUILDER.comment("Range: 0 or higher");
            KING_RANGE = BUILDER.define("Attack Range", Double.valueOf("4.00"));
            BUILDER.comment("Default Follow Range: 32");
            BUILDER.comment("Range: 0 or higher");
            KING_FOLLOW_RANGE = BUILDER.define("Follow Range", Double.valueOf("32.00"));
            BUILDER.comment("Default Speed: 0.155");
            BUILDER.comment("Range: 0 or higher");
            BUILDER.comment("Warning: the player's default movement speed is about 0.11!");
            KING_SPEED = BUILDER.define("Movement Speed", Double.valueOf("0.155"));
            BUILDER.comment("Default Flying Speed: 0.155");
            BUILDER.comment("Range: 0 or higher");
            KING_FLYING_SPEED = BUILDER.define("Flying Speed", Double.valueOf("0.155"));
            BUILDER.pop();
        }
        */
        BUILDING = BUILDER.build();
    }
}
