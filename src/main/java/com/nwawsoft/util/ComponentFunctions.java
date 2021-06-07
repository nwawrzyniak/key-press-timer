package com.nwawsoft.util;

import java.awt.*;

public class ComponentFunctions {
  public static void center(final Component c) {
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - c.getSize().width) / 2;
    int y = (d.height - c.getSize().height) / 2;
    c.setLocation(x, y);
  }
}
