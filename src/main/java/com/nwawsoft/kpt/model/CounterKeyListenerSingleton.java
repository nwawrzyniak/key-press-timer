package com.nwawsoft.kpt.model;

import org.jnativehook.keyboard.*;

public class CounterKeyListenerSingleton implements NativeKeyListener {
  private static final CounterKeyListenerSingleton ckl = new CounterKeyListenerSingleton();

  private CounterKeyListenerSingleton() {}

  @Override
  public void nativeKeyTyped(final NativeKeyEvent nativeEvent) {}

  @Override
  public void nativeKeyPressed(final NativeKeyEvent nativeEvent) {}

  @Override
  public void nativeKeyReleased(final NativeKeyEvent nativeEvent) {}

  public static CounterKeyListenerSingleton getCounterKeyListener() {
    return ckl;
  }
}
