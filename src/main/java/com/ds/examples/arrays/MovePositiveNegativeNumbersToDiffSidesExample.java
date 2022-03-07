package com.ds.examples.arrays;

import java.util.Arrays;

public class MovePositiveNegativeNumbersToDiffSidesExample {
    
    public int[] addPositiveNumbersToRightAndNegativeNumbersToLeftSide(int[] inputArr) {
        
        int size = inputArr.length;
        int j = 0;

        for (int i=0; i < size; i++) {
            if(inputArr[i] < 0) {
                if(i != j) {
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[i];
                    inputArr[i] = temp;
                }
                j++;
            }
        }
        
        return inputArr;
        
    }
}
