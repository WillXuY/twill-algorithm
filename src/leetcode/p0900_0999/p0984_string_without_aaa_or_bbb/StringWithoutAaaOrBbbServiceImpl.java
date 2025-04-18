/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0900_0999.p0984_string_without_aaa_or_bbb;

public class StringWithoutAaaOrBbbServiceImpl implements StringWithoutAaaOrBbbService {
    @Override
    public String getStringWithoutAaaOrBbb(int A, int B){
        boolean isAMoreThanB = A > B;
        if (isAMoreThanB) {
            A = A ^ B;
            B = A ^ B;
            A = A ^ B;
        }
        if (A == 0) {
            String result = isAMoreThanB ? "a":"b";
            if (B == 0) {
                return "";
            } else if (B == 1) {
                return result;
            } else if (B == 2) {
                return result + result;
            }
        }
        StringBuilder middleString = new StringBuilder();
        // the middle string: abab...ab
        middleString.append("ab".repeat(Math.max(0, A)));
        // insert b to ababab...ab
        for (int i = 0;(i < A && i < (B - A)); i++) {
            middleString.insert(3 * i, "b");
        }
        if ((B - 2 * A) > 0) {
            middleString.insert(0, "b");
            if ((B - 2 * A) > 1) {
                middleString.append("b");
            }
        }
        String result = middleString.toString();
        if (isAMoreThanB) {
            result = result.replaceAll("b", "c");
            result = result.replaceAll("a", "b");
            result = result.replaceAll("c", "a");
        }
        return result;
    }
}
