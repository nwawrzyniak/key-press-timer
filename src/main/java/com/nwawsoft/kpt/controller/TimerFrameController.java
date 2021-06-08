package com.nwawsoft.kpt.controller;

import com.nwawsoft.kpt.model.TimerKeyListener;
import com.nwawsoft.kpt.ui.*;
import com.nwawsoft.util.ComponentFunctions;
import org.jnativehook.GlobalScreen;

public class TimerFrameController {
  private TimerKeyListener tkl;
  private final TimerFrame tf;
  private String currentKeyString;
  private String durationString;

  public TimerFrameController(final TimerFrame tf) {
    this.tf = tf;
    init();
  }

  private void init() {
    currentKeyString = "No key pressed yet.";
    durationString = "";
    tkl = new TimerKeyListener();
    GlobalScreen.addNativeKeyListener(tkl);
    tkl.setController(this);
  }

  public void center() {
    ComponentFunctions.center(tf);
  }

  public void openAbout() {
    new AboutFrame();
  }

  public String getCurrentKeyString() {
    return currentKeyString;
  }

  public void setCurrentKeyString(final String key) {
    currentKeyString = key;
    tf.getCurrentKeyLabel().setText(currentKeyString);
  }

  public String getDurationString() {
    return durationString;
  }

  public void setDurationString(final String duration) {
    durationString = duration;
    tf.getDurationLabel().setText(durationString);
  }
}
