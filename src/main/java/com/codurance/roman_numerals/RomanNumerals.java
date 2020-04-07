package com.codurance.roman_numerals;

public class RomanNumerals {
  public String convert(int arabic) {
    StringBuilder roman = new StringBuilder();

    while(arabic > 0){
      arabic = getRoman(arabic, roman);
    }

    return roman.toString();
  }

  private int getRoman(int arabic, StringBuilder roman) {
    if (arabic >= 5){
      roman.append("V");
      arabic -= 5;
    }else if(arabic >= 4){
      roman.append("IV");
      arabic -= 4;
    } else{
      roman.append("I");
      arabic--;
    }
    return arabic;
  }
}
