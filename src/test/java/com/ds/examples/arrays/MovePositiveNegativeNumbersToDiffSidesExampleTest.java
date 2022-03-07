package com.ds.examples.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MovePositiveNegativeNumbersToDiffSidesExampleTest {

    @ParameterizedTest(name = "[{index}] => Input Array is: {0}, Expected Array: {1}")
    @Tag("Arrays")
    @MethodSource("inputAndExpectedArraysDataProvider")
    void testMovingPositiveNegativeNumbersToSides(final int[] inputArr, int[] expectedArr) {
        
        int[] actualArr = new MovePositiveNegativeNumbersToDiffSidesExample().addPositiveNumbersToRightAndNegativeNumbersToLeftSide(inputArr);

        Assertions.assertArrayEquals(expectedArr, actualArr);
              
    }

    static Stream<Arguments> inputAndExpectedArraysDataProvider() {
        
        return Stream.of(
                Arguments.of(
                    new int[] {-12, 11, -13, -5, 6, -7, 5, -3, -6}, 
                    new int[] {-12, -13, -5, -7, -3, -6, 5, 6, 11}
                )
        );
    }
    
}
