package com.ds.examples.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class KthMinMaxExampleTest {

    @ParameterizedTest(name = "[{index}] => Input Array is: {0}, K : {1} and Expected Min: {2} and Expected Max: {3}")
    @Tag("Arrays")
    @MethodSource("inputArrayAndExpectedKthMinMaxProvider")
    void testKthMinAndMaxOfArraySuccessful(final int[] inputArr, int k, int expectedMin, int expectedMax) {
        
       int actualMax = new KthMinMaxExample().getKthMaximumValue(inputArr.clone(), k);
       int actualMin = new KthMinMaxExample().getKthMinimumValue(inputArr.clone(), k);

       Assertions.assertEquals(expectedMax, actualMax);
       Assertions.assertEquals(expectedMin, actualMin);
    }

    static Stream<Arguments> inputArrayAndExpectedKthMinMaxProvider() {
        
        return Stream.of(
                Arguments.of(
                    new int[] {15, 6, 100, 17, 20}, 3, 17, 17
                ),
                Arguments.of(
                    new int[] {3, 80, 111, 42, 15, 8}, 4, 42, 15
                )
        );
    }

}
