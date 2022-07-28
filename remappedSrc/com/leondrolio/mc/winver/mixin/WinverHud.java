package com.leondrolio.mc.winver.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class WinverHud {
  @Inject(method = "render", at=@At("RETURN"))
  public void onRender(MatrixStack matrices, float tickDelta, CallbackInfo info) {
    if (!MinecraftClient.getInstance().options.debugEnabled) {
      String text = String.format("Minecraft %s", MinecraftClient.getInstance().getGame().getVersion().getName());
      MinecraftClient.getInstance().textRenderer.drawWithShadow(matrices, text, 2, 2, -1);
    }
  }
}
