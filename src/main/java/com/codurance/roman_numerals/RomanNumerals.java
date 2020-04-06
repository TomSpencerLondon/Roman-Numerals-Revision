package com.codurance.roman_numerals;

public class RomanNumerals {
  public String convert(int arabic) {
    StringBuilder roman = new StringBuilder();

    while(arabic > 0){
      if (arabic >= 5){
        roman.append("V");
        arabic -= 5;
      }else{
        roman.append("I");
        arabic--;
      }
    }

    return roman.toString();
  }
}
