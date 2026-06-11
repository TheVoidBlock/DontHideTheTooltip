package io.github.thevoidblock.donthidethetooltip.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractContainerScreen.class)
public class HandledScreenMixin {
    @ModifyExpressionValue (
            method = "extractTooltip",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/ItemStack;isEmpty()Z"
            )
    )
    private boolean modifyIfCondition(boolean original) {
        return true;
    }
}
