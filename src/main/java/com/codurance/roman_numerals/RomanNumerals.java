package com.codurance.roman_numerals;

public class RomanNumerals {
  public String convert(int arabic) {
    StringBuilder roman = new StringBuilder();

    for (int i = 0; i < arabic; i++) {
      roman.append("I");
    }

    return roman.toString();
  }
}
