package fr.uvsq.tod.kata;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsConverterTest {

    @Test
    public void shouldConvertTheDigitI() {
        assertEquals(1, RomanNumeralsConverter.toDecimal("I"),"1 is written in roman numers like this:I");
    }

    @Test
    public void shouldConvertTheDigitV() {
        assertEquals(5, RomanNumeralsConverter.toDecimal("V"),"5 is written in roman numers like this:V");
    }

    @Test
    public void shouldConvertTheDigitX() {
        assertEquals(10, RomanNumeralsConverter.toDecimal("X"),"10 is written in roman numers like this:X");
    }

    @Test
    public void shouldConvertTheDigitL() {
        assertEquals(50, RomanNumeralsConverter.toDecimal("L"),"50 is written in roman numers like this:L");
    }

    @Test
    public void shouldConvertTheDigitC() {
        assertEquals(100, RomanNumeralsConverter.toDecimal("C"),"100 is written in roman numers like this:C");
    }

    @Test
    public void shouldConvertTheDigitD() {
        assertEquals(500, RomanNumeralsConverter.toDecimal("D"),"500 is written in roman numers like this:D");
    }

    @Test
    public void shouldConvertTheDigitM() {
        assertEquals(1000, RomanNumeralsConverter.toDecimal("M"),"1000 is written in roman numers like this:M");
    }

    @Test
    void testIllegalArgumentExceptionOfEmptyBlankValuePuttenIN() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralsConverter.toDecimal("");
        });
    }

    @Test
    void testIllegalArgumentExceptionOfNullValuePuttenIN() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralsConverter.toDecimal(null);
        });
    }

    @Test
    void testIllegalArgumentExceptionOfAnOrderedStringValuePuttenIN() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralsConverter.toDecimal("THIS IS LONDON");
        });
    }
}
