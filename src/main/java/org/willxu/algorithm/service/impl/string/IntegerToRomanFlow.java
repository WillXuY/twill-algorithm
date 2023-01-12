package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.IntegerToRoman;

public class IntegerToRomanFlow implements IntegerToRoman {
    @Override
    public String intToRoman(int num) {
        StringBuilder output = new StringBuilder();
        int thousand = num / 1000;
        output.append("M".repeat(thousand));
        num %= 1000;
        int hundred = num / 100;
        if (hundred == 9) {
            output.append("CM");
        } else if (hundred == 4) {
            output.append("CD");
        } else {
            if (hundred > 4) {
                output.append("D");
                hundred -= 5;
            }
            output.append("C".repeat(hundred));
        }
        num %= 100;
        int ten = num / 10;
        if (ten == 9) {
            output.append("XC");
        } else if (ten == 4) {
            output.append("XL");
        } else {
            if (ten > 4) {
                output.append("L");
                ten -= 5;
            }
            output.append("X".repeat(ten));
        }
        num %= 10;
        if (num == 9) {
            output.append("IX");
        } else if (num == 4) {
            output.append("IV");
        } else {
            if (num > 4) {
                output.append("V");
                num -= 5;
            }
            output.append("I".repeat(num));
        }
        return output.toString();
    }
}
