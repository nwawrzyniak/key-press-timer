package com.nwawsoft.kpt;

import com.nwawsoft.kpt.ui.TimerFrame;
import org.jnativehook.*;

import java.util.logging.*;

public class Starter {
  public static void main (String[] args) {
    try {
      LogManager.getLogManager().reset();
      Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
      logger.setLevel(Level.OFF);
      GlobalScreen.registerNativeHook();
    }
    catch (NativeHookException e) {
      e.printStackTrace();
    }
    new TimerFrame();
  }
}
