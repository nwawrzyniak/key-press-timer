package com.nwawsoft.kpt.model;

import com.nwawsoft.kpt.controller.TimerFrameController;
import org.jnativehook.keyboard.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TimerKeyListener implements NativeKeyListener {
  private long now;
  private long resultInMillis;
  private boolean busy;
  private TimerFrameController tfc;
  private DecimalFormat df;

  public TimerKeyListener() {
    this(null);
  }

  public TimerKeyListener(final TimerFrameController tfc) {
    this.tfc = tfc;
    init();
  }

  private void init() {
    now = -1;
    resultInMillis = -1;
    busy = false;
    df = new DecimalFormat("#.###");
    df.setRoundingMode(RoundingMode.HALF_UP);
  }

  public void setController(final TimerFrameController tfc) {
    this.tfc = tfc;
  }

  @Override
  public void nativeKeyTyped(final NativeKeyEvent nativeEvent) {}

  @Override
  public void nativeKeyPressed(final NativeKeyEvent nativeEvent) {
    if (!busy) {
      busy = true;
      System.out.println("Started timing.\nKeyCode of currently pressed key: " + nativeEvent.getKeyCode());
      if (tfc != null) {
        tfc.setCurrentKeyString("Currently measuring for key with code " + nativeEvent.getKeyCode());
        tfc.setDurationString("TBD");
      }
      now = System.currentTimeMillis();
      System.out.println("Time stamp: " + now);
    }
  }

  @Override
  public void nativeKeyReleased(final NativeKeyEvent nativeEvent) {
    resultInMillis = (System.currentTimeMillis() - now);
    System.out.println("pressed for " + resultInMillis + "ms");
    if (tfc != null) {
      tfc.setCurrentKeyString("Measurement for key with code " + nativeEvent.getKeyCode() + ":");
      tfc.setDurationString(df.format((double) resultInMillis / (double) 1000) + " second(s)");
    }
    busy = false;
  }
}
