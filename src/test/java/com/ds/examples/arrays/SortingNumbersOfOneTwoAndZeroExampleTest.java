package com.ds.examples.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SortingNumbersOfOneTwoAndZeroExampleTest {

    @ParameterizedTest(name = "[{index}] => Input Array is: {0}, Expected Array: {1}")
    @Tag("Arrays")
    @MethodSource("inputArrayForSortingWithZeroesOnesAndTwos")
    void testSortingOfArrayWithZeroesOnesAndTwosSuccessfully(final int[] inputArr, int[] expectedArr) {
        
        int[] actualArr = new SortingNumbersOfOneTwoAndZeroExample().sortArrayWithZeroOnesAndTwoes(inputArr);

        Assertions.assertArrayEquals(expectedArr, actualArr);
      
    }

    static Stream<Arguments> inputArrayForSortingWithZeroesOnesAndTwos() {
        
        return Stream.of(
                Arguments.of(
                    new int[] {0, 1, 1, 2, 0, 0, 2, 1, 0}, 
                    new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2}
                ),
                Arguments.of(
                    new int[] {1, 2, 1, 1, 2, 0}, 
                    new int[] {0, 1, 1, 1, 2, 2}
                ), 
                Arguments.of(
                    new int[] {0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 2, 1, 1, 1, 2, 1, 0}, 
                    new int[] {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}
                )
        );
    }
    
}
