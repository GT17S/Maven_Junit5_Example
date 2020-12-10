package fr.uvsq.tod.kata;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @ParameterizedTest
    @CsvSource({"I,1", "V,5", "X,10", "L,50", "C,100", "D,500", "M,1000"})
    void conversion(String RomanNumber, int intValue) {
        assertEquals(intValue, RomanNumeralsConverter.toDecimal(RomanNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = { "","this is london" })
    void testEmptyValueOrAnOrderedValuePuttenIN(String Value) {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralsConverter.toDecimal(Value);
        });
    }
}
