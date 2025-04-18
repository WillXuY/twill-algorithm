package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.AddStrings;

public class AddStringsSplit implements AddStrings {
    /**
     * max integer length
     */
    private final int splitLength = 8;

    @Override
    public String addStrings(String num1, String num2) {
        // max integer length
        if (num1.length() < num2.length()) {
            String longNumber = num2;
            num2 = num1;
            num1 = longNumber;
        }
        StringBuilder result = new StringBuilder();
        int add = 0;
        while (num1.length() > 0) {
            int n1 = getSplitInt(num1);
            if (num1.length() >= splitLength) {
                num1 = num1.substring(0, num1.length() - splitLength);
            } else {
                num1 = "";
            }
            int n2 = getSplitInt(num2);
            if (num2.length() >= splitLength) {
                num2 = num2.substring(0, num2.length() - splitLength);
            } else {
                num2 = "";
            }
            StringBuilder sum = new StringBuilder(String.valueOf(n1 + n2 + add));
            for (int i = sum.length(); i < splitLength; i++) {
                sum.insert(0, "0");
            }
            if (sum.length() > splitLength) {
                result.insert(0, sum.substring(1, splitLength + 1));
                add = 1;
            } else {
                result.insert(0, sum);
                add = 0;
            }
        }
        if (add == 1) {
            result.insert(0, 1);
        }
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }

    private int getSplitInt(String num) {
        int result = 0;
        if (num.length() >= splitLength) {
            int start = num.length() - splitLength;
            int endExclude = num.length();
            String split = num.substring(start, endExclude);
            result = Integer.parseInt(split);
        } else if (num.length() > 0) {
            result = Integer.parseInt(num);
        }
        return result;
    }
}
