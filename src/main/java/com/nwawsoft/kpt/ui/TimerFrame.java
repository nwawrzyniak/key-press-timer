package com.nwawsoft.kpt.ui;

import com.nwawsoft.kpt.controller.TimerFrameController;

import javax.swing.*;
import java.awt.*;

public class TimerFrame extends JFrame {
  private final TimerFrameController tfc;
  private JLabel currentKeyLabel;
  private JLabel durationLabel;

  public TimerFrame() {
    super("Key Press Timer");
    tfc = new TimerFrameController(this);
    init();
  }

  public void init() {
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    int frameWidth = 340;
    int frameHeight = 120;
    setSize(frameWidth, frameHeight);
    tfc.center();
    Container cp = getContentPane();
    cp.setLayout(null);

    currentKeyLabel = new JLabel(tfc.getCurrentKeyString());
    currentKeyLabel.setBounds(10, 10, 300, 20);
    currentKeyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
    currentKeyLabel.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(currentKeyLabel);
    durationLabel = new JLabel(tfc.getDurationString());
    durationLabel.setBounds(10, 40, 300, 20);
    durationLabel.setHorizontalTextPosition(SwingConstants.CENTER);
    durationLabel.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(durationLabel);

    setResizable(false);
    setVisible(true);
  }

  public JLabel getCurrentKeyLabel() {
    return currentKeyLabel;
  }

  public JLabel getDurationLabel() {
    return durationLabel;
  }
}
