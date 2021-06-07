package com.nwawsoft.util;

/**
* Supplies Strings and functions to turn text into valid HTML.
*/
public class HTMLTagger {
  public static final String HTML_PRE = "<html>";
  public static final String LINK_PRE = HTML_PRE + "<a href=''>";
  public static final String HTML_POST = "</html>";
  public static final String LINK_POST = "</a>" + HTML_POST;

  public static String toHTML(final String text) {
    return HTML_PRE + text + HTML_POST;
  }

  public static String toLink(final String text) {
    return LINK_PRE + text + LINK_POST;
  }
}
