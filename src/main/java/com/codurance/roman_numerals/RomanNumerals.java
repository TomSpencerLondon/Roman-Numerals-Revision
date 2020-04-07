package com.codurance.roman_numerals;

public class RomanNumerals {

  private StringBuilder stringBuilder;

  public RomanNumerals() {
    this.stringBuilder = new StringBuilder();
  }

  public String convert(int arabic) {
    if (arabic <= 0){
      return stringBuilder.toString();
    }

    RomanNumeral highestValueFor = getHighestValueFor(arabic);
    stringBuilder.append(highestValueFor.roman);
    arabic -= highestValueFor.arabic;
    return convert(arabic);
  }

  private RomanNumeral getHighestValueFor(int arabic) {
    for (RomanNumeral numeral : RomanNumeral.values()){
      if (numeral.arabic <= arabic){
        return numeral;
      }
    }
    return null;
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
