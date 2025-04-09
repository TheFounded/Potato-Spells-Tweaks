package net.potato_modding.potatospells.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import io.redspace.ironsspellbooks.api.util.Utils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Utils.class)
public class ISSMixin {

    @WrapMethod(method = "softCapFormula")
    private static double SoftCapFormulaMixin(double x, Operation<Double> original) {
         return x <= 1.75 ? x : 1 / (-16 * (x - 1.5)) + 2;
    }

}
