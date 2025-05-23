package net.potato_modding.potatospells.utils;

import net.minecraft.client.telemetry.events.WorldLoadEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.potato_modding.potatospells.config.ServerConfigs;
import org.apache.logging.log4j.core.jmx.Server;

import java.util.Objects;

public class PotatoUtils {

    /*
    Softcap Formulas
    */

    static String cduncap = ServerConfigs.COOLDOWN_UNCAP.get();
    public static double cooldownsoftcap(double x) {
        if(Objects.equals(cduncap, "2")) {
            return x <= 4.80999 ? 2*(Math.sin(0.28*(x+0.8))) : 2;
        }
        else if(Objects.equals(cduncap, "3")) {
            return x <= 8.01198 ? 2*(Math.sin(0.15*(x+2.46))) : 2;
        }
        else {
            //This is the default formula | using 'else' in case user inputs something invalid
            return x < 100 ? (x*0.01)+1 : 2;
        }
    }

    static String ctuncap = ServerConfigs.CAST_UNCAP.get();
    public static double castsoftcap(double x) {
        if(Objects.equals(ctuncap, "2")) {
            return x <= 4.80999 ? 2*(Math.sin(0.28*(x+0.8))) : 2;
        }
        else if(Objects.equals(ctuncap, "3")) {
            return x <= 8.01198 ? 2*(Math.sin(0.15*(x+2.46))) : 2;
        }
        else {
            //This is the default formula | using 'else' in case user inputs something invalid
            return x < 100 ? (x*0.01)+1 : 2;
        }
    }

    static String runcap = ServerConfigs.RESIST_UNCAP.get();
    public static double resistsoftcap(double x) {
        if(Objects.equals(runcap, "2")) {
            return x <= 4.80999 ? 2*(Math.sin(0.28*(x+0.8))) : 2;
        }
        else if(Objects.equals(runcap, "3")) {
            return x <= 8.01198 ? 2*(Math.sin(0.15*(x+2.46))) : 2;
        }
        else {
            //This is the default formula | using 'else' in case user inputs something invalid
            x < 0 ? 30/(30-x) : 2-(30/(30+x));
        }
    }

    /*
    Bosses
     */
}
