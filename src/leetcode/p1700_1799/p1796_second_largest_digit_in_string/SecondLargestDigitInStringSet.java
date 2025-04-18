package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SecondLargestDigitInString;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestDigitInStringSet
        implements SecondLargestDigitInString {
    @Override
    public int secondHighest(String s) {
        Set<Character> digitsSet = Stream.of(
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        ).collect(Collectors.toSet());
        int max = -1;
        int second = -1;
        for (char c: s.toCharArray()) {
            if (digitsSet.contains(c)) {
                int value = c - 48;
                if (value > max) {
                    second = max;
                    max = value;
                } else if (value != max && value > second) {
                    second = value;
                }
            }
        }
        return second;
    }
}
