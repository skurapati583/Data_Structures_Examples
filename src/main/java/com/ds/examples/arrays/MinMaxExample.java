package com.ds.examples.arrays;

import java.util.Arrays;

public class MinMaxExample {

    class Pair {
        private int min;
        private int max;

        public Pair() {
            this.min = Integer.MIN_VALUE;
            this.max = Integer.MAX_VALUE;
        }

        public Pair(int value) {
            this.min = value;
            this.max = value;
        }

        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return this.min;
        }

        public int getMax() {
            return this.max;
        }
    }

    public Pair getMinMax(int[] inputArray) {

        Pair outputMinMaxPair = new Pair();
        int size = inputArray.length;

        switch (size) {
            case 1:
                int tempValue = inputArray[0];
                outputMinMaxPair = new Pair(tempValue);
                break;
            case 2:
                if (inputArray[0] > inputArray[1]) {
                    outputMinMaxPair = new Pair(inputArray[1], inputArray[0]);
                } else {
                    outputMinMaxPair = new Pair(inputArray[0], inputArray[1]);
                }
                break;
            default:
                int mid = size / 2;
                Pair leftPair = new MinMaxExample().getMinMax(Arrays.copyOfRange(inputArray, 0, mid));
                Pair rightPair = new MinMaxExample().getMinMax(Arrays.copyOfRange(inputArray, mid, size));

                if (leftPair.min < rightPair.min) {
                    outputMinMaxPair.min = leftPair.min;
                } else {
                    outputMinMaxPair.min = rightPair.min;
                }

                if (leftPair.max > rightPair.max) {
                    outputMinMaxPair.max = leftPair.max;
                } else {
                    outputMinMaxPair.max = rightPair.max;
                }

                break;
        }

        return outputMinMaxPair;
    }

}
