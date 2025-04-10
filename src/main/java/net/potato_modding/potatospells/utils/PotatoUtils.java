package net.potato_modding.potatospells.utils;

import net.potato_modding.potatospells.config.ServerConfigs;

public class PotatoUtils {

    static float cdmin = ServerConfigs.COOLDOWN_MIN.get().floatValue();
    static float cdtop = ServerConfigs.COOLDOWN_TOP.get().floatValue();
    static float cddiv = ServerConfigs.COOLDOWN_DIV.get().floatValue();
    static float cdadd = ServerConfigs.COOLDOWN_ADD.get().floatValue();
    public static double cooldownsoftcap(double x) {
        return x <= cdmin ? x : cdtop/(cddiv*x)+cdadd;
    }

    static float castm = ServerConfigs.CAST_MIN.get().floatValue();
    static float castt = ServerConfigs.CAST_TOP.get().floatValue();
    static float castd = ServerConfigs.CAST_DIV.get().floatValue();
    static float casta = ServerConfigs.CAST_ADD.get().floatValue();
    public static double castsoftcap(double x) {
        return x <= castm ? x : castt/(castd*x)+casta;
    }

    static float resmi = ServerConfigs.RESIST_MIN.get().floatValue();
    static float resma = ServerConfigs.RESIST_MAX.get().floatValue();
    static float resc = ServerConfigs.RESIST_CAP.get().floatValue();
    static float resp = ServerConfigs.RESIST_POW.get().floatValue();
    public static double resistsoftcap(double x) {
        return x <= resmi ? x : resma-(resc*resp/x);
    }
}