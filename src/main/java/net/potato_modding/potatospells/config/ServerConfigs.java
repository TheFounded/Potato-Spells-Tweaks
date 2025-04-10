package net.potato_modding.potatospells.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ServerConfigs {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec BUILDING;
    public static ModConfigSpec.ConfigValue<Double> COOLDOWN_FORMULA;
    public static ModConfigSpec.ConfigValue<Double> COOLDOWN_MINIMUM;
    public static final ModConfigSpec.ConfigValue<Double> COOLDOWN_MIN;
    public static final ModConfigSpec.ConfigValue<Double> COOLDOWN_TOP;
    public static final ModConfigSpec.ConfigValue<Double> COOLDOWN_DIV;
    public static final ModConfigSpec.ConfigValue<Double> COOLDOWN_ADD;
    public static final ModConfigSpec.ConfigValue<Double> CAST_MIN;
    public static final ModConfigSpec.ConfigValue<Double> CAST_TOP;
    public static final ModConfigSpec.ConfigValue<Double> CAST_DIV;
    public static final ModConfigSpec.ConfigValue<Double> CAST_ADD;
    public static final ModConfigSpec.ConfigValue<Double> RESIST_MIN;
    public static final ModConfigSpec.ConfigValue<Double> RESIST_MAX;
    public static final ModConfigSpec.ConfigValue<Double> RESIST_CAP;
    public static final ModConfigSpec.ConfigValue<Double> RESIST_POW;

    // Failed attempt at implementing whole formula in config
    /*public static double cooldownsoftcap(double x) {
        {
            COOLDOWN_FORMULA = BUILDER.gameRestart().define("CooldownFormula", 1 / (-1 * x) + 2);
            COOLDOWN_MINIMUM = BUILDER.gameRestart().define("CooldownMinimum", 1.0);
        }
        double CooldownFormula = ServerConfigs.COOLDOWN_FORMULA.get().floatValue();
        double CooldownMinimum = ServerConfigs.COOLDOWN_MINIMUM.get().floatValue();
        return x <= CooldownMinimum ? x : CooldownFormula;
    }*/

    static {
        {
            BUILDER.push("Potato Spells Utils");
            BUILDER.comment("Cooldown Reduction Softcap");
            BUILDER.comment("Formula: 'x <= Min ? x : (Top / (Div + Attribute)) + Add'");
            BUILDER.comment("Default: 'x <= 1 ? x : 1/(-1*x)+2'");
            BUILDER.comment("Calculator: https://www.desmos.com/calculator/mxvvtgww1e");
            BUILDER.comment("");
            BUILDER.comment("Below this number, Cooldown Reduction is equal to the player's attribute");
            COOLDOWN_MIN = BUILDER.worldRestart().define("CooldownMin", 1.0);
            BUILDER.comment("");
            BUILDER.comment("Higher number means faster growth");
            COOLDOWN_TOP = BUILDER.worldRestart().define("CooldownTop", 1.0);
            BUILDER.comment("");
            BUILDER.comment("A negative version of the previous one");
            BUILDER.comment("Closer to 0 means faster growth");
            COOLDOWN_DIV = BUILDER.worldRestart().define("CooldownDiv", -1.0);
            BUILDER.comment("");
            BUILDER.comment("'(CooldownTop / CooldownDiv) + CooldownAdd = CooldownMin'");
            BUILDER.comment("This ensures you don't have weird behaviors in your formula");
            COOLDOWN_ADD = BUILDER.worldRestart().define("CooldownAdd", 2.0);
            BUILDER.comment("");
            BUILDER.comment("");
            BUILDER.comment("");
            BUILDER.comment("");
            BUILDER.comment("Cast Time Reduction Softcap");
            BUILDER.comment("Formula: 'x <= Min ? x : (Top / (Div + Attribute)) + Add'");
            BUILDER.comment("Default: 'x <= 1 ? x : 1/(-1*x)+2'");
            BUILDER.comment("Calculator: https://www.desmos.com/calculator/mxvvtgww1e");
            BUILDER.comment("");
            BUILDER.comment("Below this number, Cast Reduction is equal to the player's attribute");
            CAST_MIN = BUILDER.worldRestart().define("CastMin", 1.0);
            BUILDER.comment("");
            BUILDER.comment("Higher number means faster growth");
            CAST_TOP = BUILDER.worldRestart().define("CastTop", 1.0);
            BUILDER.comment("");
            BUILDER.comment("A negative version of the previous one");
            BUILDER.comment("Closer to 0 means faster growth");
            CAST_DIV = BUILDER.worldRestart().define("CastDiv", -1.0);
            BUILDER.comment("");
            BUILDER.comment("'(CastTop / CastDiv) + CastAdd = CastMin'");
            BUILDER.comment("This ensures you don't have weird behaviors in your formula");
            CAST_ADD = BUILDER.worldRestart().define("CastAdd", 2.0);
            BUILDER.comment("");
            BUILDER.comment("");
            BUILDER.comment("");
            BUILDER.comment("");
            BUILDER.comment("Spell Resistance Softcap");
            BUILDER.comment("Formula: 'x <= Min ? x : Max - (Cap * (Pow / Attribute))'");
            BUILDER.comment("Default: 'x <= 1 ? x : 1.8-(8*0.1/x)'");
            BUILDER.comment("Calculator: https://www.desmos.com/calculator/kzu10pf5fv");
            BUILDER.comment("");
            BUILDER.comment("Below this number, resistance is equal to the player's attribute");
            RESIST_MIN = BUILDER.worldRestart().define("ResistMin", 1.0);
            BUILDER.comment("");
            BUILDER.comment("This will be your effective maximum resistance");
            RESIST_MAX = BUILDER.worldRestart().define("ResistMax", 1.8);
            BUILDER.comment("");
            BUILDER.comment("Works together with ResistPow");
            RESIST_CAP = BUILDER.worldRestart().define("ResistCap", 8.0);
            BUILDER.comment("");
            BUILDER.comment("How fast the resistance grows - Lower = Slower");
            BUILDER.comment("'ResistCap * ResistPow' should be equal to ResistMax - 1");
            BUILDER.comment("If this isn't true, stuff might break");
            RESIST_POW = BUILDER.worldRestart().define("ResistPow", 0.1);
        }
        BUILDER.pop();
        BUILDING = BUILDER.build();
    }
}
