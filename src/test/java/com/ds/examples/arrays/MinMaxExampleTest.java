package com.ds.examples.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MinMaxExampleTest {

    @ParameterizedTest(name = "[{index}] => Input Array is: {0}, Expected Min : {1} and Expected Max: {2}")
    @Tag("Arrays")
    @MethodSource("inputAndExpectedArraysProviderSuccessful")
    void testMinAndMaxOfArraySuccessful(int[] inputArr, int expectedMin, int expectedMax) {
        
        MinMaxExample.Pair actualPair = new MinMaxExample().getMinMax(inputArr);

        Assertions.assertEquals(actualPair.getMin(), expectedMin);
        Assertions.assertEquals(actualPair.getMax(), expectedMax);
        
    }

    static Stream<Arguments> inputAndExpectedArraysProviderSuccessful() {
        
        return Stream.of(
                Arguments.of(
                    new int[] {15, 6, 100, 17, 20}, 6, 100
                ),
                Arguments.of(
                    new int[] {3, 111, 42, 15, 8}, 3, 111
                ),
                Arguments.of(
                    new int[] {17, 93, 173, 76, 75, 89, 55, 135, 64, 70, 122}, 17, 173
                ),
                Arguments.of(
                    new int[] {48, 127, 116, 118, 64, 106, 121, 89, 80, 17, 99, 111, 146, 119, 107, 56, 114, 176, 4, 10}, 4, 176
                )
        );
    }

}
