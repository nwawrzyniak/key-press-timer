package com.nwawsoft.kpt.ui;

import com.nwawsoft.kpt.controller.TimerFrameController;

import javax.swing.*;
import java.awt.*;

public class TimerFrame extends JFrame {
  private final TimerFrameController tfc;

  public TimerFrame() {
    super("Key Press Timer");
    tfc = new TimerFrameController(this);
    init();
  }

  public void init() {
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    int frameWidth = 240;
    int frameHeight = 320;
    setSize(frameWidth, frameHeight);
    tfc.center();
    Container cp = getContentPane();
    cp.setLayout(null);
    setResizable(false);
    setVisible(true);
  }
}
