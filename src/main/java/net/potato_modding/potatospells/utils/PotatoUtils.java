package net.potato_modding.potatospells.utils;

import net.potato_modding.potatospells.config.ServerConfigs;
import org.apache.logging.log4j.core.jmx.Server;

public class PotatoUtils {

    static float cdmin = ServerConfigs.COOLDOWN_MIN.get().floatValue();
    static float cdtop = ServerConfigs.COOLDOWN_TOP.get().floatValue();
    static float cddiv = ServerConfigs.COOLDOWN_DIV.get().floatValue();
    static float cdadd = ServerConfigs.COOLDOWN_ADD.get().floatValue();
    static boolean cduncap = ServerConfigs.COOLDOWN_UNCAP.get().booleanValue();
    public static double cooldownsoftcap(double x) {
        if(!cduncap) {
            return x <= cdmin ? x : cdtop / (cddiv * x) + cdadd;
        }
        else {
            return x <= 1 ? x : Math.min(1.8 - (0.8 / (x * 0.976)) + x / 50, 1.8);
        }
    }

    static float castm = ServerConfigs.CAST_MIN.get().floatValue();
    static float castt = ServerConfigs.CAST_TOP.get().floatValue();
    static float castd = ServerConfigs.CAST_DIV.get().floatValue();
    static float casta = ServerConfigs.CAST_ADD.get().floatValue();
    static boolean ctuncap = ServerConfigs.CAST_UNCAP.get().booleanValue();
    public static double castsoftcap(double x) {
        if(!ctuncap) {
            return x <= castm ? x : castt / (castd * x) + casta;
        }
        else {
            return x <= 1 ? x : Math.min(1.8 - (0.8 / (x * 0.976)) + x / 50, 1.8);
        }
    }

    static float resmi = ServerConfigs.RESIST_MIN.get().floatValue();
    static float resma = ServerConfigs.RESIST_MAX.get().floatValue();
    static float resc = ServerConfigs.RESIST_CAP.get().floatValue();
    static float resp = ServerConfigs.RESIST_POW.get().floatValue();
    static boolean runcap = ServerConfigs.RESIST_UNCAP.get().booleanValue();
    public static double resistsoftcap(double x) {
        if(!runcap) {
            return x <= resmi ? x : resma - (resc * resp / x);
        }
        else {
            return x <= 1 ? x : Math.min(1.8 - (0.8 / (x * 0.976)) + x / 50, 1.8);
        }
    }
}