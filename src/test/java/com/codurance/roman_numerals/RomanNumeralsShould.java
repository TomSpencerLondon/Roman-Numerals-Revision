package com.codurance.roman_numerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
//
//Definition
// Given a positive integer number (eg. 42)
// determine its Roman numeral representation
// as a String (eg "XLII"). You cannot write numerals like IM for 999.
//
// Examples
// Arabic number	Roman numeral	Arabic number	Roman numeral
// 1	I	60	LX
// 2	II	70	LXXX
// 3	III	80	LXXX
// 4	IV	90	XC
// 5	V	100	C
// 6	VI	200	CC
// 7	VII	300	CCC
// 8	VIII	400	CD
// 9	IX	500	D
// 10	X	600	DC
// 20	XX	700	DCC
// 30	XXX	800	DCCC
// 40	XL	900	CM
// 50	L	1000	M
// Arabic number	Roman numeral	Thousands	Cents	Tenths	Units
// 846	DCCCXLVI	-	DCC	XL	VI
// 1999	MCMXCIX	M	CM	XC	IX
// 2008	MMVIII	MM	-	-	VIII
// Implementation


public class RomanNumeralsShould {

  private final RomanNumerals romanNumerals;

  public RomanNumeralsShould() {
    romanNumerals = new RomanNumerals();
  }

  @ParameterizedTest
  @CsvSource({
          "0,''",
          "1,I",
          "2,II",
          "3,III",
          "4,IV",
          "5,V",
          "6,VI",
          "7,VII",
          "8,VIII",
          "9, IX",
          "10, X"
  })
  void return_roman_for_arabic(int arabic, String roman) {
    assertEquals(roman, romanNumerals.convert(arabic));
  }
}
