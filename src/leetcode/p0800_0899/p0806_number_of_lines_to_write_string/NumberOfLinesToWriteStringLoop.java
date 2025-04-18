/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0806_number_of_lines_to_write_string;

public class NumberOfLinesToWriteStringLoop
        implements NumberOfLinesToWriteString {
    @Override
    public int[] numberOfLines(int[] widths, String s) {
        int maxLineLength = 100;
        int totalNumber = 1;
        int lengthNow = 0;
        for (char c: s.toCharArray()) {
            int thisLength = widths[c - 'a'];
            if (lengthNow + thisLength > maxLineLength) {
                lengthNow = thisLength;
                totalNumber++;
            } else {
                lengthNow += thisLength;
            }
        }
        return new int[] {totalNumber, lengthNow};
    }
}
