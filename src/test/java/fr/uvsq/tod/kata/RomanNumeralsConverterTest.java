package fr.uvsq.tod.kata;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanNumeralsConverterTest {
  @Test
  public void shouldConvertTheDigitI() {
    assertEquals(1, RomanNumeralsConverter.toDecimal("I"),"1 is written in roman numers like this:I");
   }
}
