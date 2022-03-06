package com.ds.examples.arrays;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseArrayExample {

    private final Logger logger = Logger.getLogger(ReverseArrayExample.class.getName());

    public int[] reverseArray(int[] inputArr) {

        int size = inputArr.length;

        logger.log(Level.INFO, "The input array is: {0} and its size is: {1}",
                new Object[] { Arrays.toString(inputArr), size });

        for (int start = 0, end = size - 1; start < end; start++, end--) {
            int temp = inputArr[end];
            inputArr[end] = inputArr[start];
            inputArr[start] = temp;

            logger.log(Level.INFO, "After swapping {0} and {1} positions, resultant array is: {2}",
                    new Object[] { start, end, Arrays.toString(inputArr) });
        }

        logger.log(Level.INFO, "Reversed array is: {0}", Arrays.toString(inputArr));

        return inputArr;
    }
}
