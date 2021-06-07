package com.nwawsoft.kpt.controller;

import com.nwawsoft.kpt.ui.*;
import com.nwawsoft.util.ComponentFunctions;

public class TimerFrameController {
  private final TimerFrame tf;

  public TimerFrameController(final TimerFrame tf) {
    this.tf = tf;
  }

  public void center() {
    ComponentFunctions.center(tf);
  }

  public void openAbout() {
    new AboutFrame();
  }

  public void doClose() {
    System.exit(0);
  }
}
