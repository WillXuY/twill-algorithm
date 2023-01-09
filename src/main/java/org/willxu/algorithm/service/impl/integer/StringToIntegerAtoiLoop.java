package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.StringToIntegerAtoi;

public class StringToIntegerAtoiLoop implements StringToIntegerAtoi {
    @Override
    public int myAtoi(String s) {
        boolean isLeadingSpace = true;
        boolean isNegative = false;
        boolean numberStart = false;
        long number = 0;
        for (char c: s.toCharArray()) {
            if (c == '+') {
                if (numberStart) {
                    break;
                } else {
                    numberStart = true;
                }
                isLeadingSpace = false;
            } else if (c == '-') {
                if (numberStart) {
                    break;
                } else {
                    numberStart = true;
                    isNegative = true;
                }
                isLeadingSpace = false;
            } else if ('0' <= c && c <= '9') {
                if (numberStart) {
                    number *= 10;
                    number += c - '0';
                    // check out of range
                    if (isNegative) {
                        if (number + Integer.MIN_VALUE > 0) {
                            number = Integer.MIN_VALUE;
                            break;
                        }
                    } else {
                        if (number > Integer.MAX_VALUE) {
                            number = Integer.MAX_VALUE;
                            break;
                        }
                    }
                } else {
                    number = c - '0';
                    numberStart = true;
                }
                isLeadingSpace = false;
            } else if (c == ' ') {
                if (!isLeadingSpace) {
                    break;
                }
            } else {
                break;
            }
        }
        if (isNegative) {
            number *= -1;
        }
        return (int) number;
    }
}
