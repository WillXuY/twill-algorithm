package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ZigzagConversion;

public class ZigzagConversionIndex implements ZigzagConversion {
    @Override
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        int len = s.length();
        char[] output = new char[len];
        int outputIndex = 0;
        char[] chars = s.toCharArray();
        int skipLength = numRows * 2  - 2;
        for (int row = 0; row < numRows; row++) {
            int index = row;
            boolean isLeft = true;
            while (index < len && outputIndex < len) {
                output[outputIndex] = chars[index];
                if (row == 0 || row == numRows - 1) {
                    index += skipLength;
                } else if (isLeft) {
                    index += (numRows - row) * 2 - 2;
                } else {
                    index += row * 2;
                }
                outputIndex++;
                isLeft = !isLeft;
            }
        }
        return new String(output);
    }
}
