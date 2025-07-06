package com.example.springtestingexercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void add_returnsSum() {
        assertEquals(5, service.add(2, 3));
    }
}
