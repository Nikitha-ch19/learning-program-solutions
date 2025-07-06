package com.example.springtestingexercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorParamTest {

    private final CalculatorService calc = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "1,2,3",
        "0,0,0",
        "-1,4,3"
    })
    void add_variousInputs(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }
}
