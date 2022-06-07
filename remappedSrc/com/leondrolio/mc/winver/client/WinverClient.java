package com.leondrolio.mc.winver.client;

import net.fabricmc.api.ClientModInitializer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class WinverClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    System.out.println("Client initialised!");
  }
}
