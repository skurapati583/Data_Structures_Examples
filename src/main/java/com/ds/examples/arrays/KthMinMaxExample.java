package com.ds.examples.arrays;

public class KthMinMaxExample {

    public int getKthMaximumValue(int[] inputArr, int k) {

        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++) {
            max = findMaximum(inputArr);
            replaceMaxElement(inputArr, max);
        }

        return max;
    }

    public int getKthMinimumValue(int[] inputArr, int k) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<k; i++) {
            min = findMinimum(inputArr);
            replaceMinElement(inputArr, min);
        }

        return min;
    }
    

    private void replaceMinElement(int[] inputArr, int min) {
        int size = inputArr.length;

        for (int i = 0; i < size; i++) {
            if(inputArr[i] == min) {
                inputArr[i] = Integer.MAX_VALUE;
                return;
            }
        }
    }

    private void replaceMaxElement(int[] inputArr, int max) {
        int size = inputArr.length;

        for (int i = 0; i < size; i++) {
            if(inputArr[i] == max) {
                inputArr[i] = -1;
                return;
            }
        }
    }


    private int findMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            max = Integer.max(num, max);
        }

        return max;
    }

    private int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            min = Integer.min(num, min);
        }

        return min;
    }

}
