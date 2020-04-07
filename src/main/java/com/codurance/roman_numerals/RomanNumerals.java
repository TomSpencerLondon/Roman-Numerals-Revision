package com.codurance.roman_numerals;

public class RomanNumerals {

  public String convert(int arabic) {
    StringBuilder roman = new StringBuilder();

    while(arabic > 0){
      for (RomanNumeral numeral : RomanNumeral.values()){
        if (arabic >= numeral.arabic){
          roman.append(numeral.roman);
          arabic -= numeral.arabic;
        }
      }
    }

    return roman.toString();
  }

  private enum RomanNumeral {
    TEN("X", 10),
    NINE("IX", 9),
    FIVE("V", 5),
    FOUR("IV", 4),
    ONE("I", 1);

    private final String roman;
    private final int arabic;

    RomanNumeral(String roman, int arabic) {
      this.roman = roman;
      this.arabic = arabic;
    }
  }
}
