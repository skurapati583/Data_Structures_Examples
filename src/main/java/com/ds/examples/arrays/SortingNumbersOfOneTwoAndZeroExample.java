package com.ds.examples.arrays;

public class SortingNumbersOfOneTwoAndZeroExample {

    public int[] sortArrayWithZeroOnesAndTwoes(int[] inputArr) {
        int size = inputArr.length;
        int[] sortedArr = new int[size];
        int[] freqArr = new int[3];

        for (int i = 0; i < size; i++) {
            freqArr[inputArr[i]]++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < freqArr.length; j++) {
                if (freqArr[j] != 0) {
                    sortedArr[i] = j;
                    freqArr[j]--;
                    break;
                }
            }
        }

        return sortedArr;
    }
}
