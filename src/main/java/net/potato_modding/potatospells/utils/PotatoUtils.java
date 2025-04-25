package net.potato_modding.potatospells.utils;

import com.sun.jna.WString;
import net.potato_modding.potatospells.config.ServerConfigs;

public class PotatoUtils {

    static String cduncap = ServerConfigs.COOLDOWN_UNCAP.get();
    public static double cooldownsoftcap(double x) {
        if(cduncap == "nerfed") {
            return x <= 0 ? (2*x)+0.44426 : x <= 4.80999 ? 2*Math.sin(0.28*(x+0.8)) : 2;
        }
        else if(cduncap == "apotheosis") {
            return x <= 0 ? (3*x)+0.72137 : x <= 8.01198 ? 2*Math.sin(0.15*(x+2.46)) : 2;
        }
        else {
            //This is the default formula | using 'else' in case user inputs something invalid
            return x <= -4.22699 ? -2 : x <= 3.62699 ? 2*Math.sin(0.4*x) : 2;
        }
    }

    static String ctuncap = ServerConfigs.CAST_UNCAP.get();
    public static double castsoftcap(double x) {
        if(ctuncap == "nerfed") {
            return x <= 0 ? (2*x)+0.44426 : x <= 4.80999 ? 2*Math.sin(0.28*(x+0.8)) : 2;
        }
        else if(ctuncap == "apotheosis") {
            return x <= 0 ? (3*x)+0.72137 : x <= 8.01198 ? 2*Math.sin(0.15*(x+2.46)) : 2;
        }
        else {
            //This is the default formula | using 'else' in case user inputs something invalid
            return x <= -4.22699 ? -2 : x <= 3.62699 ? 2*Math.sin(0.4*x) : 2;
        }
    }

    static String runcap = ServerConfigs.RESIST_UNCAP.get();
    public static double resistsoftcap(double x) {
        if(runcap == "nerfed") {
            return x <= 0 ? (2*x)+0.44426 : x <= 4.80999 ? 2*Math.sin(0.28*(x+0.8)) : 2;
        }
        else if(runcap == "apotheosis") {
            return x <= 0 ? (3*x)+0.72137 : x <= 8.01198 ? 2*Math.sin(0.15*(x+2.46)) : 2;
        }
        else {
            //This is the default formula | using 'else' in case user inputs something invalid
            return x <= -4.22699 ? -2 : x <= 3.62699 ? 2*Math.sin(0.4*x) : 2;
        }
    }
}