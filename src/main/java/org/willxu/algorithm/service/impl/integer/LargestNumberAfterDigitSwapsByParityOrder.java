package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.LargestNumberAfterDigitSwapsByParity;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class LargestNumberAfterDigitSwapsByParityOrder
        implements LargestNumberAfterDigitSwapsByParity {
    @Override
    public int largestInteger(int num) {
        List<Boolean> isOddNumber = new ArrayList<>();
        TreeMap<Integer, Integer> oddNumbers = new TreeMap<>();
        TreeMap<Integer, Integer> evenNumbers = new TreeMap<>();
        while (num > 0) {
            int digit = num % 10;
            if ((digit & 1) == 1) {
                isOddNumber.add(0, true);
                if (oddNumbers.containsKey(digit)) {
                    oddNumbers.put(digit, oddNumbers.get(digit) + 1);
                } else {
                    oddNumbers.put(digit, 1);
                }
            } else {
                isOddNumber.add(0, false);
                if (evenNumbers.containsKey(digit)) {
                    evenNumbers.put(digit, evenNumbers.get(digit) + 1);
                } else {
                    evenNumbers.put(digit, 1);
                }
            }
            num /= 10;
        }
        int output = 0;
        for (boolean isOdd: isOddNumber) {
            output *= 10;
            int key;
            if (isOdd) {
                key = oddNumbers.lastKey();
                int value = oddNumbers.get(key);
                if (value <= 1) {
                    oddNumbers.remove(key);
                } else {
                    oddNumbers.put(key, value - 1);
                }
            } else {
                key = evenNumbers.lastKey();
                int value = evenNumbers.get(key);
                if (value <= 1) {
                    evenNumbers.remove(key);
                } else {
                    evenNumbers.put(key, value - 1);
                }
            }
            output += key;
        }
        return output;
    }
}
