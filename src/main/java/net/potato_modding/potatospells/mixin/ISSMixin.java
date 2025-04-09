package net.potato_modding.potatospells.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.redspace.ironsspellbooks.api.util.Utils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Utils.class)
public class ISSMixin {

    @Inject(method = "softCapFormula", at = @At("RETURN"), cancellable = false)
    private static void SoftCapFormulaMixin(double x, CallbackInfoReturnable<Double> cir) {
         return x <= 1.75 ? x : 1 / (-16 * (x - 1.5)) + 2;
    }

}
