package com.ds.examples.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseArrayExampleTest {

    @ParameterizedTest(name = "[{index}] => Input Array is: {0}, Expected Reverse Array is : {1}")
    @Tag("Arrays")
    @MethodSource("inputAndExpectedArraysProviderSuccessful")
    void testReverseOfArraySuccessful(int[] inputArr, int[] expectedArray) {
        
        int[] actualArray = new ReverseArrayExample().reverseArray(inputArr);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @ParameterizedTest(name = "[{index}] => Input Array is: {0}, Expected Incorrect Reverse Array is : {1}")
    @Tag("Arrays")
    @MethodSource("inputAndExpectedArraysProviderFailure")
    void testReverseOfArrayFailure(int[] inputArr, int[] expectedArray) {
        
        int[] actualArray = new ReverseArrayExample().reverseArray(inputArr);

        Assertions.assertNotEquals(expectedArray, actualArray);
    }

    static Stream<Arguments> inputAndExpectedArraysProviderSuccessful() {
        
        return Stream.of(
                Arguments.of(
                    new int[] {5, 6, 10, 17, 20}, 
                    new int[] {20, 17, 10, 6, 5}
                ),
                Arguments.of(
                    new int[] {3, 11, 12, 15, 18}, 
                    new int[] {18, 15, 12, 11, 3}
                ),
                Arguments.of(
                    new int[] {33, 45, 46, 63, 67, 91, 117, 122, 127, 152, 170}, 
                    new int[] {170, 152, 127, 122, 117, 91, 67, 63, 46, 45, 33}
                )
        );
    }

    static Stream<Arguments> inputAndExpectedArraysProviderFailure() {
        
        return Stream.of(
                Arguments.of(
                    new int[] {5, 6, 10, 17, 20}, 
                    new int[] {20, 6, 10, 17, 5}
                ),
                Arguments.of(
                    new int[] {3, 11, 12, 15, 18}, 
                    new int[] {18, 11, 12, 15, 3}
                ),
                Arguments.of(
                    new int[] {33, 45, 46, 63, 67, 91, 117, 122, 127, 152, 170}, 
                    new int[] {170, 152, 46, 122, 117, 91, 63, 67, 127, 45, 33}
                )
        );
    }

}
