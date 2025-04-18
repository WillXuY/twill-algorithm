package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountGoodTriplets;

public class CountGoodTripletsCombination implements CountGoodTriplets {
    @Override
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int output = 0;
        int[] abc = new int[] {a, b, c};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int[] test = new int[] {arr[i], arr[j], arr[k]};
                    output += getGoodTripletsNumber(test, abc);
                }
            }
        }
        return output;
    }

    public int getGoodTripletsNumber(int[] test, int[] abc) {
        if (Math.abs(test[0] - test[1]) > abc[0]) {
            return 0;
        } else if (Math.abs(test[1] - test[2]) > abc[1]) {
            return 0;
        } else if (Math.abs(test[0] - test[2]) > abc[2]) {
            return 0;
        } else {
            return 1;
        }
    }
}
