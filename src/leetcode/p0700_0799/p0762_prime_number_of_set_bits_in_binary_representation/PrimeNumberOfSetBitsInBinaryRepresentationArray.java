/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0762_prime_number_of_set_bits_in_binary_representation;

public class PrimeNumberOfSetBitsInBinaryRepresentationArray
        implements PrimeNumberOfSetBitsInBinaryRepresentation {
    @Override
    public int countPrimeSetBits(int left, int right) {
        int[] oneCountArray = new int[right + 1];
        oneCountArray[0] = 0;
        for (int size = 1; size < oneCountArray.length; size *= 2) {
            int maxSizeIndex = Math.min((size * 2 - 1), right);
            for (int i = maxSizeIndex; i >= size; i--) {
                oneCountArray[i] = oneCountArray[i - size] + 1;
            }
        }
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(oneCountArray[i])) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
