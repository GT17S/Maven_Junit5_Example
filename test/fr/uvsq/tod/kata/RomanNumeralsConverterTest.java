package fr.uvsq.tod.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsConverterTest {
  @Test
  public void shouldConvertTheDigitI() {
    assertEquals(1, RomanNumeralsConverter.convert("I"));
  }
}
