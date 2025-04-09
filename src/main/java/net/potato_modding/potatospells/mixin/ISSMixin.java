package net.potato_modding.potatospells.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import io.redspace.ironsspellbooks.api.util.Utils;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Utils.class)
public class ISSMixin {

    @WrapMethod(method = "softCapFormula")
    private static double SoftCapFormula(double x, Operation<Double> original) {
        return x <= 1.0 ? x : 1.8-(8*0.1);
    }

}
