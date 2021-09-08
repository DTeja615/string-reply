package com.beta.customUtil;

public final class StringReverse {
    /**
     * Don't let anyone instantiate this class.
     */
    private StringReverse(){};

  public static String reverseString(String message) {
      StringBuffer newString = new StringBuffer(message);
      return String.valueOf(newString.reverse());
  }
}
