package com.codurance.roman_numerals;

public class RomanNumerals {
  public String convert(int arabic) {
    if (arabic == 0){
      return "";
    }

    if (arabic == 2){
      return "II";
    }

    return "I";
  }
}
