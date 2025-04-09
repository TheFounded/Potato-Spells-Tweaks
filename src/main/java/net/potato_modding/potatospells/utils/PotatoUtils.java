package net.potato_modding.potatospells.utils;

public class PotatoUtils {
    public static double cooldownsoftcap(double x) {
        return x <= 1 ? x : 1/(-1*x)+2;
    }
    public static double resistsoftcap(double x) {
        return x <= 1.0 ? x : 1.8-(8*0.1/x);
    }
    public static double castsoftcap(double x) {
        return x <= 1 ? x : 1/(-1*x)+2;
    }
}