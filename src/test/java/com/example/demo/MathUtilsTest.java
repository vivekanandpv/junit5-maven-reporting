package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @ParameterizedTest
    @CsvSource({"2, 4", "0, 0", "-1, 1", "7, 49", "-9, 81"})
    void squaresAnInteger(int n, int square) {
        //  arrange
        MathUtils utils = new MathUtils();

        //  act
        int result = utils.square(n);

        //  assert
        assertEquals(square, result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, -0.45, -9.6})
    void throwsRuntimeExceptionForNegativeRadii(double r) {
        //  arrange
        MathUtils utils = new MathUtils();

        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> utils.areaOfCircle(r));
        assertEquals("negative radius", runtimeException.getMessage());
    }

    @Test
    void printMethodExecutesWithoutException() {
        MathUtils utils = new MathUtils();
        utils.printMessage("Hello");
    }
}